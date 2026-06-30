package cl1;

/* loaded from: classes7.dex */
public class z extends cl1.a {

    /* renamed from: p, reason: collision with root package name */
    public static final l01.r f42902p = new l01.n0();

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f42903e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f42904f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f42905g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f42906h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f42907i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f42908m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f42909n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f42910o;

    public z(android.view.View view) {
        super(view);
        this.f42903e = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.h68);
        this.f42904f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n);
        this.f42905g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485288h62);
        this.f42906h = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485298h75);
        this.f42907i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f42908m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o2y);
        this.f42909n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nhu);
        this.f42910o = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h_2);
    }

    @Override // cl1.a
    public void i(android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        j();
        android.widget.ImageView imageView = this.f42904f;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        android.view.View view = this.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder", "onBind", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder", "onBind", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f42907i;
        textView.setVisibility(0);
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f42849d.f42888a;
        l01.r rVar = f42902p;
        android.widget.TextView textView2 = this.f42908m;
        if (localUsageInfo == null) {
            l01.d0.f314761a.b(imageView, "", l01.a.h(), rVar);
            textView2.setVisibility(8);
            textView.setText("");
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandItemHolder", "item info is null!");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76367m)) {
            textView.setText(this.f42849d.f42888a.f76367m);
            textView.setVisibility(0);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f42849d.f42888a.f76365h)) {
            textView.setText(this.f42849d.f42888a.f76365h);
            textView.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f42849d.f42888a.f76361d)) {
            textView.setVisibility(0);
            textView.setText("");
        } else {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = this.f42849d.f42888a;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandItemHolder", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", localUsageInfo2.f76361d, localUsageInfo2.f76362e);
            textView.setVisibility(0);
            textView.setText(this.f42849d.f42888a.f76361d);
        }
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo3 = this.f42849d.f42888a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandItemHolder", "ccf-log [onBindViewHolder] name=%s iconUrl=%s", localUsageInfo3.f76365h, localUsageInfo3.f76368n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f42849d.f42888a.f76368n)) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f314761a.b(imageView, this.f42849d.f42888a.f76368n, l01.a.h(), rVar);
        }
        ft.k kVar = (ft.k) i95.n0.c(ft.k.class);
        textView2.setVisibility(8);
        android.widget.ImageView imageView2 = this.f42910o;
        imageView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f42849d.f42888a.f76374t)) {
            int i17 = this.f42849d.f42888a.f76363f;
            ((com.tencent.mm.feature.appbrand.support.e0) kVar).getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.appcache.p.a(i17))) {
                textView2.setVisibility(0);
                textView2.setText(com.tencent.mm.plugin.appbrand.appcache.p.a(this.f42849d.f42888a.f76363f));
            } else if (this.f42849d.f42888a.f76372r) {
                imageView2.setVisibility(0);
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
                android.graphics.Paint paint = shapeDrawable.getPaint();
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + com.tencent.mm.ui.bk.C());
                paint.setColor((com.tencent.mm.ui.bk.C() ? sk3.d.f408955f : sk3.d.f408956g).f408960d);
                imageView2.setBackground(shapeDrawable);
                imageView2.setImageResource(com.tencent.mm.R.raw.app_brand_destop_view_third_party_running_flag);
            }
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f42849d.f42888a.f76374t);
        }
        this.itemView.setTag(com.tencent.mm.R.id.cvq, new rl5.r(k(), this.itemView));
        this.itemView.setOnClickListener(onClickListener);
        if (onLongClickListener == null) {
            this.itemView.setHapticFeedbackEnabled(false);
        } else {
            this.itemView.setOnLongClickListener(onLongClickListener);
        }
        android.view.View view2 = this.itemView;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = textView.getText().toString();
        objArr[1] = textView2.getVisibility() == 0 ? textView2.getText().toString() : "";
        view2.setContentDescription(java.lang.String.format("%s,%s", objArr));
    }

    public final void j() {
        int f17 = (int) (i65.a.f(r0, com.tencent.mm.R.dimen.f480041md) * com.tencent.mm.plugin.appbrand.widget.recent.y.c(k()));
        android.view.ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        android.content.Context k17 = k();
        layoutParams.width = k17 == null ? 0 : (int) (i65.a.f(k17, com.tencent.mm.R.dimen.f480045mh) * cl1.k.a(k17));
        android.widget.RelativeLayout relativeLayout = this.f42903e;
        relativeLayout.getLayoutParams().width = f17;
        relativeLayout.getLayoutParams().height = f17;
        android.widget.ImageView imageView = this.f42904f;
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    public final android.content.Context k() {
        return this.itemView.getContext();
    }
}
