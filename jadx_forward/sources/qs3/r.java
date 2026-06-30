package qs3;

/* loaded from: classes15.dex */
public final class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447916d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5) {
        this.f447916d = c16945xe78973e5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447916d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = c16945xe78973e5.f236523y;
        if (j0Var != null) {
            if (j0Var != null) {
                j0Var.dismiss();
            }
            c16945xe78973e5.f236523y = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5.a(c16945xe78973e5);
    }
}
