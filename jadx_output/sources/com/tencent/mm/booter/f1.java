package com.tencent.mm.booter;

/* loaded from: classes10.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.a1 f63333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f63335f;

    public f1(com.tencent.mm.booter.a1 a1Var, java.lang.String str, long j17) {
        this.f63333d = a1Var;
        this.f63334e = str;
        this.f63335f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f63333d.f63300c;
        java.lang.String str = this.f63334e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f63333d.f63299b);
        sb6.append('-');
        sb6.append(this.f63333d.f63298a);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.booter.a1 a1Var = this.f63333d;
        ap.a.a(1, "notifyDisorderJump", null, null, str, sb7, java.lang.String.valueOf(a1Var.f63299b - a1Var.f63298a), java.lang.String.valueOf(this.f63333d.f63300c));
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.booter.e1(i17, this.f63335f, this.f63334e), 60000L);
    }
}
