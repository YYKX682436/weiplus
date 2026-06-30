package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7;

/* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView */
/* loaded from: classes15.dex */
public class C16218x92f34101 extends android.widget.RelativeLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final android.view.View.AccessibilityDelegate f225383z = new aa3.q0();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f225384d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f225385e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f225386f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f225387g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f225388h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f225389i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f225390m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f225391n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f225392o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f225393p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f225394q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f225395r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f225396s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f225397t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f225398u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f225399v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f225400w;

    /* renamed from: x, reason: collision with root package name */
    public int f225401x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f225402y;

    public C16218x92f34101(android.content.Context context) {
        super(context);
        this.f225399v = null;
        this.f225400w = true;
        this.f225401x = 2;
        b();
    }

    public final android.content.res.ColorStateList a(int i17) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{-16842910}, new int[0]};
        int[] iArr2 = new int[3];
        java.lang.Boolean bool = this.f225399v;
        float f17 = 1.0f - (bool != null ? bool.booleanValue() ^ true : com.p314xaae8f345.mm.ui.bk.C() ? 0.6f : 0.1f);
        iArr2[0] = android.graphics.Color.argb(android.graphics.Color.alpha(i17), java.lang.Math.round(android.graphics.Color.red(i17) * f17), java.lang.Math.round(android.graphics.Color.green(i17) * f17), java.lang.Math.round(f17 * android.graphics.Color.blue(i17)));
        iArr2[1] = android.graphics.Color.argb(java.lang.Math.round(android.graphics.Color.alpha(i17) * 0.6f), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17));
        iArr2[2] = i17;
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public final void b() {
        if (this.f225400w) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570752bq3, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570753bq4, (android.view.ViewGroup) this, true);
        }
        this.f225398u = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f78274x82a1a429);
        this.f225393p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78261xb63921d8);
        this.f225384d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78262xb63921d9);
        this.f225385e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78263xb63921da);
        this.f225386f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78264xb63921db);
        this.f225387g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78265xb63921dc);
        this.f225388h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78266xb63921dd);
        this.f225389i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78267xb63921de);
        this.f225390m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78268xb63921df);
        this.f225391n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78269xb63921e0);
        this.f225392o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78270xb63921e1);
        this.f225394q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78288xc78dcf1);
        this.f225396s = findViewById(com.p314xaae8f345.mm.R.id.f78279xc78dbb3);
        this.f225395r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78271x5f31258e);
        this.f225397t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f78280x289a9137);
        if (this.f225395r == null) {
            this.f225395r = new android.widget.TextView(getContext());
        }
        this.f225395r.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        this.f225395r.setTextSize(1, i65.a.q(getContext()) * 17.0f);
        aa3.r0 r0Var = new aa3.r0(this);
        this.f225398u.setOnClickListener(r0Var);
        this.f225393p.setOnClickListener(r0Var);
        this.f225384d.setOnClickListener(r0Var);
        this.f225385e.setOnClickListener(r0Var);
        this.f225386f.setOnClickListener(r0Var);
        this.f225387g.setOnClickListener(r0Var);
        this.f225388h.setOnClickListener(r0Var);
        this.f225389i.setOnClickListener(r0Var);
        this.f225390m.setOnClickListener(r0Var);
        this.f225391n.setOnClickListener(r0Var);
        this.f225392o.setOnClickListener(r0Var);
        this.f225396s.setOnClickListener(r0Var);
        this.f225394q.setOnClickListener(r0Var);
        this.f225395r.setOnClickListener(r0Var);
        if (j62.e.g().l("clicfg_android_liteapp_pay_keyboard_accessibility_switch", false, true, true)) {
            android.view.View view = this.f225396s;
            android.view.View.AccessibilityDelegate accessibilityDelegate = f225383z;
            view.setAccessibilityDelegate(accessibilityDelegate);
            this.f225395r.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(nl1.b bVar) {
        if (bVar == 0) {
            return;
        }
        if (bVar == 0) {
            this.f225402y = null;
            return;
        }
        if (bVar instanceof android.view.View) {
            android.view.View view = (android.view.View) bVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w4.a(view.getContext());
            if (a17 != null) {
                a17.mo48674x36654fab();
            }
            view.requestFocus();
        }
        this.f225402y = bVar.a();
    }

    /* renamed from: setActionText */
    public void m65733x8ac63285(java.lang.String str) {
        this.f225395r.setText(str);
    }

    /* renamed from: setConfirmBgColor */
    public void m65734xe612e440(int i17) {
        this.f225395r.getBackground().setTintList(a(i17));
    }

    /* renamed from: setConfirmColor */
    public void m65735x12b11e05(int i17) {
        this.f225395r.setTextColor(a(i17));
    }

    /* renamed from: setForceLight */
    public void m65736x235cdaed(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        this.f225399v = valueOf;
        if (valueOf.booleanValue() && com.p314xaae8f345.mm.ui.bk.C()) {
            this.f225384d.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225384d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225385e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225385e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225386f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225386f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225387g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225387g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225388h.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225388h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225389i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225389i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225390m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225390m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225391n.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225391n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225392o.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225392o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225394q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225394q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225393p.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            this.f225393p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225396s.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj_);
            this.f225397t.m82037xa10c26f6(false);
            this.f225398u.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22);
        }
    }

    /* renamed from: setHeightListener */
    public void m65737x6329d7fd(aa3.s0 s0Var) {
    }

    /* renamed from: setIsOnlySupportInteger */
    public void m65738x1c238f87(boolean z17) {
        if (z17) {
            this.f225394q.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = this.f225393p.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams)) {
                return;
            }
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams2 = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) layoutParams;
            layoutParams2.f93085b = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(0, 3, p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w, 1.0f);
            this.f225393p.setLayoutParams(layoutParams2);
            return;
        }
        this.f225394q.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f225393p.getLayoutParams();
        if (layoutParams3 == null || !(layoutParams3 instanceof p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams)) {
            return;
        }
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams4 = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) layoutParams3;
        layoutParams4.f93085b = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(0, 2, p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w, 1.0f);
        this.f225393p.setLayoutParams(layoutParams4);
    }

    /* renamed from: setXMode */
    public void m65739x53eb72f9(int i17) {
        this.f225401x = i17;
        if (i17 == 1) {
            this.f225394q.setText("X");
        } else if (i17 == 2) {
            this.f225394q.setText(".");
        }
    }

    public C16218x92f34101(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f225399v = null;
        this.f225400w = true;
        this.f225401x = 2;
        b();
    }

    public C16218x92f34101(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f225399v = null;
        this.f225400w = true;
        this.f225401x = 2;
        b();
    }
}
