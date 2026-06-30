package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f92563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f92564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92565f;

    public a0(long j17, int i17, java.lang.String str) {
        this.f92563d = j17;
        this.f92564e = i17;
        this.f92565f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
        long j17 = this.f92563d;
        v1Var.Ri(j17);
        yz5.q qVar = com.tencent.mm.plugin.backup.roambackup.r0.f92690g;
        if (qVar != null) {
            qVar.invoke(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f92564e), java.lang.Boolean.TRUE);
        }
        com.tencent.mm.plugin.backup.roambackup.r0.a(com.tencent.mm.plugin.backup.roambackup.r0.f92684a, this.f92563d, this.f92565f, io1.b.f293458d, this.f92564e);
    }
}
