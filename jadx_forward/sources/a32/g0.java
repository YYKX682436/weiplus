package a32;

/* loaded from: classes10.dex */
public final class g0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 f82549d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5) {
        this.f82549d = c13394xa8c361b5;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = this.f82549d;
        r45.p64 p64Var = c13394xa8c361b5.f180213u;
        if (p64Var != null) {
            c13394xa8c361b5.f180206n.a(p64Var);
            java.lang.String str = p64Var.f464325d;
            u22.t tVar = c13394xa8c361b5.f180207o;
            tVar.f505565e = str;
            tVar.f505567g = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 reporter = c13394xa8c361b5.getReporter();
        if (reporter != null) {
            reporter.e(26);
        }
    }
}
