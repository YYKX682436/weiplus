package com.p314xaae8f345.mm.ui.p2712x43ceaabb;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/immersive/ImmersiveBaseActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "eh5/a", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.immersive.ImmersiveBaseActivity */
/* loaded from: classes14.dex */
public abstract class AbstractActivityC22432xeb4f0b3b extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f290464s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f290465d = com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a;

    /* renamed from: e, reason: collision with root package name */
    public final int f290466e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f290467f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f290468g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f290469h;

    /* renamed from: i, reason: collision with root package name */
    public final long f290470i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f290471m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f290472n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f290473o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f290474p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f290475q;

    /* renamed from: r, reason: collision with root package name */
    public n3.g3 f290476r;

    public AbstractActivityC22432xeb4f0b3b() {
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f290467f = p0Var;
        this.f290468g = p0Var;
        this.f290469h = p0Var;
        this.f290470i = 300L;
        this.f290471m = true;
        this.f290472n = jz5.h.b(new eh5.b(this));
        this.f290473o = jz5.h.b(new eh5.d(this));
        this.f290474p = jz5.h.b(new eh5.c(this));
        this.f290475q = jz5.h.b(new eh5.i(this));
    }

    public static void g7(com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b abstractActivityC22432xeb4f0b3b, java.util.Map chromeVisibilities, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChromeVisibility");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        abstractActivityC22432xeb4f0b3b.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chromeVisibilities, "chromeVisibilities");
        if (z17) {
            for (java.util.Map.Entry entry : chromeVisibilities.entrySet()) {
                java.lang.Class cls = (java.lang.Class) entry.getKey();
                int intValue = ((java.lang.Number) entry.getValue()).intValue();
                com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W6 = abstractActivityC22432xeb4f0b3b.W6(cls);
                if (W6 != null) {
                    W6.setVisibility(intValue);
                }
            }
            abstractActivityC22432xeb4f0b3b.U6();
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry2 : chromeVisibilities.entrySet()) {
            java.lang.Class cls2 = (java.lang.Class) entry2.getKey();
            int intValue2 = ((java.lang.Number) entry2.getValue()).intValue();
            com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W62 = abstractActivityC22432xeb4f0b3b.W6(cls2);
            if (W62 != null && W62.getVisibility() != intValue2) {
                arrayList.add(new jz5.l(W62, java.lang.Integer.valueOf(intValue2)));
            }
        }
        if (arrayList.isEmpty()) {
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        android.view.View view = abstractActivityC22432xeb4f0b3b.X6().f336157a;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        u4.g1.f506013c.remove(viewGroup);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) u4.g1.b().m174751x4aabfc28(viewGroup, null);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
            int size = arrayList3.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) arrayList3.get(size)).u(viewGroup);
                }
            }
        }
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
        c1184xfa388aad.b0(0);
        c1184xfa388aad.X(new p012xc85e97e9.p112x993b6d55.C1179x214a9c(1));
        c1184xfa388aad.X(new p012xc85e97e9.p112x993b6d55.C1179x214a9c(2));
        c1184xfa388aad.X(new p012xc85e97e9.p112x993b6d55.C1173xe703c6a5());
        c1184xfa388aad.Z(abstractActivityC22432xeb4f0b3b.f290470i);
        c1184xfa388aad.c(abstractActivityC22432xeb4f0b3b.X6().c());
        c1184xfa388aad.c(abstractActivityC22432xeb4f0b3b.X6().b());
        c1184xfa388aad.c(abstractActivityC22432xeb4f0b3b.X6().a());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c1184xfa388aad.c((android.view.View) ((jz5.l) it.next()).f384366d);
        }
        int i18 = 0;
        while (true) {
            if (!(i18 < viewGroup.getChildCount())) {
                c1184xfa388aad.T(new eh5.j(c1184xfa388aad, aVar));
                u4.g1.a(viewGroup, c1184xfa388aad);
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    jz5.l lVar = (jz5.l) it6.next();
                    android.view.View view2 = (android.view.View) lVar.f384366d;
                    int intValue3 = ((java.lang.Number) lVar.f384367e).intValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList4.add(java.lang.Integer.valueOf(intValue3));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/ui/immersive/ImmersiveBaseActivity", "setChromeVisibility", "(Ljava/util/Map;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/immersive/ImmersiveBaseActivity", "setChromeVisibility", "(Ljava/util/Map;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                abstractActivityC22432xeb4f0b3b.U6();
                return;
            }
            int i19 = i18 + 1;
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (childAt == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, abstractActivityC22432xeb4f0b3b.X6().c()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, abstractActivityC22432xeb4f0b3b.X6().b()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, abstractActivityC22432xeb4f0b3b.X6().a())) {
                c1184xfa388aad.r(childAt, true);
            }
            i18 = i19;
        }
    }

    public final void U6() {
        n3.g3 g3Var = this.f290476r;
        if (g3Var == null) {
            android.view.View decorView = getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            g3Var = n3.b1.a(decorView);
            if (g3Var == null) {
                int i17 = android.os.Build.VERSION.SDK_INT;
                g3Var = (i17 >= 30 ? new n3.w2() : i17 >= 29 ? new n3.v2() : new n3.u2()).b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g3Var, "build(...)");
            }
        }
        e3.d a17 = g3Var.a(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        android.widget.LinearLayout c17 = X6().c();
        int paddingLeft = X6().c().getPaddingLeft();
        jz5.g gVar = this.f290473o;
        boolean e76 = e7((java.util.List) ((jz5.n) gVar).mo141623x754a37bb());
        int i18 = a17.f328578b;
        c17.setPadding(paddingLeft, e76 ? i18 : 0, X6().c().getPaddingRight(), X6().c().getPaddingBottom());
        android.widget.LinearLayout b17 = X6().b();
        int paddingLeft2 = X6().b().getPaddingLeft();
        int paddingTop = X6().b().getPaddingTop();
        int paddingRight = X6().b().getPaddingRight();
        jz5.g gVar2 = this.f290474p;
        boolean e77 = e7((java.util.List) ((jz5.n) gVar2).mo141623x754a37bb());
        int i19 = a17.f328580d;
        b17.setPadding(paddingLeft2, paddingTop, paddingRight, e77 ? i19 : 0);
        if (e7((java.util.List) ((jz5.n) gVar).mo141623x754a37bb())) {
            i18 = 0;
        }
        if (e7((java.util.List) ((jz5.n) gVar2).mo141623x754a37bb())) {
            i19 = 0;
        }
        int i27 = android.os.Build.VERSION.SDK_INT;
        n3.x2 w2Var = i27 >= 30 ? new n3.w2() : i27 >= 29 ? new n3.v2() : new n3.u2();
        w2Var.c(7, e3.d.b(0, i18, 0, i19));
        n3.g3 b18 = w2Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "build(...)");
        n3.l1.b(X6().a(), b18);
    }

    public abstract android.view.View V6();

    public final com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W6(java.lang.Class viewClazz) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewClazz, "viewClazz");
        java.util.Iterator it = ((java.util.List) ((jz5.n) this.f290473o).mo141623x754a37bb()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (viewClazz.isInstance((android.view.View) obj)) {
                break;
            }
        }
        android.view.View view = (android.view.View) obj;
        if (view == null) {
            java.util.Iterator it6 = ((java.util.List) ((jz5.n) this.f290474p).mo141623x754a37bb()).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (viewClazz.isInstance((android.view.View) obj2)) {
                    break;
                }
            }
            view = (android.view.View) obj2;
            if (view == null) {
                java.util.Iterator it7 = ((java.util.List) ((jz5.n) this.f290475q).mo141623x754a37bb()).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it7.next();
                    if (viewClazz.isInstance((android.view.View) obj3)) {
                        break;
                    }
                }
                view = (android.view.View) obj3;
            }
        }
        if (view instanceof com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b) {
            return (com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b) view;
        }
        return null;
    }

    public final em.n0 X6() {
        return (em.n0) ((jz5.n) this.f290472n).mo141623x754a37bb();
    }

    /* renamed from: Y6, reason: from getter */
    public boolean getF290471m() {
        return this.f290471m;
    }

    /* renamed from: Z6, reason: from getter */
    public int getF290466e() {
        return this.f290466e;
    }

    /* renamed from: a7, reason: from getter */
    public java.util.List getF290468g() {
        return this.f290468g;
    }

    /* renamed from: b7, reason: from getter */
    public int getF290465d() {
        return this.f290465d;
    }

    /* renamed from: c7, reason: from getter */
    public java.util.List getF290467f() {
        return this.f290467f;
    }

    /* renamed from: d7, reason: from getter */
    public java.util.List getF290469h() {
        return this.f290469h;
    }

    public final boolean e7(java.util.List list) {
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if ((view instanceof com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b) && ((com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b) view).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void f7(android.view.ViewGroup viewGroup, eh5.a aVar, java.util.List list, int i17) {
        if (i17 != 0) {
            viewGroup.setBackgroundColor(mo55332x76847179().getResources().getColor(i17, null));
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Class cls = (java.lang.Class) it.next();
            com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b abstractC22433x7fa3716b = (com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b) cls.getDeclaredConstructor(android.content.Context.class).newInstance(mo55332x76847179());
            if (abstractC22433x7fa3716b.getImmersiveType() != aVar) {
                throw new java.lang.IllegalArgumentException("ChromeType must be " + aVar + ", " + abstractC22433x7fa3716b.getImmersiveType() + " found");
            }
            abstractC22433x7fa3716b.m80727x765a5fd0(new eh5.f(this, cls));
            viewGroup.addView(abstractC22433x7fa3716b);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559414e5, com.p314xaae8f345.mm.R.C30854x2dc211.f559423ee);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public final int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eh8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public final boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        m78565x45496f5a(0);
        mo78578x8b18f126(0);
        new n3.m3(getWindow(), getWindow().getDecorView()).c(!com.p314xaae8f345.mm.ui.bk.C());
        n3.h2.a(mo55332x76847179().getWindow(), false);
        android.view.View decorView = mo55332x76847179().getWindow().getDecorView();
        eh5.e eVar = new eh5.e(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(decorView, eVar);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559420eb, com.p314xaae8f345.mm.R.C30854x2dc211.f559416e7);
        android.widget.LinearLayout c17 = X6().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getHeaderContainer(...)");
        f7(c17, eh5.a.f334484d, getF290467f(), getF290465d());
        android.widget.LinearLayout b17 = X6().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getFooterContainer(...)");
        f7(b17, eh5.a.f334485e, getF290468g(), getF290466e());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 d17 = X6().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getImmersiveBaseActivity(...)");
        f7(d17, eh5.a.f334486f, getF290469h(), 0);
        X6().a().addView(V6());
        n3.a1.u(X6().a(), new eh5.g(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
    }
}
