package com.tencent.mm.plugin.aa.ui;

@gm0.a2
/* loaded from: classes3.dex */
public class AAEntranceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f72426f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f72427d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f72428e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487863a0;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            return;
        }
        if (i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.tencent.mars.xlog.Log.i("MicroMsg.AAEntranceUI", "select chatroom：%s", stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.LaunchAAUI.class);
                intent2.putExtra("enter_scene", 2);
                intent2.putExtra("chatroom_name", stringExtra);
                if (getIntent().getExtras() != null) {
                    intent2.putExtras(getIntent().getExtras());
                }
                startActivityForResult(intent2, 2);
            }
        } else if (i17 == 2) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        this.f72427d = (android.widget.Button) findViewById(com.tencent.mm.R.id.hu8);
        this.f72428e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bs9);
        this.f72427d.setOnClickListener(new com.tencent.mm.plugin.aa.ui.c(this));
        java.lang.String string = getString(com.tencent.mm.R.string.b6s);
        com.tencent.mm.wallet_core.ui.r1.w0(this.f72428e, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.d(this), true), getContext());
        setBackBtn(new com.tencent.mm.plugin.aa.ui.e(this));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f482290ae)).getPaint(), 0.8f);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
    }
}
