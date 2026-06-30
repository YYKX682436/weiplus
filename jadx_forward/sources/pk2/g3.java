package pk2;

/* loaded from: classes3.dex */
public final class g3 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437304d;

    public g3(pk2.q3 q3Var, boolean z17, android.view.View view, r45.t62 t62Var, r45.t62 t62Var2) {
        this.f437301a = q3Var;
        this.f437302b = view;
        this.f437303c = t62Var;
        this.f437304d = t62Var2;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        pk2.q3 q3Var = this.f437301a;
        qk2.f.f(q3Var, false, 1, null);
        q3Var.getClass();
        android.view.View rootView = this.f437302b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "$rootView");
        q3Var.x(rootView, this.f437303c, this.f437304d);
    }
}
