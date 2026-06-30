package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee f224478d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee) {
        this.f224478d = activityC16133x8935f7ee;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee = this.f224478d;
        activityC16133x8935f7ee.mo48674x36654fab();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", activityC16133x8935f7ee.f224115h);
        intent.putExtra("couttry_code", activityC16133x8935f7ee.f224116i);
        activityC16133x8935f7ee.setResult(100, intent);
        activityC16133x8935f7ee.finish();
        return true;
    }
}
