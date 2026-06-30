package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveMentionsUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f109384w = {41};

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.uh f109385v = new com.tencent.mm.plugin.finder.feed.uh(2, 22, f109384w);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 0;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(id2.w1.class);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.appcompat.app.b supportActionBar = ((com.tencent.mm.ui.MMActivity) context).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.backBtn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.sa(this));
        }
        findViewById(com.tencent.mm.R.id.fsn).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ta(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f109385v.getClass();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) ((zy2.k9) pf5.z.f353948a.a(this).c(zy2.k9.class))).f136177i = true;
        initView();
        alive();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach ");
        com.tencent.mm.plugin.finder.feed.uh uhVar = this.f109385v;
        sb6.append(uhVar.f109183e);
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", sb6.toString());
        uhVar.f109190o.dead();
        uhVar.f109188m = null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.finder.feed.li liVar;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        super.onResume();
        com.tencent.mm.plugin.finder.feed.uh uhVar = this.f109385v;
        uhVar.getClass();
        java.lang.System.currentTimeMillis();
        if (!uhVar.f109192q) {
            java.util.ArrayList arrayList = uhVar.f109191p;
            if ((!arrayList.isEmpty()) && (liVar = uhVar.f109188m) != null && (wxRecyclerAdapter = liVar.f107299i) != null) {
                wxRecyclerAdapter.notifyItemRangeChanged(0, arrayList.size(), 1);
            }
        }
        uhVar.f109192q = false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f109385v.getClass();
    }
}
