package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class AppBrandNearbyEmptyUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488054fl;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        if (com.tencent.mm.ui.bk.v0()) {
            overridePendingTransition(0, 0);
        }
        getContentView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        setMMTitle(com.tencent.mm.R.string.f490206nx);
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.y5(this));
        if (getSupportActionBar() != null && (findViewById = getSupportActionBar().j().findViewById(com.tencent.mm.R.id.actionbar_up_indicator)) != null && findViewById.getLayoutParams() != null && (findViewById.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = 0;
            findViewById.requestLayout();
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483929ci0);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.chm);
        int intExtra = getIntent().getIntExtra("extra_enter_reason", 0);
        com.tencent.mm.plugin.appbrand.report.model.i0 i0Var = com.tencent.mm.plugin.appbrand.report.model.i0.TOP_ENTRANCE_IN_DESKTOP;
        if (intExtra == 0) {
            com.tencent.mm.plugin.appbrand.report.model.j0 j0Var = new com.tencent.mm.plugin.appbrand.report.model.j0();
            j0Var.f88002a = i0Var;
            j0Var.f88006e = com.tencent.mm.plugin.appbrand.report.model.h0.EMPTY_PAGE;
            j0Var.a();
        } else {
            if (intExtra != 1) {
                finish();
                return;
            }
            textView.setText(com.tencent.mm.R.string.f490205nw);
            textView2.setText(com.tencent.mm.R.string.f490204nv);
            com.tencent.mm.plugin.appbrand.report.model.j0 j0Var2 = new com.tencent.mm.plugin.appbrand.report.model.j0();
            j0Var2.f88002a = i0Var;
            j0Var2.f88006e = com.tencent.mm.plugin.appbrand.report.model.h0.LBS_NOT_ALLOW;
            j0Var2.a();
        }
        setResult(-1);
    }
}
