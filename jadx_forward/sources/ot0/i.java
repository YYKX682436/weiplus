package ot0;

/* loaded from: classes9.dex */
public final class i extends ot0.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f430043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f430044f;

    /* renamed from: g, reason: collision with root package name */
    public double f430045g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f430040b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f430041c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430042d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f430046h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f430047i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f430048j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f430049k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f430050l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f430051m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f430052n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f430053o = "";

    @Override // ot0.h
    public ot0.h a() {
        ot0.i iVar = new ot0.i();
        iVar.f430040b = this.f430040b;
        iVar.f430041c = this.f430041c;
        iVar.f430042d = this.f430042d;
        iVar.f430043e = this.f430043e;
        iVar.f430044f = this.f430044f;
        iVar.f430045g = this.f430045g;
        iVar.f430046h = this.f430046h;
        iVar.f430047i = this.f430047i;
        iVar.f430048j = this.f430048j;
        iVar.f430049k = this.f430049k;
        iVar.f430052n = this.f430052n;
        return iVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar == null || sb6 == null || qVar.f430199i != 110) {
            return;
        }
        sb6.append("<pocketmoney>");
        java.lang.StringBuilder j17 = j(j(i(i(i(sb6, "appid", this.f430040b, false), "apppath", this.f430041c, true), "appquery", this.f430042d, true), "ishalfscreen", this.f430043e), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, this.f430044f);
        double d17 = this.f430045g;
        if (!(d17 == 0.0d)) {
            j17.append("<heightpercent>");
            j17.append(d17);
            j17.append("</heightpercent>");
        }
        i(i(i(i(i(i(i(i(j17, "minversion", this.f430046h, false), "animin", this.f430047i, false), "animout", this.f430048j, false), "extradata", this.f430049k, true), "senderdigest", this.f430050l, false), "receiverdigest", this.f430051m, false), "sourceicon", this.f430052n, true), "paymsgid", this.f430053o, false).append("</pocketmoney>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.pocketmoney.appid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f430040b = str;
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.apppath");
        if (str2 == null) {
            str2 = "";
        }
        this.f430041c = str2;
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.appquery");
        if (str3 == null) {
            str3 = "";
        }
        this.f430042d = str3;
        this.f430043e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msg.appmsg.pocketmoney.ishalfscreen"), 0) == 1;
        this.f430044f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msg.appmsg.pocketmoney.transparent"), 0) == 1;
        this.f430045g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(".msg.appmsg.pocketmoney.heightpercent"));
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.minversion");
        if (str4 == null) {
            str4 = "";
        }
        this.f430046h = str4;
        java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.animin");
        if (str5 == null) {
            str5 = "";
        }
        this.f430047i = str5;
        java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.animout");
        if (str6 == null) {
            str6 = "";
        }
        this.f430048j = str6;
        java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.extradata");
        if (str7 == null) {
            str7 = "";
        }
        this.f430049k = str7;
        java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.senderdigest");
        if (str8 == null) {
            str8 = "";
        }
        this.f430050l = str8;
        java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.receiverdigest");
        if (str9 == null) {
            str9 = "";
        }
        this.f430051m = str9;
        java.lang.String str10 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.sourceicon");
        if (str10 == null) {
            str10 = "";
        }
        this.f430052n = str10;
        java.lang.String str11 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.paymsgid");
        this.f430053o = str11 != null ? str11 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppContentPocketMoneyPiece", m157057x9616526c());
    }

    public final java.lang.String f() {
        return this.f430053o;
    }

    public final java.lang.String g() {
        return this.f430051m;
    }

    public final java.lang.String h() {
        return this.f430050l;
    }

    public final java.lang.StringBuilder i(java.lang.StringBuilder sb6, java.lang.String str, java.lang.String str2, boolean z17) {
        if (str2.length() == 0) {
            return sb6;
        }
        sb6.append("<" + str + '>');
        if (z17) {
            str2 = ot0.q.g(str2);
        }
        sb6.append(str2);
        sb6.append("</" + str + '>');
        return sb6;
    }

    public final java.lang.StringBuilder j(java.lang.StringBuilder sb6, java.lang.String str, boolean z17) {
        if (!z17) {
            return sb6;
        }
        sb6.append("<" + str + ">1</" + str + '>');
        return sb6;
    }

    /* renamed from: toString */
    public java.lang.String m157057x9616526c() {
        return "AppContentPocketMoney,appId=" + this.f430040b + ",appPath=" + this.f430041c + ",appQuery=" + this.f430042d + ",payMsgId=" + this.f430053o;
    }
}
