package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0 f158220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0 c0Var) {
        super(0);
        this.f158220d = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.keep, observe lifecycle");
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0 c0Var = this.f158220d;
        c0Var.f158224f.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeProxy$Companion$keep$1$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (p012xc85e97e9.p093xedfae76a.m.ON_DESTROY == event) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.keep, onDestroy");
                    java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0.f158221g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0 c0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0.this;
                    copyOnWriteArraySet.remove(c0Var2);
                    c0Var2.f158224f.c(this);
                }
            }
        });
        return jz5.f0.f384359a;
    }
}
