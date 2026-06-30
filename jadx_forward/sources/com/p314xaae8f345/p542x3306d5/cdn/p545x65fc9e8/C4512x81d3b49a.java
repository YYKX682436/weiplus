package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.NoLoginInitConfig */
/* loaded from: classes2.dex */
public class C4512x81d3b49a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a f18954xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a();

    /* renamed from: hasSetFields */
    private final boolean[] f18955xcb94b041 = new boolean[2];

    /* renamed from: history_savepath */
    private java.lang.String f18956xacbe526d;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39312xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39313x7c90cfc0() {
        return f18954xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39314x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39315x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a) && n51.f.a(this.f18956xacbe526d, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a) fVar).f18956xacbe526d);
    }

    /* renamed from: getHistorySavepath */
    public java.lang.String m39316x9f6b65a0() {
        return this.f18955xcb94b041[1] ? this.f18956xacbe526d : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m39317x6e095e9(int i17) {
        return this.f18955xcb94b041[i17];
    }

    /* renamed from: hasHistorySavepath */
    public boolean m39318x3fc3f1dc() {
        return m39317x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39319x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18956xacbe526d;
            if (str != null && this.f18955xcb94b041[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f18956xacbe526d;
            if (str2 == null || !this.f18955xcb94b041[1]) {
                return 0;
            }
            return 0 + b36.f.j(1, str2);
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
        if (intValue != 1) {
            return -1;
        }
        this.f18956xacbe526d = aVar2.k(intValue);
        this.f18955xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setHistorySavepath */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39321xd641ff14(java.lang.String str) {
        this.f18956xacbe526d = str;
        this.f18955xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a m39320x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4512x81d3b49a) super.mo11468x92b714fd(bArr);
    }
}
