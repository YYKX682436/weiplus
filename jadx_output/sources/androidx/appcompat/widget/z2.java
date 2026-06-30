package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class z2 implements androidx.appcompat.widget.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.Toolbar f9747a;

    /* renamed from: b, reason: collision with root package name */
    public int f9748b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f9749c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f9750d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9751e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9752f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9753g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f9755i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f9756j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f9757k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.Window.Callback f9758l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9759m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.q f9760n;

    /* renamed from: o, reason: collision with root package name */
    public int f9761o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9762p;

    public z2(androidx.appcompat.widget.Toolbar toolbar, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        this.f9761o = 0;
        this.f9747a = toolbar;
        this.f9755i = toolbar.getTitle();
        this.f9756j = toolbar.getSubtitle();
        this.f9754h = this.f9755i != null;
        this.f9753g = toolbar.getNavigationIcon();
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(toolbar.getContext(), null, j.a.f296173a, com.tencent.mm.R.attr.f478064o, 0);
        int i17 = 15;
        this.f9762p = l17.e(15);
        if (z17) {
            java.lang.CharSequence j17 = l17.j(27);
            if (!android.text.TextUtils.isEmpty(j17)) {
                this.f9754h = true;
                this.f9755i = j17;
                if ((this.f9748b & 8) != 0) {
                    toolbar.setTitle(j17);
                }
            }
            java.lang.CharSequence j18 = l17.j(25);
            if (!android.text.TextUtils.isEmpty(j18)) {
                this.f9756j = j18;
                if ((this.f9748b & 8) != 0) {
                    toolbar.setSubtitle(j18);
                }
            }
            android.graphics.drawable.Drawable e17 = l17.e(20);
            if (e17 != null) {
                this.f9752f = e17;
                h();
            }
            android.graphics.drawable.Drawable e18 = l17.e(17);
            if (e18 != null) {
                this.f9751e = e18;
                h();
            }
            if (this.f9753g == null && (drawable = this.f9762p) != null) {
                this.f9753g = drawable;
                if ((this.f9748b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            d(l17.h(10, 0));
            int i18 = l17.i(9, 0);
            if (i18 != 0) {
                c(android.view.LayoutInflater.from(toolbar.getContext()).inflate(i18, (android.view.ViewGroup) toolbar, false));
                d(this.f9748b | 16);
            }
            int layoutDimension = l17.f9693b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c17 = l17.c(7, -1);
            int c18 = l17.c(3, -1);
            if (c17 >= 0 || c18 >= 0) {
                int max = java.lang.Math.max(c17, 0);
                int max2 = java.lang.Math.max(c18, 0);
                if (toolbar.f9497z == null) {
                    toolbar.f9497z = new androidx.appcompat.widget.q1();
                }
                toolbar.f9497z.a(max, max2);
            }
            int i19 = l17.i(28, 0);
            if (i19 != 0) {
                android.content.Context context = toolbar.getContext();
                toolbar.f9489r = i19;
                android.widget.TextView textView = toolbar.f9479e;
                if (textView != null) {
                    textView.setTextAppearance(context, i19);
                }
            }
            int i27 = l17.i(26, 0);
            if (i27 != 0) {
                android.content.Context context2 = toolbar.getContext();
                toolbar.f9490s = i27;
                android.widget.TextView textView2 = toolbar.f9480f;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, i27);
                }
            }
            int i28 = l17.i(22, 0);
            if (i28 != 0) {
                toolbar.setPopupTheme(i28);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f9762p = toolbar.getNavigationIcon();
            } else {
                i17 = 11;
            }
            this.f9748b = i17;
        }
        l17.m();
        if (com.tencent.mm.R.string.f489772b9 != this.f9761o) {
            this.f9761o = com.tencent.mm.R.string.f489772b9;
            if (android.text.TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i29 = this.f9761o;
                java.lang.String string = i29 != 0 ? a().getString(i29) : null;
                this.f9757k = string;
                if ((this.f9748b & 4) != 0) {
                    if (android.text.TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f9761o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f9757k);
                    }
                }
            }
        }
        this.f9757k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new androidx.appcompat.widget.x2(this));
    }

    public android.content.Context a() {
        return this.f9747a.getContext();
    }

    public boolean b() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9747a.f9478d;
        if (actionMenuView == null) {
            return false;
        }
        androidx.appcompat.widget.q qVar = actionMenuView.f9340z;
        return qVar != null && qVar.l();
    }

    public void c(android.view.View view) {
        android.view.View view2 = this.f9750d;
        androidx.appcompat.widget.Toolbar toolbar = this.f9747a;
        if (view2 != null && (this.f9748b & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.f9750d = view;
        if (view == null || (this.f9748b & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    public void d(int i17) {
        android.view.View view;
        int i18 = this.f9748b ^ i17;
        this.f9748b = i17;
        if (i18 != 0) {
            int i19 = i18 & 4;
            androidx.appcompat.widget.Toolbar toolbar = this.f9747a;
            if (i19 != 0) {
                if ((i17 & 4) != 0 && (i17 & 4) != 0) {
                    if (android.text.TextUtils.isEmpty(this.f9757k)) {
                        toolbar.setNavigationContentDescription(this.f9761o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f9757k);
                    }
                }
                if ((this.f9748b & 4) != 0) {
                    android.graphics.drawable.Drawable drawable = this.f9753g;
                    if (drawable == null) {
                        drawable = this.f9762p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            if ((i18 & 3) != 0) {
                h();
            }
            if ((i18 & 8) != 0) {
                if ((i17 & 8) != 0) {
                    toolbar.setTitle(this.f9755i);
                    toolbar.setSubtitle(this.f9756j);
                } else {
                    toolbar.setTitle((java.lang.CharSequence) null);
                    toolbar.setSubtitle((java.lang.CharSequence) null);
                }
            }
            if ((i18 & 16) == 0 || (view = this.f9750d) == null) {
                return;
            }
            if ((i17 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public void e(int i17) {
        this.f9751e = i17 != 0 ? k.a.a(a(), i17) : null;
        h();
    }

    public void f(android.view.Menu menu, o.f0 f0Var) {
        androidx.appcompat.widget.q qVar = this.f9760n;
        androidx.appcompat.widget.Toolbar toolbar = this.f9747a;
        if (qVar == null) {
            androidx.appcompat.widget.q qVar2 = new androidx.appcompat.widget.q(toolbar.getContext());
            this.f9760n = qVar2;
            qVar2.f341698o = com.tencent.mm.R.id.f482476fk;
        }
        androidx.appcompat.widget.q qVar3 = this.f9760n;
        qVar3.f341694h = f0Var;
        o.r rVar = (o.r) menu;
        if (rVar == null && toolbar.f9478d == null) {
            return;
        }
        toolbar.d();
        o.r rVar2 = toolbar.f9478d.f9336v;
        if (rVar2 == rVar) {
            return;
        }
        if (rVar2 != null) {
            rVar2.r(toolbar.Q);
            rVar2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new androidx.appcompat.widget.u2(toolbar);
        }
        qVar3.f9679x = true;
        if (rVar != null) {
            rVar.b(qVar3, toolbar.f9487p);
            rVar.b(toolbar.R, toolbar.f9487p);
        } else {
            qVar3.d(toolbar.f9487p, null);
            toolbar.R.d(toolbar.f9487p, null);
            qVar3.c(true);
            toolbar.R.c(true);
        }
        toolbar.f9478d.setPopupTheme(toolbar.f9488q);
        toolbar.f9478d.setPresenter(qVar3);
        toolbar.Q = qVar3;
    }

    public n3.z1 g(int i17, long j17) {
        n3.z1 a17 = n3.l1.a(this.f9747a);
        a17.a(i17 == 0 ? 1.0f : 0.0f);
        a17.c(j17);
        a17.d(new androidx.appcompat.widget.y2(this, i17));
        return a17;
    }

    public final void h() {
        android.graphics.drawable.Drawable drawable;
        int i17 = this.f9748b;
        if ((i17 & 2) == 0) {
            drawable = null;
        } else if ((i17 & 1) != 0) {
            drawable = this.f9752f;
            if (drawable == null) {
                drawable = this.f9751e;
            }
        } else {
            drawable = this.f9751e;
        }
        this.f9747a.setLogo(drawable);
    }
}
