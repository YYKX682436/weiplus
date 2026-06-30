package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f168341e;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f168340d = n7Var;
        this.f168341e = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f168340d.V3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = this.f168340d.mo32091x9a3f0ba2().E0();
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = E0.f387375e;
        z5Var.f387405j = 3;
        z5Var.f387406k = this.f168340d.a2() == null ? "" : this.f168340d.X1();
        z5Var.f387403h = E0.f387385r.f156932d;
        z5Var.f387402g = E0.f387385r.f33456x1c82a56c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12663x79416297.V6(this.f168340d.getF229340d(), this.f168341e.u0().f128811x, 12, "", false, z5Var.a(), null, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.a(this.f168340d.getF229340d()));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
