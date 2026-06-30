package o25;

/* loaded from: classes4.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f424049d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424054i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424055m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o25.c2 f424056n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(java.lang.String str, android.content.Context context, java.lang.String str2, java.lang.String str3, java.lang.String str4, o25.c2 c2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f424051f = str;
        this.f424052g = context;
        this.f424053h = str2;
        this.f424054i = str3;
        this.f424055m = str4;
        this.f424056n = c2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        o25.f2 f2Var = new o25.f2(this.f424051f, this.f424052g, this.f424053h, this.f424054i, this.f424055m, this.f424056n, interfaceC29045xdcb5ca57);
        f2Var.f424050e = obj;
        return f2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((o25.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f424049d;
        java.lang.String str2 = this.f424054i;
        java.lang.String str3 = this.f424053h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str4 = this.f424051f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f424050e;
                r01.a2 a2Var = new r01.a2();
                r45.m15 m15Var = (r45.m15) a2Var.f149953a;
                m15Var.f461604d = str3;
                m15Var.f461605e = str2;
                this.f424050e = y0Var;
                this.f424049d = 1;
                obj = a2Var.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            r45.n15 n15Var = (r45.n15) obj;
            r45.al alVar = n15Var.f462526d;
            java.lang.String obj2 = (alVar == null || (str = alVar.f451610d) == null) ? null : r26.n0.u0(str).toString();
            if (obj2 == null || obj2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + str4 + ", cgi response invalid");
                return f0Var;
            }
            r45.al alVar2 = n15Var.f462526d;
            r45.xa xaVar = alVar2 != null ? alVar2.f451611e : null;
            if (xaVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + str4 + ", cgi response invalid");
                return f0Var;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", obj2);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, n15Var.f462527e);
            java.lang.String str5 = "sourceType=APP&sourceAppId=" + str3;
            java.lang.String str6 = this.f424055m;
            if (!(str6 == null || str6.length() == 0)) {
                str5 = str6 + '&' + str5;
            }
            bundle.putString("query", str5);
            bundle.putLong("timeout", xaVar.f471437d);
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, xaVar.f471442i);
            bundle.putBoolean("withDownloadLoading", xaVar.f471446p);
            bundle.putBoolean("isHalfScreen", xaVar.f471440g == 2);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.OPEN_SDK;
            c3708xc1f46f80.f14312x721f2ec7 = str3;
            bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            o25.c2 c2Var = this.f424056n;
            sVar.f225700d = new o25.e2(str4, str3, str2, c2Var);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(this.f424052g, bundle, xaVar.f471438e, xaVar.f471439f, sVar, new o25.d2(str4, c2Var, str3, str2));
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + str4 + ", send cgi failed " + e17);
            return f0Var;
        }
    }
}
