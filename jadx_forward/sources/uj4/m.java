package uj4;

/* loaded from: classes5.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f509975d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f509976e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f509977f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f509978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f509975d = jz5.h.b(uj4.k.f509972d);
    }

    public final void O6() {
        android.view.ViewGroup viewGroup;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        java.lang.ref.WeakReference weakReference2 = this.f509977f;
        if (weakReference2 == null || (viewGroup = (android.view.ViewGroup) weakReference2.get()) == null || (weakReference = this.f509978g) == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public final void P6(android.view.ViewGroup viewGroup, java.lang.String str) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (!((java.lang.Boolean) ((jz5.n) this.f509975d).mo141623x754a37bb()).booleanValue() || viewGroup == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, en1.a.a()) || this.f509976e) {
            return;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LIKE_EDUCATION_SHOWED_INT;
        int r17 = c17.r(u3Var, 0);
        if (r17 < 3) {
            this.f509976e = true;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(m158354x19263085());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(android.graphics.Color.parseColor("#4d000000"));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(m158354x19263085());
            c22789xd23e9a9b.o(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20317xb8a521db()) == 1);
            int dimension = (int) m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(dimension, dimension);
            layoutParams2.gravity = 17;
            linearLayout.addView(c22789xd23e9a9b, layoutParams2);
            android.widget.TextView textView = new android.widget.TextView(m158354x19263085());
            textView.setText(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwx));
            textView.setTextColor(-1);
            textView.setTextSize(1, 20.0f);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = (int) m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            layoutParams3.gravity = 17;
            linearLayout.addView(textView, layoutParams3);
            c22789xd23e9a9b.m82583xcde73672(-1);
            android.content.res.AssetManager assets = m80379x76847179().getAssets();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
            c22789xd23e9a9b.k(assets, "finder_full_like_guide.pag");
            c22789xd23e9a9b.g();
            if (viewGroup instanceof android.widget.FrameLayout) {
                android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams4.gravity = 17;
                layoutParams = layoutParams4;
            } else if (viewGroup instanceof android.widget.RelativeLayout) {
                android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams5.addRule(13, -1);
                layoutParams = layoutParams5;
            } else {
                layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            }
            viewGroup.addView(linearLayout, layoutParams);
            linearLayout.setClickable(false);
            linearLayout.setOnTouchListener(new uj4.l(viewGroup, linearLayout));
            this.f509977f = new java.lang.ref.WeakReference(viewGroup);
            this.f509978g = new java.lang.ref.WeakReference(linearLayout);
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        }
    }
}
