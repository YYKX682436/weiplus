package te2;

/* loaded from: classes.dex */
public final class gc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f499578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f499580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(boolean z17, te2.hc hcVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f499578d = z17;
        this.f499579e = hcVar;
        this.f499580f = onCancelListener;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f499578d;
        te2.hc hcVar = this.f499579e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = hcVar.K;
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f499580f;
            if (u3Var == null) {
                hcVar.K = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(hcVar.m158354x19263085(), hcVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), true, 2, onCancelListener);
            } else {
                if (u3Var.isShowing() ? false : true) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = hcVar.K;
                    if (u3Var2 != null) {
                        u3Var2.setOnCancelListener(onCancelListener);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = hcVar.K;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = hcVar.K;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
        }
        return jz5.f0.f384359a;
    }
}
