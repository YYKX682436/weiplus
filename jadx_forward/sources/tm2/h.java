package tm2;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f502048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502049e;

    public h(android.view.View view, tm2.s2 s2Var) {
        this.f502048d = view;
        this.f502049e = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        this.f502048d.getLocationOnScreen(iArr);
        tm2.s2 s2Var = this.f502049e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sw swVar = s2Var.F;
        if (swVar != null) {
            swVar.t1(iArr[1]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sw swVar2 = s2Var.G;
        if (swVar2 != null) {
            swVar2.t1(iArr[1]);
        }
    }
}
