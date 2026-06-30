package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AttributeTitle */
/* loaded from: classes8.dex */
public class C27382x4ebe953c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c f59706xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c();

    /* renamed from: content */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content f59707x38b73479 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content.m113843x7c90cfc0();

    /* renamed from: com.tencent.wechat.aff.newlife.AttributeTitle$Content */
    /* loaded from: classes8.dex */
    public static class Content extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content f59708xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content();

        /* renamed from: title */
        public java.lang.String f59711x6942258 = "";

        /* renamed from: subContent */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent f59710xe0678619 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent.m113856x7c90cfc0();

        /* renamed from: redDotControl */
        public int f59709x43eb7745 = 0;

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113842xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113843x7c90cfc0() {
            return f59708xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113844x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113845x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content content = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content) fVar;
            return n51.f.a(this.f59711x6942258, content.f59711x6942258) && n51.f.a(this.f59710xe0678619, content.f59710xe0678619) && n51.f.a(java.lang.Integer.valueOf(this.f59709x43eb7745), java.lang.Integer.valueOf(content.f59709x43eb7745));
        }

        /* renamed from: getRedDotControl */
        public int m113846x14b338f() {
            return this.f59709x43eb7745;
        }

        /* renamed from: getSubContent */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113847xcea83e0f() {
            return this.f59710xe0678619;
        }

        /* renamed from: getTitle */
        public java.lang.String m113848x7531c8a2() {
            return this.f59711x6942258;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113849x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.f59711x6942258;
                if (str != null) {
                    fVar.j(1, str);
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent subContent = this.f59710xe0678619;
                if (subContent != null) {
                    fVar.i(2, subContent.mo75928xcd1e8d8());
                    this.f59710xe0678619.mo75956x3d5d1f78(fVar);
                }
                fVar.e(3, this.f59709x43eb7745);
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str2 = this.f59711x6942258;
                int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent subContent2 = this.f59710xe0678619;
                if (subContent2 != null) {
                    j17 += b36.f.i(2, subContent2.mo75928xcd1e8d8());
                }
                return j17 + b36.f.e(3, this.f59709x43eb7745);
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
                this.f59711x6942258 = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 2) {
                if (intValue != 3) {
                    return -1;
                }
                this.f59709x43eb7745 = aVar2.g(intValue);
                return 0;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent subContent3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent();
                if (bArr != null && bArr.length > 0) {
                    subContent3.mo11468x92b714fd(bArr);
                }
                this.f59710xe0678619 = subContent3;
            }
            return 0;
        }

        /* renamed from: setRedDotControl */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113851x94219a03(int i17) {
            this.f59709x43eb7745 = i17;
            return this;
        }

        /* renamed from: setSubContent */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113852xfccc8c1b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent subContent) {
            this.f59710xe0678619 = subContent;
            return this;
        }

        /* renamed from: setTitle */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113853x53bfe316(java.lang.String str) {
            this.f59711x6942258 = str;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113850x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AttributeTitle$SubContent */
    /* loaded from: classes8.dex */
    public static class SubContent extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent f59712xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent();

        /* renamed from: subTitle */
        public java.lang.String f59718x836c5bf8 = "";

        /* renamed from: iconUrl */
        public java.lang.String f59716x61ad9236 = "";

        /* renamed from: lightColor */
        public java.lang.String f59717xf204c7ed = "";

        /* renamed from: darkColor */
        public java.lang.String f59713x900e898d = "";

        /* renamed from: iconLightColor */
        public java.lang.String f59715x99c55d46 = "";

        /* renamed from: iconDarkColor */
        public java.lang.String f59714x5ba96514 = "";

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113855xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113856x7c90cfc0() {
            return f59712xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113857x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113858x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent subContent = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent) fVar;
            return n51.f.a(this.f59718x836c5bf8, subContent.f59718x836c5bf8) && n51.f.a(this.f59716x61ad9236, subContent.f59716x61ad9236) && n51.f.a(this.f59717xf204c7ed, subContent.f59717xf204c7ed) && n51.f.a(this.f59713x900e898d, subContent.f59713x900e898d) && n51.f.a(this.f59715x99c55d46, subContent.f59715x99c55d46) && n51.f.a(this.f59714x5ba96514, subContent.f59714x5ba96514);
        }

        /* renamed from: getDarkColor */
        public java.lang.String m113859x8f7bfad7() {
            return this.f59713x900e898d;
        }

        /* renamed from: getIconDarkColor */
        public java.lang.String m113860x1909215e() {
            return this.f59714x5ba96514;
        }

        /* renamed from: getIconLightColor */
        public java.lang.String m113861x885d2a3c() {
            return this.f59715x99c55d46;
        }

        /* renamed from: getIconUrl */
        public java.lang.String m113862x9f7ace00() {
            return this.f59716x61ad9236;
        }

        /* renamed from: getLightColor */
        public java.lang.String m113863xe0457fe3() {
            return this.f59717xf204c7ed;
        }

        /* renamed from: getSubTitle */
        public java.lang.String m113864xff46996e() {
            return this.f59718x836c5bf8;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113865x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.f59718x836c5bf8;
                if (str != null) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.f59716x61ad9236;
                if (str2 != null) {
                    fVar.j(2, str2);
                }
                java.lang.String str3 = this.f59717xf204c7ed;
                if (str3 != null) {
                    fVar.j(3, str3);
                }
                java.lang.String str4 = this.f59713x900e898d;
                if (str4 != null) {
                    fVar.j(4, str4);
                }
                java.lang.String str5 = this.f59715x99c55d46;
                if (str5 != null) {
                    fVar.j(5, str5);
                }
                java.lang.String str6 = this.f59714x5ba96514;
                if (str6 != null) {
                    fVar.j(6, str6);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str7 = this.f59718x836c5bf8;
                int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
                java.lang.String str8 = this.f59716x61ad9236;
                if (str8 != null) {
                    j17 += b36.f.j(2, str8);
                }
                java.lang.String str9 = this.f59717xf204c7ed;
                if (str9 != null) {
                    j17 += b36.f.j(3, str9);
                }
                java.lang.String str10 = this.f59713x900e898d;
                if (str10 != null) {
                    j17 += b36.f.j(4, str10);
                }
                java.lang.String str11 = this.f59715x99c55d46;
                if (str11 != null) {
                    j17 += b36.f.j(5, str11);
                }
                java.lang.String str12 = this.f59714x5ba96514;
                return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
                    this.f59718x836c5bf8 = aVar2.k(intValue);
                    return 0;
                case 2:
                    this.f59716x61ad9236 = aVar2.k(intValue);
                    return 0;
                case 3:
                    this.f59717xf204c7ed = aVar2.k(intValue);
                    return 0;
                case 4:
                    this.f59713x900e898d = aVar2.k(intValue);
                    return 0;
                case 5:
                    this.f59715x99c55d46 = aVar2.k(intValue);
                    return 0;
                case 6:
                    this.f59714x5ba96514 = aVar2.k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }

        /* renamed from: setDarkColor */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113867xebcfbb4b(java.lang.String str) {
            this.f59713x900e898d = str;
            return this;
        }

        /* renamed from: setIconDarkColor */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113868xabdf87d2(java.lang.String str) {
            this.f59714x5ba96514 = str;
            return this;
        }

        /* renamed from: setIconLightColor */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113869x50539248(java.lang.String str) {
            this.f59715x99c55d46 = str;
            return this;
        }

        /* renamed from: setIconUrl */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113870x12ec1b74(java.lang.String str) {
            this.f59716x61ad9236 = str;
            return this;
        }

        /* renamed from: setLightColor */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113871xe69cdef(java.lang.String str) {
            this.f59717xf204c7ed = str;
            return this;
        }

        /* renamed from: setSubTitle */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113872xf9fefa7a(java.lang.String str) {
            this.f59718x836c5bf8 = str;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent m113866x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.SubContent) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113833xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113834x7c90cfc0() {
        return f59706xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113835x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113836x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c) && n51.f.a(this.f59707x38b73479, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c) fVar).f59707x38b73479);
    }

    /* renamed from: getContent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content m113837x76847043() {
        return this.f59707x38b73479;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113838x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content content = this.f59707x38b73479;
            if (content != null) {
                fVar.i(1, content.mo75928xcd1e8d8());
                this.f59707x38b73479.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content content2 = this.f59707x38b73479;
            if (content2 != null) {
                return 0 + b36.f.i(1, content2.mo75928xcd1e8d8());
            }
            return 0;
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content content3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content();
            if (bArr != null && bArr.length > 0) {
                content3.mo11468x92b714fd(bArr);
            }
            this.f59707x38b73479 = content3;
        }
        return 0;
    }

    /* renamed from: setContent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113840xe9f5bdb7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c.Content content) {
        this.f59707x38b73479 = content;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c m113839x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27382x4ebe953c) super.mo11468x92b714fd(bArr);
    }
}
