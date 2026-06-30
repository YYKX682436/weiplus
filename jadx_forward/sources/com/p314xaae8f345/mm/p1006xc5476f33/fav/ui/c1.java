package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class c1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f182068d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f182068d = activityC13563x72179722;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = this.f182068d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13563x72179722.f181840e;
        if (cVar != null) {
            if (!cVar.B || cVar.l() <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = activityC13563x72179722.f181840e;
                if (true != cVar2.B) {
                    cVar2.B = true;
                    ((java.util.TreeMap) cVar2.f182018r).clear();
                    if (cVar2.A) {
                        cVar2.notifyDataSetChanged();
                    }
                }
                activityC13563x72179722.W6();
                activityC13563x72179722.f181851s++;
            } else {
                db5.e1.A(activityC13563x72179722.mo55332x76847179(), activityC13563x72179722.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9j), "", activityC13563x72179722.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9d), activityC13563x72179722.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v0(activityC13563x72179722), null);
            }
        }
        return true;
    }
}
