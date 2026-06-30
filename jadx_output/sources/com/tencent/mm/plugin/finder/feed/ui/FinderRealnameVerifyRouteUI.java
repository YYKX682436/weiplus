package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRealnameVerifyRouteUI;", "Landroid/app/Activity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FinderRealnameVerifyRouteUI extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.b_t);
        android.app.ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (getIntent().getBooleanExtra("enterRealnameVerifyUI", false)) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).yl(this, "");
        } else {
            new com.tencent.mm.autogen.events.FinderRealNameVertifyFinishEvent().e();
            finish();
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}
