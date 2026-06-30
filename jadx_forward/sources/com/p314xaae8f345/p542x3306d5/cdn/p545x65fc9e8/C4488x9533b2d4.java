package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FileIdResult */
/* loaded from: classes8.dex */
public class C4488x9533b2d4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 f18681xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();

    /* renamed from: aeskey */
    private java.lang.String f18682xab4b3f30;

    /* renamed from: filetype */
    private int f18683xd43766b6;

    /* renamed from: hasSetFields */
    private final boolean[] f18684xcb94b041 = new boolean[4];

    /* renamed from: id, reason: collision with root package name */
    private java.lang.String f134060id;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38864xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38865x7c90cfc0() {
        return f18681xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38866x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38867x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18683xd43766b6), java.lang.Integer.valueOf(c4488x9533b2d4.f18683xd43766b6)) && n51.f.a(this.f134060id, c4488x9533b2d4.f134060id) && n51.f.a(this.f18682xab4b3f30, c4488x9533b2d4.f18682xab4b3f30);
    }

    /* renamed from: getAeskey */
    public java.lang.String m38868x10626226() {
        return this.f18684xcb94b041[3] ? this.f18682xab4b3f30 : "";
    }

    /* renamed from: getFiletype */
    public int m38869x5011a42c() {
        return this.f18683xd43766b6;
    }

    /* renamed from: getId */
    public java.lang.String m38870x5db1b11() {
        return this.f18684xcb94b041[2] ? this.f134060id : "";
    }

    /* renamed from: hasAeskey */
    public boolean m38871xd03be26a() {
        return m38872x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38872x6e095e9(int i17) {
        return this.f18684xcb94b041[i17];
    }

    /* renamed from: hasFiletype */
    public boolean m38873x7f8c2370() {
        return m38872x6e095e9(1);
    }

    /* renamed from: hasId */
    public boolean m38874x5e75d55() {
        return m38872x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38875x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18684xcb94b041[1]) {
                fVar.e(1, this.f18683xd43766b6);
            }
            java.lang.String str = this.f134060id;
            if (str != null && this.f18684xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f18682xab4b3f30;
            if (str2 != null && this.f18684xcb94b041[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18684xcb94b041[1] ? 0 + b36.f.e(1, this.f18683xd43766b6) : 0;
            java.lang.String str3 = this.f134060id;
            if (str3 != null && this.f18684xcb94b041[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f18682xab4b3f30;
            return (str4 == null || !this.f18684xcb94b041[3]) ? e17 : e17 + b36.f.j(3, str4);
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
            this.f18683xd43766b6 = aVar2.g(intValue);
            this.f18684xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f134060id = aVar2.k(intValue);
            this.f18684xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f18682xab4b3f30 = aVar2.k(intValue);
        this.f18684xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38877x3979632(java.lang.String str) {
        this.f18682xab4b3f30 = str;
        this.f18684xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38878x4aca0538(int i17) {
        this.f18683xd43766b6 = i17;
        this.f18684xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setId */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38879x684351d(java.lang.String str) {
        this.f134060id = str;
        this.f18684xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38876x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4) super.mo11468x92b714fd(bArr);
    }
}
