package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public class j6 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282600e;

    public j6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str2, int i17) {
        this.f282600e = viewOnClickListenerC21748xb3d38e6b;
        this.f282596a = str;
        this.f282597b = f9Var;
        this.f282598c = str2;
        this.f282599d = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            g45.b.f350379a.a(this.f282596a, str, 0);
            k70.i0 i0Var = new k70.i0();
            i0Var.f386175a = 4;
            int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282600e;
            com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e W8 = viewOnClickListenerC21748xb3d38e6b.W8();
            if (W8 != null) {
                i0Var.f386185k = W8.c();
            }
            com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 U8 = viewOnClickListenerC21748xb3d38e6b.U8();
            if (U8 != null) {
                p15.m mVar = new p15.m();
                mVar.n(U8.f152791d);
                mVar.l(U8.f152792e);
                i0Var.f386186l = mVar;
            }
            c01.h7 h7Var = new c01.h7();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282597b;
            h7Var.f118760b = f9Var.m124847x74d37ac6();
            h7Var.f118762d = f9Var.Q0();
            i0Var.f386189o = h7Var;
            dk5.o0.a(this.f282596a, this.f282598c, this.f282599d, i0Var, h7Var, null, null, null);
            if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "EnterChattingAfterTrans config disabled, show normal toast for image forward");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(viewOnClickListenerC21748xb3d38e6b.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, viewOnClickListenerC21748xb3d38e6b.mo55332x76847179(), null, null);
        }
    }
}
