package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ay implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz f130408a;

    public ay(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar) {
        this.f130408a = qzVar;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2
    /* renamed from: clearTileCache */
    public final void mo36520x77a619a7() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130408a;
        if (qzVar == null) {
            return;
        }
        qzVar.e();
    }

    /* renamed from: equals */
    public final boolean m36521xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ay)) {
            return this.f130408a.m36944xb2c87fbf(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ay) obj).f130408a);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130408a;
        return qzVar == null ? "" : qzVar.y();
    }

    /* renamed from: hashCode */
    public final int m36522x8cdac1b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130408a;
        if (qzVar == null) {
            return 0;
        }
        return qzVar.m36945x8cdac1b();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2
    /* renamed from: reload */
    public final void mo36523xc84a8199() {
        if (this.f130408a == null) {
            return;
        }
        this.f130408a.a(!(r0.f132667r.m100003x4638c135() instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2
    /* renamed from: remove */
    public final void mo36524xc84af884() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130408a;
        if (qzVar == null) {
            return;
        }
        qzVar.mo36414xc84af884();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2
    /* renamed from: setDiskCacheDir */
    public final void mo36525x4a0927ea(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130408a;
        if (qzVar == null || qzVar.f132667r == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        qzVar.f132667r.m99994xb2cd9a68(str);
        qzVar.f132668s = qzVar.f();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2
    /* renamed from: setZindex */
    public final void mo36526x2e76bb9a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar = this.f130408a;
        if (qzVar == null) {
            return;
        }
        qzVar.a(i17);
    }
}
