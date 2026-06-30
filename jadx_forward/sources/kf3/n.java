package kf3;

/* loaded from: classes5.dex */
public class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if3.g0 f388933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.o f388934e;

    public n(kf3.o oVar, if3.g0 g0Var) {
        this.f388934e = oVar;
        this.f388933d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f388933d);
        kf3.o oVar = this.f388934e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = oVar.f388939a.f388974f;
        if (u3Var != null) {
            u3Var.dismiss();
            oVar.f388939a.f388974f = null;
        }
    }
}
