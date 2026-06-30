package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderWecomInfo */
/* loaded from: classes2.dex */
public class C27433xd245299b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b f60144xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b();

    /* renamed from: kf_url */
    public java.lang.String f60147xbc60dc8b = "";

    /* renamed from: contact_id */
    public java.lang.String f60145x856599a = "";

    /* renamed from: contact_wording */
    public java.lang.String f60146xa155a779 = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115655xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115656x7c90cfc0() {
        return f60144xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115657x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115658x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b c27433xd245299b = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b) fVar;
        return n51.f.a(this.f60147xbc60dc8b, c27433xd245299b.f60147xbc60dc8b) && n51.f.a(this.f60145x856599a, c27433xd245299b.f60145x856599a) && n51.f.a(this.f60146xa155a779, c27433xd245299b.f60146xa155a779);
    }

    /* renamed from: getContactId */
    public java.lang.String m115659xe6ec16a5() {
        return this.f60145x856599a;
    }

    /* renamed from: getContactWording */
    public java.lang.String m115660x2e93594e() {
        return this.f60146xa155a779;
    }

    /* renamed from: getContact_id */
    public java.lang.String m115661xf6971190() {
        return this.f60145x856599a;
    }

    /* renamed from: getContact_wording */
    public java.lang.String m115662x85b77943() {
        return this.f60146xa155a779;
    }

    /* renamed from: getKfUrl */
    public java.lang.String m115663x74b1245e() {
        return this.f60147xbc60dc8b;
    }

    /* renamed from: getKf_url */
    public java.lang.String m115664x2177ff81() {
        return this.f60147xbc60dc8b;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115665x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60147xbc60dc8b;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f60145x856599a;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f60146xa155a779;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f60147xbc60dc8b;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f60145x856599a;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f60146xa155a779;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
            this.f60147xbc60dc8b = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60145x856599a = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f60146xa155a779 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setContactId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115667x433fd719(java.lang.String str) {
        this.f60145x856599a = str;
        return this;
    }

    /* renamed from: setContactWording */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115668xf689c15a(java.lang.String str) {
        this.f60146xa155a779 = str;
        return this;
    }

    /* renamed from: setContact_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115669x24bb5f9c(java.lang.String str) {
        this.f60145x856599a = str;
        return this;
    }

    /* renamed from: setContact_wording */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115670xbc8e12b7(java.lang.String str) {
        this.f60146xa155a779 = str;
        return this;
    }

    /* renamed from: setKfUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115671x533f3ed2(java.lang.String str) {
        this.f60147xbc60dc8b = str;
        return this;
    }

    /* renamed from: setKf_url */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115672x14ad338d(java.lang.String str) {
        this.f60147xbc60dc8b = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b m115666x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27433xd245299b) super.mo11468x92b714fd(bArr);
    }
}
