package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class c1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f145596d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f145597e;

    public c1(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f52, java.lang.String str) {
        this.f145596d = new java.lang.ref.WeakReference(activityC10332x8a1129f52);
        this.f145597e = str;
    }

    @Override // c01.da
    public boolean a() {
        if (((com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5) this.f145596d.get()) != null) {
            return com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y;
        }
        return true;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5) this.f145596d.get();
        if (activityC10332x8a1129f5 != null && (progressDialog = activityC10332x8a1129f5.f145222d) != null) {
            progressDialog.dismiss();
        }
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(this.f145597e);
    }
}
