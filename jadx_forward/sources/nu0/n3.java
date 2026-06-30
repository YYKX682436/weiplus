package nu0;

/* loaded from: classes5.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(nu0.b4 b4Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421578d = b4Var;
        this.f421579e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.n3(this.f421578d, this.f421579e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nu0.b4 b4Var = this.f421578d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = b4Var.S;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f421579e;
        boolean z17 = false;
        if (u3Var2 == null) {
            b4Var.S = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(b4Var.m80379x76847179(), str, false, 3, null);
            return f0Var;
        }
        if (u3Var2 != null) {
            if (str == null) {
                str = "";
            }
            u3Var2.setMessage(str);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = b4Var.S;
        if (u3Var3 != null && u3Var3.isShowing()) {
            z17 = true;
        }
        if (!z17 && (u3Var = b4Var.S) != null) {
            u3Var.show();
        }
        return f0Var;
    }
}
