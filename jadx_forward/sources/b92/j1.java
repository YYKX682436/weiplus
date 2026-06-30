package b92;

/* loaded from: classes10.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f99976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f99977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(b92.v1 v1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99976d = v1Var;
        this.f99977e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b92.j1(this.f99976d, this.f99977e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f99977e;
        java.lang.String str = (java.lang.String) h0Var.f391656d;
        b92.v1 v1Var = this.f99976d;
        java.lang.String wi6 = b92.v1.wi(v1Var, str, "getIPUrl");
        if (!(wi6.length() == 0)) {
            return wi6;
        }
        java.lang.String str2 = (java.lang.String) v1Var.f100058g.get(h0Var.f391656d);
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }
}
