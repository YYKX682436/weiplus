package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class x extends lk0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f158278e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f158279d;

    public x(p012xc85e97e9.p093xedfae76a.b0 lifecycleRegistry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleRegistry, "lifecycleRegistry");
        this.f158279d = lifecycleRegistry;
    }

    @Override // lk0.f
    public void f(android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("lifecycleOnDestroy", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "LifecycleSendStub.onCallback, onDestroy");
            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.w(this));
        }
    }
}
