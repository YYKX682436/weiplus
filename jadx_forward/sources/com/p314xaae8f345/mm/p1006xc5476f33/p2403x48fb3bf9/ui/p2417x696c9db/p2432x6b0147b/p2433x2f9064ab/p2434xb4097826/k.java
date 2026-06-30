package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/k;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes2.dex */
public final class k implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Yk;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        if (c10756x2a5d7b2d != null) {
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            if (!(str == null || str.length() == 0)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String str2 = c10756x2a5d7b2d.f149939d;
                if (str2 == null) {
                    str2 = "";
                }
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                android.os.Bundle bundle2 = new android.os.Bundle();
                try {
                    cl0.g gVar = new cl0.g(str2);
                    java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("nonceId");
                    java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("exportId");
                    i95.m c17 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 wi6 = cq.k.wi((cq.k) c17, mo15082x48bce8a42, 0, 2, null);
                    if (wi6 == null || (Yk = wi6.getFeedObject()) == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
                        Yk = l7Var.Yk(0L, mo15082x48bce8a4, 6, mo15082x48bce8a42);
                    }
                    java.lang.Long nl6 = l7Var.nl(str2, 6);
                    long longValue = nl6 != null ? nl6.longValue() : 0L;
                    int j17 = Yk != null ? hc2.o0.j(Yk) : 0;
                    bundle2.putLong("localFeedId", longValue);
                    bundle2.putLong("mediaType", j17);
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCommonFeatureService", "json parse failed !");
                    bundle2 = new android.os.Bundle();
                }
                if (rVar != null) {
                    rVar.a(bundle2);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data invalid");
        bundle.putLong("localFeedId", 0L);
        bundle.putLong("mediaType", 0L);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
