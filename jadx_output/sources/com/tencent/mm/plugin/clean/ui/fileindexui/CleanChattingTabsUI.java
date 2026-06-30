package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingTabsUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes11.dex */
public final class CleanChattingTabsUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public long f95759d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b6z;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        setMMTitle(com.tencent.mm.R.string.b8m);
        setBackBtn(new cw1.f5(this));
        com.tencent.mm.ui.base.CustomViewPager customViewPager = (com.tencent.mm.ui.base.CustomViewPager) findViewById(com.tencent.mm.R.id.kod);
        customViewPager.setCanSlide(false);
        customViewPager.setAdapter(new cw1.i5(this, getSupportFragmentManager()));
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) findViewById(com.tencent.mm.R.id.qgv);
        tabLayout.a(new cw1.j5(customViewPager, tabLayout));
    }
}
