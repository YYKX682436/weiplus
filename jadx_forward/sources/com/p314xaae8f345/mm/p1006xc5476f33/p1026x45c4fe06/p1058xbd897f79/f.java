package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.PowerManager.WakeLock f159829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p f159830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159831c;

    public f(android.os.PowerManager.WakeLock wakeLock, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar, java.lang.String str) {
        this.f159829a = wakeLock;
        this.f159830b = pVar;
        this.f159831c = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p
    public void a(int i17, java.lang.String str) {
        android.os.PowerManager.WakeLock wakeLock = this.f159829a;
        if (wakeLock != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j.f159837a, wakeLock, this.f159831c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159830b;
        if (pVar != null) {
            pVar.a(i17, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p
    /* renamed from: onSuccess */
    public void mo50232xe05b4124(java.lang.String processName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        android.os.PowerManager.WakeLock wakeLock = this.f159829a;
        if (wakeLock != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j.f159837a, wakeLock, this.f159831c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159830b;
        if (pVar != null) {
            pVar.mo50232xe05b4124(processName);
        }
    }
}
