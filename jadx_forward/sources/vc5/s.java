package vc5;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f516875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 f516876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f516877f;

    public s(android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 c21818x708ac6f1, java.lang.CharSequence charSequence) {
        this.f516875d = view;
        this.f516876e = c21818x708ac6f1;
        this.f516877f = charSequence;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f516875d.removeOnAttachStateChangeListener(this);
        em.d2 d2Var = this.f516876e.f283265f;
        if (d2Var != null) {
            d2Var.d().setHint(this.f516877f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
