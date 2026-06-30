package sr2;

/* loaded from: classes.dex */
public final class k implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.o f493140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f493141b;

    public k(sr2.o oVar, android.view.View view) {
        this.f493140a = oVar;
        this.f493141b = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        this.f493140a.getClass();
        this.f493141b.setEnabled(z17);
    }
}
