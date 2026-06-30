package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 f292367d;

    public v1(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57) {
        this.f292367d = activityC22498xb11fdc57;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57 = this.f292367d;
        activityC22498xb11fdc57.mo48674x36654fab();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", activityC22498xb11fdc57.f291522h);
        intent.putExtra("couttry_code", activityC22498xb11fdc57.f291523i);
        intent.putExtra("iso_code", activityC22498xb11fdc57.f291524m);
        activityC22498xb11fdc57.setResult(100, intent);
        activityC22498xb11fdc57.finish();
        return true;
    }
}
