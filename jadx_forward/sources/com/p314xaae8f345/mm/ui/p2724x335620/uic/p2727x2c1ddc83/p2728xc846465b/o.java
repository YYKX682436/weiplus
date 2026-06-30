package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t f290882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar) {
        super(0);
        this.f290882d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wi5.n0 n0Var;
        java.util.ArrayList arrayList;
        ri5.j a17;
        final com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar = this.f290882d;
        tVar.f290901g = new em.k2(android.view.LayoutInflater.from(tVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5l, (android.view.ViewGroup) null));
        j75.f Q6 = tVar.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.addAll(n0Var.f527853p);
            int intExtra = tVar.m158359x1e885992().getIntExtra("Select_Conv_Type", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(1, 2));
            java.util.Iterator it = (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(intExtra, 4) ? com.p314xaae8f345.mm.ui.p2690x38b72420.k3.c() : com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(intExtra, 16) ? com.p314xaae8f345.mm.ui.p2690x38b72420.k3.b() : com.p314xaae8f345.mm.ui.p2690x38b72420.k3.d()).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = tVar.f290898d;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                if (!hashSet.contains(str)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
                    if (L == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecentForwardListViewUIC", "initDataList: contact == null");
                        L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = L;
                    java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(z3Var);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
                    arrayList.add(new com.p314xaae8f345.mm.ui.p2690x38b72420.v8(new com.p314xaae8f345.mm.ui.p2690x38b72420.w8(str, wi6, false, false, false, 28, null)));
                    vi5.f fVar = new vi5.f(0L, 0L, null, null, 0, 0, false, 124, null);
                    ri5.h hVar = ri5.j.I;
                    int i17 = ri5.j.f477640x0;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    a17 = vi5.f.f519153h.a(tVar.m158354x19263085(), hVar.a(d17, i17, 0), z3Var, i17, fVar, (r14 & 32) != 0 ? i17 : 0);
                    tVar.f290902h.add(a17);
                }
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.v8(new com.p314xaae8f345.mm.ui.p2690x38b72420.w8("", "", false, false, false, 28, null));
            v8Var.f288754e = 1;
            arrayList.add(v8Var);
            if (com.p314xaae8f345.mm.ui.p2690x38b72420.t8.a(arrayList)) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.ui.mvvm.uic.conversation.recent.RecentConversationForwardListUIC$initView$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardListViewUIC", "getItemConvert, type:" + type);
                        return new com.p314xaae8f345.mm.ui.p2690x38b72420.s8(new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.l(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.this));
                    }
                }, arrayList, false);
                tVar.f290900f = c22848x6ddd90cf;
                c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.m(tVar);
                c22848x6ddd90cf.f374637n = new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.n(tVar);
                em.k2 k2Var = tVar.f290901g;
                if (k2Var != null) {
                    if (k2Var.f336037d == null) {
                        k2Var.f336037d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) k2Var.f336034a.findViewById(com.p314xaae8f345.mm.R.id.llt);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = k2Var.f336037d;
                    if (c1163xf1deaba4 != null) {
                        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(tVar.m80379x76847179(), 0, false));
                        c1163xf1deaba4.m7963x830bc99d(true);
                        c1163xf1deaba4.mo7960x6cab2c8d(tVar.f290900f);
                    }
                }
                em.k2 k2Var2 = tVar.f290901g;
                if (k2Var2 != null) {
                    if (k2Var2.f336035b == null) {
                        k2Var2.f336035b = (android.widget.TextView) k2Var2.f336034a.findViewById(com.p314xaae8f345.mm.R.id.gze);
                    }
                    android.widget.TextView textView = k2Var2.f336035b;
                    if (textView != null) {
                        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
                    }
                }
            }
        }
        em.k2 k2Var3 = tVar.f290901g;
        if (k2Var3 != null) {
            return k2Var3.f336034a;
        }
        return null;
    }
}
