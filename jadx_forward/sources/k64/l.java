package k64;

/* loaded from: classes4.dex */
public abstract class l {
    public static final void a(r45.mr5 request, int i17, java.lang.String cgiUrl, yz5.l cgiCallback, r45.js5 js5Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiUrl, "cgiUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCallback, "cgiCallback");
        if (js5Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IPCCgiRequestHelper", "IPCrequestCgi() called with: request = " + request + ", funcId = " + i17 + ' ' + z17);
        yz5.l iVar = z17 ? new k64.i(new java.lang.ref.WeakReference(cgiCallback)) : new k64.j(cgiCallback);
        try {
            o64.a aVar = new o64.a();
            aVar.d(new k64.n());
            aVar.c(new k64.k(iVar, js5Var));
            q64.a a17 = aVar.a();
            if (a17 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("req_pb_class_name", request.getClass().getName());
                bundle.putString("resp_pb_class_name", js5Var.getClass().getName());
                try {
                    bundle.putByteArray("req_pb_bytes", request.mo14344x5f01b1f6());
                } catch (java.lang.Throwable unused) {
                }
                bundle.putInt("funcId", i17);
                bundle.putString("cgiUrl", cgiUrl);
                ((r64.b) a17).c(bundle);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IPCCgiRequestHelper", "the ipc request object is null, please check the log to find the reason!");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("IPCCgiRequestHelper", th6, "requestCgi error, funcId = " + i17, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
    }
}
