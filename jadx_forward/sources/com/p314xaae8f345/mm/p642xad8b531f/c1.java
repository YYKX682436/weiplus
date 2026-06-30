package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes11.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f144844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f144846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f144847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f144848h;

    public c1(java.util.LinkedHashMap linkedHashMap, java.lang.String str, long j17, long j18, long j19) {
        this.f144844d = linkedHashMap;
        this.f144845e = str;
        this.f144846f = j17;
        this.f144847g = j18;
        this.f144848h = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = this.f144845e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f144846f);
        sb6.append('-');
        sb6.append(this.f144847g);
        strArr[1] = sb6.toString();
        strArr[2] = java.lang.String.valueOf(this.f144848h);
        com.p314xaae8f345.mm.p642xad8b531f.u2 u2Var = com.p314xaae8f345.mm.p642xad8b531f.u2.f145111a;
        strArr[3] = ((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p642xad8b531f.u2.f145112b).mo141623x754a37bb()).booleanValue() ? "1" : "0";
        ap.a.a(1, "notifyDisorder", null, this.f144844d, strArr);
    }
}
