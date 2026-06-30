package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo */
/* loaded from: classes8.dex */
public class C27469xf050ac8d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d f60320xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d();

    /* renamed from: liteapp_version_list */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo> f60322xe1355b1 = new java.util.LinkedList<>();

    /* renamed from: zhuge_personal_msg_info_list */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo> f60323x576d45ec = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f60321xcb94b041 = new boolean[3];

    /* renamed from: com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo$LiteAppVersionInfo */
    /* loaded from: classes8.dex */
    public static class LiteAppVersionInfo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo f60324xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo();

        /* renamed from: appid */
        private java.lang.String f60325x58b82fc;

        /* renamed from: hasSetFields */
        private final boolean[] f60326xcb94b041 = new boolean[3];

        /* renamed from: version */
        private java.lang.String f60327x14f51cd8;

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116413xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116414x7c90cfc0() {
            return f60324xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116415x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116416x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo liteAppVersionInfo = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo) fVar;
            return n51.f.a(this.f60325x58b82fc, liteAppVersionInfo.f60325x58b82fc) && n51.f.a(this.f60327x14f51cd8, liteAppVersionInfo.f60327x14f51cd8);
        }

        /* renamed from: getAppid */
        public java.lang.String m116417x74292946() {
            return this.f60326xcb94b041[1] ? this.f60325x58b82fc : "";
        }

        /* renamed from: getVersion */
        public java.lang.String m116418x52c258a2() {
            return this.f60326xcb94b041[2] ? this.f60327x14f51cd8 : "";
        }

        /* renamed from: hasAppid */
        public boolean m116419x6bc9082() {
            return m116420x6e095e9(1);
        }

        /* renamed from: hasFieldNumber */
        public boolean m116420x6e095e9(int i17) {
            return this.f60326xcb94b041[i17];
        }

        /* renamed from: hasVersion */
        public boolean m116421x8e18e0de() {
            return m116420x6e095e9(2);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116422x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.f60325x58b82fc;
                if (str != null && this.f60326xcb94b041[1]) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.f60327x14f51cd8;
                if (str2 != null && this.f60326xcb94b041[2]) {
                    fVar.j(2, str2);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str3 = this.f60325x58b82fc;
                if (str3 != null && this.f60326xcb94b041[1]) {
                    i18 = 0 + b36.f.j(1, str3);
                }
                java.lang.String str4 = this.f60327x14f51cd8;
                return (str4 == null || !this.f60326xcb94b041[2]) ? i18 : i18 + b36.f.j(2, str4);
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
                this.f60325x58b82fc = aVar2.k(intValue);
                this.f60326xcb94b041[1] = true;
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.f60327x14f51cd8 = aVar2.k(intValue);
            this.f60326xcb94b041[2] = true;
            return 0;
        }

        /* renamed from: setAppid */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116424x52b743ba(java.lang.String str) {
            this.f60325x58b82fc = str;
            this.f60326xcb94b041[1] = true;
            return this;
        }

        /* renamed from: setVersion */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116425xc633a616(java.lang.String str) {
            this.f60327x14f51cd8 = str;
            this.f60326xcb94b041[2] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo m116423x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo$ZhugePersonalMsgInfo */
    /* loaded from: classes8.dex */
    public static class ZhugePersonalMsgInfo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo f60328xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo();

        /* renamed from: hasSetFields */
        private final boolean[] f60329xcb94b041 = new boolean[4];

        /* renamed from: has_event */
        private boolean f60330x36e8cb5;

        /* renamed from: unread_count */
        private int f60331x742e687f;

        /* renamed from: username */
        private java.lang.String f60332xf02988d6;

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116427xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116428x7c90cfc0() {
            return f60328xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116429x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116430x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo zhugePersonalMsgInfo = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo) fVar;
            return n51.f.a(this.f60332xf02988d6, zhugePersonalMsgInfo.f60332xf02988d6) && n51.f.a(java.lang.Integer.valueOf(this.f60331x742e687f), java.lang.Integer.valueOf(zhugePersonalMsgInfo.f60331x742e687f)) && n51.f.a(java.lang.Boolean.valueOf(this.f60330x36e8cb5), java.lang.Boolean.valueOf(zhugePersonalMsgInfo.f60330x36e8cb5));
        }

        /* renamed from: getHasEvent */
        public boolean m116431x82d1bd96() {
            return this.f60330x36e8cb5;
        }

        /* renamed from: getUnreadCount */
        public int m116432x9a00296a() {
            return this.f60331x742e687f;
        }

        /* renamed from: getUsername */
        public java.lang.String m116433x6c03c64c() {
            return this.f60329xcb94b041[1] ? this.f60332xf02988d6 : "";
        }

        /* renamed from: hasFieldNumber */
        public boolean m116434x6e095e9(int i17) {
            return this.f60329xcb94b041[i17];
        }

        /* renamed from: hasHasEvent */
        public boolean m116435xb24c3cda() {
            return m116434x6e095e9(3);
        }

        /* renamed from: hasUnreadCount */
        public boolean m116436xba2033a6() {
            return m116434x6e095e9(2);
        }

        /* renamed from: hasUsername */
        public boolean m116437x9b7e4590() {
            return m116434x6e095e9(1);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116438x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.f60332xf02988d6;
                if (str != null && this.f60329xcb94b041[1]) {
                    fVar.j(1, str);
                }
                if (this.f60329xcb94b041[2]) {
                    fVar.e(2, this.f60331x742e687f);
                }
                if (this.f60329xcb94b041[3]) {
                    fVar.a(3, this.f60330x36e8cb5);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str2 = this.f60332xf02988d6;
                if (str2 != null && this.f60329xcb94b041[1]) {
                    i18 = 0 + b36.f.j(1, str2);
                }
                if (this.f60329xcb94b041[2]) {
                    i18 += b36.f.e(2, this.f60331x742e687f);
                }
                return this.f60329xcb94b041[3] ? i18 + b36.f.a(3, this.f60330x36e8cb5) : i18;
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
                this.f60332xf02988d6 = aVar2.k(intValue);
                this.f60329xcb94b041[1] = true;
                return 0;
            }
            if (intValue == 2) {
                this.f60331x742e687f = aVar2.g(intValue);
                this.f60329xcb94b041[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f60330x36e8cb5 = aVar2.c(intValue);
            this.f60329xcb94b041[3] = true;
            return 0;
        }

        /* renamed from: setHasEvent */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116440x7d8a1ea2(boolean z17) {
            this.f60330x36e8cb5 = z17;
            this.f60329xcb94b041[3] = true;
            return this;
        }

        /* renamed from: setUnreadCount */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116441x30659cde(int i17) {
            this.f60331x742e687f = i17;
            this.f60329xcb94b041[2] = true;
            return this;
        }

        /* renamed from: setUsername */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116442x66bc2758(java.lang.String str) {
            this.f60332xf02988d6 = str;
            this.f60329xcb94b041[1] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo m116439x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116395xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116396x7c90cfc0() {
        return f60320xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116397x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d();
    }

    /* renamed from: addAllElementLiteappVersionList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116398x90495f9f(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo> collection) {
        this.f60322xe1355b1.addAll(collection);
        this.f60321xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addAllElementZhugePersonalMsgInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116399xc4b58204(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo> collection) {
        this.f60323x576d45ec.addAll(collection);
        this.f60321xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementLiteappVersionList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116400x7e3aff5e(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo liteAppVersionInfo) {
        this.f60322xe1355b1.add(liteAppVersionInfo);
        this.f60321xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementZhugePersonalMsgInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116401x307a1683(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo zhugePersonalMsgInfo) {
        this.f60323x576d45ec.add(zhugePersonalMsgInfo);
        this.f60321xcb94b041[2] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116402x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d c27469xf050ac8d = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d) fVar;
        return n51.f.a(this.f60322xe1355b1, c27469xf050ac8d.f60322xe1355b1) && n51.f.a(this.f60323x576d45ec, c27469xf050ac8d.f60323x576d45ec);
    }

    /* renamed from: getLiteappVersionList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo> m116403x98ca9ed9() {
        return this.f60322xe1355b1;
    }

    /* renamed from: getZhugePersonalMsgInfoList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo> m116404x4d34edbe() {
        return this.f60323x576d45ec;
    }

    /* renamed from: hasFieldNumber */
    public boolean m116405x6e095e9(int i17) {
        return this.f60321xcb94b041[i17];
    }

    /* renamed from: hasLiteappVersionList */
    public boolean m116406x3931d91d() {
        return m116405x6e095e9(1);
    }

    /* renamed from: hasZhugePersonalMsgInfoList */
    public boolean m116407xfaf06502() {
        return m116405x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116408x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f60322xe1355b1);
            fVar.g(2, 8, this.f60323x576d45ec);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f60322xe1355b1) + 0 + b36.f.g(2, 8, this.f60323x576d45ec);
        }
        if (i17 == 2) {
            this.f60322xe1355b1.clear();
            this.f60323x576d45ec.clear();
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
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo liteAppVersionInfo = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo();
                if (bArr != null && bArr.length > 0) {
                    liteAppVersionInfo.mo11468x92b714fd(bArr);
                }
                this.f60322xe1355b1.add(liteAppVersionInfo);
            }
            this.f60321xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo zhugePersonalMsgInfo = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo();
            if (bArr2 != null && bArr2.length > 0) {
                zhugePersonalMsgInfo.mo11468x92b714fd(bArr2);
            }
            this.f60323x576d45ec.add(zhugePersonalMsgInfo);
        }
        this.f60321xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setLiteappVersionList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116410x2ff620e5(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.LiteAppVersionInfo> linkedList) {
        this.f60322xe1355b1 = linkedList;
        this.f60321xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setZhugePersonalMsgInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116411xfd01b6ca(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d.ZhugePersonalMsgInfo> linkedList) {
        this.f60323x576d45ec = linkedList;
        this.f60321xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d m116409x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27469xf050ac8d) super.mo11468x92b714fd(bArr);
    }
}
