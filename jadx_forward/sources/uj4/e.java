package uj4;

/* loaded from: classes11.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements bi4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f509950d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f509951e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f509952f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f509953g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f509954h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f509955i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f509956m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f509957n;

    /* renamed from: o, reason: collision with root package name */
    public float f509958o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f509959p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f509960q;

    /* renamed from: r, reason: collision with root package name */
    public bi4.l0 f509961r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.ref.WeakReference f509962s;

    /* renamed from: t, reason: collision with root package name */
    public final uj4.d f509963t;

    /* renamed from: u, reason: collision with root package name */
    public bi4.o0 f509964u;

    /* renamed from: v, reason: collision with root package name */
    public pj4.o0 f509965v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f509950d = "MicroMsg.TextStatusBackPreviewUIC@" + activity.hashCode();
        this.f509963t = new uj4.d(this);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
    }

    public final void O6(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fragmentManager, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String scene, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentManager, "fragmentManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.lang.String str2 = this.f509950d;
        if (viewGroup != null) {
            if (!(str == null || str.length() == 0)) {
                android.content.Context context = viewGroup.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                this.f509954h = new java.lang.ref.WeakReference(activity != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) activity.findViewById(com.p314xaae8f345.mm.R.id.kod) : null);
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18665x5ffcff27.f255217t;
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p.clear();
                android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18665x5ffcff27.class);
                intent.putExtra("KEY_USER_NAME", str);
                intent.putExtra("KEY_FROM_SCENE", scene);
                android.content.Intent intent2 = context2 instanceof android.app.Activity ? ((android.app.Activity) context2).getIntent() : null;
                int intExtra = intent2 != null ? intent2.getIntExtra("CONTACT_INFO_UI_SOURCE", 0) : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "profileReferPath:" + intExtra);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a17 = lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18665x5ffcff27.class, intent, false, false, false, com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.class, 28, null);
                a17.m7571x41119ed3(false);
                int[] a18 = bi4.e.a(viewGroup.getContext());
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(viewGroup.getContext());
                relativeLayout.setId(com.p314xaae8f345.mm.R.id.s1e);
                viewGroup.addView(relativeLayout, 0, new android.view.ViewGroup.LayoutParams(a18[0], a18[1]));
                a17.q0(new uj4.a(this));
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.s1e);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addStatusFeedVASFragmentToRoot: find vasContainer=");
                sb6.append(h0Var.f391656d != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                java.lang.Object obj = h0Var.f391656d;
                if (obj == null) {
                    viewGroup.post(new uj4.b(h0Var, this, fragmentManager, a17));
                } else {
                    T6(fragmentManager, (android.view.ViewGroup) obj, a17);
                }
                this.f509957n = z17;
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "addStatusFeedVASFragmentToRoot: failed");
    }

    public final boolean P6() {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509960q, java.lang.Boolean.TRUE);
        java.lang.String str = this.f509950d;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkShouldInterceptProfileLifeCycle: reset");
            this.f509960q = null;
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        boolean z17 = V6 != null ? V6.f255321v : false;
        this.f509960q = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkShouldSkipPauseResume: " + this.f509960q);
        return z17;
    }

    public final void Q6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509950d, "doOnPostClose: ");
        this.f509956m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        if (V6 != null) {
            V6.W6(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6 = U6();
            if (U6 != null) {
                U6.mo14951x73fef619();
            }
            V6.f255318s = true;
        }
    }

    public final void R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509950d, "doOnPostOpen: ");
        this.f509956m = true;
        bi4.l0 l0Var = this.f509961r;
        if (l0Var != null) {
            l0Var.K5(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        if (V6 != null) {
            V6.f255320u = true;
            V6.f255318s = false;
            V6.f255319t = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6 = U6();
            if (U6 != null) {
                U6.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U62 = U6();
                if (U62 != null) {
                    U62.mo14952xd2370609(false);
                }
                U6.H();
            }
            if (this.f509959p) {
                this.f509959p = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U63 = U6();
                if (U63 == null || (c18612x3f06d82e = U63.f255731o) == null) {
                    return;
                }
                c18612x3f06d82e.b(true);
            }
        }
    }

    public final void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509950d, "doOnPreClose: ");
        bi4.l0 l0Var = this.f509961r;
        if (l0Var != null) {
            l0Var.K5(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        if (V6 != null) {
            V6.f255320u = false;
            V6.f255319t = false;
            java.util.Map map = V6.f255311i;
            if (true ^ ((java.util.LinkedHashMap) map).values().isEmpty()) {
                java.lang.Object W = kz5.n0.W(((java.util.LinkedHashMap) map).values());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(W, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.ui.StatusCardView");
                b7(((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) W).A);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6 = U6();
        if (U6 != null) {
            U6.mo14953x56608c14();
        }
    }

    public final void T6(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83) {
        java.lang.Object m143895xf1229813;
        java.lang.String str = this.f509950d;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doReplaceFragmentTransaction: failed");
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.s1e, c22584xf7d97e83, null);
            m7630xb2c12e75.g();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(m143895xf1229813)) {
            this.f509953g = new java.lang.ref.WeakReference(viewGroup);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doReplaceFragmentTransaction: err=" + p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) + ", enablePlayMediaOnProfileClosed=" + this.f509957n);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        bi4.n0 P6 = V6 != null ? V6.P6() : null;
        if (P6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2) P6;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6() {
        java.lang.ref.WeakReference weakReference = this.f509955i;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class);
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f509950d, "getBackStatusCardFeedUIC: fail, " + this.f509955i + ", " + activity);
        return null;
    }

    public final void W6(int i17) {
        android.view.ViewGroup viewGroup;
        java.lang.ref.WeakReference weakReference = this.f509953g;
        if (weakReference == null || (viewGroup = (android.view.ViewGroup) weakReference.get()) == null || i17 <= 0 || this.f509956m) {
            return;
        }
        float f17 = -(i17 / 2.0f);
        viewGroup.setTranslationY(f17);
        this.f509958o = f17;
    }

    public final boolean X6() {
        java.lang.ref.WeakReference weakReference = this.f509953g;
        return (weakReference != null ? (android.view.ViewGroup) weakReference.get() : null) != null;
    }

    public final void Y6(float f17, float f18, float f19) {
        java.lang.ref.WeakReference weakReference = this.f509962s;
        android.widget.ImageView imageView = weakReference != null ? (android.widget.ImageView) weakReference.get() : null;
        if (imageView != null) {
            imageView.setAlpha((1 - f17) * 0.3f);
        }
        java.lang.ref.WeakReference weakReference2 = this.f509953g;
        android.view.ViewGroup viewGroup = weakReference2 != null ? (android.view.ViewGroup) weakReference2.get() : null;
        if (viewGroup == null) {
            return;
        }
        if (f19 >= f18) {
            viewGroup.setTranslationY((1 - f17) * this.f509958o);
        } else {
            viewGroup.setTranslationY(f18 - f19);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        bi4.n0 P6 = V6 != null ? V6.P6() : null;
        if (P6 != null) {
            P6.r(f17, f18, f19);
        }
    }

    public final void Z6() {
        java.lang.ref.WeakReference weakReference = this.f509953g;
        java.lang.String str = this.f509950d;
        if (weakReference != null) {
            if ((weakReference != null ? (android.view.ViewGroup) weakReference.get() : null) != null) {
                java.lang.ref.WeakReference weakReference2 = this.f509953g;
                android.view.ViewGroup viewGroup = weakReference2 != null ? (android.view.ViewGroup) weakReference2.get() : null;
                android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeStatusFeedVASFragmentInRoot: parent=");
                sb6.append(viewGroup2 != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewGroup);
                }
                this.f509953g = null;
                this.f509955i = null;
                this.f509962s = null;
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeStatusFeedVASFragmentInRoot: skip");
    }

    public final void a7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509950d, "setLauncherUIViewPagerCanSlide: " + z17);
        java.lang.ref.WeakReference weakReference = this.f509954h;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = weakReference != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) weakReference.get() : null;
        if (c21470xb673f8d != null) {
            c21470xb673f8d.m78873x6e5cce43(z17);
        }
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        bi4.l0 l0Var;
        java.util.List q17 = ai4.m0.f86706a.G().q(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("db event notify username=");
        sb6.append(str);
        sb6.append(", newDataSize=");
        sb6.append(q17.size());
        sb6.append(", ");
        java.lang.ref.WeakReference weakReference = this.f509955i;
        sb6.append(weakReference != null ? (android.app.Activity) weakReference.get() : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f509950d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (q17.isEmpty()) {
            Z6();
            bi4.l0 l0Var2 = this.f509961r;
            if (l0Var2 != null) {
                l0Var2.j1();
                return;
            }
            return;
        }
        if (this.f509955i == null && this.f509953g == null) {
            bi4.l0 l0Var3 = this.f509961r;
            if (l0Var3 != null) {
                l0Var3.a6();
            }
            bi4.l0 l0Var4 = this.f509961r;
            if (l0Var4 != null) {
                l0Var4.M2();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        if (V6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "getActivateMultiStatusCardView update data:" + q17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 O6 = V6.O6();
            if (!(O6 != null ? O6.j(q17) : false) || (l0Var = this.f509961r) == null) {
                return;
            }
            l0Var.M2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(mj4.h r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L93
            java.lang.ref.WeakReference r0 = r7.f509962s
            if (r0 != 0) goto L16
            r0 = 2131311162(0x7f093a3a, float:1.8240657E38)
            android.view.View r0 = r7.mo144222x4ff8c0f0(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r7.f509962s = r1
        L16:
            java.lang.ref.WeakReference r0 = r7.f509962s
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L23
        L22:
            r0 = r1
        L23:
            r2 = 0
            r3 = 1
            pj4.o0 r4 = xe0.j0.a(r8, r2, r3, r1)
            bi4.o0 r5 = r7.f509964u
            if (r5 != 0) goto L2e
            goto L3d
        L2e:
            pj4.o0 r5 = r7.f509965v
            if (r5 == 0) goto L3a
            boolean r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c.b(r5, r4)
            if (r5 != r3) goto L3a
            r5 = r3
            goto L3b
        L3a:
            r5 = r2
        L3b:
            if (r5 != 0) goto L3f
        L3d:
            r5 = r2
            goto L40
        L3f:
            r5 = r3
        L40:
            if (r5 != 0) goto L6b
            bi4.o0 r5 = r7.f509964u
            if (r5 == 0) goto L49
            r5.n()
        L49:
            r7.f509964u = r1
            r7.f509965v = r1
            sj4.z0 r1 = sj4.z0.f490441a
            java.lang.String r5 = oi4.k.b(r4)
            bi4.o0 r1 = r1.b(r5)
            r7.f509964u = r1
            if (r1 == 0) goto L69
            r5 = r8
            mj4.k r5 = (mj4.k) r5
            java.lang.String r5 = r5.l()
            pj4.j0 r6 = oi4.k.a(r4)
            r1.m(r5, r6)
        L69:
            r7.f509965v = r4
        L6b:
            bi4.o0 r1 = r7.f509964u
            r4 = r8
            mj4.k r4 = (mj4.k) r4
            java.lang.String r4 = r4.o()
            boolean r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c.a(r4, r1, r8)
            r1 = r1 ^ r3
            if (r1 != 0) goto L8b
            mj4.k r8 = (mj4.k) r8
            boolean r8 = r8.v()
            if (r8 == 0) goto L84
            goto L8b
        L84:
            if (r0 != 0) goto L87
            goto L93
        L87:
            r0.setVisibility(r2)
            goto L93
        L8b:
            if (r0 != 0) goto L8e
            goto L93
        L8e:
            r8 = 8
            r0.setVisibility(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uj4.e.b7(mj4.h):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509950d, "onDestroy: ");
        this.f509955i = null;
        this.f509953g = null;
        this.f509962s = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = V6();
        if (V6 != null) {
            V6.f255318s = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 O6 = V6.O6();
            if (O6 != null) {
                O6.c(new uj4.c(V6, this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
    }
}
