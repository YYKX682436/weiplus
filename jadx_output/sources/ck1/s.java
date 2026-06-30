package ck1;

/* loaded from: classes4.dex */
public final class s implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42372d;

    public s(ck1.k0 k0Var) {
        this.f42372d = k0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ck1.l0 l0Var = (ck1.l0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#pageModeObservable, pageMode: " + l0Var);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#pageModeObservable, pageMode is null");
        } else {
            this.f42372d.notifyDataSetChanged();
        }
    }
}
