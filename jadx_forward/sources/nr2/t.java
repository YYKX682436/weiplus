package nr2;

/* loaded from: classes2.dex */
public final class t extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final int f420837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f420838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nr2.j0 j0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(activityC0065xcd7aa112);
        this.f420838d = j0Var;
        this.f420837c = 1;
    }

    @Override // v92.g
    public void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f293405n = new nr2.r(this);
        bottomSheet.f293414s = new nr2.s(this);
    }

    @Override // v92.g
    public void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
    }

    @Override // v92.g
    public void h() {
        nr2.j0 j0Var = this.f420838d;
        nr2.m mVar = j0Var.f420753d;
        long l17 = mVar != null ? mVar.l() : 0L;
        android.app.Activity context = j0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{85, pm0.v.u(l17)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public int j() {
        return this.f420837c;
    }
}
