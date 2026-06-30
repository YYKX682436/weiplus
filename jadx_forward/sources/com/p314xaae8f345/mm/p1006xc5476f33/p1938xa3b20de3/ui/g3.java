package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234160d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        this.f234160d = activityC16764xd1ab6b38;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5777xd8d54b5c c5777xd8d54b5c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5777xd8d54b5c();
        c5777xd8d54b5c.f136090g.f87894a = "ok";
        c5777xd8d54b5c.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234160d;
        if (activityC16764xd1ab6b38.A1 == 8) {
            yo3.m.h(activityC16764xd1ab6b38.getIntent().getStringExtra("key_appid"));
        }
        activityC16764xd1ab6b38.finish();
        return false;
    }
}
