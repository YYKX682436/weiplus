package xe3;

/* loaded from: classes15.dex */
public final class f extends ve3.q {

    /* renamed from: a, reason: collision with root package name */
    public final int f535474a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f535475b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f535476c;

    /* renamed from: d, reason: collision with root package name */
    public final rh3.r f535477d;

    /* renamed from: e, reason: collision with root package name */
    public final af3.b f535478e;

    /* renamed from: f, reason: collision with root package name */
    public final rh3.q f535479f;

    public f(int i17, java.lang.String src, boolean z17, boolean z18, java.lang.String mediaId, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        src = (i18 & 2) != 0 ? "" : src;
        mediaId = (i18 & 16) != 0 ? "" : mediaId;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f535474a = i17;
        this.f535475b = src;
        this.f535476c = mediaId;
        af3.b bVar = new af3.b(this);
        this.f535478e = bVar;
        this.f535479f = new rh3.q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "create external video player item");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMPlayerFactory", "buildMPPlayer");
        rh3.r rVar = new rh3.r(new sh3.a(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(context), null));
        rVar.q(bVar);
        rVar.i(bVar);
        rVar.h(bVar);
        rVar.f(bVar);
        rVar.p(bVar);
        rVar.o(bVar);
        rVar.l(bVar);
        rVar.e(bVar);
        this.f535477d = rVar;
    }

    @Override // ve3.q
    public int a() {
        return this.f535474a;
    }

    public void d(boolean z17, ve3.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "setLoop " + this);
        this.f535477d.b(z17);
    }

    public void e(ve3.o callback) {
        mq0.d0 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "startPlay " + this);
        rh3.r rVar = this.f535477d;
        if (rVar.mo162437xc00617a4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_video_item", "startPlay already playing " + this);
            ((xd3.c) callback).b(-1, "already playing");
            return;
        }
        af3.b bVar = this.f535478e;
        if (bVar.f86076h && (b17 = bVar.b()) != null) {
            mq0.d0.Ub(b17, "useVideoCache", bVar.f86077i, null, 4, null);
        }
        rVar.mo162431x68ac462();
    }

    /* renamed from: toString */
    public java.lang.String m175426x9616526c() {
        return "MBExternalVideoPlayerItem(playId=" + this.f535474a + ", mediaId='" + this.f535476c + "')";
    }
}
