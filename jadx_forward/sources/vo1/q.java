package vo1;

/* loaded from: classes3.dex */
public class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f520077s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.reflect.Method f520078t;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f520079h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f520080i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f520081j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f520082k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f520083l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f520084m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f520085n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f520086o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f520087p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f520088q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f520089r = new java.util.ArrayList();

    static {
        java.lang.reflect.Method declaredMethod = p012xc85e97e9.p103xe821e364.p104xd1075a44.k3.class.getDeclaredMethod("shouldIgnore", new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        f520078t = declaredMethod;
    }

    public final void D(java.util.List viewHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolders, "viewHolders");
        int size = viewHolders.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i17 = size - 1;
            java.lang.Object obj = viewHolders.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj).f3639x46306858.animate().cancel();
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
            vo1.c cVar = (vo1.c) list.get(size);
            if (G(cVar, k3Var) && cVar.f520031a == null && cVar.f520032b == null) {
                list.remove(cVar);
            }
            if (i17 < 0) {
                return;
            } else {
                size = i17;
            }
        }
    }

    public final boolean G(vo1.c cVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (cVar.f520032b == k3Var) {
            cVar.f520032b = null;
        } else {
            if (cVar.f520031a != k3Var) {
                return false;
            }
            cVar.f520031a = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        android.view.View view = k3Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.f3639x46306858.setTranslationX(0.0f);
        k3Var.f3639x46306858.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public final void H(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (f520077s == null) {
            f520077s = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.f3639x46306858.animate().setInterpolator(f520077s);
        j(k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 oldHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 newHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 preInfo, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 postInfo) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldHolder, "oldHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newHolder, "newHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preInfo, "preInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        int i19 = preInfo.f93672a;
        int i27 = preInfo.f93673b;
        java.lang.Object invoke = f520078t.invoke(newHolder, new java.lang.Object[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) invoke).booleanValue()) {
            i17 = preInfo.f93672a;
            i18 = preInfo.f93673b;
        } else {
            i17 = postInfo.f93672a;
            i18 = postInfo.f93673b;
        }
        int i28 = i17;
        int i29 = i18;
        int i37 = preInfo.f93674c - preInfo.f93673b;
        int i38 = postInfo.f93674c - postInfo.f93673b;
        float translationX = oldHolder.f3639x46306858.getTranslationX();
        float translationY = oldHolder.f3639x46306858.getTranslationY();
        int i39 = (int) ((i28 - i19) - translationX);
        int i47 = (int) ((i29 - i27) - translationY);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oldHolder, newHolder)) {
            return v(oldHolder, i19, i27, i28, i29);
        }
        jz5.l lVar = i37 == i38 ? null : new jz5.l(java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
        H(oldHolder);
        oldHolder.f3639x46306858.setTranslationX(translationX);
        oldHolder.f3639x46306858.setTranslationY(translationY);
        H(newHolder);
        android.view.View view = newHolder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        newHolder.f3639x46306858.setTranslationX(-i39);
        newHolder.f3639x46306858.setTranslationY(-i47);
        this.f520082k.add(new vo1.c(oldHolder, newHolder, i19, i27, i28, i29, lVar));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        return !payloads.isEmpty() || f(viewHolder);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View itemView = item.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        itemView.animate().cancel();
        java.util.ArrayList arrayList = this.f520081j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i17 = size - 1;
                java.lang.Object obj = arrayList.get(size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if (((vo1.d) obj).f520038a == item) {
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
        F(this.f520082k, item);
        float f17 = 1.0f;
        if (this.f520079h.remove(item)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            itemView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y(item);
        }
        if (this.f520080i.remove(item)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(itemView, arrayList3.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            itemView.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(item);
        }
        java.util.ArrayList arrayList4 = this.f520085n;
        int size2 = arrayList4.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i18 = size2 - 1;
                java.lang.Object obj2 = arrayList4.get(size2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                java.util.ArrayList arrayList5 = (java.util.ArrayList) obj2;
                F(arrayList5, item);
                if (arrayList5.isEmpty()) {
                    arrayList4.remove(size2);
                }
                if (i18 < 0) {
                    break;
                } else {
                    size2 = i18;
                }
            }
        }
        java.util.ArrayList arrayList6 = this.f520084m;
        int size3 = arrayList6.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i19 = size3 - 1;
                java.lang.Object obj3 = arrayList6.get(size3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                java.util.ArrayList arrayList7 = (java.util.ArrayList) obj3;
                int size4 = arrayList7.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i27 = size4 - 1;
                        java.lang.Object obj4 = arrayList7.get(size4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                        if (((vo1.d) obj4).f520038a == item) {
                            itemView.setTranslationY(0.0f);
                            itemView.setTranslationX(0.0f);
                            x(item);
                            arrayList7.remove(size4);
                            if (arrayList7.isEmpty()) {
                                arrayList6.remove(size3);
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
        java.util.ArrayList arrayList8 = this.f520083l;
        int size5 = arrayList8.size() - 1;
        if (size5 >= 0) {
            int i28 = size5;
            while (true) {
                int i29 = i28 - 1;
                java.lang.Object obj5 = arrayList8.get(i28);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList9 = (java.util.ArrayList) obj5;
                if (arrayList9.remove(item)) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList10.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(itemView, arrayList10.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    itemView.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    h(item);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(i28);
                    }
                }
                if (i29 < 0) {
                    break;
                }
                i28 = i29;
                f17 = 1.0f;
            }
        }
        this.f520088q.remove(item);
        this.f520086o.remove(item);
        this.f520089r.remove(item);
        this.f520087p.remove(item);
        E();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f520081j;
        int i17 = -1;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            java.lang.Object obj = arrayList.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            vo1.d dVar = (vo1.d) obj;
            android.view.View itemView = dVar.f520038a.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            x(dVar.f520038a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f520079h;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            java.lang.Object obj2 = arrayList2.get(size2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            y((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj2);
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f520080i;
        int size3 = arrayList3.size() - 1;
        while (true) {
            f17 = 1.0f;
            if (-1 >= size3) {
                break;
            }
            java.lang.Object obj3 = arrayList3.get(size3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj3;
            android.view.View view = k3Var.f3639x46306858;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f520082k;
        for (int size4 = arrayList5.size() - 1; -1 < size4; size4--) {
            java.lang.Object obj4 = arrayList5.get(size4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
            vo1.c cVar = (vo1.c) obj4;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = cVar.f520031a;
            if (k3Var2 != null) {
                G(cVar, k3Var2);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = cVar.f520032b;
            if (k3Var3 != null) {
                G(cVar, k3Var3);
            }
        }
        arrayList5.clear();
        if (o()) {
            java.util.ArrayList arrayList6 = this.f520084m;
            for (int size5 = arrayList6.size() - 1; -1 < size5; size5--) {
                java.lang.Object obj5 = arrayList6.get(size5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList7 = (java.util.ArrayList) obj5;
                for (int size6 = arrayList7.size() - 1; -1 < size6; size6--) {
                    java.lang.Object obj6 = arrayList7.get(size6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj6, "get(...)");
                    vo1.d dVar2 = (vo1.d) obj6;
                    android.view.View itemView2 = dVar2.f520038a.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                    itemView2.setTranslationY(0.0f);
                    itemView2.setTranslationX(0.0f);
                    x(dVar2.f520038a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
            java.util.ArrayList arrayList8 = this.f520083l;
            int size7 = arrayList8.size() - 1;
            while (i17 < size7) {
                java.lang.Object obj7 = arrayList8.get(size7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj7, "get(...)");
                java.util.ArrayList arrayList9 = (java.util.ArrayList) obj7;
                int size8 = arrayList9.size() + i17;
                while (i17 < size8) {
                    java.lang.Object obj8 = arrayList9.get(size8);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj8, "get(...)");
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj8;
                    android.view.View itemView3 = k3Var4.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList10.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(itemView3, arrayList10.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    itemView3.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(itemView3, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    h(k3Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(arrayList9);
                    }
                    size8--;
                    i17 = -1;
                    f17 = 1.0f;
                }
                size7--;
                i17 = -1;
                f17 = 1.0f;
            }
            java.util.ArrayList arrayList11 = this.f520085n;
            for (int size9 = arrayList11.size() - 1; -1 < size9; size9--) {
                java.lang.Object obj9 = arrayList11.get(size9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj9, "get(...)");
                java.util.ArrayList arrayList12 = (java.util.ArrayList) obj9;
                for (int size10 = arrayList12.size() - 1; -1 < size10; size10--) {
                    java.lang.Object obj10 = arrayList12.get(size10);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj10, "get(...)");
                    vo1.c cVar2 = (vo1.c) obj10;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var5 = cVar2.f520031a;
                    if (k3Var5 != null) {
                        G(cVar2, k3Var5);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var6 = cVar2.f520032b;
                    if (k3Var6 != null) {
                        G(cVar2, k3Var6);
                    }
                    if (arrayList12.isEmpty()) {
                        arrayList11.remove(arrayList12);
                    }
                }
            }
            D(this.f520088q);
            D(this.f520087p);
            D(this.f520086o);
            D(this.f520089r);
            i();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean o() {
        return (this.f520080i.isEmpty() && this.f520082k.isEmpty() && this.f520081j.isEmpty() && this.f520079h.isEmpty() && this.f520087p.isEmpty() && this.f520088q.isEmpty() && this.f520086o.isEmpty() && this.f520089r.isEmpty() && this.f520084m.isEmpty() && this.f520083l.isEmpty() && this.f520085n.isEmpty()) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
        java.util.ArrayList arrayList = this.f520079h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f520081j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f520082k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f520080i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) next;
                android.view.View itemView = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                android.view.ViewPropertyAnimator animate = itemView.animate();
                this.f520088q.add(k3Var);
                animate.setDuration(this.f93702d).alpha(0.0f).setListener(new vo1.m(this, k3Var, animate, itemView)).start();
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f520084m.add(arrayList5);
                arrayList2.clear();
                vo1.p pVar = new vo1.p(arrayList5, this);
                if (z17) {
                    android.view.View itemView2 = ((vo1.d) arrayList5.get(0)).f520038a.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                    long j17 = this.f93702d;
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.n(itemView2, pVar, j17);
                } else {
                    pVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f520085n.add(arrayList6);
                arrayList3.clear();
                vo1.o oVar = new vo1.o(arrayList6, this);
                if (z17) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = ((vo1.c) arrayList6.get(0)).f520031a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var2);
                    android.view.View view = k3Var2.f3639x46306858;
                    long j18 = this.f93702d;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    n3.u0.n(view, oVar, j18);
                } else {
                    oVar.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f520083l.add(arrayList7);
                arrayList4.clear();
                vo1.n nVar = new vo1.n(arrayList7, this);
                if (!z17 && !z18 && !z19) {
                    nVar.run();
                    return;
                }
                long max = (long) ((z17 ? this.f93702d : 0L) + java.lang.Math.max(z18 ? this.f93703e : 0L, z19 ? this.f93704f : 0L));
                android.view.View itemView3 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList7.get(0)).f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
                java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                n3.u0.n(itemView3, nVar, max);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        H(holder);
        android.view.View view = holder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f520080i.add(holder);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 oldHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 newHolder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldHolder, "oldHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newHolder, "newHolder");
        throw new java.lang.IllegalAccessError();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        int translationX = i17 + ((int) holder.f3639x46306858.getTranslationX());
        int translationY = i18 + ((int) holder.f3639x46306858.getTranslationY());
        H(holder);
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
        this.f520081j.add(new vo1.d(holder, translationX, translationY, i19, i27));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        H(holder);
        this.f520079h.add(holder);
        return true;
    }
}
