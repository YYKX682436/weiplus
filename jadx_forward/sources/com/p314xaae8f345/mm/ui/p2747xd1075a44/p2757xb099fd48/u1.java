package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes11.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f293529a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f293530b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f293531c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f293532d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f293533e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RadioGroup f293534f;

    public u1(android.content.Context context) {
        this.f293532d = null;
        this.f293533e = null;
        this.f293530b = context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        this.f293529a = i0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.A = false;
        aVar.B = false;
        aVar.f293258o = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.n1(this);
        this.f293533e = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
        this.f293532d = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu);
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f293529a.f293354b;
        aVar.A = z17;
        aVar.B = z17;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var) {
        android.widget.RadioGroup radioGroup = this.f293534f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f293531c);
        }
        l(w1Var);
        i(w1Var);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var2) {
        android.widget.RadioGroup radioGroup = this.f293534f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f293531c);
        }
        i(w1Var);
        l(w1Var2);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 d(android.view.View view) {
        this.f293529a.f293354b.L = view;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 e(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f293529a.f293354b.H = onDismissListener;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f(java.lang.Boolean bool) {
        this.f293529a.f293354b.f293249f = bool.booleanValue();
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 g(java.lang.String str) {
        this.f293529a.f293354b.f293262s = str;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 h(java.lang.CharSequence charSequence) {
        int i17 = (int) (com.p314xaae8f345.mm.ui.zk.f294171b * 14.0f);
        android.content.Context context = this.f293530b;
        com.p314xaae8f345.mm.ui.zk.a(context, i17);
        if (charSequence != null && charSequence.length() > 0) {
            charSequence = pg5.d.a(context, charSequence.toString());
        }
        this.f293529a.f293354b.f293263t = charSequence;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 i(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var) {
        java.lang.String str = this.f293533e;
        if (str == null || (str != null && str.length() == 0)) {
            this.f293533e = this.f293530b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
        }
        android.widget.RadioGroup radioGroup = this.f293534f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f293531c);
        }
        java.lang.String str2 = this.f293533e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f293529a.f293354b;
        aVar.f293266w = str2;
        aVar.F = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o1(this, w1Var);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 j(java.lang.String str) {
        this.f293533e = str;
        this.f293529a.f293354b.f293266w = str;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 k(int i17) {
        this.f293529a.f293354b.W = i17;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 l(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var) {
        java.lang.String str = this.f293532d;
        if (str == null || (str != null && str.length() == 0)) {
            this.f293532d = this.f293530b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu);
        }
        android.widget.RadioGroup radioGroup = this.f293534f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f293531c);
        }
        java.lang.String str2 = this.f293532d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f293529a.f293354b;
        aVar.f293265v = str2;
        aVar.E = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p1(this, w1Var);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 m(int i17) {
        java.lang.String string = this.f293530b.getResources().getString(i17);
        this.f293532d = string;
        this.f293529a.f293354b.f293265v = string;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 n(java.lang.String str) {
        this.f293532d = str;
        this.f293529a.f293354b.f293265v = str;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 o(java.lang.String str) {
        this.f293529a.f293354b.f293247d = str;
        return this;
    }

    public void p() {
        q(false);
    }

    public void q(boolean z17) {
        android.content.Context context = this.f293530b;
        boolean z18 = context instanceof android.app.Activity;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f293529a;
        if (z18) {
            if (this.f293531c == null) {
                this.f293531c = z17 ? i0Var.b(true) : i0Var.a();
            }
            this.f293531c.show();
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.f278089m = i0Var;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21340x254df46b.class);
        intent.setFlags(335544320);
        android.content.Context context2 = this.f293530b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "show", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "show", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 r(boolean z17) {
        this.f293529a.f293354b.f293243a0 = z17;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 s() {
        if (this.f293531c == null) {
            this.f293531c = this.f293529a.a();
        }
        android.view.Window window = this.f293531c.getWindow();
        if (window != null) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                window.setType(2038);
            } else {
                window.setType(2002);
            }
            window.addFlags(524288);
            com.p314xaae8f345.mm.ui.yk.a("dialog", "show top window not null!!", new java.lang.Object[0]);
        }
        this.f293531c.show();
        return this.f293531c;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 t(java.util.ArrayList arrayList, android.widget.RadioGroup.OnCheckedChangeListener onCheckedChangeListener, int i17) {
        android.content.Context context = this.f293530b;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a4f, null);
        this.f293534f = (android.widget.RadioGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.lhv);
        int size = arrayList != null ? arrayList.size() : 0;
        for (int i18 = 0; i18 < size; i18++) {
            android.widget.RadioButton radioButton = (android.widget.RadioButton) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a4e, null);
            radioButton.setId(i18);
            if (i18 == i17) {
                radioButton.setChecked(true);
            }
            radioButton.setText((java.lang.CharSequence) arrayList.get(i18));
            this.f293534f.addView(radioButton);
        }
        this.f293534f.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f293529a.f293354b.L = inflate;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u(java.lang.CharSequence charSequence) {
        int i17 = (int) (com.p314xaae8f345.mm.ui.zk.f294171b * 20.0f);
        android.content.Context context = this.f293530b;
        com.p314xaae8f345.mm.ui.zk.a(context, i17);
        if (charSequence != null && charSequence.length() > 0) {
            charSequence = pg5.d.a(context, charSequence.toString());
        }
        this.f293529a.f293354b.f293242a = charSequence;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 v(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 v1Var) {
        android.widget.RadioGroup radioGroup = this.f293534f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f293531c);
        }
        java.lang.String str = this.f293532d;
        android.content.Context context = this.f293530b;
        if (str == null || (str != null && str.length() == 0)) {
            this.f293532d = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu);
        }
        java.lang.String str2 = this.f293532d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f293529a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.f293265v = str2;
        aVar.E = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s1(this, v1Var);
        java.lang.String str3 = this.f293533e;
        if (str3 == null || (str3 != null && str3.length() == 0)) {
            this.f293533e = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
        }
        java.lang.String str4 = this.f293533e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var.f293354b;
        aVar2.f293266w = str4;
        aVar2.F = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t1(this, v1Var);
        return this;
    }
}
