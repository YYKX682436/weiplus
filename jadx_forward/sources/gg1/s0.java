package gg1;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f353159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f353160f;

    public s0(gg1.c1 c1Var, boolean z17, boolean z18) {
        this.f353158d = c1Var;
        this.f353159e = z17;
        this.f353160f = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.c1 c1Var = this.f353158d;
        android.content.Context mo50272x76847179 = c1Var.f353068a.mo50272x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50272x76847179, "getContext(...)");
        gg1.w wVar = new gg1.w(mo50272x76847179, false, c1Var.f353070c, c1Var.f353072e, this.f353159e, 2, null);
        c1Var.f353073f = wVar;
        wVar.f353184x = new gg1.o0(c1Var);
        wVar.f353183w = new gg1.p0(this.f353159e, c1Var);
        wVar.f353182v = new gg1.r0(c1Var, this.f353160f);
        wVar.f353176p = wVar.c();
        wVar.f353177q = wVar.b();
        if (wVar.f353170g != null) {
            android.view.View view = wVar.f353172i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context = wVar.f353171h;
            boolean z17 = wVar.f353181u;
            if (z17) {
                wVar.f353174n = (int) (com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561677pj) * 6.5d);
            }
            layoutParams2.height = wVar.f353174n;
            boolean z18 = wVar.f353176p;
            android.view.View view2 = wVar.f353178r;
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
            android.view.View view3 = wVar.f353172i;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            view3.setLayoutParams(layoutParams2);
            android.app.Dialog dialog = wVar.f353170g;
            if (dialog == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                throw null;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d.f171933e.mo53086xdac2174d() || !wVar.f353180t) {
                android.app.Dialog dialog2 = wVar.f353170g;
                if (dialog2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    window2.clearFlags(8);
                }
                android.app.Dialog dialog3 = wVar.f353170g;
                if (dialog3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window3 = dialog3.getWindow();
                if (window3 != null) {
                    window3.clearFlags(131072);
                }
                android.app.Dialog dialog4 = wVar.f353170g;
                if (dialog4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window4 = dialog4.getWindow();
                if (window4 != null) {
                    window4.clearFlags(128);
                }
                android.app.Dialog dialog5 = wVar.f353170g;
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
                android.app.Dialog dialog6 = wVar.f353170g;
                if (dialog6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window6 = dialog6.getWindow();
                if (window6 != null) {
                    window6.setFlags(8, 8);
                }
                android.app.Dialog dialog7 = wVar.f353170g;
                if (dialog7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window7 = dialog7.getWindow();
                if (window7 != null) {
                    window7.addFlags(131200);
                }
                android.app.Dialog dialog8 = wVar.f353170g;
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
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = wVar.f353175o;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = false;
            }
            if (view2 != null) {
                boolean z19 = wVar.f353179s == null;
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                wVar.f353179s = viewTreeObserver;
                if (z19) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
                    viewTreeObserver.addOnGlobalLayoutListener(wVar);
                }
            }
            if (context instanceof android.app.Activity) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                android.app.Dialog dialog9 = wVar.f353170g;
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
