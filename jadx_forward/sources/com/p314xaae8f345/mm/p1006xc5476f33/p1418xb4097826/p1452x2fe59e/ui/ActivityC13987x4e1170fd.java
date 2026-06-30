package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI */
/* loaded from: classes2.dex */
public final class ActivityC13987x4e1170fd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f190864v = "FinderLiveAnchorSettingUI";

    public final void d7(r45.no1 no1Var) {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.moh);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        java.util.LinkedList<r45.mo1> m75941xfb821914 = no1Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFunctions(...)");
        for (r45.mo1 mo1Var : m75941xfb821914) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(mo55332x76847179());
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            java.util.LinkedList m75941xfb8219142 = mo1Var.m75941xfb821914(0);
            if (m75941xfb8219142 != null) {
                int i17 = 0;
                for (java.lang.Object obj : m75941xfb8219142) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.lo1 lo1Var = (r45.lo1) obj;
                    android.view.View inflate = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.awv, (android.view.ViewGroup) linearLayout2, false);
                    if (i17 == mo1Var.m75941xfb821914(0).size() - 1 && (findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hps)) != null && (findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.d0v)) != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI", "buildSettingLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveCreatorService;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI", "buildSettingLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveCreatorService;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.q7(lo1Var, this));
                    ym5.a1.h(inflate, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.r7(this, lo1Var));
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hjq);
                    if (textView != null) {
                        java.lang.String m75945x2fec8307 = lo1Var.m75945x2fec8307(1);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        textView.setText(m75945x2fec8307);
                    }
                    linearLayout2.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
                    i17 = i18;
                }
            }
            if (linearLayout != null) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = (int) mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
                linearLayout.addView(linearLayout2, layoutParams);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8h);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.s7(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("service");
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (byteArrayExtra == null || stringExtra == null) {
            return;
        }
        try {
            mo54450xbf7c1df6(stringExtra);
            r45.no1 no1Var = new r45.no1();
            no1Var.m75932x347fbd55(byteArrayExtra);
            d7(no1Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f190864v, "parse service error: " + e17.getMessage());
            finish();
        }
    }
}
