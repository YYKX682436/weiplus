package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3TopicUI;", "Lcom/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiStoreV3TopicUI extends com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI {
    public byte[] K;
    public java.lang.String L;
    public final java.lang.String I = "MicroMsg.EmojiStoreV3TopicUI";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f98478J = "";
    public int M = -1;

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    /* renamed from: Y6, reason: from getter */
    public int getM() {
        return this.M;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct Z6(int i17, j22.j jVar) {
        r45.zj0 zj0Var;
        java.lang.String str = this.I;
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
        b17.f56071e = 4;
        b17.f56076j = this.M;
        b17.f56070d = j22.a.f297249a;
        b17.f56072f = i17;
        if (i17 == 1) {
            try {
                int firstVisiblePosition = this.f97648i.getFirstVisiblePosition();
                int lastVisiblePosition = this.f97648i.getLastVisiblePosition();
                if (lastVisiblePosition - firstVisiblePosition <= 0) {
                    com.tencent.mars.xlog.Log.i(str, "getEmoticonStoreActionStruct failed, start:" + firstVisiblePosition + ", end:" + lastVisiblePosition);
                    return b17;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (firstVisiblePosition < lastVisiblePosition) {
                    j12.i item = this.f97649m.getItem(firstVisiblePosition);
                    if (item != null && (zj0Var = item.f297167b) != null) {
                        linkedList.add(new j22.j(firstVisiblePosition + 1, zj0Var.f392130f, zj0Var, item.f297176k));
                    }
                    firstVisiblePosition++;
                }
                j22.j.f297257e.a(b17, linkedList);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
            }
        } else if ((i17 == 2 || i17 == 3 || i17 == 4) && jVar != null) {
            r45.zj0 zj0Var2 = jVar.f297260c;
            b17.u(zj0Var2 != null ? zj0Var2.f392128d : null);
            b17.p(java.lang.String.valueOf(jVar.f297258a));
            b17.q(jVar.f297259b);
            b17.r(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var2 != null ? zj0Var2.D : null)));
            b17.t(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var2 != null ? zj0Var2.D : null)));
            b17.s(com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var2 != null ? zj0Var2.D : null));
            java.lang.String str2 = jVar.f297261d;
            b17.v(str2 != null ? str2 : "");
        }
        return b17;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    /* renamed from: a7, reason: from getter */
    public byte[] getK() {
        return this.K;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int c7() {
        java.lang.String str = this.L;
        return str == null || str.length() == 0 ? 13 : 14;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int d7() {
        return 5;
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
        super.initView();
        setMMTitle(this.f98478J);
        super.initView();
        showOptionMenu(0, false);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public boolean j7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public j12.b l7() {
        return new i12.m(getContext());
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void m7(int i17, j22.j jVar) {
        Z6(i17, jVar).k();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void n7(z12.t tVar) {
        if (tVar != null) {
            tVar.f469366m = this.L;
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("topic_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f98478J = stringExtra;
        getIntent().getIntExtra("topic_id", -1);
        getIntent().getStringExtra("topic_ad_url");
        getIntent().getStringExtra("topic_icon_url");
        getIntent().getStringExtra("topic_desc");
        this.K = getIntent().getByteArrayExtra("emotion_list_buf");
        this.L = getIntent().getStringExtra("extra_ip_set_key");
        this.M = getIntent().getIntExtra("entrance_scene", 11);
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 3, "", "", 0, java.lang.Integer.valueOf(this.M), 11);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
