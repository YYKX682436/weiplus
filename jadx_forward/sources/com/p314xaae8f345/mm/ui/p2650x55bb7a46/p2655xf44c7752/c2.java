package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class c2 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f282361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 f282362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 f282363c;

    public c2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var, long j17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var) {
        this.f282363c = d2Var;
        this.f282361a = j17;
        this.f282362b = k1Var;
    }

    public void a(java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "isPlaying : " + bool);
        if (bool.booleanValue()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.a(this.f282363c, false, this.f282361a);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g2 g2Var = this.f282362b.f282633r;
        if (g2Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d5) g2Var).f282399a;
            if (viewOnClickListenerC21748xb3d38e6b.f282144g == null) {
                return;
            }
            viewOnClickListenerC21748xb3d38e6b.o9(false);
            viewOnClickListenerC21748xb3d38e6b.c9();
            viewOnClickListenerC21748xb3d38e6b.f282144g.m79606x510f45c9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o);
        }
    }
}
