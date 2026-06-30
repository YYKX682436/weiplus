package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class k9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 f145811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145812e;

    public k9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8, java.lang.String str) {
        this.f145811d = activityC10358xb91848f8;
        this.f145812e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.b9 b9Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8.f145388u;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8 = this.f145811d;
            activityC10358xb91848f8.f145397o = db5.e1.Q(activityC10358xb91848f8.mo55332x76847179(), activityC10358xb91848f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10358xb91848f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, false, null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = activityC10358xb91848f8.f145395m.iterator();
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
            }
            linkedList.remove(this.f145812e);
            pq5.g l17 = new kn.c(activityC10358xb91848f8.f145390e, linkedList).l();
            l17.f(activityC10358xb91848f8);
            l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.l9(activityC10358xb91848f8, linkedList));
        }
    }
}
