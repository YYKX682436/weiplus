package oj5;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f427420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f427421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f427422g;

    public t(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f427419d = view;
        this.f427420e = c0Var;
        this.f427421f = h0Var;
        this.f427422g = n3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f427419d.removeOnAttachStateChangeListener(this);
        this.f427420e.f391645d = true;
        java.lang.Runnable runnable = (java.lang.Runnable) this.f427421f.f391656d;
        if (runnable != null) {
            this.f427422g.mo50300x3fa464aa(runnable);
        }
    }
}
