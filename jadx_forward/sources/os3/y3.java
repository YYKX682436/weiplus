package os3;

/* loaded from: classes8.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f429790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.z3 f429791e;

    public y3(os3.z3 z3Var, android.os.Bundle bundle) {
        this.f429791e = z3Var;
        this.f429790d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.z3 z3Var = this.f429791e;
        android.os.Bundle bundle = this.f429790d;
        if (bundle != null) {
            z3Var.f429797d.F = bundle.getInt("download_status");
            z3Var.f429797d.G = bundle.getString("download_apk_path", "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = z3Var.f429797d;
        if (viewOnCreateContextMenuListenerC16941x4db497e1.F == 3 && com.p314xaae8f345.mm.vfs.w6.j(viewOnCreateContextMenuListenerC16941x4db497e1.G)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e12 = z3Var.f429797d;
            viewOnCreateContextMenuListenerC16941x4db497e12.I = 2;
            viewOnCreateContextMenuListenerC16941x4db497e12.W6();
        }
    }
}
