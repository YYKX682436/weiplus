package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderBizInfo */
/* loaded from: classes4.dex */
public class C27397xe54d8d3b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b f59823xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b();

    /* renamed from: info */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo> f59824x3164ae = new java.util.LinkedList<>();

    /* renamed from: miniapps */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2> f59825xaef8eb49 = new java.util.LinkedList<>();

    /* renamed from: com.tencent.wechat.aff.newlife.FinderBizInfo$BizAuthInfo */
    /* loaded from: classes4.dex */
    public static class BizAuthInfo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo f59826xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo();

        /* renamed from: auth_icon_type */
        public int f59827xe4b3d569 = 0;

        /* renamed from: auth_icon_url */
        public java.lang.String f59828x72bb7d60 = "";

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114338xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114339x7c90cfc0() {
            return f59826xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114340x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114341x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo bizAuthInfo = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.f59827xe4b3d569), java.lang.Integer.valueOf(bizAuthInfo.f59827xe4b3d569)) && n51.f.a(this.f59828x72bb7d60, bizAuthInfo.f59828x72bb7d60);
        }

        /* renamed from: getAuthIconType */
        public int m114342x1cbb0791() {
            return this.f59827xe4b3d569;
        }

        /* renamed from: getAuthIconUrl */
        public java.lang.String m114343x11716638() {
            return this.f59828x72bb7d60;
        }

        /* renamed from: getAuth_icon_type */
        public int m114344xd34ba25f() {
            return this.f59827xe4b3d569;
        }

        /* renamed from: getAuth_icon_url */
        public java.lang.String m114345x301b39aa() {
            return this.f59828x72bb7d60;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114346x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.f59827xe4b3d569);
                java.lang.String str = this.f59828x72bb7d60;
                if (str != null) {
                    fVar.j(2, str);
                }
                return 0;
            }
            if (i17 == 1) {
                int e17 = b36.f.e(1, this.f59827xe4b3d569) + 0;
                java.lang.String str2 = this.f59828x72bb7d60;
                return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
                this.f59827xe4b3d569 = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.f59828x72bb7d60 = aVar2.k(intValue);
            return 0;
        }

        /* renamed from: setAuthIconType */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114348x5304029d(int i17) {
            this.f59827xe4b3d569 = i17;
            return this;
        }

        /* renamed from: setAuthIconUrl */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114349xa7d6d9ac(java.lang.String str) {
            this.f59828x72bb7d60 = str;
            return this;
        }

        /* renamed from: setAuth_icon_type */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114350x9b420a6b(int i17) {
            this.f59827xe4b3d569 = i17;
            return this;
        }

        /* renamed from: setAuth_icon_url */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114351xc2f1a01e(java.lang.String str) {
            this.f59828x72bb7d60 = str;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114347x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: com.tencent.wechat.aff.newlife.FinderBizInfo$BizInfo */
    /* loaded from: classes4.dex */
    public static class BizInfo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo f59829xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo();

        /* renamed from: biz_username */
        public java.lang.String f59833x645d4282 = "";

        /* renamed from: biz_nickname */
        public java.lang.String f59831x786a621a = "";

        /* renamed from: head_img_url */
        public java.lang.String f59835x57cb8794 = "";

        /* renamed from: biz_uin */
        public int f59832xfa33af2e = 0;

        /* renamed from: friend_follow_count */
        public int f59834x6dd3b702 = 0;

        /* renamed from: auth_info */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo f59830x570e88e5 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo.m114339x7c90cfc0();

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114353xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114354x7c90cfc0() {
            return f59829xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114355x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114356x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo bizInfo = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo) fVar;
            return n51.f.a(this.f59833x645d4282, bizInfo.f59833x645d4282) && n51.f.a(this.f59831x786a621a, bizInfo.f59831x786a621a) && n51.f.a(this.f59835x57cb8794, bizInfo.f59835x57cb8794) && n51.f.a(java.lang.Integer.valueOf(this.f59832xfa33af2e), java.lang.Integer.valueOf(bizInfo.f59832xfa33af2e)) && n51.f.a(java.lang.Integer.valueOf(this.f59834x6dd3b702), java.lang.Integer.valueOf(bizInfo.f59834x6dd3b702)) && n51.f.a(this.f59830x570e88e5, bizInfo.f59830x570e88e5);
        }

        /* renamed from: getAuthInfo */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114357xd133dfec() {
            return this.f59830x570e88e5;
        }

        /* renamed from: getAuth_info */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo m114358x567bfa2f() {
            return this.f59830x570e88e5;
        }

        /* renamed from: getBizNickname */
        public java.lang.String m114359xbc300d6b() {
            return this.f59831x786a621a;
        }

        /* renamed from: getBizUin */
        public int m114360x1252753d() {
            return this.f59832xfa33af2e;
        }

        /* renamed from: getBizUsername */
        public java.lang.String m114361xa822edd3() {
            return this.f59833x645d4282;
        }

        /* renamed from: getBiz_nickname */
        public java.lang.String m114362xd95cf490() {
            return this.f59831x786a621a;
        }

        /* renamed from: getBiz_uin */
        public int m114363x3800eaf8() {
            return this.f59832xfa33af2e;
        }

        /* renamed from: getBiz_username */
        public java.lang.String m114364xc54fd4f8() {
            return this.f59833x645d4282;
        }

        /* renamed from: getFriendFollowCount */
        public int m114365x200fc1aa() {
            return this.f59834x6dd3b702;
        }

        /* renamed from: getFriend_follow_count */
        public int m114366xc60393cc() {
            return this.f59834x6dd3b702;
        }

        /* renamed from: getHeadImgUrl */
        public java.lang.String m114367x341984a2() {
            return this.f59835x57cb8794;
        }

        /* renamed from: getHead_img_url */
        public java.lang.String m114368xb8be1a0a() {
            return this.f59835x57cb8794;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114369x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.f59833x645d4282;
                if (str != null) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.f59831x786a621a;
                if (str2 != null) {
                    fVar.j(2, str2);
                }
                java.lang.String str3 = this.f59835x57cb8794;
                if (str3 != null) {
                    fVar.j(3, str3);
                }
                fVar.e(4, this.f59832xfa33af2e);
                fVar.e(5, this.f59834x6dd3b702);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo bizAuthInfo = this.f59830x570e88e5;
                if (bizAuthInfo != null) {
                    fVar.i(6, bizAuthInfo.mo75928xcd1e8d8());
                    this.f59830x570e88e5.mo75956x3d5d1f78(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str4 = this.f59833x645d4282;
                int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
                java.lang.String str5 = this.f59831x786a621a;
                if (str5 != null) {
                    j17 += b36.f.j(2, str5);
                }
                java.lang.String str6 = this.f59835x57cb8794;
                if (str6 != null) {
                    j17 += b36.f.j(3, str6);
                }
                int e17 = j17 + b36.f.e(4, this.f59832xfa33af2e) + b36.f.e(5, this.f59834x6dd3b702);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo bizAuthInfo2 = this.f59830x570e88e5;
                return bizAuthInfo2 != null ? e17 + b36.f.i(6, bizAuthInfo2.mo75928xcd1e8d8()) : e17;
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
                    this.f59833x645d4282 = aVar2.k(intValue);
                    return 0;
                case 2:
                    this.f59831x786a621a = aVar2.k(intValue);
                    return 0;
                case 3:
                    this.f59835x57cb8794 = aVar2.k(intValue);
                    return 0;
                case 4:
                    this.f59832xfa33af2e = aVar2.g(intValue);
                    return 0;
                case 5:
                    this.f59834x6dd3b702 = aVar2.g(intValue);
                    return 0;
                case 6:
                    java.util.LinkedList j18 = aVar2.j(intValue);
                    int size = j18.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j18.get(i18);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo bizAuthInfo3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo();
                        if (bArr != null && bArr.length > 0) {
                            bizAuthInfo3.mo11468x92b714fd(bArr);
                        }
                        this.f59830x570e88e5 = bizAuthInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }

        /* renamed from: setAuthInfo */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114371xcbec40f8(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo bizAuthInfo) {
            this.f59830x570e88e5 = bizAuthInfo;
            return this;
        }

        /* renamed from: setAuth_info */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114372xb2cfbaa3(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizAuthInfo bizAuthInfo) {
            this.f59830x570e88e5 = bizAuthInfo;
            return this;
        }

        /* renamed from: setBizNickname */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114373x529580df(java.lang.String str) {
            this.f59831x786a621a = str;
            return this;
        }

        /* renamed from: setBizUin */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114374x587a949(int i17) {
            this.f59832xfa33af2e = i17;
            return this;
        }

        /* renamed from: setBizUsername */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114375x3e886147(java.lang.String str) {
            this.f59833x645d4282 = str;
            return this;
        }

        /* renamed from: setBiz_nickname */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114376xfa5ef9c(java.lang.String str) {
            this.f59831x786a621a = str;
            return this;
        }

        /* renamed from: setBiz_uin */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114377xab72386c(int i17) {
            this.f59832xfa33af2e = i17;
            return this;
        }

        /* renamed from: setBiz_username */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114378xfb98d004(java.lang.String str) {
            this.f59833x645d4282 = str;
            return this;
        }

        /* renamed from: setFriendFollowCount */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114379xfba5ce1e(int i17) {
            this.f59834x6dd3b702 = i17;
            return this;
        }

        /* renamed from: setFriend_follow_count */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114380x14485340(int i17) {
            this.f59834x6dd3b702 = i17;
            return this;
        }

        /* renamed from: setHeadImgUrl */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114381x623dd2ae(java.lang.String str) {
            this.f59835x57cb8794 = str;
            return this;
        }

        /* renamed from: setHead_img_url */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114382xef071516(java.lang.String str) {
            this.f59835x57cb8794 = str;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo m114370x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114323xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114324x7c90cfc0() {
        return f59823xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114325x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b();
    }

    /* renamed from: addAllElementInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114326x8a25c06a(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo> collection) {
        this.f59824x3164ae.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementMiniapps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114327x2ba10905(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2> collection) {
        this.f59825xaef8eb49.addAll(collection);
        return this;
    }

    /* renamed from: addElementInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114328x4d2c4a69(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo bizInfo) {
        this.f59824x3164ae.add(bizInfo);
        return this;
    }

    /* renamed from: addElementMiniapps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114329x94447b84(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 c27413x708b89f2) {
        this.f59825xaef8eb49.add(c27413x708b89f2);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114330x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b c27397xe54d8d3b = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b) fVar;
        return n51.f.a(this.f59824x3164ae, c27397xe54d8d3b.f59824x3164ae) && n51.f.a(this.f59825xaef8eb49, c27397xe54d8d3b.f59825xaef8eb49);
    }

    /* renamed from: getInfo */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo> m114331xfb80cd24() {
        return this.f59824x3164ae;
    }

    /* renamed from: getMiniapps */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2> m114332x2ad328bf() {
        return this.f59825xaef8eb49;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114333x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f59824x3164ae);
            fVar.g(2, 8, this.f59825xaef8eb49);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f59824x3164ae) + 0 + b36.f.g(2, 8, this.f59825xaef8eb49);
        }
        if (i17 == 2) {
            this.f59824x3164ae.clear();
            this.f59825xaef8eb49.clear();
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo bizInfo = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo();
                if (bArr != null && bArr.length > 0) {
                    bizInfo.mo11468x92b714fd(bArr);
                }
                this.f59824x3164ae.add(bizInfo);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2 c27413x708b89f2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2();
            if (bArr2 != null && bArr2.length > 0) {
                c27413x708b89f2.mo11468x92b714fd(bArr2);
            }
            this.f59825xaef8eb49.add(c27413x708b89f2);
        }
        return 0;
    }

    /* renamed from: setInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114335x764b9430(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b.BizInfo> linkedList) {
        this.f59824x3164ae = linkedList;
        return this;
    }

    /* renamed from: setMiniapps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114336x258b89cb(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27413x708b89f2> linkedList) {
        this.f59825xaef8eb49 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b m114334x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27397xe54d8d3b) super.mo11468x92b714fd(bArr);
    }
}
