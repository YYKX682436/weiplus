package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.s f221466e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.s sVar, java.lang.String str) {
        this.f221466e = sVar;
        this.f221465d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/page/GameWebActionBar$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.s sVar = this.f221466e;
        java.lang.String i17 = ((yq1.z) a0Var).i(sVar.f221469d.Q);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("userName", sVar.f221469d.Q);
        bundle.putString("exportId", i17);
        bundle.putString("byPass", sVar.f221469d.U);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.t.class, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23044, 2, sVar.f221469d.Q, 0, 0, i17, java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(sVar.f221469d.Q)), 2, this.f221465d, java.lang.Integer.valueOf(sVar.f221469d.S));
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/page/GameWebActionBar$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
