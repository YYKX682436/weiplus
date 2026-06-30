package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class kc0 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f216488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f216489b;

    public kc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f216488a = nc0Var;
        this.f216489b = activityC0065xcd7aa112;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
        java.util.List m82898xfb7e5820;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f216488a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nc0Var.f216842d, "onScrollStatsChanged");
        int i17 = data.f374685e;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = nc0Var.f216850o;
        int size = (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) ? 0 : m82898xfb7e5820.size();
        if (!nc0Var.f216853r && i17 != -1 && size - i17 <= 10 && size > 0) {
            nc0Var.Q6().v();
        }
        java.util.LinkedList linkedList = data.f374689i;
        if (!linkedList.isEmpty()) {
            p3325xe03a0797.p3326xc267989b.l.d(nc0Var.mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jc0(linkedList, this.f216489b, null), 3, null);
        }
    }
}
