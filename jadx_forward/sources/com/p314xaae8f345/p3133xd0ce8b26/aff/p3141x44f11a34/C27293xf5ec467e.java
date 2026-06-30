package com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34;

/* renamed from: com.tencent.wechat.aff.ext_device.ZIDL__YN8DBHBB */
/* loaded from: classes11.dex */
class C27293xf5ec467e extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.c f298217a;

    /* renamed from: ZIDL_AX */
    private native void m112628x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m112629x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m112630x1964d1dc(long j17, long j18, boolean z17);

    public void Q1(long j17, boolean z17) {
        m112630x1964d1dc(this.f60633xf042a733, j17, z17);
    }

    /* renamed from: ZIDL_AV */
    public void m112631x1964d17d(long j17) {
        iy4.c cVar = (iy4.c) this.f298217a;
        cVar.f377469b.post(new iy4.b(cVar, j17));
    }

    /* renamed from: ZIDL_BV */
    public void m112632x1964d19c(long j17) {
        iy4.c cVar = (iy4.c) this.f298217a;
        cVar.f377469b.post(new iy4.a(cVar, j17));
    }

    /* renamed from: ZIDL_C */
    public boolean m112633x9db8edfb() {
        ((iy4.c) this.f298217a).getClass();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().j("clicfg_ext_device_sync_record_android", "0", true, true), "1");
        ot5.g.c("MicroMsg.ExtDeviceService", "enableSyncRecordImpl: " + b17);
        return b17;
    }

    /* renamed from: ZIDL_DV */
    public void m112634x1964d1da(long j17) {
        iy4.c cVar = (iy4.c) this.f298217a;
        cVar.getClass();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().j("clicfg_ext_device_sync_record_android", "0", true, true), "1");
        ot5.g.c("MicroMsg.ExtDeviceService", "enableSyncRecordImpl: " + b17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.b bVar = cVar.f377468a;
        if (bVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.C27293xf5ec467e) bVar).Q1(j17, b17);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.c cVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.c) obj;
        this.f298217a = cVar;
        ((iy4.c) cVar).f377468a = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.b
    public void v0(long j17) {
        m112629x1964d19e(this.f60633xf042a733, j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.b
    public void y1(long j17) {
        m112628x1964d17f(this.f60633xf042a733, j17);
    }
}
