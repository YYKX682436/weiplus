package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class la implements xi1.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f165771a;

    /* renamed from: b, reason: collision with root package name */
    public final xi1.o[] f165772b;

    public la(android.view.View mView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mView, "mView");
        this.f165771a = mView;
        this.f165772b = new xi1.o[]{xi1.o.LANDSCAPE_SENSOR, xi1.o.LANDSCAPE_LOCKED, xi1.o.LANDSCAPE_LEFT, xi1.o.LANDSCAPE_RIGHT};
    }

    @Override // xi1.p
    public xi1.o a() {
        android.view.View view = this.f165771a;
        return view.getHeight() >= view.getWidth() ? xi1.o.PORTRAIT : xi1.o.LANDSCAPE_LOCKED;
    }

    @Override // xi1.p
    public void b(xi1.o oVar, xi1.n nVar) {
        if (oVar == null) {
            if (nVar != null) {
                nVar.e(null, false);
            }
        } else if (oVar == xi1.o.PORTRAIT) {
            if (nVar != null) {
                nVar.e(a(), a() == oVar);
            }
        } else {
            xi1.o[] oVarArr = this.f165772b;
            if (!kz5.z.G(oVarArr, oVar) || nVar == null) {
                return;
            }
            nVar.e(a(), kz5.z.G(oVarArr, a()));
        }
    }
}
