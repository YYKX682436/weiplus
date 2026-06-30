package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class DisasterUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4g;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needShowIdcError() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_disaster_content");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_disaster_url");
        com.tencent.mars.xlog.Log.i("MicroMsg.DisasterUI", "summerdiz onCreate :%d, content[%s], url[%s]", java.lang.Integer.valueOf(hashCode()), stringExtra, stringExtra2);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.kgh)).setText(stringExtra);
        findViewById(com.tencent.mm.R.id.kgd).setOnClickListener(new com.tencent.mm.plugin.account.ui.g1(this, stringExtra2));
        setMMTitle(getString(com.tencent.mm.R.string.bq6));
        setBackBtn(new com.tencent.mm.plugin.account.ui.h1(this));
    }
}
