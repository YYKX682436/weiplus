package yw;

/* loaded from: classes9.dex */
public final class g2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547860b;

    public g2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a) {
        this.f547859a = abstractActivityC21394xb3d2c0cf;
        this.f547860b = c23232x91bb1d7a;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f547860b.m85536xb5887639());
        intent.putExtra("hide_option_menu", true);
        j45.l.j(this.f547859a, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
