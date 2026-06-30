package cw1;

/* renamed from: cw1.a5$$r */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC28100x56f8b7e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac f304306d;

    public /* synthetic */ RunnableC28100x56f8b7e(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac) {
        this.f304306d = activityC13118x73d350ac;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = this.f304306d;
        long[] T6 = activityC13118x73d350ac.T6();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long[] jArr2 = new long[3];
        java.util.Map a17 = cw1.i.a(new int[][]{null, ot1.h.Q, ot1.h.T, ot1.h.Z, ot1.h.f430374x1}, 0, T6[0], T6[1], false, jArr2, null);
        if (a17 == null) {
            a17 = java.util.Collections.emptyMap();
        } else {
            mt1.b0.s(5, java.lang.System.currentTimeMillis() - currentTimeMillis, java.lang.Long.valueOf(jArr2[0] + jArr2[1]), java.lang.Long.valueOf(jArr2[0]), java.lang.Long.valueOf(jArr2[2]), java.lang.Long.valueOf(((java.util.HashMap) a17).size()));
        }
        activityC13118x73d350ac.f177283r = a17;
        activityC13118x73d350ac.W6();
    }
}
