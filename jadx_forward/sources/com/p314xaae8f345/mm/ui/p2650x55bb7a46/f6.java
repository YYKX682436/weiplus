package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class f6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", dVar.x());
        intent.putExtra("rawUrl", erVar.f285459v);
        j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
