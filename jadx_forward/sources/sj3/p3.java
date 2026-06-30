package sj3;

/* loaded from: classes4.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f490218d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f490219e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f490220f;

    /* renamed from: g, reason: collision with root package name */
    public int f490221g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f490222h;

    /* renamed from: i, reason: collision with root package name */
    public final int f490223i;

    /* renamed from: m, reason: collision with root package name */
    public final int f490224m;

    /* renamed from: n, reason: collision with root package name */
    public final int f490225n;

    /* renamed from: o, reason: collision with root package name */
    public final int f490226o;

    /* renamed from: p, reason: collision with root package name */
    public int f490227p;

    public p3(android.app.Activity activity) {
        int i17 = sj3.i1.f490090b;
        this.f490224m = i17;
        int i18 = sj3.i1.f490089a;
        int i19 = i17 + i18;
        this.f490225n = i19;
        int i27 = i17 * 2;
        int i28 = i18 + i27;
        this.f490226o = i28;
        int i29 = i17 * 4;
        android.content.Context baseContext = activity.getBaseContext();
        this.f490218d = baseContext;
        int B = i65.a.B(baseContext) - (i29 * 2);
        this.f490222h = (B - (i19 * 10)) / 5;
        this.f490223i = (B - (i28 * 10)) / 5;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activity.findViewById(com.p314xaae8f345.mm.R.id.a9w);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.topMargin = i27;
        layoutParams.bottomMargin = i27;
        layoutParams.leftMargin = i29;
        layoutParams.rightMargin = i29;
        linearLayout.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(baseContext);
        this.f490219e = linearLayout2;
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(baseContext);
        this.f490220f = linearLayout3;
        linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        linearLayout3.setLayoutParams(layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(baseContext);
        relativeLayout.addView(linearLayout3);
        relativeLayout.setLayoutParams(layoutParams3);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(relativeLayout);
    }

    public void a(java.lang.String str) {
        this.f490221g++;
        android.widget.ImageView imageView = new android.widget.ImageView(this.f490218d);
        imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        imageView.setTag(str);
        imageView.setOnClickListener(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        if (this.f490221g <= 5) {
            this.f490219e.addView(imageView);
        } else {
            this.f490220f.addView(imageView);
        }
        d(this.f490221g);
        c(this.f490221g);
    }

    public void b(java.lang.String str) {
        android.widget.LinearLayout linearLayout;
        boolean z17;
        boolean z18;
        if (this.f490221g == 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            linearLayout = this.f490219e;
            if (i17 >= linearLayout.getChildCount()) {
                i17 = -1;
                z17 = false;
                break;
            } else {
                if (linearLayout.getChildAt(i17).getTag().equals(str)) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        android.widget.LinearLayout linearLayout2 = this.f490220f;
        if (i17 < 0) {
            for (int i18 = 0; i18 < linearLayout2.getChildCount(); i18++) {
                if (linearLayout2.getChildAt(i18).getTag().equals(str)) {
                    z18 = true;
                    i17 = i18;
                    break;
                }
            }
        }
        z18 = false;
        if (i17 < 0) {
            return;
        }
        if (z18) {
            linearLayout2.removeViewAt(i17);
            this.f490221g--;
        }
        if (z17) {
            if (this.f490221g <= 5) {
                linearLayout.removeViewAt(i17);
                this.f490221g--;
            } else {
                linearLayout.removeViewAt(i17);
                android.view.View childAt = linearLayout2.getChildAt(0);
                linearLayout2.removeViewAt(0);
                linearLayout.addView(childAt);
                this.f490221g--;
            }
        }
        d(this.f490221g);
        c(this.f490221g);
    }

    public final void c(int i17) {
        int i18;
        int i19;
        int i27 = this.f490223i;
        android.widget.LinearLayout linearLayout = this.f490220f;
        android.widget.LinearLayout linearLayout2 = this.f490219e;
        int i28 = 0;
        if (i17 > 5) {
            int i29 = 0;
            while (true) {
                int childCount = linearLayout2.getChildCount();
                i18 = this.f490226o;
                if (i29 >= childCount) {
                    break;
                }
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getChildAt(i29).getLayoutParams();
                layoutParams.width = i27;
                layoutParams.height = i27;
                layoutParams.rightMargin = i18;
                layoutParams.leftMargin = i18;
                i29++;
            }
            while (i28 < linearLayout.getChildCount()) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout.getChildAt(i28).getLayoutParams();
                layoutParams2.width = i27;
                layoutParams2.height = i27;
                layoutParams2.rightMargin = i18;
                layoutParams2.leftMargin = i18;
                i28++;
            }
            return;
        }
        int i37 = 0;
        while (true) {
            int childCount2 = linearLayout2.getChildCount();
            i19 = this.f490225n;
            if (i37 >= childCount2) {
                break;
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) linearLayout2.getChildAt(i37).getLayoutParams();
            int i38 = this.f490222h;
            layoutParams3.width = i38;
            layoutParams3.height = i38;
            layoutParams3.rightMargin = i19;
            layoutParams3.leftMargin = i19;
            i37++;
        }
        while (i28 < linearLayout.getChildCount()) {
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) linearLayout.getChildAt(i28).getLayoutParams();
            layoutParams4.width = i27;
            layoutParams4.height = i27;
            layoutParams4.rightMargin = i19;
            layoutParams4.leftMargin = i19;
            i28++;
        }
    }

    public final void d(int i17) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f490219e.getLayoutParams();
        android.widget.LinearLayout linearLayout = this.f490220f;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (i17 <= 5) {
            layoutParams.height = this.f490222h;
            linearLayout.setVisibility(8);
            return;
        }
        int i18 = this.f490223i;
        layoutParams.height = i18;
        int i19 = this.f490224m;
        layoutParams.topMargin = i19 * 2;
        layoutParams.bottomMargin = i19 * 2;
        linearLayout.setVisibility(0);
        layoutParams2.height = i18;
        layoutParams2.topMargin = i19 * 2;
        layoutParams2.bottomMargin = i19 * 2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSelectContactGallery", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f490227p++;
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSelectContactGallery", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
