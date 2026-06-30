package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class t0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 f284005a;

    public t0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var) {
        this.f284005a = z0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void a(android.view.View view, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[onItemClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var = this.f284005a;
        z0Var.getClass();
        de5.a.f310929a.k(5, 1, 2);
        view.getContext();
        z0Var.getClass();
        sc5.g gVar = sc5.g.f488105a;
        boolean z17 = sc5.g.f488106b;
        android.content.Context context = z0Var.f284074d;
        if (z17 && (f27 = pt0.f0.f2(z0Var.f284075e, f0Var.f279944d)) != null) {
            gVar.f(context, f27, new sc5.h(java.util.UUID.randomUUID().toString()));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", f0Var.f279944d);
        intent.putExtra("msg_talker", z0Var.f284075e);
        if (z0Var.f284107u == 3) {
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
            intent.putExtra("app_show_share", false);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21790x65148c02) context).startActivityForResult(intent, 4);
            return;
        }
        android.content.Context context2 = z0Var.f284074d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/chatting/presenter/FileHistoryListPresenter", "enterFileProfile", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseMediaHistoryListItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/chatting/presenter/FileHistoryListPresenter", "enterFileProfile", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseMediaHistoryListItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        this.f284005a.getClass();
        de5.a.f310929a.k(14, 1, 2);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(view.getContext()).a(view, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.r0(this, f0Var), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s0(this, f0Var), null);
    }
}
