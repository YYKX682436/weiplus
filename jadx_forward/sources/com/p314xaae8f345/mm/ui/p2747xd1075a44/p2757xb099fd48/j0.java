package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes9.dex */
public class j0 extends android.app.Dialog implements android.content.DialogInterface {
    public android.view.ViewGroup A;
    public android.widget.LinearLayout B;
    public android.view.ViewGroup C;
    public android.view.View D;
    public boolean E;
    public boolean F;
    public android.view.animation.Animation G;
    public android.view.animation.Animation H;
    public android.view.animation.Animation I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.animation.Animation f293358J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g0 K;
    public android.content.DialogInterface.OnDismissListener L;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l M;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f293359d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f293360e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f293361f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f293362g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f293363h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f293364i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f293365m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f293366n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f293367o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f293368p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f293369q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.EditText f293370r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.CheckBox f293371s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f293372t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f293373u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f293374v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f293375w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f293376x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewStub f293377y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f293378z;

    public j0(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.E = false;
        this.F = false;
        this.f293359d = context;
        i(context);
    }

    public static void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, android.view.animation.Animation animation) {
        android.widget.LinearLayout linearLayout = j0Var.f293378z;
        if (linearLayout != null) {
            linearLayout.startAnimation(animation);
        }
        android.widget.LinearLayout linearLayout2 = j0Var.B;
        if (linearLayout2 != null) {
            linearLayout2.startAnimation(animation);
        }
        android.widget.TextView textView = j0Var.f293369q;
        if (textView != null && j0Var.E) {
            textView.startAnimation(animation);
        }
        android.widget.EditText editText = j0Var.f293370r;
        if (editText != null) {
            if (j0Var.F) {
                editText.startAnimation(animation);
            } else {
                editText.setVisibility(8);
            }
        }
    }

    public static void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar) {
        android.view.View inflate = android.view.View.inflate(j0Var.f293359d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570202zy, null);
        j0Var.f293363h = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f78303x1455f299);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f78304x89ab61fb);
        j0Var.f293362g = button;
        button.setVisibility(0);
        j0Var.f293362g.setText(aVar.f293265v);
        int i17 = aVar.W;
        if (i17 != 0) {
            j0Var.f293362g.setTextColor(i17);
        }
        j0Var.f293362g.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b0(j0Var, aVar));
        j0Var.f293363h.setVisibility(0);
        j0Var.f293363h.setText(aVar.f293266w);
        int i18 = aVar.V;
        if (i18 != 0) {
            j0Var.f293363h.setTextColor(i18);
        }
        j0Var.f293363h.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c0(j0Var, aVar));
        j0Var.s(inflate, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    private void i(android.content.Context context) {
        android.content.Context context2 = this.f293359d;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(context2, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxt, null);
        this.f293360e = linearLayout;
        this.f293361f = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f564462s4);
        this.f293362g = (android.widget.Button) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.f78304x89ab61fb);
        this.f293363h = (android.widget.Button) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.f78303x1455f299);
        this.f293364i = (android.widget.TextView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlo);
        this.f293365m = (android.widget.TextView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlq);
        this.f293366n = (android.widget.TextView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlg);
        this.f293367o = (android.widget.TextView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jll);
        this.f293368p = (android.widget.TextView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlk);
        this.f293369q = (android.widget.TextView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.c_f);
        this.f293370r = (android.widget.EditText) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.c_l);
        this.f293371s = (android.widget.CheckBox) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.c__);
        this.f293372t = (android.widget.ImageView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlj);
        this.f293373u = (android.widget.ImageView) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        this.f293376x = (android.widget.LinearLayout) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlp);
        this.f293377y = (android.view.ViewStub) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.oco);
        this.f293378z = (android.widget.LinearLayout) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlh);
        this.A = (android.view.ViewGroup) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.f567471jl5);
        this.D = this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jl_);
        this.B = (android.widget.LinearLayout) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.jlc);
        this.C = (android.view.ViewGroup) this.f293360e.findViewById(com.p314xaae8f345.mm.R.id.ocn);
        setCanceledOnTouchOutside(true);
        this.G = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
        this.H = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
        this.I = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
        this.f293358J = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
    }

    public void A(java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        android.widget.Button button = this.f293362g;
        if (button == null) {
            return;
        }
        button.setVisibility(0);
        this.f293362g.setText(charSequence);
        this.f293362g.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o(this, onClickListener, z17));
    }

    public void B(int i17) {
        this.f293362g.setTextColor(i17);
    }

    public void C(int i17) {
        android.widget.TextView textView = this.f293364i;
        if (textView != null) {
            textView.setGravity(i17);
        }
    }

    public void D(android.view.View view, int i17) {
        this.f293374v = view;
        if (view != null) {
            this.f293378z.setVisibility(0);
            this.B.setVisibility(0);
            this.B.removeAllViews();
            this.B.setGravity(1);
            this.B.addView(this.f293374v, new android.widget.LinearLayout.LayoutParams(i17, i17));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t(this));
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMAlertDialog", "dialog dismiss error!", new java.lang.Object[0]);
            return;
        }
        try {
            super.dismiss();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.ui.yk.d("MicroMsg.MMAlertDialog", th6, "dismiss exception", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l lVar = this.M;
        if (lVar != null) {
            lVar.mo48629xdbdf3083(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a r20) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0.e(com.tencent.mm.ui.widget.dialog.a):void");
    }

    public android.widget.Button f(int i17) {
        if (i17 == -2) {
            return this.f293363h;
        }
        if (i17 != -1) {
            return null;
        }
        return this.f293362g;
    }

    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f293360e;
    }

    public java.lang.String h() {
        android.widget.EditText editText = this.f293370r;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public void k(int i17, boolean z17) {
        if (i17 == -2) {
            if (z17) {
                this.f293363h.setVisibility(0);
                return;
            } else {
                this.f293363h.setVisibility(8);
                return;
            }
        }
        if (i17 != -1) {
            return;
        }
        if (z17) {
            this.f293362g.setVisibility(0);
        } else {
            this.f293362g.setVisibility(8);
        }
    }

    public void o(boolean z17) {
        super.setCancelable(z17);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f293360e);
    }

    public void p(int i17) {
        android.widget.TextView textView = this.f293369q;
        if (textView != null) {
            textView.setGravity(i17);
        }
    }

    public final void r(int i17) {
        android.widget.LinearLayout linearLayout = this.f293378z;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
        android.widget.LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i17);
        }
        android.widget.TextView textView = this.f293369q;
        if (textView != null && this.E) {
            textView.setVisibility(i17);
        }
        android.widget.EditText editText = this.f293370r;
        if (editText != null) {
            if (this.F) {
                editText.setVisibility(i17);
            } else {
                editText.setVisibility(8);
            }
        }
    }

    public final void s(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.View view2 = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "setCustomBottomView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "setCustomBottomView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.removeAllViews();
        this.A.addView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        this.f293376x.setVisibility(0);
        this.f293364i.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g0 g0Var = this.K;
        android.content.Context context = this.f293359d;
        if (g0Var != null) {
            charSequence = g0Var.a(context, charSequence.toString(), this.f293364i.getTextSize());
        }
        this.f293364i.setMaxLines(2);
        this.f293364i.setText(charSequence);
        this.f293364i.getPaint().setFakeBoldText(true);
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
        android.widget.TextView textView = this.f293366n;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.d("MicroMsg.MMAlertDialog", e17, "", new java.lang.Object[0]);
        }
    }

    public void t(java.lang.CharSequence charSequence) {
        this.f293378z.setVisibility(0);
        this.f293366n.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g0 g0Var = this.K;
        if (g0Var != null) {
            charSequence = g0Var.a(this.f293366n.getContext(), charSequence.toString(), this.f293366n.getTextSize());
        }
        this.f293366n.setText(charSequence);
    }

    public void u(int i17, android.content.DialogInterface.OnClickListener onClickListener) {
        w(of5.b.a(this.f293359d).getString(i17), true, onClickListener);
    }

    public void w(java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        android.widget.Button button = this.f293363h;
        if (button == null) {
            return;
        }
        button.setVisibility(0);
        this.f293363h.setText(charSequence);
        this.f293363h.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p(this, onClickListener, z17));
    }

    public void x(int i17) {
        this.f293363h.setTextColor(i17);
    }

    public void z(int i17, android.content.DialogInterface.OnClickListener onClickListener) {
        A(of5.b.a(this.f293359d).getString(i17), true, onClickListener);
    }

    public j0(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.E = false;
        this.F = false;
        this.f293359d = context;
        i(context);
    }

    @Override // android.app.Dialog
    public void setTitle(int i17) {
        this.f293376x.setVisibility(0);
        this.f293364i.setVisibility(0);
        this.f293364i.setMaxLines(2);
        this.f293364i.setText(i17);
        this.f293364i.getPaint().setFakeBoldText(true);
        int color = this.f293359d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
        android.widget.TextView textView = this.f293366n;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }
}
