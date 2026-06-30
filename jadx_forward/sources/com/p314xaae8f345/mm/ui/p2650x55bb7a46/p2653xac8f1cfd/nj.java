package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes4.dex */
public class nj implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f281127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oj f281128e;

    public nj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oj ojVar, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        this.f281128e = ojVar;
        this.f281127d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.Activity g17 = this.f281128e.f281180b.f280113d.g();
        java.lang.String str = ((r45.vx) this.f281127d.f152151d).f470166g.f469455f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", true);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(g17, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}
