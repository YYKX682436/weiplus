package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.ui.base.preference.MMPreference */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC21555x39071a9b extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    public static final java.lang.String TAG = "MicroMsg.mmui.MMPreference";

    /* renamed from: _hellAccFlag_ */
    private byte f39402x7f11beae;

    /* renamed from: adapter */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 f39403xbb6ca34f;

    /* renamed from: bannerCloseBtn */
    protected android.widget.ImageView f39404xcb96bc90;

    /* renamed from: bannerTv */
    protected android.widget.TextView f39405x91626ece;

    /* renamed from: bannerView */
    protected android.widget.RelativeLayout f39406xc282b7f1;

    /* renamed from: bottomMask */
    private android.view.View f39407x9bb307b7;

    /* renamed from: list */
    private android.widget.ListView f39410x32b09e;

    /* renamed from: sp, reason: collision with root package name */
    private android.content.SharedPreferences f279295sp;

    /* renamed from: dirty */
    private boolean f39408x5b2a3d2 = false;

    /* renamed from: isRefreshing */
    private boolean f39409x6e3c4ff1 = false;

    /* renamed from: scrollListeners */
    private final java.util.List<android.widget.AbsListView.OnScrollListener> f39411x50fa61f2 = new java.util.ArrayList();

    public final void U6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f39403xbb6ca34f;
        h0Var.f279355x = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.x(this);
        h0Var.notifyDataSetChanged();
        int mo43516x9e0bb9bf = mo43516x9e0bb9bf();
        if (mo43516x9e0bb9bf != -1) {
            this.f39403xbb6ca34f.g(mo43516x9e0bb9bf);
        }
        this.f39410x32b09e.setAdapter((android.widget.ListAdapter) this.f39403xbb6ca34f);
        this.f39410x32b09e.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0(this));
        this.f39410x32b09e.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b0(this));
        this.f39410x32b09e.setOnScrollListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.c0(this));
    }

    /* renamed from: addOnScrollListener */
    public void m79328xd4fbf521(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.f39411x50fa61f2.add(onScrollListener);
    }

    /* renamed from: autoRefresh */
    public boolean mo48678xedc85a2c() {
        return true;
    }

    /* renamed from: createAdapter */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 mo43515x4153c6b3(android.content.SharedPreferences sharedPreferences) {
        return new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0(this, m79335xcc101dd9(), sharedPreferences);
    }

    /* renamed from: createUI */
    public void m79329x6c815c90() {
        this.f39410x32b09e.setAdapter((android.widget.ListAdapter) this.f39403xbb6ca34f);
    }

    /* renamed from: dirty */
    public boolean m79330x5b2a3d2() {
        return this.f39408x5b2a3d2;
    }

    /* renamed from: dispatchClick */
    public void mo69080x80434d2e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q != null) {
            mo26755x5cc6f590(h0Var, c21560x1fce98fb);
        }
    }

    /* renamed from: doPrepareData */
    public void m79331x96597bc6() {
    }

    /* renamed from: getBottomMask */
    public android.view.View m79332x89f3bfad() {
        return this.f39407x9bb307b7;
    }

    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        return null;
    }

    /* renamed from: getDefaultSharedPreferences */
    public android.content.SharedPreferences m79333x58c0be88() {
        return this.f279295sp;
    }

    /* renamed from: getFooterResourceId */
    public int mo56597xfe2df53a() {
        return -1;
    }

    /* renamed from: getFooterView */
    public android.view.View mo48671x42edd6d6() {
        return null;
    }

    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return -1;
    }

    /* renamed from: getHeaderView */
    public android.view.View m79334x64203ac8() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c0n;
    }

    /* renamed from: getListView */
    public android.widget.ListView m79335xcc101dd9() {
        return this.f39410x32b09e;
    }

    /* renamed from: getPreferenceScreen */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d() {
        return this.f39403xbb6ca34f;
    }

    /* renamed from: getResourceId */
    public abstract int mo43516x9e0bb9bf();

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: isContentAtTop */
    public boolean mo45060x28c9d73() {
        return !this.f39410x32b09e.canScrollVertically(-1);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f279295sp = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f39410x32b09e = (android.widget.ListView) findViewById(android.R.id.list);
        this.f39407x9bb307b7 = findViewById(com.p314xaae8f345.mm.R.id.aur);
        this.f39403xbb6ca34f = mo43515x4153c6b3(this.f279295sp);
        this.f39406xc282b7f1 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.l2z);
        this.f39405x91626ece = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.l2y);
        this.f39404xcb96bc90 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.l2x);
        m79331x96597bc6();
        int mo48679xfc6e1bac = mo48679xfc6e1bac();
        android.view.View m79334x64203ac8 = m79334x64203ac8();
        if (mo48679xfc6e1bac != -1) {
            this.f39410x32b09e.addHeaderView(getLayoutInflater().inflate(mo48679xfc6e1bac, (android.view.ViewGroup) null));
        } else if (m79334x64203ac8 != null) {
            if (m79334x64203ac8.getLayoutParams() != null) {
                m79334x64203ac8.setLayoutParams(new android.widget.AbsListView.LayoutParams(m79334x64203ac8.getLayoutParams()));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[arthurdan.mmpreference] Notice!!! header.getLayoutParams() is null!!!\n");
            }
            this.f39410x32b09e.addHeaderView(m79334x64203ac8);
        }
        int mo56597xfe2df53a = mo56597xfe2df53a();
        android.view.View mo48671x42edd6d6 = mo48671x42edd6d6();
        if (mo56597xfe2df53a != -1) {
            this.f39410x32b09e.addFooterView(getLayoutInflater().inflate(mo56597xfe2df53a, (android.view.ViewGroup) null));
        } else if (mo48671x42edd6d6 != null) {
            if (mo48671x42edd6d6.getLayoutParams() != null) {
                mo48671x42edd6d6.setLayoutParams(new android.widget.AbsListView.LayoutParams(mo48671x42edd6d6.getLayoutParams()));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[arthurdan.mmpreference] Notice!!! footer.getLayoutParams() is null!!!\n");
            }
            this.f39410x32b09e.addFooterView(mo48671x42edd6d6);
        }
        android.view.View mo60898x89f7f366 = mo60898x89f7f366();
        if (mo60898x89f7f366 != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.l2v);
            frameLayout.addView(mo60898x89f7f366);
            frameLayout.setVisibility(0);
        }
        android.view.View view = this.f39407x9bb307b7;
        if (view != null) {
            int i17 = mo68959xfab6e694().booleanValue() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/preference/MMPreference", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/preference/MMPreference", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        U6();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }

    /* renamed from: onPreferenceTreeClick */
    public abstract boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb);

    /* renamed from: onPreferenceTreeLongClick */
    public boolean mo60896x898ea874(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, android.view.View view) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (mo48678xedc85a2c()) {
            this.f39403xbb6ca34f.notifyDataSetChanged();
        }
        super.onResume();
    }

    /* renamed from: onSetToTop */
    public boolean m79337xf8dc4897() {
        android.widget.ListView listView = this.f39410x32b09e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/base/preference/MMPreference", "onSetToTop", "()Z", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m.a((android.widget.ListView) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/ui/base/preference/MMPreference", "onSetToTop", "()Z", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        return true;
    }

    /* renamed from: releaseUI */
    public void m79338x5574cdb() {
        this.f39410x32b09e.setAdapter((android.widget.ListAdapter) null);
    }

    /* renamed from: removeOnScrollListener */
    public void m79339xb7074f04(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.f39411x50fa61f2.remove(onScrollListener);
    }

    /* renamed from: setListViewBackgroundColor */
    public void m79340x7431e930(int i17) {
        this.f39410x32b09e.setBackgroundColor(i17);
    }

    /* renamed from: setSelection */
    public void m79341xf579a34a(int i17) {
        this.f39410x32b09e.setSelection(i17);
    }

    /* renamed from: setShowBottomLine */
    public void m79342xb144c49e(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f39403xbb6ca34f;
        h0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPreferenceAdapter", "setShowBootomLine: %B", bool);
        h0Var.f279354w = bool.booleanValue();
    }

    /* renamed from: setShowTopLine */
    public void m79343x4369c36a(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f39403xbb6ca34f;
        h0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPreferenceAdapter", "setShowTopLine: %B", bool);
        h0Var.f279353v = bool.booleanValue();
    }

    /* renamed from: showBottomMask */
    public java.lang.Boolean mo68959xfab6e694() {
        return java.lang.Boolean.FALSE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(la5.y0.class);
    }

    /* renamed from: updateAdapter */
    public void m79344x62423e46(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var) {
        this.f39403xbb6ca34f = h0Var;
        U6();
    }
}
