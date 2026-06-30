package oe0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f426213a;

    /* renamed from: b, reason: collision with root package name */
    public final long f426214b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f426215c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426216d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f426217e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426218f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f426219g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f426220h;

    public u(java.lang.String finderUserName, long j17, java.lang.String encodedUxInfo, java.lang.String fromCommentScene, java.lang.String enterImmerseType, java.lang.String promotionRecommendInfo, java.lang.String queryStr, java.lang.String gameClientParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encodedUxInfo, "encodedUxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromCommentScene, "fromCommentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterImmerseType, "enterImmerseType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promotionRecommendInfo, "promotionRecommendInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryStr, "queryStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameClientParams, "gameClientParams");
        this.f426213a = finderUserName;
        this.f426214b = j17;
        this.f426215c = encodedUxInfo;
        this.f426216d = fromCommentScene;
        this.f426217e = enterImmerseType;
        this.f426218f = promotionRecommendInfo;
        this.f426219g = queryStr;
        this.f426220h = gameClientParams;
    }

    public java.lang.String a() {
        java.lang.String str = "?finderUsername=" + this.f426213a + "&objectId=" + pm0.v.u(this.f426214b);
        java.lang.String str2 = this.f426215c;
        if (str2.length() > 0) {
            str = str + "&uxinfo=" + str2;
        }
        java.lang.String str3 = this.f426216d;
        if (str3.length() > 0) {
            str = str + "&commentScene=" + str3;
        }
        java.lang.String str4 = this.f426217e;
        if (str4.length() > 0) {
            str = str + "&enterImmerseType=" + str4;
        }
        java.lang.String str5 = this.f426218f;
        if (str5.length() > 0) {
            str = str + "&promotionRecommendInfo=" + str5;
        }
        java.lang.String str6 = this.f426219g;
        if (str6.length() > 0) {
            str = str + "&query=" + str6;
        }
        java.lang.String str7 = this.f426220h;
        if (str7.length() > 0) {
            str = str + "&gameClientParams=" + str7;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExtData", "result: " + str);
        return str;
    }

    /* renamed from: equals */
    public boolean m151102xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe0.u)) {
            return false;
        }
        oe0.u uVar = (oe0.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426213a, uVar.f426213a) && this.f426214b == uVar.f426214b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426215c, uVar.f426215c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426216d, uVar.f426216d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426217e, uVar.f426217e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426218f, uVar.f426218f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426219g, uVar.f426219g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426220h, uVar.f426220h);
    }

    /* renamed from: hashCode */
    public int m151103x8cdac1b() {
        return (((((((((((((this.f426213a.hashCode() * 31) + java.lang.Long.hashCode(this.f426214b)) * 31) + this.f426215c.hashCode()) * 31) + this.f426216d.hashCode()) * 31) + this.f426217e.hashCode()) * 31) + this.f426218f.hashCode()) * 31) + this.f426219g.hashCode()) * 31) + this.f426220h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151104x9616526c() {
        return "FinderExtData(finderUserName=" + this.f426213a + ", objectId=" + this.f426214b + ", encodedUxInfo=" + this.f426215c + ", fromCommentScene=" + this.f426216d + ", enterImmerseType=" + this.f426217e + ", promotionRecommendInfo=" + this.f426218f + ", queryStr=" + this.f426219g + ", gameClientParams=" + this.f426220h + ')';
    }

    public /* synthetic */ u(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? "" : str5, (i17 & 64) != 0 ? "" : str6, (i17 & 128) == 0 ? str7 : "");
    }
}
