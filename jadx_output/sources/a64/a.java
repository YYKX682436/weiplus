package a64;

/* loaded from: classes4.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f1754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a64.b f1755e;

    public a(com.tencent.mm.ui.MMActivity mMActivity, a64.b bVar) {
        this.f1754d = mMActivity;
        this.f1755e = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC$configActionBar$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.MMActivity mMActivity = this.f1754d;
        mMActivity.hideVKB();
        if (!this.f1755e.P6()) {
            mMActivity.finish();
            mMActivity.overridePendingTransition(0, com.tencent.mm.R.anim.f477889ed);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC$configActionBar$1$1");
        return true;
    }
}
