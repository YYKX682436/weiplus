package xt4;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2383x651874e.ui.ActivityC19186xf64f0750 f538692d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2383x651874e.ui.ActivityC19186xf64f0750 activityC19186xf64f0750) {
        this.f538692d = activityC19186xf64f0750;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2383x651874e.ui.ActivityC19186xf64f0750.f262804r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2383x651874e.ui.ActivityC19186xf64f0750 activityC19186xf64f0750 = this.f538692d;
        if (!activityC19186xf64f0750.f234389h) {
            activityC19186xf64f0750.f234386e.b();
        } else if (!activityC19186xf64f0750.f234393o) {
            activityC19186xf64f0750.f234386e.g();
            activityC19186xf64f0750.f234386e.setAdapter((android.widget.ListAdapter) activityC19186xf64f0750.f234387f);
            activityC19186xf64f0750.f234393o = true;
        }
        activityC19186xf64f0750.f234387f.notifyDataSetChanged();
    }
}
