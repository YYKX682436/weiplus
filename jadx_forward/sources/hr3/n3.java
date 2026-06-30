package hr3;

/* loaded from: classes8.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(0);
        this.f365353d = activityC16844x18232797;
        this.f365354e = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365353d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16844x18232797.f235219r)) {
            activityC16844x18232797.f235219r = this.f365354e.C1;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16844x18232797.f235219r)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", activityC16844x18232797.f235219r);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(activityC16844x18232797, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        return jz5.f0.f384359a;
    }
}
