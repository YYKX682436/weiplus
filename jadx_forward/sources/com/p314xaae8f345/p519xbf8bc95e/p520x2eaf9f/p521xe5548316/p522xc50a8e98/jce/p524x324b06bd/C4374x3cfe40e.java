package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic */
/* loaded from: classes13.dex */
public final class C4374x3cfe40e extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: anchor_x */
    public float f17286xc61cf56e;

    /* renamed from: anchor_y */
    public float f17287xc61cf56f;

    /* renamed from: brief */
    public java.lang.String f17288x59a687a;

    /* renamed from: confidence */
    public int f17289x316d5e8a;

    /* renamed from: coord_lat */
    public float f17290x19238955;

    /* renamed from: coord_lon */
    public float f17291x19238b01;

    /* renamed from: end_time */
    public int f17292x66d9d3b1;

    /* renamed from: eventid */
    public java.lang.String f17293xadf44135;

    /* renamed from: icon_highlight */
    public java.lang.String f17294xaf95406e;

    /* renamed from: icon_normal */
    public java.lang.String f17295xda18336d;

    /* renamed from: max_scale */
    public int f17296xf20076af;

    /* renamed from: message */
    public java.lang.String f17297x38eb0007;

    /* renamed from: min_scale */
    public int f17298x200b8d1d;

    /* renamed from: roadname */
    public java.lang.String f17299xdd5469ab;

    /* renamed from: source */
    public java.lang.String f17300xca90681b;

    /* renamed from: start_time */
    public int f17301xa23bb48a;

    /* renamed from: subtype */
    public int f17302x90af2d7a;

    /* renamed from: type */
    public int f17303x368f3a;

    /* renamed from: update_time */
    public int f17304xddd1e883;

    public C4374x3cfe40e() {
        this.f17293xadf44135 = "";
        this.f17300xca90681b = "";
        this.f17303x368f3a = 0;
        this.f17302x90af2d7a = 0;
        this.f17290x19238955 = 0.0f;
        this.f17291x19238b01 = 0.0f;
        this.f17288x59a687a = "";
        this.f17297x38eb0007 = "";
        this.f17289x316d5e8a = 0;
        this.f17301xa23bb48a = 0;
        this.f17292x66d9d3b1 = 0;
        this.f17304xddd1e883 = 0;
        this.f17299xdd5469ab = "";
        this.f17295xda18336d = "";
        this.f17294xaf95406e = "";
        this.f17286xc61cf56e = 0.0f;
        this.f17287xc61cf56f = 0.0f;
        this.f17298x200b8d1d = 0;
        this.f17296xf20076af = 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17293xadf44135 = mVar.b(0, true);
        this.f17300xca90681b = mVar.b(1, true);
        this.f17303x368f3a = mVar.a(this.f17303x368f3a, 2, true);
        this.f17302x90af2d7a = mVar.a(this.f17302x90af2d7a, 3, false);
        this.f17290x19238955 = mVar.a(this.f17290x19238955, 4, false);
        this.f17291x19238b01 = mVar.a(this.f17291x19238b01, 5, false);
        this.f17288x59a687a = mVar.b(6, false);
        this.f17297x38eb0007 = mVar.b(7, false);
        this.f17289x316d5e8a = mVar.a(this.f17289x316d5e8a, 8, true);
        this.f17301xa23bb48a = mVar.a(this.f17301xa23bb48a, 9, false);
        this.f17292x66d9d3b1 = mVar.a(this.f17292x66d9d3b1, 10, false);
        this.f17304xddd1e883 = mVar.a(this.f17304xddd1e883, 11, false);
        this.f17299xdd5469ab = mVar.b(12, false);
        this.f17295xda18336d = mVar.b(13, true);
        this.f17294xaf95406e = mVar.b(14, true);
        this.f17286xc61cf56e = mVar.a(this.f17286xc61cf56e, 15, true);
        this.f17287xc61cf56f = mVar.a(this.f17287xc61cf56f, 16, true);
        this.f17298x200b8d1d = mVar.a(this.f17298x200b8d1d, 17, true);
        this.f17296xf20076af = mVar.a(this.f17296xf20076af, 18, true);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17293xadf44135, 0);
        nVar.a(this.f17300xca90681b, 1);
        nVar.a(this.f17303x368f3a, 2);
        nVar.a(this.f17302x90af2d7a, 3);
        nVar.a(this.f17290x19238955, 4);
        nVar.a(this.f17291x19238b01, 5);
        java.lang.String str = this.f17288x59a687a;
        if (str != null) {
            nVar.a(str, 6);
        }
        java.lang.String str2 = this.f17297x38eb0007;
        if (str2 != null) {
            nVar.a(str2, 7);
        }
        nVar.a(this.f17289x316d5e8a, 8);
        nVar.a(this.f17301xa23bb48a, 9);
        nVar.a(this.f17292x66d9d3b1, 10);
        nVar.a(this.f17304xddd1e883, 11);
        java.lang.String str3 = this.f17299xdd5469ab;
        if (str3 != null) {
            nVar.a(str3, 12);
        }
        nVar.a(this.f17295xda18336d, 13);
        nVar.a(this.f17294xaf95406e, 14);
        nVar.a(this.f17286xc61cf56e, 15);
        nVar.a(this.f17287xc61cf56f, 16);
        nVar.a(this.f17298x200b8d1d, 17);
        nVar.a(this.f17296xf20076af, 18);
    }

    public C4374x3cfe40e(java.lang.String str, java.lang.String str2, int i17, int i18, float f17, float f18, java.lang.String str3, java.lang.String str4, int i19, int i27, int i28, int i29, java.lang.String str5, java.lang.String str6, java.lang.String str7, float f19, float f27, int i37, int i38) {
        this.f17293xadf44135 = str;
        this.f17300xca90681b = str2;
        this.f17303x368f3a = i17;
        this.f17302x90af2d7a = i18;
        this.f17290x19238955 = f17;
        this.f17291x19238b01 = f18;
        this.f17288x59a687a = str3;
        this.f17297x38eb0007 = str4;
        this.f17289x316d5e8a = i19;
        this.f17301xa23bb48a = i27;
        this.f17292x66d9d3b1 = i28;
        this.f17304xddd1e883 = i29;
        this.f17299xdd5469ab = str5;
        this.f17295xda18336d = str6;
        this.f17294xaf95406e = str7;
        this.f17286xc61cf56e = f19;
        this.f17287xc61cf56f = f27;
        this.f17298x200b8d1d = i37;
        this.f17296xf20076af = i38;
    }
}
