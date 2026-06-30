package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public class z2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 f155887d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 activityC11405x94a32f64) {
        this.f155887d = activityC11405x94a32f64;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 activityC11405x94a32f64 = this.f155887d;
        bundle.putString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, activityC11405x94a32f64.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8j));
        long[] t17 = activityC11405x94a32f64.f154822e.t();
        java.lang.String l17 = java.lang.Long.toString(t17[0]);
        for (int i17 = 1; i17 < t17.length; i17++) {
            l17 = (l17 + ",") + java.lang.Long.toString(t17[i17]);
        }
        bundle.putString("to", l17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y2(this, t17);
        java.lang.String str = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290742m + "apprequests";
        bundle.putString("display", "touch");
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, "290293790992170");
        if (lVar.d()) {
            bundle.putString("access_token", lVar.f290746a);
        }
        java.lang.String str2 = str + "?" + com.p314xaae8f345.mm.ui.p2722x33325c.sdk.o.b(bundle);
        if (activityC11405x94a32f64.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityC11405x94a32f64);
            builder.setTitle("Error");
            builder.setMessage("Application requires permission to access the Internet");
            builder.create().show();
        } else {
            new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s(activityC11405x94a32f64, str2, y2Var).show();
        }
        return true;
    }
}
