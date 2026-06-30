package zl1;

/* loaded from: classes7.dex */
public class t extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f555147q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final zl1.b0 f555148d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f555149e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f555150f;

    /* renamed from: g, reason: collision with root package name */
    public int f555151g;

    /* renamed from: h, reason: collision with root package name */
    public int f555152h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f555153i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f555154m;

    /* renamed from: n, reason: collision with root package name */
    public int f555155n;

    /* renamed from: o, reason: collision with root package name */
    public zl1.s f555156o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f555157p;

    public t(android.content.Context context) {
        super(context);
        this.f555155n = 0;
        this.f555157p = new java.util.LinkedList();
        this.f555153i = new java.util.LinkedList();
        this.f555154m = new java.util.LinkedList();
        this.f555148d = new zl1.b0();
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f555149e = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        addView(linearLayout);
    }

    public static int c(android.content.Context context, int i17) {
        return java.lang.Math.round(context.getResources().getDisplayMetrics().density * i17);
    }

    public void a() {
        clearAnimation();
        java.util.LinkedList linkedList = this.f555157p;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).cancel();
        }
        linkedList.clear();
    }

    public int b(java.lang.String str) {
        zl1.r rVar;
        java.util.LinkedList linkedList = this.f555153i;
        java.lang.String a17 = nf.z.a(str);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (zl1.r) it.next();
            if (nf.z.a(rVar.f555138a).equals(a17)) {
                break;
            }
        }
        return linkedList.indexOf(rVar);
    }

    public void d(boolean z17) {
        android.widget.FrameLayout frameLayout;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new zl1.l(this, z17));
            return;
        }
        if (getParent() instanceof zl1.q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2) ((zl1.q) getParent());
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = l2Var.f168379d;
                if (!"top".equals(y1Var.m52223xe6eebdcb().m52167x3d3d7e0d().e().f387216a) && (frameLayout = y1Var.f168799l1) != null && (frameLayout.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) y1Var.f168799l1.getLayoutParams();
                    layoutParams.removeRule(2);
                    layoutParams.addRule(12);
                    y1Var.f168804y0.bringToFront();
                    y1Var.f168799l1.requestLayout();
                }
            } else {
                l2Var.getClass();
            }
        }
        if (!z17) {
            setVisibility(8);
            if (getParent() instanceof zl1.q) {
                ((zl1.q) getParent()).getClass();
                return;
            }
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        fArr[1] = getHeight() * ("top".equals(this.f555150f) ? -1 : 1);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "translationY", fArr);
        ofFloat.setDuration(250L);
        zl1.m mVar = new zl1.m(this);
        a();
        this.f555157p.add(ofFloat);
        ofFloat.addListener(new zl1.a(this, mVar, ofFloat));
        ofFloat.start();
    }

    public final void e(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void f(int i17) {
        java.util.LinkedList linkedList = this.f555153i;
        ((zl1.r) linkedList.get(this.f555155n)).f555142e = false;
        if (i17 <= 0 || i17 >= linkedList.size()) {
            this.f555155n = 0;
        } else {
            this.f555155n = i17;
        }
        ((zl1.r) linkedList.get(this.f555155n)).f555142e = true;
        e(new zl1.b(this));
    }

    public final void g(android.view.View view, zl1.r rVar) {
        android.widget.RelativeLayout relativeLayout;
        int i17;
        java.lang.String str;
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.a0b);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a0c);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a0a);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a0f);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a0g);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.a0e);
        boolean E = i65.a.E(getContext());
        if ("top".equals(this.f555150f)) {
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, (int) (c(getContext(), 40) * i65.a.m(getContext())), 1.0f));
            imageView.setVisibility(8);
            textView2.setTextSize(0, c(getContext(), 14) * i65.a.m(getContext()));
            if (rVar.f555142e) {
                findViewById.setBackgroundColor(this.f555152h);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                relativeLayout = relativeLayout2;
                i17 = 0;
                str = "top";
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                relativeLayout = relativeLayout2;
                i17 = 0;
                str = "top";
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            relativeLayout = relativeLayout2;
            i17 = 0;
            str = "top";
            if (rVar.f555139b.a() != null) {
                java.lang.String str2 = rVar.f555141d;
                if (str2 == null || str2.equals("")) {
                    view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, (int) (c(getContext(), 48) * i65.a.m(getContext())), 1.0f));
                    imageView.setVisibility(0);
                    int b17 = E ? i65.a.b(getContext(), 34) : i65.a.b(getContext(), 28);
                    imageView.getLayoutParams().width = b17;
                    imageView.getLayoutParams().height = b17;
                    textView2.setVisibility(8);
                } else {
                    view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, (int) (c(getContext(), 56) * i65.a.m(getContext())), 1.0f));
                    imageView.setVisibility(0);
                    int b18 = E ? i65.a.b(getContext(), 34) : i65.a.b(getContext(), 28);
                    imageView.getLayoutParams().width = b18;
                    imageView.getLayoutParams().height = b18;
                    textView2.setVisibility(0);
                    textView2.setTextSize(0, c(getContext(), 12) * i65.a.m(getContext()));
                }
            } else {
                java.lang.String str3 = rVar.f555141d;
                if (str3 != null && !str3.equals("")) {
                    view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, (int) (c(getContext(), 49) * i65.a.m(getContext())), 1.0f));
                    imageView.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setTextSize(0, c(getContext(), 16) * i65.a.m(getContext()));
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.graphics.drawable.Drawable background = textView.getBackground();
        if (background != null) {
            background.setColorFilter(rVar.f555145h, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        textView.setVisibility(rVar.f555144g.isEmpty() ? 4 : i17);
        textView.setText(rVar.f555144g);
        textView.setTextColor(rVar.f555146i);
        if (!rVar.f555143f) {
            i17 = 4;
        }
        imageView2.setVisibility(i17);
        if (!rVar.f555142e || rVar.f555140c.a() == null) {
            rVar.f555139b.f555164f = new zl1.d(this, imageView);
            rVar.f555139b.b();
        } else {
            rVar.f555140c.f555164f = new zl1.c(this, imageView);
            rVar.f555140c.b();
        }
        textView2.setText(rVar.f555141d);
        if (rVar.f555142e) {
            textView2.setTextColor(this.f555152h);
        } else {
            textView2.setTextColor(this.f555151g);
        }
        if (str.equals(this.f555150f)) {
            return;
        }
        textView2.post(new zl1.e(this, E, textView2, imageView, textView, relativeLayout, imageView2));
    }

    /* renamed from: getPosition */
    public java.lang.String m179083xa86cd69f() {
        return this.f555150f;
    }

    public final void h(int i17, java.lang.String str, zl1.y yVar, zl1.y yVar2, boolean z17) {
        java.util.LinkedList linkedList = this.f555153i;
        if (i17 >= linkedList.size()) {
            return;
        }
        zl1.r rVar = (zl1.r) linkedList.get(i17);
        if (str == null) {
            str = rVar.f555141d;
        }
        rVar.f555141d = str;
        if (yVar != null && (yVar.a() != null || z17)) {
            rVar.f555139b = yVar;
        }
        if (yVar2 != null && (yVar2.a() != null || z17)) {
            rVar.f555140c = yVar2;
        }
        e(new zl1.b(this));
    }

    public void i(boolean z17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new zl1.n(this, z17));
            return;
        }
        if (getParent() instanceof zl1.q) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2) ((zl1.q) getParent())).f168379d.f168804y0.bringToFront();
        }
        if (!z17) {
            setVisibility(0);
            setTranslationY(0.0f);
            if (getParent() instanceof zl1.q) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l2) ((zl1.q) getParent())).a(this, false);
                return;
            }
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = getHeight() * ("top".equals(this.f555150f) ? -1 : 1);
        fArr[1] = 0.0f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "translationY", fArr);
        ofFloat.setDuration(250L);
        post(new zl1.p(this, ofFloat));
    }

    /* renamed from: setClickListener */
    public void m179084xa2b9091a(zl1.s sVar) {
        this.f555156o = sVar;
    }

    /* renamed from: setPosition */
    public void m179085xa32537ab(java.lang.String str) {
        this.f555150f = str;
    }
}
