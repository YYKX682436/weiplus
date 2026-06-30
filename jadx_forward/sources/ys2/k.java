package ys2;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.o f546701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ys2.o oVar) {
        super(1);
        this.f546701d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ys2.o oVar = this.f546701d;
        kk4.c cVar = oVar.f546712s;
        if (cVar != null) {
            kk4.f0 f0Var = (kk4.f0) cVar;
            f0Var.mo100945x683d6267(it);
            f0Var.mo100932x857611b5();
            f0Var.mo100957x5dd7c812(new ys2.i(oVar));
        }
        return jz5.f0.f384359a;
    }
}
