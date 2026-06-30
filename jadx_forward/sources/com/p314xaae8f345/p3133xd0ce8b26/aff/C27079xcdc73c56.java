package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CDownloadResult */
/* loaded from: classes8.dex */
public class C27079xcdc73c56 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 f58963xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56();

    /* renamed from: en_queuetime */
    private long f58964x42fc8348;

    /* renamed from: end_time */
    private long f58965x66d9d3b1;

    /* renamed from: error_code */
    private int f58966x617e99c4;

    /* renamed from: file_size */
    private long f58967xb18ab0e4;

    /* renamed from: hasSetFields */
    private final boolean[] f58968xcb94b041 = new boolean[10];

    /* renamed from: recved_bytes */
    private long f58969x48c810b1;

    /* renamed from: start_time */
    private long f58970xa23bb48a;

    /* renamed from: svrfallback_count */
    private int f58971x48cf79a1;

    /* renamed from: task_ident */
    private java.lang.String f58972x4daa42b6;

    /* renamed from: trace_id */
    private long f58973x4bb73e55;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109840xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109841x7c90cfc0() {
        return f58963xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109842x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109843x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 c27079xcdc73c56 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f58966x617e99c4), java.lang.Integer.valueOf(c27079xcdc73c56.f58966x617e99c4)) && n51.f.a(this.f58972x4daa42b6, c27079xcdc73c56.f58972x4daa42b6) && n51.f.a(java.lang.Long.valueOf(this.f58967xb18ab0e4), java.lang.Long.valueOf(c27079xcdc73c56.f58967xb18ab0e4)) && n51.f.a(java.lang.Long.valueOf(this.f58969x48c810b1), java.lang.Long.valueOf(c27079xcdc73c56.f58969x48c810b1)) && n51.f.a(java.lang.Long.valueOf(this.f58964x42fc8348), java.lang.Long.valueOf(c27079xcdc73c56.f58964x42fc8348)) && n51.f.a(java.lang.Long.valueOf(this.f58970xa23bb48a), java.lang.Long.valueOf(c27079xcdc73c56.f58970xa23bb48a)) && n51.f.a(java.lang.Long.valueOf(this.f58965x66d9d3b1), java.lang.Long.valueOf(c27079xcdc73c56.f58965x66d9d3b1)) && n51.f.a(java.lang.Integer.valueOf(this.f58971x48cf79a1), java.lang.Integer.valueOf(c27079xcdc73c56.f58971x48cf79a1)) && n51.f.a(java.lang.Long.valueOf(this.f58973x4bb73e55), java.lang.Long.valueOf(c27079xcdc73c56.f58973x4bb73e55));
    }

    /* renamed from: getEnQueuetime */
    public long m109844x9f72037f() {
        return this.f58964x42fc8348;
    }

    /* renamed from: getEndTime */
    public long m109845xde00a612() {
        return this.f58965x66d9d3b1;
    }

    /* renamed from: getErrorCode */
    public int m109846x130a215f() {
        return this.f58966x617e99c4;
    }

    /* renamed from: getFileSize */
    public long m109847x50026913() {
        return this.f58967xb18ab0e4;
    }

    /* renamed from: getRecvedBytes */
    public long m109848x4e3ded30() {
        return this.f58969x48c810b1;
    }

    /* renamed from: getStartTime */
    public long m109849x8082fb99() {
        return this.f58970xa23bb48a;
    }

    /* renamed from: getSvrfallbackCount */
    public int m109850x1c498cb4() {
        return this.f58971x48cf79a1;
    }

    /* renamed from: getTaskIdent */
    public java.lang.String m109851x8f898b5() {
        return this.f58968xcb94b041[2] ? this.f58972x4daa42b6 : "";
    }

    /* renamed from: getTraceId */
    public long m109852xfe2df90a() {
        return this.f58973x4bb73e55;
    }

    /* renamed from: hasEnQueuetime */
    public boolean m109853xbf920dbb() {
        return m109856x6e095e9(5);
    }

    /* renamed from: hasEndTime */
    public boolean m109854x19572e4e() {
        return m109856x6e095e9(7);
    }

    /* renamed from: hasErrorCode */
    public boolean m109855xd2df8a9b() {
        return m109856x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m109856x6e095e9(int i17) {
        return this.f58968xcb94b041[i17];
    }

    /* renamed from: hasFileSize */
    public boolean m109857x7f7ce857() {
        return m109856x6e095e9(3);
    }

    /* renamed from: hasRecvedBytes */
    public boolean m109858x6e5df76c() {
        return m109856x6e095e9(4);
    }

    /* renamed from: hasStartTime */
    public boolean m109859x405864d5() {
        return m109856x6e095e9(6);
    }

    /* renamed from: hasSvrfallbackCount */
    public boolean m109860x870287f8() {
        return m109856x6e095e9(8);
    }

    /* renamed from: hasTaskIdent */
    public boolean m109861xc8ce01f1() {
        return m109856x6e095e9(2);
    }

    /* renamed from: hasTraceId */
    public boolean m109862x39848146() {
        return m109856x6e095e9(9);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109863x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58968xcb94b041[1]) {
                fVar.e(1, this.f58966x617e99c4);
            }
            java.lang.String str = this.f58972x4daa42b6;
            if (str != null && this.f58968xcb94b041[2]) {
                fVar.j(2, str);
            }
            if (this.f58968xcb94b041[3]) {
                fVar.h(3, this.f58967xb18ab0e4);
            }
            if (this.f58968xcb94b041[4]) {
                fVar.h(4, this.f58969x48c810b1);
            }
            if (this.f58968xcb94b041[5]) {
                fVar.h(5, this.f58964x42fc8348);
            }
            if (this.f58968xcb94b041[6]) {
                fVar.h(6, this.f58970xa23bb48a);
            }
            if (this.f58968xcb94b041[7]) {
                fVar.h(7, this.f58965x66d9d3b1);
            }
            if (this.f58968xcb94b041[8]) {
                fVar.e(8, this.f58971x48cf79a1);
            }
            if (this.f58968xcb94b041[9]) {
                fVar.h(9, this.f58973x4bb73e55);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f58968xcb94b041[1] ? 0 + b36.f.e(1, this.f58966x617e99c4) : 0;
            java.lang.String str2 = this.f58972x4daa42b6;
            if (str2 != null && this.f58968xcb94b041[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (this.f58968xcb94b041[3]) {
                e17 += b36.f.h(3, this.f58967xb18ab0e4);
            }
            if (this.f58968xcb94b041[4]) {
                e17 += b36.f.h(4, this.f58969x48c810b1);
            }
            if (this.f58968xcb94b041[5]) {
                e17 += b36.f.h(5, this.f58964x42fc8348);
            }
            if (this.f58968xcb94b041[6]) {
                e17 += b36.f.h(6, this.f58970xa23bb48a);
            }
            if (this.f58968xcb94b041[7]) {
                e17 += b36.f.h(7, this.f58965x66d9d3b1);
            }
            if (this.f58968xcb94b041[8]) {
                e17 += b36.f.e(8, this.f58971x48cf79a1);
            }
            return this.f58968xcb94b041[9] ? e17 + b36.f.h(9, this.f58973x4bb73e55) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f58966x617e99c4 = aVar2.g(intValue);
                this.f58968xcb94b041[1] = true;
                return 0;
            case 2:
                this.f58972x4daa42b6 = aVar2.k(intValue);
                this.f58968xcb94b041[2] = true;
                return 0;
            case 3:
                this.f58967xb18ab0e4 = aVar2.i(intValue);
                this.f58968xcb94b041[3] = true;
                return 0;
            case 4:
                this.f58969x48c810b1 = aVar2.i(intValue);
                this.f58968xcb94b041[4] = true;
                return 0;
            case 5:
                this.f58964x42fc8348 = aVar2.i(intValue);
                this.f58968xcb94b041[5] = true;
                return 0;
            case 6:
                this.f58970xa23bb48a = aVar2.i(intValue);
                this.f58968xcb94b041[6] = true;
                return 0;
            case 7:
                this.f58965x66d9d3b1 = aVar2.i(intValue);
                this.f58968xcb94b041[7] = true;
                return 0;
            case 8:
                this.f58971x48cf79a1 = aVar2.g(intValue);
                this.f58968xcb94b041[8] = true;
                return 0;
            case 9:
                this.f58973x4bb73e55 = aVar2.i(intValue);
                this.f58968xcb94b041[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setEnQueuetime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109865x35d776f3(long j17) {
        this.f58964x42fc8348 = j17;
        this.f58968xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setEndTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109866x5171f386(long j17) {
        this.f58965x66d9d3b1 = j17;
        this.f58968xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setErrorCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109867x6f5de1d3(int i17) {
        this.f58966x617e99c4 = i17;
        this.f58968xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFileSize */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109868x4abaca1f(long j17) {
        this.f58967xb18ab0e4 = j17;
        this.f58968xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setRecvedBytes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109869xe4a360a4(long j17) {
        this.f58969x48c810b1 = j17;
        this.f58968xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setStartTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109870xdcd6bc0d(long j17) {
        this.f58970xa23bb48a = j17;
        this.f58968xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setSvrfallbackCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109871xc04621c0(int i17) {
        this.f58971x48cf79a1 = i17;
        this.f58968xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setTaskIdent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109872x654c5929(java.lang.String str) {
        this.f58972x4daa42b6 = str;
        this.f58968xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setTraceId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109873x719f467e(long j17) {
        this.f58973x4bb73e55 = j17;
        this.f58968xcb94b041[9] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 m109864x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56) super.mo11468x92b714fd(bArr);
    }
}
