package vc3;

/* loaded from: classes7.dex */
public final class b implements cl.o {

    /* renamed from: a, reason: collision with root package name */
    public long f516789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 f516790b;

    public b(com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0) {
        this.f516790b = c5138xafbea1a0;
    }

    @Override // cl.o
    public void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f516789a = android.os.SystemClock.elapsedRealtime();
    }

    @Override // cl.o
    public void b(long j17, long j18) {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f516789a);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: js runtime created using ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - longValue);
            sb6.append(" and is node snapshot? ");
            sb6.append(this.f516790b.f135478c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBNodeJSRuntimeWrapper", sb6.toString());
        }
    }
}
