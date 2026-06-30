package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class n0 implements com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 f129033a;

    public n0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var) {
        this.f129033a = a0Var;
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: getAbTest */
    public java.lang.String mo32132x1029ef49(java.lang.String str) {
        return j62.e.g().a(str, "", true, true);
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: getAbsolutePath */
    public java.lang.String mo32133x1d57e4b2(java.lang.String str) {
        java.lang.String o17;
        if (!str.startsWith("wxfile://")) {
            return str;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.f129033a;
        return (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) a0Var.F()).mo50354x59eafec1() == null || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) a0Var.F()).mo50354x59eafec1().mo49620x1d537609(str) == null || (o17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) a0Var.F()).mo50354x59eafec1().mo49620x1d537609(str).o()) == null) ? "" : o17;
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: getExternalConfig */
    public boolean mo32134xb7705be3(java.lang.String str, boolean z17) {
        return j62.e.g().l(str, z17, true, true);
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: reportEvent */
    public void mo32135xefe04dc6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }
}
