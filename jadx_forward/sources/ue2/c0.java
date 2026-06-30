package ue2;

/* loaded from: classes3.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f508332d;

    public c0(ue2.e0 e0Var) {
        this.f508332d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "show: 弹窗动画开始");
        ue2.i0 i0Var = this.f508332d.f508340g;
        if (i0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ue2.o.f508360y, "onShow: 内部弹窗已显示");
            ue2.h0 h0Var = ((ue2.g) i0Var).f508346a.f508371q;
            if (h0Var != null) {
                h0Var.a();
            }
        }
    }
}
