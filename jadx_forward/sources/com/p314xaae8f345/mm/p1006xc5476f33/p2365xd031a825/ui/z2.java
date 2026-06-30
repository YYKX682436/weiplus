package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 f262353d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2) {
        this.f262353d = activityC19109xac2e2ee2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2 = this.f262353d;
        linkedList.add(activityC19109xac2e2ee2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575032kh2));
        linkedList2.add(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = activityC19109xac2e2ee2.f261493z;
        if (c19097xe6dc5b4c != null && c19097xe6dc5b4c.M) {
            linkedList.add(activityC19109xac2e2ee2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575031kh1));
            linkedList2.add(1);
        }
        db5.e1.b(this.f262353d, "", linkedList, linkedList2, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y2(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
