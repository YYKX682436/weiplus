package ni2;

/* loaded from: classes3.dex */
public final class z implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.d0 f419051a;

    public z(ni2.d0 d0Var) {
        this.f419051a = d0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        ni2.d0 d0Var = this.f419051a;
        android.widget.CheckBox checkBox = d0Var.f418804m;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        d0Var.f418809r = checkBox.isChecked() ? 1 : 0;
        android.widget.TextView textView = d0Var.f418803i;
        if (textView != null) {
            textView.setActivated(d0Var.f418809r != 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
            throw null;
        }
    }
}
