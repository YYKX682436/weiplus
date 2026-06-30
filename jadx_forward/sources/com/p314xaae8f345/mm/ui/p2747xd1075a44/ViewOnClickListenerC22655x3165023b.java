package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.WXActionMenuView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC22655x3165023b extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f293019q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f293020d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f293021e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f293022f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.MenuItem f293023g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f293024h;

    /* renamed from: i, reason: collision with root package name */
    public int f293025i;

    /* renamed from: m, reason: collision with root package name */
    public al5.p4 f293026m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Activity f293027n;

    /* renamed from: o, reason: collision with root package name */
    public final float f293028o;

    /* renamed from: p, reason: collision with root package name */
    public al5.o4 f293029p;

    public ViewOnClickListenerC22655x3165023b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getShowAsAction */
    private int m81488xc27d8d9b() {
        try {
            java.lang.reflect.Field declaredField = this.f293023g.getClass().getDeclaredField("mShowAsAction");
            declaredField.setAccessible(true);
            return ((java.lang.Integer) declaredField.get(this.f293023g)).intValue();
        } catch (java.lang.Exception unused) {
            return 2;
        }
    }

    /* renamed from: setMenuBackgroundColor */
    private void m81489x9780ebb4(int i17) {
        android.view.View view = this.f293022f;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    /* renamed from: setMenuBackgroundDrawble */
    private void m81490xf46205a8(android.graphics.drawable.Drawable drawable) {
        android.view.View view = this.f293022f;
        if (view == null || drawable == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public final void a(android.app.Activity activity, android.view.MenuItem menuItem, al5.o4 o4Var, al5.p4 p4Var) {
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.ImageView imageView2;
        this.f293027n = activity;
        this.f293026m = p4Var;
        this.f293029p = o4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "buildMMActionMenuView, menuCustomParam: %s.", o4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "initialize : itemData: %s.", menuItem);
        this.f293023g = menuItem;
        this.f293029p.getClass();
        this.f293025i = (int) ((32 * this.f293028o) + 0.5f);
        this.f293029p.getClass();
        m81489x9780ebb4(0);
        this.f293029p.getClass();
        m81490xf46205a8(null);
        this.f293029p.getClass();
        m81494x423c1ff(-1);
        this.f293029p.getClass();
        m81495x94ce89e5(-1.0f);
        this.f293029p.getClass();
        this.f293029p.getClass();
        m81491x764b6bfb(menuItem.getIcon());
        m81496x53bfe316(menuItem.getTitle());
        setId(menuItem.getItemId());
        setVisibility(menuItem.isVisible() ? 0 : 8);
        setEnabled(menuItem.isEnabled());
        menuItem.hasSubMenu();
        if (this.f293023g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, mItemData is null");
            return;
        }
        android.view.View view = this.f293022f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int m81488xc27d8d9b = m81488xc27d8d9b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, showAsAction: %s.", java.lang.Integer.valueOf(m81488xc27d8d9b));
        if ((m81488xc27d8d9b & 2) == 2 || (m81488xc27d8d9b & 1) == 1 || (m81488xc27d8d9b & 8) == 8) {
            if (this.f293023g.getIcon() != null && (imageView = this.f293021e) != null) {
                imageView.setVisibility(0);
                android.widget.TextView textView4 = this.f293020d;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle gone, menuIcon show.");
                return;
            }
            if (this.f293023g.getTitle() != null && (textView = this.f293020d) != null) {
                textView.setVisibility(0);
                android.widget.ImageView imageView3 = this.f293021e;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
                return;
            }
            android.widget.ImageView imageView4 = this.f293021e;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            android.widget.TextView textView5 = this.f293020d;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            android.view.View view2 = this.f293022f;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is all gone");
            return;
        }
        if ((m81488xc27d8d9b & 4) == 4 || (m81488xc27d8d9b & 0) == 0) {
            android.widget.ImageView imageView5 = this.f293021e;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (this.f293023g.getTitle() != null && (textView2 = this.f293020d) != null) {
                textView2.setVisibility(0);
                android.widget.ImageView imageView6 = this.f293021e;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
            return;
        }
        if (this.f293023g.getIcon() != null && (imageView2 = this.f293021e) != null) {
            imageView2.setVisibility(0);
            android.widget.TextView textView6 = this.f293020d;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle gone, menuIcon show.");
            return;
        }
        if (this.f293023g.getTitle() != null && (textView3 = this.f293020d) != null) {
            textView3.setVisibility(0);
            android.widget.ImageView imageView7 = this.f293021e;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
            return;
        }
        android.widget.ImageView imageView8 = this.f293021e;
        if (imageView8 != null) {
            imageView8.setVisibility(8);
        }
        android.widget.TextView textView7 = this.f293020d;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        android.view.View view3 = this.f293022f;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is all gone");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        al5.p4 p4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/WXActionMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f293022f && (p4Var = this.f293026m) != null) {
            p4Var.a(this.f293027n, this.f293023g);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/WXActionMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setIcon */
    public void m81491x764b6bfb(android.graphics.drawable.Drawable drawable) {
        this.f293024h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i17 = this.f293025i;
            if (intrinsicWidth > i17) {
                intrinsicHeight = (int) (intrinsicHeight * (i17 / intrinsicWidth));
                intrinsicWidth = i17;
            }
            if (intrinsicHeight > i17) {
                intrinsicWidth = (int) (intrinsicWidth * (i17 / intrinsicHeight));
            } else {
                i17 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i17);
        }
        m81492x52909cfa(drawable);
    }

    /* renamed from: setMenuIcon */
    public void m81492x52909cfa(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.f293021e;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: setMenuTitleText */
    public void m81493x7f10b7c4(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f293020d;
        if (textView != null) {
            textView.setText(charSequence);
            this.f293020d.setContentDescription(charSequence);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString()) || charSequence.toString().contains(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572462ba5))) {
            return;
        }
        this.f293021e.setContentDescription(((java.lang.Object) charSequence) + getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572462ba5));
    }

    /* renamed from: setMenuTitleTextColor */
    public void m81494x423c1ff(int i17) {
        android.widget.TextView textView = this.f293020d;
        if (textView == null || i17 <= 0) {
            return;
        }
        textView.setTextColor(i17);
    }

    /* renamed from: setMenuTitleTextSize */
    public void m81495x94ce89e5(float f17) {
        android.widget.TextView textView = this.f293020d;
        if (textView == null || f17 <= 0.0f) {
            return;
        }
        textView.setTextSize(f17);
    }

    /* renamed from: setTitle */
    public void m81496x53bfe316(java.lang.CharSequence charSequence) {
        m81493x7f10b7c4(charSequence);
    }

    public ViewOnClickListenerC22655x3165023b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f293020d = null;
        this.f293021e = null;
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f293028o = f17;
        this.f293025i = (int) ((f17 * 32.0f) + 0.5f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "mMaxIconSize : %s, mDefaultNormalActionbarHeight: %s.", java.lang.Integer.valueOf(this.f293025i), java.lang.Integer.valueOf(fp.a.b((android.app.Activity) context, (int) context.getResources().getDimension(context.getResources().getConfiguration().orientation == 2 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax : com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay))));
        setOnClickListener(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569444bd, this);
        this.f293022f = inflate;
        if (inflate.getLayoutParams() != null) {
            this.f293022f.getLayoutParams().width = -2;
            this.f293022f.getLayoutParams().height = -1;
        } else {
            this.f293022f.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -1));
        }
        this.f293020d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jgj);
        this.f293021e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jgr);
        com.p314xaae8f345.mm.ui.f.b(this.f293020d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
    }
}
