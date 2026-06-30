package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.MoovAtom */
/* loaded from: classes2.dex */
public class C4510xf296401a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a f18930xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a();

    /* renamed from: data_ */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18931x5af05f5;

    /* renamed from: hasSetFields */
    private final boolean[] f18932xcb94b041 = new boolean[4];

    /* renamed from: length */
    private int f18933xbe0e3ae6;

    /* renamed from: offset */
    private long f18934xc3376493;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39234xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39235x7c90cfc0() {
        return f18930xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39236x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39237x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a c4510xf296401a = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f18934xc3376493), java.lang.Long.valueOf(c4510xf296401a.f18934xc3376493)) && n51.f.a(java.lang.Integer.valueOf(this.f18933xbe0e3ae6), java.lang.Integer.valueOf(c4510xf296401a.f18933xbe0e3ae6)) && n51.f.a(this.f18931x5af05f5, c4510xf296401a.f18931x5af05f5);
    }

    /* renamed from: getData_ */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m39238x744cac3f() {
        return this.f18932xcb94b041[3] ? this.f18931x5af05f5 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getLength */
    public int m39239x23255ddc() {
        return this.f18933xbe0e3ae6;
    }

    /* renamed from: getOffset */
    public long m39240x284e8789() {
        return this.f18934xc3376493;
    }

    /* renamed from: hasData_ */
    public boolean m39241x6e0137b() {
        return m39242x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39242x6e095e9(int i17) {
        return this.f18932xcb94b041[i17];
    }

    /* renamed from: hasLength */
    public boolean m39243xe2fede20() {
        return m39242x6e095e9(2);
    }

    /* renamed from: hasOffset */
    public boolean m39244xe82807cd() {
        return m39242x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39245x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18932xcb94b041[1]) {
                fVar.h(1, this.f18934xc3376493);
            }
            if (this.f18932xcb94b041[2]) {
                fVar.e(2, this.f18933xbe0e3ae6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18931x5af05f5;
            if (gVar != null && this.f18932xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f18932xcb94b041[1] ? 0 + b36.f.h(1, this.f18934xc3376493) : 0;
            if (this.f18932xcb94b041[2]) {
                h17 += b36.f.e(2, this.f18933xbe0e3ae6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18931x5af05f5;
            return (gVar2 == null || !this.f18932xcb94b041[3]) ? h17 : h17 + b36.f.b(3, gVar2);
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
            this.f18934xc3376493 = aVar2.i(intValue);
            this.f18932xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18933xbe0e3ae6 = aVar2.g(intValue);
            this.f18932xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f18931x5af05f5 = aVar2.d(intValue);
        this.f18932xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setData_ */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39247x52dac6b3(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18931x5af05f5 = gVar;
        this.f18932xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setLength */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39248x165a91e8(int i17) {
        this.f18933xbe0e3ae6 = i17;
        this.f18932xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setOffset */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39249x1b83bb95(long j17) {
        this.f18934xc3376493 = j17;
        this.f18932xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a m39246x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4510xf296401a) super.mo11468x92b714fd(bArr);
    }
}
