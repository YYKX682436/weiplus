package kp1;

/* loaded from: classes11.dex */
public final class d0 extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392425d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        this.f392425d = c12881xbe3683d3;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        this.f392425d.f174545v = true;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3 = this.f392425d;
        if (c12881xbe3683d3.f174545v) {
            c12881xbe3683d3.f174545v = false;
            c12881xbe3683d3.p(kp1.c0.f392420e);
        }
    }
}
