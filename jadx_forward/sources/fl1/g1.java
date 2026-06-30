package fl1;

/* loaded from: classes7.dex */
public class g1 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 implements fl1.b2, fl1.a2 {

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnShowListener f345300f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f345301g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f345302h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345303i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f345304m;

    /* renamed from: n, reason: collision with root package name */
    public fl1.g2 f345305n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f345306o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f345307p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f f345308q;

    public g1(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.f345304m = true;
        try {
            onCreate(null);
        } catch (java.lang.Exception unused) {
        }
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_t);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // fl1.b2
    public boolean d() {
        return this.f345303i;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f345305n;
        if (g2Var != null) {
            g2Var.a(this);
            android.content.DialogInterface.OnDismissListener onDismissListener = this.f345301g;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f345306o;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return 1;
    }

    @Override // fl1.b2
    public boolean j() {
        return this.f345304m;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f345302h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4, android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        this.f345304m = z17;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z17) {
        super.setCanceledOnTouchOutside(z17);
        this.f345303i = z17;
    }

    @Override // android.app.Dialog
    public void setContentView(int i17) {
        setContentView(android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4, android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        this.f345307p.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        this.f345302h = onCancelListener;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        this.f345301g = onDismissListener;
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        this.f345300f = onShowListener;
    }

    @Override // android.app.ProgressDialog
    public void setProgress(int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            this.f345306o.post(new fl1.f1(this, i17));
            return;
        }
        if (this.f345308q == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f) this.f345306o.findViewById(com.p314xaae8f345.mm.R.id.prs);
            this.f345308q = c22703xb395948f;
            c22703xb395948f.setVisibility(0);
            android.view.View findViewById = this.f345306o.findViewById(com.p314xaae8f345.mm.R.id.prq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandProgressDialog", "setProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandProgressDialog", "setProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f345308q.m82049x3ae760af(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4, android.app.Dialog
    public void show() {
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        android.content.DialogInterface.OnShowListener onShowListener = this.f345300f;
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
        this.f345305n = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        this.f345306o = view;
        this.f345307p = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.prr);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
        }
        setContentView(view);
    }
}
