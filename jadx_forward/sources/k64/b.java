package k64;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f386116a;

    /* renamed from: b, reason: collision with root package name */
    public final int f386117b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f386118c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f386119d;

    public b(int i17, int i18, java.lang.String errMsg, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f386116a = i17;
        this.f386117b = i18;
        this.f386118c = errMsg;
        this.f386119d = obj;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return this.f386117b;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return this.f386116a;
    }

    public final java.lang.Object c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResp", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResp", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return this.f386119d;
    }

    /* renamed from: equals */
    public boolean m142045xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return true;
        }
        if (!(obj instanceof k64.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        k64.b bVar = (k64.b) obj;
        if (this.f386116a != bVar.f386116a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        if (this.f386117b != bVar.f386117b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f386118c, bVar.f386118c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f386119d, bVar.f386119d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return b17;
    }

    /* renamed from: hashCode */
    public int m142046x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        int hashCode = ((((java.lang.Integer.hashCode(this.f386116a) * 31) + java.lang.Integer.hashCode(this.f386117b)) * 31) + this.f386118c.hashCode()) * 31;
        java.lang.Object obj = this.f386119d;
        int hashCode2 = hashCode + (obj == null ? 0 : obj.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m142047x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        java.lang.String str = "CgiResult(errType=" + this.f386116a + ", errCode=" + this.f386117b + ", errMsg=" + this.f386118c + ", resp=" + this.f386119d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        return str;
    }
}
