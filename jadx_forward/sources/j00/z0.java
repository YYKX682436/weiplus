package j00;

/* loaded from: classes9.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f378489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f378490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f378491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f378492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378494i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f378495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f378496n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.q f378497o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378498p;

    public z0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i17, int i18, yz5.a aVar, j00.k1 k1Var, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, java.util.Map map, yz5.q qVar, java.lang.String str2) {
        this.f378489d = u3Var;
        this.f378490e = i17;
        this.f378491f = i18;
        this.f378492g = aVar;
        this.f378493h = k1Var;
        this.f378494i = str;
        this.f378495m = oVar;
        this.f378496n = map;
        this.f378497o = qVar;
        this.f378498p = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f378489d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = this.f378490e;
        java.lang.String str = this.f378494i;
        yz5.a aVar = this.f378492g;
        j00.k1 k1Var = this.f378493h;
        if (i17 != 0 || this.f378491f != 0) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            j00.k1.Di(k1Var, str);
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f378495m.f152244b.f152233a;
        bw5.bf0 bf0Var = fVar instanceof bw5.bf0 ? (bw5.bf0) fVar : null;
        if (bf0Var == null) {
            bf0Var = new bw5.bf0();
        }
        if (!k1Var.oj(bf0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "requestPresentOrderInfoWithLoading, cgi response is invalid");
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            j00.k1.Di(k1Var, str);
            return;
        }
        bw5.yh0 b17 = bf0Var.b().b();
        bw5.ph0 ph0Var = (bw5.ph0) b17.c().f113657d.get(0);
        boolean z17 = b17.f117026i == 1;
        boolean[] zArr = b17.Z;
        java.lang.String str2 = zArr[4] ? b17.f117023f : "";
        if (str2 == null) {
            str2 = "";
        }
        java.util.Map map = this.f378496n;
        map.put("wishContent", str2);
        java.lang.String str3 = this.f378498p;
        map.put("orderId", str3 == null ? "" : str3);
        if (str3 == null) {
            str3 = "";
        }
        map.put("giftMsgId", str3);
        map.put("isGiver", java.lang.Boolean.valueOf(z17));
        map.put("giftStatus", java.lang.Integer.valueOf(ph0Var.f113172m));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean[] zArr2 = ph0Var.f113192z1;
        java.lang.String str4 = zArr2[2] ? ph0Var.f113166e : "";
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("imgUrl", str4);
        java.lang.String str5 = zArr2[3] ? ph0Var.f113167f : "";
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str5);
        java.lang.String str6 = zArr2[4] ? ph0Var.f113168g : "";
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("saleParamsText", str6);
        map.put("skuCard", linkedHashMap);
        java.lang.String str7 = zArr2[29] ? ph0Var.I : "";
        if (str7 == null) {
            str7 = "";
        }
        map.put("giverNickName", str7);
        java.lang.String str8 = zArr2[27] ? ph0Var.G : "";
        if (str8 == null) {
            str8 = "";
        }
        map.put("giverHeadImgUrl", str8);
        map.put("giftTakeMethod", java.lang.Long.valueOf(b17.f117039y));
        map.put("sendType", java.lang.Integer.valueOf(b17.f117030p));
        map.put("isReceiveGiftDisable", java.lang.Integer.valueOf(b17.D));
        map.put("userType", java.lang.Integer.valueOf(b17.H));
        bw5.nh0 b18 = b17.b();
        java.lang.String str9 = b18.f112222o[1] ? b18.f112214d : "";
        if (str9 == null) {
            str9 = "";
        }
        map.put("giftMsgCover", str9);
        bw5.nh0 b19 = b17.b();
        java.lang.String str10 = b19.f112222o[2] ? b19.f112215e : "";
        if (str10 == null) {
            str10 = "";
        }
        map.put("giftBoxOuterCover", str10);
        bw5.nh0 b27 = b17.b();
        java.lang.String str11 = b27.f112222o[3] ? b27.f112216f : "";
        if (str11 == null) {
            str11 = "";
        }
        map.put("giftBoxInnerCover", str11);
        bw5.nh0 b28 = b17.b();
        java.lang.String str12 = b28.f112222o[4] ? b28.f112217g : "";
        if (str12 == null) {
            str12 = "";
        }
        map.put("giftNormalCover", str12);
        bw5.nh0 b29 = b17.b();
        java.lang.String str13 = b29.f112222o[6] ? b29.f112219i : "";
        if (str13 == null) {
            str13 = "";
        }
        map.put("videorecvcover", str13);
        bw5.nh0 b37 = b17.b();
        java.lang.String str14 = b37.f112222o[7] ? b37.f112220m : "";
        if (str14 == null) {
            str14 = "";
        }
        map.put("videonomalcover", str14);
        java.lang.String str15 = zArr2[58] ? ph0Var.f113190y1 : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str15, "getSkuTitleTagName(...)");
        map.put("skuTitleTagName", str15);
        map.put("presentStyleType", java.lang.Integer.valueOf(b17.L));
        map.put("fromProductSet", java.lang.Integer.valueOf(b17.K));
        java.util.LinkedList<bw5.ph0> linkedList = (zArr[50] ? b17.I : new bw5.kh0()).f110912d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getSkuitem(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (bw5.ph0 ph0Var2 : linkedList) {
            arrayList.add(ph0Var2.f113192z1[2] ? ph0Var2.f113166e : "");
        }
        map.put("skuImgUrlLists", arrayList);
        java.lang.String str16 = zArr[55] ? b17.N : "";
        if (str16 == null) {
            str16 = "";
        }
        map.put("drawTimeWording", str16);
        map.put("lotteryMethod", java.lang.Integer.valueOf(b17.P));
        map.put("forceJumpReceiveFloatPage", java.lang.Boolean.valueOf(b17.R == 1));
        java.lang.String str17 = zArr[59] ? b17.S : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str17, "getRecvButtonWording(...)");
        map.put("recvButtonWording", str17);
        map.put("giverHeadImgStyle", java.lang.Integer.valueOf(b17.B));
        bw5.jh0 d17 = b17.d();
        java.lang.String str18 = d17.f110516h[1] ? d17.f110512d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str18, "getFrontPagResName(...)");
        map.put("openFrontAnimationResName", str18);
        bw5.jh0 d18 = b17.d();
        java.lang.String str19 = d18.f110516h[2] ? d18.f110513e : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str19, "getBackgroudPagResName(...)");
        map.put("openBackgroundAnimationResName", str19);
        map.put("delivery_method", java.lang.Integer.valueOf(ph0Var.B));
        bw5.jh0 d19 = b17.d();
        java.lang.String str20 = d19.f110516h[3] ? d19.f110514f : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str20, "getMbBasicItemType(...)");
        map.put("mbBasicItemType", str20);
        bw5.jh0 d27 = b17.d();
        java.lang.String str21 = d27.f110516h[4] ? d27.f110515g : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str21, "getMbFlyItemType(...)");
        map.put("mbFlyItemType", str21);
        bw5.uh0 uh0Var = zArr2[57] ? ph0Var.f113187x1 : new bw5.uh0();
        if (uh0Var != null) {
            boolean[] zArr3 = uh0Var.f115443o;
            java.lang.String str22 = zArr3[1] ? uh0Var.f115435d : "";
            if (str22 == null) {
                str22 = "";
            }
            map.put("secretImg", str22);
            java.lang.String str23 = zArr3[2] ? uh0Var.f115436e : "";
            if (str23 == null) {
                str23 = "";
            }
            map.put("secretImgWithBow", str23);
            java.lang.String str24 = zArr3[3] ? uh0Var.f115437f : "";
            if (str24 == null) {
                str24 = "";
            }
            map.put("orignialImg", str24);
            java.lang.String str25 = zArr3[4] ? uh0Var.f115438g : "";
            if (str25 == null) {
                str25 = "";
            }
            map.put("secretTitle", str25);
            java.lang.String str26 = zArr3[5] ? uh0Var.f115439h : "";
            if (str26 == null) {
                str26 = "";
            }
            map.put("secretSkuDescription", str26);
            map.put("isSecretPresent", java.lang.Boolean.valueOf(uh0Var.f115440i));
            map.put("isRevealed", java.lang.Boolean.valueOf(uh0Var.f115441m));
            map.put("isCanReveal", java.lang.Boolean.valueOf(uh0Var.f115442n));
        }
        java.util.LinkedList<bw5.ph0> linkedList2 = (zArr[50] ? b17.I : new bw5.kh0()).f110912d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getSkuitem(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        for (bw5.ph0 ph0Var3 : linkedList2) {
            bw5.uh0 uh0Var2 = ph0Var3.f113192z1[57] ? ph0Var3.f113187x1 : new bw5.uh0();
            java.lang.String str27 = uh0Var2 != null ? uh0Var2.f115443o[3] ? uh0Var2.f115437f : "" : null;
            if (str27 == null) {
                str27 = "";
            }
            arrayList2.add(str27);
        }
        map.put("packSkuBlindOriginImgs", arrayList2);
        if (!map.containsKey("forceJumpDetail")) {
            map.put("forceJumpDetail", java.lang.Boolean.valueOf(b17.C == 1));
        }
        this.f378497o.mo147xb9724478(map, bf0Var, ph0Var);
    }
}
