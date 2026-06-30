package ch0;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public tg0.c2 f41214a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f41215b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f41216c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f41217d;

    /* renamed from: e, reason: collision with root package name */
    public int f41218e;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f41220g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41221h;

    /* renamed from: f, reason: collision with root package name */
    public int f41219f = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f41222i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final tg0.b2 f41223j = new ch0.e(this);

    public final void a() {
        tg0.h2 h2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "dummy platform WebView dispose");
        if (!this.f41221h) {
            tg0.c2 c2Var = this.f41214a;
            if (c2Var != null && (h2Var = c2Var.f419053h) != null) {
                ((ch0.h0) h2Var).b("clearSearchResultInFlutter", new org.json.JSONObject());
            }
            tg0.c2 c2Var2 = this.f41214a;
            if ((c2Var2 != null ? c2Var2.f419049d : null) == tg0.g2.f419074f) {
                android.view.View view = this.f41215b;
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = 1;
                    layoutParams.height = 1;
                    view.setLayoutParams(layoutParams);
                }
                android.view.View view2 = this.f41215b;
                android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
                android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
                android.view.View view3 = this.f41217d;
                if (view3 == null) {
                    android.widget.FrameLayout frameLayout2 = this.f41216c;
                    if (frameLayout2 != null) {
                        int childCount = frameLayout2.getChildCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            android.view.View childAt = frameLayout2.getChildAt(i17);
                            if (childAt instanceof io.flutter.embedding.android.FlutterView) {
                                this.f41217d = childAt;
                                break;
                            }
                            i17++;
                        }
                    }
                    view3 = this.f41217d;
                }
                if (view3 != null && frameLayout != null) {
                    frameLayout.bringChildToFront(view3);
                }
            }
            tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
            if (l1Var != null) {
                tg0.c2 c2Var3 = this.f41214a;
                ((yg0.o3) l1Var).hj(c2Var3 != null ? c2Var3.f419056k : 0, false, c2Var3 != null ? c2Var3.f419050e : null, c2Var3 != null ? c2Var3.f419054i : null);
            }
        }
        android.animation.ValueAnimator valueAnimator = this.f41220g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f41220g = null;
        this.f41214a = null;
        this.f41215b = null;
        this.f41217d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] b() {
        tg0.s2 s2Var;
        android.graphics.Bitmap bitmap;
        tg0.c2 c2Var = this.f41214a;
        if (c2Var != null && (s2Var = c2Var.f419051f) != null) {
            ch0.p0 p0Var = (ch0.p0) s2Var;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                bitmap = kotlin.Result.m521constructorimpl(p0Var.f41251a.getBitmap());
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                bitmap = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            r2 = kotlin.Result.m527isFailureimpl(bitmap) ? null : bitmap;
        }
        try {
            if (r2 == null) {
                return new byte[0];
            }
            int allocationByteCount = r2.getAllocationByteCount();
            byte[] bArr = new byte[allocationByteCount];
            r2.copyPixelsToBuffer(java.nio.ByteBuffer.wrap(bArr));
            java.lang.String content = "dummy platform WebView, getWebViewPixels, size: " + allocationByteCount + ", width: " + r2.getWidth() + ", height: " + r2.getHeight();
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
            r2.recycle();
            return bArr;
        } catch (java.lang.Throwable th7) {
            if (r2 != null) {
                r2.recycle();
            }
            throw th7;
        }
    }

    public final void c(boolean z17) {
        java.lang.String content = "H5Page focus changed: " + z17;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        ch0.f fVar = new ch0.f(this, z17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            fVar.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(fVar));
    }

    public final void d(tg0.c1 c1Var) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        tg0.c2 c2Var2;
        tg0.h2 h2Var2;
        tg0.h2 h2Var3;
        tg0.h2 h2Var4;
        tg0.c2 c2Var3;
        if (c1Var != null && (c2Var3 = this.f41214a) != null) {
            c2Var3.f419055j = c1Var;
        }
        if (!this.f41222i.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "notify h5 result, js not ready, replace result, quit");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify h5 result, has call ui init: ");
        tg0.c2 c2Var4 = this.f41214a;
        sb6.append((c2Var4 == null || (h2Var4 = c2Var4.f419053h) == null) ? null : java.lang.Boolean.valueOf(((ch0.h0) h2Var4).f41224a.f367397f));
        java.lang.String content = sb6.toString();
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        tg0.c2 c2Var5 = this.f41214a;
        boolean z17 = false;
        if (c2Var5 != null && (h2Var3 = c2Var5.f419053h) != null && ((ch0.h0) h2Var3).f41224a.f367397f) {
            z17 = true;
        }
        if (z17) {
            if (c1Var == null || (c2Var2 = this.f41214a) == null || (h2Var2 = c2Var2.f419053h) == null) {
                return;
            }
            tg0.f2 f2Var = tg0.g2.f419073e;
            ((ch0.h0) h2Var2).a(1, c1Var);
            return;
        }
        if (c1Var == null || (c2Var = this.f41214a) == null || (h2Var = c2Var.f419053h) == null) {
            return;
        }
        tg0.f2 f2Var2 = tg0.g2.f419073e;
        ((ch0.h0) h2Var).c(1, c1Var);
    }

    public final void e(int i17) {
        tg0.c1 c1Var;
        tg0.c1 c1Var2;
        tg0.c1 c1Var3;
        tg0.c1 c1Var4;
        tg0.c1 c1Var5;
        int i18;
        if (this.f41218e == i17 || this.f41215b == null) {
            return;
        }
        java.lang.String content = "h5 size changed, new height: " + i17 + ", old height: " + this.f41218e;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        this.f41218e = i17;
        android.widget.FrameLayout frameLayout = this.f41216c;
        android.view.View view = this.f41215b;
        int i19 = 0;
        java.lang.String str = null;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, i17);
            }
            int i27 = this.f41219f;
            layoutParams2.width = -1;
            layoutParams2.height = i17;
            if (frameLayout != null) {
                this.f41219f = frameLayout.getHeight() - i17;
            }
            layoutParams2.topMargin = this.f41219f;
            view.setLayoutParams(layoutParams2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewSizeForPage", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewSizeForPage", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            int childCount = frameLayout != null ? frameLayout.getChildCount() : 0;
            if (childCount > 0) {
                if (!kotlin.jvm.internal.o.b(frameLayout != null ? frameLayout.getChildAt(childCount - 1) : null, view)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "setWebViewSizeForPage: top child is not webview");
                    if (frameLayout != null) {
                        frameLayout.bringChildToFront(view);
                    }
                }
            }
            if (i27 >= 0 && i27 != (i18 = this.f41219f)) {
                float f17 = i27 - i18;
                if (this.f41215b != null) {
                    android.animation.ValueAnimator valueAnimator = this.f41220g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
                    ofFloat.setDuration(100L);
                    ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
                    ofFloat.addUpdateListener(new ch0.b(this));
                    this.f41220g = ofFloat;
                    ofFloat.start();
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        tg0.c2 c2Var = this.f41214a;
        int i28 = (c2Var == null || (c1Var5 = c2Var.f419055j) == null) ? 0 : c1Var5.f419041m;
        java.lang.String str2 = (c2Var == null || (c1Var4 = c2Var.f419055j) == null) ? null : c1Var4.f419031c;
        java.lang.String str3 = (c2Var == null || (c1Var3 = c2Var.f419055j) == null) ? null : c1Var3.f419036h;
        if (c2Var != null && (c1Var2 = c2Var.f419055j) != null) {
            str = c1Var2.f419032d;
        }
        java.lang.String str4 = str;
        if (c2Var != null && (c1Var = c2Var.f419055j) != null) {
            i19 = c1Var.f419034f;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new ch0.g(i28, str2, str3, str4, i19, currentTimeMillis, null), 2, null);
    }

    public final void f() {
        tg0.c1 c1Var;
        tg0.h2 h2Var;
        tg0.c1 c1Var2;
        boolean z17 = false;
        this.f41222i.compareAndSet(false, true);
        tg0.c2 c2Var = this.f41214a;
        if ((c2Var == null || (c1Var2 = c2Var.f419055j) == null || c1Var2.f419029a != 1) ? false : true) {
            g(8);
        } else {
            g(0);
        }
        tg0.c2 c2Var2 = this.f41214a;
        if (!(c2Var2 != null && c2Var2.f419047b)) {
            if (c2Var2 != null && c2Var2.f419048c) {
                z17 = true;
            }
            if (z17) {
                d(c2Var2 != null ? c2Var2.f419055j : null);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "JS ready, do nothing");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "JS ready, will call onUiInit");
        tg0.c2 c2Var3 = this.f41214a;
        if (c2Var3 == null || (c1Var = c2Var3.f419055j) == null || c2Var3 == null || (h2Var = c2Var3.f419053h) == null) {
            return;
        }
        tg0.f2 f2Var = tg0.g2.f419073e;
        ((ch0.h0) h2Var).c(1, c1Var);
    }

    public final void g(int i17) {
        jz5.f0 f0Var;
        tg0.h2 h2Var;
        android.view.View view = this.f41215b;
        if (view == null || view.getVisibility() == i17) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String content = "setWebViewVisibility, visible: " + i17;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("visible", java.lang.Integer.valueOf(i17 == 0 ? 1 : 0));
            tg0.c2 c2Var = this.f41214a;
            if (c2Var == null || (h2Var = c2Var.f419053h) == null) {
                f0Var = null;
            } else {
                ((ch0.h0) h2Var).b("onWebViewVisibilityChangedInFlutter", jSONObject);
                f0Var = jz5.f0.f302826a;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
