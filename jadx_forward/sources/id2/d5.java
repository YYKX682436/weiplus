package id2;

/* loaded from: classes3.dex */
public final class d5 implements jl2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f372072d;

    public d5(id2.f5 f5Var) {
        this.f372072d = f5Var;
    }

    @Override // jl2.b
    public void b0(int i17, long j17, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this.f372072d.m158354x19263085()), null, null, new id2.c5(this.f372072d, j17, callback, null), 3, null);
    }

    @Override // jl2.b
    public void n(il2.a verifyData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyData, "verifyData");
        android.content.Intent intent = new android.content.Intent();
        id2.f5 f5Var = this.f372072d;
        f5Var.f372105i = true;
        java.util.HashMap hashMap = f5Var.f372104h;
        int i17 = verifyData.f373566a + 194735;
        hashMap.put(java.lang.Integer.valueOf(i17), verifyData);
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", verifyData.f373568c);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(f5Var.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, i17);
    }
}
