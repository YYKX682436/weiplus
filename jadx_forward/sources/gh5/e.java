package gh5;

/* loaded from: classes5.dex */
public final class e extends n3.j2 implements n3.k0 {

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f353513c;

    /* renamed from: d, reason: collision with root package name */
    public n3.g3 f353514d;

    /* renamed from: e, reason: collision with root package name */
    public e3.d f353515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f353516f;

    public e() {
        super(0);
        this.f353515e = e3.d.f328576e;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View v17, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        this.f353513c = v17;
        this.f353514d = insets;
        e3.d a17 = insets.a(this.f353516f ? 8 : 10);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        this.f353515e = a17;
        v17.setPadding(a17.f328577a, a17.f328578b, a17.f328579c, a17.f328580d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", "onApplyWindowInsets: " + this.f353515e.f328580d);
        n3.g3 CONSUMED = n3.g3.f415870b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // n3.j2
    public void b(n3.s2 animation) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", "onEnd");
        if (this.f353516f && (animation.a() & 8) != 0) {
            this.f353516f = false;
            if (this.f353514d != null && (view = this.f353513c) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                n3.g3 g3Var = this.f353514d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g3Var);
                n3.l1.b(view, g3Var);
            }
        }
        android.view.View view2 = this.f353513c;
        if (view2 == null) {
            return;
        }
        view2.setTranslationY(0.0f);
    }

    @Override // n3.j2
    public void c(n3.s2 animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", "onPrepare");
        if ((animation.a() & 8) != 0) {
            this.f353516f = true;
        }
    }

    @Override // n3.j2
    public n3.g3 d(n3.g3 insets, java.util.List runningAnimations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningAnimations, "runningAnimations");
        e3.d a17 = insets.a(8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        e3.d a18 = insets.a(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getInsets(...)");
        e3.d c17 = e3.d.c(this.f353515e, e3.d.c(a17, a18));
        android.view.View view = this.f353513c;
        if (view != null) {
            view.setTranslationY(c17.f328580d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        android.view.View view2 = this.f353513c;
        sb6.append(view2 != null ? java.lang.Float.valueOf(view2.getTranslationY()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", sb6.toString());
        return insets;
    }
}
