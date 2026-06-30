package md3;

/* loaded from: classes.dex */
public final class n implements vz.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.o f407391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f407392b;

    public n(md3.o oVar, lc3.a0 a0Var) {
        this.f407391a = oVar;
        this.f407392b = a0Var;
    }

    @Override // vz.o1
    public final void d(int i17, java.lang.String str) {
        lc3.a0 a0Var = this.f407392b;
        md3.o oVar = this.f407391a;
        if (i17 == 0) {
            oVar.s().mo146xb9724478(oVar.k());
            oVar.u(a0Var, mq0.a.f412055q, "");
        } else {
            oVar.s().mo146xb9724478(oVar.h(i17, str != null ? str : ""));
            mq0.a aVar = mq0.a.f412056r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            oVar.u(a0Var, aVar, str);
        }
    }
}
