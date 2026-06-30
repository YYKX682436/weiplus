package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class w2 extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final int f214812d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f214813e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576303z8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214812d = i17;
        this.f214814f = true;
    }

    public final void b(boolean z17) {
        jz5.f0 f0Var;
        if (this.f214814f == z17) {
            return;
        }
        this.f214814f = z17;
        if (isShowing()) {
            if (z17) {
                if (!c()) {
                    e(false);
                    return;
                }
                android.view.Window window = getWindow();
                if (window != null) {
                    window.addFlags(4);
                }
                e(true);
                return;
            }
            if (this.f214813e && android.os.Build.VERSION.SDK_INT >= 31) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    android.view.Window window2 = getWindow();
                    if (window2 != null) {
                        window2.setBackgroundBlurRadius(0);
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                this.f214813e = false;
            }
            android.view.Window window3 = getWindow();
            if (window3 != null) {
                window3.clearFlags(4);
            }
            android.view.Window window4 = getWindow();
            if (window4 != null) {
                window4.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d0u);
            }
        }
    }

    public final boolean c() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209307jd).mo141623x754a37bb()).r()).booleanValue()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBlurToast", "supportBlur=false by FinderConfig.FINDER_BLUR_TOAST_ENABLE");
        return false;
    }

    public final void e(boolean z17) {
        jz5.f0 f0Var;
        android.view.View decorView;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        android.view.Window window = getWindow();
        boolean z18 = (window == null || (decorView = window.getDecorView()) == null || !decorView.isHardwareAccelerated()) ? false : true;
        boolean z19 = z17 && z18 && android.os.Build.VERSION.SDK_INT >= 31 && this.f214814f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBlurToast", "updateWindowForBlurs blursEnabled=" + z17 + " hwAccelerated=" + z18 + " userEnabled=" + this.f214814f + " canBlur=" + z19);
        if (z19) {
            try {
                android.view.Window window2 = getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d0u);
                }
                android.view.Window window3 = getWindow();
                if (window3 != null) {
                    window3.setBackgroundBlurRadius(getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561257dg));
                }
                this.f214813e = true;
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderBlurToast", "setBackgroundBlurRadius fail, fallback. err=" + th6.getMessage());
                this.f214813e = false;
                android.view.Window window4 = getWindow();
                if (window4 != null) {
                    window4.clearFlags(4);
                }
                android.view.Window window5 = getWindow();
                if (window5 != null) {
                    window5.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d0v);
                    return;
                }
                return;
            }
        }
        if (this.f214813e && android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                android.view.Window window6 = getWindow();
                if (window6 != null) {
                    window6.setBackgroundBlurRadius(0);
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            this.f214813e = false;
        }
        android.view.Window window7 = getWindow();
        if (window7 != null) {
            window7.clearFlags(4);
        }
        if (this.f214814f) {
            android.view.Window window8 = getWindow();
            if (window8 != null) {
                window8.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d0v);
                return;
            }
            return;
        }
        android.view.Window window9 = getWindow();
        if (window9 != null) {
            window9.setBackgroundDrawable(null);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.View decorView;
        android.view.WindowManager.LayoutParams attributes;
        requestWindowFeature(1);
        android.view.Window window = getWindow();
        android.view.WindowManager.LayoutParams attributes2 = window != null ? window.getAttributes() : null;
        if (attributes2 != null) {
            attributes2.gravity = 48;
        }
        int i17 = com.p314xaae8f345.mm.ui.bl.i(getContext(), 0);
        android.view.Window window2 = getWindow();
        android.view.WindowManager.LayoutParams attributes3 = window2 != null ? window2.getAttributes() : null;
        if (attributes3 != null) {
            attributes3.y = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561191bv) - i17;
        }
        android.view.Window window3 = getWindow();
        android.view.WindowManager.LayoutParams attributes4 = window3 != null ? window3.getAttributes() : null;
        if (attributes4 != null) {
            android.view.Window window4 = getWindow();
            attributes4.flags = ((window4 == null || (attributes = window4.getAttributes()) == null) ? 0 : attributes.flags) | 8 | 16;
        }
        android.view.Window window5 = getWindow();
        if (window5 != null) {
            window5.clearFlags(2);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null) {
            window6.addFlags(67108864);
        }
        if (c()) {
            android.view.Window window7 = getWindow();
            if (window7 != null) {
                window7.addFlags(4);
            }
            android.view.Window window8 = getWindow();
            if (window8 != null) {
                window8.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d0v);
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v2 v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v2(this);
                android.view.Window window9 = getWindow();
                if (window9 != null && (decorView = window9.getDecorView()) != null) {
                    decorView.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.u2(this, v2Var));
                }
            }
        } else {
            e(false);
        }
        super.onCreate(bundle);
        setContentView(this.f214812d);
        setTitle((java.lang.CharSequence) null);
    }
}
