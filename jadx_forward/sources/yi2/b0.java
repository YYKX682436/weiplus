package yi2;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f544027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f544028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o71 f544029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f544030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i17, int i18, r45.o71 o71Var, yi2.i0 i0Var, java.lang.String str) {
        super(0);
        this.f544027d = i17;
        this.f544028e = i18;
        this.f544029f = o71Var;
        this.f544030g = i0Var;
        this.f544031h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.q qVar;
        if (this.f544027d == 0 && this.f544028e == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "loadRecommInfo() success - got " + (this.f544029f.m75941xfb821914(4).size() + this.f544029f.m75941xfb821914(1).size()) + " items, continueFlag=" + this.f544029f.m75939xb282bd08(3));
            yi2.i0 i0Var = this.f544030g;
            i0Var.f544064t = 0;
            i0Var.f544066v = this.f544029f.m75939xb282bd08(3) == 1;
            yi2.i0 i0Var2 = this.f544030g;
            java.lang.String str = null;
            if (i0Var2.f544066v) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f544029f.m75934xbce7f2f(2);
                i0Var2.f544063s = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            } else {
                i0Var2.f544063s = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.z) ((jz5.n) i0Var2.f544062r).mo141623x754a37bb();
                synchronized (zVar) {
                    zVar.f197287a = null;
                    zVar.f197290d = 0;
                    zVar.f197291e = new java.util.Date();
                }
            }
            yi2.i0 i0Var3 = this.f544030g;
            i0Var3.f544065u = false;
            if (!i0Var3.f544066v) {
                i0Var3.f544067w = false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f544029f.m75941xfb821914(4), "getObjects(...)");
            int i17 = 16;
            if (!r0.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "Processing " + this.f544029f.m75941xfb821914(4).size() + " objects from response");
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = this.f544029f.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
                yi2.i0 i0Var4 = this.f544030g;
                r45.o71 o71Var = this.f544029f;
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                    java.lang.String m75945x2fec8307 = o71Var.m75945x2fec8307(5);
                    i0Var4.getClass();
                    r45.xn1 xn1Var = new r45.xn1();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
                    if (m76760x76845fea == null) {
                        qVar = null;
                    } else {
                        xn1Var.set(0, m76760x76845fea);
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        java.lang.String m76175x6d346f39 = c19782x23db1cfa != null ? c19782x23db1cfa.m76175x6d346f39() : null;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        java.lang.String m76197x6c03c64c = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        java.lang.String m76184x8010e5e4 = c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76184x8010e5e4() : null;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec = c19782x23db1cfa4 != null ? c19782x23db1cfa4.m76160xd133dfec() : null;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        qVar = new km2.q("", m76175x6d346f39, m76197x6c03c64c, m76184x8010e5e4, 2, "", null, true, 0, m76160xd133dfec, c19782x23db1cfa5 != null ? c19782x23db1cfa5.m76192x3f6b0a02() : null, 0, 0, false, xn1Var.m75945x2fec8307(8), false, 0L, xn1Var, false, null, (r45.ba4) xn1Var.m75936x14adae67(16), 0, 0, 0L, null, null, 0L, null, 0, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0), m75945x2fec8307, null, 1072543744, 1, null);
                    }
                    if (qVar != null) {
                        i0Var4.f544057m.add(qVar);
                    }
                }
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f544029f.m75941xfb821914(1), "getContacts(...)");
                if (!r0.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorWidget", "Processing " + this.f544029f.m75941xfb821914(1).size() + " contacts from response");
                    java.util.LinkedList<r45.xn1> m75941xfb8219142 = this.f544029f.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getContacts(...)");
                    yi2.i0 i0Var5 = this.f544030g;
                    r45.o71 o71Var2 = this.f544029f;
                    for (r45.xn1 xn1Var2 : m75941xfb8219142) {
                        java.util.ArrayList arrayList = i0Var5.f544057m;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xn1Var2);
                        java.lang.String m75945x2fec83072 = o71Var2.m75945x2fec8307(5);
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        java.lang.String m76175x6d346f392 = c19782x23db1cfa6 != null ? c19782x23db1cfa6.m76175x6d346f39() : str;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        java.lang.String m76197x6c03c64c2 = c19782x23db1cfa7 != null ? c19782x23db1cfa7.m76197x6c03c64c() : str;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        java.lang.String m76184x8010e5e42 = c19782x23db1cfa8 != null ? c19782x23db1cfa8.m76184x8010e5e4() : str;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa9 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        java.lang.Object m76160xd133dfec2 = c19782x23db1cfa9 != null ? c19782x23db1cfa9.m76160xd133dfec() : str;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa10 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        arrayList.add(new km2.q("", m76175x6d346f392, m76197x6c03c64c2, m76184x8010e5e42, 2, "", null, true, 0, m76160xd133dfec2, c19782x23db1cfa10 != null ? c19782x23db1cfa10.m76192x3f6b0a02() : str, 0, 0, false, xn1Var2.m75945x2fec8307(8), false, 0L, xn1Var2, false, null, (r45.ba4) xn1Var2.m75936x14adae67(i17), 0, 0, 0L, null, null, 0L, null, 0, 0L, null, m75945x2fec83072, null, 2146285568, 1, null));
                        i17 = 16;
                        str = null;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorWidget", "objects and contacts both empty ");
                }
            }
            this.f544030g.l();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorWidget", "loadRecommInfo() failed - errType=" + this.f544027d + ", errCode=" + this.f544028e + ", errMsg=" + this.f544031h + ", retry=" + this.f544030g.f544064t);
            yi2.i0 i0Var6 = this.f544030g;
            i0Var6.f544065u = false;
            int i18 = i0Var6.f544064t + 1;
            i0Var6.f544064t = i18;
            if (i18 > 3) {
                i0Var6.f544066v = false;
                i0Var6.f544067w = false;
                i0Var6.l();
            } else {
                i0Var6.L.postDelayed(new yi2.a0(i0Var6), i18 * 1000);
            }
        }
        return jz5.f0.f384359a;
    }
}
