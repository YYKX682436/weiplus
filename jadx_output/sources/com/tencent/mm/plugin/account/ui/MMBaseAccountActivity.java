package com.tencent.mm.plugin.account.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/MMBaseAccountActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/ui/tools/c5;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class MMBaseAccountActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ScrollView f73433d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f73434e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f73435f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f73436g;

    /* renamed from: h, reason: collision with root package name */
    public int f73437h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f73438i;

    public static final void U6(com.tencent.mm.plugin.account.ui.MMBaseAccountActivity mMBaseAccountActivity) {
        android.view.View currentFocus = mMBaseAccountActivity.getWindow().getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            int height = iArr[1] + currentFocus.getHeight() + com.tencent.mm.ui.kk.a(currentFocus);
            android.view.ViewParent parent = currentFocus.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.getLocationInWindow(iArr);
                height = iArr[1] + viewGroup.getHeight();
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            mMBaseAccountActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i17 = height - rect.bottom;
            int i18 = -i65.a.b(mMBaseAccountActivity.getContext(), 56);
            if (i17 > i18) {
                android.widget.ScrollView scrollView = mMBaseAccountActivity.f73433d;
                if (scrollView == null) {
                    kotlin.jvm.internal.o.o("scrollView");
                    throw null;
                }
                int scrollY = (i17 + scrollView.getScrollY()) - i18;
                android.widget.ScrollView scrollView2 = mMBaseAccountActivity.f73433d;
                if (scrollView2 != null) {
                    scrollView2.post(new com.tencent.mm.plugin.account.ui.a8(scrollY, mMBaseAccountActivity));
                } else {
                    kotlin.jvm.internal.o.o("scrollView");
                    throw null;
                }
            }
        }
    }

    public android.view.View V6() {
        return null;
    }

    public int W6() {
        return 0;
    }

    public void X6() {
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(getContainerActivity());
        this.f73438i = f5Var;
        f5Var.f210400e = this;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mcm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f73433d = (android.widget.ScrollView) findViewById;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485833uf0);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skn);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f73434e = (android.widget.LinearLayout) findViewById2;
        int W6 = W6();
        if (W6 != 0) {
            android.view.LayoutInflater.from(this).inflate(W6, (android.view.ViewGroup) linearLayout, true);
        }
        android.view.View V6 = V6();
        if (V6 != null) {
            android.widget.LinearLayout linearLayout2 = this.f73434e;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("bottomContainer");
                throw null;
            }
            linearLayout2.addView(V6);
        }
        if (com.tencent.mm.ui.bk.A()) {
            com.tencent.mm.MMMaxWidthLinearLayout mMMaxWidthLinearLayout = (com.tencent.mm.MMMaxWidthLinearLayout) findViewById(com.tencent.mm.R.id.hdq);
            double d17 = getResources().getDisplayMetrics().heightPixels;
            mMMaxWidthLinearLayout.setPadding(mMMaxWidthLinearLayout.getPaddingLeft(), (int) (0.1d * d17), mMMaxWidthLinearLayout.getPaddingRight(), (int) (d17 * 0.15d));
            mMMaxWidthLinearLayout.setMaxWidthDp(getContext().getResources().getDimension(com.tencent.mm.R.dimen.an7));
        }
        if (fp.h.c(30)) {
            android.widget.LinearLayout linearLayout3 = this.f73434e;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("bottomContainer");
                throw null;
            }
            linearLayout3.setWindowInsetsAnimationCallback(new com.tencent.mm.plugin.account.ui.h8(linearLayout3, new com.tencent.mm.plugin.account.ui.b8(this)));
            kotlin.jvm.internal.o.d(linearLayout);
            linearLayout.setWindowInsetsAnimationCallback(new com.tencent.mm.plugin.account.ui.h8(linearLayout, com.tencent.mm.plugin.account.ui.c8.f73770d));
        }
    }

    public final void Y6(android.view.View view, int i17, int i18, yz5.a aVar) {
        android.animation.ValueAnimator valueAnimator = this.f73435f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
            ofInt.setDuration(175L);
            ofInt.addUpdateListener(new com.tencent.mm.plugin.account.ui.f8(layoutParams, view));
            ofInt.start();
            ofInt.addListener(new com.tencent.mm.plugin.account.ui.g8(aVar));
            this.f73435f = ofInt;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ejw;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        hideActionbarLine();
        X6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f73438i;
        if (f5Var != null) {
            f5Var.d();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.tools.f5 f5Var = this.f73438i;
        if (f5Var != null) {
            f5Var.f();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.f73438i;
        if (f5Var != null) {
            f5Var.f();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        boolean z18 = i17 > 0;
        if (!z18 && this.f73436g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSheetActivity", "keyboard hide");
            this.f73436g = false;
            if (fp.h.c(30)) {
                android.widget.LinearLayout linearLayout = this.f73434e;
                if (linearLayout != null) {
                    linearLayout.setPadding(0, 0, 0, 0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("bottomContainer");
                    throw null;
                }
            }
            android.widget.ScrollView scrollView = this.f73433d;
            if (scrollView == null) {
                kotlin.jvm.internal.o.o("scrollView");
                throw null;
            }
            int height = scrollView.getHeight();
            android.widget.ScrollView scrollView2 = this.f73433d;
            if (scrollView2 != null) {
                Y6(scrollView, height, scrollView2.getHeight() + this.f73437h, new com.tencent.mm.plugin.account.ui.d8(this));
                return;
            } else {
                kotlin.jvm.internal.o.o("scrollView");
                throw null;
            }
        }
        if (!z18 || this.f73436g) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSheetActivity", "keyboard show");
        this.f73436g = true;
        this.f73437h = i17;
        if (fp.h.c(30)) {
            android.widget.LinearLayout linearLayout2 = this.f73434e;
            if (linearLayout2 != null) {
                linearLayout2.setPadding(0, 0, 0, this.f73437h);
                return;
            } else {
                kotlin.jvm.internal.o.o("bottomContainer");
                throw null;
            }
        }
        android.widget.ScrollView scrollView3 = this.f73433d;
        if (scrollView3 == null) {
            kotlin.jvm.internal.o.o("scrollView");
            throw null;
        }
        int height2 = scrollView3.getHeight();
        android.widget.ScrollView scrollView4 = this.f73433d;
        if (scrollView4 != null) {
            Y6(scrollView3, height2, scrollView4.getHeight() - this.f73437h, new com.tencent.mm.plugin.account.ui.e8(this));
        } else {
            kotlin.jvm.internal.o.o("scrollView");
            throw null;
        }
    }
}
