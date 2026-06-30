package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.PreloadOptions */
/* loaded from: classes8.dex */
public class C4515x6bb45075 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 f18973xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075();

    /* renamed from: hasSetFields */
    private final boolean[] f18974xcb94b041 = new boolean[3];

    /* renamed from: minsize */
    private long f18975x3f780d53;

    /* renamed from: ratio */
    private int f18976x674500b;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39343xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39344x7c90cfc0() {
        return f18973xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39345x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39346x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 c4515x6bb45075 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18976x674500b), java.lang.Integer.valueOf(c4515x6bb45075.f18976x674500b)) && n51.f.a(java.lang.Long.valueOf(this.f18975x3f780d53), java.lang.Long.valueOf(c4515x6bb45075.f18975x3f780d53));
    }

    /* renamed from: getMinsize */
    public long m39347x7d45491d() {
        return this.f18975x3f780d53;
    }

    /* renamed from: getRatio */
    public int m39348x7511f655() {
        return this.f18976x674500b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39349x6e095e9(int i17) {
        return this.f18974xcb94b041[i17];
    }

    /* renamed from: hasMinsize */
    public boolean m39350xb89bd159() {
        return m39349x6e095e9(2);
    }

    /* renamed from: hasRatio */
    public boolean m39351x7a55d91() {
        return m39349x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39352x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18974xcb94b041[1]) {
                fVar.e(1, this.f18976x674500b);
            }
            if (this.f18974xcb94b041[2]) {
                fVar.h(2, this.f18975x3f780d53);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18974xcb94b041[1] ? 0 + b36.f.e(1, this.f18976x674500b) : 0;
            return this.f18974xcb94b041[2] ? e17 + b36.f.h(2, this.f18975x3f780d53) : e17;
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
            this.f18976x674500b = aVar2.g(intValue);
            this.f18974xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18975x3f780d53 = aVar2.i(intValue);
        this.f18974xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setMinsize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39354xf0b69691(long j17) {
        this.f18975x3f780d53 = j17;
        this.f18974xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRatio */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39355x53a010c9(int i17) {
        this.f18976x674500b = i17;
        this.f18974xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m39353x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075) super.mo11468x92b714fd(bArr);
    }
}
