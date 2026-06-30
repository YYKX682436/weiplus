package ck1;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f42312e;

    public d(ck1.k0 k0Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f42311d = k0Var;
        this.f42312e = linearLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int x17 = this.f42312e.x();
        ck1.k0 k0Var = this.f42311d;
        boolean z17 = x17 >= k0Var.getItemCount() - 1;
        k0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "configManageArea, fixAtScreenBottom: " + z17);
        if (k0Var.f42339e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "configManageArea, curUsageInfo is null");
        } else {
            k0Var.f42341g = java.lang.Boolean.valueOf(z17);
            k0Var.notifyItemChanged(r0.f42360a - 1);
        }
    }
}
