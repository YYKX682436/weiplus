package im2;

/* loaded from: classes.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f374039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f374041f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(boolean z17, im2.z3 z3Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f374039d = z17;
        this.f374040e = z3Var;
        this.f374041f = onCancelListener;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f374039d;
        im2.z3 z3Var = this.f374040e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = z3Var.B1;
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f374041f;
            if (u3Var == null) {
                z3Var.B1 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(z3Var.m158354x19263085(), z3Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), true, 2, onCancelListener);
            } else {
                if (u3Var.isShowing() ? false : true) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = z3Var.B1;
                    if (u3Var2 != null) {
                        u3Var2.setOnCancelListener(onCancelListener);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = z3Var.B1;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = z3Var.B1;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
        }
        return jz5.f0.f384359a;
    }
}
