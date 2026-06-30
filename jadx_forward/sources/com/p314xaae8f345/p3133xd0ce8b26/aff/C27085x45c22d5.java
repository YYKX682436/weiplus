package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CSNSVideoProfile */
/* loaded from: classes8.dex */
public class C27085x45c22d5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 f58994xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5();

    /* renamed from: experimental_group_id */
    private int f58995x79b6d052;

    /* renamed from: hasSetFields */
    private final boolean[] f58996xcb94b041 = new boolean[6];

    /* renamed from: mode */
    private int f58997x3339a3;

    /* renamed from: strategy */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58998x6a8fa373;

    /* renamed from: used_coldrule */
    private boolean f58999x80e95e22;

    /* renamed from: used_province */
    private int f59000x6c235572;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109957xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109958x7c90cfc0() {
        return f58994xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109959x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109960x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 c27085x45c22d5 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f58997x3339a3), java.lang.Integer.valueOf(c27085x45c22d5.f58997x3339a3)) && n51.f.a(java.lang.Boolean.valueOf(this.f58999x80e95e22), java.lang.Boolean.valueOf(c27085x45c22d5.f58999x80e95e22)) && n51.f.a(java.lang.Integer.valueOf(this.f59000x6c235572), java.lang.Integer.valueOf(c27085x45c22d5.f59000x6c235572)) && n51.f.a(java.lang.Integer.valueOf(this.f58995x79b6d052), java.lang.Integer.valueOf(c27085x45c22d5.f58995x79b6d052)) && n51.f.a(this.f58998x6a8fa373, c27085x45c22d5.f58998x6a8fa373);
    }

    /* renamed from: getExperimentalGroupId */
    public int m109961x49641ebc() {
        return this.f58995x79b6d052;
    }

    /* renamed from: getMode */
    public int m109962xfb82a219() {
        return this.f58997x3339a3;
    }

    /* renamed from: getStrategy */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109963xe669e0e9() {
        return this.f58996xcb94b041[5] ? this.f58998x6a8fa373 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getUsedColdrule */
    public boolean m109964xf1590933() {
        return this.f58999x80e95e22;
    }

    /* renamed from: getUsedProvince */
    public int m109965xdc930083() {
        return this.f59000x6c235572;
    }

    /* renamed from: hasExperimentalGroupId */
    public boolean m109966xb5e42cf8() {
        return m109967x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m109967x6e095e9(int i17) {
        return this.f58996xcb94b041[i17];
    }

    /* renamed from: hasMode */
    public boolean m109968x2987635d() {
        return m109967x6e095e9(1);
    }

    /* renamed from: hasStrategy */
    public boolean m109969x15e4602d() {
        return m109967x6e095e9(5);
    }

    /* renamed from: hasUsedColdrule */
    public boolean m109970xd53a4677() {
        return m109967x6e095e9(2);
    }

    /* renamed from: hasUsedProvince */
    public boolean m109971xc0743dc7() {
        return m109967x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109972x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58996xcb94b041[1]) {
                fVar.e(1, this.f58997x3339a3);
            }
            if (this.f58996xcb94b041[2]) {
                fVar.a(2, this.f58999x80e95e22);
            }
            if (this.f58996xcb94b041[3]) {
                fVar.e(3, this.f59000x6c235572);
            }
            if (this.f58996xcb94b041[4]) {
                fVar.e(4, this.f58995x79b6d052);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58998x6a8fa373;
            if (gVar != null && this.f58996xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f58996xcb94b041[1] ? 0 + b36.f.e(1, this.f58997x3339a3) : 0;
            if (this.f58996xcb94b041[2]) {
                e17 += b36.f.a(2, this.f58999x80e95e22);
            }
            if (this.f58996xcb94b041[3]) {
                e17 += b36.f.e(3, this.f59000x6c235572);
            }
            if (this.f58996xcb94b041[4]) {
                e17 += b36.f.e(4, this.f58995x79b6d052);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58998x6a8fa373;
            return (gVar2 == null || !this.f58996xcb94b041[5]) ? e17 : e17 + b36.f.b(5, gVar2);
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
            this.f58997x3339a3 = aVar2.g(intValue);
            this.f58996xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f58999x80e95e22 = aVar2.c(intValue);
            this.f58996xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f59000x6c235572 = aVar2.g(intValue);
            this.f58996xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f58995x79b6d052 = aVar2.g(intValue);
            this.f58996xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f58998x6a8fa373 = aVar2.d(intValue);
        this.f58996xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setExperimentalGroupId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109974x97a8de30(int i17) {
        this.f58995x79b6d052 = i17;
        this.f58996xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109975x764d6925(int i17) {
        this.f58997x3339a3 = i17;
        this.f58996xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setStrategy */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109976xe12241f5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58998x6a8fa373 = gVar;
        this.f58996xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUsedColdrule */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109977x27a2043f(boolean z17) {
        this.f58999x80e95e22 = z17;
        this.f58996xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUsedProvince */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109978x12dbfb8f(int i17) {
        this.f59000x6c235572 = i17;
        this.f58996xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 m109973x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27085x45c22d5) super.mo11468x92b714fd(bArr);
    }
}
