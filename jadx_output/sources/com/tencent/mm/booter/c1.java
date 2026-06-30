package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f63311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f63313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f63314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f63315h;

    public c1(java.util.LinkedHashMap linkedHashMap, java.lang.String str, long j17, long j18, long j19) {
        this.f63311d = linkedHashMap;
        this.f63312e = str;
        this.f63313f = j17;
        this.f63314g = j18;
        this.f63315h = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = this.f63312e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f63313f);
        sb6.append('-');
        sb6.append(this.f63314g);
        strArr[1] = sb6.toString();
        strArr[2] = java.lang.String.valueOf(this.f63315h);
        com.tencent.mm.booter.u2 u2Var = com.tencent.mm.booter.u2.f63578a;
        strArr[3] = ((java.lang.Boolean) ((jz5.n) com.tencent.mm.booter.u2.f63579b).getValue()).booleanValue() ? "1" : "0";
        ap.a.a(1, "notifyDisorder", null, this.f63311d, strArr);
    }
}
