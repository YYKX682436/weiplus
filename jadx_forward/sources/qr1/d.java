package qr1;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12987xa57b7d50 f447594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f447595e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12987xa57b7d50 c12987xa57b7d50, android.app.Activity activity) {
        this.f447594d = c12987xa57b7d50;
        this.f447595e = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/chatting/component/ChattingBizFansComponent$showPrivacyDialogIfNeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f447594d.n0() == 5 ? "https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=11768825268OP3rA&version=1&lang=zh_CN&platform=2" : "https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=11761223096wMxxn&version=1&lang=zh_CN&platform=2");
        intent.putExtra("KRightBtn", true);
        j45.l.j(this.f447595e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/chatting/component/ChattingBizFansComponent$showPrivacyDialogIfNeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
