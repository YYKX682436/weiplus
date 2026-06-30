package yn1;

/* loaded from: classes9.dex */
public final class d1 implements vn1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545170a;

    public d1(yn1.r2 r2Var) {
        this.f545170a = r2Var;
    }

    @Override // vn1.n
    public void a() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545170a.f545343a;
        if (gVar != null) {
            gVar.p();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.n
    public void b() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545170a.f545343a;
        if (gVar != null) {
            gVar.t();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }
}
