package gu1;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001 f357445d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001 activityC13042x42c001) {
        this.f357445d = activityC13042x42c001;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001 activityC13042x42c001 = this.f357445d;
        activityC13042x42c001.R = false;
        if (activityC13042x42c001.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareCardListUI", "Activity is finished!!!");
        } else {
            activityC13042x42c001.p7();
        }
    }
}
