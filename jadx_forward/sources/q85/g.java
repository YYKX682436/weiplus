package q85;

/* loaded from: classes3.dex */
public final class g implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4, n0.e4 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.List f442334o = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f442336e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.jj4 f442337f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442338g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f442339h;

    /* renamed from: i, reason: collision with root package name */
    public pk4.d f442340i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f442341m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f442342n;

    public g(android.content.Context context, java.lang.String snsId, int i17, r45.jj4 media, int i18, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f442335d = snsId;
        this.f442336e = i17;
        this.f442337f = media;
        this.f442338g = i18;
        this.f442339h = scope;
        f442334o.size();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // n0.e4
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiscroMsg.PlayerState", "onRemembered snsId:" + this.f442335d);
        r45.jj4 media = this.f442337f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        this.f442342n = null;
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    @Override // n0.e4
    public void d() {
        v65.i.b(this.f442339h, null, new q85.f(this, null), 1, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        pk4.d dVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiscroMsg.PlayerState", "onPrepared snsId:" + this.f442335d + " isPlay:" + this.f442341m);
        if (!this.f442341m || (dVar = this.f442340i) == null) {
            return;
        }
        dVar.m158665x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
