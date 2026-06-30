package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public class z0 extends android.text.style.ClickableSpan implements gb5.a {
    private static final java.lang.String TAG = "MicroMsg.PressableClickSpan";

    /* renamed from: _hellAccFlag_ */
    private byte f38838x7f11beae;

    /* renamed from: boldClickSpan */
    private boolean f38839xe3ac17ed;

    /* renamed from: isPressed */
    private boolean f38840xca78f398;

    /* renamed from: mAdTagClickCallback */
    private com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a f38841x14ce6203;

    /* renamed from: mAdTagClickScene */
    private int f38842x73985f8e;

    /* renamed from: mBgColor */
    private int f38843x91e2c8f1;

    /* renamed from: mClickListener */
    protected com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0 f38844xad90eeef;

    /* renamed from: mEnable */
    private boolean f38845x2014c50;

    /* renamed from: mHrefInfo */
    private r35.m3 f38846x9917f206;

    /* renamed from: mLinkColor */
    private int f38847x1859c59c;

    /* renamed from: mSessionId */
    private java.lang.String f38848x9ef18864;

    /* renamed from: mSpanClickCallback */
    private com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a1 f38849xca12a9d6;

    /* renamed from: mViewRef */
    private java.lang.ref.WeakReference<android.view.View> f38850xb92b7a81;

    /* renamed from: needDealOverflowOffset */
    private boolean f38851xf4fba1f7;

    /* renamed from: position */
    private int f38852x2c929929;
    private java.lang.Object tag;

    /* renamed from: uiContext */
    private android.content.Context f38853xfa91f07b;

    public z0() {
        this.f38840xca78f398 = false;
        this.f38839xe3ac17ed = false;
        this.f38844xad90eeef = null;
        this.f38846x9917f206 = null;
        this.f38845x2014c50 = true;
        this.f38850xb92b7a81 = null;
        this.f38853xfa91f07b = null;
        this.tag = null;
        this.f38851xf4fba1f7 = true;
    }

    /* renamed from: getBgColor */
    public int m75726x319751e8() {
        return this.f38843x91e2c8f1;
    }

    /* renamed from: getHrefInfo */
    public r35.m3 m75727xeff487ef() {
        return this.f38846x9917f206;
    }

    /* renamed from: getNeedDealOverflowOffset */
    public boolean m75728x5eca18ed() {
        return this.f38851xf4fba1f7;
    }

    /* renamed from: getPress */
    public boolean m75729x74fd4a8d() {
        return this.f38840xca78f398;
    }

    /* renamed from: getTag */
    public java.lang.Object m75730xb5887064() {
        return this.tag;
    }

    /* renamed from: getType */
    public int m75731xfb85f7b0() {
        r35.m3 m3Var = this.f38846x9917f206;
        if (m3Var == null) {
            return Integer.MAX_VALUE;
        }
        return m3Var.f450728d;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0 a0Var = this.f38844xad90eeef;
        if (a0Var != null && this.f38846x9917f206 != null && this.f38845x2014c50) {
            android.content.Context context = this.f38853xfa91f07b;
            if (context == null) {
                context = view.getContext();
            }
            a0Var.f272696a = context;
            this.f38844xad90eeef.a(view, this.f38846x9917f206);
            this.f38844xad90eeef.f272696a = null;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a1 a1Var = this.f38849xca12a9d6;
            if (a1Var != null && view != null) {
                a1Var.a(view, this.f38846x9917f206.f450727c);
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a aVar = this.f38841x14ce6203;
        if (aVar != null) {
            aVar.a(this.f38852x2c929929, this.f38842x73985f8e);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setAdTagClickCallback */
    public void m75732xc006eab8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a aVar, int i17) {
        this.f38841x14ce6203 = aVar;
        this.f38852x2c929929 = i17;
    }

    /* renamed from: setAdTagClickScene */
    public void m75733xbf229af9(int i17) {
        this.f38842x73985f8e = i17;
    }

    /* renamed from: setColor */
    public void mo63036x52d2f021(int i17, int i18) {
        this.f38847x1859c59c = i17;
        this.f38843x91e2c8f1 = i18;
    }

    /* renamed from: setColorConfig */
    public void mo64459x8f3102c3(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i17 == 1) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560345hx), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
            return;
        }
        if (i17 == 2) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61));
            return;
        }
        if (i17 == 3) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a69), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61));
        } else if (i17 == 4) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560344hw), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        } else {
            if (i17 != 5) {
                return;
            }
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561014a30), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61));
        }
    }

    /* renamed from: setContext */
    public void m75734xe9f5beed(android.content.Context context) {
        this.f38853xfa91f07b = context;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0 a0Var = this.f38844xad90eeef;
        if (a0Var != null) {
            a0Var.f272696a = context;
        }
    }

    /* renamed from: setEnable */
    public void m75735xae17c85(boolean z17) {
        this.f38845x2014c50 = z17;
    }

    @Override // gb5.a
    /* renamed from: setIsPressed */
    public void mo2167x263a2556(boolean z17) {
        this.f38840xca78f398 = z17;
    }

    /* renamed from: setNeedDealOverflowOffset */
    public void m75736x910db4f9(boolean z17) {
        this.f38851xf4fba1f7 = z17;
    }

    /* renamed from: setSessionId */
    public void m75737x7ffb700f(java.lang.String str) {
        this.f38848x9ef18864 = str;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0 a0Var = this.f38844xad90eeef;
        if (a0Var != null) {
            a0Var.f272697b = str;
        }
    }

    /* renamed from: setSpanClickCallback */
    public void m75738x5bfbb681(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a1 a1Var) {
        this.f38849xca12a9d6 = a1Var;
    }

    /* renamed from: setTag */
    public void m75739xca0297d8(java.lang.Object obj) {
        this.tag = obj;
    }

    /* renamed from: setTextBold */
    public void m75740x3ab833d4(boolean z17) {
        this.f38839xe3ac17ed = z17;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f38847x1859c59c);
        textPaint.setUnderlineText(false);
        textPaint.linkColor = this.f38847x1859c59c;
        if (m75729x74fd4a8d()) {
            textPaint.bgColor = this.f38843x91e2c8f1;
        } else {
            textPaint.bgColor = 0;
        }
    }

    public z0(int i17, r35.m3 m3Var) {
        int i18;
        int i19 = 0;
        this.f38840xca78f398 = false;
        this.f38839xe3ac17ed = false;
        this.f38844xad90eeef = null;
        this.f38846x9917f206 = null;
        this.f38845x2014c50 = true;
        this.f38850xb92b7a81 = null;
        this.f38853xfa91f07b = null;
        this.tag = null;
        this.f38851xf4fba1f7 = true;
        if (m3Var != null) {
            i19 = m3Var.f450735k;
            i18 = m3Var.f450736l;
        } else {
            i18 = 0;
        }
        if (i19 == 0 && i18 == 0) {
            mo64459x8f3102c3(i17);
        } else {
            mo63036x52d2f021(i19, i18);
        }
        this.f38844xad90eeef = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0();
        this.f38846x9917f206 = m3Var;
    }

    public z0(int i17, int i18) {
        this.f38840xca78f398 = false;
        this.f38839xe3ac17ed = false;
        this.f38844xad90eeef = null;
        this.f38846x9917f206 = null;
        this.f38845x2014c50 = true;
        this.f38850xb92b7a81 = null;
        this.f38853xfa91f07b = null;
        this.tag = null;
        this.f38851xf4fba1f7 = true;
        mo63036x52d2f021(i17, i18);
        this.f38844xad90eeef = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0();
    }
}
