package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes10.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.a1 f144866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f144868f;

    public f1(com.p314xaae8f345.mm.p642xad8b531f.a1 a1Var, java.lang.String str, long j17) {
        this.f144866d = a1Var;
        this.f144867e = str;
        this.f144868f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f144866d.f144833c;
        java.lang.String str = this.f144867e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f144866d.f144832b);
        sb6.append('-');
        sb6.append(this.f144866d.f144831a);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p642xad8b531f.a1 a1Var = this.f144866d;
        ap.a.a(1, "notifyDisorderJump", null, null, str, sb7, java.lang.String.valueOf(a1Var.f144832b - a1Var.f144831a), java.lang.String.valueOf(this.f144866d.f144833c));
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p642xad8b531f.e1(i17, this.f144868f, this.f144867e), 60000L);
    }
}
