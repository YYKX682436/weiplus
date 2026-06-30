package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef f234856d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef) {
        this.f234856d = activityC16818xbff037ef;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef = this.f234856d;
        java.lang.String[] stringArray = activityC16818xbff037ef.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559545z);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : stringArray) {
            arrayList.add(str);
        }
        if ((activityC16818xbff037ef.f234794v.d().f234877a & 1) > 0) {
            arrayList.add(activityC16818xbff037ef.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574007gs1));
        }
        db5.e1.h(activityC16818xbff037ef.mo55332x76847179(), null, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n1(this));
        return true;
    }
}
