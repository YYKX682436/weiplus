package sd;

/* loaded from: classes8.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Class f488193a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f488194b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f488195c;

    /* renamed from: e, reason: collision with root package name */
    public final sd.f f488197e;

    /* renamed from: f, reason: collision with root package name */
    public final nf.g f488198f;

    /* renamed from: g, reason: collision with root package name */
    public sd.g0 f488199g;

    /* renamed from: d, reason: collision with root package name */
    public final sd.v f488196d = new sd.v(this, null);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f488200h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Class f488201i = null;

    /* renamed from: j, reason: collision with root package name */
    public final sd.x f488202j = new sd.u(this);

    public w(android.app.Activity activity) {
        this.f488194b = activity;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-1);
        this.f488195c = frameLayout;
        this.f488197e = new sd.f();
        this.f488199g = new sd.t(this);
        this.f488198f = nf.g.a(activity);
    }

    public void a() {
        java.util.Iterator<E> it = this.f488196d.iterator();
        while (it.hasNext()) {
            ((sd.k) it.next()).a();
        }
        java.lang.Integer num = this.f488200h;
        sd.o0 o0Var = null;
        this.f488200h = null;
        android.content.Context context = this.f488194b;
        sd.o0 a17 = sd.q0.a(context, num);
        if (a17 != null) {
            if (a17.f488164g.equals(c())) {
                o0Var = a17;
            }
        }
        if (o0Var != null) {
            o0Var.a();
        }
        nf.g.b(context);
    }

    public sd.k b() {
        sd.v vVar = this.f488196d;
        if (vVar.size() > 0) {
            return (sd.k) vVar.peek();
        }
        return null;
    }

    public final java.lang.Class c() {
        if (this.f488201i == null) {
            java.lang.Class<com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f> cls = this.f488193a;
            if (cls == null) {
                cls = com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f.class;
            }
            this.f488201i = cls;
        }
        return this.f488201i;
    }

    public abstract void d();

    public boolean e() {
        sd.k b17 = b();
        if (b17 == null) {
            return false;
        }
        if (b17.f488144e.a(sd.z.class) || b17.c()) {
            return true;
        }
        if (this.f488196d.size() <= 1) {
            return false;
        }
        f(true);
        return true;
    }

    public boolean f(boolean z17) {
        sd.v vVar = this.f488196d;
        if (vVar.size() <= 1) {
            return false;
        }
        sd.k kVar = (sd.k) vVar.pop();
        if (z17) {
            sd.o oVar = new sd.o(this, kVar);
            kVar.getClass();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(((sd.u0) kVar).f488187h, "translationX", 0.0f, r10.getWidth());
            ofFloat.setDuration(250L);
            ofFloat.addListener(new sd.i(kVar, oVar));
            ofFloat.start();
        } else {
            j(kVar);
        }
        if (z17) {
            sd.k kVar2 = (sd.k) vVar.peek();
            sd.p pVar = new sd.p(this);
            kVar2.getClass();
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(((sd.u0) kVar2).f488187h, "translationX", -(r1.getWidth() * 0.25f), 0.0f);
            ofFloat2.setDuration(250L);
            ofFloat2.addListener(new sd.i(kVar2, pVar));
            ofFloat2.start();
        } else {
            ((sd.k) vVar.peek()).h();
        }
        return true;
    }

    public boolean g(java.lang.String str, android.os.Bundle bundle) {
        return h(str, bundle, !this.f488196d.isEmpty());
    }

    public boolean h(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        sd.k a17 = this.f488199g.a(str, bundle);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggagePageContainer", "No page specified for url %s", str);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f) this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.e eVar = fVar.f221419l;
        if (!(eVar != null ? eVar.a() : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuggagePageContainer", "Pushing page is banned");
            return false;
        }
        android.widget.FrameLayout frameLayout = this.f488195c;
        android.view.View view = ((sd.u0) a17).f488187h;
        frameLayout.addView(view, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/luggage/container/LuggagePageContainer", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, "(Ljava/lang/String;Landroid/os/Bundle;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/luggage/container/LuggagePageContainer", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, "(Ljava/lang/String;Landroid/os/Bundle;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sd.m mVar = new sd.m(this, z17, a17);
        a17.f488144e.f488133a.put(new sd.n(this, mVar), java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.e eVar2 = fVar.f221419l;
        if (eVar2 != null) {
            eVar2.c();
        }
        a17.b(str, bundle);
        frameLayout.postDelayed(mVar, 300L);
        if (z17) {
            return true;
        }
        mVar.run();
        return true;
    }

    public boolean i(java.lang.String str, android.os.Bundle bundle) {
        sd.k a17 = this.f488199g.a(str, bundle);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggagePageContainer", "No page specified for url %s", str);
            return false;
        }
        android.widget.FrameLayout frameLayout = this.f488195c;
        frameLayout.addView(((sd.u0) a17).f488187h, 0);
        this.f488196d.add(a17);
        a17.b(str, bundle);
        a17.h();
        if (this.f488200h != null) {
            return true;
        }
        frameLayout.postDelayed(new sd.s(this), 200L);
        return true;
    }

    public final void j(sd.k kVar) {
        this.f488195c.post(new sd.r(this, kVar));
        kVar.e();
        kVar.a();
    }
}
