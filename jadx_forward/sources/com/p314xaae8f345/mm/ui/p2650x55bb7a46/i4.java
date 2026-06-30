package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes4.dex */
public class i4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f283366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 f283367i;

    public i4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var, boolean z17, java.lang.String str, int i17, java.lang.String str2, boolean z18) {
        this.f283367i = h4Var;
        this.f283362d = z17;
        this.f283363e = str;
        this.f283364f = i17;
        this.f283365g = str2;
        this.f283366h = z18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pt3.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.f237182g;
        bVar.a();
        boolean z17 = this.f283362d;
        int i18 = this.f283364f;
        java.lang.String str = this.f283363e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f283367i;
        if (!z17) {
            bVar.b(str, java.lang.System.currentTimeMillis());
            android.content.Intent intent = new android.content.Intent();
            if (!this.f283366h) {
                intent.putExtra("KRightBtn", true);
            }
            intent.putExtra("rawUrl", this.f283365g);
            j45.l.j(h4Var.f283178j.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(8, i18, h4Var.f283180l);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(11, i18, h4Var.f283180l);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setAction("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse(str));
        intent2.setPackage("com.tencent.weishi");
        intent2.setFlags(268435456);
        android.app.Activity g17 = h4Var.f283178j.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingFooterEventImpl$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/ChattingFooterEventImpl$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
