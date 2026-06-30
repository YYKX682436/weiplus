package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f272073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f272073d = i17;
        this.f272074e = h9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.o8(this.f272073d, this.f272074e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.o8 o8Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.o8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272074e;
        int i17 = this.f272073d;
        if (i17 >= 4 && i17 <= 10) {
            android.content.Context context = h9Var.f271893f;
            if (context != null) {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjm);
                e4Var.c();
            }
        } else if (i17 == 20) {
            android.content.Context context2 = h9Var.f271893f;
            if (context2 != null) {
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pch);
                e4Var2.c();
            }
        } else {
            h9Var.e();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k8 k8Var = h9Var.M;
        if (k8Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u8) k8Var).f281590a.u0();
        }
        return jz5.f0.f384359a;
    }
}
