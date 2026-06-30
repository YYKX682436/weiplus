package uj5;

/* loaded from: classes3.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f509983d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f509984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f509983d = jz5.h.b(new uj5.c(this));
        this.f509984e = jz5.h.b(uj5.d.f509982d);
    }

    public final java.lang.String O6() {
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(R6(decorView, 0));
        sb6.append("\n *** styleInfo:");
        android.view.Window window = m158354x19263085().getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        sb6.append(xk5.c.b(window, true));
        sb6.append(" ***");
        return sb6.toString();
    }

    public final java.util.List P6(java.lang.String str) {
        java.util.List<java.lang.String> f07 = r26.n0.f0(str, new java.lang.String[]{"\n"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.String str2 : f07) {
            if (i17 >= 100) {
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                arrayList.add(sb7);
                sb6 = new java.lang.StringBuilder();
                i17 = 0;
            }
            sb6.append(str2);
            sb6.append("\n");
            i17++;
        }
        if (sb6.length() > 0) {
            java.lang.String sb8 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
            arrayList.add(sb8);
        }
        return arrayList;
    }

    public final boolean Q6() {
        return ((java.lang.Boolean) ((jz5.n) this.f509984e).mo141623x754a37bb()).booleanValue();
    }

    public final java.lang.String R6(android.view.View view, int i17) {
        if (!(view instanceof android.view.ViewGroup)) {
            return S6(view, i17);
        }
        java.lang.String S6 = S6(view, i17);
        n3.t1 t1Var = new n3.t1((android.view.ViewGroup) view);
        while (t1Var.hasNext()) {
            S6 = S6 + '\n' + R6((android.view.View) t1Var.next(), i17 + 1);
        }
        return S6;
    }

    public final java.lang.String S6(android.view.View view, int i17) {
        java.lang.String str;
        java.lang.String str2 = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        try {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getResourceEntryName(view.getId());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } catch (java.lang.Exception unused) {
            str = "";
        }
        java.lang.String str3 = (java.lang.String) kz5.n0.i0(r26.n0.f0(view.getClass().getName(), new java.lang.String[]{"."}, false, 0, 6, null));
        java.lang.String s17 = i17 > 0 ? r26.i0.s("-", i17) : "";
        java.lang.String str4 = "p:" + view.getPaddingLeft() + '-' + view.getPaddingTop() + '-' + view.getPaddingRight() + '-' + view.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("m:");
        sb6.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.leftMargin) : null);
        sb6.append('-');
        sb6.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.topMargin) : null);
        sb6.append('-');
        sb6.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.rightMargin) : null);
        sb6.append('-');
        sb6.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.bottomMargin) : null);
        java.lang.String str5 = "[l:" + view.getLeft() + " top:" + view.getTop() + " r:" + view.getRight() + " b:" + view.getBottom() + " h:" + view.getHeight() + " w:" + view.getWidth() + " y:" + view.getTranslationY() + " x:" + view.getTranslationX() + " v:" + view.getVisibility() + " c:" + view.hasOnClickListeners() + " p:" + str4 + " m:" + sb6.toString() + ']';
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(s17);
        sb7.append(str3);
        if (!r26.n0.N(str)) {
            str2 = "(" + str + ')';
        }
        sb7.append(str2);
        sb7.append(' ');
        sb7.append(str5);
        return sb7.toString();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart() registerScreenCaptureCallback sdk:");
        int i17 = android.os.Build.VERSION.SDK_INT;
        sb6.append(i17);
        sb6.append(" switch:");
        sb6.append(Q6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", sb6.toString());
        if (i17 < 34 || !Q6()) {
            return;
        }
        m158354x19263085().registerScreenCaptureCallback(m158354x19263085().getMainExecutor(), (android.app.Activity.ScreenCaptureCallback) ((jz5.n) this.f509983d).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop() unregisterScreenCaptureCallback sdk:");
        int i17 = android.os.Build.VERSION.SDK_INT;
        sb6.append(i17);
        sb6.append(" switch:");
        sb6.append(Q6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", sb6.toString());
        if (i17 < 34 || !Q6()) {
            return;
        }
        m158354x19263085().unregisterScreenCaptureCallback((android.app.Activity.ScreenCaptureCallback) ((jz5.n) this.f509983d).mo141623x754a37bb());
    }
}
