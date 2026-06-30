package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class h1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f290863d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f290864e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f290865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f290863d = jz5.h.b(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.y0.f290919d);
        this.f290864e = new java.util.ArrayList();
        this.f290865f = jz5.h.b(new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.g1(this));
    }

    public static final em.l2 T6(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 h1Var) {
        return (em.l2) ((jz5.n) h1Var.f290865f).mo141623x754a37bb();
    }

    public final java.util.List U6(int i17, boolean z17, p13.v vVar, java.lang.String str, boolean z18, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList;
        ri5.j a17;
        ri5.j a18;
        java.util.List list;
        java.util.ArrayList arrayList2;
        ri5.j a19;
        boolean z19 = false;
        java.lang.Iterable copyOnWriteArrayList = (vVar.f432693e.size() <= 3 || !z17) ? new java.util.concurrent.CopyOnWriteArrayList(vVar.f432693e) : new java.util.concurrent.CopyOnWriteArrayList(vVar.f432693e).subList(0, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOnWriteArrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        g95.d dVar = g95.e.f351334a;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList4.add(((p13.y) it.next()).f432720e);
        }
        java.util.List e17 = dVar.e(arrayList4);
        java.util.Iterator it6 = copyOnWriteArrayList.iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            vi5.e eVar = vi5.f.f519153h;
            if (!hasNext) {
                java.util.ArrayList arrayList5 = arrayList3;
                if (z18) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var.X1("fake_username_create_chatroom_by_multi_search");
                    vi5.f fVar = new vi5.f(0L, 0L, null, null, i17, 0, false, 79, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.V;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    a18 = eVar.a(m158354x19263085(), hVar.a(d17, i19, i17), z3Var, i19, fVar, (r14 & 32) != 0 ? i19 : 0);
                    a18.f477651o = true;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                    a18.f477652p = str;
                    java.lang.String m158362x2fec8307 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572908nm2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m158362x2fec8307, "<set-?>");
                    a18.f477645g = m158362x2fec8307;
                    a18.n(charSequence);
                    arrayList = arrayList5;
                    arrayList.add(a18);
                } else {
                    arrayList = arrayList5;
                }
                if (vVar.f432693e.size() > 3 && z17) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var2.X1(i17 + "_collapse");
                    vi5.f fVar2 = new vi5.f(0L, 0L, null, null, i17, Integer.MAX_VALUE, false, 79, null);
                    ri5.h hVar2 = ri5.j.I;
                    int i27 = ri5.j.X;
                    java.lang.String d18 = z3Var2.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                    a17 = eVar.a(m158354x19263085(), hVar2.a(d18, i27, i17), z3Var2, i27, fVar2, (r14 & 32) != 0 ? i27 : 0);
                    arrayList.add(a17);
                }
                return arrayList;
            }
            java.lang.Object next = it6.next();
            int i28 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar = (p13.y) next;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) kz5.n0.a0(e17, i18);
            if (z3Var3 != null && !z3Var3.s2()) {
                java.lang.String d19 = z3Var3.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getUsername(...)");
                if (!r26.n0.B(d19, ",", z19)) {
                    int i29 = i18;
                    list = e17;
                    java.util.ArrayList arrayList6 = arrayList3;
                    vi5.f fVar3 = new vi5.f(0L, 0L, yVar, vVar.f432692d, i17, i18, false, 67, null);
                    ri5.h hVar3 = ri5.j.I;
                    int i37 = ri5.j.W;
                    java.lang.String d110 = z3Var3.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d110, "getUsername(...)");
                    a19 = eVar.a(m158354x19263085(), hVar3.a(d110, i37, i17), z3Var3, i37, fVar3, (r14 & 32) != 0 ? i37 : 0);
                    if (i29 == 0 && !z18) {
                        a19.f477651o = true;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                        a19.f477652p = str;
                    }
                    arrayList2 = arrayList6;
                    arrayList2.add(a19);
                    arrayList3 = arrayList2;
                    i18 = i28;
                    e17 = list;
                    z19 = false;
                }
            }
            list = e17;
            arrayList2 = arrayList3;
            arrayList3 = arrayList2;
            i18 = i28;
            e17 = list;
            z19 = false;
        }
    }

    public final void V6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationSearchUIC", "stopSearch");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        if (!state.e()) {
            abstractActivityC21394xb3d2c0cf.mo74408xb0dfae51(true);
        }
        java.util.ArrayList arrayList = this.f290864e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        j75.f Q6;
        if (i17 == 543) {
            if (intent == null || (str = intent.getStringExtra("Select_Conv_User")) == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationSearchUIC", "onActivityResult createChatroomUsername ".concat(str));
            if ((!r26.n0.N(str)) && (Q6 = Q6()) != null) {
                Q6.B3(new wi5.c0(kz5.b0.c(str), -1));
            }
        }
        super.mo2273x9d4787cb(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.z0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.ArrayList arrayList = this.f290864e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
