package bg2;

/* loaded from: classes10.dex */
public final class d extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101526e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f101527f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f101528g;

    /* renamed from: h, reason: collision with root package name */
    public dk2.u4 f101529h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f101530i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101526e = "Finder.LiveConvertBattleController";
        this.f101530i = new java.util.ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02f2, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r0, r2 != null ? r2.f315687a : null) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03fa, code lost:
    
        if (((r0 != null ? r0.f315689c : 0) - r10.m75939xb282bd08(3)) >= 3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06ef, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r0, r5 != null ? r5.f315687a : null) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07f7, code lost:
    
        if (((r0 != null ? r0.f315689c : 0) - r10.m75939xb282bd08(3)) >= 3) goto L368;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x094a  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r4v2, types: [r45.rh1, com.tencent.mm.protobuf.e] */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H0(r45.r71 r52) {
        /*
            Method dump skipped, instructions count: 2615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.d.H0(r45.r71):void");
    }

    @Override // tc2.c
    public void Q6() {
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = false;
        if (d2Var != null && !d2Var.f101554t) {
            z17 = true;
        }
        this.f101527f = z17;
    }

    @Override // tc2.c
    public void U6() {
        this.f101527f = false;
        this.f101529h = null;
    }

    public final boolean Y6() {
        zy2.a8 liveFeedDecorator;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        if (((c15182x1607686b == null || (liveFeedDecorator = c15182x1607686b.getLiveFeedDecorator()) == null) ? this.f101530i.size() : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator).h().size()) != 0) {
            return true;
        }
        bg2.k kVar = (bg2.k) N6(bg2.k.class);
        if (kVar == null) {
            return false;
        }
        kVar.h7();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(r45.im1 r37) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.d.Z6(r45.im1):void");
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76175x6d346f39;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.lang.String m76184x8010e5e4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        java.lang.String m76197x6c03c64c;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        java.lang.String m76184x8010e5e42;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6;
        java.lang.String m76197x6c03c64c2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (this.f101527f) {
            r45.up1 up1Var = (r45.up1) resp.m75936x14adae67(68);
            this.f101528g = pm0.v.A(up1Var != null ? up1Var.m75942xfb822ef2(0) : 0L, 8);
            r45.wz1 wz1Var = (r45.wz1) resp.m75936x14adae67(4);
            java.util.ArrayList arrayList = this.f101530i;
            if (wz1Var != null) {
                r45.yz1 yz1Var = (r45.yz1) wz1Var.m75936x14adae67(7);
                if (yz1Var != null) {
                    java.lang.String m75945x2fec8307 = yz1Var.m75945x2fec8307(2);
                    java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                    r45.xn1 xn1Var = (r45.xn1) yz1Var.m75936x14adae67(3);
                    java.lang.String str3 = (xn1Var == null || (c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (m76197x6c03c64c2 = c19782x23db1cfa6.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c2;
                    r45.xn1 xn1Var2 = (r45.xn1) yz1Var.m75936x14adae67(3);
                    java.lang.String str4 = (xn1Var2 == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null || (m76184x8010e5e42 = c19782x23db1cfa5.m76184x8010e5e4()) == null) ? "" : m76184x8010e5e42;
                    r45.xn1 xn1Var3 = (r45.xn1) yz1Var.m75936x14adae67(3);
                    if (xn1Var3 == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null || (str = c19782x23db1cfa4.m76175x6d346f39()) == null) {
                        str = "";
                    }
                    arrayList.add(new zy2.a(str2, str3, false, str4, str));
                }
                java.util.LinkedList<r45.yz1> m75941xfb821914 = wz1Var.m75941xfb821914(12);
                if (m75941xfb821914 != null) {
                    for (r45.yz1 yz1Var2 : m75941xfb821914) {
                        java.lang.String m75945x2fec83072 = yz1Var2.m75945x2fec8307(2);
                        java.lang.String str5 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
                        r45.xn1 xn1Var4 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                        java.lang.String str6 = (xn1Var4 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var4.m75936x14adae67(0)) == null || (m76197x6c03c64c = c19782x23db1cfa3.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c;
                        r45.xn1 xn1Var5 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                        java.lang.String str7 = (xn1Var5 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var5.m75936x14adae67(0)) == null || (m76184x8010e5e4 = c19782x23db1cfa2.m76184x8010e5e4()) == null) ? "" : m76184x8010e5e4;
                        r45.xn1 xn1Var6 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                        arrayList.add(new zy2.a(str5, str6, false, str7, (xn1Var6 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var6.m75936x14adae67(0)) == null || (m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39()) == null) ? "" : m76175x6d346f39));
                    }
                }
            }
            java.lang.String str8 = "parseMicInfoFromJoinLive anchorPkSize: " + arrayList.size();
            java.lang.String str9 = this.f101526e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str9, str8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str9, "processJoinLiveResp isNeedAnchorPkMic: " + this.f101528g);
            r45.wz1 wz1Var2 = (r45.wz1) resp.m75936x14adae67(4);
            r45.im1 im1Var = wz1Var2 != null ? (r45.im1) wz1Var2.m75936x14adae67(8) : null;
            if (im1Var == null || im1Var.m75939xb282bd08(13) != 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str9, "battleInfo.status:" + im1Var.m75939xb282bd08(2));
            if (im1Var.m75939xb282bd08(2) == 10) {
                java.lang.String m75945x2fec83073 = im1Var.m75945x2fec8307(0);
                long m75942xfb822ef2 = im1Var.m75942xfb822ef2(1);
                int m75939xb282bd08 = im1Var.m75939xb282bd08(3);
                int m75939xb282bd082 = im1Var.m75939xb282bd08(8);
                int m75939xb282bd083 = im1Var.m75939xb282bd08(10);
                java.util.LinkedList m75941xfb8219142 = im1Var.m75941xfb821914(9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getBattle_teams(...)");
                dk2.u4 u4Var = new dk2.u4(m75945x2fec83073, m75942xfb822ef2, m75939xb282bd08, -1, 2, null, m75939xb282bd082, m75939xb282bd083, null, m75941xfb8219142, null, null, im1Var.m75939xb282bd08(13), 0, 0, 27936, null);
                u4Var.f315695i = u4Var.b(im1Var.m75939xb282bd08(10), im1Var.m75934xbce7f2f(11));
                java.util.LinkedList m75941xfb8219143 = im1Var.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getPlayer_info(...)");
                u4Var.m(m75941xfb8219143);
                this.f101529h = u4Var;
                bg2.k kVar = (bg2.k) N6(bg2.k.class);
                if (kVar != null) {
                    kVar.Z6(true);
                }
            }
        }
    }
}
