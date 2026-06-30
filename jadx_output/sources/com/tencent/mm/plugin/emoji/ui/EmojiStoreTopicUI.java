package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class EmojiStoreTopicUI extends com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI {
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f97842J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity
    public void U6(android.os.Message message) {
        super.U6(message);
        if (message.what == 1009) {
            t7(this.M);
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void X6(boolean z17, com.tencent.mm.plugin.emoji.model.s sVar, boolean z18, boolean z19) {
        com.tencent.mm.plugin.emoji.model.s sVar2 = this.f97661y;
        super.X6(z17, sVar, z18, z19);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int Y6() {
        return 11;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int c7() {
        return 7;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int d7() {
        return 14;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int e7() {
        return this.I;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void g7() {
        super.g7();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void h7(com.tencent.mm.plugin.emoji.model.s sVar, boolean z17, boolean z18) {
        super.h7(sVar, z17, z18);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        this.I = getIntent().getIntExtra("topic_id", -1);
        this.f97842J = getIntent().getStringExtra("topic_name");
        this.M = getIntent().getStringExtra("topic_ad_url");
        this.K = getIntent().getStringExtra("topic_icon_url");
        this.L = getIntent().getStringExtra("topic_desc");
        this.N = getIntent().getStringExtra("sns_object_data");
        getIntent().getIntExtra("extra_scence", 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.N)) {
            this.I = com.tencent.mm.plugin.emoji.model.EmojiLogic.i(this.N);
            this.f97842J = com.tencent.mm.plugin.emoji.model.EmojiLogic.j(this.N);
            this.K = com.tencent.mm.plugin.emoji.model.EmojiLogic.g(this.N);
            this.L = com.tencent.mm.plugin.emoji.model.EmojiLogic.f(this.N);
            this.M = com.tencent.mm.plugin.emoji.model.EmojiLogic.h(this.N);
        }
        setMMTitle(this.f97842J);
        super.initView();
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_share, new com.tencent.mm.plugin.emoji.ui.m3(this));
        showOptionMenu(0, false);
        t7(this.M);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public boolean j7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public boolean k7() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.M);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public j12.b l7() {
        return new i12.m(getContext());
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 3, "", "", java.lang.Integer.valueOf(this.I), 11, 11);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreTopicUI", "exit in teen mode");
        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
        finish();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (this.f97653q) {
            showOptionMenu(0, false);
        } else {
            showOptionMenu(0, true);
        }
    }

    public void t7(java.lang.String str) {
        if (this.f97646g == null || this.f97647h == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.storage.emotion.EmojiInfo e17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.e("Toptic", 8, str, i65.a.g(this), true);
        if (e17 == null) {
            n11.a.b().j(str, null, y12.f.c("Toptic", str, false, "Toptic", "BANNER"), new com.tencent.mm.plugin.emoji.ui.n3(this));
        } else {
            this.f97647h.setImageFilePath(e17.N0());
        }
    }
}
