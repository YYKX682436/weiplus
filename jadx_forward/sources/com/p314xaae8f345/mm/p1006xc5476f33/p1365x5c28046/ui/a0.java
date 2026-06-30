package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b f179423d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b) {
        this.f179423d = activityC13279x3d93ec0b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = this.f179423d;
        java.util.ArrayList arrayList = activityC13279x3d93ec0b.f179244s;
        objArr[0] = java.lang.Integer.valueOf(arrayList == null ? 0 : arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "deleteEmoji mSelectedList size:%d", objArr);
        java.util.ArrayList arrayList2 = activityC13279x3d93ec0b.f179244s;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiCustomUI", "empty seleted list");
            return;
        }
        activityC13279x3d93ec0b.f179240p = db5.e1.Q(activityC13279x3d93ec0b, activityC13279x3d93ec0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC13279x3d93ec0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvs), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.f0(activityC13279x3d93ec0b));
        java.util.ArrayList arrayList3 = activityC13279x3d93ec0b.f179244s;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Integer.valueOf(arrayList3 == null ? 0 : arrayList3.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "deleteSyncEmoji list size:%d", objArr2);
        if (arrayList3 == null || arrayList3.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "empty size.");
        } else {
            gm0.j1.n().f354821b.g(new z12.g(activityC13279x3d93ec0b.f179245t, 2, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.T6(activityC13279x3d93ec0b.f179244s), null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "touchBatchEmojiBackup over emoji size. need touch :%b", java.lang.Boolean.FALSE);
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(activityC13279x3d93ec0b) || (n3Var = activityC13279x3d93ec0b.S) == null) {
            return;
        }
        n3Var.mo50307xb9e94560(1003, 0);
    }
}
