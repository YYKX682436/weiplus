package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 f145627d;

    public d(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 activityC10330xb121fb05) {
        this.f145627d = activityC10330xb121fb05;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatRoomBindAppUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg3.k3 k3Var = (vg3.k3) i95.n0.c(vg3.k3.class);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 context = this.f145627d;
        vg3.i3 i3Var = context.f145218d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i3Var);
        com.p314xaae8f345.mm.p648x55baa833.ui.c cVar = new com.p314xaae8f345.mm.p648x55baa833.ui.c(context);
        ((hn.s) k3Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.h8 h8Var = new r45.h8();
        h8Var.f457461d = i3Var.f518245d;
        h8Var.f457464g = i3Var.f518248g;
        h8Var.f457462e = i3Var.f518246e;
        h8Var.f457463f = i3Var.f518247f;
        h8Var.f457465h = i3Var.f518251m;
        h8Var.f457466i = i3Var.f518250i;
        h8Var.f457467m = i3Var.f518252n;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5285;
        lVar.f152199c = "/cgi-bin/micromsg-bin/appbindchatroom";
        lVar.f152197a = h8Var;
        lVar.f152198b = new r45.i8();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        pm0.v.X(new hn.a(h0Var, context));
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new hn.c(h0Var, i3Var, cVar, context));
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatRoomBindAppUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
