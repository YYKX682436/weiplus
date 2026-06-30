package gs0;

/* loaded from: classes10.dex */
public final class q implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0.r f356543a;

    public q(gs0.r rVar) {
        this.f356543a = rVar;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        gs0.r rVar;
        int i17;
        while (true) {
            rVar = this.f356543a;
            boolean z17 = rVar.f356547d;
            i17 = rVar.f356544a;
            if (z17) {
                break;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int m69253x89b555ee = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69253x89b555ee(i17, java.lang.Math.max(0, rVar.f356551h), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(rVar.f356551h), java.lang.Integer.valueOf(m69253x89b555ee), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (java.lang.Math.abs(m69253x89b555ee - rVar.f356551h) <= 5) {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264TransEncoder", "thread sleep error");
                }
            }
            rVar.f356551h = m69253x89b555ee;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (!rVar.f356548e) {
            rVar.f356551h = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69253x89b555ee(i17, rVar.f356551h, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", "end: trgger encode use %dms, curEncode index %d, markCancel %s, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(rVar.f356551h), java.lang.Boolean.valueOf(rVar.f356548e), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        return jz5.f0.f384359a;
    }
}
