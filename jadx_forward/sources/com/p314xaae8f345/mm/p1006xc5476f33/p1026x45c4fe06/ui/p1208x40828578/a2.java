package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes15.dex */
public final class a2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.z {
    public final java.util.ArrayList A;
    public final java.util.ArrayList B;
    public final java.util.ArrayList C;
    public final java.util.ArrayList D;
    public final java.util.ArrayList E;
    public final java.util.ArrayList F;
    public final java.util.ArrayList G;
    public final java.util.ArrayList H;
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f171560J;
    public final java.util.ArrayList K;
    public boolean L;

    /* renamed from: t, reason: collision with root package name */
    public boolean f171561t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f171562u = true;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k2 f171563v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.q1(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f171564w = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f171565x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f171566y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f171567z;

    public a2() {
        new android.view.animation.AccelerateDecelerateInterpolator();
        this.f171565x = new java.util.ArrayList();
        this.f171566y = new java.util.ArrayList();
        this.f171567z = new java.util.ArrayList();
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.D = new java.util.ArrayList();
        this.E = new java.util.ArrayList();
        this.F = new java.util.ArrayList();
        this.G = new java.util.ArrayList();
        this.H = new java.util.ArrayList();
        this.I = new java.util.ArrayList();
        this.f171560J = new java.util.ArrayList();
        this.K = new java.util.ArrayList();
        this.L = false;
    }

    private void H(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        k3Var.f3639x46306858.animate().setInterpolator(new android.animation.ValueAnimator().getInterpolator());
        j(k3Var);
        android.view.View view = k3Var.f3639x46306858;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        view.setTranslationY(0.0f);
        n3.l1.m(k3Var.f3639x46306858, 1.0f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public void A(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (this.H.contains(k3Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc c12725xa9e084fc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc) k3Var.f3639x46306858.getParent();
            android.view.View view = k3Var.f3639x46306858;
            c12725xa9e084fc.getClass();
            if (view.getParent() != c12725xa9e084fc) {
                return;
            }
            view.setZ(1.0f);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public void C(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (this.G.contains(k3Var)) {
            return;
        }
        this.L = true;
    }

    public void I(p012xc85e97e9.p103xe821e364.p104xd1075a44.k2 k2Var) {
        if (k2Var != null) {
            synchronized (this.f171564w) {
                ((java.util.HashSet) this.f171564w).add(k2Var);
            }
        }
    }

    public void J(p012xc85e97e9.p103xe821e364.p104xd1075a44.k2 k2Var) {
        if (k2Var != null) {
            synchronized (this.f171564w) {
                ((java.util.HashSet) this.f171564w).remove(k2Var);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        int i17;
        int i18;
        if (!this.f171562u) {
            H(k3Var);
            h(k3Var);
            return false;
        }
        if (m2Var != null && ((i17 = m2Var.f93672a) != (i18 = m2Var2.f93672a) || m2Var.f93673b != m2Var2.f93673b)) {
            return super.v(k3Var, i17, m2Var.f93673b, i18, m2Var2.f93673b);
        }
        if (this.f171561t && (k3Var.f3639x46306858.getParent() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) && (k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) k3Var.f3639x46306858.getParent();
            if (c1163xf1deaba4.getHeight() > 0) {
                int i19 = m2Var2.f93674c;
                int height = c1163xf1deaba4.getHeight();
                java.util.ArrayList arrayList = this.I;
                if (i19 >= height) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) k3Var;
                    android.view.View view = c1Var.f3639x46306858;
                    float height2 = view.getHeight();
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    view.setTranslationY(height2);
                    arrayList.add(c1Var);
                    return true;
                }
                if (m2Var2.f93673b <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) k3Var;
                    android.view.View view2 = c1Var2.f3639x46306858;
                    float f17 = -view2.getHeight();
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    view2.setTranslationY(f17);
                    arrayList.add(c1Var2);
                    return true;
                }
            }
        }
        H(k3Var);
        h(k3Var);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        if (this.f171562u) {
            return super.b(k3Var, k3Var2, m2Var, m2Var2);
        }
        h(k3Var);
        h(k3Var2);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        boolean z17 = false;
        if (!this.f171562u) {
            H(k3Var);
            y(k3Var);
            return false;
        }
        if (m2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.x1) {
            H(k3Var);
            return true;
        }
        if (m2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.y1) {
            H(k3Var);
            return true;
        }
        if ((m2Var.f93675d & 2048) > 0 && (k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) && m2Var2 == null) {
            try {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) k3Var).i().B;
            } catch (java.lang.Exception unused) {
            }
            if (!z17) {
                H(k3Var);
                this.F.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.z1((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) k3Var, m2Var.f93672a, m2Var.f93673b, null));
                return true;
            }
        }
        return super.c(k3Var, m2Var, m2Var2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        if (this.f171562u) {
            return super.d(k3Var, m2Var, m2Var2);
        }
        H(k3Var);
        x(k3Var);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.List list) {
        return (k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) || super.g(k3Var, list);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if ((k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) && this.I.remove(k3Var)) {
            android.view.View view = k3Var.f3639x46306858;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            view.setTranslationY(0.0f);
            h(k3Var);
        }
        super.j(k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean o() {
        return (this.f171565x.isEmpty() && this.f171566y.isEmpty() && this.f171567z.isEmpty() && this.A.isEmpty() && this.B.isEmpty() && this.C.isEmpty() && this.D.isEmpty() && this.E.isEmpty() && this.F.isEmpty() && this.G.isEmpty() && this.I.isEmpty() && this.f171560J.isEmpty() && this.K.isEmpty() && !super.o()) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void q(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.ViewParent parent = k3Var.f3639x46306858.getParent();
        if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc c12725xa9e084fc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc) parent;
            android.view.View view = k3Var.f3639x46306858;
            c12725xa9e084fc.getClass();
            if (view.getParent() != c12725xa9e084fc) {
                return;
            }
            view.setZ(0.0f);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 r(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        if ((i17 & 2) > 0) {
            for (java.lang.Object obj : list) {
                if (obj instanceof android.os.Bundle) {
                    java.lang.Boolean bool = (java.lang.Boolean) ((android.os.Bundle) obj).get("star");
                    if (bool != null && bool.booleanValue()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.x1(null);
                        x1Var.a(k3Var, i17);
                        return x1Var;
                    }
                    if (bool != null && !bool.booleanValue()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.y1(null);
                        y1Var.a(k3Var, i17);
                        return y1Var;
                    }
                }
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.m2();
        m2Var.a(k3Var, 0);
        m2Var.f93675d = i17;
        return m2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
        float f17;
        p(this.f171563v);
        java.util.ArrayList arrayList = this.f171565x;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                throw null;
            }
            arrayList.clear();
        }
        java.util.ArrayList arrayList2 = this.f171567z;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it6 = arrayList2.iterator();
            if (it6.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                throw null;
            }
            arrayList2.clear();
        }
        java.util.ArrayList arrayList3 = this.B;
        float f18 = 0.1f;
        float f19 = 1.0f;
        float f27 = 0.0f;
        if (!arrayList3.isEmpty()) {
            java.util.Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) it7.next();
                this.C.add(c1Var);
                android.view.View view = c1Var.f171584m;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                view.setScaleX(f18);
                android.view.View view2 = c1Var.f171584m;
                view2.setScaleY(f18);
                n3.l1.m(view2, f27);
                android.view.View view3 = c1Var.f171584m;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n3.z1 a17 = n3.l1.a(view2);
                a17.c(this.f93704f);
                a17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.r1(this, c1Var, a17));
                a17.a(1.0f);
                java.lang.ref.WeakReference weakReference = a17.f415987a;
                android.view.View view4 = (android.view.View) weakReference.get();
                if (view4 != null) {
                    view4.animate().scaleX(1.0f);
                }
                android.view.View view5 = (android.view.View) weakReference.get();
                if (view5 != null) {
                    view5.animate().scaleY(1.0f);
                }
                a17.f();
                f18 = 0.1f;
                f27 = 0.0f;
            }
            arrayList3.clear();
        }
        java.util.ArrayList arrayList5 = this.D;
        if (!arrayList5.isEmpty()) {
            java.util.Iterator it8 = arrayList5.iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) it8.next();
                this.E.add(c1Var2);
                android.view.View view6 = c1Var2.f171584m;
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                view6.setScaleX(f19);
                android.view.View view7 = c1Var2.f171584m;
                view7.setScaleY(f19);
                n3.l1.m(view7, f19);
                android.view.View view8 = c1Var2.f171584m;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n3.z1 a18 = n3.l1.a(view7);
                a18.c(this.f93704f);
                a18.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.s1(this, c1Var2));
                a18.a(0.0f);
                java.lang.ref.WeakReference weakReference2 = a18.f415987a;
                android.view.View view9 = (android.view.View) weakReference2.get();
                if (view9 != null) {
                    f17 = 0.1f;
                    view9.animate().scaleX(0.1f);
                } else {
                    f17 = 0.1f;
                }
                android.view.View view10 = (android.view.View) weakReference2.get();
                if (view10 != null) {
                    view10.animate().scaleY(f17);
                }
                a18.f();
                f19 = 1.0f;
            }
            arrayList5.clear();
        }
        java.util.ArrayList arrayList7 = this.F;
        if (!arrayList7.isEmpty()) {
            java.util.Iterator it9 = arrayList7.iterator();
            while (it9.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.z1) it9.next();
                this.G.add(z1Var.f171711a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var3 = z1Var.f171711a;
                android.view.View view11 = c1Var3.f3639x46306858;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                view11.setTranslationY(0.0f);
                n3.l1.m(view11, 1.0f);
                n3.z1 a19 = n3.l1.a(view11);
                a19.c(this.f93703e);
                a19.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.t1(this, c1Var3));
                a19.a(0.0f);
                a19.g(-view11.getHeight());
                a19.f();
            }
            arrayList7.clear();
        }
        super.s();
        java.util.ArrayList arrayList8 = this.I;
        if (arrayList8.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList9 = this.f171560J;
        arrayList9.addAll(arrayList8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.u1(this);
        arrayList8.clear();
        if (!this.L) {
            u1Var.run();
            return;
        }
        android.view.View view12 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) arrayList9.get(0)).f3639x46306858;
        long j17 = this.f93702d;
        java.util.WeakHashMap weakHashMap4 = n3.l1.f415895a;
        n3.u0.n(view12, u1Var, j17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        H(k3Var);
        h(k3Var);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18, int i19, int i27) {
        n3.l1.a(k3Var.f3639x46306858);
        n3.l1.a(k3Var2.f3639x46306858);
        h(k3Var);
        h(k3Var2);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, int i19, int i27) {
        if (this.f171562u) {
            return super.v(k3Var, i17, i18, i19, i27);
        }
        H(k3Var);
        x(k3Var);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (this.f171562u) {
            super.w(k3Var);
            return true;
        }
        H(k3Var);
        y(k3Var);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public void z(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.util.ArrayList arrayList = this.H;
        if (arrayList.contains(k3Var)) {
            arrayList.remove(k3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc c12725xa9e084fc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12725xa9e084fc) k3Var.f3639x46306858.getParent();
            android.view.View view = k3Var.f3639x46306858;
            c12725xa9e084fc.getClass();
            if (view.getParent() != c12725xa9e084fc) {
                return;
            }
            view.setZ(0.0f);
        }
    }
}
