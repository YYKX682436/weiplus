package qd2;

/* loaded from: classes10.dex */
public final class u0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f443375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f443376c;

    public u0(qd2.g1 g1Var, boolean z17, android.widget.Button button) {
        this.f443374a = g1Var;
        this.f443375b = z17;
        this.f443376c = button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        qd2.g1 g1Var = this.f443374a;
        if (z17) {
            g1Var.f443294o = true;
            g1Var.f443295p = true;
        } else {
            g1Var.f443294o = false;
            g1Var.f443295p = false;
        }
        if (this.f443375b) {
            return;
        }
        this.f443376c.setEnabled(z17);
    }
}
