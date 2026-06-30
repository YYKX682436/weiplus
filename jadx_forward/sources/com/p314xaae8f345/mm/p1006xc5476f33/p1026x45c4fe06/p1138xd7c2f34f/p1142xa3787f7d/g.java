package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

/* loaded from: classes7.dex */
public final class g implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.g f166729d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.g();

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = str;
        objArr[1] = w0Var != null ? java.lang.Integer.valueOf(w0Var.f398507b) : null;
        objArr[2] = w0Var != null ? w0Var.f398509d : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "collectionStorage onNotifyChanged event: %s, eventId: %s, eventData.obj: %s", objArr);
        if (w0Var != null && w0Var.f398507b == 3) {
            z17 = true;
        }
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "batch") && w0Var.f398509d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.f166733a;
            ((ku5.t0) ku5.t0.f394148d).b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.f.f166728d, "AppBrandTeenModeReporter");
        }
    }
}
