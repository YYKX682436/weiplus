package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.BaseResponse */
/* loaded from: classes4.dex */
public class C4455x92037252 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 f18411xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252();

    /* renamed from: ErrMsg */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 f18412x7c39dbfc;
    private int Ret;

    /* renamed from: hasSetFields */
    private final boolean[] f18413xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38101xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38102x7c90cfc0() {
        return f18411xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38103x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38104x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x92037252 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.Ret), java.lang.Integer.valueOf(c4455x92037252.Ret)) && n51.f.a(this.f18412x7c39dbfc, c4455x92037252.f18412x7c39dbfc);
    }

    /* renamed from: getErrMsg */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 m38105x17ec12d2() {
        return this.f18413xcb94b041[2] ? this.f18412x7c39dbfc : new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91();
    }

    /* renamed from: getRet */
    public int m38106xb588696b() {
        return this.Ret;
    }

    /* renamed from: hasErrMsg */
    public boolean m38107xd7c59316() {
        return m38108x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38108x6e095e9(int i17) {
        return this.f18413xcb94b041[i17];
    }

    /* renamed from: hasRet */
    public boolean m38109xb7046fa7() {
        return m38108x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38110x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18413xcb94b041[1]) {
                fVar.e(1, this.Ret);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b91 = this.f18412x7c39dbfc;
            if (c4520x826d1b91 != null && this.f18413xcb94b041[2]) {
                fVar.i(2, c4520x826d1b91.mo75928xcd1e8d8());
                this.f18412x7c39dbfc.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18413xcb94b041[1] ? 0 + b36.f.e(1, this.Ret) : 0;
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b912 = this.f18412x7c39dbfc;
            return (c4520x826d1b912 == null || !this.f18413xcb94b041[2]) ? e17 : e17 + b36.f.i(2, c4520x826d1b912.mo75928xcd1e8d8());
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
            this.Ret = aVar2.g(intValue);
            this.f18413xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b913 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91();
            if (bArr != null && bArr.length > 0) {
                c4520x826d1b913.mo11468x92b714fd(bArr);
            }
            this.f18412x7c39dbfc = c4520x826d1b913;
        }
        this.f18413xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setErrMsg */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38112xb2146de(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b91) {
        this.f18412x7c39dbfc = c4520x826d1b91;
        this.f18413xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRet */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38113xca0290df(int i17) {
        this.Ret = i17;
        this.f18413xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m38111x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252) super.mo11468x92b714fd(bArr);
    }
}
