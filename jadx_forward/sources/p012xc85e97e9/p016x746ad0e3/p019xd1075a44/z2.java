package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class z2 implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b f91280a;

    /* renamed from: b, reason: collision with root package name */
    public int f91281b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f91282c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f91283d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91284e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91285f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91286g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f91288i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f91289j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f91290k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.Window.Callback f91291l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91292m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f91293n;

    /* renamed from: o, reason: collision with root package name */
    public int f91294o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91295p;

    public z2(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        this.f91294o = 0;
        this.f91280a = c0102x1f44235b;
        this.f91288i = c0102x1f44235b.m2824x7531c8a2();
        this.f91289j = c0102x1f44235b.m2823x109898e();
        this.f91287h = this.f91288i != null;
        this.f91286g = c0102x1f44235b.m2818xf8c55da3();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(c0102x1f44235b.getContext(), null, j.a.f377706a, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559597o, 0);
        int i17 = 15;
        this.f91295p = l17.e(15);
        if (z17) {
            java.lang.CharSequence j17 = l17.j(27);
            if (!android.text.TextUtils.isEmpty(j17)) {
                this.f91287h = true;
                this.f91288i = j17;
                if ((this.f91281b & 8) != 0) {
                    c0102x1f44235b.mo2849x53bfe316(j17);
                }
            }
            java.lang.CharSequence j18 = l17.j(25);
            if (!android.text.TextUtils.isEmpty(j18)) {
                this.f91289j = j18;
                if ((this.f91281b & 8) != 0) {
                    c0102x1f44235b.mo2846xfbc1ea9a(j18);
                }
            }
            android.graphics.drawable.Drawable e17 = l17.e(20);
            if (e17 != null) {
                this.f91285f = e17;
                h();
            }
            android.graphics.drawable.Drawable e18 = l17.e(17);
            if (e18 != null) {
                this.f91284e = e18;
                h();
            }
            if (this.f91286g == null && (drawable = this.f91295p) != null) {
                this.f91286g = drawable;
                if ((this.f91281b & 4) != 0) {
                    c0102x1f44235b.m2840xc0bbc5af(drawable);
                } else {
                    c0102x1f44235b.m2840xc0bbc5af((android.graphics.drawable.Drawable) null);
                }
            }
            d(l17.h(10, 0));
            int i18 = l17.i(9, 0);
            if (i18 != 0) {
                c(android.view.LayoutInflater.from(c0102x1f44235b.getContext()).inflate(i18, (android.view.ViewGroup) c0102x1f44235b, false));
                d(this.f91281b | 16);
            }
            int layoutDimension = l17.f91226b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = c0102x1f44235b.getLayoutParams();
                layoutParams.height = layoutDimension;
                c0102x1f44235b.setLayoutParams(layoutParams);
            }
            int c17 = l17.c(7, -1);
            int c18 = l17.c(3, -1);
            if (c17 >= 0 || c18 >= 0) {
                int max = java.lang.Math.max(c17, 0);
                int max2 = java.lang.Math.max(c18, 0);
                if (c0102x1f44235b.f91030z == null) {
                    c0102x1f44235b.f91030z = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1();
                }
                c0102x1f44235b.f91030z.a(max, max2);
            }
            int i19 = l17.i(28, 0);
            if (i19 != 0) {
                android.content.Context context = c0102x1f44235b.getContext();
                c0102x1f44235b.f91022r = i19;
                android.widget.TextView textView = c0102x1f44235b.f91012e;
                if (textView != null) {
                    textView.setTextAppearance(context, i19);
                }
            }
            int i27 = l17.i(26, 0);
            if (i27 != 0) {
                android.content.Context context2 = c0102x1f44235b.getContext();
                c0102x1f44235b.f91023s = i27;
                android.widget.TextView textView2 = c0102x1f44235b.f91013f;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, i27);
                }
            }
            int i28 = l17.i(22, 0);
            if (i28 != 0) {
                c0102x1f44235b.m2844xa9dea67f(i28);
            }
        } else {
            if (c0102x1f44235b.m2818xf8c55da3() != null) {
                this.f91295p = c0102x1f44235b.m2818xf8c55da3();
            } else {
                i17 = 11;
            }
            this.f91281b = i17;
        }
        l17.m();
        if (com.p314xaae8f345.mm.R.C30867xcad56011.f571305b9 != this.f91294o) {
            this.f91294o = com.p314xaae8f345.mm.R.C30867xcad56011.f571305b9;
            if (android.text.TextUtils.isEmpty(c0102x1f44235b.m2817x205c716d())) {
                int i29 = this.f91294o;
                java.lang.String string = i29 != 0 ? a().getString(i29) : null;
                this.f91290k = string;
                if ((this.f91281b & 4) != 0) {
                    if (android.text.TextUtils.isEmpty(string)) {
                        c0102x1f44235b.m2837x1b45d479(this.f91294o);
                    } else {
                        c0102x1f44235b.m2838x1b45d479(this.f91290k);
                    }
                }
            }
        }
        this.f91290k = c0102x1f44235b.m2817x205c716d();
        c0102x1f44235b.m2841x9bc083c7(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x2(this));
    }

    public android.content.Context a() {
        return this.f91280a.getContext();
    }

    public boolean b() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91280a.f91011d;
        if (c0076xa566151a == null) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = c0076xa566151a.f90873z;
        return qVar != null && qVar.l();
    }

    public void c(android.view.View view) {
        android.view.View view2 = this.f91283d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = this.f91280a;
        if (view2 != null && (this.f91281b & 16) != 0) {
            c0102x1f44235b.removeView(view2);
        }
        this.f91283d = view;
        if (view == null || (this.f91281b & 16) == 0) {
            return;
        }
        c0102x1f44235b.addView(view);
    }

    public void d(int i17) {
        android.view.View view;
        int i18 = this.f91281b ^ i17;
        this.f91281b = i17;
        if (i18 != 0) {
            int i19 = i18 & 4;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = this.f91280a;
            if (i19 != 0) {
                if ((i17 & 4) != 0 && (i17 & 4) != 0) {
                    if (android.text.TextUtils.isEmpty(this.f91290k)) {
                        c0102x1f44235b.m2837x1b45d479(this.f91294o);
                    } else {
                        c0102x1f44235b.m2838x1b45d479(this.f91290k);
                    }
                }
                if ((this.f91281b & 4) != 0) {
                    android.graphics.drawable.Drawable drawable = this.f91286g;
                    if (drawable == null) {
                        drawable = this.f91295p;
                    }
                    c0102x1f44235b.m2840xc0bbc5af(drawable);
                } else {
                    c0102x1f44235b.m2840xc0bbc5af((android.graphics.drawable.Drawable) null);
                }
            }
            if ((i18 & 3) != 0) {
                h();
            }
            if ((i18 & 8) != 0) {
                if ((i17 & 8) != 0) {
                    c0102x1f44235b.mo2849x53bfe316(this.f91288i);
                    c0102x1f44235b.mo2846xfbc1ea9a(this.f91289j);
                } else {
                    c0102x1f44235b.mo2849x53bfe316((java.lang.CharSequence) null);
                    c0102x1f44235b.mo2846xfbc1ea9a((java.lang.CharSequence) null);
                }
            }
            if ((i18 & 16) == 0 || (view = this.f91283d) == null) {
                return;
            }
            if ((i17 & 16) != 0) {
                c0102x1f44235b.addView(view);
            } else {
                c0102x1f44235b.removeView(view);
            }
        }
    }

    public void e(int i17) {
        this.f91284e = i17 != 0 ? k.a.a(a(), i17) : null;
        h();
    }

    public void f(android.view.Menu menu, o.f0 f0Var) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91293n;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = this.f91280a;
        if (qVar == null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q(c0102x1f44235b.getContext());
            this.f91293n = qVar2;
            qVar2.f423231o = com.p314xaae8f345.mm.R.id.f564009fk;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar3 = this.f91293n;
        qVar3.f423227h = f0Var;
        o.r rVar = (o.r) menu;
        if (rVar == null && c0102x1f44235b.f91011d == null) {
            return;
        }
        c0102x1f44235b.d();
        o.r rVar2 = c0102x1f44235b.f91011d.f90869v;
        if (rVar2 == rVar) {
            return;
        }
        if (rVar2 != null) {
            rVar2.r(c0102x1f44235b.Q);
            rVar2.r(c0102x1f44235b.R);
        }
        if (c0102x1f44235b.R == null) {
            c0102x1f44235b.R = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2(c0102x1f44235b);
        }
        qVar3.f91212x = true;
        if (rVar != null) {
            rVar.b(qVar3, c0102x1f44235b.f91020p);
            rVar.b(c0102x1f44235b.R, c0102x1f44235b.f91020p);
        } else {
            qVar3.d(c0102x1f44235b.f91020p, null);
            c0102x1f44235b.R.d(c0102x1f44235b.f91020p, null);
            qVar3.c(true);
            c0102x1f44235b.R.c(true);
        }
        c0102x1f44235b.f91011d.m2631xa9dea67f(c0102x1f44235b.f91021q);
        c0102x1f44235b.f91011d.m2632x24cd7466(qVar3);
        c0102x1f44235b.Q = qVar3;
    }

    public n3.z1 g(int i17, long j17) {
        n3.z1 a17 = n3.l1.a(this.f91280a);
        a17.a(i17 == 0 ? 1.0f : 0.0f);
        a17.c(j17);
        a17.d(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y2(this, i17));
        return a17;
    }

    public final void h() {
        android.graphics.drawable.Drawable drawable;
        int i17 = this.f91281b;
        if ((i17 & 2) == 0) {
            drawable = null;
        } else if ((i17 & 1) != 0) {
            drawable = this.f91285f;
            if (drawable == null) {
                drawable = this.f91284e;
            }
        } else {
            drawable = this.f91284e;
        }
        this.f91280a.m2834x764cf52d(drawable);
    }
}
