package te2;

/* loaded from: classes.dex */
public final class k8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f499704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f499706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(boolean z17, te2.p8 p8Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f499704d = z17;
        this.f499705e = p8Var;
        this.f499706f = onCancelListener;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f499704d;
        te2.p8 p8Var = this.f499705e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = p8Var.D1;
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f499706f;
            if (u3Var == null) {
                p8Var.D1 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(p8Var.m158354x19263085(), p8Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), true, 2, onCancelListener);
            } else {
                if (u3Var.isShowing() ? false : true) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = p8Var.D1;
                    if (u3Var2 != null) {
                        u3Var2.setOnCancelListener(onCancelListener);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = p8Var.D1;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = p8Var.D1;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
        }
        return jz5.f0.f384359a;
    }
}
