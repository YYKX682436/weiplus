package nd2;

/* loaded from: classes10.dex */
public final class o implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f417981d;

    /* renamed from: e, reason: collision with root package name */
    public final long f417982e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.C24300x7090825d f417983f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f417984g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f417985h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f417986i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f417987m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f417988n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f417989o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f417990p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f417991q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f417992r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f417993s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f417994t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f417995u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f417996v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f417997w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public o(android.content.Context context, long j17, java.lang.Object obj, com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.C24300x7090825d eventCallback) {
        ?? r66;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventCallback, "eventCallback");
        this.f417981d = context;
        this.f417982e = j17;
        this.f417983f = eventCallback;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eis, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f417984g = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.m7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f417985h = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.cl6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f417986i = (android.widget.ImageView) findViewById2;
        this.f417993s = true;
        this.f417995u = true;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            java.lang.Object obj2 = map.get("commentScene");
            java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
            if (number != null) {
                number.intValue();
            }
            java.lang.Object obj3 = map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            java.lang.Number number2 = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
            if (number2 != null) {
                number2.intValue();
            }
            java.lang.Object obj4 = map.get("showCover");
            java.lang.Boolean bool = obj4 instanceof java.lang.Boolean ? (java.lang.Boolean) obj4 : null;
            this.f417993s = bool != null ? bool.booleanValue() : true;
            java.lang.Object obj5 = map.get("coverImgUrl");
            this.f417994t = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            java.lang.Object obj6 = map.get("finderObjectData");
            byte[] bArr = obj6 instanceof byte[] ? (byte[]) obj6 : null;
            if (bArr != null) {
                try {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725().mo11468x92b714fd(bArr);
                    this.f417988n = c19792x256d2725 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0) : null;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "parse FinderObjectDataSource error: " + e17.getMessage());
                }
            } else {
                java.lang.Object obj7 = map.get("finderExportId");
                java.lang.String str = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                if ((str == null || str.length() == 0) == true) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "parse ExportDataSource: finderExportId is empty");
                } else {
                    this.f417990p = str;
                    java.lang.Object obj8 = map.get("feedObjectId");
                    this.f417991q = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                    java.lang.Object obj9 = map.get("finderObjectNonceId");
                    this.f417992r = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                    java.lang.Object obj10 = map.get("finderLiveExportObjectForJoinLiveBase64");
                    java.lang.String str2 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                    if ((str2 == null || str2.length() == 0) == true) {
                        this.f417988n = a(str, this.f417991q, this.f417992r);
                    } else {
                        try {
                            byte[] decode = android.util.Base64.decode(str2, 0);
                            r45.sp1 sp1Var = new r45.sp1();
                            sp1Var.mo11468x92b714fd(decode);
                            this.f417988n = b(sp1Var);
                            this.f417989o = sp1Var.m75945x2fec8307(7);
                            r66 = true;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "parseLiveExportObjectBase64 error: " + e18.getMessage());
                            r66 = false;
                        }
                        if (r66 == false) {
                            this.f417988n = a(str, this.f417991q, this.f417992r);
                        }
                    }
                }
            }
        }
        this.f417986i.setVisibility(this.f417993s ? 0 : 8);
        if (this.f417993s) {
            java.lang.String str3 = this.f417994t;
            if ((str3 == null || str3.length() == 0) != true) {
                java.lang.String str4 = this.f417994t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                f(str4);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f417988n;
            if (c14994x9b99c079 != null) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c14994x9b99c079.m59259x7dea7760());
                if (mb4Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "liveMediaList is empty");
                    return;
                }
                java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                m75945x2fec8307 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
                java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072 == null ? "" : m75945x2fec83072);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(mb4Var.m75945x2fec8307(1));
                    java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
                    sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
                    concat = sb6.toString();
                }
                if (concat.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "setCover coverUrl is empty");
                } else {
                    f(concat);
                }
            }
        }
    }

    public static /* synthetic */ void e(nd2.o oVar, java.lang.String str, java.lang.Double d17, java.lang.Double d18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            d17 = null;
        }
        if ((i17 & 4) != 0) {
            d18 = null;
        }
        oVar.d(str, d17, d18);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Long j17;
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            this.f417990p = str;
            c19792x256d2725.m76877x684351d((str2 == null || (j17 = r26.h0.j(str2)) == null) ? 0L : j17.longValue());
            c19792x256d2725.m76896xfefec3e9(str3);
            c19792x256d2725.m76887xcb0dd23c(new r45.nw1());
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "buildFinderItemFromExportId error: " + e17.getMessage());
            return null;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 b(r45.sp1 sp1Var) {
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.m76877x684351d(sp1Var.m75942xfb822ef2(0));
            c19792x256d2725.m76896xfefec3e9(sp1Var.m75945x2fec8307(4));
            r45.nw1 nw1Var = new r45.nw1();
            nw1Var.set(3, sp1Var.m75945x2fec8307(7));
            nw1Var.set(0, java.lang.Long.valueOf(sp1Var.m75942xfb822ef2(1)));
            c19792x256d2725.m76887xcb0dd23c(nw1Var);
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "buildFinderItemFromLiveExportObject error: " + e17.getMessage());
            return null;
        }
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f417987m;
        if (c14522x8ffd8962 != null) {
            this.f417985h.removeView(c14522x8ffd8962);
            c14522x8ffd8962.mo58389x41012807();
            c14522x8ffd8962.r("completelyQuit");
            mn0.b0 b0Var = c14522x8ffd8962.player;
            if (b0Var != null) {
                ((mn0.y) b0Var).w();
            }
        }
        this.f417987m = null;
    }

    public final void d(java.lang.String str, java.lang.Double d17, java.lang.Double d18) {
        pm0.v.X(new nd2.i(this, new com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.C24299x30f375f8(java.lang.Long.valueOf(this.f417982e), str, null, d17, d18, null, null, null, 228, null)));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "dispose viewId=" + this.f417982e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f417987m;
        if (c14522x8ffd8962 != null) {
            c14522x8ffd8962.mo58404x360802();
        }
        c();
    }

    public final void f(java.lang.String str) {
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "setCoverFromUrl coverUrl is empty");
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), this.f417986i, g1Var.h(mn2.f1.f411486d));
        }
    }

    public final void g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f417987m;
        if (c14522x8ffd8962 != null && c14522x8ffd8962.mo58387xc00617a4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "startPlayInternal playerView is playing");
            return;
        }
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMLiveCDNPlayerContainer", "startPlayInternal url is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerContainer", "startPlayInternal url=" + str);
        c();
        if (this.f417987m == null && (c14994x9b99c079 = this.f417988n) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89622 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962(this.f417981d, 1);
            c14522x8ffd89622.setTag("nearby-live-preview-view-tag");
            c14522x8ffd89622.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            this.f417987m = c14522x8ffd89622;
            gp2.a aVar = new gp2.a(str, new so2.h1(c14994x9b99c079), false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89623 = this.f417987m;
            if (c14522x8ffd89623 != null) {
                c14522x8ffd89623.m58393x5bde035d(aVar);
            }
            this.f417985h.addView(this.f417987m);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89624 = this.f417987m;
        if (c14522x8ffd89624 != null) {
            c14522x8ffd89624.mo58394x764d819b(this.f417995u);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89625 = this.f417987m;
        if (c14522x8ffd89625 != null) {
            ws5.f.j(c14522x8ffd89625, new nd2.j(this), new nd2.k(this), new nd2.l(this), null, new nd2.m(this), new nd2.n(this), 8, null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f417984g;
    }
}
