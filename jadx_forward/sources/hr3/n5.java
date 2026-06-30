package hr3;

/* loaded from: classes8.dex */
public final class n5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(0);
        this.f365356d = activityC16846x5788f028;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365356d;
        intent.putExtra("rawUrl", activityC16846x5788f028.f235244w);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(activityC16846x5788f028, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
