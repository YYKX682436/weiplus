package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class li implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f242829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c f242830e;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c activityC17441xe7fa79c, int i17) {
        this.f242830e = activityC17441xe7fa79c;
        this.f242829d = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c activityC17441xe7fa79c = this.f242830e;
        java.lang.String obj = activityC17441xe7fa79c.f242079d.getText().toString();
        java.lang.String f17 = ip.c.f();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            if (obj.matches(".*[" + f17 + "].*")) {
                db5.e1.s(activityC17441xe7fa79c.mo55332x76847179(), activityC17441xe7fa79c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1m, f17), activityC17441xe7fa79c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                return false;
            }
        }
        ck5.f b17 = ck5.f.b(activityC17441xe7fa79c.f242079d);
        b17.f124094f = this.f242829d;
        b17.f124093e = 32;
        b17.d(activityC17441xe7fa79c);
        return true;
    }
}
