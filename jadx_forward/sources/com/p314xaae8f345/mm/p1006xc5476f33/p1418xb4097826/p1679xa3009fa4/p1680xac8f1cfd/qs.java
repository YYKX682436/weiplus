package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qs extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f217268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f217269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar) {
        super(0);
        this.f217268d = activityC0065xcd7aa112;
        this.f217269e = ptVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qd2.k0 k0Var = new qd2.k0(this.f217268d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ot(this.f217269e.K));
        qd2.g0 g0Var = k0Var.f443319c;
        android.hardware.Sensor sensor = g0Var.f443272c;
        if (sensor != null && !g0Var.f443274e) {
            g0Var.f443271b.registerListener(g0Var.f443273d, sensor, g0Var.f443275f);
            g0Var.f443274e = true;
        }
        return k0Var;
    }
}
