package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkFaceRecognizeRequest */
/* loaded from: classes8.dex */
public class C2992xa3213f01 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 f10365xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01();

    /* renamed from: data_type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 f10366xea5792af;

    /* renamed from: face_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10367x9662444c;

    /* renamed from: hasSetFields */
    private final boolean[] f10368xcb94b041 = new boolean[8];

    /* renamed from: recg_type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b f10369x2c8d7ca2;

    /* renamed from: retry_count */
    private int f10370xc8af38b8;

    /* renamed from: timeout_ms */
    private int f10371x5f1f1d44;

    /* renamed from: wxbase_req */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10372xa7a0bc11;

    /* renamed from: wxpay_req */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10373x6e72a686;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22698xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22699x7c90cfc0() {
        return f10365xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22700x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22701x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 c2992xa3213f01 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10371x5f1f1d44), java.lang.Integer.valueOf(c2992xa3213f01.f10371x5f1f1d44)) && n51.f.a(this.f10369x2c8d7ca2, c2992xa3213f01.f10369x2c8d7ca2) && n51.f.a(this.f10366xea5792af, c2992xa3213f01.f10366xea5792af) && n51.f.a(this.f10367x9662444c, c2992xa3213f01.f10367x9662444c) && n51.f.a(this.f10372xa7a0bc11, c2992xa3213f01.f10372xa7a0bc11) && n51.f.a(this.f10373x6e72a686, c2992xa3213f01.f10373x6e72a686) && n51.f.a(java.lang.Integer.valueOf(this.f10370xc8af38b8), java.lang.Integer.valueOf(c2992xa3213f01.f10370xc8af38b8));
    }

    /* renamed from: getDataType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 m22702xe67d4b7a() {
        return this.f10368xcb94b041[3] ? this.f10366xea5792af : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1.kFaceDataType_3D;
    }

    /* renamed from: getFaceData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22703x996e011d() {
        return this.f10368xcb94b041[4] ? this.f10367x9662444c : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getRecgType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b m22704x4bb8d727() {
        return this.f10368xcb94b041[2] ? this.f10369x2c8d7ca2 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b.kFaceRecognizeType_WxPayOnly;
    }

    /* renamed from: getRetryCount */
    public int m22705xa8e25f3d() {
        return this.f10370xc8af38b8;
    }

    /* renamed from: getTimeoutMs */
    public int m22706x27ef431() {
        return this.f10371x5f1f1d44;
    }

    /* renamed from: getWxbaseReq */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22707x88f68f56() {
        return this.f10368xcb94b041[5] ? this.f10372xa7a0bc11 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getWxpayReq */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22708x561fce6d() {
        return this.f10368xcb94b041[6] ? this.f10373x6e72a686 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasDataType */
    public boolean m22709x15f7cabe() {
        return m22711x6e095e9(3);
    }

    /* renamed from: hasFaceData */
    public boolean m22710xc8e88061() {
        return m22711x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22711x6e095e9(int i17) {
        return this.f10368xcb94b041[i17];
    }

    /* renamed from: hasRecgType */
    public boolean m22712x7b33566b() {
        return m22711x6e095e9(2);
    }

    /* renamed from: hasRetryCount */
    public boolean m22713xe3ba1d81() {
        return m22711x6e095e9(7);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m22714xc2545d6d() {
        return m22711x6e095e9(1);
    }

    /* renamed from: hasWxbaseReq */
    public boolean m22715x48cbf892() {
        return m22711x6e095e9(5);
    }

    /* renamed from: hasWxpayReq */
    public boolean m22716x859a4db1() {
        return m22711x6e095e9(6);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22717x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10368xcb94b041[1]) {
                fVar.e(1, this.f10371x5f1f1d44);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b enumC2976x2508ad6b = this.f10369x2c8d7ca2;
            if (enumC2976x2508ad6b != null && this.f10368xcb94b041[2]) {
                fVar.e(2, enumC2976x2508ad6b.f10251x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 enumC2972xeb1eefa1 = this.f10366xea5792af;
            if (enumC2972xeb1eefa1 != null && this.f10368xcb94b041[3]) {
                fVar.e(3, enumC2972xeb1eefa1.f10206x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10367x9662444c;
            if (gVar != null && this.f10368xcb94b041[4]) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10372xa7a0bc11;
            if (gVar2 != null && this.f10368xcb94b041[5]) {
                fVar.b(5, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10373x6e72a686;
            if (gVar3 != null && this.f10368xcb94b041[6]) {
                fVar.b(6, gVar3);
            }
            if (this.f10368xcb94b041[7]) {
                fVar.e(7, this.f10370xc8af38b8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10368xcb94b041[1] ? 0 + b36.f.e(1, this.f10371x5f1f1d44) : 0;
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b enumC2976x2508ad6b2 = this.f10369x2c8d7ca2;
            if (enumC2976x2508ad6b2 != null && this.f10368xcb94b041[2]) {
                e17 += b36.f.e(2, enumC2976x2508ad6b2.f10251x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 enumC2972xeb1eefa12 = this.f10366xea5792af;
            if (enumC2972xeb1eefa12 != null && this.f10368xcb94b041[3]) {
                e17 += b36.f.e(3, enumC2972xeb1eefa12.f10206x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10367x9662444c;
            if (gVar4 != null && this.f10368xcb94b041[4]) {
                e17 += b36.f.b(4, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f10372xa7a0bc11;
            if (gVar5 != null && this.f10368xcb94b041[5]) {
                e17 += b36.f.b(5, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f10373x6e72a686;
            if (gVar6 != null && this.f10368xcb94b041[6]) {
                e17 += b36.f.b(6, gVar6);
            }
            return this.f10368xcb94b041[7] ? e17 + b36.f.e(7, this.f10370xc8af38b8) : e17;
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
                this.f10371x5f1f1d44 = aVar2.g(intValue);
                this.f10368xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10369x2c8d7ca2 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b.m22453x382ad972(aVar2.g(intValue));
                this.f10368xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10366xea5792af = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1.m22414x382ad972(aVar2.g(intValue));
                this.f10368xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10367x9662444c = aVar2.d(intValue);
                this.f10368xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10372xa7a0bc11 = aVar2.d(intValue);
                this.f10368xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10373x6e72a686 = aVar2.d(intValue);
                this.f10368xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10370xc8af38b8 = aVar2.g(intValue);
                this.f10368xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setDataType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22719xe135ac86(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 enumC2972xeb1eefa1) {
        this.f10366xea5792af = enumC2972xeb1eefa1;
        this.f10368xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFaceData */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22720x94266229(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10367x9662444c = gVar;
        this.f10368xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setRecgType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22721x46713833(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b enumC2976x2508ad6b) {
        this.f10369x2c8d7ca2 = enumC2976x2508ad6b;
        this.f10368xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22722xd706ad49(int i17) {
        this.f10370xc8af38b8 = i17;
        this.f10368xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22723x5ed2b4a5(int i17) {
        this.f10371x5f1f1d44 = i17;
        this.f10368xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setWxbaseReq */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22724xe54a4fca(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10372xa7a0bc11 = gVar;
        this.f10368xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setWxpayReq */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22725x50d82f79(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10373x6e72a686 = gVar;
        this.f10368xcb94b041[6] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 m22718x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01) super.mo11468x92b714fd(bArr);
    }
}
