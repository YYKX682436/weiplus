package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui;

/* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI */
/* loaded from: classes15.dex */
public class ActivityC17273xa70a65ea extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f240267i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f240268d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f240269e;

    /* renamed from: f, reason: collision with root package name */
    public gz3.h f240270f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f240271g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f240272h;

    public final void T6() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Bi().mo78086x7444f759() > 0) {
            this.f240268d.setVisibility(0);
            android.view.View view = this.f240269e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f240272h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78501x43e00957(true);
        } else {
            this.f240268d.setVisibility(8);
            android.view.View view3 = this.f240269e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f240272h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78501x43e00957(false);
        }
        this.f240270f.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chu;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i9w);
        mo54448x9c8c0d33(new gz3.a(this));
        this.f240268d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.m_f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cht, null);
        this.f240271g = linearLayout;
        this.f240268d.addHeaderView(linearLayout);
        gz3.h hVar = new gz3.h(this);
        this.f240270f = hVar;
        this.f240268d.setAdapter((android.widget.ListAdapter) hVar);
        this.f240268d.setOnItemClickListener(new gz3.b(this));
        this.f240268d.setOnItemLongClickListener(new gz3.c(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.arp), new gz3.d(this));
        this.f240269e = findViewById(com.p314xaae8f345.mm.R.id.cho);
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.chs, null);
        this.f240272h = inflate;
        android.widget.LinearLayout linearLayout2 = this.f240271g;
        if (linearLayout2 != null) {
            linearLayout2.addView(inflate);
        }
        ((android.widget.TextView) this.f240272h.findViewById(com.p314xaae8f345.mm.R.id.h0q)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwe);
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
