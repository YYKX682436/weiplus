package aj4;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f86865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kb f86866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f86867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj4.m f86868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f86869h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.app.Activity activity, bw5.kb kbVar, long j17, boolean z17, aj4.m mVar, zi4.r1 r1Var) {
        super(0);
        this.f86865d = activity;
        this.f86866e = kbVar;
        this.f86867f = j17;
        this.C = z17;
        this.f86868g = mVar;
        this.f86869h = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        android.app.Activity activity = this.f86865d;
        bw5.kb mediaType = this.f86866e;
        long j17 = this.f86867f;
        boolean z17 = this.C;
        aj4.m mVar = this.f86868g;
        p3325xe03a0797.p3326xc267989b.y0 scope = mVar.f86871i;
        aj4.k kVar = new aj4.k(mVar, this.f86869h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        aj4.w wVar = aj4.w.f86911a;
        int incrementAndGet = (aj4.w.f86912b.incrementAndGet() & 4095) | 520960;
        aj4.t tVar = new aj4.t(activity, scope, kVar);
        synchronized (wVar) {
            aj4.w.f86913c.put(java.lang.Integer.valueOf(incrementAndGet), tVar);
        }
        android.content.Intent intent = new android.content.Intent();
        if (j17 > 0) {
            i17 = (int) j17;
        } else {
            ((qc0.k1) i95.n0.c(qc0.k1.class)).getClass();
            i17 = ((tt3.a) tt3.b.f503570b.a()).f503569i;
        }
        intent.putExtra("key_edit_video_max_time_length", i17);
        intent.putExtra("key_edit_text_color", "#0E9CE6");
        intent.putExtra("album_is_from_text_status", true);
        intent.putExtra("edt_video_layout_from_text_status", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout");
        intent.putExtra("is_hide_album_footer", true);
        if (z17) {
            intent.putExtra("Gallery_LivePhoto_Need_Query", true);
            intent.putExtra("Gallery_LivePhoto_Auto_Enable", true);
        }
        int ordinal = mediaType.ordinal();
        if (ordinal != 0) {
            i18 = ordinal != 1 ? 3 : 2;
        } else {
            i18 = 1;
        }
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(activity, incrementAndGet, 1, 22, i18, false, intent);
        return jz5.f0.f384359a;
    }
}
