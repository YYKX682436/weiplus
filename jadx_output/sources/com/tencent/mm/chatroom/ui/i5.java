package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class i5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64222d;

    public i5(com.tencent.mm.chatroom.ui.x5 x5Var) {
        this.f64222d = x5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$agreeBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        in.b bVar = new in.b();
        com.tencent.mm.chatroom.ui.x5 x5Var = this.f64222d;
        bVar.parseFrom(((dm.w9) x5Var.f64648e.get(intValue)).field_data);
        java.lang.String str4 = ((dm.w9) x5Var.f64648e.get(intValue)).field_chatRoomName;
        int i17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str4).field_memberCount;
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "agreeBtnClickListener roomName: " + str4 + " memberCount: " + i17 + ' ');
        boolean q47 = com.tencent.mm.storage.z3.q4(str4);
        java.util.LinkedList memberlist = bVar.f292719e;
        java.util.LinkedList linkedList = bVar.f292720f;
        if (q47) {
            in.a aVar = (in.a) linkedList.get(linkedList.size() - 1);
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(v17.getContext(), v17.getContext().getString(com.tencent.mm.R.string.f490573yv), v17.getContext().getString(com.tencent.mm.R.string.f489806c8), true, false, null);
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String str5 = bVar.f292718d.f292721d;
            java.lang.String str6 = aVar.f292715e;
            kotlin.jvm.internal.o.f(memberlist, "memberlist");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(memberlist, 10));
            java.util.Iterator it = memberlist.iterator();
            while (it.hasNext()) {
                arrayList2.add(((in.c) it.next()).f292721d);
            }
            ((za0.i) yVar).getClass();
            o41.a aVar2 = new o41.a(str5, str4, str6, arrayList2);
            aVar2.f70649i = true;
            pq5.g l17 = aVar2.l();
            android.content.Context context = v17.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context).h(new com.tencent.mm.chatroom.ui.g5(Q, v17, x5Var, intValue));
            str = "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$agreeBtnClickListener$1";
            str2 = "android/view/View$OnClickListener";
            str3 = "onClick";
        } else {
            if (bVar.f292718d.f292727m == 1 && i17 > 200) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(x5Var.f64652i);
                u1Var.u(x5Var.f64652i.getString(com.tencent.mm.R.string.f489923me5));
                u1Var.g(x5Var.f64652i.getString(com.tencent.mm.R.string.f489919me4));
                u1Var.n(x5Var.f64652i.getString(com.tencent.mm.R.string.f490454vi));
                u1Var.a(false);
                u1Var.q(false);
                yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$agreeBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            in.a aVar3 = (in.a) linkedList.get(linkedList.size() - 1);
            com.tencent.mm.ui.widget.dialog.u3 Q2 = db5.e1.Q(v17.getContext(), v17.getContext().getString(com.tencent.mm.R.string.f490573yv), v17.getContext().getString(com.tencent.mm.R.string.f489806c8), true, false, null);
            long j17 = aVar3.f292717g;
            java.lang.String str7 = bVar.f292718d.f292721d;
            java.lang.String str8 = aVar3.f292715e;
            kotlin.jvm.internal.o.f(memberlist, "memberlist");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(memberlist, 10));
            java.util.Iterator it6 = memberlist.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((in.c) it6.next()).f292721d);
            }
            str = "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$agreeBtnClickListener$1";
            str2 = "android/view/View$OnClickListener";
            str3 = "onClick";
            kn.d dVar = new kn.d(j17, str7, str4, str8, arrayList3);
            dVar.f70649i = true;
            pq5.g l18 = dVar.l();
            android.content.Context context2 = v17.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l18.f((com.tencent.mm.ui.MMActivity) context2).h(new com.tencent.mm.chatroom.ui.h5(Q2, v17, x5Var, intValue));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_confirm", v17, new java.util.HashMap(), 25772);
        yj0.a.h(this, str, str2, str3, "(Landroid/view/View;)V");
    }
}
