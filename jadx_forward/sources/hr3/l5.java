package hr3;

/* loaded from: classes8.dex */
public final class l5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p670x38b72420.o f365277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, com.p314xaae8f345.mm.p670x38b72420.o oVar) {
        super(0);
        this.f365276d = activityC16846x5788f028;
        this.f365277e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365276d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16846x5788f028.f235238q)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((yq3.v) this.f365277e).f546068f;
            activityC16846x5788f028.f235238q = z3Var != null ? z3Var.C1 : null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16846x5788f028.f235238q)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", activityC16846x5788f028.f235238q);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(activityC16846x5788f028, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        return jz5.f0.f384359a;
    }
}
