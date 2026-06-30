package com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI;", "Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "<init>", "()V", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI */
/* loaded from: classes7.dex */
public final class ActivityC13028x321e1ca7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.AbstractActivityC13027x671e30c9 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f176142i = 0;

    /* renamed from: e, reason: collision with root package name */
    public rt1.l f176143e;

    /* renamed from: f, reason: collision with root package name */
    public rt1.p f176144f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f176145g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f176146h;

    public final boolean T6() {
        java.lang.String str = this.f176146h;
        return !(str == null || str.length() == 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (T6()) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        } else {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569798oj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        cf.b.b(this, 10);
        cf.b.b(this, 1);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        android.content.Intent intent = getIntent();
        this.f176146h = intent != null ? intent.getStringExtra("INTENT_KEY_DEFAULT_PLATE_TEXT") : null;
        if (T6()) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        } else {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        android.widget.TextView textView;
        super.onPostCreate(bundle);
        mo78514x143f1b92().G0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().E0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748));
        m78513xc2a54588().setBackgroundColor(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f565015b02);
        int i17 = T6() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new rt1.q(this));
        android.view.View findViewById2 = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.azy);
        int i18 = T6() ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setOnClickListener(new rt1.r(this));
        android.view.View findViewById3 = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.b0k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        this.f176145g = findViewById3;
        findViewById3.setEnabled(false);
        findViewById3.setOnClickListener(new rt1.s(this));
        rt1.p pVar = new rt1.p();
        android.view.View findViewById4 = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.b6v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById4;
        pVar.f481000b = relativeLayout;
        android.content.Context context = relativeLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pVar.f480999a = context;
        this.f176144f = pVar;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.hwg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linearLayout);
        rt1.l lVar = new rt1.l(this, linearLayout);
        this.f176143e = lVar;
        rt1.p pVar2 = this.f176144f;
        if (pVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardController");
            throw null;
        }
        pVar2.f481001c = lVar;
        lVar.f480979c = new rt1.t(this);
        java.lang.String str = this.f176146h;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.xb xbVar = new com.p314xaae8f345.mm.ui.xb(lVar.f480977a, com.p314xaae8f345.mm.R.C30868x68b1db1.f575620du);
        lVar.f480982f = new android.widget.TextView[8];
        int i19 = 0;
        for (int i27 = 8; i19 < i27; i27 = 8) {
            rt1.k0 a17 = rt1.k0.f480966d.a(i19);
            int ordinal = a17.ordinal();
            android.widget.LinearLayout linearLayout2 = lVar.f480978b;
            if (ordinal == 0) {
                textView = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.bey);
            } else if (ordinal != 1) {
                textView = new android.widget.TextView(xbVar);
                linearLayout2.addView(textView, new android.view.ViewGroup.LayoutParams(xbVar.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db), xbVar.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df)));
            } else {
                textView = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.bex);
            }
            textView.setSpannableFactory(new rt1.b());
            st1.g.a(textView, new rt1.c());
            java.lang.CharSequence range = a17.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
            st1.g.a(textView, new st1.a(range));
            textView.setEditableFactory(android.text.Editable.Factory.getInstance());
            java.lang.Character C0 = r26.p0.C0(str, i19);
            java.lang.String ch6 = C0 != null ? C0.toString() : null;
            if (ch6 == null) {
                ch6 = "";
            }
            textView.setText(ch6, android.widget.TextView.BufferType.EDITABLE);
            textView.addTextChangedListener(new rt1.d(lVar));
            android.widget.TextView[] textViewArr = lVar.f480982f;
            if (textViewArr == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("charViews");
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
            rt1.a aVar = lVar.f480979c;
            if (aVar != null) {
                android.view.View view = ((rt1.t) aVar).f481019a.f176145g;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                    throw null;
                }
                view.setEnabled(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ViewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0 viewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ViewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0(linearLayout, this);
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0);
        mo273xed6858b4().a(viewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0);
        android.widget.TextView textView2 = (android.widget.TextView) m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.op6);
        pt1.b bVar = pt1.b.f439762a;
        bVar.getClass();
        textView2.setText((java.lang.String) pt1.b.f439766e.b(bVar, pt1.b.f439763b[2]));
    }
}
