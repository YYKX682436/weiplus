package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes3.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f240259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f240260e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636, int i17, android.view.View.OnClickListener onClickListener) {
        this.f240259d = i17;
        this.f240260e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("%d,%d", java.lang.Integer.valueOf(this.f240259d), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeSheetItemLogic", "18684 report:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(18684, z17);
        this.f240260e.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
