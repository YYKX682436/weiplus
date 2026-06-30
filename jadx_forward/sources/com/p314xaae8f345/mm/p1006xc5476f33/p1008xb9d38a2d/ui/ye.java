package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ye implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155878a;

    public ye(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174) {
        this.f155878a = activityC11461x47892174;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = this.f155878a;
        if (!K0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(("" + ((java.lang.Object) activityC11461x47892174.C.m78931xfb85ada3())).trim())) {
                activityC11461x47892174.C.m78938x765074af(null);
            }
        }
        if (!fp.i.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegByMobileRegAIOUI", "SDcard is not available");
            return false;
        }
        android.graphics.Bitmap bitmap = activityC11461x47892174.E;
        if (bitmap != null && !bitmap.isRecycled() && !activityC11461x47892174.f155115z) {
            activityC11461x47892174.A.setImageBitmap(activityC11461x47892174.E);
            activityC11461x47892174.B.setVisibility(8);
            activityC11461x47892174.f155115z = true;
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m48708x9616526c() {
        return super.toString() + "|initView2";
    }
}
