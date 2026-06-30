package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.UrlOptions */
/* loaded from: classes8.dex */
public class C4537xe9a0a4f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f f19167xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f();

    /* renamed from: hasSetFields */
    private final boolean[] f19168xcb94b041 = new boolean[2];

    /* renamed from: max_http_redirect */
    private int f19169x515e7218;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39828xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39829x7c90cfc0() {
        return f19167xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39830x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39831x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f) && n51.f.a(java.lang.Integer.valueOf(this.f19169x515e7218), java.lang.Integer.valueOf(((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f) fVar).f19169x515e7218));
    }

    /* renamed from: getMaxHttpRedirect */
    public int m39832x8fa931d2() {
        return this.f19169x515e7218;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39833x6e095e9(int i17) {
        return this.f19168xcb94b041[i17];
    }

    /* renamed from: hasMaxHttpRedirect */
    public boolean m39834x3001be0e() {
        return m39833x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39835x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19168xcb94b041[1]) {
                fVar.e(1, this.f19169x515e7218);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f19168xcb94b041[1]) {
                return 0 + b36.f.e(1, this.f19169x515e7218);
            }
            return 0;
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
        this.f19169x515e7218 = aVar2.g(intValue);
        this.f19168xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setMaxHttpRedirect */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39837xc67fcb46(int i17) {
        this.f19169x515e7218 = i17;
        this.f19168xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m39836x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f) super.mo11468x92b714fd(bArr);
    }
}
