package ab5;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.ui.widget.dialog.k2 implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public final int f2935d;

    /* renamed from: e, reason: collision with root package name */
    public int f2936e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2937f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f2938g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f2939h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f2940i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f2941m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f2942n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f2943o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f2944p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f2945q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f2946r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f2947s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f2948t;

    /* renamed from: u, reason: collision with root package name */
    public ab5.g f2949u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.CompoundButton.OnCheckedChangeListener f2950v;

    public i(android.content.Context context, int i17, java.lang.String str) {
        super(context, com.tencent.mm.R.style.f494618rs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f2948t = arrayList;
        ab5.d dVar = new ab5.d(this);
        this.f2950v = new ab5.e(this);
        this.f2935d = i17;
        this.f2936e = 0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f2937f = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(str, 0) || ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(str, 1) || ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(str, 2);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488426sz, (android.view.ViewGroup) null);
        this.f2938g = linearLayout;
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.bhw);
        this.f2939h = imageView;
        imageView.setColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.f2938g.findViewById(com.tencent.mm.R.id.bhv);
        this.f2940i = imageView2;
        imageView2.setColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
        setCanceledOnTouchOutside(true);
        if (i17 != 0) {
            ((android.view.ViewStub) this.f2938g.findViewById(com.tencent.mm.R.id.f483634bi5)).inflate();
            this.f2945q = (android.widget.TextView) this.f2938g.findViewById(com.tencent.mm.R.id.f483633bi4);
            this.f2946r = (android.widget.TextView) this.f2938g.findViewById(com.tencent.mm.R.id.f483631bi2);
            this.f2947s = (android.widget.TextView) this.f2938g.findViewById(com.tencent.mm.R.id.f483632bi3);
            if (this.f2937f) {
                this.f2945q.setOnClickListener(dVar);
            } else {
                this.f2945q.setVisibility(8);
            }
            this.f2946r.setOnClickListener(dVar);
            this.f2947s.setOnClickListener(dVar);
            return;
        }
        ((android.view.ViewStub) this.f2938g.findViewById(com.tencent.mm.R.id.f483630bi1)).inflate();
        this.f2941m = (android.widget.Button) this.f2938g.findViewById(com.tencent.mm.R.id.bi7);
        this.f2942n = (android.view.ViewGroup) this.f2938g.findViewById(com.tencent.mm.R.id.f483629bi0);
        this.f2943o = (android.widget.TextView) this.f2938g.findViewById(com.tencent.mm.R.id.bhx);
        this.f2944p = (android.widget.TextView) this.f2938g.findViewById(com.tencent.mm.R.id.bhy);
        this.f2941m.setOnClickListener(dVar);
        this.f2943o.setOnClickListener(dVar);
        this.f2944p.setOnClickListener(dVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.content.Context context2 = this.f2938g.getContext();
        arrayList2.add(new ab5.h(this, 1, context2.getString(com.tencent.mm.R.string.b0s), false));
        arrayList2.add(new ab5.h(this, 2, context2.getString(com.tencent.mm.R.string.b0r), false));
        arrayList2.add(new ab5.h(this, 3, context2.getString(com.tencent.mm.R.string.b0t), false));
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNoticeMoreDialog", "has no reason data");
            return;
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        android.content.Context context3 = this.f2938g.getContext();
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context3);
        int i18 = 0;
        while (i18 < arrayList2.size() / 3) {
            linearLayout2.setOrientation(0);
            for (int i19 = 0; i19 < 3; i19++) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, context3.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479895i8));
                com.tencent.mm.plugin.voip.widget.MMCheckBox c17 = c(context3, (ab5.h) arrayList2.get((i18 * 3) + i19));
                if (i19 != 0) {
                    layoutParams.leftMargin = context3.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
                }
                linearLayout2.addView(c17, layoutParams);
            }
            i18++;
        }
        this.f2942n.addView(linearLayout2);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(context3);
        int i27 = 0;
        while (true) {
            int i28 = i18 * 3;
            if (i27 >= arrayList2.size() - i28) {
                this.f2942n.addView(linearLayout3);
                return;
            }
            ab5.h hVar = (ab5.h) arrayList2.get(i28 + i27);
            linearLayout3.setOrientation(0);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, context3.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479895i8));
            com.tencent.mm.plugin.voip.widget.MMCheckBox c18 = c(context3, hVar);
            if (i27 != 0) {
                layoutParams2.leftMargin = context3.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
            }
            linearLayout3.addView(c18, layoutParams2);
            i27++;
        }
    }

    public final com.tencent.mm.plugin.voip.widget.MMCheckBox c(android.content.Context context, ab5.h hVar) {
        com.tencent.mm.plugin.voip.widget.MMCheckBox mMCheckBox = new com.tencent.mm.plugin.voip.widget.MMCheckBox(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f493928t), null, com.tencent.mm.R.style.f493928t);
        mMCheckBox.setText(hVar.f2933b);
        mMCheckBox.setTag(hVar);
        mMCheckBox.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479925j4));
        mMCheckBox.setOnCheckedChangeListener(this.f2950v);
        return mMCheckBox;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new ab5.f(this));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNoticeMoreDialog", com.tencent.mm.sdk.platformtools.z3.b(true));
        } else {
            try {
                super.dismiss();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNoticeMoreDialog", "dismiss exception, e = " + e17.getMessage());
            }
        }
    }

    public void e(android.view.View view) {
        int f17;
        android.content.Context context = view.getContext();
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
        if (this.f2935d == 0) {
            f17 = i65.a.f(context, com.tencent.mm.R.dimen.f480212rj) + i65.a.f(context, com.tencent.mm.R.dimen.f480208rf) + i65.a.f(context, com.tencent.mm.R.dimen.f480207re);
        } else {
            f17 = i65.a.f(context, com.tencent.mm.R.dimen.f480215rm) + i65.a.f(context, com.tencent.mm.R.dimen.f480208rf) + i65.a.f(context, com.tencent.mm.R.dimen.f480207re);
            if (!this.f2937f) {
                f17 -= i65.a.f(context, com.tencent.mm.R.dimen.f480217ro);
            }
        }
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 8388661;
            attributes.verticalMargin = 0.0f;
            attributes.horizontalMargin = 0.0f;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            attributes.x = (((h17.x - iArr[0]) - (view.getMeasuredWidth() / 2)) - i65.a.f(context, com.tencent.mm.R.dimen.f480206rd)) - (i65.a.f(context, com.tencent.mm.R.dimen.f480208rf) / 2);
            int q17 = com.tencent.mm.ui.bk.q(context);
            int f18 = i65.a.f(context, com.tencent.mm.R.dimen.f480214rl);
            int f19 = i65.a.f(context, com.tencent.mm.R.dimen.f480209rg);
            if ((((iArr[1] + view.getMeasuredHeight()) + f17) + f18) - f19 > h17.y - com.tencent.mm.ui.bk.j(context)) {
                attributes.y = (((iArr[1] - q17) - f17) - f18) + f19;
                this.f2939h.setVisibility(8);
                this.f2940i.setVisibility(0);
            } else {
                attributes.y = (((iArr[1] - q17) + view.getMeasuredHeight()) + f18) - f19;
                this.f2939h.setVisibility(0);
                this.f2940i.setVisibility(8);
            }
            window.setAttributes(attributes);
        }
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNoticeMoreDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f2938g);
    }
}
