package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f182748e;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e, int i17) {
        this.f182748e = activityC13568x82804f7e;
        this.f182747d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f182748e;
        int i17 = this.f182747d;
        if (i17 != -1) {
            activityC13568x82804f7e.f181891e.setSelection(i17);
            activityC13568x82804f7e.f181890d = i17;
            return;
        }
        int i18 = activityC13568x82804f7e.f181890d;
        if (i18 - 1 >= 0 && i18 - 1 < activityC13568x82804f7e.f181893g.size()) {
            int i19 = activityC13568x82804f7e.f181890d;
            activityC13568x82804f7e.f181893g.size();
            activityC13568x82804f7e.f181891e.setSelection(activityC13568x82804f7e.f181890d - 1);
            activityC13568x82804f7e.f181890d--;
            return;
        }
        if (activityC13568x82804f7e.f181893g.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavImgGalleryUI", "data list size %d, empty, finish", java.lang.Integer.valueOf(activityC13568x82804f7e.f181893g.size()));
            activityC13568x82804f7e.finish();
        } else {
            activityC13568x82804f7e.f181893g.size();
            activityC13568x82804f7e.f181891e.setSelection(0);
            activityC13568x82804f7e.f181890d = 0;
        }
    }
}
