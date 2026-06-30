package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class sl implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tl f252009d;

    public sl(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tl tlVar) {
        this.f252009d = tlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tl tlVar = this.f252009d;
        tlVar.f252061d.f248800d.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = tlVar.f252061d;
        android.view.View view = activityC18078x319f375d.f248807n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        activityC18078x319f375d.Y = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        Aj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Aj.f247689d.A("SnsComment", "delete from SnsComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        activityC18078x319f375d.m78501x43e00957(activityC18078x319f375d.n7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3$1");
    }
}
