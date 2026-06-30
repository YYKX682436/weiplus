package com.tencent.matrix.batterycanary.stats.ui;

/* loaded from: classes12.dex */
public class BatteryStatsActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public vh.y f52622d;

    /* renamed from: e, reason: collision with root package name */
    public vh.f f52623e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52624f;

    public static void O6(com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity batteryStatsActivity, int i17) {
        vh.f a17 = batteryStatsActivity.f52622d.a(i17);
        if (a17 != null) {
            vh.f fVar = batteryStatsActivity.f52623e;
            if (fVar == null || fVar != a17) {
                batteryStatsActivity.f52623e = a17;
                android.view.View findViewById = batteryStatsActivity.findViewById(com.tencent.mm.R.id.f485228gz1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsActivity", "updateHeader", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsActivity", "updateHeader", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.oqh)).setText(a17.f436786d);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.f487925bq);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(com.tencent.mm.R.id.oez);
        toolbar.setTitle("电量统计报告");
        setSupportActionBar(toolbar);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.op7);
        java.lang.String str = (java.lang.String) uh.c.f427668a.b();
        textView.setText(":" + str);
        ph.a.b(com.tencent.matrix.batterycanary.stats.k.class, new vh.c(this, textView));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.m8r);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        vh.t tVar = new vh.t();
        recyclerView.setAdapter(tVar);
        tVar.registerAdapterDataObserver(new vh.d(this, linearLayoutManager));
        this.f52622d = new vh.y(tVar);
        recyclerView.i(new vh.e(this, linearLayoutManager));
        vh.y yVar = this.f52622d;
        yVar.f436829e = str;
        yVar.f436828d = 0;
        yVar.f436827c.post(new vh.w(yVar));
        this.f52622d.b();
    }
}
