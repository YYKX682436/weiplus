package im1;

/* loaded from: classes15.dex */
public final class y implements yf.x {

    /* renamed from: b, reason: collision with root package name */
    public final yf.t f373770b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.l f373771c;

    /* renamed from: d, reason: collision with root package name */
    public final yf.h f373772d;

    public y(yf.t weEffectManager, yf.l stickerApplyAdapter, yf.h makeupApplyAdapter, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        stickerApplyAdapter = (i17 & 2) != 0 ? new im1.k(weEffectManager) : stickerApplyAdapter;
        makeupApplyAdapter = (i17 & 4) != 0 ? new im1.i(weEffectManager) : makeupApplyAdapter;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weEffectManager, "weEffectManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerApplyAdapter, "stickerApplyAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(makeupApplyAdapter, "makeupApplyAdapter");
        this.f373770b = weEffectManager;
        this.f373771c = stickerApplyAdapter;
        this.f373772d = makeupApplyAdapter;
    }

    @Override // yf.t
    public void a(yf.s sVar, java.lang.String str) {
        this.f373770b.a(sVar, str);
    }

    @Override // yf.t
    public void b(yf.r rVar, java.lang.String str) {
        this.f373770b.b(rVar, str);
    }

    @Override // yf.j
    public boolean c(yf.c info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return ((im1.i) this.f373772d).c(info);
    }

    @Override // yf.t
    public void d() {
        this.f373770b.d();
    }

    @Override // yf.t
    public void e(yf.q qVar, float f17) {
        this.f373770b.e(qVar, f17);
    }

    @Override // yf.j
    public boolean f(yf.f info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return ((im1.i) this.f373772d).f(info);
    }

    @Override // yf.j
    public boolean g(yf.g info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return ((im1.i) this.f373772d).g(info);
    }

    @Override // yf.j
    public boolean h(yf.c0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return ((im1.i) this.f373772d).h(info);
    }

    @Override // yf.j
    public boolean i(yf.d info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return ((im1.i) this.f373772d).i(info);
    }

    @Override // yf.t
    /* renamed from: isEnabled */
    public boolean mo136758x7d80d2b7() {
        return this.f373770b.mo136758x7d80d2b7();
    }

    @Override // yf.n
    public boolean j(yf.s type, java.util.List stickerInfo, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerInfo, "stickerInfo");
        return ((im1.k) this.f373771c).j(type, stickerInfo, jSONObject);
    }

    @Override // yf.t
    public void k(java.lang.String str, float f17) {
        this.f373770b.k(str, f17);
    }

    @Override // yf.t
    public void l() {
        this.f373770b.l();
    }

    @Override // yf.t
    public void m() {
        this.f373770b.m();
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onDetectFacePoints */
    public void mo29881xb9d12ca2(float[] fArr) {
        this.f373770b.mo29881xb9d12ca2(fArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onTextureCustomProcess */
    public int mo29893x2613f4e2(int i17, int i18, int i19) {
        return this.f373770b.mo29893x2613f4e2(i17, i18, i19);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onTextureDestoryed */
    public void mo29894x6fb839d7() {
        this.f373770b.mo29894x6fb839d7();
    }
}
