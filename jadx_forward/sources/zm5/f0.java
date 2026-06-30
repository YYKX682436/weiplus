package zm5;

/* loaded from: classes3.dex */
public final class f0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f555738d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f555739e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555740f;

    /* renamed from: g, reason: collision with root package name */
    public db5.t4 f555741g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f555742h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f555743i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f555744m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f555745n;

    /* renamed from: o, reason: collision with root package name */
    public zm5.x0 f555746o;

    /* renamed from: p, reason: collision with root package name */
    public sy3.c f555747p;

    /* renamed from: q, reason: collision with root package name */
    public long f555748q;

    /* renamed from: r, reason: collision with root package name */
    public zm5.x0 f555749r;

    /* renamed from: s, reason: collision with root package name */
    public final sy3.e f555750s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555738d = -1L;
        this.f555739e = "";
        this.f555742h = jz5.h.b(new zm5.a0(activity));
        this.f555743i = jz5.h.b(new zm5.b0(activity));
        this.f555744m = jz5.h.b(new zm5.u(activity));
        zm5.x0 x0Var = zm5.x0.f555819d;
        this.f555746o = x0Var;
        this.f555749r = x0Var;
        this.f555750s = new zm5.v(activity, this);
    }

    public final void O6() {
        nc5.w wVar;
        zm5.x0 x0Var = this.f555746o;
        zm5.x0 x0Var2 = zm5.x0.f555820e;
        if (x0Var == x0Var2) {
            if (aq.p.f94463b != null && (wVar = nc5.b.f417726e) != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0 c5227x1de104c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0();
                am.r1 r1Var = c5227x1de104c0.f135560g;
                r1Var.f89290a = 1;
                r1Var.f89291b = wVar.f417771a;
                c5227x1de104c0.e();
                wVar.f417771a = 0;
            }
            this.f555746o = zm5.x0.f555819d;
            U6();
        }
        sy3.c cVar = this.f555747p;
        if (cVar == null || this.f555749r != x0Var2) {
            return;
        }
        ((kz3.l) cVar).b(this.f555748q);
        U6();
        this.f555748q = 0L;
        this.f555749r = zm5.x0.f555819d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f435481a.a(activity).a(zm5.l.class);
        lVar.f555773n = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = lVar.f555767e;
        if (c21520x5bb48e5e != null) {
            c21520x5bb48e5e.m79167xa8f8963d(true);
            c21520x5bb48e5e.m79174x52d6d40d(false);
        }
    }

    public final android.widget.ImageView P6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f555744m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    public final android.widget.ImageView Q6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f555742h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    public final void R6(int i17) {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f555743i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.ImageView) mo141623x754a37bb).setVisibility(i17);
        Q6().setVisibility(i17);
        P6().setVisibility(i17);
    }

    public final void S6(long j17, java.lang.String str) {
        boolean z17;
        this.f555738d = j17;
        this.f555739e = str;
        if (this.f555740f == null) {
            this.f555740f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m158354x19263085(), 0, true);
        }
        if (aq.p.f94463b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "getShareAndSaveIsToShow: " + j17);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, j17);
            boolean z18 = (c01.ia.y(n17) || c01.ia.C(n17)) ? false : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "getShareAndSaveIsToShow: " + z18);
            z17 = z18;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f555740f;
        if (k0Var != null) {
            k0Var.f293405n = new zm5.c0(z17, this);
        }
        if (k0Var != null) {
            k0Var.f293407o = new zm5.d0(z17, this, j17, str);
        }
        db5.t4 t4Var = this.f555741g;
        if (t4Var != null) {
            if (k0Var != null) {
                k0Var.f293414s = t4Var;
            }
            if (k0Var != null) {
                k0Var.f293417v = t4Var;
            }
        }
        if (k0Var != null) {
            k0Var.p(new zm5.e0(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f555740f;
        if (k0Var2 != null) {
            k0Var2.v();
        }
    }

    public final void T6() {
        R6(0);
        android.animation.ValueAnimator valueAnimator = this.f555745n;
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
        }
        android.animation.ValueAnimator valueAnimator2 = this.f555745n;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(-1);
        }
        android.animation.ValueAnimator valueAnimator3 = this.f555745n;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void U6() {
        R6(8);
        android.animation.ValueAnimator valueAnimator = this.f555745n;
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
        }
        android.animation.ValueAnimator valueAnimator2 = this.f555745n;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(0);
        }
        android.animation.ValueAnimator valueAnimator3 = this.f555745n;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f555745n = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(5000L);
        }
        android.animation.ValueAnimator valueAnimator = this.f555745n;
        if (valueAnimator != null) {
            valueAnimator.addListener(new zm5.w(this));
        }
        int height = m158354x19263085().getWindowManager().getDefaultDisplay().getHeight();
        android.animation.ValueAnimator valueAnimator2 = this.f555745n;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new zm5.x(this, height));
        }
        android.view.ViewGroup.LayoutParams layoutParams = P6().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += i65.a.b(m158354x19263085(), aq.p.f94463b != null ? nc5.b.f417725d : 0);
        P6().setLayoutParams(layoutParams2);
        P6().setOnClickListener(new zm5.y(this));
        this.f555741g = new zm5.z(this);
        if (aq.p.f94463b != null) {
            nc5.w wVar = new nc5.w();
            nc5.b.f417726e = wVar;
            wVar.f417776f.mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        O6();
        if (aq.p.f94463b != null) {
            nc5.w wVar = nc5.b.f417726e;
            if (wVar != null) {
                wVar.f417776f.mo48814x2efc64();
            }
            nc5.b.f417726e = null;
        }
    }
}
