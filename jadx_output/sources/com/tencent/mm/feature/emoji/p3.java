package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class p3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f66434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66435g;

    public p3(com.tencent.mm.feature.emoji.c4 c4Var, java.lang.String str, int i17, android.content.Context context) {
        this.f66432d = c4Var;
        this.f66433e = str;
        this.f66434f = i17;
        this.f66435g = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f66434f;
        com.tencent.mm.feature.emoji.c4 c4Var = this.f66432d;
        java.lang.String str = this.f66433e;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            com.tencent.mm.storage.emotion.EmojiInfo Ai = c4Var.Ai(str, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12789, 3, Ai.getMd5(), 2, Ai.field_designerID, Ai.field_groupId, "", java.lang.Integer.valueOf(i18), "", "", Ai.field_activityid);
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().r(this.f66435g, Ai, 1000043, -1, true, false, null, null, null);
            return;
        }
        com.tencent.mm.storage.emotion.EmojiInfo Ai2 = c4Var.Ai(str, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12789, 1, Ai2.getMd5(), 2, Ai2.field_designerID, Ai2.field_groupId, "", java.lang.Integer.valueOf(i18), "", "", Ai2.field_activityid);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("Retr_Msg_Type", 5);
        int i19 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
        intent.setClass(this.f66435g, com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        android.content.Context context = this.f66435g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/emoji/EmoticonJsApiService$showBottomSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/emoji/EmoticonJsApiService$showBottomSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
