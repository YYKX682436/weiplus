package uf3;

/* loaded from: classes12.dex */
public final class f implements cg3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf3.g f508716a;

    public f(uf3.g gVar) {
        this.f508716a = gVar;
    }

    @Override // cg3.c
    public android.graphics.Matrix a() {
        em.o1 o1Var = this.f508716a.f508717o;
        if (o1Var != null) {
            return o1Var.d().getMainMatrix();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
        throw null;
    }

    @Override // cg3.c
    /* renamed from: getView */
    public android.view.View mo14794xfb86a31b() {
        uf3.g gVar = this.f508716a;
        em.o1 o1Var = gVar.f508717o;
        if (o1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.view.View m66589x6815f2c1 = o1Var.i().m66589x6815f2c1();
        if (m66589x6815f2c1 != null) {
            return m66589x6815f2c1;
        }
        em.o1 o1Var2 = gVar.f508717o;
        if (o1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a g17 = o1Var2.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getNormalImage(...)");
        return g17;
    }
}
