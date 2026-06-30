package ni2;

/* loaded from: classes3.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f418979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 f418980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni2.v2 f418981f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35, ni2.v2 v2Var) {
        super(1);
        this.f418979d = lVar;
        this.f418980e = c14234xd22fbb35;
        this.f418981f = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        r45.xn1 xn1Var = (r45.xn1) obj;
        boolean z17 = true;
        int m75939xb282bd08 = xn1Var != null ? xn1Var.m75939xb282bd08(7) : 1;
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.Object obj2 = null;
        if (!r4Var.w1() && ((mm2.c1) this.f418979d.P0(mm2.c1.class)).R6()) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) this.f418979d.P0(mm2.c1.class)).f410385o, (xn1Var == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa5.m76197x6c03c64c())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicGiftMemberPanelTabView", "ur visitor and anonymous mode now. don't check others.");
                db5.t7.g(this.f418980e.getContext(), this.f418980e.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5x));
                return jz5.f0.f384359a;
            }
        }
        if (!r4Var.k2((xn1Var == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa4.m76197x6c03c64c())) {
            if (xn1Var != null && xn1Var.m75939xb282bd08(7) == 3) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                if (c19782x23db1cfa6 != null && (m76197x6c03c64c = c19782x23db1cfa6.m76197x6c03c64c()) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35 = this.f418980e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f418979d;
                    dk2.q4 q4Var = dk2.q4.f315471a;
                    android.content.Context context = c14234xd22fbb35.getContext();
                    gk2.e S0 = lVar.S0();
                    android.content.Context context2 = c14234xd22fbb35.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    dk2.q4.j(q4Var, context, S0, false, m76197x6c03c64c, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
                }
            } else {
                java.lang.String m76197x6c03c64c2 = (xn1Var == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76197x6c03c64c();
                if (m76197x6c03c64c2 != null && m76197x6c03c64c2.length() != 0) {
                    z17 = false;
                }
                if (!z17 && m75939xb282bd08 != 4) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putByteArray("PARAM_MEMBERS_PROFILE_CONTACT", xn1Var != null ? xn1Var.mo14344x5f01b1f6() : null);
                    bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
                    if (xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
                        str = "";
                    }
                    bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", str);
                    bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 7);
                    java.util.List list = ((mm2.o4) this.f418979d.P0(mm2.o4.class)).f410860v;
                    if (list != null) {
                        synchronized (list) {
                            java.util.Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390705c, (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c())) {
                                    obj2 = next;
                                    break;
                                }
                            }
                        }
                        km2.q qVar = (km2.q) obj2;
                        if (qVar != null) {
                            java.lang.String str2 = qVar.f390703a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            bundle.putString("PARAM_MEMBERS_PROFILE_USER_MIC_ID", str2);
                        }
                    }
                    this.f418979d.f194858g.mo46557x60d69242(qo0.b.f446909l1, bundle);
                    ((ni2.w) this.f418981f).a();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
