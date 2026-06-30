package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class a3 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 f171915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f171916c;

    public a3(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var, long j17) {
        this.f171914a = str;
        this.f171915b = b3Var;
        this.f171916c = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        long j17 = this.f171916c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.a(this.f171914a, this.f171915b, (java.lang.String) obj, j17);
    }
}
