package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class q2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74127d;

    public q2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f74127d = inviteMMFBFriendsUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI = this.f74127d;
        if (inviteMMFBFriendsUI.f73289e.t().length >= 50) {
            db5.e1.i(inviteMMFBFriendsUI, com.tencent.mm.R.string.c8m, com.tencent.mm.R.string.f490573yv);
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.plugin.account.ui.b3 b3Var = inviteMMFBFriendsUI.f73289e;
        int headerViewsCount = i17 - inviteMMFBFriendsUI.f73288d.getHeaderViewsCount();
        if (headerViewsCount >= 0) {
            boolean[] zArr = b3Var.f73739p;
            if (headerViewsCount < zArr.length) {
                zArr[headerViewsCount] = !zArr[headerViewsCount];
                b3Var.notifyDataSetChanged();
            }
        } else {
            b3Var.getClass();
        }
        if (inviteMMFBFriendsUI.f73289e.t().length > 0) {
            inviteMMFBFriendsUI.showOptionMenu(true);
        } else {
            inviteMMFBFriendsUI.showOptionMenu(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
