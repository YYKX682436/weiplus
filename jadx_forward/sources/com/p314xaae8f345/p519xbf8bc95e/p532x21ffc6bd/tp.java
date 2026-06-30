package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tp implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133689a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f133690b = false;

    public tp(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        this.f133689a = trVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final void a() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean b() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean c() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean d() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean e(float f17, float f18) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean f(float f17, float f18) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean g(float f17, float f18) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean h(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        trVar.f133805ar++;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4 = trVar.f133798ak;
        if (c26086x3c4a5e4 != null) {
            return c26086x3c4a5e4.mo99976xc3989f21(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean i(float f17, float f18) {
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        int i18 = trVar.f133805ar;
        if (i18 > 0) {
            i17 = i18 - 1;
            trVar.f133805ar = i17;
        } else {
            i17 = 0;
        }
        trVar.f133805ar = i17;
        e();
        if (this.f133689a.f133804aq && this.f133689a.f133803ap) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f133689a;
            if (trVar2.f133805ar == 0) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a17 = trVar2.a();
                if (a17 == null) {
                    return false;
                }
                this.f133689a.f133804aq = false;
                this.f133689a.mo36953xd9f3cf46(a17);
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4 = this.f133689a.f133798ak;
        if (c26086x3c4a5e4 != null) {
            return c26086x3c4a5e4.mo99983x341cda(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean j(float f17, float f18) {
        return false;
    }

    private void e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar.f133798ak == null || !this.f133690b) {
            return;
        }
        this.f133689a.f133798ak.mo99982x56a01d1a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426.TwoFingerMoveAgainstStatus.END, trVar.a());
        this.f133690b = false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(float f17, float f18) {
        boolean z17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar != null && (z17 = trVar.f133799al) && (c26086x3c4a5e4 = trVar.f133798ak) != null && z17) {
            return c26086x3c4a5e4.mo99975xce1d2af3(f17, f18);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0133, code lost:
    
        if (r0 == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(float r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tp.b(float, float):boolean");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean c(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al || (c26086x3c4a5e4 = trVar.f133798ak) == null) {
            return false;
        }
        return c26086x3c4a5e4.mo99977xaf95e2bd(f17, f18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean d(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av d17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        if (trVar.f133736r != null && (d17 = trVar.d(f17, f18)) != null) {
            trVar.f133736r.a(d17.mo36409x5db1b11());
            trVar.a(d17, true);
        } else if (trVar.f133738t != null && trVar.f133799al) {
            trVar.f133738t.mo99161x843609ef(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).mo37464x78d58245().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(f17, f18))));
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4 = this.f133689a.f133798ak;
        if (c26086x3c4a5e4 != null) {
            return c26086x3c4a5e4.mo99978x4f8d808(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(android.view.MotionEvent motionEvent, float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        if (motionEvent != null && motionEvent.getPointerCount() > 1) {
            e();
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4 = this.f133689a.f133798ak;
        if (c26086x3c4a5e4 != null) {
            return c26086x3c4a5e4.mo99980x58dabd8c(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        e();
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        e();
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, double d17, double d18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al || trVar.f133798ak == null) {
            return false;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a17 = trVar.a();
        if (!this.f133690b) {
            this.f133689a.f133798ak.mo99982x56a01d1a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426.TwoFingerMoveAgainstStatus.START, a17);
            this.f133690b = true;
        } else {
            this.f133689a.f133798ak.mo99982x56a01d1a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426.TwoFingerMoveAgainstStatus.RUNNING, a17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean b(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133689a;
        if (trVar == null || !trVar.f133799al) {
            return false;
        }
        e();
        return false;
    }
}
