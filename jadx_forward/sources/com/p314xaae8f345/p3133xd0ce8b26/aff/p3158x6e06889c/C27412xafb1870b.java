package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderMentionExtInfo */
/* loaded from: classes10.dex */
public class C27412xafb1870b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b f59951xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b();

    /* renamed from: app_name */
    public java.lang.String f59952x4598e5e9 = "";

    /* renamed from: entity_id */
    public java.lang.String f59953xd3dbdef7 = "";

    /* renamed from: ext_buff */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59954x931dabb1 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114839xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114840x7c90cfc0() {
        return f59951xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114841x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114842x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b c27412xafb1870b = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b) fVar;
        return n51.f.a(this.f59952x4598e5e9, c27412xafb1870b.f59952x4598e5e9) && n51.f.a(this.f59953xd3dbdef7, c27412xafb1870b.f59953xd3dbdef7) && n51.f.a(this.f59954x931dabb1, c27412xafb1870b.f59954x931dabb1);
    }

    /* renamed from: getAppName */
    public java.lang.String m114843xe77ac16() {
        return this.f59952x4598e5e9;
    }

    /* renamed from: getApp_name */
    public java.lang.String m114844xc173235f() {
        return this.f59952x4598e5e9;
    }

    /* renamed from: getEntityId */
    public java.lang.String m114845xfe8ebdd4() {
        return this.f59953xd3dbdef7;
    }

    /* renamed from: getEntity_id */
    public java.lang.String m114846xd3495041() {
        return this.f59953xd3dbdef7;
    }

    /* renamed from: getExtBuff */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114847xefea91de() {
        return this.f59954x931dabb1;
    }

    /* renamed from: getExt_buff */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114848xef7e927() {
        return this.f59954x931dabb1;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114849x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59952x4598e5e9;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59953xd3dbdef7;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59954x931dabb1;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f59952x4598e5e9;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f59953xd3dbdef7;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59954x931dabb1;
            return gVar2 != null ? j17 + b36.f.b(3, gVar2) : j17;
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
            this.f59952x4598e5e9 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f59953xd3dbdef7 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f59954x931dabb1 = aVar2.d(intValue);
        return 0;
    }

    /* renamed from: setAppName */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114851x81e8f98a(java.lang.String str) {
        this.f59952x4598e5e9 = str;
        return this;
    }

    /* renamed from: setApp_name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114852xbc2b846b(java.lang.String str) {
        this.f59952x4598e5e9 = str;
        return this;
    }

    /* renamed from: setEntityId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114853xf9471ee0(java.lang.String str) {
        this.f59953xd3dbdef7 = str;
        return this;
    }

    /* renamed from: setEntity_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114854x2f9d10b5(java.lang.String str) {
        this.f59953xd3dbdef7 = str;
        return this;
    }

    /* renamed from: setExtBuff */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114855x635bdf52(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59954x931dabb1 = gVar;
        return this;
    }

    /* renamed from: setExt_buff */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114856x9b04a33(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59954x931dabb1 = gVar;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b m114850x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27412xafb1870b) super.mo11468x92b714fd(bArr);
    }
}
