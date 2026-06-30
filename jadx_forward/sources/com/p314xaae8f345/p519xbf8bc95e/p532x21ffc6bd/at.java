package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class at implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040 {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz f130394a;

    /* renamed from: b, reason: collision with root package name */
    private int f130395b;

    public at(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar) {
        this.f130395b = -1;
        this.f130394a = qzVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = qzVar.f132213n;
        if (azVar == null || azVar.b() == null) {
            return;
        }
        this.f130395b = qzVar.f132213n.b().K;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040
    /* renamed from: clearDiskCache */
    public final void mo36407xafe7dc18() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        if (qzVar == null) {
            return;
        }
        qzVar.e();
    }

    /* renamed from: equals */
    public final boolean m36408xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.at)) {
            return this.f130394a.m36944xb2c87fbf(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.at) obj).f130394a);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        return qzVar == null ? "" : qzVar.y();
    }

    /* renamed from: hashCode */
    public final int m36410x8cdac1b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        if (qzVar == null) {
            return 0;
        }
        return qzVar.m36945x8cdac1b();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: isRemoved */
    public final boolean mo36411x1e855fd6() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        if (qzVar != null) {
            return qzVar.mo36411x1e855fd6();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: releaseData */
    public final void mo36412xcb03051() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        if (qzVar != null) {
            qzVar.mo36412xcb03051();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040
    /* renamed from: reload */
    public final void mo36413xc84a8199() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        if (qzVar == null) {
            return;
        }
        qzVar.a(true);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: remove */
    public final void mo36414xc84af884() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130394a;
        if (qzVar == null) {
            return;
        }
        qzVar.mo36414xc84af884();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, this.f130395b);
    }
}
