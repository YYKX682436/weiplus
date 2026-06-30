package in5;

/* loaded from: classes10.dex */
public abstract class n0 extends com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b {

    /* renamed from: e */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f374631e;

    /* renamed from: f */
    public android.database.Observable f374632f;

    /* renamed from: n */
    public in5.y f374637n;

    /* renamed from: o */
    public in5.x f374638o;

    /* renamed from: p */
    public in5.z f374639p;

    /* renamed from: q */
    public boolean f374640q;

    /* renamed from: r */
    public boolean f374641r;

    /* renamed from: s */
    public boolean f374642s;

    /* renamed from: d */
    public boolean f374630d = true;

    /* renamed from: g */
    public final jz5.g f374633g = jz5.h.b(new in5.c0(this));

    /* renamed from: h */
    public final java.util.concurrent.ConcurrentLinkedQueue f374634h = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: i */
    public final java.util.ArrayList f374635i = new java.util.ArrayList();

    /* renamed from: m */
    public final java.util.ArrayList f374636m = new java.util.ArrayList();

    public static void N(in5.n0 n0Var, in5.w info, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooter");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = n0Var.f374636m;
        if (arrayList.contains(info)) {
            return;
        }
        arrayList.add(info);
        if (z17) {
            n0Var.m8149x8b456734(n0Var.mo1894x7e414b06() - 1);
        } else {
            n0Var.m8146xced61ae5();
        }
    }

    public static /* synthetic */ in5.w P(in5.n0 n0Var, android.view.View view, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        return n0Var.O(view, i17, z17);
    }

    public static /* synthetic */ void S(in5.n0 n0Var, in5.w wVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeader");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.Q(wVar, z17);
    }

    public static /* synthetic */ in5.w U(in5.n0 n0Var, android.view.View view, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        return n0Var.T(view, i17, z17);
    }

    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 Y(in5.n0 n0Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findViewHolderByItemId");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        n0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            int childCount = n0Var.b0().getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = n0Var.b0().getChildAt(i18);
                if (childAt == null) {
                    return null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = n0Var.b0().m0(childAt);
                if (m07 != null && m07.m8183xf806b362() != -1) {
                    long mo7906x1ed62e84 = n0Var.mo7906x1ed62e84(m07.m8183xf806b362());
                    if (z17) {
                        sb6.append("adapterPosition=" + m07.m8183xf806b362() + " itemId=" + mo7906x1ed62e84 + '\n');
                    }
                    if (j17 == mo7906x1ed62e84) {
                        return m07;
                    }
                }
            }
            if (!z17) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", "[findViewHolderByItemId] " + ((java.lang.Object) sb6));
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", "findViewHolderByItemId failed, error=" + th6);
            return null;
        }
    }

    public static /* synthetic */ void h0(in5.n0 n0Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFooter");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.g0(j17, z17);
    }

    public static /* synthetic */ void j0(in5.n0 n0Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeHeader");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.i0(j17, z17);
    }

    public void B(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    public void E(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    public abstract void I(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17);

    public abstract void J(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list);

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 K(android.view.ViewGroup parent, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return null;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 L(android.view.ViewGroup parent, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return null;
    }

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 M(android.view.ViewGroup viewGroup, int i17);

    public final in5.w O(android.view.View resource, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        in5.a0 a0Var = new in5.a0(resource, i17);
        java.util.ArrayList arrayList = this.f374636m;
        if (!arrayList.contains(a0Var)) {
            arrayList.add(a0Var);
            if (z17) {
                m8149x8b456734(mo1894x7e414b06() - 1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[addFooterView] notifyDataSetChanged");
                m8146xced61ae5();
            }
        }
        return a0Var;
    }

    public final void Q(in5.w info, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = this.f374635i;
        if (arrayList.contains(info)) {
            return;
        }
        arrayList.add(info);
        if (z17) {
            m8149x8b456734(arrayList.size() - 1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[addHeader] notifyDataSetChanged");
            m8146xced61ae5();
        }
    }

    public final void R(in5.w info, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = this.f374635i;
        if (arrayList.contains(info)) {
            return;
        }
        arrayList.add(i17, info);
        if (z17) {
            m8149x8b456734(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[addHeader] notifyDataSetChanged");
            m8146xced61ae5();
        }
    }

    public final in5.w T(android.view.View resource, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        in5.b0 b0Var = new in5.b0(resource, i17);
        java.util.ArrayList arrayList = this.f374635i;
        if (!arrayList.contains(b0Var)) {
            arrayList.add(b0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "headerInfoList.add : " + b0Var.mo2128x1ed62e84());
            if (z17) {
                m8149x8b456734(arrayList.size() - 1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[addHeaderView] notifyDataSetChanged");
                m8146xced61ae5();
            }
        }
        return b0Var;
    }

    public void V(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final boolean W(in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return this.f374635i.contains(info);
    }

    public void X(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final int Z() {
        return this.f374636m.size();
    }

    public final int a0() {
        return this.f374635i.size();
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b0() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374631e;
        if (c1163xf1deaba4 != null) {
            return c1163xf1deaba4;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    public final void c0(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 Y = Y(this, j17, false, 2, null);
        if (Y != null) {
            m8147xed6e4d18(Y.m8183xf806b362());
        }
    }

    public final void d0(long j17, java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 Y = Y(this, j17, false, 2, null);
        if (Y != null) {
            m8148xed6e4d18(Y.m8183xf806b362(), obj);
        }
    }

    public final void e0(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 Y = Y(this, j17, false, 2, null);
        if (Y != null) {
            m8155x27702c4(Y.m8183xf806b362());
        }
    }

    public final void f0(android.view.View view) {
        if (!this.f374641r && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    childAt.hasTransientState();
                    f0(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public final void g0(long j17, boolean z17) {
        java.util.Iterator it = this.f374636m.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        boolean z18 = false;
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            if (((in5.w) next).mo2128x1ed62e84() == j17) {
                it.remove();
                if (z17) {
                    m8155x27702c4(a0() + x() + i17);
                }
                z18 = true;
            }
            i17++;
        }
        if (!z18 || z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[removeFooter] notifyDataSetChanged");
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public final int mo1894x7e414b06() {
        return this.f374635i.size() + x() + this.f374636m.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public final long mo7906x1ed62e84(int i17) {
        if (mo1894x7e414b06() > i17 && i17 >= 0) {
            java.util.ArrayList arrayList = this.f374635i;
            if (i17 < arrayList.size()) {
                return ((in5.w) arrayList.get(i17)).mo2128x1ed62e84();
            }
            if (i17 < x() + arrayList.size()) {
                return y(i17 - a0());
            }
            return ((in5.w) this.f374636m.get(i17 - (arrayList.size() + x()))).mo2128x1ed62e84();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getItemId] position=");
        sb6.append(i17);
        sb6.append(" itemCount=");
        sb6.append(mo1894x7e414b06());
        sb6.append(" headerCount=");
        sb6.append(a0());
        sb6.append(" footerCount=");
        sb6.append(Z());
        sb6.append(' ');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", sb7);
        jx3.f.INSTANCE.d(20251, 3, sb7);
        return 0L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public final int mo863xcdaf1228(int i17) {
        java.util.ArrayList arrayList = this.f374635i;
        if (i17 < arrayList.size()) {
            return ((in5.w) arrayList.get(i17)).h();
        }
        if (i17 < x() + arrayList.size()) {
            return z(i17 - a0());
        }
        return ((in5.w) this.f374636m.get(i17 - (arrayList.size() + x()))).h();
    }

    public final void i0(long j17, boolean z17) {
        java.util.Iterator it = this.f374635i.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        boolean z18 = false;
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            if (((in5.w) next).mo2128x1ed62e84() == j17) {
                it.remove();
                if (z17) {
                    m8155x27702c4(i17);
                }
                z18 = true;
            }
            i17++;
        }
        if (!z18 || z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[removeHeader] notifyDataSetChanged");
        m8146xced61ae5();
    }

    public java.lang.String k0(java.lang.Exception e17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        return "";
    }

    public java.lang.String l0(java.lang.Exception e17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return "viewType=" + i17;
    }

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m0(android.view.View view);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        android.database.Observable observable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        this.f374631e = recyclerView;
        this.f374642s = true;
        if (!((java.lang.Boolean) ((jz5.n) this.f374633g).mo141623x754a37bb()).booleanValue() || (observable = this.f374632f) == null) {
            return;
        }
        observable.registerObserver(new in5.j0(this, recyclerView));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public final void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.ArrayList arrayList = this.f374635i;
        if (i17 < arrayList.size()) {
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            in5.w wVar = (in5.w) obj;
            if (!wVar.c()) {
                E(holder, i17, wVar);
            }
        } else if (i17 >= x() + arrayList.size()) {
            java.lang.Object obj2 = this.f374636m.get(i17 - (arrayList.size() + x()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            in5.w wVar2 = (in5.w) obj2;
            if (!wVar2.c()) {
                B(holder, i17, wVar2);
            }
        } else {
            I(holder, i17 - arrayList.size());
        }
        long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 > 17) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[onBindViewHolder] pos:" + i17 + ", itemId=" + mo7906x1ed62e84(i17) + " itemType=" + mo863xcdaf1228(i17) + " cost=" + uptimeMillis2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[onBindViewHolder] pos:" + i17 + ",cost=" + uptimeMillis2 + ",errMsg=" + e17.getMessage());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        int i18;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 M;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 K;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        java.util.ArrayList arrayList = this.f374635i;
        try {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                i18 = -1;
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((in5.w) it.next()).h() == i17) {
                    break;
                }
                i19++;
            }
            java.util.ArrayList arrayList2 = this.f374636m;
            java.util.Iterator it6 = arrayList2.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((in5.w) it6.next()).h() == i17) {
                    i18 = i27;
                    break;
                }
                i27++;
            }
            if (i19 >= 0) {
                java.lang.Object obj = arrayList.get(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                in5.w wVar = (in5.w) obj;
                if (wVar.c()) {
                    android.view.View b17 = wVar.b();
                    if (b17 == null || (M = m0(b17)) == null) {
                        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(wVar.a(), parent, false);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                        M = m0(inflate);
                    }
                } else {
                    M = L(parent, i17, wVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
                }
            } else if (i18 >= 0) {
                java.lang.Object obj2 = arrayList2.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                in5.w wVar2 = (in5.w) obj2;
                if (wVar2.c()) {
                    android.view.View b18 = wVar2.b();
                    if (b18 == null || (M = m0(b18)) == null) {
                        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(wVar2.a(), parent, false);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
                        K = m0(inflate2);
                    }
                } else {
                    java.lang.Object obj3 = arrayList2.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                    K = K(parent, i17, (in5.w) obj3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K);
                }
                M = K;
            } else {
                M = M(parent, i17);
            }
            android.view.View itemView = M.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            if (!itemView.hasOnClickListeners() && !this.f374640q) {
                itemView.setOnClickListener(new in5.k0(this, M));
                itemView.setOnLongClickListener(new in5.l0(this, M));
                itemView.setOnTouchListener(new in5.m0(this, M));
            }
            X(M);
            return M;
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17.getMessage() + '\n' + (l0(e17, i17) + " crashActivity=" + parent.getContext().getClass().getName()), e17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8158xdba684df(recyclerView);
        this.f374642s = false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8161x38c82990(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        f0(itemView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: registerAdapterDataObserver */
    public void mo8163xed962dec(p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (((java.lang.Boolean) ((jz5.n) this.f374633g).mo141623x754a37bb()).booleanValue()) {
            this.f374634h.add(observer);
        } else {
            super.mo8163xed962dec(observer);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: unregisterAdapterDataObserver */
    public void mo8165x48eac7b3(p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (((java.lang.Boolean) ((jz5.n) this.f374633g).mo141623x754a37bb()).booleanValue()) {
            this.f374634h.remove(observer);
        } else {
            super.mo8165x48eac7b3(observer);
        }
    }

    public abstract int x();

    public long y(int i17) {
        return 0L;
    }

    public int z(int i17) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        try {
            if (payloads.isEmpty()) {
                V(holder, false);
                super.mo8157xe5e2e48d(holder, i17, payloads);
                return;
            }
            V(holder, true);
            java.util.ArrayList arrayList = this.f374635i;
            if (i17 < arrayList.size()) {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                E(holder, i17, (in5.w) obj);
            } else {
                if (i17 >= x() + arrayList.size()) {
                    java.lang.Object obj2 = this.f374636m.get(i17 - (arrayList.size() + x()));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    B(holder, i17, (in5.w) obj2);
                    return;
                }
                J(holder, i17 - arrayList.size(), payloads);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RecyclerViewAdapterEx", e17, "[RecyclerViewAdapterEx.onBindViewHolder]raw exception", new java.lang.Object[0]);
            throw new java.lang.RuntimeException(e17.getMessage() + '\n' + (k0(e17, holder, i17, payloads) + " crashActivity=" + holder.f3639x46306858.getContext().getClass().getName()), e17);
        }
    }
}
