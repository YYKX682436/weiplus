package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC11345xc0d00306 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f154005f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 300);

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f154006d;

    /* renamed from: e, reason: collision with root package name */
    public final em5.i f154007e = new em5.i();

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 abstractActivityC11345xc0d00306, android.widget.EditText editText) {
        if (abstractActivityC11345xc0d00306.f154006d != null) {
            int[] iArr = new int[2];
            editText.getLocationInWindow(iArr);
            int height = iArr[1] + editText.getHeight();
            int height2 = abstractActivityC11345xc0d00306.getWindow().getDecorView().getHeight() - abstractActivityC11345xc0d00306.mo2533x106ab264().l();
            int i17 = height2 - height;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(height);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(height2);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
            int i18 = f154005f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAAPresenterActivity", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i18));
            if (i17 <= 0 || i17 >= i18) {
                return;
            }
            int b17 = (i18 - i17) + i65.a.b(abstractActivityC11345xc0d00306, 10);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAAPresenterActivity", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", java.lang.Integer.valueOf(b17));
            abstractActivityC11345xc0d00306.f154006d.scrollBy(0, b17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: hideTenpayKB */
    public void mo48632xd46dd964() {
        super.mo48632xd46dd964();
        android.view.View view = this.f154006d;
        if (view != null) {
            view.scrollTo(0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154007e.c(getIntent(), this);
        this.f39895x123dbf17 = true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        em5.i iVar = this.f154007e;
        iVar.f336765g.mo10668x2efc64();
        iVar.e(4);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f154007e.e(3);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f154007e.e(2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: setEditFocusListener */
    public void mo48633x8f91b80(android.view.View view, int i17, boolean z17, boolean z18) {
        android.view.View view2;
        this.f39901x43041b74 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f39900xbab696ce = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.pbn);
        if (this.f39901x43041b74 == null || editText == null || (view2 = this.f39900xbab696ce) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity", "setEditFocusListener", "(Landroid/view/View;IZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity", "setEditFocusListener", "(Landroid/view/View;IZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1(this, z17, z18, editText, view, i17));
        editText.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a2(this, z17, editText, i17));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.b2(this));
    }
}
