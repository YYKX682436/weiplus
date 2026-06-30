package bg2;

/* loaded from: classes10.dex */
public final class d extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f19993e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19994f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19995g;

    /* renamed from: h, reason: collision with root package name */
    public dk2.u4 f19996h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f19997i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f19993e = "Finder.LiveConvertBattleController";
        this.f19997i = new java.util.ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02f2, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r0, r2 != null ? r2.f234154a : null) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03fa, code lost:
    
        if (((r0 != null ? r0.f234156c : 0) - r10.getInteger(3)) >= 3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06ef, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r0, r5 != null ? r5.f234154a : null) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07f7, code lost:
    
        if (((r0 != null ? r0.f234156c : 0) - r10.getInteger(3)) >= 3) goto L368;
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
        if (d2Var != null && !d2Var.f20021t) {
            z17 = true;
        }
        this.f19994f = z17;
    }

    @Override // tc2.c
    public void U6() {
        this.f19994f = false;
        this.f19996h = null;
    }

    public final boolean Y6() {
        zy2.a8 liveFeedDecorator;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        if (((finderLivePlayView == null || (liveFeedDecorator = finderLivePlayView.getLiveFeedDecorator()) == null) ? this.f19997i.size() : ((com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator).h().size()) != 0) {
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
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String headUrl;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.String nickname;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        java.lang.String username;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        java.lang.String nickname2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        java.lang.String username2;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (this.f19994f) {
            r45.up1 up1Var = (r45.up1) resp.getCustom(68);
            this.f19995g = pm0.v.A(up1Var != null ? up1Var.getLong(0) : 0L, 8);
            r45.wz1 wz1Var = (r45.wz1) resp.getCustom(4);
            java.util.ArrayList arrayList = this.f19997i;
            if (wz1Var != null) {
                r45.yz1 yz1Var = (r45.yz1) wz1Var.getCustom(7);
                if (yz1Var != null) {
                    java.lang.String string = yz1Var.getString(2);
                    java.lang.String str2 = string == null ? "" : string;
                    r45.xn1 xn1Var = (r45.xn1) yz1Var.getCustom(3);
                    java.lang.String str3 = (xn1Var == null || (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (username2 = finderContact6.getUsername()) == null) ? "" : username2;
                    r45.xn1 xn1Var2 = (r45.xn1) yz1Var.getCustom(3);
                    java.lang.String str4 = (xn1Var2 == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null || (nickname2 = finderContact5.getNickname()) == null) ? "" : nickname2;
                    r45.xn1 xn1Var3 = (r45.xn1) yz1Var.getCustom(3);
                    if (xn1Var3 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null || (str = finderContact4.getHeadUrl()) == null) {
                        str = "";
                    }
                    arrayList.add(new zy2.a(str2, str3, false, str4, str));
                }
                java.util.LinkedList<r45.yz1> list = wz1Var.getList(12);
                if (list != null) {
                    for (r45.yz1 yz1Var2 : list) {
                        java.lang.String string2 = yz1Var2.getString(2);
                        java.lang.String str5 = string2 == null ? "" : string2;
                        r45.xn1 xn1Var4 = (r45.xn1) yz1Var2.getCustom(3);
                        java.lang.String str6 = (xn1Var4 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null || (username = finderContact3.getUsername()) == null) ? "" : username;
                        r45.xn1 xn1Var5 = (r45.xn1) yz1Var2.getCustom(3);
                        java.lang.String str7 = (xn1Var5 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null || (nickname = finderContact2.getNickname()) == null) ? "" : nickname;
                        r45.xn1 xn1Var6 = (r45.xn1) yz1Var2.getCustom(3);
                        arrayList.add(new zy2.a(str5, str6, false, str7, (xn1Var6 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var6.getCustom(0)) == null || (headUrl = finderContact.getHeadUrl()) == null) ? "" : headUrl));
                    }
                }
            }
            java.lang.String str8 = "parseMicInfoFromJoinLive anchorPkSize: " + arrayList.size();
            java.lang.String str9 = this.f19993e;
            com.tencent.mars.xlog.Log.i(str9, str8);
            com.tencent.mars.xlog.Log.i(str9, "processJoinLiveResp isNeedAnchorPkMic: " + this.f19995g);
            r45.wz1 wz1Var2 = (r45.wz1) resp.getCustom(4);
            r45.im1 im1Var = wz1Var2 != null ? (r45.im1) wz1Var2.getCustom(8) : null;
            if (im1Var == null || im1Var.getInteger(13) != 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str9, "battleInfo.status:" + im1Var.getInteger(2));
            if (im1Var.getInteger(2) == 10) {
                java.lang.String string3 = im1Var.getString(0);
                long j17 = im1Var.getLong(1);
                int integer = im1Var.getInteger(3);
                int integer2 = im1Var.getInteger(8);
                int integer3 = im1Var.getInteger(10);
                java.util.LinkedList list2 = im1Var.getList(9);
                kotlin.jvm.internal.o.f(list2, "getBattle_teams(...)");
                dk2.u4 u4Var = new dk2.u4(string3, j17, integer, -1, 2, null, integer2, integer3, null, list2, null, null, im1Var.getInteger(13), 0, 0, 27936, null);
                u4Var.f234162i = u4Var.b(im1Var.getInteger(10), im1Var.getByteString(11));
                java.util.LinkedList list3 = im1Var.getList(4);
                kotlin.jvm.internal.o.f(list3, "getPlayer_info(...)");
                u4Var.m(list3);
                this.f19996h = u4Var;
                bg2.k kVar = (bg2.k) N6(bg2.k.class);
                if (kVar != null) {
                    kVar.Z6(true);
                }
            }
        }
    }
}
