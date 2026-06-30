package vu4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.a f521811a;

    /* renamed from: b, reason: collision with root package name */
    public final vu4.b f521812b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521813c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f521814d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f521815e;

    /* renamed from: f, reason: collision with root package name */
    public final int f521816f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f521817g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f521818h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f521819i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f521820j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f521821k;

    /* renamed from: l, reason: collision with root package name */
    public int f521822l;

    /* renamed from: m, reason: collision with root package name */
    public int f521823m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f521824n;

    public c(vu4.a actionId, vu4.b actionType, java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId, int i17, java.lang.String query, java.lang.String docInfo, java.lang.String itemInfo, java.lang.String h5Version, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h5Version, "h5Version");
        this.f521811a = actionId;
        this.f521812b = actionType;
        this.f521813c = sessionId;
        this.f521814d = searchId;
        this.f521815e = requestId;
        this.f521816f = i17;
        this.f521817g = query;
        this.f521818h = docInfo;
        this.f521819i = itemInfo;
        this.f521820j = h5Version;
        this.f521821k = z17;
        this.f521822l = 3;
        this.f521823m = 6;
        this.f521824n = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final vu4.k a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        int i18;
        java.lang.String str5;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ?? r37 = new java.lang.Object[17];
        r37[0] = "";
        r37[1] = this.f521813c;
        r37[2] = this.f521814d;
        r37[3] = "";
        r37[4] = this.f521815e;
        r37[5] = java.lang.Long.valueOf(currentTimeMillis);
        r37[6] = java.lang.Integer.valueOf(this.f521811a.f521790d);
        java.lang.String str6 = this.f521819i;
        boolean z17 = str6.length() > 0;
        vu4.b bVar = this.f521812b;
        if (!z17) {
            int ordinal = bVar.ordinal();
            int i19 = 65;
            switch (ordinal) {
                case 15:
                    str5 = "navbar";
                    break;
                case 16:
                    str5 = fp.s0.b("AI搜索", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                    break;
                case 17:
                    str5 = fp.s0.b("问AI", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                    break;
                default:
                    switch (ordinal) {
                        case 24:
                            str5 = fp.s0.b("按住搜索或提问", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                            i19 = 66;
                            break;
                        case 25:
                            str5 = fp.s0.b("搜索框内语音", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                            i19 = 64;
                            break;
                        case 26:
                            str5 = fp.s0.b("搜索指定内容", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                            i19 = 55;
                            break;
                        case 27:
                            str5 = fp.s0.b("搜索框", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                            i19 = 64;
                            break;
                        default:
                            str5 = fp.s0.b("搜索框", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "encode(...)");
                            i19 = 64;
                            break;
                    }
            }
            str6 = "1|" + i19 + '|' + str5;
        }
        r37[7] = str6;
        java.lang.String str7 = this.f521818h;
        if (!(str7.length() > 0)) {
            int ordinal2 = bVar.ordinal();
            java.lang.String str8 = "aisearch";
            java.lang.String str9 = "photo";
            java.lang.String str10 = "voice";
            switch (ordinal2) {
                case 0:
                    str10 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
                    str = str10;
                    str2 = str;
                    i18 = 0;
                    break;
                case 1:
                    str = str10;
                    str2 = str;
                    i18 = 0;
                    break;
                case 2:
                    str3 = ya.a.f77450x918d59a8;
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 3:
                    str3 = "txtbox";
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 4:
                    str9 = fp.s0.b("深度思考", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, "encode(...)");
                    str8 = "deepthink";
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 5:
                    str9 = fp.s0.b("问真人", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, "encode(...)");
                    str8 = "ask_realpeople";
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 6:
                    str = str9;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 7:
                    str3 = "phototake";
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 8:
                    str4 = "photoselect";
                    str9 = str4;
                    str = str9;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 9:
                    str = "photocancel";
                    i17 = 3;
                    str2 = str;
                    i18 = i17;
                    break;
                case 10:
                    str = "add";
                    i17 = 3;
                    str2 = str;
                    i18 = i17;
                    break;
                case 11:
                    str3 = "addfile";
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 12:
                    str4 = "addbiz";
                    str9 = str4;
                    str = str9;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 13:
                    str = "addfinder";
                    i17 = 3;
                    str2 = str;
                    i18 = i17;
                    break;
                case 14:
                    str = "addcancel";
                    i17 = 4;
                    str2 = str;
                    i18 = i17;
                    break;
                case 15:
                    java.lang.String b17 = fp.s0.b("问元宝", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "encode(...)");
                    str9 = "askyuanbao";
                    str = b17;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 16:
                    str9 = fp.s0.b("AI搜索", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, "encode(...)");
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 17:
                    str9 = fp.s0.b("问AI", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, "encode(...)");
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 18:
                    str8 = "gesture_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 19:
                    str8 = "swipe_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 20:
                    str8 = "upbutton_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 21:
                    str8 = "h5_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 22:
                    str8 = "cancle";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 23:
                    str = fp.s0.b("大家在搜", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "encode(...)");
                    str2 = "hotsearch";
                    i18 = 3;
                    break;
                case 24:
                case 25:
                    str8 = "voice";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 26:
                    str = fp.s0.b("搜索指定内容", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "encode(...)");
                    str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
                    i18 = 0;
                    break;
                case 27:
                    str8 = "photo";
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                default:
                    str10 = "";
                    str = str10;
                    str2 = str;
                    i18 = 0;
                    break;
            }
            str7 = i18 + '|' + i18 + '|' + str + "||||||" + str2 + '|';
        }
        r37[8] = str7;
        ?? r47 = this.f521820j;
        if (!(r47.length() > 0)) {
            r47 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0));
        }
        r37[9] = r47;
        r37[10] = java.lang.Integer.valueOf(this.f521822l);
        r37[11] = java.lang.Integer.valueOf(this.f521816f);
        r37[12] = java.lang.Integer.valueOf(this.f521823m);
        r37[13] = fp.s0.b(this.f521824n, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        r37[14] = java.lang.Long.valueOf(currentTimeMillis);
        r37[15] = this.f521821k ? "1" : "0";
        java.lang.String str11 = this.f521817g;
        r37[16] = fp.s0.b(str11 != null ? str11 : "", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        return new vu4.k(26897, kz5.n0.g0(kz5.c0.i(r37), ",", null, null, 0, null, null, 62, null));
    }

    /* renamed from: equals */
    public boolean m172652xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.c)) {
            return false;
        }
        vu4.c cVar = (vu4.c) obj;
        return this.f521811a == cVar.f521811a && this.f521812b == cVar.f521812b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521813c, cVar.f521813c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521814d, cVar.f521814d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521815e, cVar.f521815e) && this.f521816f == cVar.f521816f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521817g, cVar.f521817g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521818h, cVar.f521818h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521819i, cVar.f521819i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521820j, cVar.f521820j) && this.f521821k == cVar.f521821k;
    }

    /* renamed from: hashCode */
    public int m172653x8cdac1b() {
        return (((((((((((((((((((this.f521811a.hashCode() * 31) + this.f521812b.hashCode()) * 31) + this.f521813c.hashCode()) * 31) + this.f521814d.hashCode()) * 31) + this.f521815e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f521816f)) * 31) + this.f521817g.hashCode()) * 31) + this.f521818h.hashCode()) * 31) + this.f521819i.hashCode()) * 31) + this.f521820j.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f521821k);
    }

    /* renamed from: toString */
    public java.lang.String m172654x9616526c() {
        return "Report26897Item(actionId=" + this.f521811a + ", actionType=" + this.f521812b + ", sessionId=" + this.f521813c + ", searchId=" + this.f521814d + ", requestId=" + this.f521815e + ", bizType=" + this.f521816f + ", query=" + this.f521817g + ", docInfo=" + this.f521818h + ", itemInfo=" + this.f521819i + ", h5Version=" + this.f521820j + ", isCache=" + this.f521821k + ')';
    }

    public /* synthetic */ c(vu4.a aVar, vu4.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(aVar, bVar, str, str2, str3, i17, (i18 & 64) != 0 ? "" : str4, (i18 & 128) != 0 ? "" : str5, (i18 & 256) != 0 ? "" : str6, (i18 & 512) != 0 ? "" : str7, (i18 & 1024) != 0 ? false : z17);
    }
}
