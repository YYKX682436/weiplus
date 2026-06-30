package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkAppMessage */
/* loaded from: classes2.dex */
public class C2980x3a094ec9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 f10270xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9();

    /* renamed from: body */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10271x2e39a2;

    /* renamed from: create_time */
    private long f10272xe294a830;

    /* renamed from: hasSetFields */
    private final boolean[] f10273xcb94b041 = new boolean[4];

    /* renamed from: msgid */
    private long f10274x635d85c;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22500xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22501x7c90cfc0() {
        return f10270xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22502x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22503x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 c2980x3a094ec9 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f10274x635d85c), java.lang.Long.valueOf(c2980x3a094ec9.f10274x635d85c)) && n51.f.a(java.lang.Long.valueOf(this.f10272xe294a830), java.lang.Long.valueOf(c2980x3a094ec9.f10272xe294a830)) && n51.f.a(this.f10271x2e39a2, c2980x3a094ec9.f10271x2e39a2);
    }

    /* renamed from: getBody */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22504xfb7da218() {
        return this.f10273xcb94b041[3] ? this.f10271x2e39a2 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCreateTime */
    public long m22505x3fdd41df() {
        return this.f10272xe294a830;
    }

    /* renamed from: getMsgid */
    public long m22506x74d37ea6() {
        return this.f10274x635d85c;
    }

    /* renamed from: hasBody */
    public boolean m22507x2982635c() {
        return m22509x6e095e9(3);
    }

    /* renamed from: hasCreateTime */
    public boolean m22508x7ab50023() {
        return m22509x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22509x6e095e9(int i17) {
        return this.f10273xcb94b041[i17];
    }

    /* renamed from: hasMsgid */
    public boolean m22510x766e5e2() {
        return m22509x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22511x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10273xcb94b041[1]) {
                fVar.h(1, this.f10274x635d85c);
            }
            if (this.f10273xcb94b041[2]) {
                fVar.h(2, this.f10272xe294a830);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10271x2e39a2;
            if (gVar != null && this.f10273xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f10273xcb94b041[1] ? 0 + b36.f.h(1, this.f10274x635d85c) : 0;
            if (this.f10273xcb94b041[2]) {
                h17 += b36.f.h(2, this.f10272xe294a830);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10271x2e39a2;
            return (gVar2 == null || !this.f10273xcb94b041[3]) ? h17 : h17 + b36.f.b(3, gVar2);
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
            this.f10274x635d85c = aVar2.i(intValue);
            this.f10273xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10272xe294a830 = aVar2.i(intValue);
            this.f10273xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f10271x2e39a2 = aVar2.d(intValue);
        this.f10273xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setBody */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22513x76486924(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10271x2e39a2 = gVar;
        this.f10273xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCreateTime */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22514x6e018feb(long j17) {
        this.f10272xe294a830 = j17;
        this.f10273xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setMsgid */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22515x5361991a(long j17) {
        this.f10274x635d85c = j17;
        this.f10273xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 m22512x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2980x3a094ec9) super.mo11468x92b714fd(bArr);
    }
}
