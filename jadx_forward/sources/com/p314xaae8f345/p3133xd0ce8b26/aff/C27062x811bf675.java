package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IPInfo */
/* loaded from: classes4.dex */
public class C27062x811bf675 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 f58688xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675();

    /* renamed from: hasSetFields */
    private final boolean[] f58689xcb94b041 = new boolean[4];

    /* renamed from: ipv4 */
    private java.lang.String f58690x316de5;

    /* renamed from: ipv6 */
    private java.lang.String f58691x316de7;

    /* renamed from: type */
    private int f58692x368f3a;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108982xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108983x7c90cfc0() {
        return f58688xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108984x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108985x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 c27062x811bf675 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f58692x368f3a), java.lang.Integer.valueOf(c27062x811bf675.f58692x368f3a)) && n51.f.a(this.f58690x316de5, c27062x811bf675.f58690x316de5) && n51.f.a(this.f58691x316de7, c27062x811bf675.f58691x316de7);
    }

    /* renamed from: getIpv4 */
    public java.lang.String m108986xfb80d65b() {
        return this.f58689xcb94b041[2] ? this.f58690x316de5 : "";
    }

    /* renamed from: getIpv6 */
    public java.lang.String m108987xfb80d65d() {
        return this.f58689xcb94b041[3] ? this.f58691x316de7 : "";
    }

    /* renamed from: getType */
    public int m108988xfb85f7b0() {
        return this.f58692x368f3a;
    }

    /* renamed from: hasFieldNumber */
    public boolean m108989x6e095e9(int i17) {
        return this.f58689xcb94b041[i17];
    }

    /* renamed from: hasIpv4 */
    public boolean m108990x2985979f() {
        return m108989x6e095e9(2);
    }

    /* renamed from: hasIpv6 */
    public boolean m108991x298597a1() {
        return m108989x6e095e9(3);
    }

    /* renamed from: hasType */
    public boolean m108992x298ab8f4() {
        return m108989x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108993x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58689xcb94b041[1]) {
                fVar.e(1, this.f58692x368f3a);
            }
            java.lang.String str = this.f58690x316de5;
            if (str != null && this.f58689xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f58691x316de7;
            if (str2 != null && this.f58689xcb94b041[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f58689xcb94b041[1] ? 0 + b36.f.e(1, this.f58692x368f3a) : 0;
            java.lang.String str3 = this.f58690x316de5;
            if (str3 != null && this.f58689xcb94b041[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f58691x316de7;
            return (str4 == null || !this.f58689xcb94b041[3]) ? e17 : e17 + b36.f.j(3, str4);
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
            this.f58692x368f3a = aVar2.g(intValue);
            this.f58689xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f58690x316de5 = aVar2.k(intValue);
            this.f58689xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f58691x316de7 = aVar2.k(intValue);
        this.f58689xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setIpv4 */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108995x764b9d67(java.lang.String str) {
        this.f58690x316de5 = str;
        this.f58689xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIpv6 */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108996x764b9d69(java.lang.String str) {
        this.f58691x316de7 = str;
        this.f58689xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108997x7650bebc(int i17) {
        this.f58692x368f3a = i17;
        this.f58689xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 m108994x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675) super.mo11468x92b714fd(bArr);
    }
}
