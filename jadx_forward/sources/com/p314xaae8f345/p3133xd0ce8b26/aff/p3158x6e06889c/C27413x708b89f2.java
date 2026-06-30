package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderMiniAppInfo */
/* loaded from: classes4.dex */
public class C27413x708b89f2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 f59955xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2();

    /* renamed from: app_id */
    public java.lang.String f59956xabe4b7f9 = "";

    /* renamed from: path */
    public java.lang.String f59959x346425 = "";

    /* renamed from: nick_name */
    public java.lang.String f59958x81d0c1e7 = "";

    /* renamed from: icon_url */
    public java.lang.String f59957xd4094ca9 = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114858xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114859x7c90cfc0() {
        return f59955xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114860x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114861x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 c27413x708b89f2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2) fVar;
        return n51.f.a(this.f59956xabe4b7f9, c27413x708b89f2.f59956xabe4b7f9) && n51.f.a(this.f59959x346425, c27413x708b89f2.f59959x346425) && n51.f.a(this.f59958x81d0c1e7, c27413x708b89f2.f59958x81d0c1e7) && n51.f.a(this.f59957xd4094ca9, c27413x708b89f2.f59957xd4094ca9);
    }

    /* renamed from: getAppId */
    public java.lang.String m114862x74292566() {
        return this.f59956xabe4b7f9;
    }

    /* renamed from: getApp_id */
    public java.lang.String m114863x10fbdaef() {
        return this.f59956xabe4b7f9;
    }

    /* renamed from: getIconUrl */
    public java.lang.String m114864x9f7ace00() {
        return this.f59957xd4094ca9;
    }

    /* renamed from: getIcon_url */
    public java.lang.String m114865x4fe38a1f() {
        return this.f59957xd4094ca9;
    }

    /* renamed from: getNickName */
    public java.lang.String m114866x80025a04() {
        return this.f59958x81d0c1e7;
    }

    /* renamed from: getNick_name */
    public java.lang.String m114867x813e3331() {
        return this.f59958x81d0c1e7;
    }

    /* renamed from: getPath */
    public java.lang.String m114868xfb83cc9b() {
        return this.f59959x346425;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114869x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59956xabe4b7f9;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59959x346425;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f59958x81d0c1e7;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f59957xd4094ca9;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f59956xabe4b7f9;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f59959x346425;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f59958x81d0c1e7;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f59957xd4094ca9;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
            this.f59956xabe4b7f9 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f59959x346425 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f59958x81d0c1e7 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f59957xd4094ca9 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setAppId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114871x52b73fda(java.lang.String str) {
        this.f59956xabe4b7f9 = str;
        return this;
    }

    /* renamed from: setApp_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114872x4310efb(java.lang.String str) {
        this.f59956xabe4b7f9 = str;
        return this;
    }

    /* renamed from: setIconUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114873x12ec1b74(java.lang.String str) {
        this.f59957xd4094ca9 = str;
        return this;
    }

    /* renamed from: setIcon_url */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114874x4a9beb2b(java.lang.String str) {
        this.f59957xd4094ca9 = str;
        return this;
    }

    /* renamed from: setNickName */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114875x7ababb10(java.lang.String str) {
        this.f59958x81d0c1e7 = str;
        return this;
    }

    /* renamed from: setNick_name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114876xdd91f3a5(java.lang.String str) {
        this.f59958x81d0c1e7 = str;
        return this;
    }

    /* renamed from: setPath */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114877x764e93a7(java.lang.String str) {
        this.f59959x346425 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 m114870x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2) super.mo11468x92b714fd(bArr);
    }
}
