package k71;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f386208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f386209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17) {
        super(1);
        this.f386208d = activityC0065xcd7aa112;
        this.f386209e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f386208d;
        if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc) activityC0065xcd7aa112).getClass();
            v61.d.g("login_forget_password", 2);
        } else if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d) activityC0065xcd7aa112).getClass();
            v61.d.g("login_forget_password", 3);
        }
        java.lang.String str = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573938gi2) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(activityC0065xcd7aa112, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        int i17 = this.f386209e;
        if (i17 > 0) {
            v61.d.f(i17);
        }
        return jz5.f0.f384359a;
    }
}
