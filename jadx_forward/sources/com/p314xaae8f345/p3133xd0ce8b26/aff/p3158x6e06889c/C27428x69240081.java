package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl */
/* loaded from: classes8.dex */
public class C27428x69240081 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 f60061xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081();

    /* renamed from: nodes */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode> f60062x64212b1 = new java.util.LinkedList<>();

    /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode */
    /* loaded from: classes8.dex */
    public static class RenderNode extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode f60063xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode();

        /* renamed from: style */
        public int f60066x68b1db1 = 0;

        /* renamed from: content */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent f60065x38b73479 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.m115500x7c90cfc0();

        /* renamed from: attr */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr f60064x2dd9f1 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.m115410x7c90cfc0();

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$ContentAttr */
        /* loaded from: classes8.dex */
        public static class ContentAttr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr f60067xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr();

            /* renamed from: use_remark */
            public boolean f60068xa5e00538 = false;

            /* renamed from: username */
            public java.lang.String f60069xf02988d6 = "";

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115351xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115352x7c90cfc0() {
                return f60067xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115353x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115354x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr contentAttr = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr) fVar;
                return n51.f.a(java.lang.Boolean.valueOf(this.f60068xa5e00538), java.lang.Boolean.valueOf(contentAttr.f60068xa5e00538)) && n51.f.a(this.f60069xf02988d6, contentAttr.f60069xf02988d6);
            }

            /* renamed from: getUseRemark */
            public boolean m115355xdd606531() {
                return this.f60068xa5e00538;
            }

            /* renamed from: getUse_remark */
            public boolean m115356x9420bd2e() {
                return this.f60068xa5e00538;
            }

            /* renamed from: getUsername */
            public java.lang.String m115357x6c03c64c() {
                return this.f60069xf02988d6;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115358x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    fVar.a(1, this.f60068xa5e00538);
                    java.lang.String str = this.f60069xf02988d6;
                    if (str != null) {
                        fVar.j(2, str);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    int a17 = b36.f.a(1, this.f60068xa5e00538) + 0;
                    java.lang.String str2 = this.f60069xf02988d6;
                    return str2 != null ? a17 + b36.f.j(2, str2) : a17;
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
                    this.f60068xa5e00538 = aVar2.c(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                this.f60069xf02988d6 = aVar2.k(intValue);
                return 0;
            }

            /* renamed from: setUseRemark */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115360x39b425a5(boolean z17) {
                this.f60068xa5e00538 = z17;
                return this;
            }

            /* renamed from: setUse_remark */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115361xc2450b3a(boolean z17) {
                this.f60068xa5e00538 = z17;
                return this;
            }

            /* renamed from: setUsername */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115362x66bc2758(java.lang.String str) {
                this.f60069xf02988d6 = str;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115359x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$Icon */
        /* loaded from: classes8.dex */
        public static class Icon extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon f60070xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon();

            /* renamed from: icon_image_key */
            public java.lang.String f60071xa3dd0535 = "";

            /* renamed from: icon_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl f60072xd4094ca9 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl.m115380x7c90cfc0();

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115364xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115365x7c90cfc0() {
                return f60070xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115366x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115367x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon icon = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon) fVar;
                return n51.f.a(this.f60071xa3dd0535, icon.f60071xa3dd0535) && n51.f.a(this.f60072xd4094ca9, icon.f60072xd4094ca9);
            }

            /* renamed from: getIconImageKey */
            public java.lang.String m115368x8f1de513() {
                return this.f60071xa3dd0535;
            }

            /* renamed from: getIconUrl */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115369x9f7ace00() {
                return this.f60072xd4094ca9;
            }

            /* renamed from: getIcon_image_key */
            public java.lang.String m115370x9274d22b() {
                return this.f60071xa3dd0535;
            }

            /* renamed from: getIcon_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115371x4fe38a1f() {
                return this.f60072xd4094ca9;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115372x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    java.lang.String str = this.f60071xa3dd0535;
                    if (str != null) {
                        fVar.j(1, str);
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl = this.f60072xd4094ca9;
                    if (iconUrl != null) {
                        fVar.i(2, iconUrl.mo75928xcd1e8d8());
                        this.f60072xd4094ca9.mo75956x3d5d1f78(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    java.lang.String str2 = this.f60071xa3dd0535;
                    int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl2 = this.f60072xd4094ca9;
                    return iconUrl2 != null ? j17 + b36.f.i(2, iconUrl2.mo75928xcd1e8d8()) : j17;
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
                    this.f60071xa3dd0535 = aVar2.k(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl();
                    if (bArr != null && bArr.length > 0) {
                        iconUrl3.mo11468x92b714fd(bArr);
                    }
                    this.f60072xd4094ca9 = iconUrl3;
                }
                return 0;
            }

            /* renamed from: setIconImageKey */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115374xc566e01f(java.lang.String str) {
                this.f60071xa3dd0535 = str;
                return this;
            }

            /* renamed from: setIconUrl */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115375x12ec1b74(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl) {
                this.f60072xd4094ca9 = iconUrl;
                return this;
            }

            /* renamed from: setIcon_image_key */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115376x5a6b3a37(java.lang.String str) {
                this.f60071xa3dd0535 = str;
                return this;
            }

            /* renamed from: setIcon_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115377x4a9beb2b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl) {
                this.f60072xd4094ca9 = iconUrl;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115373x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$IconUrl */
        /* loaded from: classes8.dex */
        public static class IconUrl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl f60073xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl();

            /* renamed from: icon_light_url */
            public java.lang.String f60075x1136280 = "";

            /* renamed from: icon_dark_url */
            public java.lang.String f60074xc159262c = "";

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115379xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115380x7c90cfc0() {
                return f60073xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115381x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115382x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl) fVar;
                return n51.f.a(this.f60075x1136280, iconUrl.f60075x1136280) && n51.f.a(this.f60074xc159262c, iconUrl.f60074xc159262c);
            }

            /* renamed from: getIconDarkUrl */
            public java.lang.String m115383x99dfa2a() {
                return this.f60074xc159262c;
            }

            /* renamed from: getIconLightUrl */
            public java.lang.String m115384xfd7aa288() {
                return this.f60075x1136280;
            }

            /* renamed from: getIcon_dark_url */
            public java.lang.String m115385x7eb8e276() {
                return this.f60074xc159262c;
            }

            /* renamed from: getIcon_light_url */
            public java.lang.String m115386xefab2f76() {
                return this.f60075x1136280;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115387x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    java.lang.String str = this.f60075x1136280;
                    if (str != null) {
                        fVar.j(1, str);
                    }
                    java.lang.String str2 = this.f60074xc159262c;
                    if (str2 != null) {
                        fVar.j(2, str2);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    java.lang.String str3 = this.f60075x1136280;
                    int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
                    java.lang.String str4 = this.f60074xc159262c;
                    return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
                    this.f60075x1136280 = aVar2.k(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                this.f60074xc159262c = aVar2.k(intValue);
                return 0;
            }

            /* renamed from: setIconDarkUrl */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115389xa0036d9e(java.lang.String str) {
                this.f60074xc159262c = str;
                return this;
            }

            /* renamed from: setIconLightUrl */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115390x33c39d94(java.lang.String str) {
                this.f60075x1136280 = str;
                return this;
            }

            /* renamed from: setIcon_dark_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115391x118f48ea(java.lang.String str) {
                this.f60074xc159262c = str;
                return this;
            }

            /* renamed from: setIcon_light_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115392xb7a19782(java.lang.String str) {
                this.f60075x1136280 = str;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115388x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$ReddotPendant */
        /* loaded from: classes8.dex */
        public static class ReddotPendant extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant f60076xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant();

            /* renamed from: static_icon */
            public int f60078x34c3fbaa = 0;

            /* renamed from: image_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl f60077xcbad788b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl.m115380x7c90cfc0();

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115394xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115395x7c90cfc0() {
                return f60076xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115396x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115397x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant reddotPendant = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant) fVar;
                return n51.f.a(java.lang.Integer.valueOf(this.f60078x34c3fbaa), java.lang.Integer.valueOf(reddotPendant.f60078x34c3fbaa)) && n51.f.a(this.f60077xcbad788b, reddotPendant.f60077xcbad788b);
            }

            /* renamed from: getImageUrl */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115398x489d9f8a() {
                return this.f60077xcbad788b;
            }

            /* renamed from: getImage_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl m115399xcb1ae9d5() {
                return this.f60077xcbad788b;
            }

            /* renamed from: getStaticIcon */
            public int m115400xe7a84ffd() {
                return this.f60078x34c3fbaa;
            }

            /* renamed from: getStatic_icon */
            public int m115401xe9a4274() {
                return this.f60078x34c3fbaa;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115402x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    fVar.e(1, this.f60078x34c3fbaa);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl = this.f60077xcbad788b;
                    if (iconUrl != null) {
                        fVar.i(2, iconUrl.mo75928xcd1e8d8());
                        this.f60077xcbad788b.mo75956x3d5d1f78(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    int e17 = b36.f.e(1, this.f60078x34c3fbaa) + 0;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl2 = this.f60077xcbad788b;
                    return iconUrl2 != null ? e17 + b36.f.i(2, iconUrl2.mo75928xcd1e8d8()) : e17;
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
                    this.f60078x34c3fbaa = aVar2.g(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl();
                    if (bArr != null && bArr.length > 0) {
                        iconUrl3.mo11468x92b714fd(bArr);
                    }
                    this.f60077xcbad788b = iconUrl3;
                }
                return 0;
            }

            /* renamed from: setImageUrl */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115404x43560096(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl) {
                this.f60077xcbad788b = iconUrl;
                return this;
            }

            /* renamed from: setImage_url */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115405x276eaa49(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.IconUrl iconUrl) {
                this.f60077xcbad788b = iconUrl;
                return this;
            }

            /* renamed from: setStaticIcon */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115406x15cc9e09(int i17) {
                this.f60078x34c3fbaa = i17;
                return this;
            }

            /* renamed from: setStatic_icon */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115407xa4ffb5e8(int i17) {
                this.f60078x34c3fbaa = i17;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115403x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderAttr */
        /* loaded from: classes8.dex */
        public static class RenderAttr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr f60079xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr();

            /* renamed from: common */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr f60081xaf3f29eb = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr.m115457x7c90cfc0();

            /* renamed from: business */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr f60080xbba4bfc0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr.m115432x7c90cfc0();

            /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderAttr$BorderAttr */
            /* loaded from: classes8.dex */
            public static class BorderAttr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

                /* renamed from: DEFAULT_INSTANCE */
                private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr f60082xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr();

                /* renamed from: size */
                public int f60084x35e001 = 0;

                /* renamed from: color */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor f60083x5a72f63 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor.m115489x7c90cfc0();

                /* renamed from: create */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115420xaf65a0fc() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr();
                }

                /* renamed from: getDefaultInstance */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115421x7c90cfc0() {
                    return f60082xb3e828f3;
                }

                /* renamed from: newBuilder */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115422x3136c9db() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr();
                }

                /* renamed from: build */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115423x59bc66e() {
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: compareContent */
                public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr)) {
                        return false;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr borderAttr = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.f60084x35e001), java.lang.Integer.valueOf(borderAttr.f60084x35e001)) && n51.f.a(this.f60083x5a72f63, borderAttr.f60083x5a72f63);
                }

                /* renamed from: getColor */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115424x7444d5ad() {
                    return this.f60083x5a72f63;
                }

                /* renamed from: getSize */
                public int m115425xfb854877() {
                    return this.f60084x35e001;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115426x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    mo11468x92b714fd(fVar.m75960xfb7e5820());
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: newInstance */
                public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr();
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.f60084x35e001);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor = this.f60083x5a72f63;
                        if (renderColor != null) {
                            fVar.i(2, renderColor.mo75928xcd1e8d8());
                            this.f60083x5a72f63.mo75956x3d5d1f78(fVar);
                        }
                        return 0;
                    }
                    if (i17 == 1) {
                        int e17 = b36.f.e(1, this.f60084x35e001) + 0;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor2 = this.f60083x5a72f63;
                        return renderColor2 != null ? e17 + b36.f.i(2, renderColor2.mo75928xcd1e8d8()) : e17;
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
                        this.f60084x35e001 = aVar2.g(intValue);
                        return 0;
                    }
                    if (intValue != 2) {
                        return -1;
                    }
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j17.get(i18);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();
                        if (bArr != null && bArr.length > 0) {
                            renderColor3.mo11468x92b714fd(bArr);
                        }
                        this.f60083x5a72f63 = renderColor3;
                    }
                    return 0;
                }

                /* renamed from: setColor */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115428x52d2f021(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor) {
                    this.f60083x5a72f63 = renderColor;
                    return this;
                }

                /* renamed from: setSize */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115429x76500f83(int i17) {
                    this.f60084x35e001 = i17;
                    return this;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115427x60f45402(byte[] bArr) {
                    mo11468x92b714fd(bArr);
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: parseFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr mo11468x92b714fd(byte[] bArr) {
                    return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr) super.mo11468x92b714fd(bArr);
                }
            }

            /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderAttr$BusinessAttr */
            /* loaded from: classes8.dex */
            public static class BusinessAttr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

                /* renamed from: DEFAULT_INSTANCE */
                private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr f60085xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr();

                /* renamed from: font_weight */
                public int f60088x78a88c68 = 0;

                /* renamed from: background */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor f60086xb098552e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor.m115489x7c90cfc0();

                /* renamed from: radius */
                public float f60089xc80e6c92 = 0.0f;

                /* renamed from: border */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr f60087xad8c742c = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr.m115421x7c90cfc0();

                /* renamed from: reddot_pendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr f60090x57ea3175 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr.m115474x7c90cfc0();

                /* renamed from: text_align */
                public int f60091x81cce973 = 0;

                /* renamed from: create */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115431xaf65a0fc() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr();
                }

                /* renamed from: getDefaultInstance */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115432x7c90cfc0() {
                    return f60085xb3e828f3;
                }

                /* renamed from: newBuilder */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115433x3136c9db() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr();
                }

                /* renamed from: build */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115434x59bc66e() {
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: compareContent */
                public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr)) {
                        return false;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr businessAttr = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.f60088x78a88c68), java.lang.Integer.valueOf(businessAttr.f60088x78a88c68)) && n51.f.a(this.f60086xb098552e, businessAttr.f60086xb098552e) && n51.f.a(java.lang.Float.valueOf(this.f60089xc80e6c92), java.lang.Float.valueOf(businessAttr.f60089xc80e6c92)) && n51.f.a(this.f60087xad8c742c, businessAttr.f60087xad8c742c) && n51.f.a(this.f60090x57ea3175, businessAttr.f60090x57ea3175) && n51.f.a(java.lang.Integer.valueOf(this.f60091x81cce973), java.lang.Integer.valueOf(businessAttr.f60091x81cce973));
                }

                /* renamed from: getBackground */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115435x9ed90d24() {
                    return this.f60086xb098552e;
                }

                /* renamed from: getBorder */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr m115436x12a39722() {
                    return this.f60087xad8c742c;
                }

                /* renamed from: getFontWeight */
                public int m115437xc27a3b9d() {
                    return this.f60088x78a88c68;
                }

                /* renamed from: getFont_weight */
                public int m115438x527ed332() {
                    return this.f60088x78a88c68;
                }

                /* renamed from: getRadius */
                public float m115439x2d258f88() {
                    return this.f60089xc80e6c92;
                }

                /* renamed from: getReddotPendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115440x29125dae() {
                    return this.f60090x57ea3175;
                }

                /* renamed from: getReddot_pendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115441x4681fe6b() {
                    return this.f60090x57ea3175;
                }

                /* renamed from: getTextAlign */
                public int m115442xbfeb0722() {
                    return this.f60091x81cce973;
                }

                /* renamed from: getText_align */
                public int m115443x700da169() {
                    return this.f60091x81cce973;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115444x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    mo11468x92b714fd(fVar.m75960xfb7e5820());
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: newInstance */
                public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr();
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.f60088x78a88c68);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor = this.f60086xb098552e;
                        if (renderColor != null) {
                            fVar.i(2, renderColor.mo75928xcd1e8d8());
                            this.f60086xb098552e.mo75956x3d5d1f78(fVar);
                        }
                        fVar.d(3, this.f60089xc80e6c92);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr borderAttr = this.f60087xad8c742c;
                        if (borderAttr != null) {
                            fVar.i(4, borderAttr.mo75928xcd1e8d8());
                            this.f60087xad8c742c.mo75956x3d5d1f78(fVar);
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr = this.f60090x57ea3175;
                        if (reddotPendantAttr != null) {
                            fVar.i(5, reddotPendantAttr.mo75928xcd1e8d8());
                            this.f60090x57ea3175.mo75956x3d5d1f78(fVar);
                        }
                        fVar.e(6, this.f60091x81cce973);
                        return 0;
                    }
                    if (i17 == 1) {
                        int e17 = b36.f.e(1, this.f60088x78a88c68) + 0;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor2 = this.f60086xb098552e;
                        if (renderColor2 != null) {
                            e17 += b36.f.i(2, renderColor2.mo75928xcd1e8d8());
                        }
                        int d17 = e17 + b36.f.d(3, this.f60089xc80e6c92);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr borderAttr2 = this.f60087xad8c742c;
                        if (borderAttr2 != null) {
                            d17 += b36.f.i(4, borderAttr2.mo75928xcd1e8d8());
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr2 = this.f60090x57ea3175;
                        if (reddotPendantAttr2 != null) {
                            d17 += b36.f.i(5, reddotPendantAttr2.mo75928xcd1e8d8());
                        }
                        return d17 + b36.f.e(6, this.f60091x81cce973);
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
                            this.f60088x78a88c68 = aVar2.g(intValue);
                            return 0;
                        case 2:
                            java.util.LinkedList j17 = aVar2.j(intValue);
                            int size = j17.size();
                            for (int i18 = 0; i18 < size; i18++) {
                                byte[] bArr = (byte[]) j17.get(i18);
                                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();
                                if (bArr != null && bArr.length > 0) {
                                    renderColor3.mo11468x92b714fd(bArr);
                                }
                                this.f60086xb098552e = renderColor3;
                            }
                            return 0;
                        case 3:
                            this.f60089xc80e6c92 = aVar2.f(intValue);
                            return 0;
                        case 4:
                            java.util.LinkedList j18 = aVar2.j(intValue);
                            int size2 = j18.size();
                            for (int i19 = 0; i19 < size2; i19++) {
                                byte[] bArr2 = (byte[]) j18.get(i19);
                                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr borderAttr3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr();
                                if (bArr2 != null && bArr2.length > 0) {
                                    borderAttr3.mo11468x92b714fd(bArr2);
                                }
                                this.f60087xad8c742c = borderAttr3;
                            }
                            return 0;
                        case 5:
                            java.util.LinkedList j19 = aVar2.j(intValue);
                            int size3 = j19.size();
                            for (int i27 = 0; i27 < size3; i27++) {
                                byte[] bArr3 = (byte[]) j19.get(i27);
                                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr();
                                if (bArr3 != null && bArr3.length > 0) {
                                    reddotPendantAttr3.mo11468x92b714fd(bArr3);
                                }
                                this.f60090x57ea3175 = reddotPendantAttr3;
                            }
                            return 0;
                        case 6:
                            this.f60091x81cce973 = aVar2.g(intValue);
                            return 0;
                        default:
                            return -1;
                    }
                }

                /* renamed from: setBackground */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115446xccfd5b30(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor) {
                    this.f60086xb098552e = renderColor;
                    return this;
                }

                /* renamed from: setBorder */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115447x5d8cb2e(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BorderAttr borderAttr) {
                    this.f60087xad8c742c = borderAttr;
                    return this;
                }

                /* renamed from: setFontWeight */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115448xf09e89a9(int i17) {
                    this.f60088x78a88c68 = i17;
                    return this;
                }

                /* renamed from: setFont_weight */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115449xe8e446a6(int i17) {
                    this.f60088x78a88c68 = i17;
                    return this;
                }

                /* renamed from: setRadius */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115450x205ac394(float f17) {
                    this.f60089xc80e6c92 = f17;
                    return this;
                }

                /* renamed from: setReddotPendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115451xbbe8c422(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr) {
                    this.f60090x57ea3175 = reddotPendantAttr;
                    return this;
                }

                /* renamed from: setReddot_pendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115452xe786677(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr) {
                    this.f60090x57ea3175 = reddotPendantAttr;
                    return this;
                }

                /* renamed from: setTextAlign */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115453x1c3ec796(int i17) {
                    this.f60091x81cce973 = i17;
                    return this;
                }

                /* renamed from: setText_align */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115454x9e31ef75(int i17) {
                    this.f60091x81cce973 = i17;
                    return this;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115445x60f45402(byte[] bArr) {
                    mo11468x92b714fd(bArr);
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: parseFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr mo11468x92b714fd(byte[] bArr) {
                    return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr) super.mo11468x92b714fd(bArr);
                }
            }

            /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderAttr$CommonAttr */
            /* loaded from: classes8.dex */
            public static class CommonAttr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

                /* renamed from: DEFAULT_INSTANCE */
                private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr f60092xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr();

                /* renamed from: size */
                public int f60095x35e001 = 0;

                /* renamed from: color */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor f60093x5a72f63 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor.m115489x7c90cfc0();

                /* renamed from: line */
                public int f60094x32aff4 = 0;

                /* renamed from: vertical_align */
                public int f60096xf85870fc = 0;

                /* renamed from: create */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115456xaf65a0fc() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr();
                }

                /* renamed from: getDefaultInstance */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115457x7c90cfc0() {
                    return f60092xb3e828f3;
                }

                /* renamed from: newBuilder */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115458x3136c9db() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr();
                }

                /* renamed from: build */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115459x59bc66e() {
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: compareContent */
                public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr)) {
                        return false;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr commonAttr = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.f60095x35e001), java.lang.Integer.valueOf(commonAttr.f60095x35e001)) && n51.f.a(this.f60093x5a72f63, commonAttr.f60093x5a72f63) && n51.f.a(java.lang.Integer.valueOf(this.f60094x32aff4), java.lang.Integer.valueOf(commonAttr.f60094x32aff4)) && n51.f.a(java.lang.Integer.valueOf(this.f60096xf85870fc), java.lang.Integer.valueOf(commonAttr.f60096xf85870fc));
                }

                /* renamed from: getColor */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115460x7444d5ad() {
                    return this.f60093x5a72f63;
                }

                /* renamed from: getLine */
                public int m115461xfb82186a() {
                    return this.f60094x32aff4;
                }

                /* renamed from: getSize */
                public int m115462xfb854877() {
                    return this.f60095x35e001;
                }

                /* renamed from: getVerticalAlign */
                public int m115463x796e3579() {
                    return this.f60096xf85870fc;
                }

                /* renamed from: getVertical_align */
                public int m115464xe6f03df2() {
                    return this.f60096xf85870fc;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115465x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    mo11468x92b714fd(fVar.m75960xfb7e5820());
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: newInstance */
                public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr();
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.f60095x35e001);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor = this.f60093x5a72f63;
                        if (renderColor != null) {
                            fVar.i(2, renderColor.mo75928xcd1e8d8());
                            this.f60093x5a72f63.mo75956x3d5d1f78(fVar);
                        }
                        fVar.e(3, this.f60094x32aff4);
                        fVar.e(4, this.f60096xf85870fc);
                        return 0;
                    }
                    if (i17 == 1) {
                        int e17 = b36.f.e(1, this.f60095x35e001) + 0;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor2 = this.f60093x5a72f63;
                        if (renderColor2 != null) {
                            e17 += b36.f.i(2, renderColor2.mo75928xcd1e8d8());
                        }
                        return e17 + b36.f.e(3, this.f60094x32aff4) + b36.f.e(4, this.f60096xf85870fc);
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
                        this.f60095x35e001 = aVar2.g(intValue);
                        return 0;
                    }
                    if (intValue != 2) {
                        if (intValue == 3) {
                            this.f60094x32aff4 = aVar2.g(intValue);
                            return 0;
                        }
                        if (intValue != 4) {
                            return -1;
                        }
                        this.f60096xf85870fc = aVar2.g(intValue);
                        return 0;
                    }
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j17.get(i18);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();
                        if (bArr != null && bArr.length > 0) {
                            renderColor3.mo11468x92b714fd(bArr);
                        }
                        this.f60093x5a72f63 = renderColor3;
                    }
                    return 0;
                }

                /* renamed from: setColor */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115467x52d2f021(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor) {
                    this.f60093x5a72f63 = renderColor;
                    return this;
                }

                /* renamed from: setLine */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115468x764cdf76(int i17) {
                    this.f60094x32aff4 = i17;
                    return this;
                }

                /* renamed from: setSize */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115469x76500f83(int i17) {
                    this.f60095x35e001 = i17;
                    return this;
                }

                /* renamed from: setVerticalAlign */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115470xc449bed(int i17) {
                    this.f60096xf85870fc = i17;
                    return this;
                }

                /* renamed from: setVertical_align */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115471xaee6a5fe(int i17) {
                    this.f60096xf85870fc = i17;
                    return this;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115466x60f45402(byte[] bArr) {
                    mo11468x92b714fd(bArr);
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: parseFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr mo11468x92b714fd(byte[] bArr) {
                    return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr) super.mo11468x92b714fd(bArr);
                }
            }

            /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderAttr$ReddotPendantAttr */
            /* loaded from: classes8.dex */
            public static class ReddotPendantAttr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

                /* renamed from: DEFAULT_INSTANCE */
                private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr f60097xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr();

                /* renamed from: original_position */
                public int f60098xf584bbd7 = 0;

                /* renamed from: thumbnail_position */
                public int f60099x6177c31c = 0;

                /* renamed from: create */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115473xaf65a0fc() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr();
                }

                /* renamed from: getDefaultInstance */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115474x7c90cfc0() {
                    return f60097xb3e828f3;
                }

                /* renamed from: newBuilder */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115475x3136c9db() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr();
                }

                /* renamed from: build */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115476x59bc66e() {
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: compareContent */
                public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr)) {
                        return false;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.f60098xf584bbd7), java.lang.Integer.valueOf(reddotPendantAttr.f60098xf584bbd7)) && n51.f.a(java.lang.Integer.valueOf(this.f60099x6177c31c), java.lang.Integer.valueOf(reddotPendantAttr.f60099x6177c31c));
                }

                /* renamed from: getOriginalPosition */
                public int m115477x83bd8d90() {
                    return this.f60098xf584bbd7;
                }

                /* renamed from: getOriginal_position */
                public int m115478x48b94321() {
                    return this.f60098xf584bbd7;
                }

                /* renamed from: getThumbnailPosition */
                public int m115479xb6b6297f() {
                    return this.f60099x6177c31c;
                }

                /* renamed from: getThumbnail_position */
                public int m115480x74d42512() {
                    return this.f60099x6177c31c;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115481x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    mo11468x92b714fd(fVar.m75960xfb7e5820());
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: newInstance */
                public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr();
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.f60098xf584bbd7);
                        fVar.e(2, this.f60099x6177c31c);
                        return 0;
                    }
                    if (i17 == 1) {
                        return b36.f.e(1, this.f60098xf584bbd7) + 0 + b36.f.e(2, this.f60099x6177c31c);
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
                        this.f60098xf584bbd7 = aVar2.g(intValue);
                        return 0;
                    }
                    if (intValue != 2) {
                        return -1;
                    }
                    this.f60099x6177c31c = aVar2.g(intValue);
                    return 0;
                }

                /* renamed from: setOriginalPosition */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115483x27ba229c(int i17) {
                    this.f60098xf584bbd7 = i17;
                    return this;
                }

                /* renamed from: setOriginal_position */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115484x244f4f95(int i17) {
                    this.f60098xf584bbd7 = i17;
                    return this;
                }

                /* renamed from: setThumbnailPosition */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115485x924c35f3(int i17) {
                    this.f60099x6177c31c = i17;
                    return this;
                }

                /* renamed from: setThumbnail_position */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115486xbffa71e(int i17) {
                    this.f60099x6177c31c = i17;
                    return this;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr m115482x60f45402(byte[] bArr) {
                    mo11468x92b714fd(bArr);
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: parseFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr mo11468x92b714fd(byte[] bArr) {
                    return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.ReddotPendantAttr) super.mo11468x92b714fd(bArr);
                }
            }

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115409xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115410x7c90cfc0() {
                return f60079xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115411x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115412x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr renderAttr = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr) fVar;
                return n51.f.a(this.f60081xaf3f29eb, renderAttr.f60081xaf3f29eb) && n51.f.a(this.f60080xbba4bfc0, renderAttr.f60080xbba4bfc0);
            }

            /* renamed from: getBusiness */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr m115413x377efd36() {
                return this.f60080xbba4bfc0;
            }

            /* renamed from: getCommon */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr m115414x14564ce1() {
                return this.f60081xaf3f29eb;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115415x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr commonAttr = this.f60081xaf3f29eb;
                    if (commonAttr != null) {
                        fVar.i(1, commonAttr.mo75928xcd1e8d8());
                        this.f60081xaf3f29eb.mo75956x3d5d1f78(fVar);
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr businessAttr = this.f60080xbba4bfc0;
                    if (businessAttr != null) {
                        fVar.i(2, businessAttr.mo75928xcd1e8d8());
                        this.f60080xbba4bfc0.mo75956x3d5d1f78(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr commonAttr2 = this.f60081xaf3f29eb;
                    int i18 = commonAttr2 != null ? 0 + b36.f.i(1, commonAttr2.mo75928xcd1e8d8()) : 0;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr businessAttr2 = this.f60080xbba4bfc0;
                    return businessAttr2 != null ? i18 + b36.f.i(2, businessAttr2.mo75928xcd1e8d8()) : i18;
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
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        byte[] bArr = (byte[]) j17.get(i19);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr commonAttr3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr();
                        if (bArr != null && bArr.length > 0) {
                            commonAttr3.mo11468x92b714fd(bArr);
                        }
                        this.f60081xaf3f29eb = commonAttr3;
                    }
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr businessAttr3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr();
                    if (bArr2 != null && bArr2.length > 0) {
                        businessAttr3.mo11468x92b714fd(bArr2);
                    }
                    this.f60080xbba4bfc0 = businessAttr3;
                }
                return 0;
            }

            /* renamed from: setBusiness */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115417x32375e42(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.BusinessAttr businessAttr) {
                this.f60080xbba4bfc0 = businessAttr;
                return this;
            }

            /* renamed from: setCommon */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115418x78b80ed(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr.CommonAttr commonAttr) {
                this.f60081xaf3f29eb = commonAttr;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115416x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderColor */
        /* loaded from: classes8.dex */
        public static class RenderColor extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor f60100xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();

            /* renamed from: light */
            public java.lang.String f60102x6233516 = "";

            /* renamed from: dark */
            public java.lang.String f60101x2eef76 = "";

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115488xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115489x7c90cfc0() {
                return f60100xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115490x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115491x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor renderColor = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor) fVar;
                return n51.f.a(this.f60102x6233516, renderColor.f60102x6233516) && n51.f.a(this.f60101x2eef76, renderColor.f60101x2eef76);
            }

            /* renamed from: getDark */
            public java.lang.String m115492xfb7e57ec() {
                return this.f60101x2eef76;
            }

            /* renamed from: getLight */
            public java.lang.String m115493x74c0db60() {
                return this.f60102x6233516;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115494x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    java.lang.String str = this.f60102x6233516;
                    if (str != null) {
                        fVar.j(1, str);
                    }
                    java.lang.String str2 = this.f60101x2eef76;
                    if (str2 != null) {
                        fVar.j(2, str2);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    java.lang.String str3 = this.f60102x6233516;
                    int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
                    java.lang.String str4 = this.f60101x2eef76;
                    return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
                    this.f60102x6233516 = aVar2.k(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                this.f60101x2eef76 = aVar2.k(intValue);
                return 0;
            }

            /* renamed from: setDark */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115496x76491ef8(java.lang.String str) {
                this.f60101x2eef76 = str;
                return this;
            }

            /* renamed from: setLight */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115497x534ef5d4(java.lang.String str) {
                this.f60102x6233516 = str;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor m115495x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderColor) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderContent */
        /* loaded from: classes8.dex */
        public static class RenderContent extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

            /* renamed from: DEFAULT_INSTANCE */
            private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent f60103xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent();

            /* renamed from: original */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail f60104x523289d1 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail.m115511x7c90cfc0();

            /* renamed from: thumbnail */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail f60105x4f4e50ec = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail.m115511x7c90cfc0();

            /* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl$RenderNode$RenderContent$ContentDetail */
            /* loaded from: classes8.dex */
            public static class ContentDetail extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

                /* renamed from: DEFAULT_INSTANCE */
                private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail f60106xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail();

                /* renamed from: text */
                public java.lang.String f60110x36452d = "";

                /* renamed from: icon */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon f60108x313c79 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon.m115365x7c90cfc0();

                /* renamed from: reddot_pendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant f60109x57ea3175 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant.m115395x7c90cfc0();

                /* renamed from: content_attr */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr f60107x318c41f7 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr.m115352x7c90cfc0();

                /* renamed from: create */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115510xaf65a0fc() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail();
                }

                /* renamed from: getDefaultInstance */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115511x7c90cfc0() {
                    return f60106xb3e828f3;
                }

                /* renamed from: newBuilder */
                public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115512x3136c9db() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail();
                }

                /* renamed from: build */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115513x59bc66e() {
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: compareContent */
                public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail)) {
                        return false;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail) fVar;
                    return n51.f.a(this.f60110x36452d, contentDetail.f60110x36452d) && n51.f.a(this.f60108x313c79, contentDetail.f60108x313c79) && n51.f.a(this.f60109x57ea3175, contentDetail.f60109x57ea3175) && n51.f.a(this.f60107x318c41f7, contentDetail.f60107x318c41f7);
                }

                /* renamed from: getContentAttr */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115514xc29be4d4() {
                    return this.f60107x318c41f7;
                }

                /* renamed from: getContent_attr */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr m115515x927ed46d() {
                    return this.f60107x318c41f7;
                }

                /* renamed from: getIcon */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon m115516xfb80a4ef() {
                    return this.f60108x313c79;
                }

                /* renamed from: getReddotPendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115517x29125dae() {
                    return this.f60109x57ea3175;
                }

                /* renamed from: getReddot_pendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant m115518x4681fe6b() {
                    return this.f60109x57ea3175;
                }

                /* renamed from: getText */
                public java.lang.String m115519xfb85ada3() {
                    return this.f60110x36452d;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115520x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                    mo11468x92b714fd(fVar.m75960xfb7e5820());
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: newInstance */
                public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                    return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail();
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        java.lang.String str = this.f60110x36452d;
                        if (str != null) {
                            fVar.j(1, str);
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon icon = this.f60108x313c79;
                        if (icon != null) {
                            fVar.i(2, icon.mo75928xcd1e8d8());
                            this.f60108x313c79.mo75956x3d5d1f78(fVar);
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant reddotPendant = this.f60109x57ea3175;
                        if (reddotPendant != null) {
                            fVar.i(3, reddotPendant.mo75928xcd1e8d8());
                            this.f60109x57ea3175.mo75956x3d5d1f78(fVar);
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr contentAttr = this.f60107x318c41f7;
                        if (contentAttr != null) {
                            fVar.i(4, contentAttr.mo75928xcd1e8d8());
                            this.f60107x318c41f7.mo75956x3d5d1f78(fVar);
                        }
                        return 0;
                    }
                    if (i17 == 1) {
                        java.lang.String str2 = this.f60110x36452d;
                        int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon icon2 = this.f60108x313c79;
                        if (icon2 != null) {
                            j17 += b36.f.i(2, icon2.mo75928xcd1e8d8());
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant reddotPendant2 = this.f60109x57ea3175;
                        if (reddotPendant2 != null) {
                            j17 += b36.f.i(3, reddotPendant2.mo75928xcd1e8d8());
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr contentAttr2 = this.f60107x318c41f7;
                        return contentAttr2 != null ? j17 + b36.f.i(4, contentAttr2.mo75928xcd1e8d8()) : j17;
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
                        this.f60110x36452d = aVar2.k(intValue);
                        return 0;
                    }
                    if (intValue == 2) {
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size = j18.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j18.get(i18);
                            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon icon3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon();
                            if (bArr != null && bArr.length > 0) {
                                icon3.mo11468x92b714fd(bArr);
                            }
                            this.f60108x313c79 = icon3;
                        }
                        return 0;
                    }
                    if (intValue == 3) {
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size2 = j19.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr2 = (byte[]) j19.get(i19);
                            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant reddotPendant3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant();
                            if (bArr2 != null && bArr2.length > 0) {
                                reddotPendant3.mo11468x92b714fd(bArr2);
                            }
                            this.f60109x57ea3175 = reddotPendant3;
                        }
                        return 0;
                    }
                    if (intValue != 4) {
                        return -1;
                    }
                    java.util.LinkedList j27 = aVar2.j(intValue);
                    int size3 = j27.size();
                    for (int i27 = 0; i27 < size3; i27++) {
                        byte[] bArr3 = (byte[]) j27.get(i27);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr contentAttr3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr();
                        if (bArr3 != null && bArr3.length > 0) {
                            contentAttr3.mo11468x92b714fd(bArr3);
                        }
                        this.f60107x318c41f7 = contentAttr3;
                    }
                    return 0;
                }

                /* renamed from: setContentAttr */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115522x59015848(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr contentAttr) {
                    this.f60107x318c41f7 = contentAttr;
                    return this;
                }

                /* renamed from: setContent_attr */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115523xc8c7cf79(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ContentAttr contentAttr) {
                    this.f60107x318c41f7 = contentAttr;
                    return this;
                }

                /* renamed from: setIcon */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115524x764b6bfb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.Icon icon) {
                    this.f60108x313c79 = icon;
                    return this;
                }

                /* renamed from: setReddotPendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115525xbbe8c422(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant reddotPendant) {
                    this.f60109x57ea3175 = reddotPendant;
                    return this;
                }

                /* renamed from: setReddot_pendant */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115526xe786677(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.ReddotPendant reddotPendant) {
                    this.f60109x57ea3175 = reddotPendant;
                    return this;
                }

                /* renamed from: setText */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115527x765074af(java.lang.String str) {
                    this.f60110x36452d = str;
                    return this;
                }

                /* renamed from: mergeFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115521x60f45402(byte[] bArr) {
                    mo11468x92b714fd(bArr);
                    return this;
                }

                @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
                /* renamed from: parseFrom */
                public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail mo11468x92b714fd(byte[] bArr) {
                    return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail) super.mo11468x92b714fd(bArr);
                }
            }

            /* renamed from: create */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115499xaf65a0fc() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent();
            }

            /* renamed from: getDefaultInstance */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115500x7c90cfc0() {
                return f60103xb3e828f3;
            }

            /* renamed from: newBuilder */
            public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115501x3136c9db() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent();
            }

            /* renamed from: build */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115502x59bc66e() {
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: compareContent */
            public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent)) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent renderContent = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent) fVar;
                return n51.f.a(this.f60104x523289d1, renderContent.f60104x523289d1) && n51.f.a(this.f60105x4f4e50ec, renderContent.f60105x4f4e50ec);
            }

            /* renamed from: getOriginal */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115503xce0cc747() {
                return this.f60104x523289d1;
            }

            /* renamed from: getThumbnail */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail m115504x4ebbc236() {
                return this.f60105x4f4e50ec;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115505x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
                mo11468x92b714fd(fVar.m75960xfb7e5820());
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: newInstance */
            public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
                return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent();
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail = this.f60104x523289d1;
                    if (contentDetail != null) {
                        fVar.i(1, contentDetail.mo75928xcd1e8d8());
                        this.f60104x523289d1.mo75956x3d5d1f78(fVar);
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail2 = this.f60105x4f4e50ec;
                    if (contentDetail2 != null) {
                        fVar.i(2, contentDetail2.mo75928xcd1e8d8());
                        this.f60105x4f4e50ec.mo75956x3d5d1f78(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail3 = this.f60104x523289d1;
                    int i18 = contentDetail3 != null ? 0 + b36.f.i(1, contentDetail3.mo75928xcd1e8d8()) : 0;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail4 = this.f60105x4f4e50ec;
                    return contentDetail4 != null ? i18 + b36.f.i(2, contentDetail4.mo75928xcd1e8d8()) : i18;
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
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        byte[] bArr = (byte[]) j17.get(i19);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail5 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail();
                        if (bArr != null && bArr.length > 0) {
                            contentDetail5.mo11468x92b714fd(bArr);
                        }
                        this.f60104x523289d1 = contentDetail5;
                    }
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail6 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail();
                    if (bArr2 != null && bArr2.length > 0) {
                        contentDetail6.mo11468x92b714fd(bArr2);
                    }
                    this.f60105x4f4e50ec = contentDetail6;
                }
                return 0;
            }

            /* renamed from: setOriginal */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115507xc8c52853(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail) {
                this.f60104x523289d1 = contentDetail;
                return this;
            }

            /* renamed from: setThumbnail */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115508xab0f82aa(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent.ContentDetail contentDetail) {
                this.f60105x4f4e50ec = contentDetail;
                return this;
            }

            /* renamed from: mergeFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115506x60f45402(byte[] bArr) {
                mo11468x92b714fd(bArr);
                return this;
            }

            @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
            /* renamed from: parseFrom */
            public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent mo11468x92b714fd(byte[] bArr) {
                return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent) super.mo11468x92b714fd(bArr);
            }
        }

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115338xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115339x7c90cfc0() {
            return f60063xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115340x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115341x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode renderNode = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.f60066x68b1db1), java.lang.Integer.valueOf(renderNode.f60066x68b1db1)) && n51.f.a(this.f60065x38b73479, renderNode.f60065x38b73479) && n51.f.a(this.f60064x2dd9f1, renderNode.f60064x2dd9f1);
        }

        /* renamed from: getAttr */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr m115342xfb7d4267() {
            return this.f60064x2dd9f1;
        }

        /* renamed from: getContent */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent m115343x76847043() {
            return this.f60065x38b73479;
        }

        /* renamed from: getStyle */
        public int m115344x7528c3fb() {
            return this.f60066x68b1db1;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115345x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.f60066x68b1db1);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent renderContent = this.f60065x38b73479;
                if (renderContent != null) {
                    fVar.i(2, renderContent.mo75928xcd1e8d8());
                    this.f60065x38b73479.mo75956x3d5d1f78(fVar);
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr renderAttr = this.f60064x2dd9f1;
                if (renderAttr != null) {
                    fVar.i(3, renderAttr.mo75928xcd1e8d8());
                    this.f60064x2dd9f1.mo75956x3d5d1f78(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                int e17 = b36.f.e(1, this.f60066x68b1db1) + 0;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent renderContent2 = this.f60065x38b73479;
                if (renderContent2 != null) {
                    e17 += b36.f.i(2, renderContent2.mo75928xcd1e8d8());
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr renderAttr2 = this.f60064x2dd9f1;
                return renderAttr2 != null ? e17 + b36.f.i(3, renderAttr2.mo75928xcd1e8d8()) : e17;
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
                this.f60066x68b1db1 = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 2) {
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent renderContent3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent();
                    if (bArr != null && bArr.length > 0) {
                        renderContent3.mo11468x92b714fd(bArr);
                    }
                    this.f60065x38b73479 = renderContent3;
                }
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr renderAttr3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr();
                if (bArr2 != null && bArr2.length > 0) {
                    renderAttr3.mo11468x92b714fd(bArr2);
                }
                this.f60064x2dd9f1 = renderAttr3;
            }
            return 0;
        }

        /* renamed from: setAttr */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115347x76480973(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderAttr renderAttr) {
            this.f60064x2dd9f1 = renderAttr;
            return this;
        }

        /* renamed from: setContent */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115348xe9f5bdb7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode.RenderContent renderContent) {
            this.f60065x38b73479 = renderContent;
            return this;
        }

        /* renamed from: setStyle */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115349x53b6de6f(int i17) {
            this.f60066x68b1db1 = i17;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode m115346x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115327xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115328x7c90cfc0() {
        return f60061xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115329x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081();
    }

    /* renamed from: addAllElementNodes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115330xbad92e75(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode> collection) {
        this.f60062x64212b1.addAll(collection);
        return this;
    }

    /* renamed from: addElementNodes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115331x58a3e456(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode renderNode) {
        this.f60062x64212b1.add(renderNode);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115332x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081) && n51.f.a(this.f60062x64212b1, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081) fVar).f60062x64212b1);
    }

    /* renamed from: getNodes */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode> m115333x74dfb8fb() {
        return this.f60062x64212b1;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115334x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f60062x64212b1);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f60062x64212b1) + 0;
        }
        if (i17 == 2) {
            this.f60062x64212b1.clear();
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode renderNode = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode();
            if (bArr != null && bArr.length > 0) {
                renderNode.mo11468x92b714fd(bArr);
            }
            this.f60062x64212b1.add(renderNode);
        }
        return 0;
    }

    /* renamed from: setNodes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115336x536dd36f(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.RenderNode> linkedList) {
        this.f60062x64212b1 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m115335x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081) super.mo11468x92b714fd(bArr);
    }
}
