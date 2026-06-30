package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class l6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m6 f228661d;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m6 m6Var) {
        this.f228661d = m6Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m6 m6Var = this.f228661d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69 = m6Var.f228699d;
            if (activityC16370x5a91dd69.f227687g != 2) {
                activityC16370x5a91dd69.f227687g = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.V6(activityC16370x5a91dd69);
                m6Var.f228699d.X6();
                m6Var.f228699d.W6();
                return;
            }
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd692 = m6Var.f228699d;
        if (activityC16370x5a91dd692.f227687g != 1) {
            activityC16370x5a91dd692.f227687g = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.V6(activityC16370x5a91dd692);
            m6Var.f228699d.X6();
            m6Var.f228699d.W6();
        }
    }
}
