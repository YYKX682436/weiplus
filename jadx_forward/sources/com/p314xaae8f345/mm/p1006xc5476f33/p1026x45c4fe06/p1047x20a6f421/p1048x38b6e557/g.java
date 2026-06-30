package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes15.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f159200a;

    /* renamed from: b, reason: collision with root package name */
    public int f159201b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.b f159202c;

    /* renamed from: d, reason: collision with root package name */
    public long f159203d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.Future f159204e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f f159205f;

    public g(java.lang.String simpleProcessName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleProcessName, "simpleProcessName");
        this.f159200a = simpleProcessName;
        this.f159201b = 2;
        this.f159202c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.b();
        this.f159203d = -1L;
        this.f159205f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f(this);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g gVar) {
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "flushLogBuffer");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6.class.getClassLoader());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.b bVar = gVar.f159202c;
        int i17 = bVar.f159179b + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6[] c11850xe7d6d5d6Arr = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6 c11850xe7d6d5d6 = bVar.f159178a[i18];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11850xe7d6d5d6);
            c11850xe7d6d5d6Arr[i18] = c11850xe7d6d5d6;
        }
        bVar.f159179b = -1;
        bVar.f159180c = 0;
        bundle.putParcelableArray("BatchLogInfo", c11850xe7d6d5d6Arr);
        uk0.a.d(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.e.f159195a);
        gVar.f159204e = null;
    }

    public final void b(int i17, java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.c(this, i17, str), "ConsoleDebugLog");
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logD */
    public void mo40552x32c580(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 3 >= this.f159201b) {
            b(3, "[" + this.f159200a + "] " + str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logE */
    public void mo40553x32c581(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 6 >= this.f159201b) {
            b(6, "[" + this.f159200a + ']' + str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logI */
    public void mo40555x32c585(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 4 >= this.f159201b) {
            b(4, "[" + this.f159200a + "] " + str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logV */
    public void mo40556x32c592(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 2 >= this.f159201b) {
            b(2, "[" + this.f159200a + "] " + str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logW */
    public void mo40557x32c593(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 5 >= this.f159201b) {
            b(5, "[" + this.f159200a + "] " + str4);
        }
    }
}
