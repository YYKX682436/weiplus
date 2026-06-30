package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f93829s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f93830h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f93831i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f93832j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f93833k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f93834l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f93835m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f93836n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f93837o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f93838p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f93839q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f93840r = new java.util.ArrayList();

    public void D(java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) list.get(size)).f3639x46306858.animate().cancel();
        }
    }

    public void E() {
        if (o()) {
            return;
        }
        i();
    }

    public final void F(java.util.List list, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.x) list.get(size);
            if (G(xVar, k3Var) && xVar.f93795a == null && xVar.f93796b == null) {
                list.remove(xVar);
            }
        }
    }

    public final boolean G(p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (xVar.f93796b == k3Var) {
            xVar.f93796b = null;
        } else {
            if (xVar.f93795a != k3Var) {
                return false;
            }
            xVar.f93795a = null;
        }
        android.view.View view = k3Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Landroidx/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Landroidx/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.f3639x46306858.setTranslationX(0.0f);
        k3Var.f3639x46306858.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public final void H(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (f93829s == null) {
            f93829s = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.f3639x46306858.animate().setInterpolator(f93829s);
        j(k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.List list) {
        return !list.isEmpty() || f(k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view = k3Var.f3639x46306858;
        view.animate().cancel();
        java.util.ArrayList arrayList = this.f93832j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.y) arrayList.get(size)).f93815a == k3Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                x(k3Var);
                arrayList.remove(size);
            }
        }
        F(this.f93833k, k3Var);
        float f17 = 1.0f;
        if (this.f93830h.remove(k3Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y(k3Var);
        }
        if (this.f93831i.remove(k3Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
        }
        java.util.ArrayList arrayList4 = this.f93836n;
        int size2 = arrayList4.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size2);
            F(arrayList5, k3Var);
            if (arrayList5.isEmpty()) {
                arrayList4.remove(size2);
            }
        }
        java.util.ArrayList arrayList6 = this.f93835m;
        int size3 = arrayList6.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size3);
            int size4 = arrayList7.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.y) arrayList7.get(size4)).f93815a == k3Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    x(k3Var);
                    arrayList7.remove(size4);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size3);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f93834l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(k3Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f93839q.remove(k3Var);
        this.f93837o.remove(k3Var);
        this.f93840r.remove(k3Var);
        this.f93838p.remove(k3Var);
        E();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f93832j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.y yVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.y) arrayList.get(size);
            android.view.View view = yVar.f93815a.f3639x46306858;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(yVar.f93815a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f93830h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            y((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f93831i;
        int size3 = arrayList3.size() - 1;
        while (true) {
            f17 = 1.0f;
            if (size3 < 0) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList3.get(size3);
            android.view.View view2 = k3Var.f3639x46306858;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f93833k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.x) arrayList5.get(size4);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = xVar.f93795a;
            if (k3Var2 != null) {
                G(xVar, k3Var2);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = xVar.f93796b;
            if (k3Var3 != null) {
                G(xVar, k3Var3);
            }
        }
        arrayList5.clear();
        if (!o()) {
            return;
        }
        java.util.ArrayList arrayList6 = this.f93835m;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size5);
            int size6 = arrayList7.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.y yVar2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.y) arrayList7.get(size6);
                    android.view.View view3 = yVar2.f93815a.f3639x46306858;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    x(yVar2.f93815a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f93834l;
        int size7 = arrayList8.size() - 1;
        while (size7 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size7);
            int size8 = arrayList9.size() - 1;
            while (size8 >= 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList9.get(size8);
                android.view.View view4 = k3Var4.f3639x46306858;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view4, arrayList10.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view4, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
                size8--;
                f17 = 1.0f;
            }
            size7--;
            f17 = 1.0f;
        }
        java.util.ArrayList arrayList11 = this.f93836n;
        int size9 = arrayList11.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                D(this.f93839q);
                D(this.f93838p);
                D(this.f93837o);
                D(this.f93840r);
                i();
                return;
            }
            java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
            int size10 = arrayList12.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.x) arrayList12.get(size10);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var5 = xVar2.f93795a;
                    if (k3Var5 != null) {
                        G(xVar2, k3Var5);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var6 = xVar2.f93796b;
                    if (k3Var6 != null) {
                        G(xVar2, k3Var6);
                    }
                    if (arrayList12.isEmpty()) {
                        arrayList11.remove(arrayList12);
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean o() {
        return (this.f93831i.isEmpty() && this.f93833k.isEmpty() && this.f93832j.isEmpty() && this.f93830h.isEmpty() && this.f93838p.isEmpty() && this.f93839q.isEmpty() && this.f93837o.isEmpty() && this.f93840r.isEmpty() && this.f93835m.isEmpty() && this.f93834l.isEmpty() && this.f93836n.isEmpty()) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
        java.util.ArrayList arrayList = this.f93830h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f93832j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f93833k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f93831i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                android.view.View view = k3Var.f3639x46306858;
                android.view.ViewPropertyAnimator animate = view.animate();
                this.f93839q.add(k3Var);
                animate.setDuration(this.f93702d).alpha(0.0f).setListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.s(this, k3Var, animate, view)).start();
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f93835m.add(arrayList5);
                arrayList2.clear();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.p pVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.p(this, arrayList5);
                if (z17) {
                    android.view.View view2 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.y) arrayList5.get(0)).f93815a.f3639x46306858;
                    long j17 = this.f93702d;
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.n(view2, pVar, j17);
                } else {
                    pVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f93836n.add(arrayList6);
                arrayList3.clear();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.q qVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.q(this, arrayList6);
                if (z17) {
                    android.view.View view3 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.x) arrayList6.get(0)).f93795a.f3639x46306858;
                    long j18 = this.f93702d;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    n3.u0.n(view3, qVar, j18);
                } else {
                    qVar.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f93834l.add(arrayList7);
                arrayList4.clear();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.r rVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.r(this, arrayList7);
                if (!z17 && !z18 && !z19) {
                    rVar.run();
                    return;
                }
                long max = (z17 ? this.f93702d : 0L) + java.lang.Math.max(z18 ? this.f93703e : 0L, z19 ? this.f93704f : 0L);
                android.view.View view4 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList7.get(0)).f3639x46306858;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                n3.u0.n(view4, rVar, max);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        H(k3Var);
        android.view.View view = k3Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f93831i.add(k3Var);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18, int i19, int i27) {
        if (k3Var == k3Var2) {
            return v(k3Var, i17, i18, i19, i27);
        }
        float translationX = k3Var.f3639x46306858.getTranslationX();
        float translationY = k3Var.f3639x46306858.getTranslationY();
        float alpha = k3Var.f3639x46306858.getAlpha();
        H(k3Var);
        int i28 = (int) ((i19 - i17) - translationX);
        int i29 = (int) ((i27 - i18) - translationY);
        k3Var.f3639x46306858.setTranslationX(translationX);
        k3Var.f3639x46306858.setTranslationY(translationY);
        android.view.View view = k3Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(alpha));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (k3Var2 != null) {
            H(k3Var2);
            k3Var2.f3639x46306858.setTranslationX(-i28);
            k3Var2.f3639x46306858.setTranslationY(-i29);
            android.view.View view2 = k3Var2.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f93833k.add(new p012xc85e97e9.p103xe821e364.p104xd1075a44.x(k3Var, k3Var2, i17, i18, i19, i27));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, int i19, int i27) {
        android.view.View view = k3Var.f3639x46306858;
        int translationX = i17 + ((int) view.getTranslationX());
        int translationY = i18 + ((int) k3Var.f3639x46306858.getTranslationY());
        H(k3Var);
        int i28 = i19 - translationX;
        int i29 = i27 - translationY;
        if (i28 == 0 && i29 == 0) {
            x(k3Var);
            return false;
        }
        if (i28 != 0) {
            view.setTranslationX(-i28);
        }
        if (i29 != 0) {
            view.setTranslationY(-i29);
        }
        this.f93832j.add(new p012xc85e97e9.p103xe821e364.p104xd1075a44.y(k3Var, translationX, translationY, i19, i27));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        H(k3Var);
        this.f93830h.add(k3Var);
        return true;
    }
}
