package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class e2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f284444h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e1 f284445i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedHashMap f284446j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f284447k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedHashMap f284448l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.z2 f284449m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f284450n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f284451o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f284452p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f284453q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f284454r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f284455s;

    /* renamed from: t, reason: collision with root package name */
    public final int f284456t;

    /* renamed from: u, reason: collision with root package name */
    public final int f284457u;

    /* renamed from: v, reason: collision with root package name */
    public int f284458v;

    /* renamed from: w, reason: collision with root package name */
    public int f284459w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f284460x;

    public e2(java.lang.String focusGroupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusGroupId, "focusGroupId");
        this.f284444h = focusGroupId;
        this.f93715g = false;
        this.f284446j = new java.util.LinkedHashMap();
        this.f284447k = new java.util.HashMap();
        this.f284448l = new java.util.LinkedHashMap();
        this.f284449m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.z2();
        this.f284450n = new java.util.ArrayList();
        this.f284451o = new java.util.HashMap();
        this.f284452p = new java.util.HashMap();
        this.f284453q = new java.util.HashMap();
        this.f284454r = new java.util.HashSet();
        this.f284455s = new java.util.HashSet();
        this.f284456t = 5;
        this.f284457u = 5;
    }

    public static final void D(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, yz5.a aVar) {
        int i17 = f0Var.f391649d - 1;
        f0Var.f391649d = i17;
        if (i17 <= 0) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            e2Var.f284452p.remove(k3Var);
            e2Var.f284453q.remove(k3Var);
            e2Var.f284454r.remove(k3Var);
            if (!e2Var.f284455s.contains(k3Var) && (view.getParent() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4)) {
                aVar.mo152xb9724478();
            }
            e2Var.J();
        }
    }

    public final boolean E(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, int i19, int i27, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var;
        int i28;
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        n3.l1.a(itemView).b();
        java.util.HashMap hashMap = this.f284452p;
        u3.u uVar = (u3.u) hashMap.remove(k3Var);
        if (uVar != null) {
            uVar.b();
        }
        java.util.HashMap hashMap2 = this.f284453q;
        u3.u uVar2 = (u3.u) hashMap2.remove(k3Var);
        if (uVar2 != null) {
            uVar2.b();
        }
        int i29 = i17 - i19;
        int i37 = i18 - i27;
        if (i29 == 0 && i37 == 0) {
            aVar2.mo152xb9724478();
            J();
            return false;
        }
        if (i29 != 0) {
            itemView.setTranslationX(i29);
        }
        if (i37 != 0) {
            itemView.setTranslationY(i37);
        }
        aVar.mo152xb9724478();
        this.f284454r.add(k3Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        if (i29 != 0) {
            f0Var2.f391649d++;
        }
        if (i37 != 0) {
            f0Var2.f391649d++;
        }
        if (i29 != 0) {
            f0Var = f0Var2;
            i28 = i37;
            u3.u a17 = pa5.j.a(i29, 0, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.l1(itemView), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.m1(f0Var2, itemView, this, k3Var, aVar2), 0.0f, 0.0f, 0.0f, 112, null);
            hashMap.put(k3Var, a17);
            a17.e();
        } else {
            f0Var = f0Var2;
            i28 = i37;
        }
        if (i28 != 0) {
            u3.u a18 = pa5.j.a(i28, 0, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.n1(itemView), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.o1(f0Var, itemView, this, k3Var, aVar2), 0.0f, 0.0f, 0.0f, 112, null);
            hashMap2.put(k3Var, a18);
            a18.e();
        }
        return true;
    }

    public final void F(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, qd5.b bVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f443435a, this.f284444h)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 f17 = this.f284449m.f(c1163xf1deaba4, bVar.f443437c, i65.a.h(c1163xf1deaba4.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
            if (f17 == null) {
                return;
            }
            java.util.HashMap hashMap = this.f284447k;
            java.lang.String str = bVar.f443436b;
            hashMap.put(str, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d1(str, f17));
        }
    }

    public final void G(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, qd5.b bVar) {
        jz5.l lVar;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f443435a, this.f284444h) && (lVar = bVar.f443437c) != null) {
            android.view.View view = (android.view.View) lVar.f384366d;
            this.f284446j.put(bVar.f443436b, lVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectExpandedTargetForExpand", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/ExpandedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectExpandedTargetForExpand", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/ExpandedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.p1(this, bVar, view));
        }
    }

    public final void H(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, qd5.g gVar) {
        java.util.Map map;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f443441a, this.f284444h) && (map = gVar.f443442b) != null) {
            java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : entrySet) {
                java.lang.String str = (java.lang.String) entry.getKey();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 f17 = this.f284449m.f(c1163xf1deaba4, (jz5.l) entry.getValue(), i65.a.h(c1163xf1deaba4.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d1 d1Var = f17 == null ? null : new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d1(str, f17);
                if (d1Var != null) {
                    arrayList.add(d1Var);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            java.util.List F0 = kz5.n0.F0(arrayList, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q1());
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                linkedHashMap.put((java.lang.String) entry2.getKey(), ((jz5.l) entry2.getValue()).f384366d);
            }
            this.f284445i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e1(F0, linkedHashMap);
        }
    }

    public final void I(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, qd5.g gVar) {
        java.util.Map map;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f443441a, this.f284444h) && (map = gVar.f443442b) != null) {
            java.util.LinkedHashMap linkedHashMap = this.f284448l;
            linkedHashMap.clear();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                android.view.View view = (android.view.View) ((jz5.l) entry.getValue()).f384366d;
                linkedHashMap.put(str, view);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectFoldedTargetsForCollapse", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/FoldedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectFoldedTargetsForCollapse", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/FoldedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r1(this));
        }
    }

    public final void J() {
        if (o()) {
            return;
        }
        i();
        yz5.a aVar = this.f284460x;
        this.f284460x = null;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        if (this.f284449m.e(this.f284444h) || this.f284447k.isEmpty() || this.f284448l.isEmpty()) {
            return;
        }
        n3.m0.a(c1163xf1deaba4, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.s1(c1163xf1deaba4, this, c1163xf1deaba4));
    }

    public final void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        if (this.f284449m.e(this.f284444h) || this.f284446j.isEmpty()) {
            return;
        }
        n3.m0.a(c1163xf1deaba4, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t1(c1163xf1deaba4, this, c1163xf1deaba4));
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 M(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.ViewParent parent = k3Var.f3639x46306858.getParent();
        if (parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent;
        }
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View itemView = item.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        boolean z17 = !(itemView.getParent() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4);
        java.util.HashMap hashMap = this.f284451o;
        android.animation.Animator animator = (android.animation.Animator) hashMap.get(item);
        if (z17 || animator != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[endAnimation] suppressMove=");
            sb6.append(z17);
            sb6.append(" hasAddAnim=");
            sb6.append(animator != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaGroupFoldItemAnimator", sb6.toString());
        }
        java.util.HashSet hashSet = this.f284455s;
        if (z17) {
            hashSet.add(item);
        }
        n3.l1.a(itemView).b();
        u3.u uVar = (u3.u) this.f284452p.remove(item);
        if (uVar != null) {
            uVar.b();
        }
        u3.u uVar2 = (u3.u) this.f284453q.remove(item);
        if (uVar2 != null) {
            uVar2.b();
        }
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
            ((java.util.ArrayList) this.f284450n).remove(animator);
            hashMap.remove(item);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            itemView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(itemView, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(item);
        }
        itemView.setTranslationX(0.0f);
        itemView.setTranslationY(0.0f);
        this.f284454r.remove(item);
        if (z17) {
            hashSet.remove(item);
        }
        J();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void k() {
        float f17;
        java.util.HashMap hashMap = this.f284449m.f284703a;
        java.util.Collection values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.List S0 = kz5.n0.S0(values);
        hashMap.clear();
        java.util.Iterator it = S0.iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2) it.next()).f284642a.iterator();
            while (it6.hasNext()) {
                ((u3.s) it6.next()).b();
            }
        }
        java.util.List list = this.f284450n;
        java.util.Iterator it7 = kz5.n0.S0(list).iterator();
        while (it7.hasNext()) {
            ((android.animation.Animator) it7.next()).cancel();
        }
        ((java.util.ArrayList) list).clear();
        java.util.HashSet hashSet = this.f284455s;
        java.util.HashSet hashSet2 = this.f284454r;
        hashSet.addAll(hashSet2);
        java.util.HashMap hashMap2 = this.f284452p;
        java.util.Collection values2 = hashMap2.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        java.util.Iterator it8 = kz5.n0.S0(values2).iterator();
        while (it8.hasNext()) {
            ((u3.u) it8.next()).b();
        }
        java.util.HashMap hashMap3 = this.f284453q;
        java.util.Collection values3 = hashMap3.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values3, "<get-values>(...)");
        java.util.Iterator it9 = kz5.n0.S0(values3).iterator();
        while (it9.hasNext()) {
            ((u3.u) it9.next()).b();
        }
        hashMap2.clear();
        hashMap3.clear();
        java.util.Iterator it10 = hashSet2.iterator();
        while (it10.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it10.next();
            k3Var.f3639x46306858.setTranslationX(0.0f);
            k3Var.f3639x46306858.setTranslationY(0.0f);
        }
        hashSet2.clear();
        hashSet.clear();
        java.util.LinkedHashMap linkedHashMap = this.f284446j;
        java.util.Collection values4 = linkedHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values4, "<get-values>(...)");
        java.util.Iterator it11 = values4.iterator();
        while (true) {
            f17 = 1.0f;
            if (!it11.hasNext()) {
                break;
            }
            android.view.View view = (android.view.View) ((jz5.l) it11.next()).f384366d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.util.LinkedHashMap linkedHashMap2 = this.f284448l;
        java.util.Collection<android.view.View> values5 = linkedHashMap2.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values5, "<get-values>(...)");
        for (android.view.View view2 : values5) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            f17 = 1.0f;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e1 e1Var = this.f284445i;
        if (e1Var != null) {
            java.util.Collection<android.view.View> values6 = e1Var.f284443b.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values6, "<get-values>(...)");
            for (android.view.View view3 : values6) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        this.f284445i = null;
        linkedHashMap.clear();
        this.f284447k.clear();
        linkedHashMap2.clear();
        i();
        yz5.a aVar = this.f284460x;
        this.f284460x = null;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean o() {
        return (this.f284449m.f284703a.isEmpty() ^ true) || (this.f284450n.isEmpty() ^ true) || (this.f284454r.isEmpty() ^ true);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 M = M(holder);
        qd5.g b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.b(holder);
        qd5.b a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.a(holder);
        java.lang.String str = this.f284444h;
        if (!((b17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.f443441a, str)) || (a17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f443435a, str)))) {
            h(holder);
            return false;
        }
        if (M != null) {
            if (a17 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f443435a, str)) {
                    a17 = null;
                }
                if (a17 != null) {
                    G(M, a17);
                    L(M);
                    int i17 = this.f284458v + 1;
                    this.f284458v = i17;
                    int i18 = this.f284456t;
                    if (i18 > 0) {
                        M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v1(i17, this, M, i18));
                    }
                }
            }
            if (b17 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.f443441a, str)) {
                    b17 = null;
                }
                if (b17 != null) {
                    I(M, b17);
                    K(M);
                    int i19 = this.f284459w + 1;
                    this.f284459w = i19;
                    int i27 = this.f284457u;
                    if (i27 > 0) {
                        M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u1(i19, this, M, i27));
                    }
                }
            }
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.0f);
        ofFloat.setDuration(180L);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.f1(itemView));
        ofFloat.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g1(this, holder, itemView));
        ((java.util.ArrayList) this.f284450n).add(ofFloat);
        this.f284451o.put(holder, ofFloat);
        ofFloat.start();
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 oldHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 newHolder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldHolder, "oldHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newHolder, "newHolder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 M = M(oldHolder);
        if (M == null) {
            M = M(newHolder);
        }
        if (M != null) {
            qd5.g b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.b(oldHolder);
            java.lang.String str = this.f284444h;
            qd5.b bVar = null;
            if (b17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.f443441a, str)) {
                b17 = null;
            }
            qd5.b a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.a(oldHolder);
            if (a17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f443435a, str)) {
                a17 = null;
            }
            qd5.g b18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.b(newHolder);
            if (b18 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b18.f443441a, str)) {
                b18 = null;
            }
            qd5.b a18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.a(newHolder);
            if (a18 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a18.f443435a, str)) {
                bVar = a18;
            }
            int i28 = this.f284456t;
            if (b17 != null) {
                H(M, b17);
                L(M);
                int i29 = this.f284458v + 1;
                this.f284458v = i29;
                if (i28 > 0) {
                    M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v1(i29, this, M, i28));
                }
            }
            if (bVar != null) {
                G(M, bVar);
                L(M);
                int i37 = this.f284458v + 1;
                this.f284458v = i37;
                if (i28 > 0) {
                    M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v1(i37, this, M, i28));
                }
            }
            int i38 = this.f284457u;
            if (a17 != null) {
                F(M, a17);
                K(M);
                int i39 = this.f284459w + 1;
                this.f284459w = i39;
                if (i38 > 0) {
                    M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u1(i39, this, M, i38));
                }
            }
            if (b18 != null) {
                I(M, b18);
                K(M);
                int i47 = this.f284459w + 1;
                this.f284459w = i47;
                if (i38 > 0) {
                    M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u1(i47, this, M, i38));
                }
            }
        }
        if (oldHolder == newHolder && i17 == i19 && i18 == i27) {
            h(oldHolder);
            return false;
        }
        if (oldHolder == newHolder) {
            return E(oldHolder, i17, i18, i19, i27, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.h1(this, oldHolder), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i1(this, oldHolder));
        }
        h(oldHolder);
        h(newHolder);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return E(holder, i17, i18, i19, i27, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j1(this, holder), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.k1(this, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 M = M(holder);
        qd5.g b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.b(holder);
        qd5.b a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.a(holder);
        java.lang.String str = this.f284444h;
        if (!((b17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.f443441a, str)) || (a17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f443435a, str)))) {
            y(holder);
            return false;
        }
        if (M != null) {
            if (b17 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.f443441a, str)) {
                    b17 = null;
                }
                if (b17 != null) {
                    H(M, b17);
                    L(M);
                    int i17 = this.f284458v + 1;
                    this.f284458v = i17;
                    int i18 = this.f284456t;
                    if (i18 > 0) {
                        M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v1(i17, this, M, i18));
                    }
                }
            }
            if (a17 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f443435a, str)) {
                    a17 = null;
                }
                if (a17 != null) {
                    F(M, a17);
                    K(M);
                    int i19 = this.f284459w + 1;
                    this.f284459w = i19;
                    int i27 = this.f284457u;
                    if (i27 > 0) {
                        M.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u1(i19, this, M, i27));
                    }
                }
            }
        }
        y(holder);
        return true;
    }
}
