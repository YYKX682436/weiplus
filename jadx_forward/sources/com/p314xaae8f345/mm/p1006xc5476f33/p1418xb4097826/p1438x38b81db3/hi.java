package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class hi implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f185124d;

    public hi(java.lang.ref.WeakReference weakConvert) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakConvert, "weakConvert");
        this.f185124d = weakConvert;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public /* bridge */ /* synthetic */ void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        cw2.da daVar;
        cw2.wa f212140n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj) this.f185124d.get();
        if (ojVar == null || (daVar = ojVar.C) == null || (f212140n = daVar.getF212140n()) == null || (c14989xf862ae88 = f212140n.f305632f) == null) {
            return;
        }
        long feedId = c14989xf862ae88.getFeedId();
        long mo56685x3d7f3f1d = daVar.mo56685x3d7f3f1d();
        long mo56695x7723e6ff = daVar.mo56695x7723e6ff();
        int i19 = (int) ((((float) mo56685x3d7f3f1d) / ((float) mo56695x7723e6ff)) * 500);
        if (mo56685x3d7f3f1d < 0 || mo56695x7723e6ff <= 0) {
            return;
        }
        ey2.v2 v2Var = (ey2.v2) ((jz5.n) ojVar.D).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v2Var, "<get-videoStateVM>(...)");
        v2Var.W6(feedId, 4, i19, mo56685x3d7f3f1d, mo56695x7723e6ff, 1.0f, (r28 & 64) != 0 ? 1 : 0, (r28 & 128) != 0 ? false : false, (r28 & 256) != 0 ? ey2.t2.f339056p : ey2.t2.f339051h);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
