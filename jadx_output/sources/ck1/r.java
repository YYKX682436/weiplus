package ck1;

/* loaded from: classes4.dex */
public final class r implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42368d;

    public r(ck1.k0 k0Var) {
        this.f42368d = k0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.uf7 uf7Var = (r45.uf7) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#usageInfoObservable");
        if (!ck1.n0.f42354a.e(uf7Var)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#usageInfoObservable, rawUsageInfo is null or invalid");
            return;
        }
        kotlin.jvm.internal.o.d(uf7Var);
        ck1.p pVar = new ck1.p(uf7Var);
        ck1.k0 k0Var = this.f42368d;
        k0Var.f42339e = pVar;
        k0Var.notifyDataSetChanged();
    }
}
