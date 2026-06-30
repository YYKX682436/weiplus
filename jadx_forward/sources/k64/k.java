package k64;

/* loaded from: classes4.dex */
public final class k implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js5 f386132e;

    public k(yz5.l lVar, r45.js5 js5Var) {
        this.f386131d = lVar;
        this.f386132e = js5Var;
    }

    @Override // p64.a
    /* renamed from: onCallbackFromServer */
    public final void mo69375xe57d25f1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
        yz5.l lVar = this.f386131d;
        r45.js5 js5Var = this.f386132e;
        if (bundle == null) {
            lVar.mo146xb9724478(new k64.b(-1, -1, "no response!", js5Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
            return;
        }
        byte[] byteArray = bundle.getByteArray("resp_pb_bytes");
        if (byteArray != null) {
            try {
                js5Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Throwable unused) {
            }
        }
        int i17 = bundle.getInt("resp_error_type", -1);
        int i18 = bundle.getInt("resp_error_code", -1);
        java.lang.String string = bundle.getString("resp_error_msg", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        lVar.mo146xb9724478(new k64.b(i17, i18, string, js5Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
    }
}
