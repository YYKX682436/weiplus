package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes11.dex */
public class e implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f279577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b f279578e;

    public e(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b, android.app.ProgressDialog progressDialog) {
        this.f279578e = activityC21598xfb43db0b;
        this.f279577d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f279578e.f279567u;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f279577d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
