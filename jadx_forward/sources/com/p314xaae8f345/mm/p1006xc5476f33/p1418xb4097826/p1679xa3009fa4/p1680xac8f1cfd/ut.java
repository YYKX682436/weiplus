package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ut extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.k9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f217705d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f217706e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f217707f;

    /* renamed from: g, reason: collision with root package name */
    public long f217708g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f217709h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f217710i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f217711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217705d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tt(this));
        this.f217706e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.st(this));
        this.f217707f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qt(this));
        this.f217709h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rt(this));
        this.f217711m = true;
    }

    public final void O6(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ((cl0.g) ((jz5.n) this.f217705d).mo141623x754a37bb()).o(key, i17);
    }

    public final void P6(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        ((cl0.g) ((jz5.n) this.f217705d).mo141623x754a37bb()).h(key, value);
    }

    public final int Q6() {
        return ((java.lang.Number) this.f217709h.mo141623x754a37bb()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(boolean r21) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.R6(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (m80381x45f41879() && getIsUserVisibleFocused() && this.f217711m) {
            R6(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (m80381x45f41879() && getIsUserVisibleFocused() && this.f217711m) {
            R6(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        if (this.f217711m) {
            R6(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        if (this.f217711m) {
            R6(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f217705d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tt(this));
        this.f217706e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.st(this));
        this.f217707f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qt(this));
        this.f217709h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rt(this));
        this.f217711m = true;
    }
}
