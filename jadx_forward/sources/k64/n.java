package k64;

/* loaded from: classes4.dex */
public final class n implements p64.b {
    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        r45.mr5 mr5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        if (bundle == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        }
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        }
        java.lang.String string = bundle.getString("req_pb_class_name", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = bundle.getString("resp_pb_class_name", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        byte[] byteArray = bundle.getByteArray("req_pb_bytes");
        int i17 = bundle.getInt("funcId", -1);
        java.lang.String string3 = bundle.getString("cgiUrl", "");
        if (r26.n0.N(string) || r26.n0.N(string2) || byteArray == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        }
        try {
            java.lang.Object newInstance = java.lang.Class.forName(string).newInstance();
            mr5Var = newInstance instanceof r45.mr5 ? (r45.mr5) newInstance : null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        if (mr5Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        }
        java.lang.Object newInstance2 = java.lang.Class.forName(string2).newInstance();
        r45.js5 js5Var = newInstance2 instanceof r45.js5 ? (r45.js5) newInstance2 : null;
        if (js5Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        }
        mr5Var.mo11468x92b714fd(byteArray);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        try {
            k64.h.a(mr5Var, i17, string3, new k64.m(bVar, this, i17), js5Var, false);
        } catch (java.lang.Throwable th7) {
            th = th7;
            android.util.Log.getStackTraceString(th);
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return bundle2;
        }
        android.os.Bundle bundle22 = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        return bundle22;
    }
}
