package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes5.dex */
public class f7 extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f268756f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f268757g;

    public f7(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        this.f268756f = context;
        C(1);
    }

    public final void D() {
        android.content.Context context = this.f268756f;
        int c17 = (!com.p314xaae8f345.mm.ui.bl.f(context) || android.os.Build.VERSION.SDK_INT >= 30) ? 0 : com.p314xaae8f345.mm.ui.bl.c(context);
        if (!(context.getResources().getConfiguration().orientation == 2)) {
            android.widget.FrameLayout frameLayout = this.f268757g;
            if (frameLayout != null) {
                p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) frameLayout.getLayoutParams();
                cVar.setMargins(0, 0, 0, c17);
                this.f268757g.setLayoutParams(cVar);
                return;
            }
            return;
        }
        android.widget.FrameLayout frameLayout2 = this.f268757g;
        if (frameLayout2 != null) {
            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar2 = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) frameLayout2.getLayoutParams();
            if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 1) {
                cVar2.setMargins(0, 0, c17, 0);
            } else if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 3) {
                cVar2.setMargins(c17, 0, 0, 0);
            }
            this.f268757g.setLayoutParams(cVar2);
        }
    }

    public final android.view.View E(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.Window window = getWindow();
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576214z7);
        boolean z17 = false;
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        android.content.Context context = this.f268756f;
        if (context.getResources().getConfiguration().orientation == 2) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ei7, (android.view.ViewGroup) null);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ohv);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, viewGroup, false);
        }
        this.f268757g = (android.widget.FrameLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f569231vp0);
        D();
        this.f268757g.setVisibility(0);
        if (layoutParams == null) {
            this.f268757g.addView(view);
        } else {
            this.f268757g.addView(view, layoutParams);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(android.R.attr.windowCloseOnTouchOutside, typedValue, true) && typedValue.data != 0) {
            z17 = true;
        }
        if (z17) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e7(this));
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
        getWindow().setLayout(-1, -1);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(E(0, view, null));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(E(0, view, layoutParams));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(E(i17, null, null));
    }
}
