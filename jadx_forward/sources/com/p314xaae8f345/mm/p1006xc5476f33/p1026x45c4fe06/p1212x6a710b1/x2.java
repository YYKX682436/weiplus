package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class x2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 f172150a;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var) {
        this.f172150a = b3Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var = this.f172150a;
        if (str == null || !str.contains("11111")) {
            if (b3Var != null) {
                b3Var.b(str);
            }
        } else if (b3Var != null) {
            b3Var.mo1150xe05b4124(str);
        }
    }
}
