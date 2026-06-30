package com.tencent.mm.plugin.finder.activity.poi.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiContainerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@db5.c9
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderPoiContainerUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489061ed4;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        double doubleExtra = getIntent().getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = getIntent().getDoubleExtra("kwebmap_lng", 0.0d);
        java.lang.String stringExtra = getIntent().getStringExtra("kPoiid");
        java.lang.String stringExtra2 = getIntent().getStringExtra("Kwebmap_locaion");
        java.lang.String stringExtra3 = getIntent().getStringExtra("kPoiName");
        r45.f96 f96Var = new r45.f96();
        f96Var.set(1, java.lang.Float.valueOf((float) doubleExtra));
        f96Var.set(0, java.lang.Float.valueOf((float) doubleExtra2));
        f96Var.set(5, stringExtra);
        f96Var.set(4, stringExtra2);
        f96Var.set(3, stringExtra3);
        int intExtra = getIntent().getIntExtra("key_from_mp_idx", 0);
        int intExtra2 = getIntent().getIntExtra("key_from_mp_biz_uin", 0);
        int intExtra3 = getIntent().getIntExtra("key_from_mp_appmsg_id", 0);
        if (intExtra != 0 || intExtra2 != 0 || intExtra3 != 0) {
            r45.wo2 wo2Var = new r45.wo2();
            wo2Var.set(2, java.lang.Integer.valueOf(intExtra));
            wo2Var.set(0, java.lang.Integer.valueOf(intExtra2));
            wo2Var.set(1, java.lang.Integer.valueOf(intExtra3));
            f96Var.set(21, wo2Var);
        }
        getIntent().putExtra("key_location", f96Var.toByteArray());
        getIntent().putExtra("key_entrance_type", 3);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.g(intent, "intent");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ai.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar = (com.tencent.mm.plugin.finder.viewmodel.component.ai) a17;
        intent.putExtra("key_half_screen_mode", la2.a.f317501e);
        com.tencent.mm.ui.vas.VASCommonFragment a18 = lk5.q0.a(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.class, intent, false, false, false, null, 60, null);
        gx2.q R6 = com.tencent.mm.plugin.finder.viewmodel.component.ai.R6(aiVar, a18, null, null, 6, null);
        aiVar.O6(new ia2.g(aiVar, this));
        int g17 = com.tencent.mm.ui.bl.g(this);
        if (g17 > 0 && R6 != null) {
            R6.setExpandHeight(R6.getF131933e() + g17);
            android.widget.FrameLayout centerContainer = R6.getCenterContainer();
            centerContainer.setPadding(centerContainer.getPaddingLeft(), centerContainer.getPaddingTop(), centerContainer.getPaddingRight(), g17 + R6.getCenterContainer().getPaddingBottom());
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = a18.f211121p;
        kotlin.jvm.internal.o.e(vASActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity");
        kotlin.jvm.internal.o.d(R6);
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.m7((com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) vASActivity, this, a18, R6, null, null, 4, d85.f0.D.f227177e, 24, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        setTheme(com.tencent.mm.R.style.f494400m2);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.t7.class)));
    }
}
