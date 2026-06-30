package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonNameAmountRow */
/* loaded from: classes.dex */
public class C11349xca202f78 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f154031d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f154032e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f154033f;

    public C11349xca202f78(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnj, (android.view.ViewGroup) this, true);
        this.f154031d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ove);
        this.f154032e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564485sp);
        this.f154033f = findViewById(com.p314xaae8f345.mm.R.id.d0v);
    }

    public void b(java.lang.String str, java.lang.String str2, double d17) {
        android.widget.TextView textView = this.f154031d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(str, str2);
        float textSize = this.f154031d.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, f17, textSize));
        this.f154032e.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571250q, java.lang.Double.valueOf(d17)));
    }

    /* renamed from: setDividerVisible */
    public void m48639xf9eac1b(boolean z17) {
        android.view.View view = this.f154033f;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C11349xca202f78(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public C11349xca202f78(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
