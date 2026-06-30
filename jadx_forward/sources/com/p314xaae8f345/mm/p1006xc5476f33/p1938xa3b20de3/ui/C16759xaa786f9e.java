package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView */
/* loaded from: classes9.dex */
public class C16759xaa786f9e extends android.widget.LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f234005n = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f234006d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f234007e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f234008f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f234009g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z f234010h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.CountDownTimer f234011i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z f234012m;

    public C16759xaa786f9e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f234006d = 0;
        this.f234007e = null;
        this.f234008f = null;
        this.f234009g = true;
        this.f234010h = null;
        c();
    }

    public void a() {
        android.view.ViewGroup viewGroup = this.f234008f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar = this.f234010h;
        if (zVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1 q1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1) zVar;
            q1Var.getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38.B2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = q1Var.f234227a;
            activityC16764xd1ab6b38.getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.m3) activityC16764xd1ab6b38.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.m3.class)).O6();
        }
        android.os.CountDownTimer countDownTimer = this.f234011i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f234012m != null) {
            ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.f234012m);
        }
        this.f234006d = 0;
        this.f234009g = true;
    }

    public final at4.q0 b(at4.r0 r0Var, java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) r0Var.f95473f).iterator();
        while (it.hasNext()) {
            at4.q0 q0Var = (at4.q0) it.next();
            if (q0Var.f95463d.equals(str)) {
                return q0Var;
            }
        }
        return null;
    }

    public final void c() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d78, this);
        this.f234007e = inflate;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.khb);
        this.f234008f = viewGroup;
        viewGroup.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.p(this));
    }

    public boolean d(int i17) {
        int i18;
        if (!e() || i17 == (i18 = this.f234006d) || i17 == 1) {
            return true;
        }
        if (i17 == 2 && (i18 == 3 || i18 == 4 || i18 == 5)) {
            return true;
        }
        if ((i17 == 5 && i18 == 4) || i17 == 6 || i17 == 7) {
            return true;
        }
        if (i17 == 8 && (i18 == 5 || i18 == 4 || i18 == 2)) {
            return true;
        }
        return i17 == 3 ? i18 != 1 : i17 == 9 && (i18 == 4 || i18 == 5 || i18 == 2);
    }

    public boolean e() {
        return getVisibility() == 0;
    }

    public final void f(android.view.View view, android.view.View.OnClickListener onClickListener, int i17) {
        this.f234006d = i17;
        setVisibility(0);
        this.f234008f.removeAllViews();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d7j, this.f234008f, false);
        if (i17 == 6) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564466s7)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574193he0);
        } else if ((i17 == 3 || i17 == 1) && u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564466s7)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.hea);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9c);
        if (viewGroup != null) {
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9d);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9b);
            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9a);
            textView.setMaxWidth(((((i65.a.B(getContext()) - (i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * 2)) - (i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2)) - i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)) - i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)) - i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
            viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x(this, textView, imageView, imageView2));
            viewGroup.setForeground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ati));
            viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.y(this, view));
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k(viewGroup, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        }
        this.f234008f.addView(inflate);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.kip);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kir);
        android.widget.Button button = (android.widget.Button) this.f234007e.findViewById(com.p314xaae8f345.mm.R.id.h5h);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.kiq);
        viewGroup2.setVisibility(0);
        if (j65.e.b()) {
            checkBox.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ath);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k(checkBox, 50);
        checkBox.setChecked(false);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574194he1);
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.append((java.lang.CharSequence) getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574195he2));
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(7, new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.f(this)), string.length(), spannableStringBuilder.length(), 18);
        textView2.setText(spannableStringBuilder);
        textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(getContext()));
        textView2.setClickable(true);
        button.setSelected(false);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.g(this, checkBox, onClickListener, viewGroup2, button));
        this.f234009g = false;
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h(this, textView2, checkBox, view));
    }

    /* renamed from: setBlurDockerView */
    public void m67480xc70a39ae(android.view.ViewGroup viewGroup) {
    }

    /* renamed from: setDialogState */
    public void m67481x70fc9e67(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar) {
        this.f234010h = zVar;
    }

    public C16759xaa786f9e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f234006d = 0;
        this.f234007e = null;
        this.f234008f = null;
        this.f234009g = true;
        this.f234010h = null;
        c();
    }
}
