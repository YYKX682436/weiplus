package uf;

/* loaded from: classes7.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f508566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f508567f;

    public i0(uf.o0 o0Var, boolean z17, boolean z18) {
        this.f508565d = o0Var;
        this.f508566e = z17;
        this.f508567f = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.o0 o0Var = this.f508565d;
        o0Var.f508596f = new uf.c2(o0Var.f508594d, ((uf.o1) o0Var.f508591a).f508608g, false, this.f508566e, o0Var.f508595e, 4, null);
        uf.c2 c2Var = o0Var.f508596f;
        if (c2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var.f508542v = new uf.f0(o0Var);
        if (c2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var.f508544x = new uf.g0(o0Var, this.f508566e);
        uf.c2 c2Var2 = o0Var.f508596f;
        if (c2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var2.f508543w = new uf.h0(o0Var, this.f508567f);
        if (c2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var2.f508536p = c2Var2.d();
        c2Var2.f508537q = c2Var2.c();
        if (c2Var2.f508530g != null) {
            android.view.View view = c2Var2.f508532i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context = c2Var2.f508531h;
            boolean z17 = c2Var2.f508541u;
            if (z17) {
                c2Var2.f508534n = (int) (com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561677pj) * 6.5d);
            }
            layoutParams2.height = c2Var2.f508534n;
            boolean z18 = c2Var2.f508536p;
            android.view.View view2 = c2Var2.f508538r;
            if (z18 && view2 != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                if (z17) {
                    layoutParams2.width = (int) (((rect.right * 1.0f) * 4) / 10);
                    if (com.p314xaae8f345.mm.ui.bl.m(context)) {
                        layoutParams2.height = rect.bottom - com.p314xaae8f345.mm.ui.bl.j(context);
                    } else {
                        layoutParams2.height = rect.bottom;
                    }
                } else {
                    layoutParams2.width = rect.right;
                }
            }
            android.view.View view3 = c2Var2.f508532i;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            view3.setLayoutParams(layoutParams2);
            android.app.Dialog dialog = c2Var2.f508530g;
            if (dialog == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                throw null;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d.f171933e.mo53086xdac2174d() || !c2Var2.f508540t) {
                android.app.Dialog dialog2 = c2Var2.f508530g;
                if (dialog2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    window2.clearFlags(8);
                }
                android.app.Dialog dialog3 = c2Var2.f508530g;
                if (dialog3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window3 = dialog3.getWindow();
                if (window3 != null) {
                    window3.clearFlags(131072);
                }
                android.app.Dialog dialog4 = c2Var2.f508530g;
                if (dialog4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window4 = dialog4.getWindow();
                if (window4 != null) {
                    window4.clearFlags(128);
                }
                android.app.Dialog dialog5 = c2Var2.f508530g;
                if (dialog5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window5 = dialog5.getWindow();
                android.view.View decorView = window5 != null ? window5.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(0);
                }
            } else {
                android.app.Dialog dialog6 = c2Var2.f508530g;
                if (dialog6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window6 = dialog6.getWindow();
                if (window6 != null) {
                    window6.setFlags(8, 8);
                }
                android.app.Dialog dialog7 = c2Var2.f508530g;
                if (dialog7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window7 = dialog7.getWindow();
                if (window7 != null) {
                    window7.addFlags(131200);
                }
                android.app.Dialog dialog8 = c2Var2.f508530g;
                if (dialog8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window8 = dialog8.getWindow();
                android.view.View decorView2 = window8 != null ? window8.getDecorView() : null;
                if (decorView2 != null) {
                    decorView2.setSystemUiVisibility(6);
                }
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = c2Var2.f508535o;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = false;
            }
            if (view2 != null) {
                boolean z19 = c2Var2.f508539s == null;
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                c2Var2.f508539s = viewTreeObserver;
                if (z19) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
                    viewTreeObserver.addOnGlobalLayoutListener(c2Var2);
                }
            }
            if (context instanceof android.app.Activity) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                android.app.Dialog dialog9 = c2Var2.f508530g;
                if (dialog9 != null) {
                    dialog9.show();
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
            }
        }
    }
}
