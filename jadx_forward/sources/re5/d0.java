package re5;

/* loaded from: classes12.dex */
public final class d0 extends pf3.d implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6, fg3.h {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f476096s;

    /* renamed from: t, reason: collision with root package name */
    public em.s1 f476097t;

    /* renamed from: u, reason: collision with root package name */
    public int f476098u;

    /* renamed from: v, reason: collision with root package name */
    public int f476099v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f476100w;

    /* renamed from: x, reason: collision with root package name */
    public final m34.e f476101x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.Video.LocalVideoPlayerOperationLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f476096s = jz5.h.b(new re5.a0(this));
        this.f476100w = new re5.c0(this);
        this.f476101x = new re5.b0(this);
    }

    @Override // mf3.e, kg3.d
    public void H2() {
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejr, (android.view.ViewGroup) null);
        this.f476097t = new em.s1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6
    public void a(float f17) {
        f06.d apiKClass = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(fg3.p.class);
        mf3.p pVar = this.f407637d;
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiKClass, "apiKClass");
        fg3.p pVar2 = (fg3.p) pVar.a(xz5.a.b(apiKClass));
        if (pVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = ((ig3.i) ((fg3.v) pVar2).U()).f372962b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c18697xb57c3465, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            c18697xb57c3465.mo69432x8983b21d(f17);
            float f18 = c18697xb57c3465.getF();
            em.s1 s1Var = this.f476097t;
            if (s1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            s1Var.c().mo75801x41557a06(f18);
            em.s1 s1Var2 = this.f476097t;
            if (s1Var2 != null) {
                s1Var2.c().y();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
        }
    }

    @Override // fg3.h
    public void c() {
        android.content.Context K = K();
        pf5.z zVar = pf5.z.f435481a;
        if (!(K instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        re5.s sVar = (re5.s) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) K).a(re5.s.class);
        boolean isShown = M().isShown();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) sVar.m158354x19263085();
        if (abstractActivityC21394xb3d2c0cf != null) {
            if (isShown) {
                android.widget.RelativeLayout relativeLayout = sVar.f476124d;
                if (relativeLayout != null) {
                    sVar.V6();
                    oa5.b.b(sVar.f476124d).k(new re5.j(relativeLayout)).o(new re5.k(relativeLayout)).g(sVar.f476129i).l();
                }
            } else {
                sVar.X6(abstractActivityC21394xb3d2c0cf);
            }
        }
        ((kg3.i) ((jz5.n) this.f476096s).mo141623x754a37bb()).b();
    }

    @Override // mf3.l
    public void d(float f17) {
        if (f17 > 0.0f) {
            android.view.View M = M();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            M.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(M, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // fg3.h
    public void e(boolean z17) {
        em.s1 s1Var = this.f476097t;
        if (s1Var != null) {
            s1Var.c().mo61296x11f3be80(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
        em.s1 s1Var = this.f476097t;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var.c().mo75801x41557a06(1.0f);
        em.s1 s1Var2 = this.f476097t;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var2.c().y();
        mo129545x6761d4f();
    }

    @Override // mf3.l
    public void q(float f17) {
        float f18 = 1.0f - f17;
        em.s1 s1Var = this.f476097t;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.view.View view = s1Var.f336305a;
        float max = java.lang.Math.max(1.0f - (f18 * 2), 0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // fg3.h
    /* renamed from: reset */
    public void mo129545x6761d4f() {
        em.s1 s1Var = this.f476097t;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var.a().setVisibility(8);
        em.s1 s1Var2 = this.f476097t;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var2.c().mo61296x11f3be80(false);
        em.s1 s1Var3 = this.f476097t;
        if (s1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var3.c().a(0);
        M().clearAnimation();
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fg3.h
    public void s(boolean z17) {
        em.s1 s1Var = this.f476097t;
        if (s1Var != null) {
            s1Var.c().E(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mo129545x6761d4f();
        mf3.k kVar = bindContext.f407650a;
        gg3.c a17 = kVar.a();
        w(0, (int) (a17 != null ? a17.f353263e : 0L));
        gg3.c a18 = kVar.a();
        if (a18 != null) {
            android.content.Context K = K();
            pf5.z zVar = pf5.z.f435481a;
            if (!(K instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            re5.s sVar = (re5.s) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) K).a(re5.s.class);
            sVar.getClass();
            sVar.f476128h = a18;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152.C22724xdb26ef0b c22724xdb26ef0b = sVar.f476125e;
            if (c22724xdb26ef0b != null) {
                c22724xdb26ef0b.post(new re5.o(c22724xdb26ef0b, a18));
            }
            android.widget.TextView textView = sVar.f476126f;
            if (textView != null) {
                textView.post(new re5.p(textView, a18));
            }
        }
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        new kg3.b().a(M());
        em.s1 s1Var = this.f476097t;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var.b().setVisibility(8);
        em.s1 s1Var2 = this.f476097t;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var2.f336305a.setPadding(0, 0, 0, i65.a.b(K(), 15));
        em.s1 s1Var3 = this.f476097t;
        if (s1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c17 = s1Var3.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getSeekBar(...)");
        X(c17);
        em.s1 s1Var4 = this.f476097t;
        if (s1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c18 = s1Var4.c();
        c18.setVisibility(0);
        c18.m75807x1db7aeeb(new re5.y(this));
        c18.C(c18.getLightStyle());
        c18.m75797x45fe8c1c(true);
        em.s1 s1Var5 = this.f476097t;
        if (s1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var5.c().m75826x325c7617(new re5.z(this));
        em.s1 s1Var6 = this.f476097t;
        if (s1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        s1Var6.c().mo69283xbdcdae58(this.f476101x);
        em.s1 s1Var7 = this.f476097t;
        if (s1Var7 != null) {
            s1Var7.c().m75798x905e0b31(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }

    @Override // fg3.h
    public void w(int i17, int i18) {
        this.f476098u = i17 / 1000;
        this.f476099v = i18 / 1000;
        em.s1 s1Var = this.f476097t;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c17 = s1Var.c();
        java.lang.Runnable runnable = this.f476100w;
        c17.removeCallbacks(runnable);
        em.s1 s1Var2 = this.f476097t;
        if (s1Var2 != null) {
            s1Var2.c().post(runnable);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
    }
}
