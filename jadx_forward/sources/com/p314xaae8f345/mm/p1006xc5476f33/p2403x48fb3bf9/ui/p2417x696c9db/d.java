package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 f265619d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9) {
        this.f265619d = activityC19307x65cbeee9;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = this.f265619d;
        java.lang.String obj = activityC19307x65cbeee9.f265118e.getText().toString();
        java.lang.String f17 = ip.c.f();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            if (obj.matches(".*[" + f17 + "].*")) {
                db5.e1.s(activityC19307x65cbeee9.mo55332x76847179(), activityC19307x65cbeee9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1m, f17), activityC19307x65cbeee9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                return true;
            }
        }
        ck5.f b17 = ck5.f.b(activityC19307x65cbeee9.f265118e);
        b17.f124094f = 1;
        b17.f124093e = 32;
        b17.d(activityC19307x65cbeee9);
        return true;
    }
}
