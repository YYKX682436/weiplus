package al5;

/* loaded from: classes12.dex */
public class u4 extends android.app.Dialog {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f6058t = 0;

    /* renamed from: d, reason: collision with root package name */
    public al5.t4 f6059d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f6060e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f6061f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f6062g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f6063h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f6064i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f6065m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f6066n;

    /* renamed from: o, reason: collision with root package name */
    public int f6067o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6068p;

    /* renamed from: q, reason: collision with root package name */
    public int f6069q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f6070r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.snackbar.h f6071s;

    public u4(android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.f6067o = 0;
        this.f6068p = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.f6069q = 0;
        this.f6067o = i18;
        this.f6070r = context;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.dke, null);
        this.f6065m = inflate;
        this.f6060e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qpd);
        this.f6061f = (android.widget.TextView) this.f6065m.findViewById(com.tencent.mm.R.id.v6y);
        this.f6062g = (android.widget.TextView) this.f6065m.findViewById(com.tencent.mm.R.id.qpa);
        this.f6063h = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f6065m.findViewById(com.tencent.mm.R.id.qpb);
        this.f6066n = (android.view.ViewGroup) this.f6065m.findViewById(com.tencent.mm.R.id.qp_);
        this.f6064i = (android.widget.ProgressBar) this.f6065m.findViewById(com.tencent.mm.R.id.qpc);
        f();
    }

    public void b(android.view.View view) {
        if (view == null) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeSnackBar", "update view is null", new java.lang.Object[0]);
            return;
        }
        try {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                view.setLayoutParams(marginLayoutParams);
            } else {
                com.tencent.mm.ui.yk.b("MicroMsg.WeSnackBar", "view layout params is not MarginLayoutParams", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeSnackBar", "update margin start error: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public final void c(android.widget.TextView textView, java.lang.CharSequence charSequence, boolean z17) {
        if (android.text.TextUtils.isEmpty(charSequence) || textView == null) {
            return;
        }
        if (z17) {
            textView.setVisibility(0);
        }
        textView.setText(charSequence);
        textView.setMaxWidth(textView.getContext().getResources().getDimensionPixelSize((this.f6067o & 2) != 0 ? com.tencent.mm.R.dimen.f479678ce : com.tencent.mm.R.dimen.f479687cm));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.tencent.mm.ui.widget.snackbar.h hVar = this.f6071s;
        if (hVar != null) {
            hVar.onHide();
        }
    }

    public final void e() {
        android.content.Context context;
        android.view.View findViewById;
        try {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            boolean z17 = true;
            if ((this.f6067o & 8) != 0) {
                attributes.flags &= -9;
            } else {
                attributes.flags |= 8;
            }
            attributes.gravity = 80;
            int i17 = this.f6069q;
            int i18 = this.f6068p;
            if (i17 == 0 && (context = this.f6070r) != null && (context instanceof android.app.Activity) && (findViewById = ((android.app.Activity) context).findViewById(com.tencent.mm.R.id.sqc)) != null) {
                this.f6069q = findViewById.getHeight() + i18;
            }
            if (this.f6069q == 0) {
                this.f6069q = i18;
            }
            attributes.y = this.f6069q;
            onWindowAttributesChanged(attributes);
            if ((this.f6067o & 8) != 0) {
                z17 = false;
            }
            setCancelable(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeSnackBar", "updateLayoutParams Exception %s", e17);
        }
    }

    public final void f() {
        if ((this.f6067o & 2) != 0) {
            this.f6063h.setVisibility(0);
        } else {
            this.f6063h.setVisibility(8);
        }
        if ((this.f6067o & 16) != 0) {
            this.f6064i.setVisibility(0);
        } else {
            this.f6064i.setVisibility(8);
        }
        if ((this.f6067o & 4) != 0) {
            this.f6066n.setVisibility(0);
        } else {
            this.f6066n.setVisibility(4);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f6065m, new android.widget.LinearLayout.LayoutParams(-1, -1));
        e();
        com.tencent.mm.ui.widget.snackbar.h hVar = this.f6071s;
        if (hVar != null) {
            hVar.onShow();
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
