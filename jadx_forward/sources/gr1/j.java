package gr1;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gr1.k f356268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f356270f;

    public j(gr1.k kVar, android.content.Context context, int i17) {
        this.f356268d = kVar;
        this.f356269e = context;
        this.f356270f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/service/BizFansSafetyDelegate$createSafetyTipsBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356268d.getClass();
        int i17 = this.f356270f;
        java.lang.String str = i17 == 5 ? "https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=11768825268OP3rA&version=1&lang=zh_CN&platform=2" : "https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=11761223096wMxxn&version=1&lang=zh_CN&platform=2";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.SafetyDelegate", "jumpToSafetyTipsH5 serviceType=" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("KRightBtn", true);
        j45.l.j(this.f356269e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/service/BizFansSafetyDelegate$createSafetyTipsBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
