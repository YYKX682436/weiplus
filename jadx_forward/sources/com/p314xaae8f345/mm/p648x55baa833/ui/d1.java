package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class d1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f145631d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f145632e;

    public d1(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f52, java.lang.String str) {
        this.f145631d = new java.lang.ref.WeakReference(activityC10332x8a1129f52);
        this.f145632e = str;
    }

    @Override // c01.da
    public boolean a() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5) this.f145631d.get();
        if (activityC10332x8a1129f5 != null) {
            return activityC10332x8a1129f5.N;
        }
        return true;
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5) this.f145631d.get();
        if (activityC10332x8a1129f5 != null) {
            android.app.ProgressDialog progressDialog = activityC10332x8a1129f5.f145223e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            java.lang.String str = this.f145632e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            db5.t7.h(activityC10332x8a1129f5, str);
        }
    }
}
