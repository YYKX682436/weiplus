package pi2;

/* loaded from: classes3.dex */
public final class e implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pi2.n f436305a;

    public e(pi2.n nVar) {
        this.f436305a = nVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        fg2.u0 u0Var = this.f436305a.R;
        if (u0Var != null) {
            u0Var.f343882g.setEnabled(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}
