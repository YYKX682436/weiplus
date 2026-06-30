package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatRoomBindAppUI f64094d;

    public d(com.tencent.mm.chatroom.ui.ChatRoomBindAppUI chatRoomBindAppUI) {
        this.f64094d = chatRoomBindAppUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatRoomBindAppUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg3.k3 k3Var = (vg3.k3) i95.n0.c(vg3.k3.class);
        com.tencent.mm.chatroom.ui.ChatRoomBindAppUI context = this.f64094d;
        vg3.i3 i3Var = context.f63685d;
        kotlin.jvm.internal.o.d(i3Var);
        com.tencent.mm.chatroom.ui.c cVar = new com.tencent.mm.chatroom.ui.c(context);
        ((hn.s) k3Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        r45.h8 h8Var = new r45.h8();
        h8Var.f375928d = i3Var.f436712d;
        h8Var.f375931g = i3Var.f436715g;
        h8Var.f375929e = i3Var.f436713e;
        h8Var.f375930f = i3Var.f436714f;
        h8Var.f375932h = i3Var.f436718m;
        h8Var.f375933i = i3Var.f436717i;
        h8Var.f375934m = i3Var.f436719n;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5285;
        lVar.f70666c = "/cgi-bin/micromsg-bin/appbindchatroom";
        lVar.f70664a = h8Var;
        lVar.f70665b = new r45.i8();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        pm0.v.X(new hn.a(h0Var, context));
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new hn.c(h0Var, i3Var, cVar, context));
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatRoomBindAppUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
