package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView */
/* loaded from: classes9.dex */
public class C3303x12f7e80e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.TextView> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac {

    /* renamed from: formatText */
    private java.lang.String f12801x134cddc4 = "";

    /* renamed from: nickName */
    private java.lang.String f12802x4281c8e = "";

    /* renamed from: trueName */
    private java.lang.String f12805x6de9ed39 = "";

    /* renamed from: businessName */
    private java.lang.String f12800xd7e3ce6b = "";

    /* renamed from: textAlign */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 f12803xc07d95d8 = com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT;

    /* renamed from: textColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12804xc09b2e36 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$TextAlign */
        static final /* synthetic */ int[] f12808xa9ce30eb;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.m28388xcee59d22().length];
            f12808xa9ce30eb = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f12808xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f12808xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getBusinessNameText */
    public java.lang.String mo26500x3330c1ae() {
        return this.f12800xd7e3ce6b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getFormatText */
    public java.lang.String mo26501x18d95ba() {
        return this.f12801x134cddc4;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getNickNameText */
    public java.lang.String mo26502xa3a57151() {
        return this.f12802x4281c8e;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getTextAlign */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 mo26503xbfeb0722() {
        return this.f12803xc07d95d8;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26504xc0089f80() {
        return this.f12804xc09b2e36;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getTextSize */
    public float mo26505x40077844() {
        return i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) mo27110xfb86a31b().getTextSize());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: getTrueNameText */
    public java.lang.String mo26506xc168f47c() {
        return this.f12805x6de9ed39;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setBusinessNameText */
    public void mo26507xd72d56ba(java.lang.String str) {
        this.f12800xd7e3ce6b = str;
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setFormatText */
    public void mo26508x2fb1e3c6(java.lang.String str) {
        this.f12801x134cddc4 = str;
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setNickNameText */
    public void mo26509xd9ee6c5d(java.lang.String str) {
        this.f12802x4281c8e = str;
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setTextAlign */
    public void mo26510x1c3ec796(com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8) {
        if (enumC3607x37efb5b8 != null) {
            this.f12803xc07d95d8 = enumC3607x37efb5b8;
            int gravity = mo27110xfb86a31b().getGravity();
            int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3303x12f7e80e.AnonymousClass2.f12808xa9ce30eb[this.f12803xc07d95d8.ordinal()];
            if (i17 == 1) {
                mo27110xfb86a31b().setGravity(gravity | 3);
            } else if (i17 == 2) {
                mo27110xfb86a31b().setGravity(17);
            } else if (i17 == 3) {
                mo27110xfb86a31b().setGravity(5);
            }
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setTextColor */
    public void mo26511x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f12804xc09b2e36 = c3392x2ae78284;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType mMViewType = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.MMKLabelViewText;
        java.lang.Integer.toHexString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27190xf794c2a7(c3392x2ae78284, mMViewType)));
        mo27110xfb86a31b().setTextColor(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27190xf794c2a7(c3392x2ae78284, mMViewType)));
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setTextSize */
    public void mo26512x3abfd950(float f17) {
        if (f17 > 0.0f) {
            mo27110xfb86a31b().setTextSize(1, f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f));
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: setTrueNameText */
    public void mo26513xf7b1ef88(java.lang.String str) {
        this.f12805x6de9ed39 = str;
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3489xb36454ac
    /* renamed from: updateContent */
    public void mo26514xdf8ccf70() {
        final android.widget.TextView mo27110xfb86a31b = mo27110xfb86a31b();
        mo27110xfb86a31b.setText(java.lang.String.format(this.f12801x134cddc4, this.f12802x4281c8e + this.f12805x6de9ed39 + this.f12800xd7e3ce6b));
        mo27110xfb86a31b.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0092, code lost:
            
                if (r10 < r12) goto L8;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3303x12f7e80e.AnonymousClass1.run():void");
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.TextView mo26107x519d71c1(android.content.Context context) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
        textView.setGravity(19);
        textView.setLines(2);
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f12804xc09b2e36 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(java.lang.Long.parseLong("E6000000", 16), java.lang.Long.parseLong("CCFFFFFF", 16));
        }
        return textView;
    }
}
