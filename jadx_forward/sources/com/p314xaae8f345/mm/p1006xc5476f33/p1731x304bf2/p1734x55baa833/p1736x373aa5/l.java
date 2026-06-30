package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public abstract class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f220737h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f220738i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f220739j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f220740k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f220741l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f220742m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f220743n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f220744o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f220745p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f220746q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f220747r = new java.util.ArrayList();

    public l() {
        new android.view.animation.DecelerateInterpolator();
        this.f93715g = false;
    }

    public final void D(java.util.List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i17 = size - 1;
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) list.get(size)).f3639x46306858.animate().cancel();
            if (i17 < 0) {
                return;
            } else {
                size = i17;
            }
        }
    }

    public final void E() {
        if (o()) {
            return;
        }
        i();
    }

    public final void F(java.util.List list, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i17 = size - 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b) list.get(size);
            if (G(bVar, k3Var) && bVar.f220560a == null && bVar.f220561b == null) {
                list.remove(bVar);
            }
            if (i17 < 0) {
                return;
            } else {
                size = i17;
            }
        }
    }

    public final boolean G(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (bVar.f220561b == k3Var) {
            bVar.f220561b = null;
        } else {
            if (bVar.f220560a != k3Var) {
                return false;
            }
            bVar.f220560a = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        android.view.View view = k3Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.f3639x46306858.setTranslationX(0.0f);
        k3Var.f3639x46306858.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View itemView = item.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        itemView.animate().cancel();
        java.util.ArrayList arrayList = this.f220739j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i17 = size - 1;
                java.lang.Object obj = arrayList.get(size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e) obj).f220605a == item) {
                    itemView.setTranslationY(0.0f);
                    itemView.setTranslationX(0.0f);
                    x(item);
                    arrayList.remove(size);
                }
                if (i17 < 0) {
                    break;
                } else {
                    size = i17;
                }
            }
        }
        F(this.f220740k, item);
        if (this.f220737h.remove(item)) {
            android.view.View itemView2 = item.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView2);
            y(item);
        }
        if (this.f220738i.remove(item)) {
            android.view.View itemView3 = item.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView3);
            h(item);
        }
        java.util.ArrayList arrayList2 = this.f220743n;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i18 = size2 - 1;
                java.lang.Object obj2 = arrayList2.get(size2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                java.util.ArrayList arrayList3 = (java.util.ArrayList) obj2;
                F(arrayList3, item);
                if (arrayList3.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i18 < 0) {
                    break;
                } else {
                    size2 = i18;
                }
            }
        }
        java.util.ArrayList arrayList4 = this.f220742m;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i19 = size3 - 1;
                java.lang.Object obj3 = arrayList4.get(size3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                java.util.ArrayList arrayList5 = (java.util.ArrayList) obj3;
                int size4 = arrayList5.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i27 = size4 - 1;
                        java.lang.Object obj4 = arrayList5.get(size4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e) obj4).f220605a == item) {
                            itemView.setTranslationY(0.0f);
                            itemView.setTranslationX(0.0f);
                            x(item);
                            arrayList5.remove(size4);
                            if (arrayList5.isEmpty()) {
                                arrayList4.remove(size3);
                            }
                        } else if (i27 < 0) {
                            break;
                        } else {
                            size4 = i27;
                        }
                    }
                }
                if (i19 < 0) {
                    break;
                } else {
                    size3 = i19;
                }
            }
        }
        java.util.ArrayList arrayList6 = this.f220741l;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i28 = size5 - 1;
                java.lang.Object obj5 = arrayList6.get(size5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList7 = (java.util.ArrayList) obj5;
                if (arrayList7.remove(item)) {
                    android.view.View itemView4 = item.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView4, "itemView");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView4);
                    h(item);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
                if (i28 < 0) {
                    break;
                } else {
                    size5 = i28;
                }
            }
        }
        this.f220746q.remove(item);
        this.f220744o.remove(item);
        this.f220747r.remove(item);
        this.f220745p.remove(item);
        E();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void k() {
        java.lang.String str;
        java.util.ArrayList arrayList = this.f220739j;
        int i17 = -1;
        int size = arrayList.size() - 1;
        while (true) {
            str = "itemView";
            if (-1 >= size) {
                break;
            }
            java.lang.Object obj = arrayList.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e) obj;
            android.view.View itemView = eVar.f220605a.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            x(eVar.f220605a);
            arrayList.remove(size);
            size--;
        }
        java.util.ArrayList arrayList2 = this.f220737h;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            java.lang.Object obj2 = arrayList2.get(size2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            y((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj2);
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f220738i;
        for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
            java.lang.Object obj3 = arrayList3.get(size3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj3;
            android.view.View itemView2 = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView2);
            h(k3Var);
            arrayList3.remove(size3);
        }
        java.util.ArrayList arrayList4 = this.f220740k;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            java.lang.Object obj4 = arrayList4.get(size4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b) obj4;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = bVar.f220560a;
            if (k3Var2 != null) {
                G(bVar, k3Var2);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = bVar.f220561b;
            if (k3Var3 != null) {
                G(bVar, k3Var3);
            }
        }
        arrayList4.clear();
        if (o()) {
            java.util.ArrayList arrayList5 = this.f220742m;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                java.lang.Object obj5 = arrayList5.get(size5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList6 = (java.util.ArrayList) obj5;
                for (int size6 = arrayList6.size() - 1; -1 < size6; size6--) {
                    java.lang.Object obj6 = arrayList6.get(size6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj6, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e eVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e) obj6;
                    android.view.View itemView3 = eVar2.f220605a.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
                    itemView3.setTranslationY(0.0f);
                    itemView3.setTranslationX(0.0f);
                    x(eVar2.f220605a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            java.util.ArrayList arrayList7 = this.f220741l;
            int size7 = arrayList7.size() - 1;
            while (i17 < size7) {
                java.lang.Object obj7 = arrayList7.get(size7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj7, "get(...)");
                java.util.ArrayList arrayList8 = (java.util.ArrayList) obj7;
                int size8 = arrayList8.size() + i17;
                while (i17 < size8) {
                    java.lang.Object obj8 = arrayList8.get(size8);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj8, "get(...)");
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj8;
                    android.view.View view = k3Var4.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, str);
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList9.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList9);
                    java.lang.String str2 = str;
                    yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    h(k3Var4);
                    if (size8 < arrayList8.size()) {
                        arrayList8.remove(size8);
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                    size8--;
                    str = str2;
                    i17 = -1;
                }
                size7--;
                i17 = -1;
            }
            java.util.ArrayList arrayList10 = this.f220743n;
            for (int size9 = arrayList10.size() - 1; -1 < size9; size9--) {
                java.lang.Object obj9 = arrayList10.get(size9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj9, "get(...)");
                java.util.ArrayList arrayList11 = (java.util.ArrayList) obj9;
                for (int size10 = arrayList11.size() - 1; -1 < size10; size10--) {
                    java.lang.Object obj10 = arrayList11.get(size10);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj10, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b) obj10;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var5 = bVar2.f220560a;
                    if (k3Var5 != null) {
                        G(bVar2, k3Var5);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var6 = bVar2.f220561b;
                    if (k3Var6 != null) {
                        G(bVar2, k3Var6);
                    }
                    if (arrayList11.isEmpty()) {
                        arrayList10.remove(arrayList11);
                    }
                }
            }
            D(this.f220746q);
            D(this.f220745p);
            D(this.f220744o);
            D(this.f220747r);
            i();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean o() {
        return (this.f220738i.isEmpty() ^ true) || (this.f220740k.isEmpty() ^ true) || (this.f220739j.isEmpty() ^ true) || (this.f220737h.isEmpty() ^ true) || (this.f220745p.isEmpty() ^ true) || (this.f220746q.isEmpty() ^ true) || (this.f220744o.isEmpty() ^ true) || (this.f220747r.isEmpty() ^ true) || (this.f220742m.isEmpty() ^ true) || (this.f220741l.isEmpty() ^ true) || (this.f220743n.isEmpty() ^ true);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
        java.util.ArrayList arrayList = this.f220737h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f220739j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f220740k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f220738i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o1) this;
                android.view.ViewPropertyAnimator animate = k3Var.f3639x46306858.animate();
                animate.translationY((-k3Var.f3639x46306858.getHeight()) * 0.25f);
                animate.alpha(0.0f);
                animate.setDuration(o1Var.f93701c);
                animate.setInterpolator(animate.getInterpolator());
                animate.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.d(o1Var, k3Var));
                animate.setStartDelay(java.lang.Math.abs((k3Var.m8187x9323db3a() * o1Var.f93702d) / 4));
                animate.start();
                this.f220746q.add(k3Var);
                arrayList4 = arrayList4;
                z27 = z27;
            }
            java.util.ArrayList arrayList5 = arrayList4;
            boolean z28 = z27;
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList2);
                this.f220742m.add(arrayList6);
                arrayList2.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k(this, arrayList6);
                if (z17) {
                    android.view.View itemView = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e) arrayList6.get(0)).f220605a.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                    itemView.postOnAnimationDelayed(kVar, this.f93702d);
                } else {
                    kVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList(arrayList3);
                this.f220743n.add(arrayList7);
                arrayList3.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j(this, arrayList7);
                if (z17) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b) arrayList7.get(0)).f220560a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var2);
                    k3Var2.f3639x46306858.postOnAnimationDelayed(jVar, this.f93702d);
                } else {
                    jVar.run();
                }
            }
            if (z28) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList(arrayList5);
                this.f220741l.add(arrayList8);
                arrayList5.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i(this, arrayList8);
                if (!z17 && !z18 && !z19) {
                    iVar.run();
                    return;
                }
                long j17 = z17 ? this.f93702d : 0L;
                long j18 = z18 ? this.f93703e : 0L;
                long j19 = z19 ? this.f93704f : 0L;
                if (j18 < j19) {
                    j18 = j19;
                }
                android.view.View itemView2 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList8.get(0)).f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                itemView2.postOnAnimationDelayed(iVar, j17 + j18);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        j(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView);
        holder.f3639x46306858.setTranslationY((-r0.getHeight()) * 0.25f);
        android.view.View view = holder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/FadeInDownAnimator", "preAnimateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/FadeInDownAnimator", "preAnimateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f220738i.add(holder);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 oldHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 newHolder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldHolder, "oldHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newHolder, "newHolder");
        if (oldHolder == newHolder) {
            return v(oldHolder, i17, i18, i19, i27);
        }
        float translationX = oldHolder.f3639x46306858.getTranslationX();
        float translationY = oldHolder.f3639x46306858.getTranslationY();
        float alpha = oldHolder.f3639x46306858.getAlpha();
        j(oldHolder);
        int i28 = (int) ((i19 - i17) - translationX);
        int i29 = (int) ((i27 - i18) - translationY);
        oldHolder.f3639x46306858.setTranslationX(translationX);
        oldHolder.f3639x46306858.setTranslationY(translationY);
        android.view.View view = oldHolder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(alpha));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        j(newHolder);
        newHolder.f3639x46306858.setTranslationX(-i28);
        newHolder.f3639x46306858.setTranslationY(-i29);
        android.view.View view2 = newHolder.f3639x46306858;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f220740k.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b(oldHolder, newHolder, i17, i18, i19, i27));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        int translationX = i17 + ((int) holder.f3639x46306858.getTranslationX());
        int translationY = i18 + ((int) holder.f3639x46306858.getTranslationY());
        j(holder);
        int i28 = i19 - translationX;
        int i29 = i27 - translationY;
        if (i28 == 0 && i29 == 0) {
            x(holder);
            return false;
        }
        if (i28 != 0) {
            itemView.setTranslationX(-i28);
        }
        if (i29 != 0) {
            itemView.setTranslationY(-i29);
        }
        this.f220739j.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e(holder, translationX, translationY, i19, i27));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        j(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView);
        this.f220737h.add(holder);
        return true;
    }
}
