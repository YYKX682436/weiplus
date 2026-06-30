package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class z2 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 f240094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f240095b;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 b3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f240094a = b3Var;
        this.f240095b = activityC0065xcd7aa112;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
        java.util.List m82898xfb7e5820;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onScrollStatsChanged");
        int i17 = data.f374685e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 b3Var = this.f240094a;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = b3Var.f239890m;
        int size = (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) ? 0 : m82898xfb7e5820.size();
        if (!b3Var.f239895r && i17 != -1 && size - i17 <= 10 && size > 0) {
            b3Var.P6().v();
        }
        java.util.LinkedList linkedList = data.f374689i;
        if (!linkedList.isEmpty()) {
            p3325xe03a0797.p3326xc267989b.l.d(b3Var.mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y2(linkedList, b3Var, this.f240095b, null), 3, null);
        }
    }
}
