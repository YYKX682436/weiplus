package hr3;

/* loaded from: classes8.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(0);
        this.f365407d = activityC16844x18232797;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365407d;
        intent.putExtra("rawUrl", activityC16844x18232797.f235225x);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(activityC16844x18232797, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
