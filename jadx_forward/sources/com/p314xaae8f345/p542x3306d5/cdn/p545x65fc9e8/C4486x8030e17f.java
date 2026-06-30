package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FileIdDownload */
/* loaded from: classes8.dex */
public class C4486x8030e17f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f f18673xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f();

    /* renamed from: bigfile */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 f18674xf92af27c;

    /* renamed from: fileid */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 f18675xb4089397;

    /* renamed from: hasSetFields */
    private final boolean[] f18676xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38833xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38834x7c90cfc0() {
        return f18673xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38835x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38836x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f c4486x8030e17f = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f) fVar;
        return n51.f.a(this.f18675xb4089397, c4486x8030e17f.f18675xb4089397) && n51.f.a(this.f18674xf92af27c, c4486x8030e17f.f18674xf92af27c);
    }

    /* renamed from: getBigfile */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 m38837x36f82e46() {
        return this.f18676xcb94b041[2] ? this.f18674xf92af27c : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2.m38211xaf65a0fc();
    }

    /* renamed from: getFileid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 m38838x191fb68d() {
        return this.f18676xcb94b041[1] ? this.f18675xb4089397 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6.m38847xaf65a0fc();
    }

    /* renamed from: hasBigfile */
    public boolean m38839x724eb682() {
        return m38840x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38840x6e095e9(int i17) {
        return this.f18676xcb94b041[i17];
    }

    /* renamed from: hasFileid */
    public boolean m38841xd8f936d1() {
        return m38840x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38842x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6 = this.f18675xb4089397;
            if (c4487x363e7af6 != null && this.f18676xcb94b041[1]) {
                fVar.i(1, c4487x363e7af6.mo75928xcd1e8d8());
                this.f18675xb4089397.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a2 = this.f18674xf92af27c;
            if (c4460x4e1874a2 != null && this.f18676xcb94b041[2]) {
                fVar.i(2, c4460x4e1874a2.mo75928xcd1e8d8());
                this.f18674xf92af27c.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af62 = this.f18675xb4089397;
            if (c4487x363e7af62 != null && this.f18676xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, c4487x363e7af62.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a22 = this.f18674xf92af27c;
            return (c4460x4e1874a22 == null || !this.f18676xcb94b041[2]) ? i18 : i18 + b36.f.i(2, c4460x4e1874a22.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af63 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6();
                if (bArr != null && bArr.length > 0) {
                    c4487x363e7af63.mo11468x92b714fd(bArr);
                }
                this.f18675xb4089397 = c4487x363e7af63;
            }
            this.f18676xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a23 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2();
            if (bArr2 != null && bArr2.length > 0) {
                c4460x4e1874a23.mo11468x92b714fd(bArr2);
            }
            this.f18674xf92af27c = c4460x4e1874a23;
        }
        this.f18676xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setBigfile */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38844xaa697bba(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4460x4e1874a2 c4460x4e1874a2) {
        this.f18674xf92af27c = c4460x4e1874a2;
        this.f18676xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFileid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38845xc54ea99(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6) {
        this.f18675xb4089397 = c4487x363e7af6;
        this.f18676xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38843x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f) super.mo11468x92b714fd(bArr);
    }
}
