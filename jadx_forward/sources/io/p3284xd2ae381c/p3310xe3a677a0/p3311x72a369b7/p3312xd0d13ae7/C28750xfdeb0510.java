package io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7;

@qz5.f(c = "io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2", f = "PatchedConnectivity.kt", l = {}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2 */
/* loaded from: classes11.dex */
public final class C28750xfdeb0510 extends qz5.l implements yz5.p {

    /* renamed from: label */
    int f71924x61f7ef4;

    /* renamed from: this$0 */
    final /* synthetic */ io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e f71925xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28750xfdeb0510(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e c28749xce279e1e, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28750xfdeb0510> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f71925xcbdd23aa = c28749xce279e1e;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        return new io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28750xfdeb0510(this.f71925xcbdd23aa, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String m138866x85cb7071;
        pz5.a aVar = pz5.a.f440719d;
        if (this.f71924x61f7ef4 != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            android.net.NetworkCapabilities networkCapabilities = this.f71925xcbdd23aa.getConnectivityManager().getNetworkCapabilities(this.f71925xcbdd23aa.getConnectivityManager().getActiveNetwork());
            if (networkCapabilities == null) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
            }
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
            m138866x85cb7071 = this.f71925xcbdd23aa.m138866x85cb7071();
            return m138866x85cb7071;
        } catch (java.lang.Exception unused) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        }
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super java.lang.String> interfaceC29045xdcb5ca57) {
        return ((io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28750xfdeb0510) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
