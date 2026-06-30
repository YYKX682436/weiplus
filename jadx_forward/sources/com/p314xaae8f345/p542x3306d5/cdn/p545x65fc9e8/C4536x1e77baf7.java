package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.UrlDownload */
/* loaded from: classes8.dex */
public class C4536x1e77baf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 f19160xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7();

    /* renamed from: aeskey */
    private java.lang.String f19161xab4b3f30;

    /* renamed from: hasSetFields */
    private final boolean[] f19162xcb94b041 = new boolean[7];

    /* renamed from: max_http_redirect */
    private int f19163x515e7218;

    /* renamed from: pcdn */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd f19164x3469bd;

    /* renamed from: resolve */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 f19165x416881ec;

    /* renamed from: treat_as_video */
    private boolean f19166x81cdc4b3;
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url url;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39802xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39803x7c90cfc0() {
        return f19160xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39804x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39805x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 c4536x1e77baf7 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7) fVar;
        return n51.f.a(this.url, c4536x1e77baf7.url) && n51.f.a(this.f19165x416881ec, c4536x1e77baf7.f19165x416881ec) && n51.f.a(this.f19164x3469bd, c4536x1e77baf7.f19164x3469bd) && n51.f.a(java.lang.Boolean.valueOf(this.f19166x81cdc4b3), java.lang.Boolean.valueOf(c4536x1e77baf7.f19166x81cdc4b3)) && n51.f.a(java.lang.Integer.valueOf(this.f19163x515e7218), java.lang.Integer.valueOf(c4536x1e77baf7.f19163x515e7218)) && n51.f.a(this.f19161xab4b3f30, c4536x1e77baf7.f19161xab4b3f30);
    }

    /* renamed from: getAeskey */
    public java.lang.String m39806x10626226() {
        return this.f19162xcb94b041[6] ? this.f19161xab4b3f30 : "";
    }

    /* renamed from: getMaxHttpRedirect */
    public int m39807x8fa931d2() {
        return this.f19163x515e7218;
    }

    /* renamed from: getPcdn */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd m39808xfb83d233() {
        return this.f19162xcb94b041[3] ? this.f19164x3469bd : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd.m39323xaf65a0fc();
    }

    /* renamed from: getResolve */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39809x7f35bdb6() {
        return this.f19162xcb94b041[2] ? this.f19165x416881ec : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04.m39133xaf65a0fc();
    }

    /* renamed from: getTreatAsVideo */
    public boolean m39810x3d8a065() {
        return this.f19166x81cdc4b3;
    }

    /* renamed from: getUrl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39811xb5887639() {
        return this.f19162xcb94b041[1] ? this.url : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url.m39782xaf65a0fc();
    }

    /* renamed from: hasAeskey */
    public boolean m39812xd03be26a() {
        return m39813x6e095e9(6);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39813x6e095e9(int i17) {
        return this.f19162xcb94b041[i17];
    }

    /* renamed from: hasMaxHttpRedirect */
    public boolean m39814x3001be0e() {
        return m39813x6e095e9(5);
    }

    /* renamed from: hasPcdn */
    public boolean m39815x29889377() {
        return m39813x6e095e9(3);
    }

    /* renamed from: hasResolve */
    public boolean m39816xba8c45f2() {
        return m39813x6e095e9(2);
    }

    /* renamed from: hasTreatAsVideo */
    public boolean m39817xe7b9dda9() {
        return m39813x6e095e9(4);
    }

    /* renamed from: hasUrl */
    public boolean m39818xb7047c75() {
        return m39813x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39819x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url url = this.url;
            if (url != null && this.f19162xcb94b041[1]) {
                fVar.i(1, url.mo75928xcd1e8d8());
                this.url.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 c4502x1d919f04 = this.f19165x416881ec;
            if (c4502x1d919f04 != null && this.f19162xcb94b041[2]) {
                fVar.i(2, c4502x1d919f04.mo75928xcd1e8d8());
                this.f19165x416881ec.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd c4513x25dddd = this.f19164x3469bd;
            if (c4513x25dddd != null && this.f19162xcb94b041[3]) {
                fVar.i(3, c4513x25dddd.mo75928xcd1e8d8());
                this.f19164x3469bd.mo75956x3d5d1f78(fVar);
            }
            if (this.f19162xcb94b041[4]) {
                fVar.a(4, this.f19166x81cdc4b3);
            }
            if (this.f19162xcb94b041[5]) {
                fVar.e(5, this.f19163x515e7218);
            }
            java.lang.String str = this.f19161xab4b3f30;
            if (str != null && this.f19162xcb94b041[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url url2 = this.url;
            if (url2 != null && this.f19162xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, url2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 c4502x1d919f042 = this.f19165x416881ec;
            if (c4502x1d919f042 != null && this.f19162xcb94b041[2]) {
                i18 += b36.f.i(2, c4502x1d919f042.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd c4513x25dddd2 = this.f19164x3469bd;
            if (c4513x25dddd2 != null && this.f19162xcb94b041[3]) {
                i18 += b36.f.i(3, c4513x25dddd2.mo75928xcd1e8d8());
            }
            if (this.f19162xcb94b041[4]) {
                i18 += b36.f.a(4, this.f19166x81cdc4b3);
            }
            if (this.f19162xcb94b041[5]) {
                i18 += b36.f.e(5, this.f19163x515e7218);
            }
            java.lang.String str2 = this.f19161xab4b3f30;
            return (str2 == null || !this.f19162xcb94b041[6]) ? i18 : i18 + b36.f.j(6, str2);
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url url3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url();
                    if (bArr != null && bArr.length > 0) {
                        url3.mo11468x92b714fd(bArr);
                    }
                    this.url = url3;
                }
                this.f19162xcb94b041[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 c4502x1d919f043 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4502x1d919f043.mo11468x92b714fd(bArr2);
                    }
                    this.f19165x416881ec = c4502x1d919f043;
                }
                this.f19162xcb94b041[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd c4513x25dddd3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4513x25dddd3.mo11468x92b714fd(bArr3);
                    }
                    this.f19164x3469bd = c4513x25dddd3;
                }
                this.f19162xcb94b041[3] = true;
                return 0;
            case 4:
                this.f19166x81cdc4b3 = aVar2.c(intValue);
                this.f19162xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19163x515e7218 = aVar2.g(intValue);
                this.f19162xcb94b041[5] = true;
                return 0;
            case 6:
                this.f19161xab4b3f30 = aVar2.k(intValue);
                this.f19162xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39821x3979632(java.lang.String str) {
        this.f19161xab4b3f30 = str;
        this.f19162xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setMaxHttpRedirect */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39822xc67fcb46(int i17) {
        this.f19163x515e7218 = i17;
        this.f19162xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setPcdn */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39823x764e993f(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4513x25dddd c4513x25dddd) {
        this.f19164x3469bd = c4513x25dddd;
        this.f19162xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setResolve */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39824xf2a70b2a(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 c4502x1d919f04) {
        this.f19165x416881ec = c4502x1d919f04;
        this.f19162xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setTreatAsVideo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39825x3a219b71(boolean z17) {
        this.f19166x81cdc4b3 = z17;
        this.f19162xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39826xca029dad(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url url) {
        this.url = url;
        this.f19162xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m39820x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7) super.mo11468x92b714fd(bArr);
    }
}
