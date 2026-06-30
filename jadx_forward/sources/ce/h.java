package ce;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 W;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f122204p0;

    public h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var) {
        super(context, i3Var);
        m52231x4e564163(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePage", "hy: WAGamePage on create");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void C(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        this.f122204p0 = str;
        this.W.r2(j17, str, wdVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void E() {
        mo14683xad58292c();
        this.W.v2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void F() {
        mo14683xad58292c();
        this.W.A2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void G() {
        mo14683xad58292c();
        L();
        setVisibility(0);
        m147199x8e764904(this.W.o2());
        this.W.C2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentPageView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37() {
        return this.W;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentUrl */
    public java.lang.String mo14683xad58292c() {
        return this.f122204p0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void k() {
        this.W.h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public android.view.View p() {
        if (this.W == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 o17 = m52223xe6eebdcb().o(this.f122204p0);
            this.W = o17;
            o17.W = this;
            java.lang.String mo14683xad58292c = mo14683xad58292c();
            o17.D = nf.z.a(mo14683xad58292c);
            o17.E = mo14683xad58292c;
        }
        return this.W.mo51310xc2a54588();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void r(java.lang.String str, java.lang.String str2, int[] iArr) {
        this.W.g(str, str2);
    }

    /* renamed from: setCurrentUrl */
    public void m14684xdb7c7738(java.lang.String str) {
        this.f122204p0 = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: setInitialUrl */
    public void mo14685x5050858d(java.lang.String str) {
        this.f122204p0 = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 u(int i17) {
        if (this.W.mo50260x9f1221c2() == i17) {
            return this.W;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public boolean x(java.lang.String str) {
        return true;
    }
}
