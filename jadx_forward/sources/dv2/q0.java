package dv2;

/* loaded from: classes2.dex */
public final class q0 extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.t0 f325464b;

    public q0(dv2.t0 t0Var) {
        this.f325464b = t0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 a(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        android.content.Intent intent = this.f325464b.m158354x19263085().getIntent();
        if (intent == null || (str2 = intent.getStringExtra("by_pass")) == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a c14067x53338e9a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("tabId", i17);
        bundle.putString("byPassInfo", str2);
        c14067x53338e9a.mo7562xe26dab14(bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c14067x53338e9a.f210797o = str;
        c14067x53338e9a.f210798p = i17;
        c14067x53338e9a.f191027x = z17;
        return c14067x53338e9a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: fragments */
    public java.util.List mo60926x16b96823() {
        dv2.t0 t0Var = this.f325464b;
        return kz5.c0.d(a(t0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4b), 1, true), a(t0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4g), 2, false));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: isDynamic */
    public boolean mo55745x5c16a7b5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabContainer */
    public zx2.a0 mo60927xca37646c() {
        return new dv2.s0(this.f325464b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabViewAction */
    public zx2.z mo60928xe5693ab0() {
        return new dv2.p0(this.f325464b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabs */
    public java.util.List mo60929x36337e() {
        dv2.t0 t0Var = this.f325464b;
        return kz5.c0.d(new dv2.r0(t0Var, t0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4b), 1), new dv2.r0(t0Var, t0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4g), 2));
    }
}
