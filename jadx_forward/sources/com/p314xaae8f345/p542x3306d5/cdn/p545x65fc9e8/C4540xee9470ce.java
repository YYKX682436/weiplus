package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.VideoProfile */
/* loaded from: classes8.dex */
public class C4540xee9470ce extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce f19185xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce();

    /* renamed from: cdnmsg */
    private java.lang.String f19186xaea49c34;

    /* renamed from: flag */
    private java.lang.String f19187x2fff6c;

    /* renamed from: format */
    private int f19188xb45ff7f7;

    /* renamed from: hasSetFields */
    private final boolean[] f19189xcb94b041 = new boolean[6];

    /* renamed from: original_format */
    private int f19190xd736ee25;

    /* renamed from: request_flag */
    private java.lang.String f19191x4da8071c;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39874xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39875x7c90cfc0() {
        return f19185xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39876x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39877x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce c4540xee9470ce = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f19188xb45ff7f7), java.lang.Integer.valueOf(c4540xee9470ce.f19188xb45ff7f7)) && n51.f.a(java.lang.Integer.valueOf(this.f19190xd736ee25), java.lang.Integer.valueOf(c4540xee9470ce.f19190xd736ee25)) && n51.f.a(this.f19187x2fff6c, c4540xee9470ce.f19187x2fff6c) && n51.f.a(this.f19186xaea49c34, c4540xee9470ce.f19186xaea49c34) && n51.f.a(this.f19191x4da8071c, c4540xee9470ce.f19191x4da8071c);
    }

    /* renamed from: getCdnmsg */
    public java.lang.String m39878x13bbbf2a() {
        return this.f19189xcb94b041[4] ? this.f19186xaea49c34 : "";
    }

    /* renamed from: getFlag */
    public java.lang.String m39879xfb7f67e2() {
        return this.f19189xcb94b041[3] ? this.f19187x2fff6c : "";
    }

    /* renamed from: getFormat */
    public int m39880x19771aed() {
        return this.f19188xb45ff7f7;
    }

    /* renamed from: getOriginalFormat */
    public int m39881x36bada1e() {
        return this.f19190xd736ee25;
    }

    /* renamed from: getRequestFlag */
    public java.lang.String m39882x1e5ccd65() {
        return this.f19189xcb94b041[5] ? this.f19191x4da8071c : "";
    }

    /* renamed from: hasCdnmsg */
    public boolean m39883xd3953f6e() {
        return m39884x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39884x6e095e9(int i17) {
        return this.f19189xcb94b041[i17];
    }

    /* renamed from: hasFlag */
    public boolean m39885x29842926() {
        return m39884x6e095e9(3);
    }

    /* renamed from: hasFormat */
    public boolean m39886xd9509b31() {
        return m39884x6e095e9(1);
    }

    /* renamed from: hasOriginalFormat */
    public boolean m39887xa741d662() {
        return m39884x6e095e9(2);
    }

    /* renamed from: hasRequestFlag */
    public boolean m39888x3e7cd7a1() {
        return m39884x6e095e9(5);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39889x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19189xcb94b041[1]) {
                fVar.e(1, this.f19188xb45ff7f7);
            }
            if (this.f19189xcb94b041[2]) {
                fVar.e(2, this.f19190xd736ee25);
            }
            java.lang.String str = this.f19187x2fff6c;
            if (str != null && this.f19189xcb94b041[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f19186xaea49c34;
            if (str2 != null && this.f19189xcb94b041[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f19191x4da8071c;
            if (str3 != null && this.f19189xcb94b041[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f19189xcb94b041[1] ? 0 + b36.f.e(1, this.f19188xb45ff7f7) : 0;
            if (this.f19189xcb94b041[2]) {
                e17 += b36.f.e(2, this.f19190xd736ee25);
            }
            java.lang.String str4 = this.f19187x2fff6c;
            if (str4 != null && this.f19189xcb94b041[3]) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f19186xaea49c34;
            if (str5 != null && this.f19189xcb94b041[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f19191x4da8071c;
            return (str6 == null || !this.f19189xcb94b041[5]) ? e17 : e17 + b36.f.j(5, str6);
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
            this.f19188xb45ff7f7 = aVar2.g(intValue);
            this.f19189xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19190xd736ee25 = aVar2.g(intValue);
            this.f19189xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19187x2fff6c = aVar2.k(intValue);
            this.f19189xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f19186xaea49c34 = aVar2.k(intValue);
            this.f19189xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f19191x4da8071c = aVar2.k(intValue);
        this.f19189xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setCdnmsg */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39891x6f0f336(java.lang.String str) {
        this.f19186xaea49c34 = str;
        this.f19189xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFlag */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39892x764a2eee(java.lang.String str) {
        this.f19187x2fff6c = str;
        this.f19189xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFormat */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39893xcac4ef9(int i17) {
        this.f19188xb45ff7f7 = i17;
        this.f19189xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setOriginalFormat */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39894xfeb1422a(int i17) {
        this.f19190xd736ee25 = i17;
        this.f19189xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRequestFlag */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39895xb4c240d9(java.lang.String str) {
        this.f19191x4da8071c = str;
        this.f19189xcb94b041[5] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m39890x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce) super.mo11468x92b714fd(bArr);
    }
}
