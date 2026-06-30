package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 f274487d;

    public r3(com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 s3Var) {
        this.f274487d = s3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f274487d.a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.b().mo50294x9395cba4(new com.p314xaae8f345.mm.sdk.p2603x2137b148.q3(this));
    }

    /* renamed from: toString */
    public java.lang.String m77807x9616526c() {
        return super.toString() + "|" + this.f274487d.toString();
    }
}
