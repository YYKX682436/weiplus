package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes5.dex */
public class a4 extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f293276f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f293277g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f293278h;

    public a4(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.ui.b4.c(context) ? com.p314xaae8f345.mm.R.C30868x68b1db1.f575677yk : com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        this.f293278h = true;
        this.f293276f = context;
        C(1);
    }

    public final void D() {
        if (this.f293277g == null || E()) {
            return;
        }
        android.content.Context context = this.f293276f;
        int c17 = (!com.p314xaae8f345.mm.ui.bl.f(context) || android.os.Build.VERSION.SDK_INT >= 30) ? 0 : com.p314xaae8f345.mm.ui.bl.c(context);
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) this.f293277g.getLayoutParams();
        cVar.setMargins(0, 0, 0, c17);
        this.f293277g.setLayoutParams(cVar);
    }

    public final boolean E() {
        return this.f293276f.getResources().getConfiguration().orientation == 2;
    }

    public final android.view.View F(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.Window window = getWindow();
        if (E()) {
            window.setGravity(1);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        boolean z17 = false;
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        if (E()) {
            attributes.width = -2;
            attributes.height = -2;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.f293276f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c7o, (android.view.ViewGroup) null);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ohv);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, viewGroup, false);
        }
        if (E()) {
            this.f293277g = (android.widget.FrameLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jhd);
        } else {
            this.f293277g = (android.widget.FrameLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jhc);
            D();
        }
        this.f293277g.setVisibility(0);
        if (layoutParams == null) {
            this.f293277g.addView(view);
        } else {
            this.f293277g.addView(view, layoutParams);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(android.R.attr.windowCloseOnTouchOutside, typedValue, true)) {
            z17 = typedValue.data != 0;
        }
        if (z17) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z3(this));
        }
        return viewGroup;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            if (!com.p314xaae8f345.mm.ui.b4.c(this.f293276f)) {
                window.setLayout(-1, -1);
                return;
            }
            window.setLayout(-1, -1);
            try {
                window.getDecorView();
                n3.h2.a(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                int i17 = android.os.Build.VERSION.SDK_INT;
                if (i17 >= 28) {
                    int i18 = i17 >= 30 ? 3 : 1;
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes.layoutInDisplayCutoutMode != i18) {
                        attributes.layoutInDisplayCutoutMode = i18;
                        window.setAttributes(attributes);
                    }
                }
                if (i17 >= 29) {
                    window.setStatusBarContrastEnforced(false);
                    window.setNavigationBarContrastEnforced(false);
                }
            } catch (java.lang.RuntimeException e17) {
                e17.toString();
            }
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.clearFlags(134217728);
            window.setStatusBarColor(0);
            n3.m3 m3Var = new n3.m3(window, window.getDecorView());
            m3Var.c(true);
            m3Var.b(true);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(F(0, view, null));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(F(0, view, layoutParams));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(F(i17, null, null));
    }

    public a4(android.content.Context context, int i17) {
        super(context, i17 == 0 ? com.p314xaae8f345.mm.ui.b4.c(context) ? com.p314xaae8f345.mm.R.C30868x68b1db1.f575677yk : com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd : i17);
        this.f293278h = true;
        this.f293276f = context;
        C(1);
    }
}
