package ug5;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: g, reason: collision with root package name */
    public static final ug5.f f509188g = new ug5.f(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f509189h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f509190i = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ug5.g f509191a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f509192b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f509193c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f509194d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f509195e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f509196f;

    static {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ug5.e eVar = ug5.e.f509119d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "registerActivityDestroyCallback callback: " + eVar + "  ");
        if (context instanceof android.app.Application) {
            ((android.app.Application) context).registerActivityLifecycleCallbacks(new ug5.w(eVar, context));
        }
    }

    public v(ug5.g params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f509191a = params;
    }

    public static final android.graphics.RectF a(ug5.v vVar, int i17, int i18, float f17, float f18) {
        vVar.getClass();
        android.graphics.RectF rectF = new android.graphics.RectF();
        float f19 = i17;
        float f27 = i18;
        rectF.set(0.0f, 0.0f, f19, f27);
        float f28 = (f19 - (f17 * f19)) / 2.0f;
        rectF.left += f28;
        float f29 = (f27 - (f18 * f27)) / 2.0f;
        rectF.top += f29;
        rectF.right = f19 - f28;
        rectF.bottom = f27 - f29;
        return rectF;
    }

    public final void b(boolean z17) {
        yz5.a aVar;
        if (this.f509195e) {
            return;
        }
        this.f509195e = true;
        ug5.g gVar = this.f509191a;
        android.view.Window window = gVar.f509121b;
        if (window == null) {
            return;
        }
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((gVar.A * 1000.0f) / ((float) gVar.f509135p))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "[complete#" + gVar.f509120a + "] fps=" + format + " refreshRate=" + ug5.x.a(window));
        if (gVar.f509140u != null && gVar.f509141v) {
            java.lang.ref.WeakReference weakReference = gVar.f509127h;
            if (weakReference == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayActivity");
                throw null;
            }
            android.app.Activity activity = (android.app.Activity) weakReference.get();
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
        }
        if (gVar.f509142w) {
            java.lang.ref.WeakReference weakReference2 = gVar.f509126g;
            if (weakReference2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startActivity");
                throw null;
            }
            android.app.Activity activity2 = (android.app.Activity) weakReference2.get();
            if (activity2 != null) {
                activity2.finish();
                activity2.overridePendingTransition(0, 0);
            }
        }
        android.widget.FrameLayout frameLayout = this.f509192b;
        if (frameLayout != null) {
            android.view.ViewPropertyAnimator animate = frameLayout.animate();
            if (animate != null) {
                animate.cancel();
            }
            android.view.Window window2 = gVar.f509121b;
            android.view.View decorView = window2 != null ? window2.getDecorView() : null;
            android.widget.FrameLayout frameLayout2 = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
            if (frameLayout2 != null) {
                frameLayout2.removeView(frameLayout);
            }
            this.f509192b = null;
        }
        android.view.View view = this.f509194d;
        if (view != null) {
            android.view.ViewPropertyAnimator animate2 = view.animate();
            if (animate2 != null) {
                animate2.cancel();
            }
            android.view.Window window3 = gVar.f509122c;
            if (window3 == null) {
                window3 = gVar.f509121b;
            }
            android.view.View decorView2 = window3 != null ? window3.getDecorView() : null;
            android.widget.FrameLayout frameLayout3 = decorView2 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView2 : null;
            if (frameLayout3 != null) {
                frameLayout3.removeView(view);
            }
            this.f509194d = null;
        }
        if (z17 && (aVar = this.f509196f) != null) {
            aVar.mo152xb9724478();
        }
        this.f509196f = null;
        this.f509193c = null;
        ug5.h hVar = gVar.f509125f;
        if (hVar != null) {
            android.content.Context context = window.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            hVar.e(context, z17, this);
        }
        gVar.f509125f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x038f, code lost:
    
        if (r14 != r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0393, code lost:
    
        if (r6.f509140u == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0395, code lost:
    
        r0 = r6.f509126g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0397, code lost:
    
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0399, code lost:
    
        r0 = (android.app.Activity) r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x039f, code lost:
    
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03a1, code lost:
    
        r0 = r0.getWindow().getDecorView();
        r2 = new java.util.ArrayList();
        r12 = zj0.c.f554818a;
        r2.add(8);
        java.util.Collections.reverse(r2);
        yj0.a.d(r0, r2.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformer", "doAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r12 = 0;
        r0.setVisibility(((java.lang.Integer) r2.get(0)).intValue());
        yj0.a.f(r0, "com/tencent/mm/ui/fluent/ViewFluentPerformer", "doAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03f7, code lost:
    
        r0 = new java.util.ArrayList();
        r2 = zj0.c.f554818a;
        r0.add(java.lang.Float.valueOf(r6.f509131l));
        java.util.Collections.reverse(r0);
        r25 = r12;
        yj0.a.d(r7, r0.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformer", "doAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        r7.setAlpha(((java.lang.Float) r0.get(r25)).floatValue());
        yj0.a.f(r7, "com/tencent/mm/ui/fluent/ViewFluentPerformer", "doAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        r6.A = r25;
        r0 = r7.animate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0458, code lost:
    
        if (r0 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x045a, code lost:
    
        r0.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x045d, code lost:
    
        r0 = r7.animate().setInterpolator(r6.f509138s).setDuration(r6.f509135p).alpha(r6.f509132m).setUpdateListener(new ug5.l(r36, r13, r8, r7, r13)).setListener(r6.f509125f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0498, code lost:
    
        if (r14 == r1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x049a, code lost:
    
        r1 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x049f, code lost:
    
        r0 = r0.scaleX(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04a3, code lost:
    
        if (r14 == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04a5, code lost:
    
        r1 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04aa, code lost:
    
        r0 = r0.scaleY(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04ae, code lost:
    
        if (r14 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04b0, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04b3, code lost:
    
        r0 = r0.translationX(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04b7, code lost:
    
        if (r14 == r1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04b9, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04bc, code lost:
    
        r0.translationY(r2).withStartAction(new ug5.n(r36, r5, r20, r3)).withEndAction(new ug5.r(r7, r36, r7, r5, r10)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04bb, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04b2, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04a8, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x049d, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03ef, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startActivity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03f5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03f6, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0332, code lost:
    
        r8 = r8.height() * 1.0f;
        r12 = r12.height() * r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0312, code lost:
    
        r13 = r8.width() * 1.0f;
        r15 = r12.width() * r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e2, code lost:
    
        if (r0 < r13) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c2, code lost:
    
        if (r0 < r13) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c4, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e5, code lost:
    
        if (r14 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e7, code lost:
    
        r7.setAlpha(r12);
        r7.setTranslationX(-r4);
        r7.setTranslationY(-r2);
        r7.setScaleX(r0);
        r7.setScaleY(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02fa, code lost:
    
        r12 = new android.graphics.Rect();
        r7.getHitRect(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0302, code lost:
    
        if (r14 == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0304, code lost:
    
        r13 = r9.width() * 1.0f;
        r15 = r12.width();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0320, code lost:
    
        r13 = r13 / r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0322, code lost:
    
        if (r14 == r1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0324, code lost:
    
        r8 = r9.height() * 1.0f;
        r12 = r12.height();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0340, code lost:
    
        r8 = r8 / r12;
        r12 = a(r36, r7.getWidth(), r7.getHeight(), r13, r8);
        r21 = r0;
        r13 = new android.graphics.Rect(0, 0, r7.getWidth(), r7.getHeight());
        r0 = r6.f509125f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0361, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0363, code lost:
    
        r2 = new android.graphics.Rect();
        r12.roundOut(r2);
        r0.d(0.0f, r2, r13, r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0373, code lost:
    
        if ((r7 instanceof ug5.d) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0375, code lost:
    
        r0 = r6.f509145z;
        ((ug5.d) r7).a(r12, r0[0], r0[1], r0[2], r0[3]);
        r7.invalidate();
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug5.v.c():void");
    }

    public final java.lang.Object d(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return this.f509191a.f509128i.get(key);
    }

    public final void e(ug5.v vVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "onPerformAnimationFail: " + str);
        ug5.h hVar = this.f509191a.f509125f;
        if (hVar != null) {
            hVar.b(vVar);
        }
        vVar.b(false);
    }

    public final void f(java.lang.String key, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f509191a.f509128i.put(key, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.content.Context] */
    public final void g(android.app.Activity activity) {
        android.view.View decorView;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        ug5.g gVar = this.f509191a;
        gVar.getClass();
        gVar.f509126g = weakReference;
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(activity);
        gVar.getClass();
        gVar.f509127h = weakReference2;
        if (activity != 0 && gVar.f509140u == null) {
            h();
            return;
        }
        if (activity == 0) {
            activity = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "startTransparentActivity start");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ug5.h hVar = gVar.f509125f;
        if (hVar != null) {
            hVar.f();
        }
        ug5.u uVar = new ug5.u(activity, this, currentTimeMillis);
        android.view.Window window = gVar.f509121b;
        if (window == null || (decorView = window.getDecorView()) == null) {
            uVar.mo152xb9724478();
        } else {
            decorView.post(new ug5.t(uVar));
        }
    }

    public final void h() {
        android.view.View decorView;
        ug5.g gVar = this.f509191a;
        java.lang.Object obj = gVar.f509128i.get("intent_key_cost");
        java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "[start#" + gVar.f509120a + "] cost=" + (java.lang.System.currentTimeMillis() - (l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis())) + "ms");
        if (gVar.f509136q <= 0) {
            c();
            return;
        }
        android.view.Window window = gVar.f509121b;
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new ug5.s(this), gVar.f509136q);
    }
}
