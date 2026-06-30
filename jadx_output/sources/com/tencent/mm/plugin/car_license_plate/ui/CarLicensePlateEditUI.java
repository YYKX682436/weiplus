package com.tencent.mm.plugin.car_license_plate.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI;", "Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "<init>", "()V", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes7.dex */
public final class CarLicensePlateEditUI extends com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateBaseActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f94609i = 0;

    /* renamed from: e, reason: collision with root package name */
    public rt1.l f94610e;

    /* renamed from: f, reason: collision with root package name */
    public rt1.p f94611f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f94612g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f94613h;

    public final boolean T6() {
        java.lang.String str = this.f94613h;
        return !(str == null || str.length() == 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (T6()) {
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        } else {
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488265oj;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        cf.b.b(this, 10);
        cf.b.b(this, 1);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        android.content.Intent intent = getIntent();
        this.f94613h = intent != null ? intent.getStringExtra("INTENT_KEY_DEFAULT_PLATE_TEXT") : null;
        if (T6()) {
            overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        } else {
            overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        android.widget.TextView textView;
        super.onPostCreate(bundle);
        getController().G0(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getController().E0(b3.l.getColor(this, com.tencent.mm.R.color.BW_97));
        getContentView().setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.f483482b02);
        int i17 = T6() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new rt1.q(this));
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.azy);
        int i18 = T6() ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setOnClickListener(new rt1.r(this));
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.b0k);
        kotlin.jvm.internal.o.d(findViewById3);
        this.f94612g = findViewById3;
        findViewById3.setEnabled(false);
        findViewById3.setOnClickListener(new rt1.s(this));
        rt1.p pVar = new rt1.p();
        android.view.View findViewById4 = getContentView().findViewById(com.tencent.mm.R.id.b6v);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById4;
        pVar.f399467b = relativeLayout;
        android.content.Context context = relativeLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pVar.f399466a = context;
        this.f94611f = pVar;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getContentView().findViewById(com.tencent.mm.R.id.hwg);
        kotlin.jvm.internal.o.d(linearLayout);
        rt1.l lVar = new rt1.l(this, linearLayout);
        this.f94610e = lVar;
        rt1.p pVar2 = this.f94611f;
        if (pVar2 == null) {
            kotlin.jvm.internal.o.o("keyboardController");
            throw null;
        }
        pVar2.f399468c = lVar;
        lVar.f399446c = new rt1.t(this);
        java.lang.String str = this.f94613h;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.ui.xb xbVar = new com.tencent.mm.ui.xb(lVar.f399444a, com.tencent.mm.R.style.f494087du);
        lVar.f399449f = new android.widget.TextView[8];
        int i19 = 0;
        for (int i27 = 8; i19 < i27; i27 = 8) {
            rt1.k0 a17 = rt1.k0.f399433d.a(i19);
            int ordinal = a17.ordinal();
            android.widget.LinearLayout linearLayout2 = lVar.f399445b;
            if (ordinal == 0) {
                textView = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.bey);
            } else if (ordinal != 1) {
                textView = new android.widget.TextView(xbVar);
                linearLayout2.addView(textView, new android.view.ViewGroup.LayoutParams(xbVar.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db), xbVar.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df)));
            } else {
                textView = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.bex);
            }
            textView.setSpannableFactory(new rt1.b());
            st1.g.a(textView, new rt1.c());
            java.lang.CharSequence range = a17.j();
            kotlin.jvm.internal.o.g(range, "range");
            st1.g.a(textView, new st1.a(range));
            textView.setEditableFactory(android.text.Editable.Factory.getInstance());
            java.lang.Character C0 = r26.p0.C0(str, i19);
            java.lang.String ch6 = C0 != null ? C0.toString() : null;
            if (ch6 == null) {
                ch6 = "";
            }
            textView.setText(ch6, android.widget.TextView.BufferType.EDITABLE);
            textView.addTextChangedListener(new rt1.d(lVar));
            android.widget.TextView[] textViewArr = lVar.f399449f;
            if (textViewArr == null) {
                kotlin.jvm.internal.o.o("charViews");
                throw null;
            }
            textViewArr[i19] = textView;
            if (i19 == 6) {
                st1.g.a(textView, new rt1.e(lVar, i19));
                textView.addTextChangedListener(new rt1.g(lVar, i19, textView));
            }
            if (i19 == 7) {
                st1.g.a(textView, new rt1.h(lVar));
            }
            textView.setOnClickListener(new rt1.i(lVar, i19));
            i19++;
        }
        if (str.length() == 0) {
            lVar.b(0);
        } else {
            lVar.b(h3.a.b(str.length() - 1, 0, 7));
            rt1.a aVar = lVar.f399446c;
            if (aVar != null) {
                android.view.View view = ((rt1.t) aVar).f399486a.f94612g;
                if (view == null) {
                    kotlin.jvm.internal.o.o("finishBtn");
                    throw null;
                }
                view.setEnabled(false);
            }
        }
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 carLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 = new com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1(linearLayout, this);
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(carLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1);
        mo133getLifecycle().a(carLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1);
        android.widget.TextView textView2 = (android.widget.TextView) getContentView().findViewById(com.tencent.mm.R.id.op6);
        pt1.b bVar = pt1.b.f358229a;
        bVar.getClass();
        textView2.setText((java.lang.String) pt1.b.f358233e.b(bVar, pt1.b.f358230b[2]));
    }
}
