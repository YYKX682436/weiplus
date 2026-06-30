package k64;

/* loaded from: classes4.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f386133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k64.n f386134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q64.b bVar, k64.n nVar, int i17) {
        super(1);
        this.f386133d = bVar;
        this.f386134e = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        k64.b it = (k64.b) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            r45.js5 js5Var = (r45.js5) it.c();
            if (js5Var != null) {
                bundle.putByteArray("resp_pb_bytes", js5Var.mo14344x5f01b1f6());
            }
        } catch (java.lang.Throwable unused) {
        }
        bundle.putInt("resp_error_type", it.b());
        bundle.putInt("resp_error_code", it.a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        bundle.putString("resp_error_msg", it.f386118c);
        ((r64.b) this.f386133d).e(bundle);
        this.f386134e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        it.b();
        it.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        return f0Var;
    }
}
