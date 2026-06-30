package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class w6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.OutputStream[] f274584a;

    public w6(java.io.OutputStream[] outputStreamArr) {
        this.f274584a = outputStreamArr;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        super.a(a7Var);
        this.f274584a[0] = null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        java.io.OutputStream b17 = a7Var.b();
        java.io.OutputStream[] outputStreamArr = this.f274584a;
        outputStreamArr[0] = b17;
        if (outputStreamArr[0] == null) {
            a(a7Var);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public boolean c() {
        return false;
    }
}
