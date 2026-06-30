package com.tencent.mm.plugin.appbrand.ui.collection;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes7.dex */
public final class AppBrandCollectionSortUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f89648d = 0;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477724l);
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        }
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477724l);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.util.ArrayList<? extends android.os.Parcelable> parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("KEY_SORT_DATA_LIST") : null;
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            super.finish();
            return;
        }
        overridePendingTransition(com.tencent.mm.R.anim.f477723k, com.tencent.mm.R.anim.f477728p);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        getContentView().setBackgroundColor(getActionbarColor());
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList.f89649m;
        android.content.Intent intent2 = getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra("KEY_OPERATE_REPORT_SCENE", 0) : 0;
        android.content.Intent intent3 = getIntent();
        java.lang.String stringExtra = intent3 != null ? intent3.getStringExtra("KEY_OPERATE_REPORT_SCENE_ID") : null;
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList = new com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList();
        android.os.Bundle bundle2 = new android.os.Bundle(1);
        bundle2.putParcelableArrayList("KEY_SORT_DATA_LIST", parcelableArrayListExtra);
        bundle2.putInt("KEY_OPERATE_REPORT_SCENE", intExtra);
        bundle2.putString("KEY_OPERATE_REPORT_SCENE_ID", stringExtra);
        appBrandCollectionVerticalSortList.setArguments(bundle2);
        beginTransaction.k(android.R.id.content, appBrandCollectionVerticalSortList, null);
        beginTransaction.d();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setMMTitle(com.tencent.mm.R.string.f490263q0);
        hideActionbarLine();
    }
}
