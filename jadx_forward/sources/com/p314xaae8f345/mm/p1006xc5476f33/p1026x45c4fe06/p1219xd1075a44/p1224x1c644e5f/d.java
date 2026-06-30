package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class d implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f f172694d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f fVar) {
        this.f172694d = fVar;
    }

    @Override // vj5.k
    public void n6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var3;
        android.view.WindowInsets b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f fVar = this.f172694d;
        o6Var = fVar.f172700rt;
        android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onStatusBarHeightChange] newHeight=");
        sb6.append(i17);
        sb6.append("  rt.isResumed()=");
        o6Var2 = fVar.f172700rt;
        sb6.append(o6Var2.V);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandHalfWindowLayoutManager", sb6.toString());
        o6Var3 = fVar.f172700rt;
        if (!o6Var3.V || (b17 = com.p314xaae8f345.mm.ui.qk.b(r07)) == null) {
            return;
        }
        fVar.m53402xd9f3c575(b17);
    }
}
