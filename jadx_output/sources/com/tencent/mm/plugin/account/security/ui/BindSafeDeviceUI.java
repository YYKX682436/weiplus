package com.tencent.mm.plugin.account.security.ui;

/* loaded from: classes5.dex */
public class BindSafeDeviceUI extends com.tencent.mm.ui.MMWizardActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489441cj5;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i7b);
        setBackBtn(new h71.a(this));
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.mgw)).setImageResource(com.tencent.mm.R.raw.accounts_saftphone_icon);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.mgx)).setText(com.tencent.mm.R.string.i7e);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o_o)).setText(com.tencent.mm.R.string.i7f);
        findViewById(com.tencent.mm.R.id.o_o).setOnClickListener(new h71.b(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
