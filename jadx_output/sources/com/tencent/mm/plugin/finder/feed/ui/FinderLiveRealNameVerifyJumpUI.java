package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveRealNameVerifyJumpUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FinderLiveRealNameVerifyJumpUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_t;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        hideTitleView();
        vj5.o.e(getWindow());
        android.app.ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (getIntent().getBooleanExtra("enterRealnameVerifyUI", false)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("realname_verify_process_jump_activity", com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI.class.getName());
            bundle2.putString("realname_verify_process_jump_plugin", "finder");
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            android.app.Activity activity = j17 != null ? (android.app.Activity) j17.get() : null;
            ps4.g gVar = (ps4.g) ((o05.l) i95.n0.c(o05.l.class));
            gVar.f358151d = com.tencent.mm.plugin.finder.feed.ui.ic.f110148a;
            bundle2.putInt("real_name_verify_mode", 2);
            com.tencent.mm.wallet_core.a.j(activity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle2, gVar.f358152e);
        } else {
            finish();
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}
