package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f182096d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f182096d = activityC13563x72179722;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = this.f182096d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13563x72179722.f181840e;
        if (cVar == null) {
            activityC13563x72179722.finish();
            return;
        }
        boolean z17 = cVar.B;
        if (!z17) {
            activityC13563x72179722.finish();
            return;
        }
        if (z17) {
            cVar.B = false;
            ((java.util.TreeMap) cVar.f182018r).clear();
            if (cVar.A) {
                cVar.notifyDataSetChanged();
            }
        }
        activityC13563x72179722.U6(activityC13563x72179722.f181854v);
        activityC13563x72179722.mo60878xf6b21fea(0, activityC13563x72179722.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbi));
    }
}
