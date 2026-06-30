package jf2;

/* loaded from: classes3.dex */
public final class k0 extends if2.b implements if2.e {

    /* renamed from: y, reason: collision with root package name */
    public static final jf2.x f380910y = new jf2.x(null);

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f380911m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f380912n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f380913o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f380914p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f380915q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f380916r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380917s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380918t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f380919u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380920v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f380921w;

    /* renamed from: x, reason: collision with root package name */
    public jf2.g f380922x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f380912n = kz5.c0.i(14, 20, 15, 27, 22, 10, 11, 21, 16, 7, 19, 12, 17);
        this.f380913o = new java.util.LinkedList();
        this.f380914p = new java.util.LinkedList();
        this.f380915q = new java.util.LinkedList();
        this.f380916r = new java.util.LinkedList();
        this.f380917s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380918t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380919u = jz5.h.b(new jf2.b0(this));
        this.f380920v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380921w = jz5.h.b(new jf2.y(this));
    }

    public final java.lang.String Z6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((jf2.o) it.next()).mo57989x368f3a()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sb6.append(((java.lang.Number) it6.next()).intValue());
                sb6.append("-");
            }
            java.lang.String sb7 = sb6.toString();
            if (sb7 != null) {
                return r26.n0.Z(sb7, "-");
            }
        }
        return "";
    }

    public final void a7(java.lang.String scene, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + scene + "], forceRefresh = " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new jf2.a0(scene, this, z17, null), 3, null);
    }

    public final int b7() {
        return U6() ? i65.a.f(O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : i65.a.f(O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
    }

    public final int c7() {
        return !U6() ? (d7() - i65.a.f(O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br)) - ((java.lang.Number) ((jz5.n) this.f380921w).mo141623x754a37bb()).intValue() : d7();
    }

    public final int d7() {
        return java.lang.Math.min(com.p314xaae8f345.mm.ui.bl.b(O6()).x, com.p314xaae8f345.mm.ui.bl.b(O6()).y);
    }

    public final int e7(xt2.o6 o6Var) {
        return o6Var.x(xt2.n6.f538445d, O6());
    }

    public final boolean f7(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f380915q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jf2.o) obj).mo57989x368f3a() == i17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean g7(jf2.o view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f380915q.contains(view);
    }

    public final void h7(jf2.o entrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        java.util.LinkedList linkedList = this.f380913o;
        if (linkedList.contains(entrance)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "registerEntrance = " + entrance);
        linkedList.add(entrance);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        this.f380911m = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        super.mo14867x5aa1c816(r71Var);
        a7("onLiveMsg", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        java.util.LinkedList m75941xfb821914;
        super.mo14863x39a513b7(hc1Var);
        if (hc1Var != null && (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) != null && (m75941xfb821914 = ic1Var.m75941xfb821914(7)) != null) {
            if (!(!m75941xfb821914.isEmpty())) {
                m75941xfb821914 = null;
            }
            if (m75941xfb821914 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "priority_list:" + m75941xfb821914);
                this.f380911m = m75941xfb821914;
            }
        }
        a7("onJoinLive", false);
        pm0.v.V(3000L, new jf2.i0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        jf2.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "onViewMount");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        boolean z17 = true;
        if (ag0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : ag0Var.M) {
                if ((obj instanceof jf2.o) && ((jf2.o) obj).u()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                jf2.o oVar = next instanceof jf2.o ? (jf2.o) next : null;
                if (oVar != null && (k0Var = (jf2.k0) ag0Var.U0(jf2.k0.class)) != null) {
                    k0Var.h7(oVar);
                }
            }
        }
        java.util.LinkedList linkedList = this.f380911m;
        if (linkedList != null && !linkedList.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            a7("onViewMount", false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new jf2.g0(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "onViewUnmount");
        this.f380913o.clear();
        this.f380914p.clear();
        this.f380915q.clear();
        this.f380916r.clear();
        this.f380922x = null;
    }
}
