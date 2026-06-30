package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CleanChattingChooseUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f95722d;

    /* renamed from: e, reason: collision with root package name */
    public long f95723e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488616a15;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && intent != null) {
            this.f95723e += intent.getLongExtra("tds", 0L);
            setResult(-1, new android.content.Intent().putExtra("tds", this.f95723e));
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        setMMTitle(com.tencent.mm.R.string.bxx);
        setBackBtn(new cw1.g3(this));
        this.f95722d = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        yv1.g1 b17 = yv1.g1.f466040p.b(getIntent().getIntExtra("session", -1));
        boolean booleanExtra = getIntent().getBooleanExtra("withOrigin", true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u07);
        findViewById.setOnClickListener(new cw1.h3(this, booleanExtra));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.u09);
        findViewById2.setOnClickListener(new cw1.i3(this));
        cw1.u3 u3Var = cw1.q4.f223263s;
        cw1.e4 e4Var = (cw1.e4) cw1.q4.f223264t.get(new cw1.i4(null, null, ot1.h.Q, new long[]{0, com.tencent.wcdb.core.Database.DictDefaultMatchValue}, 0, null, 0, booleanExtra, false, false));
        if (e4Var != null) {
            if (yv1.h1.f466067c) {
                e4Var.f24832e = true;
            }
            e4Var.d();
        }
        mt1.b0.s(28, 0L, new java.lang.Long[0]);
        dy1.a.f(this, iy1.c.ChatHistoryManagePage);
        java.lang.String str = b17.f466043b;
        dy1.a.g(this, "storage_manage_sessionid", str);
        dy1.a.h(this, 4, 32903);
        dy1.a.i(findViewById, "sort_by_chat_size_chat_history");
        dy1.a.j(findViewById, "storage_manage_sessionid", str);
        dy1.a.l(findViewById, 8, 32903);
        dy1.a.i(findViewById2, "sort_by_file_size_chat_history");
        dy1.a.j(findViewById2, "storage_manage_sessionid", str);
        dy1.a.l(findViewById2, 8, 32903);
    }
}
