package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/FinderFeedInfoForVideoPlugin;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes2.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d != null) {
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            if (!(str == null || str.length() == 0)) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Yk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yk(pm0.v.Z(c10756x2a5d7b2d.f149939d), null, 184, "");
                if (Yk == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo failed finderObject null");
                    if (rVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177 c19481x7e1b7177 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177();
                        c19481x7e1b7177.f268509d = "";
                        rVar.a(c19481x7e1b7177);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo success localFeedId: " + c10756x2a5d7b2d.f149939d);
                if (rVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177 c19481x7e1b71772 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177();
                    java.lang.String str2 = c10756x2a5d7b2d.f149939d;
                    c19481x7e1b71772.f268509d = str2 != null ? str2 : "";
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    nv2.n1 n1Var = nv2.n1.f422084h;
                    c19481x7e1b71772.f268510e = ((java.lang.Boolean) n1Var.k(Yk).f384366d).booleanValue();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    nv2.o oVar = nv2.o.f422091e;
                    c19481x7e1b71772.f268511f = oVar.c(Yk);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    c19481x7e1b71772.f268512g = n1Var.l(Yk);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    c19481x7e1b71772.f268513h = oVar.b(Yk);
                    rVar.a(c19481x7e1b71772);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo localFeedId invalid");
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177 c19481x7e1b71773 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177();
            c19481x7e1b71773.f268509d = "";
            rVar.a(c19481x7e1b71773);
        }
    }
}
