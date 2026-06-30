package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.ClientStatsInfo */
/* loaded from: classes8.dex */
public class C27386x523c2e42 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 f59731xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42();

    /* renamed from: expose_count */
    public int f59732x2ed7e4d4 = 0;
    public java.lang.String oob = "";

    /* renamed from: first_expose_time */
    public long f59733xaf965b59 = 0;

    /* renamed from: had_sync_for_cold_time */
    public int f59734xdb0686e2 = 0;

    /* renamed from: last_expose_time */
    public long f59735x390b723f = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113923xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113924x7c90cfc0() {
        return f59731xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113925x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113926x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 c27386x523c2e42 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59732x2ed7e4d4), java.lang.Integer.valueOf(c27386x523c2e42.f59732x2ed7e4d4)) && n51.f.a(this.oob, c27386x523c2e42.oob) && n51.f.a(java.lang.Long.valueOf(this.f59733xaf965b59), java.lang.Long.valueOf(c27386x523c2e42.f59733xaf965b59)) && n51.f.a(java.lang.Integer.valueOf(this.f59734xdb0686e2), java.lang.Integer.valueOf(c27386x523c2e42.f59734xdb0686e2)) && n51.f.a(java.lang.Long.valueOf(this.f59735x390b723f), java.lang.Long.valueOf(c27386x523c2e42.f59735x390b723f));
    }

    /* renamed from: getExposeCount */
    public int m113927x76bb4e75() {
        return this.f59732x2ed7e4d4;
    }

    /* renamed from: getExpose_count */
    public int m113928x8fca774a() {
        return this.f59732x2ed7e4d4;
    }

    /* renamed from: getFirstExposeTime */
    public long m113929xfcb83d4b() {
        return this.f59733xaf965b59;
    }

    /* renamed from: getFirst_expose_time */
    public long m113930x2cae2a3() {
        return this.f59733xaf965b59;
    }

    /* renamed from: getHadSyncForColdTime */
    public int m113931x7c80aa0a() {
        return this.f59734xdb0686e2;
    }

    /* renamed from: getHad_sync_for_cold_time */
    public int m113932x44d4fdd8() {
        return this.f59734xdb0686e2;
    }

    /* renamed from: getLastExposeTime */
    public long m113933x867d0dd() {
        return this.f59735x390b723f;
    }

    /* renamed from: getLast_expose_time */
    public long m113934xe0e3d9b5() {
        return this.f59735x390b723f;
    }

    /* renamed from: getOob */
    public java.lang.String m113935xb5885f4c() {
        return this.oob;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113936x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59732x2ed7e4d4);
            java.lang.String str = this.oob;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f59733xaf965b59);
            fVar.e(100, this.f59734xdb0686e2);
            fVar.h(101, this.f59735x390b723f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f59732x2ed7e4d4) + 0;
            java.lang.String str2 = this.oob;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f59733xaf965b59) + b36.f.e(100, this.f59734xdb0686e2) + b36.f.h(101, this.f59735x390b723f);
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
        if (intValue == 1) {
            this.f59732x2ed7e4d4 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.oob = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f59733xaf965b59 = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 100) {
            this.f59734xdb0686e2 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        this.f59735x390b723f = aVar2.i(intValue);
        return 0;
    }

    /* renamed from: setExposeCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113938xd20c1e9(int i17) {
        this.f59732x2ed7e4d4 = i17;
        return this;
    }

    /* renamed from: setExpose_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113939xc6137256(int i17) {
        this.f59732x2ed7e4d4 = i17;
        return this;
    }

    /* renamed from: setFirstExposeTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113940x338ed6bf(long j17) {
        this.f59733xaf965b59 = j17;
        return this;
    }

    /* renamed from: setFirst_expose_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113941xde60ef17(long j17) {
        this.f59733xaf965b59 = j17;
        return this;
    }

    /* renamed from: setHadSyncForColdTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113942x13ac2c16(int i17) {
        this.f59734xdb0686e2 = i17;
        return this;
    }

    /* renamed from: setHad_sync_for_cold_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113943x771899e4(int i17) {
        this.f59734xdb0686e2 = i17;
        return this;
    }

    /* renamed from: setLastExposeTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113944xd05e38e9(long j17) {
        this.f59735x390b723f = j17;
        return this;
    }

    /* renamed from: setLast_expose_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113945x84e06ec1(long j17) {
        this.f59735x390b723f = j17;
        return this;
    }

    /* renamed from: setOob */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113946xca0286c0(java.lang.String str) {
        this.oob = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 m113937x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27386x523c2e42) super.mo11468x92b714fd(bArr);
    }
}
