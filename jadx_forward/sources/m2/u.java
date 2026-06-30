package m2;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 f404476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 c1069x2505018) {
        super(0);
        this.f404476d = c1069x2505018;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = false;
        android.view.View childAt = this.f404476d.getChildAt(0);
        if (childAt == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        android.view.KeyEvent.Callback childAt2 = ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37) childAt).getChildAt(0);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.t4 t4Var = childAt2 instanceof p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.t4 ? (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.t4) childAt2 : null;
        if (t4Var != null) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) t4Var;
            c1059xa8272988.e(c1059xa8272988.getRoot());
        }
        synchronized (x0.z.f532496b) {
            if (((x0.d) x0.z.f532502h.get()).f532410h != null) {
                if (!r2.isEmpty()) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            x0.z.a();
        }
        return jz5.f0.f384359a;
    }
}
