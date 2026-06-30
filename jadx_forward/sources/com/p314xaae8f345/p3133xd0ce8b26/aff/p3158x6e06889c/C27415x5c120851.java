package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderNotification */
/* loaded from: classes2.dex */
public class C27415x5c120851 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 f59963xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851();

    /* renamed from: ext_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59965x9320c00c;

    /* renamed from: feed_jump_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59966x1a8e88be;

    /* renamed from: notification_type */
    public int f59969xa24e9a0e;

    /* renamed from: udf_kv_json */
    public java.lang.String f59972x40d06b4;

    /* renamed from: title */
    public java.lang.String f59971x6942258 = "";

    /* renamed from: content */
    public java.lang.String f59964x38b73479 = "";

    /* renamed from: sub_type */
    public int f59970x840c71d9 = 0;

    /* renamed from: link */
    public java.lang.String f59967x32affa = "";

    /* renamed from: miniapp_name */
    public java.lang.String f59968x65a9c340 = "";

    public C27415x5c120851() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        this.f59965x9320c00c = gVar;
        this.f59972x40d06b4 = "";
        this.f59966x1a8e88be = gVar;
        this.f59969xa24e9a0e = 0;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114894xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114895x7c90cfc0() {
        return f59963xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114896x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114897x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 c27415x5c120851 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851) fVar;
        return n51.f.a(this.f59971x6942258, c27415x5c120851.f59971x6942258) && n51.f.a(this.f59964x38b73479, c27415x5c120851.f59964x38b73479) && n51.f.a(java.lang.Integer.valueOf(this.f59970x840c71d9), java.lang.Integer.valueOf(c27415x5c120851.f59970x840c71d9)) && n51.f.a(this.f59967x32affa, c27415x5c120851.f59967x32affa) && n51.f.a(this.f59968x65a9c340, c27415x5c120851.f59968x65a9c340) && n51.f.a(this.f59965x9320c00c, c27415x5c120851.f59965x9320c00c) && n51.f.a(this.f59972x40d06b4, c27415x5c120851.f59972x40d06b4) && n51.f.a(this.f59966x1a8e88be, c27415x5c120851.f59966x1a8e88be) && n51.f.a(java.lang.Integer.valueOf(this.f59969xa24e9a0e), java.lang.Integer.valueOf(c27415x5c120851.f59969xa24e9a0e));
    }

    /* renamed from: getContent */
    public java.lang.String m114898x76847043() {
        return this.f59964x38b73479;
    }

    /* renamed from: getExtInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114899xefeda639() {
        return this.f59965x9320c00c;
    }

    /* renamed from: getExt_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114900xefafd82() {
        return this.f59965x9320c00c;
    }

    /* renamed from: getFeedJumpInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114901x70476430() {
        return this.f59966x1a8e88be;
    }

    /* renamed from: getFeed_jump_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114902x92655b4() {
        return this.f59966x1a8e88be;
    }

    /* renamed from: getLink */
    public java.lang.String m114903xfb821870() {
        return this.f59967x32affa;
    }

    /* renamed from: getMiniappName */
    public java.lang.String m114904x92c352df() {
        return this.f59968x65a9c340;
    }

    /* renamed from: getMiniapp_name */
    public java.lang.String m114905xc69c55b6() {
        return this.f59968x65a9c340;
    }

    /* renamed from: getNotificationType */
    public int m114906x7e6863b() {
        return this.f59969xa24e9a0e;
    }

    /* renamed from: getNotification_type */
    public int m114907xf5832158() {
        return this.f59969xa24e9a0e;
    }

    /* renamed from: getSubType */
    public int m114908xce6ddd64() {
        return this.f59970x840c71d9;
    }

    /* renamed from: getSub_type */
    public int m114909xffe6af4f() {
        return this.f59970x840c71d9;
    }

    /* renamed from: getTitle */
    public java.lang.String m114910x7531c8a2() {
        return this.f59971x6942258;
    }

    /* renamed from: getUdfKvJson */
    public java.lang.String m114911xf102fcd4() {
        return this.f59972x40d06b4;
    }

    /* renamed from: getUdf_kv_json */
    public java.lang.String m114912xdde34d7e() {
        return this.f59972x40d06b4;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114913x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59971x6942258;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59964x38b73479;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f59970x840c71d9);
            java.lang.String str3 = this.f59967x32affa;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f59968x65a9c340;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59965x9320c00c;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str5 = this.f59972x40d06b4;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59966x1a8e88be;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            fVar.e(9, this.f59969xa24e9a0e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f59971x6942258;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f59964x38b73479;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f59970x840c71d9);
            java.lang.String str8 = this.f59967x32affa;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f59968x65a9c340;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f59965x9320c00c;
            if (gVar3 != null) {
                e17 += b36.f.b(6, gVar3);
            }
            java.lang.String str10 = this.f59972x40d06b4;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f59966x1a8e88be;
            if (gVar4 != null) {
                e17 += b36.f.b(8, gVar4);
            }
            return e17 + b36.f.e(9, this.f59969xa24e9a0e);
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
                this.f59971x6942258 = aVar2.k(intValue);
                return 0;
            case 2:
                this.f59964x38b73479 = aVar2.k(intValue);
                return 0;
            case 3:
                this.f59970x840c71d9 = aVar2.g(intValue);
                return 0;
            case 4:
                this.f59967x32affa = aVar2.k(intValue);
                return 0;
            case 5:
                this.f59968x65a9c340 = aVar2.k(intValue);
                return 0;
            case 6:
                this.f59965x9320c00c = aVar2.d(intValue);
                return 0;
            case 7:
                this.f59972x40d06b4 = aVar2.k(intValue);
                return 0;
            case 8:
                this.f59966x1a8e88be = aVar2.d(intValue);
                return 0;
            case 9:
                this.f59969xa24e9a0e = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setContent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114915xe9f5bdb7(java.lang.String str) {
        this.f59964x38b73479 = str;
        return this;
    }

    /* renamed from: setExtInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114916x635ef3ad(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59965x9320c00c = gVar;
        return this;
    }

    /* renamed from: setExt_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114917x9b35e8e(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59965x9320c00c = gVar;
        return this;
    }

    /* renamed from: setFeedJumpInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114918xa6905f3c(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59966x1a8e88be = gVar;
        return this;
    }

    /* renamed from: setFeed_jump_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114919xd11cbdc0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59966x1a8e88be = gVar;
        return this;
    }

    /* renamed from: setLink */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114920x764cdf7c(java.lang.String str) {
        this.f59967x32affa = str;
        return this;
    }

    /* renamed from: setMiniappName */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114921x2928c653(java.lang.String str) {
        this.f59968x65a9c340 = str;
        return this;
    }

    /* renamed from: setMiniapp_name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114922xfce550c2(java.lang.String str) {
        this.f59968x65a9c340 = str;
        return this;
    }

    /* renamed from: setNotificationType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114923xabe31b47(int i17) {
        this.f59969xa24e9a0e = i17;
        return this;
    }

    /* renamed from: setNotification_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114924xd1192dcc(int i17) {
        this.f59969xa24e9a0e = i17;
        return this;
    }

    /* renamed from: setSubType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114925x41df2ad8(int i17) {
        this.f59970x840c71d9 = i17;
        return this;
    }

    /* renamed from: setSub_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114926xfa9f105b(int i17) {
        this.f59970x840c71d9 = i17;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114927x53bfe316(java.lang.String str) {
        this.f59971x6942258 = str;
        return this;
    }

    /* renamed from: setUdfKvJson */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114928x4d56bd48(java.lang.String str) {
        this.f59972x40d06b4 = str;
        return this;
    }

    /* renamed from: setUdf_kv_json */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114929x7448c0f2(java.lang.String str) {
        this.f59972x40d06b4 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 m114914x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27415x5c120851) super.mo11468x92b714fd(bArr);
    }
}
