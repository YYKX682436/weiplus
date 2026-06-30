package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b64 f233729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 f233730e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 q0Var, r45.b64 b64Var) {
        this.f233730e = q0Var;
        this.f233729d = b64Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$NearbyFriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 q0Var = this.f233730e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0) ((java.util.HashMap) q0Var.f233735g.f233627n).get(this.f233729d.f452083d);
        if (l0Var != null) {
            l0Var.f233705j++;
            l0Var.f233708m = true;
            l0Var.f233707l |= 2;
        }
        q0Var.f233735g.V6();
        q0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$NearbyFriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
