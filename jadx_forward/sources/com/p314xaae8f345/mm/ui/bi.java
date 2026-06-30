package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class bi implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f279417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f279418e;

    public bi(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2, android.app.ProgressDialog progressDialog) {
        this.f279418e = activityC21437xf483c2;
        this.f279417d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.f278602x;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f279417d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(this.f279418e.f278610n);
        }
    }
}
