package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f232894d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f232895e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232896f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f232897g;

    /* renamed from: h, reason: collision with root package name */
    public im3.g f232898h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16664x54fdbbae f232899i;

    /* renamed from: m, reason: collision with root package name */
    public xm3.t0 f232900m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f232901n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l f232902o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k f232903p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232894d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n(activity));
        this.f232895e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c(activity));
        this.f232896f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m(this));
        this.f232897g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p(activity));
        this.f232901n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.o(activity));
        this.f232902o = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l(this, activity);
        this.f232903p = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k(this, activity);
    }

    public static final int O6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar, r45.oc5 oc5Var, java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList;
        qVar.getClass();
        java.util.LinkedList sourceList = oc5Var.f463682d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sourceList, "sourceList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : sourceList) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.nc5) obj).f462779e, str)) {
                arrayList.add(obj);
            }
        }
        r45.nc5 nc5Var = (r45.nc5) kz5.n0.a0(arrayList, 0);
        if (nc5Var == null || (linkedList = nc5Var.f462778d) == null) {
            return 0;
        }
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mc5) obj2).f461896d, str2)) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }

    public final android.widget.CheckBox P6() {
        return (android.widget.CheckBox) ((jz5.n) this.f232901n).mo141623x754a37bb();
    }

    public final qk4.b Q6() {
        return (qk4.b) ((jz5.n) this.f232897g).mo141623x754a37bb();
    }

    /* renamed from: getRecyclerView */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m67288x4905e9fa() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f232894d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b) a17;
        bVar.O6().z3(m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d.f232625d);
        bVar.O6().m3(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(P6(), 100, 100, 100, 100);
        P6().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i(bVar, this));
        bVar.O6().m3(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        qk4.f fVar = (qk4.f) Q6();
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = fVar.f445980e;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            kk4.v player = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) it.next()).getPlayer();
            if (player != null) {
                player.mo143590x408b7293();
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f445981f;
        java.util.Iterator it6 = concurrentHashMap.entrySet().iterator();
        while (it6.hasNext()) {
            kk4.v player2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) ((java.util.Map.Entry) it6.next()).getKey()).getPlayer();
            if (player2 != null) {
                player2.mo143590x408b7293();
            }
        }
        concurrentLinkedDeque.clear();
        concurrentHashMap.clear();
    }
}
