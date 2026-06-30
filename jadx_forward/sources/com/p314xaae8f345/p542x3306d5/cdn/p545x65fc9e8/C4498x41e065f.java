package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Group */
/* loaded from: classes8.dex */
public class C4498x41e065f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f f18849xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f();

    /* renamed from: capacity */
    private int f18850xfbf514ba;

    /* renamed from: hasSetFields */
    private final boolean[] f18851xcb94b041 = new boolean[3];

    /* renamed from: name */
    private java.lang.String f18852x337a8b;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39074xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39075x7c90cfc0() {
        return f18849xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39076x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39077x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f c4498x41e065f = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f) fVar;
        return n51.f.a(this.f18852x337a8b, c4498x41e065f.f18852x337a8b) && n51.f.a(java.lang.Integer.valueOf(this.f18850xfbf514ba), java.lang.Integer.valueOf(c4498x41e065f.f18850xfbf514ba));
    }

    /* renamed from: getCapacity */
    public int m39078x77cf5230() {
        return this.f18850xfbf514ba;
    }

    /* renamed from: getName */
    public java.lang.String m39079xfb82e301() {
        return this.f18851xcb94b041[1] ? this.f18852x337a8b : "";
    }

    /* renamed from: hasCapacity */
    public boolean m39080xa749d174() {
        return m39081x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39081x6e095e9(int i17) {
        return this.f18851xcb94b041[i17];
    }

    /* renamed from: hasName */
    public boolean m39082x2987a445() {
        return m39081x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39083x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18852x337a8b;
            if (str != null && this.f18851xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f18851xcb94b041[2]) {
                fVar.e(2, this.f18850xfbf514ba);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f18852x337a8b;
            if (str2 != null && this.f18851xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return this.f18851xcb94b041[2] ? i18 + b36.f.e(2, this.f18850xfbf514ba) : i18;
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
            this.f18852x337a8b = aVar2.k(intValue);
            this.f18851xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18850xfbf514ba = aVar2.g(intValue);
        this.f18851xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setCapacity */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39085x7287b33c(int i17) {
        this.f18850xfbf514ba = i17;
        this.f18851xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setName */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39086x764daa0d(java.lang.String str) {
        this.f18852x337a8b = str;
        this.f18851xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m39084x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f) super.mo11468x92b714fd(bArr);
    }
}
