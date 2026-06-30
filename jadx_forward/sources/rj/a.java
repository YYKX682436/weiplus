package rj;

/* loaded from: classes9.dex */
public final class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public w05.h f477665b;

    @Override // ot0.h
    public ot0.h a() {
        rj.a aVar = new rj.a();
        aVar.f477665b = this.f477665b;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x02d3, code lost:
    
        if ((r5.length() <= 0) != true) goto L189;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0339 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    @Override // ot0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.StringBuilder r3, ot0.q r4, java.lang.String r5, dn.h r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.a.c(java.lang.StringBuilder, ot0.q, java.lang.String, dn.h, int, int):void");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map == null) {
            this.f477665b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppContentEcsInfoPiece", "parseContent skip, values is null");
            return;
        }
        if (map.get(".msg.appmsg.ecsInfo") == null) {
            this.f477665b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppContentEcsInfoPiece", "parseContent skip, .msg.appmsg.ecsInfo is missing");
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.ecsInfo.cardType");
        if (str == null) {
            str = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        w05.h hVar = new w05.h();
        hVar.H(P);
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.cardVersion");
        hVar.I(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2 != null ? str2 : "0", 0));
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.realAppId");
        if (str3 != null) {
            java.lang.String T1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T1, "unescapeXMLSafe(...)");
            hVar.S(T1);
        }
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.activityId");
        if (str4 != null) {
            hVar.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(str4));
        }
        java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.bulkId");
        if (str5 != null) {
            hVar.G(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(str5));
        }
        java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.ecsJumpInfoBase64");
        if (str6 != null) {
            java.lang.String T12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T12, "unescapeXMLSafe(...)");
            hVar.K(T12);
        }
        java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.ecmsgsignature");
        if (str7 != null) {
            java.lang.String T13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T13, "unescapeXMLSafe(...)");
            hVar.J(T13);
        }
        java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.sceneNote");
        if (str8 != null) {
            java.lang.String T14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T14, "unescapeXMLSafe(...)");
            hVar.U(T14);
        }
        java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.reportExtraInfoJson");
        if (str9 != null) {
            java.lang.String T15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T15, "unescapeXMLSafe(...)");
            hVar.T(T15);
        }
        java.lang.String str10 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.bizReportData");
        if (str10 != null) {
            java.lang.String T16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str10);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T16, "unescapeXMLSafe(...)");
            hVar.F(T16);
        }
        java.lang.String str11 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.friendReceiveTitle");
        if (str11 != null) {
            java.lang.String T17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str11);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T17, "unescapeXMLSafe(...)");
            hVar.Q(T17);
        }
        java.lang.String str12 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.friendReceiveDesc");
        if (str12 != null) {
            java.lang.String T18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T18, "unescapeXMLSafe(...)");
            hVar.N(T18);
        }
        java.lang.String str13 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.friendReceiveSourceName");
        if (str13 != null) {
            java.lang.String T19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str13);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T19, "unescapeXMLSafe(...)");
            hVar.P(T19);
        }
        java.lang.String str14 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.friendReceiveImageUrl");
        if (str14 != null) {
            java.lang.String T110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str14);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T110, "unescapeXMLSafe(...)");
            hVar.O(T110);
        }
        java.lang.String str15 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.passBuffer");
        if (str15 != null) {
            java.lang.String T111 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T1(str15);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T111, "unescapeXMLSafe(...)");
            hVar.R(T111);
        }
        java.lang.String str16 = (java.lang.String) map.get(".msg.appmsg.ecsInfo.fetchAndPreloadFlags");
        if (str16 != null) {
            hVar.L(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str16, 0));
        }
        this.f477665b = hVar;
    }
}
