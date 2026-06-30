package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderJumpInfo */
/* loaded from: classes4.dex */
public class C27408x6a1e2862 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 f59932xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862();

    /* renamed from: business_type */
    public int f59933x258e6059 = 0;

    /* renamed from: jump_id */
    public java.lang.String f59935xb52fe6cc = "";

    /* renamed from: style */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style> f59936x68b1db1 = new java.util.LinkedList<>();

    /* renamed from: effective_duration */
    public int f59934x29fa412c = 0;

    /* renamed from: com.tencent.wechat.aff.newlife.FinderJumpInfo$Style */
    /* loaded from: classes4.dex */
    public static class Style extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style f59937xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style();

        /* renamed from: show_position */
        public int f59938x944bfc2b = 0;

        /* renamed from: show_style */
        public int f59939x431a69ef = 0;

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114773xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114774x7c90cfc0() {
            return f59937xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114775x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114776x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style style = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.f59938x944bfc2b), java.lang.Integer.valueOf(style.f59938x944bfc2b)) && n51.f.a(java.lang.Integer.valueOf(this.f59939x431a69ef), java.lang.Integer.valueOf(style.f59939x431a69ef));
        }

        /* renamed from: getShowPosition */
        public int m114777x5abd1dbc() {
            return this.f59938x944bfc2b;
        }

        /* renamed from: getShowStyle */
        public int m114778x8d5219fe() {
            return this.f59939x431a69ef;
        }

        /* renamed from: getShow_position */
        public int m114779x51abb875() {
            return this.f59938x944bfc2b;
        }

        /* renamed from: getShow_style */
        public int m114780x315b21e5() {
            return this.f59939x431a69ef;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114781x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(2, this.f59938x944bfc2b);
                fVar.e(3, this.f59939x431a69ef);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.e(2, this.f59938x944bfc2b) + 0 + b36.f.e(3, this.f59939x431a69ef);
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
            if (intValue == 2) {
                this.f59938x944bfc2b = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f59939x431a69ef = aVar2.g(intValue);
            return 0;
        }

        /* renamed from: setShowPosition */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114783x910618c8(int i17) {
            this.f59938x944bfc2b = i17;
            return this;
        }

        /* renamed from: setShowStyle */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114784xe9a5da72(int i17) {
            this.f59939x431a69ef = i17;
            return this;
        }

        /* renamed from: setShow_position */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114785xe4821ee9(int i17) {
            this.f59938x944bfc2b = i17;
            return this;
        }

        /* renamed from: setShow_style */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114786x5f7f6ff1(int i17) {
            this.f59939x431a69ef = i17;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style m114782x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114750xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114751x7c90cfc0() {
        return f59932xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114752x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862();
    }

    /* renamed from: addAllElementStyle */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114753xbb223975(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style> collection) {
        this.f59936x68b1db1.addAll(collection);
        return this;
    }

    /* renamed from: addElementStyle */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114754x58ecef56(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style style) {
        this.f59936x68b1db1.add(style);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114755x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 c27408x6a1e2862 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59933x258e6059), java.lang.Integer.valueOf(c27408x6a1e2862.f59933x258e6059)) && n51.f.a(this.f59935xb52fe6cc, c27408x6a1e2862.f59935xb52fe6cc) && n51.f.a(this.f59936x68b1db1, c27408x6a1e2862.f59936x68b1db1) && n51.f.a(java.lang.Integer.valueOf(this.f59934x29fa412c), java.lang.Integer.valueOf(c27408x6a1e2862.f59934x29fa412c));
    }

    /* renamed from: getBusinessType */
    public int m114756x38d97590() {
        return this.f59933x258e6059;
    }

    /* renamed from: getBusiness_type */
    public int m114757xe2ee1ca3() {
        return this.f59933x258e6059;
    }

    /* renamed from: getEffectiveDuration */
    public int m114758x6134cba5() {
        return this.f59934x29fa412c;
    }

    /* renamed from: getEffective_duration */
    public int m114759x3d56a322() {
        return this.f59934x29fa412c;
    }

    /* renamed from: getJumpId */
    public java.lang.String m114760x209cccdf() {
        return this.f59935xb52fe6cc;
    }

    /* renamed from: getJump_id */
    public java.lang.String m114761xf2fd2296() {
        return this.f59935xb52fe6cc;
    }

    /* renamed from: getStyle */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style> m114762x7528c3fb() {
        return this.f59936x68b1db1;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114763x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(2, this.f59933x258e6059);
            java.lang.String str = this.f59935xb52fe6cc;
            if (str != null) {
                fVar.j(19, str);
            }
            fVar.g(26, 8, this.f59936x68b1db1);
            fVar.e(28, this.f59934x29fa412c);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(2, this.f59933x258e6059) + 0;
            java.lang.String str2 = this.f59935xb52fe6cc;
            if (str2 != null) {
                e17 += b36.f.j(19, str2);
            }
            return e17 + b36.f.g(26, 8, this.f59936x68b1db1) + b36.f.e(28, this.f59934x29fa412c);
        }
        if (i17 == 2) {
            this.f59936x68b1db1.clear();
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
        if (intValue == 2) {
            this.f59933x258e6059 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 19) {
            this.f59935xb52fe6cc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 26) {
            if (intValue != 28) {
                return -1;
            }
            this.f59934x29fa412c = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style style = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style();
            if (bArr != null && bArr.length > 0) {
                style.mo11468x92b714fd(bArr);
            }
            this.f59936x68b1db1.add(style);
        }
        return 0;
    }

    /* renamed from: setBusinessType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114765x6f22709c(int i17) {
        this.f59933x258e6059 = i17;
        return this;
    }

    /* renamed from: setBusiness_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114766x75c48317(int i17) {
        this.f59933x258e6059 = i17;
        return this;
    }

    /* renamed from: setEffectiveDuration */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114767x3ccad819(int i17) {
        this.f59934x29fa412c = i17;
        return this;
    }

    /* renamed from: setEffective_duration */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114768xd482252e(int i17) {
        this.f59934x29fa412c = i17;
        return this;
    }

    /* renamed from: setJumpId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114769x13d200eb(java.lang.String str) {
        this.f59935xb52fe6cc = str;
        return this;
    }

    /* renamed from: setJump_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114770x666e700a(java.lang.String str) {
        this.f59935xb52fe6cc = str;
        return this;
    }

    /* renamed from: setStyle */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114771x53b6de6f(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862.Style> linkedList) {
        this.f59936x68b1db1 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 m114764x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27408x6a1e2862) super.mo11468x92b714fd(bArr);
    }
}
