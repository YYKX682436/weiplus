package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkC2CSNSVideoProfile */
/* loaded from: classes8.dex */
public class C3040x45c22d5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 f10926xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5();

    /* renamed from: experimental_group_id */
    private int f10927x79b6d052;

    /* renamed from: hasSetFields */
    private final boolean[] f10928xcb94b041 = new boolean[6];

    /* renamed from: mode */
    private int f10929x3339a3;

    /* renamed from: strategy */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10930x6a8fa373;

    /* renamed from: used_coldrule */
    private boolean f10931x80e95e22;

    /* renamed from: used_province */
    private int f10932x6c235572;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24028xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24029x7c90cfc0() {
        return f10926xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24030x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24031x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 c3040x45c22d5 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10929x3339a3), java.lang.Integer.valueOf(c3040x45c22d5.f10929x3339a3)) && n51.f.a(java.lang.Boolean.valueOf(this.f10931x80e95e22), java.lang.Boolean.valueOf(c3040x45c22d5.f10931x80e95e22)) && n51.f.a(java.lang.Integer.valueOf(this.f10932x6c235572), java.lang.Integer.valueOf(c3040x45c22d5.f10932x6c235572)) && n51.f.a(java.lang.Integer.valueOf(this.f10927x79b6d052), java.lang.Integer.valueOf(c3040x45c22d5.f10927x79b6d052)) && n51.f.a(this.f10930x6a8fa373, c3040x45c22d5.f10930x6a8fa373);
    }

    /* renamed from: getExperimentalGroupId */
    public int m24032x49641ebc() {
        return this.f10927x79b6d052;
    }

    /* renamed from: getMode */
    public int m24033xfb82a219() {
        return this.f10929x3339a3;
    }

    /* renamed from: getStrategy */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24034xe669e0e9() {
        return this.f10928xcb94b041[5] ? this.f10930x6a8fa373 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getUsedColdrule */
    public boolean m24035xf1590933() {
        return this.f10931x80e95e22;
    }

    /* renamed from: getUsedProvince */
    public int m24036xdc930083() {
        return this.f10932x6c235572;
    }

    /* renamed from: hasExperimentalGroupId */
    public boolean m24037xb5e42cf8() {
        return m24038x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24038x6e095e9(int i17) {
        return this.f10928xcb94b041[i17];
    }

    /* renamed from: hasMode */
    public boolean m24039x2987635d() {
        return m24038x6e095e9(1);
    }

    /* renamed from: hasStrategy */
    public boolean m24040x15e4602d() {
        return m24038x6e095e9(5);
    }

    /* renamed from: hasUsedColdrule */
    public boolean m24041xd53a4677() {
        return m24038x6e095e9(2);
    }

    /* renamed from: hasUsedProvince */
    public boolean m24042xc0743dc7() {
        return m24038x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24043x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10928xcb94b041[1]) {
                fVar.e(1, this.f10929x3339a3);
            }
            if (this.f10928xcb94b041[2]) {
                fVar.a(2, this.f10931x80e95e22);
            }
            if (this.f10928xcb94b041[3]) {
                fVar.e(3, this.f10932x6c235572);
            }
            if (this.f10928xcb94b041[4]) {
                fVar.e(4, this.f10927x79b6d052);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10930x6a8fa373;
            if (gVar != null && this.f10928xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10928xcb94b041[1] ? 0 + b36.f.e(1, this.f10929x3339a3) : 0;
            if (this.f10928xcb94b041[2]) {
                e17 += b36.f.a(2, this.f10931x80e95e22);
            }
            if (this.f10928xcb94b041[3]) {
                e17 += b36.f.e(3, this.f10932x6c235572);
            }
            if (this.f10928xcb94b041[4]) {
                e17 += b36.f.e(4, this.f10927x79b6d052);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10930x6a8fa373;
            return (gVar2 == null || !this.f10928xcb94b041[5]) ? e17 : e17 + b36.f.b(5, gVar2);
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
            this.f10929x3339a3 = aVar2.g(intValue);
            this.f10928xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10931x80e95e22 = aVar2.c(intValue);
            this.f10928xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10932x6c235572 = aVar2.g(intValue);
            this.f10928xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f10927x79b6d052 = aVar2.g(intValue);
            this.f10928xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f10930x6a8fa373 = aVar2.d(intValue);
        this.f10928xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setExperimentalGroupId */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24045x97a8de30(int i17) {
        this.f10927x79b6d052 = i17;
        this.f10928xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24046x764d6925(int i17) {
        this.f10929x3339a3 = i17;
        this.f10928xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setStrategy */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24047xe12241f5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10930x6a8fa373 = gVar;
        this.f10928xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUsedColdrule */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24048x27a2043f(boolean z17) {
        this.f10931x80e95e22 = z17;
        this.f10928xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUsedProvince */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24049x12dbfb8f(int i17) {
        this.f10932x6c235572 = i17;
        this.f10928xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 m24044x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3040x45c22d5) super.mo11468x92b714fd(bArr);
    }
}
