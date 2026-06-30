package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse */
/* loaded from: classes4.dex */
public class C4521x163cc5e5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 f19000xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5();

    /* renamed from: BaseResponse */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 f19001x92037252;

    /* renamed from: city_id */
    private int f19002x2ed0dc6f;

    /* renamed from: data_ */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f19003x5af05f5;

    /* renamed from: hasSetFields */
    private final boolean[] f19004xcb94b041 = new boolean[6];

    /* renamed from: province_id */
    private int f19005x8bff388a;

    /* renamed from: version */
    private int f19006x14f51cd8;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39422xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39423x7c90cfc0() {
        return f19000xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39424x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39425x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 c4521x163cc5e5 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5) fVar;
        return n51.f.a(this.f19001x92037252, c4521x163cc5e5.f19001x92037252) && n51.f.a(this.f19003x5af05f5, c4521x163cc5e5.f19003x5af05f5) && n51.f.a(java.lang.Integer.valueOf(this.f19006x14f51cd8), java.lang.Integer.valueOf(c4521x163cc5e5.f19006x14f51cd8)) && n51.f.a(java.lang.Integer.valueOf(this.f19002x2ed0dc6f), java.lang.Integer.valueOf(c4521x163cc5e5.f19002x2ed0dc6f)) && n51.f.a(java.lang.Integer.valueOf(this.f19005x8bff388a), java.lang.Integer.valueOf(c4521x163cc5e5.f19005x8bff388a));
    }

    /* renamed from: getBaseResponse */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m39426xe92ab0a8() {
        return this.f19004xcb94b041[1] ? this.f19001x92037252 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252.m38101xaf65a0fc();
    }

    /* renamed from: getCityId */
    public int m39427x140516dc() {
        return this.f19002x2ed0dc6f;
    }

    /* renamed from: getData_ */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m39428x744cac3f() {
        return this.f19004xcb94b041[2] ? this.f19003x5af05f5 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getProvinceId */
    public int m39429xfb06e061() {
        return this.f19005x8bff388a;
    }

    /* renamed from: getVersion */
    public int m39430x52c258a2() {
        return this.f19006x14f51cd8;
    }

    /* renamed from: hasBaseResponse */
    public boolean m39431xcd0bedec() {
        return m39434x6e095e9(1);
    }

    /* renamed from: hasCityId */
    public boolean m39432xd3de9720() {
        return m39434x6e095e9(4);
    }

    /* renamed from: hasData_ */
    public boolean m39433x6e0137b() {
        return m39434x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39434x6e095e9(int i17) {
        return this.f19004xcb94b041[i17];
    }

    /* renamed from: hasProvinceId */
    public boolean m39435x35de9ea5() {
        return m39434x6e095e9(5);
    }

    /* renamed from: hasVersion */
    public boolean m39436x8e18e0de() {
        return m39434x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39437x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x92037252 = this.f19001x92037252;
            if (c4455x92037252 != null && this.f19004xcb94b041[1]) {
                fVar.i(1, c4455x92037252.mo75928xcd1e8d8());
                this.f19001x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f19003x5af05f5;
            if (gVar != null && this.f19004xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            if (this.f19004xcb94b041[3]) {
                fVar.e(3, this.f19006x14f51cd8);
            }
            if (this.f19004xcb94b041[4]) {
                fVar.e(4, this.f19002x2ed0dc6f);
            }
            if (this.f19004xcb94b041[5]) {
                fVar.e(5, this.f19005x8bff388a);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x920372522 = this.f19001x92037252;
            if (c4455x920372522 != null && this.f19004xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, c4455x920372522.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f19003x5af05f5;
            if (gVar2 != null && this.f19004xcb94b041[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            if (this.f19004xcb94b041[3]) {
                i18 += b36.f.e(3, this.f19006x14f51cd8);
            }
            if (this.f19004xcb94b041[4]) {
                i18 += b36.f.e(4, this.f19002x2ed0dc6f);
            }
            return this.f19004xcb94b041[5] ? i18 + b36.f.e(5, this.f19005x8bff388a) : i18;
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
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x920372523 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252();
                if (bArr != null && bArr.length > 0) {
                    c4455x920372523.mo11468x92b714fd(bArr);
                }
                this.f19001x92037252 = c4455x920372523;
            }
            this.f19004xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19003x5af05f5 = aVar2.d(intValue);
            this.f19004xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19006x14f51cd8 = aVar2.g(intValue);
            this.f19004xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f19002x2ed0dc6f = aVar2.g(intValue);
            this.f19004xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f19005x8bff388a = aVar2.g(intValue);
        this.f19004xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setBaseResponse */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39439x1f73abb4(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x92037252) {
        this.f19001x92037252 = c4455x92037252;
        this.f19004xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCityId */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39440x73a4ae8(int i17) {
        this.f19002x2ed0dc6f = i17;
        this.f19004xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setData_ */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39441x52dac6b3(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f19003x5af05f5 = gVar;
        this.f19004xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setProvinceId */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39442x292b2e6d(int i17) {
        this.f19005x8bff388a = i17;
        this.f19004xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setVersion */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39443xc633a616(int i17) {
        this.f19006x14f51cd8 = i17;
        this.f19004xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 m39438x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4521x163cc5e5) super.mo11468x92b714fd(bArr);
    }
}
