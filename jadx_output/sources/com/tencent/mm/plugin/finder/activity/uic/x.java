package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101970d;

    public x(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC) {
        this.f101970d = finderActivityParticipateUIC;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = this.f101970d;
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        } else if (itemId == 1031) {
            finderActivityParticipateUIC.Y6();
            return;
        }
        finderActivityParticipateUIC.a7(intent);
    }
}
