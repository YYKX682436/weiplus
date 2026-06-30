package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f128788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f128790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.t f128791g;

    public s(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str, int i17) {
        this.f128791g = tVar;
        this.f128788d = e9Var;
        this.f128789e = str;
        this.f128790f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f128788d;
        if (!e9Var.mo50262x39e05d35() || (V0 = e9Var.V0()) == null) {
            return;
        }
        ie.d N = ie.d.N(V0.mo51310xc2a54588());
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.t tVar = this.f128791g;
        int i17 = this.f128790f;
        if (N == null) {
            e9Var.a(i17, tVar.o("fail"));
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 mo53527xb5567791 = N.mo53527xb5567791();
        int m32059xd041a2b4 = mo53527xb5567791.m32059xd041a2b4();
        java.lang.String str = this.f128789e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            mo53527xb5567791.setText("");
        } else {
            if (m32059xd041a2b4 > 0) {
                if (str.length() > m32059xd041a2b4) {
                    str = str.substring(0, m32059xd041a2b4);
                }
                mo53527xb5567791.setText(str);
            } else {
                mo53527xb5567791.setText(str);
            }
            mo53527xb5567791.setSelection(mo53527xb5567791.getText().length());
        }
        e9Var.a(i17, tVar.o("ok"));
    }
}
