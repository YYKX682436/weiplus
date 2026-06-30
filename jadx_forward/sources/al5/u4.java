package al5;

/* loaded from: classes12.dex */
public class u4 extends android.app.Dialog {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f87591t = 0;

    /* renamed from: d, reason: collision with root package name */
    public al5.t4 f87592d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f87593e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f87594f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f87595g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f87596h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f87597i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f87598m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f87599n;

    /* renamed from: o, reason: collision with root package name */
    public int f87600o;

    /* renamed from: p, reason: collision with root package name */
    public final int f87601p;

    /* renamed from: q, reason: collision with root package name */
    public int f87602q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f87603r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h f87604s;

    public u4(android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.f87600o = 0;
        this.f87601p = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f87602q = 0;
        this.f87600o = i18;
        this.f87603r = context;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dke, null);
        this.f87598m = inflate;
        this.f87593e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qpd);
        this.f87594f = (android.widget.TextView) this.f87598m.findViewById(com.p314xaae8f345.mm.R.id.v6y);
        this.f87595g = (android.widget.TextView) this.f87598m.findViewById(com.p314xaae8f345.mm.R.id.qpa);
        this.f87596h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f87598m.findViewById(com.p314xaae8f345.mm.R.id.qpb);
        this.f87599n = (android.view.ViewGroup) this.f87598m.findViewById(com.p314xaae8f345.mm.R.id.qp_);
        this.f87597i = (android.widget.ProgressBar) this.f87598m.findViewById(com.p314xaae8f345.mm.R.id.qpc);
        f();
    }

    public void b(android.view.View view) {
        if (view == null) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeSnackBar", "update view is null", new java.lang.Object[0]);
            return;
        }
        try {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                view.setLayoutParams(marginLayoutParams);
            } else {
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeSnackBar", "view layout params is not MarginLayoutParams", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeSnackBar", "update margin start error: " + e17.getMessage(), new java.lang.Object[0]);
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
        textView.setMaxWidth(textView.getContext().getResources().getDimensionPixelSize((this.f87600o & 2) != 0 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561211ce : com.p314xaae8f345.mm.R.C30860x5b28f31.f561220cm));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = this.f87604s;
        if (hVar != null) {
            hVar.mo50890xc39a57c1();
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
            if ((this.f87600o & 8) != 0) {
                attributes.flags &= -9;
            } else {
                attributes.flags |= 8;
            }
            attributes.gravity = 80;
            int i17 = this.f87602q;
            int i18 = this.f87601p;
            if (i17 == 0 && (context = this.f87603r) != null && (context instanceof android.app.Activity) && (findViewById = ((android.app.Activity) context).findViewById(com.p314xaae8f345.mm.R.id.sqc)) != null) {
                this.f87602q = findViewById.getHeight() + i18;
            }
            if (this.f87602q == 0) {
                this.f87602q = i18;
            }
            attributes.y = this.f87602q;
            onWindowAttributesChanged(attributes);
            if ((this.f87600o & 8) != 0) {
                z17 = false;
            }
            setCancelable(z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeSnackBar", "updateLayoutParams Exception %s", e17);
        }
    }

    public final void f() {
        if ((this.f87600o & 2) != 0) {
            this.f87596h.setVisibility(0);
        } else {
            this.f87596h.setVisibility(8);
        }
        if ((this.f87600o & 16) != 0) {
            this.f87597i.setVisibility(0);
        } else {
            this.f87597i.setVisibility(8);
        }
        if ((this.f87600o & 4) != 0) {
            this.f87599n.setVisibility(0);
        } else {
            this.f87599n.setVisibility(4);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f87598m, new android.widget.LinearLayout.LayoutParams(-1, -1));
        e();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = this.f87604s;
        if (hVar != null) {
            hVar.mo50891xc39f557c();
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
