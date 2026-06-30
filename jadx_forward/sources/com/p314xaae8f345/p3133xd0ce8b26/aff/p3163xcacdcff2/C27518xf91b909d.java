package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.PStatusFooter */
/* loaded from: classes8.dex */
public class C27518xf91b909d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d f60434xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d();
    public int uin = 0;

    /* renamed from: sourceId */
    public java.lang.String f60439x6816d696 = "";

    /* renamed from: sourceActivityId */
    public java.lang.String f60437x643a9305 = "";

    /* renamed from: sourceName */
    public java.lang.String f60440xbdbdd146 = "";

    /* renamed from: sourceIcon */
    public java.lang.String f60438xbdbb9334 = "";

    /* renamed from: createTime */
    public int f60435x519c89e9 = 0;

    /* renamed from: jumps */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> f60436x60c9205 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117061xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117062x7c90cfc0() {
        return f60434xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117063x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d();
    }

    /* renamed from: addAllElementJumps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117064xbaa3adc9(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> collection) {
        this.f60436x60c9205.addAll(collection);
        return this;
    }

    /* renamed from: addElementJumps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117065x586e63aa(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e c27522xf9b5287e) {
        this.f60436x60c9205.add(c27522xf9b5287e);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117066x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d c27518xf91b909d = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.uin), java.lang.Integer.valueOf(c27518xf91b909d.uin)) && n51.f.a(this.f60439x6816d696, c27518xf91b909d.f60439x6816d696) && n51.f.a(this.f60437x643a9305, c27518xf91b909d.f60437x643a9305) && n51.f.a(this.f60440xbdbdd146, c27518xf91b909d.f60440xbdbdd146) && n51.f.a(this.f60438xbdbb9334, c27518xf91b909d.f60438xbdbb9334) && n51.f.a(java.lang.Integer.valueOf(this.f60435x519c89e9), java.lang.Integer.valueOf(c27518xf91b909d.f60435x519c89e9)) && n51.f.a(this.f60436x60c9205, c27518xf91b909d.f60436x60c9205);
    }

    /* renamed from: getCreateTime */
    public int m117067x3fdd41df() {
        return this.f60435x519c89e9;
    }

    /* renamed from: getJumps */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> m117068x74aa384f() {
        return this.f60436x60c9205;
    }

    /* renamed from: getSourceActivityId */
    public java.lang.String m117069xc12fa7b() {
        return this.f60437x643a9305;
    }

    /* renamed from: getSourceIcon */
    public java.lang.String m117070xabfc4b2a() {
        return this.f60438xbdbb9334;
    }

    /* renamed from: getSourceId */
    public java.lang.String m117071xe3f1140c() {
        return this.f60439x6816d696;
    }

    /* renamed from: getSourceName */
    public java.lang.String m117072xabfe893c() {
        return this.f60440xbdbdd146;
    }

    /* renamed from: getUin */
    public int m117073xb5887524() {
        return this.uin;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117074x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.uin);
            java.lang.String str = this.f60439x6816d696;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f60437x643a9305;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f60440xbdbdd146;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f60438xbdbb9334;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f60435x519c89e9);
            fVar.g(21, 8, this.f60436x60c9205);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.uin) + 0;
            java.lang.String str5 = this.f60439x6816d696;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f60437x643a9305;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f60440xbdbdd146;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f60438xbdbb9334;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f60435x519c89e9) + b36.f.g(21, 8, this.f60436x60c9205);
        }
        if (i17 == 2) {
            this.f60436x60c9205.clear();
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
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e c27522xf9b5287e = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e();
                if (bArr != null && bArr.length > 0) {
                    c27522xf9b5287e.mo11468x92b714fd(bArr);
                }
                this.f60436x60c9205.add(c27522xf9b5287e);
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                this.uin = aVar2.g(intValue);
                return 0;
            case 2:
                this.f60439x6816d696 = aVar2.k(intValue);
                return 0;
            case 3:
                this.f60437x643a9305 = aVar2.k(intValue);
                return 0;
            case 4:
                this.f60440xbdbdd146 = aVar2.k(intValue);
                return 0;
            case 5:
                this.f60438xbdbb9334 = aVar2.k(intValue);
                return 0;
            case 6:
                this.f60435x519c89e9 = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCreateTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117076x6e018feb(int i17) {
        this.f60435x519c89e9 = i17;
        return this;
    }

    /* renamed from: setJumps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117077x533852c3(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> linkedList) {
        this.f60436x60c9205 = linkedList;
        return this;
    }

    /* renamed from: setSourceActivityId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117078xb00f8f87(java.lang.String str) {
        this.f60437x643a9305 = str;
        return this;
    }

    /* renamed from: setSourceIcon */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117079xda209936(java.lang.String str) {
        this.f60438xbdbb9334 = str;
        return this;
    }

    /* renamed from: setSourceId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117080xdea97518(java.lang.String str) {
        this.f60439x6816d696 = str;
        return this;
    }

    /* renamed from: setSourceName */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117081xda22d748(java.lang.String str) {
        this.f60440xbdbdd146 = str;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117082xca029c98(int i17) {
        this.uin = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d m117075x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27518xf91b909d) super.mo11468x92b714fd(bArr);
    }
}
