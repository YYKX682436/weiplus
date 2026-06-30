package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DataVerify */
/* loaded from: classes4.dex */
public class C4477xc73a58e3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 f18580xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3();

    /* renamed from: expected_filemd5 */
    private java.lang.String f18581x1ec2a3fb;

    /* renamed from: expected_filesize */
    private long f18582xb994b124;

    /* renamed from: max_filesize */
    private long f18585xd5413f8;

    /* renamed from: http_header */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> f18584x285aae24 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18583xcb94b041 = new boolean[5];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38569xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38570x7c90cfc0() {
        return f18580xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38571x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3();
    }

    /* renamed from: addAllElementHttpHeader */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38572x174beff1(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> collection) {
        this.f18584x285aae24.addAll(collection);
        this.f18583xcb94b041[4] = true;
        return this;
    }

    /* renamed from: addElementHttpHeader */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38573xe4dcbeb0(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72 c4505x21318a72) {
        this.f18584x285aae24.add(c4505x21318a72);
        this.f18583xcb94b041[4] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38574x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 c4477xc73a58e3 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3) fVar;
        return n51.f.a(this.f18581x1ec2a3fb, c4477xc73a58e3.f18581x1ec2a3fb) && n51.f.a(java.lang.Long.valueOf(this.f18582xb994b124), java.lang.Long.valueOf(c4477xc73a58e3.f18582xb994b124)) && n51.f.a(java.lang.Long.valueOf(this.f18585xd5413f8), java.lang.Long.valueOf(c4477xc73a58e3.f18585xd5413f8)) && n51.f.a(this.f18584x285aae24, c4477xc73a58e3.f18584x285aae24);
    }

    /* renamed from: getExpectedFilemd5 */
    public java.lang.String m38575x23429274() {
        return this.f18583xcb94b041[1] ? this.f18581x1ec2a3fb : "";
    }

    /* renamed from: getExpectedFilesize */
    public long m38576x451291cb() {
        return this.f18582xb994b124;
    }

    /* renamed from: getHttpHeader */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> m38577x1275092b() {
        return this.f18584x285aae24;
    }

    /* renamed from: getMaxFilesize */
    public long m38578x272f63cb() {
        return this.f18585xd5413f8;
    }

    /* renamed from: hasExpectedFilemd5 */
    public boolean m38579xc39b1eb0() {
        return m38581x6e095e9(1);
    }

    /* renamed from: hasExpectedFilesize */
    public boolean m38580xafcb8d0f() {
        return m38581x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38581x6e095e9(int i17) {
        return this.f18583xcb94b041[i17];
    }

    /* renamed from: hasHttpHeader */
    public boolean m38582x4d4cc76f() {
        return m38581x6e095e9(4);
    }

    /* renamed from: hasMaxFilesize */
    public boolean m38583x474f6e07() {
        return m38581x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38584x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18581x1ec2a3fb;
            if (str != null && this.f18583xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f18583xcb94b041[2]) {
                fVar.h(2, this.f18582xb994b124);
            }
            if (this.f18583xcb94b041[3]) {
                fVar.h(3, this.f18585xd5413f8);
            }
            fVar.g(4, 8, this.f18584x285aae24);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f18581x1ec2a3fb;
            if (str2 != null && this.f18583xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.f18583xcb94b041[2]) {
                i18 += b36.f.h(2, this.f18582xb994b124);
            }
            if (this.f18583xcb94b041[3]) {
                i18 += b36.f.h(3, this.f18585xd5413f8);
            }
            return i18 + b36.f.g(4, 8, this.f18584x285aae24);
        }
        if (i17 == 2) {
            this.f18584x285aae24.clear();
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
            this.f18581x1ec2a3fb = aVar2.k(intValue);
            this.f18583xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18582xb994b124 = aVar2.i(intValue);
            this.f18583xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18585xd5413f8 = aVar2.i(intValue);
            this.f18583xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72 c4505x21318a72 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72();
            if (bArr != null && bArr.length > 0) {
                c4505x21318a72.mo11468x92b714fd(bArr);
            }
            this.f18584x285aae24.add(c4505x21318a72);
        }
        this.f18583xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setExpectedFilemd5 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38586x5a192be8(java.lang.String str) {
        this.f18581x1ec2a3fb = str;
        this.f18583xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setExpectedFilesize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38587xe90f26d7(long j17) {
        this.f18582xb994b124 = j17;
        this.f18583xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setHttpHeader */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38588x40995737(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> linkedList) {
        this.f18584x285aae24 = linkedList;
        this.f18583xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMaxFilesize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38589xbd94d73f(long j17) {
        this.f18585xd5413f8 = j17;
        this.f18583xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38585x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3) super.mo11468x92b714fd(bArr);
    }
}
