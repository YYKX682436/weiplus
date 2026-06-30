package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679 f261817d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679 activityC19110xc60f679) {
        this.f261817d = activityC19110xc60f679;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17;
        int i18;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679 activityC19110xc60f679 = this.f261817d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = (!activityC19110xc60f679.f261497f.isChecked() || (i18 = activityC19110xc60f679.f261502n) < 0) ? (!activityC19110xc60f679.f261498g.isChecked() || (i17 = activityC19110xc60f679.f261503o) < 0) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) ((java.util.LinkedList) activityC19110xc60f679.f261496e).get(i17) : (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) ((java.util.LinkedList) activityC19110xc60f679.f261495d).get(i18);
        if (c19097xe6dc5b4c != null) {
            intent.putExtra("elemt_query", c19097xe6dc5b4c);
            activityC19110xc60f679.setResult(-1, intent);
        } else {
            activityC19110xc60f679.setResult(0);
        }
        activityC19110xc60f679.finish();
        return true;
    }
}
