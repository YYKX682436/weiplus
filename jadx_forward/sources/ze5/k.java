package ze5;

/* loaded from: classes9.dex */
public final class k implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f553572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553573c;

    public k(android.view.View view, android.widget.TextView textView, yb5.d dVar) {
        this.f553571a = view;
        this.f553572b = textView;
        this.f553573c = dVar;
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.view.View todoContainerLl = this.f553571a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(todoContainerLl, "$todoContainerLl");
        android.widget.TextView todoTextView = this.f553572b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(todoTextView, "$todoTextView");
        te5.t.k(booleanValue, todoContainerLl, todoTextView, this.f553573c);
        return null;
    }
}
