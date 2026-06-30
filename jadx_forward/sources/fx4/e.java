package fx4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lfx4/e;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Args;", "Lcom/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Result;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class e extends com.p314xaae8f345.mm.p794xb0fa9b5e.g<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19348xa61b4a89> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49 data = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AddItemToPlayLaterIPCTask", "addItemToPlayLater executeAsync in main process");
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.mo11468x92b714fd(data.f265447d);
            java.lang.String b17 = lp0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getClientId(...)");
            if (!(b17.length() == 0) && lp0Var.d() != null) {
                int i17 = data.f265448e;
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                if (i17 == 1104) {
                    com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o.f299294b.a(lp0Var, i17, new fx4.i(new fx4.d(rVar)));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AddItemToPlayLaterIPCTask", "addItemToPlayLater data failed");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19348xa61b4a89(false));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AddItemToPlayLaterIPCTask", "addItemToPlayLater handle error: " + e17);
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19348xa61b4a89(false));
            }
        }
    }
}
