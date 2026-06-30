package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c f177094d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f177095e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f177096f;

    /* renamed from: g, reason: collision with root package name */
    public int f177097g;

    /* renamed from: h, reason: collision with root package name */
    public int f177098h;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 f0Var) {
        super(f0Var);
        this.f177097g = 0;
        this.f177098h = 0;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f177095e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c>(a0Var) { // from class: com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$1
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c) {
                android.view.View mo54477x6a486239;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c2 = c5568xa650f04c;
                long j17 = c5568xa650f04c2.f135888g.f88480c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.this;
                java.util.Iterator it = uVar.f177094d.f177057e.iterator();
                int i17 = -1;
                int i18 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i18++;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((wv1.a) it.next()).f531463b;
                    if (f9Var != null && f9Var.m124847x74d37ac6() == j17) {
                        i17 = i18;
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 f0Var2 = uVar.f177061b;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) uVar.b(f0Var2.mo54478x76847179());
                int w17 = c1161x57298f5d.w();
                int y17 = c1161x57298f5d.y();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "[getPhotoInfo] msgId:%s pos:%s [%s:%s]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(w17), java.lang.Integer.valueOf(y17));
                if (i17 >= w17 && i17 <= y17 && (mo54477x6a486239 = f0Var2.mo54477x6a486239(i17 - w17)) != null) {
                    int[] iArr = new int[2];
                    mo54477x6a486239.getLocationInWindow(iArr);
                    int i19 = iArr[0];
                    am.je jeVar = c5568xa650f04c2.f135889h;
                    jeVar.f88560a = i19;
                    jeVar.f88561b = iArr[1];
                    jeVar.f88562c = mo54477x6a486239.getWidth();
                    jeVar.f88563d = mo54477x6a486239.getHeight();
                }
                return false;
            }
        };
    }

    public static xv1.b a(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar) {
        return uVar.f177061b.f6();
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager b(android.content.Context context) {
        if (this.f177096f == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 4);
            this.f177096f = c1161x57298f5d;
            c1161x57298f5d.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.q(this);
        }
        return this.f177096f;
    }

    public void c(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            this.f177062c.clear();
            this.f177097g = 0;
        }
        this.f177094d.f177063h = true;
        this.f177061b.P(z17);
        gm0.j1.i();
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.t(this, str, str2, z17));
    }
}
