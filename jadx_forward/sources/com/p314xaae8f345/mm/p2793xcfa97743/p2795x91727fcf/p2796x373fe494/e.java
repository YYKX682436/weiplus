package com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494;

/* loaded from: classes8.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.g f295297d;

    public e(com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.g gVar) {
        this.f295297d = gVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 >= 0 && i17 < c22848x6ddd90cf.mo1894x7e414b06() - c22848x6ddd90cf.Z()) {
            this.f295297d.O6(i17, (com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.a) c22848x6ddd90cf.m82898xfb7e5820().get(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPHistoryData", "invalid position:" + i17);
        }
    }
}
