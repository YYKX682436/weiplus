package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceStatus;", "kotlin.jvm.PlatformType", "paramsBundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.b f158219a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.b();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        fb1.d dVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9.class.getClassLoader());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9 enumC11723x613ffaf9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9) bundle.getParcelable(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        fb1.c cVar = fb1.b.f342361a;
        if (enumC11723x613ffaf9 == null || (dVar = enumC11723x613ffaf9.f158217d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AVDeviceUsageClientService", "IPCSyncInvokeTask.invoke, scene is null");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, cVar)) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80(true, "");
            }
            if (cVar instanceof fb1.a) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80(false, ((fb1.a) cVar).f342360a);
            }
            throw new jz5.j();
        }
        lk0.f d17 = lk0.e.d(bundle.getBinder("onStatusChange"));
        fb1.c ec6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.q.f158264d.ec(dVar, bundle.getBoolean("shouldKeepObservingWhenBusy", false), d17 == null ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0(d17));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ec6, cVar)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80(true, "");
        }
        if (ec6 instanceof fb1.a) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80(false, ((fb1.a) ec6).f342360a);
        }
        throw new jz5.j();
    }
}
