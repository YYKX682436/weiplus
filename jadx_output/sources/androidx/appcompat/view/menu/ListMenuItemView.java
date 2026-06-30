package androidx.appcompat.view.menu;

/* loaded from: classes15.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements o.h0, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public o.u f9277d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f9278e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RadioButton f9279f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f9280g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.CheckBox f9281h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f9282i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f9283m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f9284n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f9285o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f9286p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9287q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f9288r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9289s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f9290t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9291u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.LayoutInflater f9292v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9293w;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478315gi);
    }

    private android.view.LayoutInflater getInflater() {
        if (this.f9292v == null) {
            this.f9292v = android.view.LayoutInflater.from(getContext());
        }
        return this.f9292v;
    }

    private void setSubMenuArrowVisible(boolean z17) {
        android.widget.ImageView imageView = this.f9283m;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(o.u, int):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.f9284n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f9284n.getLayoutParams();
        rect.top += this.f9284n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // o.h0
    public o.u getItemData() {
        return this.f9277d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, this.f9286p);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f9280g = textView;
        int i17 = this.f9287q;
        if (i17 != -1) {
            textView.setTextAppearance(this.f9288r, i17);
        }
        this.f9282i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486913mv4);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487161nr0);
        this.f9283m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9290t);
        }
        this.f9284n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gu7);
        this.f9285o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cgi);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f9278e != null && this.f9289s) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f9278e.getLayoutParams();
            int i19 = layoutParams.height;
            if (i19 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i19;
            }
        }
        super.onMeasure(i17, i18);
    }

    public void setCheckable(boolean z17) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z17 && this.f9279f == null && this.f9281h == null) {
            return;
        }
        if ((this.f9277d.D & 4) != 0) {
            if (this.f9279f == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.tencent.mm.R.layout.f487894av, (android.view.ViewGroup) this, false);
                this.f9279f = radioButton;
                android.widget.LinearLayout linearLayout = this.f9285o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9279f;
            view = this.f9281h;
        } else {
            if (this.f9281h == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.tencent.mm.R.layout.f487891as, (android.view.ViewGroup) this, false);
                this.f9281h = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f9285o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9281h;
            view = this.f9279f;
        }
        if (z17) {
            compoundButton.setChecked(this.f9277d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox2 = this.f9281h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        android.widget.RadioButton radioButton2 = this.f9279f;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z17) {
        android.widget.CompoundButton compoundButton;
        if ((this.f9277d.D & 4) != 0) {
            if (this.f9279f == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.tencent.mm.R.layout.f487894av, (android.view.ViewGroup) this, false);
                this.f9279f = radioButton;
                android.widget.LinearLayout linearLayout = this.f9285o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9279f;
        } else {
            if (this.f9281h == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.tencent.mm.R.layout.f487891as, (android.view.ViewGroup) this, false);
                this.f9281h = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f9285o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9281h;
        }
        compoundButton.setChecked(z17);
    }

    public void setForceShowIcon(boolean z17) {
        this.f9293w = z17;
        this.f9289s = z17;
    }

    public void setGroupDividerEnabled(boolean z17) {
        android.widget.ImageView imageView = this.f9284n;
        if (imageView != null) {
            imageView.setVisibility((this.f9291u || !z17) ? 8 : 0);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f9277d.f341817t.getClass();
        boolean z17 = this.f9293w;
        if (z17 || this.f9289s) {
            android.widget.ImageView imageView = this.f9278e;
            if (imageView == null && drawable == null && !this.f9289s) {
                return;
            }
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getInflater().inflate(com.tencent.mm.R.layout.f487892at, (android.view.ViewGroup) this, false);
                this.f9278e = imageView2;
                android.widget.LinearLayout linearLayout = this.f9285o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f9289s) {
                this.f9278e.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView3 = this.f9278e;
            if (!z17) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f9278e.getVisibility() != 0) {
                this.f9278e.setVisibility(0);
            }
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f9280g.getVisibility() != 8) {
                this.f9280g.setVisibility(8);
            }
        } else {
            this.f9280g.setText(charSequence);
            if (this.f9280g.getVisibility() != 0) {
                this.f9280g.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(getContext(), attributeSet, j.a.f296191s, i17, 0);
        this.f9286p = l17.e(5);
        this.f9287q = l17.i(1, -1);
        this.f9289s = l17.a(7, false);
        this.f9288r = context;
        this.f9290t = l17.e(8);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.tencent.mm.R.attr.f478231e8, 0);
        this.f9291u = obtainStyledAttributes.hasValue(0);
        l17.m();
        obtainStyledAttributes.recycle();
    }
}
