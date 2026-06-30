package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.ImageOptions */
/* loaded from: classes4.dex */
public class C4503xe2fa9ce3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 f18869xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3();

    /* renamed from: supported_formats */
    private java.util.LinkedList<java.lang.Integer> f18871x746ff4cb = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18870xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39147xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39148x7c90cfc0() {
        return f18869xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39149x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3();
    }

    /* renamed from: addAllElementSupportedFormats */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39150x2a986c8a(java.util.Collection<java.lang.Integer> collection) {
        this.f18871x746ff4cb.addAll(collection);
        this.f18870xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementSupportedFormats */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39151x479cf009(int i17) {
        this.f18871x746ff4cb.add(java.lang.Integer.valueOf(i17));
        this.f18870xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39152x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3) && n51.f.a(this.f18871x746ff4cb, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3) fVar).f18871x746ff4cb);
    }

    /* renamed from: getSupportedFormats */
    public java.util.LinkedList<java.lang.Integer> m39153xdaf43244() {
        return this.f18871x746ff4cb;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39154x6e095e9(int i17) {
        return this.f18870xcb94b041[i17];
    }

    /* renamed from: hasSupportedFormats */
    public boolean m39155x45ad2d88() {
        return m39154x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39156x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 2, this.f18871x746ff4cb);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, this.f18871x746ff4cb) + 0;
        }
        if (i17 == 2) {
            this.f18871x746ff4cb.clear();
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
        this.f18871x746ff4cb.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        this.f18870xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setSupportedFormats */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39158x7ef0c750(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.f18871x746ff4cb = linkedList;
        this.f18870xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m39157x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3) super.mo11468x92b714fd(bArr);
    }
}
