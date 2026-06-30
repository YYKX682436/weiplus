package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.b1.class)
/* loaded from: classes5.dex */
public class pg extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.b1 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f281243e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f281244f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f281245g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f281246h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f281247i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ng(this);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f281248m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.og(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281249n;

    public pg() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281249n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.LbsComponent$3
            {
                this.f39173x3fe91575 = -772738789;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b) {
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b2 = c5672xb6c0812b;
                if (c5672xb6c0812b2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pg pgVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pg.this;
                    if (pgVar.f281243e && ((str = c5672xb6c0812b2.f135997g.f88959a) == null || str.equals(pgVar.f281246h))) {
                        int i17 = c5672xb6c0812b2.f135997g.f88960b;
                        if (i17 == 1) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(pgVar.f281247i);
                        } else if (i17 == 2) {
                            pgVar.f281243e = false;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(pgVar.f281248m);
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        this.f281249n.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f281249n.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.f281249n.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f281243e = this.f280113d.f542250l.m78383x21a1233e("lbs_mode", false).booleanValue();
        this.f281246h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280113d.u().J0()) ? this.f280113d.x() : this.f280113d.u().J0();
        this.f281244f = this.f280113d.f542250l.m78394x7e63ed49("lbs_ticket");
    }

    public java.lang.String m0(java.lang.String str) {
        if (!this.f281243e) {
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.LbsComponent", "[oneliang]encrypt:" + this.f281246h + ",raw:" + this.f280113d.x());
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f281246h) ? this.f280113d.x() : this.f281246h;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f281247i);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f281248m);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (this.f281243e) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class));
            jbVar.f280796e.m75501xb013b23e(true);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = jbVar.f280796e;
            android.widget.ImageButton imageButton = c19666xfd6e2f33.f271636z;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            c19666xfd6e2f33.r1(false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = jbVar.f280796e.f271580q;
            if (c22698xdfbd289f != null) {
                c22698xdfbd289f.setVisibility(8);
            }
        }
    }
}
