package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes.dex */
public class LaunchAAByPersonNameAmountRow extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f72498d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f72499e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f72500f;

    public LaunchAAByPersonNameAmountRow(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bnj, (android.view.ViewGroup) this, true);
        this.f72498d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ove);
        this.f72499e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482952sp);
        this.f72500f = findViewById(com.tencent.mm.R.id.d0v);
    }

    public void b(java.lang.String str, java.lang.String str2, double d17) {
        android.widget.TextView textView = this.f72498d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(str, str2);
        float textSize = this.f72498d.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, f17, textSize));
        this.f72499e.setText(getContext().getString(com.tencent.mm.R.string.f489717q, java.lang.Double.valueOf(d17)));
    }

    public void setDividerVisible(boolean z17) {
        android.view.View view = this.f72500f;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public LaunchAAByPersonNameAmountRow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LaunchAAByPersonNameAmountRow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
