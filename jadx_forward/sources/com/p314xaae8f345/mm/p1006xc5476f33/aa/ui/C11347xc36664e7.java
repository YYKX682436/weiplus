package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectRow */
/* loaded from: classes.dex */
public class C11347xc36664e7 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f154012d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f154013e;

    public C11347xc36664e7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnh, (android.view.ViewGroup) this, true);
        this.f154012d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f567502jq1);
        this.f154013e = findViewById(com.p314xaae8f345.mm.R.id.d0v);
    }

    /* renamed from: getAmount */
    public double m48634x10d1734e() {
        java.lang.String str = this.f154012d.m83183xfb85ada3().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || "".equals(str)) {
            return 0.0d;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str, 0.0d);
    }

    /* renamed from: getMoneyEdit */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 m48635x99441434() {
        return this.f154012d;
    }

    /* renamed from: getUsername */
    public java.lang.String m48636x6c03c64c() {
        return null;
    }

    /* renamed from: setDividerVisible */
    public void m48637xf9eac1b(boolean z17) {
        android.view.View view = this.f154013e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setTextWatcher */
    public void m48638x81482a0d(android.text.TextWatcher textWatcher) {
        this.f154012d.b(textWatcher);
    }

    public C11347xc36664e7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
