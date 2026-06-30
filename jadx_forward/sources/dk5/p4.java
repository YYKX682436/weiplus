package dk5;

/* loaded from: classes9.dex */
public class p4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.r4 f316332d;

    public p4(dk5.r4 r4Var) {
        this.f316332d = r4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dk5.r4 r4Var = this.f316332d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = r4Var.f316383a;
        if (j0Var != null) {
            j0Var.dismiss();
            r4Var.f316383a = null;
        }
        ((dk5.u1) r4Var.f316384b).f316460a.finish();
    }
}
