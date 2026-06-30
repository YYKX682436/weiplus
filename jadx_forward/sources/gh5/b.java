package gh5;

/* loaded from: classes12.dex */
public final class b extends n3.j2 implements n3.k0 {

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f353505c;

    /* renamed from: d, reason: collision with root package name */
    public n3.g3 f353506d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f353507e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f353508f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f353509g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f353510h;

    /* renamed from: i, reason: collision with root package name */
    public int f353511i;

    public b() {
        super(0);
        this.f353508f = new java.util.concurrent.CopyOnWriteArrayList();
        this.f353509g = new java.util.concurrent.CopyOnWriteArrayList();
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View v17, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        this.f353505c = v17;
        this.f353506d = insets;
        this.f353507e = insets.f(this.f353510h ? 8 : 10);
        return insets;
    }

    @Override // n3.j2
    public void b(n3.s2 animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityKeyboardAnimationCallback", "onEnd");
        if (this.f353510h && (animation.a() & 8) != 0) {
            this.f353510h = false;
            android.view.View view = this.f353505c;
            n3.g3 g3Var = this.f353506d;
            if (view != null && g3Var != null) {
                n3.l1.b(view, g3Var);
            }
        }
        java.util.Iterator it = this.f353509g.iterator();
        while (it.hasNext()) {
            gh5.a aVar = (gh5.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.b(this.f353507e);
            }
        }
    }

    @Override // n3.j2
    public void c(n3.s2 animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if ((animation.a() & 8) != 0) {
            this.f353510h = true;
        }
        java.util.Iterator it = this.f353509g.iterator();
        while (it.hasNext()) {
            gh5.a aVar = (gh5.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.c(this.f353507e);
            }
        }
    }

    @Override // n3.j2
    public n3.g3 d(n3.g3 insets, java.util.List runningAnimations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningAnimations, "runningAnimations");
        e3.d a17 = insets.a(8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        e3.d h17 = insets.f415871a.h(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getInsetsIgnoringVisibility(...)");
        int i17 = e3.d.c(a17, h17).f328580d;
        if (i17 < 0) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityKeyboardAnimationCallback", "onProgress ime=" + a17.f328580d + " nav=" + h17.f328580d + " offset=" + i17);
        java.util.Iterator it = this.f353508f.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
            if (view != null) {
                if (this.f353511i == 0) {
                    view.setTranslationY(-i17);
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = i17;
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }
        java.util.Iterator it6 = this.f353509g.iterator();
        while (it6.hasNext()) {
            gh5.a aVar = (gh5.a) ((java.lang.ref.WeakReference) it6.next()).get();
            if (aVar != null) {
                aVar.a(i17);
            }
        }
        return insets;
    }

    public final gh5.b f(gh5.a aVar) {
        if (aVar == null) {
            return this;
        }
        this.f353509g.addIfAbsent(new java.lang.ref.WeakReference(aVar));
        return this;
    }
}
