package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

/* loaded from: classes7.dex */
public final class e implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.e f166727d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.e();

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = str;
        objArr[1] = w0Var != null ? java.lang.Integer.valueOf(w0Var.f398507b) : null;
        objArr[2] = w0Var != null ? w0Var.f398509d : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "starAppStorage onNotifyChanged event: %s, eventId: %s, eventData.obj: %s", objArr);
        if (w0Var != null && w0Var.f398507b == 2) {
            java.lang.Object obj = w0Var.f398509d;
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandStarAppStorage.AppBrandStarAppRecord");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.f166733a;
                ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.c((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t2) obj), "AppBrandTeenModeReporter");
                return;
            }
            return;
        }
        if (w0Var != null && w0Var.f398507b == 5) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj2 = w0Var.f398509d;
            if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandStarAppStorage.AppBrandStarAppRecord");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k kVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.f166733a;
                ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.d((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t2) obj2), "AppBrandTeenModeReporter");
            }
        }
    }
}
