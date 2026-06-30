package dt;

/* loaded from: classes9.dex */
public class z5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public z5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.tx txVar = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6123x96acf63) abstractC20979x809547d1).f136396g;
        android.content.Context context = txVar.f89573b;
        java.lang.String str = txVar.f89572a;
        if (context == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return false;
    }
}
