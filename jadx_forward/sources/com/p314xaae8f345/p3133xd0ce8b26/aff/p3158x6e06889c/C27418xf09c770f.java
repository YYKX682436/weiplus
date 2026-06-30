package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderObjectUidUnit */
/* loaded from: classes2.dex */
public class C27418xf09c770f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f f59982xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f();

    /* renamed from: object_id */
    public long f59987xa736921b = 0;

    /* renamed from: object_nonce_id */
    public java.lang.String f59988xd76b446b = "";

    /* renamed from: ad_flag */
    public int f59983xbb4bca08 = 0;

    /* renamed from: object_cookie */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59986x1dac0f64 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: encrypted_object_id */
    public java.lang.String f59984x1d8d6160 = "";

    /* renamed from: live_id */
    public long f59985xafc094e = 0;

    /* renamed from: object_product_id */
    public long f59989x75e4f6b = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114979xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114980x7c90cfc0() {
        return f59982xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114981x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114982x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f c27418xf09c770f = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f59987xa736921b), java.lang.Long.valueOf(c27418xf09c770f.f59987xa736921b)) && n51.f.a(this.f59988xd76b446b, c27418xf09c770f.f59988xd76b446b) && n51.f.a(java.lang.Integer.valueOf(this.f59983xbb4bca08), java.lang.Integer.valueOf(c27418xf09c770f.f59983xbb4bca08)) && n51.f.a(this.f59986x1dac0f64, c27418xf09c770f.f59986x1dac0f64) && n51.f.a(this.f59984x1d8d6160, c27418xf09c770f.f59984x1d8d6160) && n51.f.a(java.lang.Long.valueOf(this.f59985xafc094e), java.lang.Long.valueOf(c27418xf09c770f.f59985xafc094e)) && n51.f.a(java.lang.Long.valueOf(this.f59989x75e4f6b), java.lang.Long.valueOf(c27418xf09c770f.f59989x75e4f6b));
    }

    /* renamed from: getAdFlag */
    public int m114983x103fd925() {
        return this.f59983xbb4bca08;
    }

    /* renamed from: getAd_flag */
    public int m114984xf91905d2() {
        return this.f59983xbb4bca08;
    }

    /* renamed from: getEncryptedObjectId */
    public java.lang.String m114985x4dbff9e8() {
        return this.f59984x1d8d6160;
    }

    /* renamed from: getEncrypted_object_id */
    public java.lang.String m114986x75bd3e2a() {
        return this.f59984x1d8d6160;
    }

    /* renamed from: getLiveId */
    public long m114987x2361521d() {
        return this.f59985xafc094e;
    }

    /* renamed from: getLive_id */
    public long m114988x48c94518() {
        return this.f59985xafc094e;
    }

    /* renamed from: getObjectCookie */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114989xf8fa80f9() {
        return this.f59986x1dac0f64;
    }

    /* renamed from: getObjectId */
    public long m114990x813f1630() {
        return this.f59987xa736921b;
    }

    /* renamed from: getObjectNonceId */
    public java.lang.String m114991x6c285d75() {
        return this.f59988xd76b446b;
    }

    /* renamed from: getObjectProductId */
    public long m114992x9b3bdbb5() {
        return this.f59989x75e4f6b;
    }

    /* renamed from: getObject_cookie */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114993xdb0bcbae() {
        return this.f59986x1dac0f64;
    }

    /* renamed from: getObject_id */
    public long m114994xa6a40365() {
        return this.f59987xa736921b;
    }

    /* renamed from: getObject_nonce_id */
    public java.lang.String m114995xbbcd1635() {
        return this.f59988xd76b446b;
    }

    /* renamed from: getObject_product_id */
    public long m114996x5a92d6b5() {
        return this.f59989x75e4f6b;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114997x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f59987xa736921b);
            java.lang.String str = this.f59988xd76b446b;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f59983xbb4bca08);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59986x1dac0f64;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f59984x1d8d6160;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f59985xafc094e);
            fVar.h(7, this.f59989x75e4f6b);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f59987xa736921b) + 0;
            java.lang.String str3 = this.f59988xd76b446b;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int e17 = h17 + b36.f.e(3, this.f59983xbb4bca08);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59986x1dac0f64;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            java.lang.String str4 = this.f59984x1d8d6160;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.h(6, this.f59985xafc094e) + b36.f.h(7, this.f59989x75e4f6b);
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
                this.f59987xa736921b = aVar2.i(intValue);
                return 0;
            case 2:
                this.f59988xd76b446b = aVar2.k(intValue);
                return 0;
            case 3:
                this.f59983xbb4bca08 = aVar2.g(intValue);
                return 0;
            case 4:
                this.f59986x1dac0f64 = aVar2.d(intValue);
                return 0;
            case 5:
                this.f59984x1d8d6160 = aVar2.k(intValue);
                return 0;
            case 6:
                this.f59985xafc094e = aVar2.i(intValue);
                return 0;
            case 7:
                this.f59989x75e4f6b = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAdFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114999x3750d31(int i17) {
        this.f59983xbb4bca08 = i17;
        return this;
    }

    /* renamed from: setAd_flag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115000x6c8a5346(int i17) {
        this.f59983xbb4bca08 = i17;
        return this;
    }

    /* renamed from: setEncryptedObjectId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115001x2956065c(java.lang.String str) {
        this.f59984x1d8d6160 = str;
        return this;
    }

    /* renamed from: setEncrypted_object_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115002xc401fd9e(java.lang.String str) {
        this.f59984x1d8d6160 = str;
        return this;
    }

    /* renamed from: setLiveId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115003x16968629(long j17) {
        this.f59985xafc094e = j17;
        return this;
    }

    /* renamed from: setLive_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115004xbc3a928c(long j17) {
        this.f59985xafc094e = j17;
        return this;
    }

    /* renamed from: setObjectCookie */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115005x2f437c05(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59986x1dac0f64 = gVar;
        return this;
    }

    /* renamed from: setObjectId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115006x7bf7773c(long j17) {
        this.f59987xa736921b = j17;
        return this;
    }

    /* renamed from: setObjectNonceId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115007xfefec3e9(java.lang.String str) {
        this.f59988xd76b446b = str;
        return this;
    }

    /* renamed from: setObjectProductId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115008xd2127529(long j17) {
        this.f59989x75e4f6b = j17;
        return this;
    }

    /* renamed from: setObject_cookie */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115009x6de23222(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59986x1dac0f64 = gVar;
        return this;
    }

    /* renamed from: setObject_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115010x2f7c3d9(long j17) {
        this.f59987xa736921b = j17;
        return this;
    }

    /* renamed from: setObject_nonce_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115011xf2a3afa9(java.lang.String str) {
        this.f59988xd76b446b = str;
        return this;
    }

    /* renamed from: setObject_product_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m115012x3628e329(long j17) {
        this.f59989x75e4f6b = j17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f m114998x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f) super.mo11468x92b714fd(bArr);
    }
}
