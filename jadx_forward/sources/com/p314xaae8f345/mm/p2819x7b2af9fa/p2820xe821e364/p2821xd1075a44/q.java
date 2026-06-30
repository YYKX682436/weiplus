package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes14.dex */
public class q extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b2 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f296142s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f296143h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f296144i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f296145j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f296146k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f296147l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f296148m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f296149n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f296150o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f296151p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f296152q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f296153r = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1
    public void d(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        android.view.View view = y1Var.f296236d;
        view.animate().cancel();
        java.util.ArrayList arrayList = this.f296145j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p) arrayList.get(size)).f296136a == y1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(y1Var);
                arrayList.remove(size);
            }
        }
        j(this.f296146k, y1Var);
        float f17 = 1.0f;
        if (this.f296143h.remove(y1Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c(y1Var);
        }
        if (this.f296144i.remove(y1Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c(y1Var);
        }
        java.util.ArrayList arrayList4 = this.f296149n;
        for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size2);
            j(arrayList5, y1Var);
            if (arrayList5.isEmpty()) {
                arrayList4.remove(size2);
            }
        }
        java.util.ArrayList arrayList6 = this.f296148m;
        for (int size3 = arrayList6.size() - 1; size3 >= 0; size3--) {
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size3);
            int size4 = arrayList7.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p) arrayList7.get(size4)).f296136a == y1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(y1Var);
                    arrayList7.remove(size4);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f296147l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(y1Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c(y1Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f296152q.remove(y1Var);
        this.f296150o.remove(y1Var);
        this.f296153r.remove(y1Var);
        this.f296151p.remove(y1Var);
        i();
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1
    public void e() {
        float f17;
        java.util.ArrayList arrayList = this.f296145j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p pVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p) arrayList.get(size);
            android.view.View view = pVar.f296136a.f296236d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(pVar.f296136a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f296143h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f296144i;
        int size3 = arrayList3.size() - 1;
        while (true) {
            f17 = 1.0f;
            if (size3 < 0) {
                break;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList3.get(size3);
            android.view.View view2 = y1Var.f296236d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c(y1Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f296146k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o oVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o) arrayList5.get(size4);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var2 = oVar.f296129a;
            if (y1Var2 != null) {
                k(oVar, y1Var2);
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var3 = oVar.f296130b;
            if (y1Var3 != null) {
                k(oVar, y1Var3);
            }
        }
        arrayList5.clear();
        if (f()) {
            java.util.ArrayList arrayList6 = this.f296148m;
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
                        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p pVar2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p) arrayList7.get(size6);
                        android.view.View view3 = pVar2.f296136a.f296236d;
                        view3.setTranslationY(0.0f);
                        view3.setTranslationX(0.0f);
                        c(pVar2.f296136a);
                        arrayList7.remove(size6);
                        if (arrayList7.isEmpty()) {
                            arrayList6.remove(arrayList7);
                        }
                    }
                }
            }
            java.util.ArrayList arrayList8 = this.f296147l;
            int size7 = arrayList8.size() - 1;
            while (size7 >= 0) {
                java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size7);
                int size8 = arrayList9.size() - 1;
                while (size8 >= 0) {
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var4 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList9.get(size8);
                    android.view.View view4 = y1Var4.f296236d;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList10.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(view4, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    c(y1Var4);
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
            java.util.ArrayList arrayList11 = this.f296149n;
            int size9 = arrayList11.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
                int size10 = arrayList12.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o oVar2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o) arrayList12.get(size10);
                        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var5 = oVar2.f296129a;
                        if (y1Var5 != null) {
                            k(oVar2, y1Var5);
                        }
                        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var6 = oVar2.f296130b;
                        if (y1Var6 != null) {
                            k(oVar2, y1Var6);
                        }
                        if (arrayList12.isEmpty()) {
                            arrayList11.remove(arrayList12);
                        }
                    }
                }
            }
            h(this.f296152q);
            h(this.f296151p);
            h(this.f296150o);
            h(this.f296153r);
            java.util.ArrayList arrayList13 = this.f295995b;
            if (arrayList13.size() <= 0) {
                arrayList13.clear();
            } else {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList13.get(0));
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1
    public boolean f() {
        return (this.f296144i.isEmpty() && this.f296146k.isEmpty() && this.f296145j.isEmpty() && this.f296143h.isEmpty() && this.f296151p.isEmpty() && this.f296152q.isEmpty() && this.f296150o.isEmpty() && this.f296153r.isEmpty() && this.f296148m.isEmpty() && this.f296147l.isEmpty() && this.f296149n.isEmpty()) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b2
    public boolean g(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, int i17, int i18, int i19, int i27) {
        android.view.View view = y1Var.f296236d;
        int translationX = i17 + ((int) view.getTranslationX());
        int translationY = i18 + ((int) y1Var.f296236d.getTranslationY());
        l(y1Var);
        int i28 = i19 - translationX;
        int i29 = i27 - translationY;
        if (i28 == 0 && i29 == 0) {
            c(y1Var);
            return false;
        }
        if (i28 != 0) {
            view.setTranslationX(-i28);
        }
        if (i29 != 0) {
            view.setTranslationY(-i29);
        }
        this.f296145j.add(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p(y1Var, translationX, translationY, i19, i27));
        return true;
    }

    public void h(java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) list.get(size)).f296236d.animate().cancel();
        }
    }

    public void i() {
        if (f()) {
            return;
        }
        java.util.ArrayList arrayList = this.f295995b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
            throw null;
        }
    }

    public final void j(java.util.List list, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o oVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o) list.get(size);
            if (k(oVar, y1Var) && oVar.f296129a == null && oVar.f296130b == null) {
                list.remove(oVar);
            }
        }
    }

    public final boolean k(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o oVar, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        if (oVar.f296130b == y1Var) {
            oVar.f296130b = null;
        } else {
            if (oVar.f296129a != y1Var) {
                return false;
            }
            oVar.f296129a = null;
        }
        android.view.View view = y1Var.f296236d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = y1Var.f296236d;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(y1Var);
        return true;
    }

    public final void l(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        if (f296142s == null) {
            f296142s = new android.animation.ValueAnimator().getInterpolator();
        }
        y1Var.f296236d.animate().setInterpolator(f296142s);
        d(y1Var);
    }
}
