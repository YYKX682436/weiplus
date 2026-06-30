package dv2;

/* loaded from: classes2.dex */
public final class p1 extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f325461b = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, false);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dv2.s1 f325462c;

    public p1(dv2.s1 s1Var) {
        this.f325462c = s1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: fragments */
    public java.util.List mo60926x16b96823() {
        java.util.ArrayList d17 = kz5.c0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14052x58d21d28());
        if (this.f325461b) {
            d17.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14089xca1fbff2());
        }
        return d17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: isDynamic */
    public boolean mo55745x5c16a7b5() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabContainer */
    public zx2.a0 mo60927xca37646c() {
        return new dv2.r1(this.f325462c);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15437xe70dc080, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabs */
    public java.util.List mo60929x36337e() {
        dv2.s1 s1Var = this.f325462c;
        java.util.ArrayList d17 = kz5.c0.d(new dv2.q1(s1Var, s1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573464lw1), 7));
        if (this.f325461b) {
            d17.add(new dv2.q1(s1Var, s1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.m9a), 8));
        }
        return d17;
    }
}
