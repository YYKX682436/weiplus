package com.p314xaae8f345.mm.p2825x7e128009;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/xeffect/WeVisReportWrapper;", "Lcom/tencent/mm/xeffect/IWeVisReport;", "", dm.i4.f66865x76d1ec5a, "", "value", "Ljz5/f0;", "report", "TAG", "Ljava/lang/String;", "impl", "Lcom/tencent/mm/xeffect/IWeVisReport;", "getImpl", "()Lcom/tencent/mm/xeffect/IWeVisReport;", "setImpl", "(Lcom/tencent/mm/xeffect/IWeVisReport;)V", "<init>", "()V", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.WeVisReportWrapper */
/* loaded from: classes10.dex */
public final class C22975x1301938d implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22962xebd11a3d {
    private static com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22962xebd11a3d impl;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p2825x7e128009.C22975x1301938d f39983x4fbc8495 = new com.p314xaae8f345.mm.p2825x7e128009.C22975x1301938d();
    private static final java.lang.String TAG = TAG;
    private static final java.lang.String TAG = TAG;

    private C22975x1301938d() {
    }

    /* renamed from: getImpl */
    public final com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22962xebd11a3d m83792xfb80ca96() {
        return impl;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22962xebd11a3d
    /* renamed from: report */
    public void mo83679xc84c5534(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22962xebd11a3d interfaceC22962xebd11a3d = impl;
        if (interfaceC22962xebd11a3d != null) {
            interfaceC22962xebd11a3d.mo83679xc84c5534(j17, str);
        } else {
            com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b(TAG, "no report impl", new java.lang.Object[0]);
        }
    }

    /* renamed from: setImpl */
    public final void m83793x764b91a2(com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22962xebd11a3d interfaceC22962xebd11a3d) {
        impl = interfaceC22962xebd11a3d;
    }
}
