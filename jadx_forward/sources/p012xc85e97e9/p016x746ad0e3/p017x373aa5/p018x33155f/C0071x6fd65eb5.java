package p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f;

/* renamed from: androidx.appcompat.view.menu.ListMenuItemView */
/* loaded from: classes15.dex */
public class C0071x6fd65eb5 extends android.widget.LinearLayout implements o.h0, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public o.u f90810d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f90811e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RadioButton f90812f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f90813g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.CheckBox f90814h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f90815i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f90816m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f90817n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f90818o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f90819p;

    /* renamed from: q, reason: collision with root package name */
    public final int f90820q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f90821r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f90822s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f90823t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f90824u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.LayoutInflater f90825v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f90826w;

    public C0071x6fd65eb5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559848gi);
    }

    /* renamed from: getInflater */
    private android.view.LayoutInflater m2584x86512cc1() {
        if (this.f90825v == null) {
            this.f90825v = android.view.LayoutInflater.from(getContext());
        }
        return this.f90825v;
    }

    /* renamed from: setSubMenuArrowVisible */
    private void m2585x3a5a99c6(boolean z17) {
        android.widget.ImageView imageView = this.f90816m;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r11 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    @Override // o.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(o.u r10, int r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0071x6fd65eb5.a(o.u, int):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.f90817n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f90817n.getLayoutParams();
        rect.top += this.f90817n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // o.h0
    /* renamed from: getItemData */
    public o.u mo2574xc2025ad3() {
        return this.f90810d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, this.f90819p);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f90813g = textView;
        int i17 = this.f90820q;
        if (i17 != -1) {
            textView.setTextAppearance(this.f90821r, i17);
        }
        this.f90815i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568446mv4);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568694nr0);
        this.f90816m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f90823t);
        }
        this.f90817n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gu7);
        this.f90818o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cgi);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f90811e != null && this.f90822s) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f90811e.getLayoutParams();
            int i19 = layoutParams.height;
            if (i19 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i19;
            }
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setCheckable */
    public void m2586x7388e820(boolean z17) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z17 && this.f90812f == null && this.f90814h == null) {
            return;
        }
        if ((this.f90810d.D & 4) != 0) {
            if (this.f90812f == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) m2584x86512cc1().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569427av, (android.view.ViewGroup) this, false);
                this.f90812f = radioButton;
                android.widget.LinearLayout linearLayout = this.f90818o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f90812f;
            view = this.f90814h;
        } else {
            if (this.f90814h == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) m2584x86512cc1().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569424as, (android.view.ViewGroup) this, false);
                this.f90814h = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f90818o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f90814h;
            view = this.f90812f;
        }
        if (z17) {
            compoundButton.setChecked(this.f90810d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox2 = this.f90814h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        android.widget.RadioButton radioButton2 = this.f90812f;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    /* renamed from: setChecked */
    public void m2587xdd7d58e5(boolean z17) {
        android.widget.CompoundButton compoundButton;
        if ((this.f90810d.D & 4) != 0) {
            if (this.f90812f == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) m2584x86512cc1().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569427av, (android.view.ViewGroup) this, false);
                this.f90812f = radioButton;
                android.widget.LinearLayout linearLayout = this.f90818o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f90812f;
        } else {
            if (this.f90814h == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) m2584x86512cc1().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569424as, (android.view.ViewGroup) this, false);
                this.f90814h = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f90818o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f90814h;
        }
        compoundButton.setChecked(z17);
    }

    /* renamed from: setForceShowIcon */
    public void m2588xe352bbdf(boolean z17) {
        this.f90826w = z17;
        this.f90822s = z17;
    }

    /* renamed from: setGroupDividerEnabled */
    public void m2589xf1dda685(boolean z17) {
        android.widget.ImageView imageView = this.f90817n;
        if (imageView != null) {
            imageView.setVisibility((this.f90824u || !z17) ? 8 : 0);
        }
    }

    /* renamed from: setIcon */
    public void m2590x764b6bfb(android.graphics.drawable.Drawable drawable) {
        this.f90810d.f423350t.getClass();
        boolean z17 = this.f90826w;
        if (z17 || this.f90822s) {
            android.widget.ImageView imageView = this.f90811e;
            if (imageView == null && drawable == null && !this.f90822s) {
                return;
            }
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) m2584x86512cc1().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569425at, (android.view.ViewGroup) this, false);
                this.f90811e = imageView2;
                android.widget.LinearLayout linearLayout = this.f90818o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f90822s) {
                this.f90811e.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView3 = this.f90811e;
            if (!z17) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f90811e.getVisibility() != 0) {
                this.f90811e.setVisibility(0);
            }
        }
    }

    /* renamed from: setTitle */
    public void m2591x53bfe316(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f90813g.getVisibility() != 8) {
                this.f90813g.setVisibility(8);
            }
        } else {
            this.f90813g.setText(charSequence);
            if (this.f90813g.getVisibility() != 0) {
                this.f90813g.setVisibility(0);
            }
        }
    }

    public C0071x6fd65eb5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(getContext(), attributeSet, j.a.f377724s, i17, 0);
        this.f90819p = l17.e(5);
        this.f90820q = l17.i(1, -1);
        this.f90822s = l17.a(7, false);
        this.f90821r = context;
        this.f90823t = l17.e(8);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559764e8, 0);
        this.f90824u = obtainStyledAttributes.hasValue(0);
        l17.m();
        obtainStyledAttributes.recycle();
    }
}
