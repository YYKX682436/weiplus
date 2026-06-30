package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class n4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f168433a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f168434b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c5 f168435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f168438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168439g;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c5 c5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, long j17) {
        this.f168439g = i3Var;
        this.f168435c = c5Var;
        this.f168436d = str;
        this.f168437e = wdVar;
        this.f168438f = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    public void a() {
        boolean z17 = this.f168434b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c5 c5Var = this.f168435c;
        if (z17) {
            nd1.o0 o0Var = (nd1.o0) c5Var;
            o0Var.f417893a.a(o0Var.f417899g, o0Var.f417900h.o("fail cancel"));
        } else {
            if (this.f168439g.f168235e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageContainer", "attempt to proceed but destroyed, url[%s], type[%s]", this.f168436d, this.f168437e);
                nd1.o0 o0Var2 = (nd1.o0) c5Var;
                o0Var2.f417893a.a(o0Var2.f417899g, o0Var2.f417900h.o("fail:internal error"));
                return;
            }
            if (this.f168433a) {
                return;
            }
            this.f168433a = true;
            nd1.o0 o0Var3 = (nd1.o0) c5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = o0Var3.f417893a;
            yVar.m(new nd1.n0(o0Var3.f417894b, o0Var3.f417895c, o0Var3.f417896d, o0Var3.f417897e, o0Var3.f417898f, yVar, o0Var3.f417899g, o0Var3.f417900h));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f168439g.f168252y.b(this.f168438f, str, obj, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    /* renamed from: cancel */
    public void mo52131xae7a2e7a() {
        this.f168434b = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    /* renamed from: setAnimationEnabled */
    public void mo52132x15e8c79f(boolean z17) {
    }
}
