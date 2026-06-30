package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public class z6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 f292477d;

    public z6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 activityC22507xb3b58831) {
        this.f292477d = activityC22507xb3b58831;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 activityC22507xb3b58831 = this.f292477d;
        activityC22507xb3b58831.U6(activityC22507xb3b58831.f291610d.getText());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result", activityC22507xb3b58831.f291610d.getText());
        activityC22507xb3b58831.setResult(-1, intent);
        activityC22507xb3b58831.finish();
        return true;
    }
}
