package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i f272490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i iVar) {
        super(1);
        this.f272490d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.k state = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.j)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.i iVar = this.f272490d;
            iVar.getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v enhance = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.j) dVar).f272494b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enhance, "enhance");
            final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = enhance.f272534b;
            final java.util.ArrayList arrayList = enhance.f272537e;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0.f272478a.g(arrayList, g2Var.f270841a, g2Var.f270848h);
            arrayList.removeIf(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.d.f272483a);
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kz5.c0.i(2, 3, 4, 5, 6).contains(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it.next()).h()))) {
                    break;
                }
                i17++;
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) next;
                    wVar.f272557q = i18 == i17;
                    wVar.f272558r = i17 >= 0 && i18 == arrayList.size() - 1;
                    i18 = i19;
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var = g2Var.f270851k;
                    final kb0.g gVar = new kb0.g(g2Var, f2Var != null ? f2Var.f270834e : null, arrayList);
                    em.p2 p2Var = (em.p2) ((jz5.n) iVar.f272493e).mo141623x754a37bb();
                    if (p2Var.f336237c == null) {
                        p2Var.f336237c = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p2Var.f336235a.findViewById(com.p314xaae8f345.mm.R.id.un7);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = p2Var.f336237c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1163xf1deaba4, "getOpenWayListRv(...)");
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.otherway.halfscreen.OpenWayAppListUIC$initRecyclerView$adapter$1
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            if (type != 6) {
                                return type != 7 ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p0() : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.q0();
                            }
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.f fVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.f(arrayList, gVar);
                            return ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2.this.f270848h) ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.m0(fVar, gVar) : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.l0(fVar, gVar);
                        }
                    }, arrayList, false);
                    c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.e(arrayList, gVar, enhance, iVar);
                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(iVar.m80379x76847179(), 1, false));
                    c1163xf1deaba4.i(new kb0.d(gVar));
                    c1163xf1deaba4.mo7960x6cab2c8d(c22848x6ddd90cf);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
