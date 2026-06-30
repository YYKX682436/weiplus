package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd f182440e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd, int i17) {
        this.f182440e = activityC13597x28c5d1bd;
        this.f182439d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182440e;
        int i17 = this.f182439d;
        if (i17 != -1) {
            activityC13597x28c5d1bd.f182405f.setSelection(i17);
            activityC13597x28c5d1bd.f182403d = i17;
            return;
        }
        int i18 = activityC13597x28c5d1bd.f182403d;
        if (i18 - 1 >= 0 && i18 - 1 < activityC13597x28c5d1bd.f182407h.size()) {
            int i19 = activityC13597x28c5d1bd.f182403d;
            activityC13597x28c5d1bd.f182407h.size();
            activityC13597x28c5d1bd.f182405f.setSelection(activityC13597x28c5d1bd.f182403d - 1);
            activityC13597x28c5d1bd.f182403d--;
            return;
        }
        if (activityC13597x28c5d1bd.f182407h.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavMediaGalleryUI", "data list size %d, empty, finish", java.lang.Integer.valueOf(activityC13597x28c5d1bd.f182407h.size()));
            activityC13597x28c5d1bd.finish();
        } else {
            activityC13597x28c5d1bd.f182407h.size();
            activityC13597x28c5d1bd.f182405f.setSelection(0);
            activityC13597x28c5d1bd.f182403d = 0;
        }
    }
}
