package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/GetWxInfoMpPageResponse;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 data = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            java.lang.String r17 = c01.z1.r();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = r17 == null ? "" : r17;
            java.lang.String l17 = c01.z1.l();
            java.lang.String d17 = (((kv.a0) i95.n0.c(kv.a0.class)) == null || (Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni()) == null || (n07 = Ni.n0(str)) == null) ? null : n07.d();
            java.lang.String str2 = d17 == null ? "" : d17;
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298(true, l17, str2, str, null, 16, null));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetWxInfoMpPageIPCTask", e17, "getWxInfo ipc", new java.lang.Object[0]);
            if (rVar != null) {
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "getWxInfo failed";
                }
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298(false, null, null, null, message, 14, null));
            }
        }
    }
}
