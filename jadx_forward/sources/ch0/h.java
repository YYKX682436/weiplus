package ch0;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public tg0.c2 f122747a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f122748b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f122749c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f122750d;

    /* renamed from: e, reason: collision with root package name */
    public int f122751e;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f122753g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f122754h;

    /* renamed from: f, reason: collision with root package name */
    public int f122752f = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f122755i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final tg0.b2 f122756j = new ch0.e(this);

    public final void a() {
        tg0.h2 h2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "dummy platform WebView dispose");
        if (!this.f122754h) {
            tg0.c2 c2Var = this.f122747a;
            if (c2Var != null && (h2Var = c2Var.f500586h) != null) {
                ((ch0.h0) h2Var).b("clearSearchResultInFlutter", new org.json.JSONObject());
            }
            tg0.c2 c2Var2 = this.f122747a;
            if ((c2Var2 != null ? c2Var2.f500582d : null) == tg0.g2.f500607f) {
                android.view.View view = this.f122748b;
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = 1;
                    layoutParams.height = 1;
                    view.setLayoutParams(layoutParams);
                }
                android.view.View view2 = this.f122748b;
                android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
                android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
                android.view.View view3 = this.f122750d;
                if (view3 == null) {
                    android.widget.FrameLayout frameLayout2 = this.f122749c;
                    if (frameLayout2 != null) {
                        int childCount = frameLayout2.getChildCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            android.view.View childAt = frameLayout2.getChildAt(i17);
                            if (childAt instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) {
                                this.f122750d = childAt;
                                break;
                            }
                            i17++;
                        }
                    }
                    view3 = this.f122750d;
                }
                if (view3 != null && frameLayout != null) {
                    frameLayout.bringChildToFront(view3);
                }
            }
            tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
            if (l1Var != null) {
                tg0.c2 c2Var3 = this.f122747a;
                ((yg0.o3) l1Var).hj(c2Var3 != null ? c2Var3.f500589k : 0, false, c2Var3 != null ? c2Var3.f500583e : null, c2Var3 != null ? c2Var3.f500587i : null);
            }
        }
        android.animation.ValueAnimator valueAnimator = this.f122753g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f122753g = null;
        this.f122747a = null;
        this.f122748b = null;
        this.f122750d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] b() {
        tg0.s2 s2Var;
        android.graphics.Bitmap bitmap;
        tg0.c2 c2Var = this.f122747a;
        if (c2Var != null && (s2Var = c2Var.f500584f) != null) {
            ch0.p0 p0Var = (ch0.p0) s2Var;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                bitmap = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p0Var.f122784a.m120139x12501425());
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                bitmap = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            r2 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(bitmap) ? null : bitmap;
        }
        try {
            if (r2 == null) {
                return new byte[0];
            }
            int allocationByteCount = r2.getAllocationByteCount();
            byte[] bArr = new byte[allocationByteCount];
            r2.copyPixelsToBuffer(java.nio.ByteBuffer.wrap(bArr));
            java.lang.String content = "dummy platform WebView, getWebViewPixels, size: " + allocationByteCount + ", width: " + r2.getWidth() + ", height: " + r2.getHeight();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        ch0.f fVar = new ch0.f(this, z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            fVar.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(fVar));
    }

    public final void d(tg0.c1 c1Var) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        tg0.c2 c2Var2;
        tg0.h2 h2Var2;
        tg0.h2 h2Var3;
        tg0.h2 h2Var4;
        tg0.c2 c2Var3;
        if (c1Var != null && (c2Var3 = this.f122747a) != null) {
            c2Var3.f500588j = c1Var;
        }
        if (!this.f122755i.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "notify h5 result, js not ready, replace result, quit");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify h5 result, has call ui init: ");
        tg0.c2 c2Var4 = this.f122747a;
        sb6.append((c2Var4 == null || (h2Var4 = c2Var4.f500586h) == null) ? null : java.lang.Boolean.valueOf(((ch0.h0) h2Var4).f122757a.f448930f));
        java.lang.String content = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        tg0.c2 c2Var5 = this.f122747a;
        boolean z17 = false;
        if (c2Var5 != null && (h2Var3 = c2Var5.f500586h) != null && ((ch0.h0) h2Var3).f122757a.f448930f) {
            z17 = true;
        }
        if (z17) {
            if (c1Var == null || (c2Var2 = this.f122747a) == null || (h2Var2 = c2Var2.f500586h) == null) {
                return;
            }
            tg0.f2 f2Var = tg0.g2.f500606e;
            ((ch0.h0) h2Var2).a(1, c1Var);
            return;
        }
        if (c1Var == null || (c2Var = this.f122747a) == null || (h2Var = c2Var.f500586h) == null) {
            return;
        }
        tg0.f2 f2Var2 = tg0.g2.f500606e;
        ((ch0.h0) h2Var).c(1, c1Var);
    }

    public final void e(int i17) {
        tg0.c1 c1Var;
        tg0.c1 c1Var2;
        tg0.c1 c1Var3;
        tg0.c1 c1Var4;
        tg0.c1 c1Var5;
        int i18;
        if (this.f122751e == i17 || this.f122748b == null) {
            return;
        }
        java.lang.String content = "h5 size changed, new height: " + i17 + ", old height: " + this.f122751e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        this.f122751e = i17;
        android.widget.FrameLayout frameLayout = this.f122749c;
        android.view.View view = this.f122748b;
        int i19 = 0;
        java.lang.String str = null;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, i17);
            }
            int i27 = this.f122752f;
            layoutParams2.width = -1;
            layoutParams2.height = i17;
            if (frameLayout != null) {
                this.f122752f = frameLayout.getHeight() - i17;
            }
            layoutParams2.topMargin = this.f122752f;
            view.setLayoutParams(layoutParams2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewSizeForPage", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewSizeForPage", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            int childCount = frameLayout != null ? frameLayout.getChildCount() : 0;
            if (childCount > 0) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout != null ? frameLayout.getChildAt(childCount - 1) : null, view)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "setWebViewSizeForPage: top child is not webview");
                    if (frameLayout != null) {
                        frameLayout.bringChildToFront(view);
                    }
                }
            }
            if (i27 >= 0 && i27 != (i18 = this.f122752f)) {
                float f17 = i27 - i18;
                if (this.f122748b != null) {
                    android.animation.ValueAnimator valueAnimator = this.f122753g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
                    ofFloat.setDuration(100L);
                    ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
                    ofFloat.addUpdateListener(new ch0.b(this));
                    this.f122753g = ofFloat;
                    ofFloat.start();
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        tg0.c2 c2Var = this.f122747a;
        int i28 = (c2Var == null || (c1Var5 = c2Var.f500588j) == null) ? 0 : c1Var5.f500574m;
        java.lang.String str2 = (c2Var == null || (c1Var4 = c2Var.f500588j) == null) ? null : c1Var4.f500564c;
        java.lang.String str3 = (c2Var == null || (c1Var3 = c2Var.f500588j) == null) ? null : c1Var3.f500569h;
        if (c2Var != null && (c1Var2 = c2Var.f500588j) != null) {
            str = c1Var2.f500565d;
        }
        java.lang.String str4 = str;
        if (c2Var != null && (c1Var = c2Var.f500588j) != null) {
            i19 = c1Var.f500567f;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ch0.g(i28, str2, str3, str4, i19, currentTimeMillis, null), 2, null);
    }

    public final void f() {
        tg0.c1 c1Var;
        tg0.h2 h2Var;
        tg0.c1 c1Var2;
        boolean z17 = false;
        this.f122755i.compareAndSet(false, true);
        tg0.c2 c2Var = this.f122747a;
        if ((c2Var == null || (c1Var2 = c2Var.f500588j) == null || c1Var2.f500562a != 1) ? false : true) {
            g(8);
        } else {
            g(0);
        }
        tg0.c2 c2Var2 = this.f122747a;
        if (!(c2Var2 != null && c2Var2.f500580b)) {
            if (c2Var2 != null && c2Var2.f500581c) {
                z17 = true;
            }
            if (z17) {
                d(c2Var2 != null ? c2Var2.f500588j : null);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "JS ready, do nothing");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "JS ready, will call onUiInit");
        tg0.c2 c2Var3 = this.f122747a;
        if (c2Var3 == null || (c1Var = c2Var3.f500588j) == null || c2Var3 == null || (h2Var = c2Var3.f500586h) == null) {
            return;
        }
        tg0.f2 f2Var = tg0.g2.f500606e;
        ((ch0.h0) h2Var).c(1, c1Var);
    }

    public final void g(int i17) {
        jz5.f0 f0Var;
        tg0.h2 h2Var;
        android.view.View view = this.f122748b;
        if (view == null || view.getVisibility() == i17) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/webview/platformwebsearch/DummyPlatformSearchWebView", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String content = "setWebViewVisibility, visible: " + i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("visible", java.lang.Integer.valueOf(i17 == 0 ? 1 : 0));
            tg0.c2 c2Var = this.f122747a;
            if (c2Var == null || (h2Var = c2Var.f500586h) == null) {
                f0Var = null;
            } else {
                ((ch0.h0) h2Var).b("onWebViewVisibilityChangedInFlutter", jSONObject);
                f0Var = jz5.f0.f384359a;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
