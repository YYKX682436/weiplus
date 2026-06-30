package a64;

/* loaded from: classes4.dex */
public final class b extends a64.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a64.e, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configActionBar", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.setMMTitle("");
            mMActivity.setTitleAlpha(0.0f);
            if (P6()) {
                mMActivity.setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            } else {
                mMActivity.setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
            }
            mMActivity.setBackBtn(new a64.a(mMActivity, this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configActionBar", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC");
    }
}
