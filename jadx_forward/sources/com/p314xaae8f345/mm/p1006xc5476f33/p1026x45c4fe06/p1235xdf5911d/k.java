package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f173756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.os.Bundle bundle, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f173756d = bundle;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.k(this.f173756d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8 c12354xf2fbb9c8;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) this.f173756d.getParcelable("KEY_INIT_CONFIG");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) this.f173756d.getParcelable("KEY_STAT_OBJECT");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch appId:");
        sb6.append(c11809xbc286be4 != null ? c11809xbc286be4.f158811d : null);
        sb6.append(" statObject:");
        sb6.append(c12559xbdae8559 != null ? new java.lang.Integer(c12559xbdae8559.f169323f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", sb6.toString());
        if (c11809xbc286be4 != null && c12559xbdae8559 != null) {
            c11809xbc286be4.f128802b2 = c12559xbdae8559;
            vVar.j(null, c11809xbc286be4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a;
        android.view.View mo50154xfb86a31b = vVar.mo50154xfb86a31b();
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", "attachVirtualDisplay");
        android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.a aVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.c();
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.d.f173722d;
        android.hardware.display.VirtualDisplay.Callback callback = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.k.f173827b;
        if (i17 != 0 && i18 != 0) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context2.getSystemService("display");
            android.util.DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
            cVar.mo53768xc84d9cb4(i17, i18);
            android.hardware.display.VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#110", i17, i18, displayMetrics2.densityDpi, cVar.mo53764xcf572877(), 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.k.f173827b, null);
            if (createVirtualDisplay != null) {
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.k(context2, aVar2, createVirtualDisplay, mo50154xfb86a31b, cVar, dVar, 110, null);
            }
        }
        if (c11809xbc286be4 != null && (c12354xf2fbb9c8 = c11809xbc286be4.f158846z2) != null) {
            c12354xf2fbb9c8.f166009d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
        return jz5.f0.f384359a;
    }
}
