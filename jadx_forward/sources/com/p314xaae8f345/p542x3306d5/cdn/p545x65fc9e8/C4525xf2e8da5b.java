package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Storage */
/* loaded from: classes8.dex */
public class C4525xf2e8da5b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b f19019xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b();

    /* renamed from: data_ */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f19020x5af05f5;

    /* renamed from: filepath */
    private java.lang.String f19021xd4353ba1;

    /* renamed from: hasSetFields */
    private final boolean[] f19022xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39490xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39491x7c90cfc0() {
        return f19019xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39492x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39493x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b c4525xf2e8da5b = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b) fVar;
        return n51.f.a(this.f19021xd4353ba1, c4525xf2e8da5b.f19021xd4353ba1) && n51.f.a(this.f19020x5af05f5, c4525xf2e8da5b.f19020x5af05f5);
    }

    /* renamed from: getData_ */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m39494x744cac3f() {
        return this.f19022xcb94b041[2] ? this.f19020x5af05f5 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getFilepath */
    public java.lang.String m39495x500f7917() {
        return this.f19022xcb94b041[1] ? this.f19021xd4353ba1 : "";
    }

    /* renamed from: hasData_ */
    public boolean m39496x6e0137b() {
        return m39497x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39497x6e095e9(int i17) {
        return this.f19022xcb94b041[i17];
    }

    /* renamed from: hasFilepath */
    public boolean m39498x7f89f85b() {
        return m39497x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39499x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f19021xd4353ba1;
            if (str != null && this.f19022xcb94b041[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f19020x5af05f5;
            if (gVar != null && this.f19022xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f19021xd4353ba1;
            if (str2 != null && this.f19022xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f19020x5af05f5;
            return (gVar2 == null || !this.f19022xcb94b041[2]) ? i18 : i18 + b36.f.b(2, gVar2);
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
            this.f19021xd4353ba1 = aVar2.k(intValue);
            this.f19022xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f19020x5af05f5 = aVar2.d(intValue);
        this.f19022xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setData_ */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39501x52dac6b3(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f19020x5af05f5 = gVar;
        this.f19022xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFilepath */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39502x4ac7da23(java.lang.String str) {
        this.f19021xd4353ba1 = str;
        this.f19022xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m39500x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b) super.mo11468x92b714fd(bArr);
    }
}
