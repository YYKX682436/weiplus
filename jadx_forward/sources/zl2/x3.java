package zl2;

/* loaded from: classes3.dex */
public final class x3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f555556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555557e;

    public x3(p3325xe03a0797.p3326xc267989b.r2 r2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f555556d = r2Var;
        this.f555557e = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f555556d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f555557e.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
