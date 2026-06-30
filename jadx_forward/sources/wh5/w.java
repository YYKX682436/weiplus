package wh5;

/* loaded from: classes12.dex */
public final class w implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final wh5.v f527632a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f527633b;

    /* renamed from: c, reason: collision with root package name */
    public final l70.d f527634c;

    /* renamed from: d, reason: collision with root package name */
    public final l70.d f527635d;

    /* renamed from: e, reason: collision with root package name */
    public final float f527636e;

    /* renamed from: f, reason: collision with root package name */
    public final float f527637f;

    /* renamed from: g, reason: collision with root package name */
    public float f527638g;

    /* renamed from: h, reason: collision with root package name */
    public float f527639h;

    public w(wh5.v mediaInfo, yz5.l progressCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressCallback, "progressCallback");
        this.f527632a = mediaInfo;
        this.f527633b = progressCallback;
        this.f527634c = mediaInfo.d();
        this.f527635d = mediaInfo.h();
        this.f527636e = 0.5f;
        this.f527637f = 0.5f;
        j15.d dVar = new j15.d();
        java.lang.String j17 = mediaInfo.f527629a.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        dVar.m126728xdc93280d(j17);
        long r17 = dVar.o().r();
        j15.c t17 = dVar.o().t();
        long o17 = t17 != null ? t17.o() : 1L;
        float f17 = (float) r17;
        float f18 = (float) (r17 + o17);
        this.f527636e = f17 / f18;
        this.f527637f = ((float) o17) / f18;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        dn.g gVar3;
        dn.g gVar4;
        java.lang.String str = n1Var != null ? n1Var.f152637b : null;
        l70.d dVar = this.f527634c;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar != null ? dVar.f398337e : null);
        float f17 = -1.0f;
        float f18 = 0.0f;
        wh5.v vVar = this.f527632a;
        if (b17) {
            float f19 = (n1Var == null || (gVar4 = n1Var.f152640e) == null) ? 0.0f : (float) gVar4.f69496x83ec3dd;
            float f27 = (n1Var == null || (gVar3 = n1Var.f152640e) == null) ? -1.0f : (float) gVar3.f69500x8ab84c59;
            vVar.mo2110x5db1b11();
            this.f527638g = f19 / f27;
        }
        java.lang.String str2 = n1Var != null ? n1Var.f152637b : null;
        l70.d dVar2 = this.f527635d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, dVar2 != null ? dVar2.f398337e : null)) {
            if (n1Var != null && (gVar2 = n1Var.f152640e) != null) {
                f18 = (float) gVar2.f69496x83ec3dd;
            }
            if (n1Var != null && (gVar = n1Var.f152640e) != null) {
                f17 = (float) gVar.f69500x8ab84c59;
            }
            vVar.mo2110x5db1b11();
            this.f527639h = f18 / f17;
        }
        float f28 = this.f527638g;
        float f29 = this.f527636e;
        float f37 = this.f527639h;
        float f38 = this.f527637f;
        float f39 = (f28 * f29) + (f37 * f38);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatLiveStateManager", "mediaId: " + vVar.mo2110x5db1b11() + " onFinalProgress: " + f39 + " = " + this.f527638g + " * " + f29 + " + " + this.f527639h + " * " + f38);
        this.f527633b.mo146xb9724478(java.lang.Float.valueOf(f39));
    }
}
