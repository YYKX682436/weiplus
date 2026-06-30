package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class s implements sh1.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f170475e;

    public s(java.lang.String targetProcessName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetProcessName, "targetProcessName");
        this.f170474d = targetProcessName;
        this.f170475e = i17;
    }

    @Override // sh1.f
    public void a(int i17, java.lang.String event, java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewHandlerClient", "onNativeViewEvent viewId:" + i17 + " event:" + event + " params:" + params);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.f66865x76d1ec5a, this.f170475e);
        bundle.putInt("viewId", i17);
        bundle.putString("event", event);
        bundle.putString("params", params);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(this.f170474d, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.m.f170453d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.n.f170455d);
    }

    @Override // sh1.f
    public void d(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // sh1.f
    public void j() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.f66865x76d1ec5a, this.f170475e);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(this.f170474d, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.o.f170461d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.p.f170463d);
    }

    @Override // sh1.f
    public void l() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.f66865x76d1ec5a, this.f170475e);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(this.f170474d, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.q.f170465d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.r.f170472d);
    }
}
