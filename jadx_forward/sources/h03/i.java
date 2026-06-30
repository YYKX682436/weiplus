package h03;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f359424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359424d = activity;
        this.f359425e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h03.i(this.f359424d, this.f359425e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h03.i iVar = (h03.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.app.Activity activity = this.f359424d;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f359425e);
            intent.putExtra("forceHideShare", true);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent.putExtra("convertActivityFromTranslucent", true), null);
        }
        return jz5.f0.f384359a;
    }
}
