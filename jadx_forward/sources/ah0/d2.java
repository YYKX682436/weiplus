package ah0;

/* loaded from: classes.dex */
public class d2 implements j45.k {
    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        if (!c01.e2.a0()) {
            return false;
        }
        if ((!str.equals("com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI") && !str.equals("com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI") && !str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.class.getName()) && !str.equals("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI") && !str.equals("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI") && !str.equals("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI")) || !com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.g5.a()) {
            return false;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        ah0.c2 c2Var = new ah0.c2(this, context, intent);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 2097152L, null, c2Var, 3);
        return true;
    }
}
