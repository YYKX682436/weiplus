package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.PStatusMedia */
/* loaded from: classes10.dex */
public class C27523x94ca2ca2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 f60466xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2();

    /* renamed from: media_name */
    public java.lang.String f60469x739d1206 = "";

    /* renamed from: media_type */
    public int f60472x73a026b5 = 0;

    /* renamed from: media_url */
    public java.lang.String f60473x7f99d294 = "";

    /* renamed from: media_aes_key */
    public java.lang.String f60467x6aea3994 = "";

    /* renamed from: media_thumb_url */
    public java.lang.String f60471x1328a8eb = "";

    /* renamed from: media_thumb_aes_key */
    public java.lang.String f60470x53e80c6b = "";

    /* renamed from: media_duration_ms */
    public long f60468x32a06456 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117176xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117177x7c90cfc0() {
        return f60466xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117178x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117179x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 c27523x94ca2ca2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2) fVar;
        return n51.f.a(this.f60469x739d1206, c27523x94ca2ca2.f60469x739d1206) && n51.f.a(java.lang.Integer.valueOf(this.f60472x73a026b5), java.lang.Integer.valueOf(c27523x94ca2ca2.f60472x73a026b5)) && n51.f.a(this.f60473x7f99d294, c27523x94ca2ca2.f60473x7f99d294) && n51.f.a(this.f60467x6aea3994, c27523x94ca2ca2.f60467x6aea3994) && n51.f.a(this.f60471x1328a8eb, c27523x94ca2ca2.f60471x1328a8eb) && n51.f.a(this.f60470x53e80c6b, c27523x94ca2ca2.f60470x53e80c6b) && n51.f.a(java.lang.Long.valueOf(this.f60468x32a06456), java.lang.Long.valueOf(c27523x94ca2ca2.f60468x32a06456));
    }

    /* renamed from: getMediaAesKey */
    public java.lang.String m117180xa632eede() {
        return this.f60467x6aea3994;
    }

    /* renamed from: getMediaDurationMs */
    public long m117181xc13ad328() {
        return this.f60468x32a06456;
    }

    /* renamed from: getMediaName */
    public java.lang.String m117182x7eff3dd9() {
        return this.f60469x739d1206;
    }

    /* renamed from: getMediaThumbAesKey */
    public java.lang.String m117183xeb0eb578() {
        return this.f60470x53e80c6b;
    }

    /* renamed from: getMediaThumbUrl */
    public java.lang.String m117184x3ee2b007() {
        return this.f60471x1328a8eb;
    }

    /* renamed from: getMediaType */
    public int m117185x7f025288() {
        return this.f60472x73a026b5;
    }

    /* renamed from: getMediaUrl */
    public java.lang.String m117186x46296061() {
        return this.f60473x7f99d294;
    }

    /* renamed from: getMedia_aes_key */
    public java.lang.String m117187x2849f5de() {
        return this.f60467x6aea3994;
    }

    /* renamed from: getMedia_duration_ms */
    public long m117188x85d4eba0() {
        return this.f60468x32a06456;
    }

    /* renamed from: getMedia_name */
    public java.lang.String m117189x61ddc9fc() {
        return this.f60469x739d1206;
    }

    /* renamed from: getMedia_thumb_aes_key */
    public java.lang.String m117190xac17e935() {
        return this.f60470x53e80c6b;
    }

    /* renamed from: getMedia_thumb_url */
    public java.lang.String m117191xf78a7ab5() {
        return this.f60471x1328a8eb;
    }

    /* renamed from: getMedia_type */
    public int m117192x61e0deab() {
        return this.f60472x73a026b5;
    }

    /* renamed from: getMedia_url */
    public java.lang.String m117193x7f0743de() {
        return this.f60473x7f99d294;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117194x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60469x739d1206;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f60472x73a026b5);
            java.lang.String str2 = this.f60473x7f99d294;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f60467x6aea3994;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f60471x1328a8eb;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f60470x53e80c6b;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.h(7, this.f60468x32a06456);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f60469x739d1206;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f60472x73a026b5);
            java.lang.String str7 = this.f60473x7f99d294;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f60467x6aea3994;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f60471x1328a8eb;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f60470x53e80c6b;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            return j17 + b36.f.h(7, this.f60468x32a06456);
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
                this.f60469x739d1206 = aVar2.k(intValue);
                return 0;
            case 2:
                this.f60472x73a026b5 = aVar2.g(intValue);
                return 0;
            case 3:
                this.f60473x7f99d294 = aVar2.k(intValue);
                return 0;
            case 4:
                this.f60467x6aea3994 = aVar2.k(intValue);
                return 0;
            case 5:
                this.f60471x1328a8eb = aVar2.k(intValue);
                return 0;
            case 6:
                this.f60470x53e80c6b = aVar2.k(intValue);
                return 0;
            case 7:
                this.f60468x32a06456 = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setMediaAesKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117196x3c986252(java.lang.String str) {
        this.f60467x6aea3994 = str;
        return this;
    }

    /* renamed from: setMediaDurationMs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117197xf8116c9c(long j17) {
        this.f60468x32a06456 = j17;
        return this;
    }

    /* renamed from: setMediaName */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117198xdb52fe4d(java.lang.String str) {
        this.f60469x739d1206 = str;
        return this;
    }

    /* renamed from: setMediaThumbAesKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117199x8f0b4a84(java.lang.String str) {
        this.f60470x53e80c6b = str;
        return this;
    }

    /* renamed from: setMediaThumbUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117200xd1b9167b(java.lang.String str) {
        this.f60471x1328a8eb = str;
        return this;
    }

    /* renamed from: setMediaType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117201xdb5612fc(int i17) {
        this.f60472x73a026b5 = i17;
        return this;
    }

    /* renamed from: setMediaUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117202x40e1c16d(java.lang.String str) {
        this.f60473x7f99d294 = str;
        return this;
    }

    /* renamed from: setMedia_aes_key */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117203xbb205c52(java.lang.String str) {
        this.f60467x6aea3994 = str;
        return this;
    }

    /* renamed from: setMedia_duration_ms */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117204x616af814(long j17) {
        this.f60468x32a06456 = j17;
        return this;
    }

    /* renamed from: setMedia_name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117205x90021808(java.lang.String str) {
        this.f60469x739d1206 = str;
        return this;
    }

    /* renamed from: setMedia_thumb_aes_key */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117206xfa5ca8a9(java.lang.String str) {
        this.f60470x53e80c6b = str;
        return this;
    }

    /* renamed from: setMedia_thumb_url */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117207x2e611429(java.lang.String str) {
        this.f60471x1328a8eb = str;
        return this;
    }

    /* renamed from: setMedia_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117208x90052cb7(int i17) {
        this.f60472x73a026b5 = i17;
        return this;
    }

    /* renamed from: setMedia_url */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117209xdb5b0452(java.lang.String str) {
        this.f60473x7f99d294 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 m117195x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27523x94ca2ca2) super.mo11468x92b714fd(bArr);
    }
}
