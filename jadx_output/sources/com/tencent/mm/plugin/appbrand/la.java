package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class la implements xi1.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f84238a;

    /* renamed from: b, reason: collision with root package name */
    public final xi1.o[] f84239b;

    public la(android.view.View mView) {
        kotlin.jvm.internal.o.g(mView, "mView");
        this.f84238a = mView;
        this.f84239b = new xi1.o[]{xi1.o.LANDSCAPE_SENSOR, xi1.o.LANDSCAPE_LOCKED, xi1.o.LANDSCAPE_LEFT, xi1.o.LANDSCAPE_RIGHT};
    }

    @Override // xi1.p
    public xi1.o a() {
        android.view.View view = this.f84238a;
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
            xi1.o[] oVarArr = this.f84239b;
            if (!kz5.z.G(oVarArr, oVar) || nVar == null) {
                return;
            }
            nVar.e(a(), kz5.z.G(oVarArr, a()));
        }
    }
}
