package com.tencent.mm.plugin.card.ui;

@db5.a(7)
/* loaded from: classes5.dex */
public class CardShowWaringTransparentUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488365rc;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        db5.e1.y(this, getString(com.tencent.mm.R.string.avz, getIntent().getStringExtra("KEY_BRAND_NAME")), getString(com.tencent.mm.R.string.f490808aw0), getString(com.tencent.mm.R.string.at8), new com.tencent.mm.plugin.card.ui.i4(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }
}
