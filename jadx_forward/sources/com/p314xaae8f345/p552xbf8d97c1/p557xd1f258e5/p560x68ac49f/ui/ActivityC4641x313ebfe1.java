package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui;

/* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity */
/* loaded from: classes12.dex */
public class ActivityC4641x313ebfe1 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: d, reason: collision with root package name */
    public vh.y f134155d;

    /* renamed from: e, reason: collision with root package name */
    public vh.f f134156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134157f;

    public static void O6(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.ActivityC4641x313ebfe1 activityC4641x313ebfe1, int i17) {
        vh.f a17 = activityC4641x313ebfe1.f134155d.a(i17);
        if (a17 != null) {
            vh.f fVar = activityC4641x313ebfe1.f134156e;
            if (fVar == null || fVar != a17) {
                activityC4641x313ebfe1.f134156e = a17;
                android.view.View findViewById = activityC4641x313ebfe1.findViewById(com.p314xaae8f345.mm.R.id.f566761gz1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsActivity", "updateHeader", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsActivity", "updateHeader", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.oqh)).setText(a17.f518319d);
            }
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569458bq);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) findViewById(com.p314xaae8f345.mm.R.id.oez);
        c0102x1f44235b.mo2849x53bfe316("电量统计报告");
        m2542xb4674770(c0102x1f44235b);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.op7);
        java.lang.String str = (java.lang.String) uh.c.f509201a.b();
        textView.setText(":" + str);
        ph.a.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class, new vh.c(this, textView));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.m8r);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        vh.t tVar = new vh.t();
        c1163xf1deaba4.mo7960x6cab2c8d(tVar);
        tVar.mo8163xed962dec(new vh.d(this, c1162x665295de));
        this.f134155d = new vh.y(tVar);
        c1163xf1deaba4.i(new vh.e(this, c1162x665295de));
        vh.y yVar = this.f134155d;
        yVar.f518362e = str;
        yVar.f518361d = 0;
        yVar.f518360c.post(new vh.w(yVar));
        this.f134155d.b();
    }
}
