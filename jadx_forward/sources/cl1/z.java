package cl1;

/* loaded from: classes7.dex */
public class z extends cl1.a {

    /* renamed from: p, reason: collision with root package name */
    public static final l01.r f124435p = new l01.n0();

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f124436e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f124437f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f124438g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f124439h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f124440i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f124441m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f124442n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f124443o;

    public z(android.view.View view) {
        super(view);
        this.f124436e = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.h68);
        this.f124437f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f124438g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566821h62);
        this.f124439h = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f566831h75);
        this.f124440i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f124441m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o2y);
        this.f124442n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nhu);
        this.f124443o = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_2);
    }

    @Override // cl1.a
    public void i(android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        j();
        android.widget.ImageView imageView = this.f124437f;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        android.view.View view = this.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder", "onBind", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder", "onBind", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f124440i;
        textView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = this.f124382d.f124421a;
        l01.r rVar = f124435p;
        android.widget.TextView textView2 = this.f124441m;
        if (c11714x918fd2e4 == null) {
            l01.d0.f396294a.b(imageView, "", l01.a.h(), rVar);
            textView2.setVisibility(8);
            textView.setText("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandItemHolder", "item info is null!");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157900m)) {
            textView.setText(this.f124382d.f124421a.f157900m);
            textView.setVisibility(0);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f124382d.f124421a.f157898h)) {
            textView.setText(this.f124382d.f124421a.f157898h);
            textView.setVisibility(0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f124382d.f124421a.f157894d)) {
            textView.setVisibility(0);
            textView.setText("");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = this.f124382d.f124421a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandItemHolder", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", c11714x918fd2e42.f157894d, c11714x918fd2e42.f157895e);
            textView.setVisibility(0);
            textView.setText(this.f124382d.f124421a.f157894d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e43 = this.f124382d.f124421a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandItemHolder", "ccf-log [onBindViewHolder] name=%s iconUrl=%s", c11714x918fd2e43.f157898h, c11714x918fd2e43.f157901n);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f124382d.f124421a.f157901n)) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f396294a.b(imageView, this.f124382d.f124421a.f157901n, l01.a.h(), rVar);
        }
        ft.k kVar = (ft.k) i95.n0.c(ft.k.class);
        textView2.setVisibility(8);
        android.widget.ImageView imageView2 = this.f124443o;
        imageView2.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f124382d.f124421a.f157907t)) {
            int i17 = this.f124382d.f124421a.f157896f;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.e0) kVar).getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(i17))) {
                textView2.setVisibility(0);
                textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(this.f124382d.f124421a.f157896f));
            } else if (this.f124382d.f124421a.f157905r) {
                imageView2.setVisibility(0);
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
                android.graphics.Paint paint = shapeDrawable.getPaint();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + com.p314xaae8f345.mm.ui.bk.C());
                paint.setColor((com.p314xaae8f345.mm.ui.bk.C() ? sk3.d.f490488f : sk3.d.f490489g).f490493d);
                imageView2.setBackground(shapeDrawable);
                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78448xc99fb831);
            }
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f124382d.f124421a.f157907t);
        }
        this.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.cvq, new rl5.r(k(), this.f3639x46306858));
        this.f3639x46306858.setOnClickListener(onClickListener);
        if (onLongClickListener == null) {
            this.f3639x46306858.setHapticFeedbackEnabled(false);
        } else {
            this.f3639x46306858.setOnLongClickListener(onLongClickListener);
        }
        android.view.View view2 = this.f3639x46306858;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = textView.getText().toString();
        objArr[1] = textView2.getVisibility() == 0 ? textView2.getText().toString() : "";
        view2.setContentDescription(java.lang.String.format("%s,%s", objArr));
    }

    public final void j() {
        int f17 = (int) (i65.a.f(r0, com.p314xaae8f345.mm.R.C30860x5b28f31.f561574md) * com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y.c(k()));
        android.view.ViewGroup.LayoutParams layoutParams = this.f3639x46306858.getLayoutParams();
        android.content.Context k17 = k();
        layoutParams.width = k17 == null ? 0 : (int) (i65.a.f(k17, com.p314xaae8f345.mm.R.C30860x5b28f31.f561578mh) * cl1.k.a(k17));
        android.widget.RelativeLayout relativeLayout = this.f124436e;
        relativeLayout.getLayoutParams().width = f17;
        relativeLayout.getLayoutParams().height = f17;
        android.widget.ImageView imageView = this.f124437f;
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    public final android.content.Context k() {
        return this.f3639x46306858.getContext();
    }
}
