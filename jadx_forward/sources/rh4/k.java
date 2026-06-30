package rh4;

/* loaded from: classes3.dex */
public class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f477280s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f477281h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f477282i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f477283j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f477284k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f477285l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f477286m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f477287n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f477288o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f477289p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f477290q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f477291r = new java.util.ArrayList();

    public k() {
        this.f93701c = 400L;
        this.f93704f = 400L;
        this.f93703e = 400L;
        this.f93702d = 400L;
    }

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
            rh4.i iVar = (rh4.i) list.get(size);
            if (G(iVar, k3Var) && iVar.f477268a == null && iVar.f477269b == null) {
                list.remove(iVar);
            }
        }
    }

    public final boolean G(rh4.i iVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (iVar.f477269b == k3Var) {
            iVar.f477269b = null;
        } else {
            if (iVar.f477268a != k3Var) {
                return false;
            }
            iVar.f477268a = null;
        }
        android.view.View view = k3Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.f3639x46306858.setTranslationX(0.0f);
        k3Var.f3639x46306858.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public final void H(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (f477280s == null) {
            f477280s = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.f3639x46306858.animate().setInterpolator(f477280s);
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
        java.util.ArrayList arrayList = this.f477283j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((rh4.j) arrayList.get(size)).f477275a == k3Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                x(k3Var);
                arrayList.remove(size);
            }
        }
        F(this.f477284k, k3Var);
        float f17 = 1.0f;
        if (this.f477281h.remove(k3Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y(k3Var);
        }
        if (this.f477282i.remove(k3Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
        }
        java.util.ArrayList arrayList4 = this.f477287n;
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
        java.util.ArrayList arrayList6 = this.f477286m;
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
                if (((rh4.j) arrayList7.get(size4)).f477275a == k3Var) {
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
        java.util.ArrayList arrayList8 = this.f477285l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(k3Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f477290q.remove(k3Var);
        this.f477288o.remove(k3Var);
        this.f477291r.remove(k3Var);
        this.f477289p.remove(k3Var);
        E();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f477283j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            rh4.j jVar = (rh4.j) arrayList.get(size);
            android.view.View view = jVar.f477275a.f3639x46306858;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(jVar.f477275a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f477281h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            y((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f477282i;
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
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f477284k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            rh4.i iVar = (rh4.i) arrayList5.get(size4);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = iVar.f477268a;
            if (k3Var2 != null) {
                G(iVar, k3Var2);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = iVar.f477269b;
            if (k3Var3 != null) {
                G(iVar, k3Var3);
            }
        }
        arrayList5.clear();
        if (!o()) {
            return;
        }
        java.util.ArrayList arrayList6 = this.f477286m;
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
                    rh4.j jVar2 = (rh4.j) arrayList7.get(size6);
                    android.view.View view3 = jVar2.f477275a.f3639x46306858;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    x(jVar2.f477275a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f477285l;
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
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
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
        java.util.ArrayList arrayList11 = this.f477287n;
        int size9 = arrayList11.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                D(this.f477290q);
                D(this.f477289p);
                D(this.f477288o);
                D(this.f477291r);
                i();
                return;
            }
            java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
            int size10 = arrayList12.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    rh4.i iVar2 = (rh4.i) arrayList12.get(size10);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var5 = iVar2.f477268a;
                    if (k3Var5 != null) {
                        G(iVar2, k3Var5);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var6 = iVar2.f477269b;
                    if (k3Var6 != null) {
                        G(iVar2, k3Var6);
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
        return (this.f477282i.isEmpty() && this.f477284k.isEmpty() && this.f477283j.isEmpty() && this.f477281h.isEmpty() && this.f477289p.isEmpty() && this.f477290q.isEmpty() && this.f477288o.isEmpty() && this.f477291r.isEmpty() && this.f477286m.isEmpty() && this.f477285l.isEmpty() && this.f477287n.isEmpty()) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
        java.util.ArrayList arrayList = this.f477281h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f477283j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f477284k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f477282i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                android.view.View view = k3Var.f3639x46306858;
                android.view.ViewPropertyAnimator animate = view.animate();
                this.f477290q.add(k3Var);
                animate.setDuration(this.f93702d).alpha(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator()).setListener(new rh4.d(this, k3Var, animate, view)).start();
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f477286m.add(arrayList5);
                arrayList2.clear();
                rh4.a aVar = new rh4.a(this, arrayList5);
                if (z17) {
                    android.view.View view2 = ((rh4.j) arrayList5.get(0)).f477275a.f3639x46306858;
                    long j17 = this.f93702d;
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.n(view2, aVar, j17);
                } else {
                    aVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f477287n.add(arrayList6);
                arrayList3.clear();
                rh4.b bVar = new rh4.b(this, arrayList6);
                if (z17) {
                    android.view.View view3 = ((rh4.i) arrayList6.get(0)).f477268a.f3639x46306858;
                    long j18 = this.f93702d;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    n3.u0.n(view3, bVar, j18);
                } else {
                    bVar.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f477285l.add(arrayList7);
                arrayList4.clear();
                rh4.c cVar = new rh4.c(this, arrayList7);
                if (!z17 && !z18 && !z19) {
                    cVar.run();
                    return;
                }
                long max = (z17 ? this.f93702d : 0L) + java.lang.Math.max(z18 ? this.f93703e : 0L, z19 ? this.f93704f : 0L);
                android.view.View view4 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList7.get(0)).f3639x46306858;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                n3.u0.n(view4, cVar, max);
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f477282i.add(k3Var);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionWeAppItemAnimator", "animateChange lastPos: %d", java.lang.Integer.valueOf(k3Var.m8183xf806b362()));
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (k3Var2 != null) {
            H(k3Var2);
            k3Var2.f3639x46306858.setTranslationX(-i28);
            k3Var2.f3639x46306858.setTranslationY(-i29);
            android.view.View view2 = k3Var2.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f477284k.add(new rh4.i(k3Var, k3Var2, i17, i18, i19, i27));
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
        this.f477283j.add(new rh4.j(k3Var, translationX, translationY, i19, i27));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionWeAppItemAnimator", "animateRemove %d", java.lang.Integer.valueOf(k3Var.m8183xf806b362()));
        H(k3Var);
        this.f477281h.add(k3Var);
        return true;
    }
}
