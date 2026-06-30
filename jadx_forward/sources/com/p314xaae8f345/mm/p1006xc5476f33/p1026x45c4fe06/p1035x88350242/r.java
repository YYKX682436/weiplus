package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class r implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb1.h f158268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fb1.h f158269e;

    public r(fb1.h hVar) {
        this.f158269e = hVar;
        this.f158268d = hVar;
    }

    @Override // fb1.h
    public void a(fb1.c status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageMainService", "onStatusChange, status: " + status);
        this.f158269e.a(status);
    }

    @Override // fb1.h
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo10388x95c7fa5f() {
        return this.f158268d.mo10388x95c7fa5f();
    }
}
