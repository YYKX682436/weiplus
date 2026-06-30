package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f159827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p f159828c;

    public e(int i17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar) {
        this.f159826a = i17;
        this.f159827b = j17;
        this.f159828c = pVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p
    public void a(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError, requestId:");
        sb6.append(this.f159826a);
        sb6.append(", errCode:");
        sb6.append(l81.u0.f398611a.a(i17));
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f159827b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHeadlessStartService", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159828c;
        if (pVar != null) {
            pVar.a(i17, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p
    /* renamed from: onSuccess */
    public void mo50232xe05b4124(java.lang.String processName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSuccess, requestId:");
        sb6.append(this.f159826a);
        sb6.append(", cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f159827b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHeadlessStartService", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159828c;
        if (pVar != null) {
            pVar.mo50232xe05b4124(processName);
        }
    }
}
