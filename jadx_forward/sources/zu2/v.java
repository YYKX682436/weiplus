package zu2;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f557284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zu2.a0 a0Var) {
        super(0);
        this.f557284d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        android.view.View view2;
        zu2.a0 a0Var = this.f557284d;
        if (java.lang.Math.max(a0Var.f557232n - a0Var.f557234p, 0) > 0) {
            a0Var.f557233o = false;
            android.widget.TextView textView = a0Var.f557228g;
            if (textView != null) {
                textView.setText(a0Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572792ck1, java.lang.String.valueOf(java.lang.Math.max(a0Var.f557232n - a0Var.f557234p, 0))));
            }
        } else {
            a0Var.f557233o = true;
            android.widget.TextView textView2 = a0Var.f557228g;
            if (textView2 != null) {
                textView2.setText(a0Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572793ck2));
            }
        }
        jx2.j jVar = a0Var.f557229h;
        if (jVar != null && (view = a0Var.f557230i) != null && (view2 = a0Var.f557231m) != null && jVar.isShowing()) {
            view2.post(new zu2.z(view, view2, jVar));
        }
        return jz5.f0.f384359a;
    }
}
