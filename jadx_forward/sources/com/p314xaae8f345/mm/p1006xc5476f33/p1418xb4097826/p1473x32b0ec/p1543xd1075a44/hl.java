package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f200106a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn f200107b;

    public hl(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b giftPlayView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftPlayView, "giftPlayView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f200106a = giftPlayView;
        this.f200107b = plugin;
    }

    public final void a() {
        tn0.w0 Z0 = this.f200107b.Z0();
        if (Z0 != null) {
            Z0.G0();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f200106a;
        c22789xd23e9a9b.setVisibility(8);
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.setAlpha(1.0f);
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        c22789xd23e9a9b.setClickable(true);
    }

    public final void b(boolean z17, ce2.i giftInfo, java.lang.String customText, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customText, "customText");
        this.f200106a.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.el(this, customText, giftInfo, z17, str));
    }
}
