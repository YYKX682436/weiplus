package kf3;

/* loaded from: classes5.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if3.g0 f388947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.u f388948e;

    public q(kf3.u uVar, if3.g0 g0Var) {
        this.f388948e = uVar;
        this.f388947d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f388947d);
        kf3.u uVar = this.f388948e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = uVar.f388974f;
        if (u3Var != null) {
            u3Var.dismiss();
            uVar.f388974f = null;
        }
    }
}
