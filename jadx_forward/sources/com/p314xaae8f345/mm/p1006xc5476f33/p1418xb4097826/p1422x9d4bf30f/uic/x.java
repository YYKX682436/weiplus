package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 f183503d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466) {
        this.f183503d = c13667xc5da9466;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466 = this.f183503d;
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        } else if (itemId == 1031) {
            c13667xc5da9466.Y6();
            return;
        }
        c13667xc5da9466.a7(intent);
    }
}
