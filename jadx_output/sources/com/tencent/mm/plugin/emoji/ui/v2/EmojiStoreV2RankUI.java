package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class EmojiStoreV2RankUI extends com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI {
    public final com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct I = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();

    /* renamed from: J, reason: collision with root package name */
    public boolean f98260J = true;

    public static void t7(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RankUI emojiStoreV2RankUI) {
        r45.zj0 zj0Var;
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = emojiStoreV2RankUI.I;
        try {
            int firstVisiblePosition = emojiStoreV2RankUI.f97648i.getFirstVisiblePosition();
            int lastVisiblePosition = emojiStoreV2RankUI.f97648i.getLastVisiblePosition();
            if (lastVisiblePosition - firstVisiblePosition <= 0) {
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            while (firstVisiblePosition < lastVisiblePosition) {
                j12.i item = emojiStoreV2RankUI.f97649m.getItem(firstVisiblePosition);
                if (item != null && (zj0Var = item.f297167b) != null) {
                    linkedList.add(new j22.j(firstVisiblePosition + 1, zj0Var.f392145x, zj0Var, item.f297176k));
                }
                firstVisiblePosition++;
            }
            emoticonStoreActionStruct.f56072f = 1;
            j22.j.f297257e.a(emoticonStoreActionStruct, linkedList);
            emoticonStoreActionStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiStoreV2RankUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void W6(int i17, int i18, java.lang.String str, z12.t tVar) {
        super.W6(i17, i18, str, tVar);
        if (this.f98260J) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.emoji.ui.v2.m(this), 300L);
            this.f98260J = false;
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int Y6() {
        return 5;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int c7() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int d7() {
        return 105;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void f7(j12.i iVar, int i17) {
        if (iVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV2RankUI", "item is null.");
            return;
        }
        boolean g17 = this.f97649m.g(i17);
        if (iVar.f297166a == j12.h.cellset) {
            r45.kj0 kj0Var = iVar.f297169d;
            if (kj0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV2RankUI", "banner set is null. do nothing");
                return;
            } else {
                y12.m.a(getContext(), kj0Var, false);
                return;
            }
        }
        r45.zj0 zj0Var = iVar.f297167b;
        if (zj0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV2RankUI", "summary is null. do nothing");
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17 + 1);
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.I;
        emoticonStoreActionStruct.p(valueOf);
        emoticonStoreActionStruct.u(zj0Var.f392128d);
        emoticonStoreActionStruct.q(zj0Var.f392145x);
        emoticonStoreActionStruct.f56072f = 3;
        emoticonStoreActionStruct.r(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(zj0Var.D)));
        emoticonStoreActionStruct.t(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(zj0Var.D)));
        emoticonStoreActionStruct.s(com.tencent.mm.plugin.emoji.model.EmojiLogic.m(zj0Var.D));
        emoticonStoreActionStruct.k();
        y12.m.c(getContext(), zj0Var, false, 5, iVar.f297171f, iVar.f297170e, getIntent().getStringExtra("to_talker_name"), 105, this.I, g17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(com.tencent.mm.R.string.f491109bz0);
        this.f97648i.setOnScrollListener(new com.tencent.mm.plugin.emoji.ui.v2.l(this));
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public boolean j7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public j12.b l7() {
        return new i12.m(getContext());
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", "", 2, 5);
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.I;
        emoticonStoreActionStruct.f56071e = 3;
        emoticonStoreActionStruct.f56076j = 2L;
        this.f97662z.f97566k = emoticonStoreActionStruct;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.gd5 gd5Var = new r45.gd5();
        gd5Var.f375141f = currentTimeMillis;
        emoticonStoreActionStruct.f56070d = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV2RankUI", "initeData: %s", java.lang.Long.valueOf(currentTimeMillis));
        try {
            this.f97657u = gd5Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiStoreV2RankUI", e17, "", new java.lang.Object[0]);
        }
    }
}
