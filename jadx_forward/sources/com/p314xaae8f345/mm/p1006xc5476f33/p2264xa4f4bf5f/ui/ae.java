package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class ae implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255267d;

    public ae(android.content.Context context) {
        this.f255267d = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        qj4.s sVar = qj4.s.f445491a;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            qj4.s.n(sVar, 43L, null, 0, null, null, null, 0, 0L, 0L, null, null, null, null, null, 16382, null);
            bj4.a.f102696a.a(this.f255267d, 8, false);
            return;
        }
        qj4.s.n(sVar, 42L, null, 0, null, null, null, 0, 0L, 0L, null, null, null, null, null, 16382, null);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f255267d;
        intent.putExtra(dm.i4.f66875xa013b0d5, en1.a.a());
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18648x5d738624.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$Companion$showMoreOptionBottomSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$Companion$showMoreOptionBottomSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
