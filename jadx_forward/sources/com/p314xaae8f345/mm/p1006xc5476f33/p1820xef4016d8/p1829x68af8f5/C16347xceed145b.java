package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView */
/* loaded from: classes4.dex */
public class C16347xceed145b extends com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 {
    public static final java.lang.String U1 = lp0.b.D() + "hbstoryvideo/";
    public java.lang.String O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.c1 S1;
    public boolean T1;

    public C16347xceed145b(android.content.Context context) {
        super(context);
        this.R1 = false;
        k0();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoView", "%s onUIPause", N());
        if (this.f271274g) {
            this.f271282r = mo61523x898ffe25();
            this.f271283s = true;
            this.G = 0;
            this.F = 0;
            mo48231x65825f6();
            V();
            this.f271274g = false;
            H(600L, mo48229xc9e6d95a() + 11, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        if (this.f271274g) {
            return;
        }
        this.f271274g = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            if (this.f271283s) {
                mo48232x348b34();
            } else {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).E();
            }
        }
        H(600L, mo48229xc9e6d95a() + 10, 1L, false);
    }

    /* renamed from: getRealPlayDurationSec */
    public int m66134xdd2dfd95() {
        return this.R1 ? mo61527x6d590e18() : mo61523x898ffe25();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getSessionId */
    public java.lang.String mo66135x23a7af9b() {
        return this.O1;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        super.h(z17, str, i17);
        if (this.T1) {
            this.f153178l1 = str;
        }
    }

    public final void k0() {
        android.widget.LinearLayout linearLayout = this.f271278n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        java.lang.String str = U1;
        mo48224x6c9eb6a9(str);
        com.p314xaae8f345.mm.vfs.w6.t(str);
        mo48236x764cf626(true);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.c1 c1Var;
        this.R1 = true;
        if (this.L1 && (c1Var = this.S1) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.o0) c1Var).f227432a;
            int addAndGet = b1Var.f227365l.addAndGet(1);
            mo61527x6d590e18();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "sessionId: %s, current loop count: %s", b1Var.f227355b, java.lang.Integer.valueOf(addAndGet));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var2 = this.f271284t;
        if (b1Var2 != null) {
            b1Var2.E(mo66135x23a7af9b(), mo48228x75e04be9());
        }
        super.mo9755xa6db431b();
    }

    /* renamed from: setLocal */
    public void m66136x5351a029(boolean z17) {
        this.Q1 = z17;
    }

    /* renamed from: setLocalPreDownloadVideo */
    public void m66137x76130139(boolean z17) {
        this.T1 = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setMute */
    public void mo61536x764d819b(boolean z17) {
        super.mo61536x764d819b(z17);
        this.P1 = z17;
    }

    /* renamed from: setSessionId */
    public void m66138x7ffb700f(java.lang.String str) {
        this.O1 = str;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoView", "%s start cdnMediaId[%s] timeDuration[%d] isLocal[%s]", N(), this.f153183y0, java.lang.Integer.valueOf(this.A1), java.lang.Boolean.valueOf(this.Q1));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f4Var.mo69310x4edea88a())) {
                mo48232x348b34();
            } else {
                if (this.Q1 || this.T1) {
                    g0();
                    this.f153182x1 = 3;
                    return;
                }
                T();
                this.K1 = true;
                this.A1 = 0;
                this.f153182x1 = 1;
                t21.i0 i0Var = this.f153181x0;
                if (i0Var != null) {
                    i0Var.b(this.f153183y0, this.f153178l1, this.T);
                    this.f153181x0.d(this);
                }
                Q();
            }
            H(600L, mo48229xc9e6d95a() + 1, 1L, false);
        }
    }

    public C16347xceed145b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R1 = false;
        k0();
    }

    public C16347xceed145b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R1 = false;
        k0();
    }
}
