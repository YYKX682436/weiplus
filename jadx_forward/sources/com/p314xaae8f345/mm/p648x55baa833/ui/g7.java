package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class g7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.m7 f145716d;

    public g7(com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var) {
        this.f145716d = m7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$agreeBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        in.b bVar = new in.b();
        com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var = this.f145716d;
        bVar.mo11468x92b714fd(((dm.w9) m7Var.f145897e.get(intValue)).f69026x225a93cf);
        java.util.LinkedList linkedList = bVar.f374253f;
        in.a aVar = (in.a) linkedList.get(linkedList.size() - 1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(v17.getContext(), v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571339c8), true, false, null);
        boolean q47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(((dm.w9) m7Var.f145897e.get(intValue)).f69025x3b2058a3);
        java.util.LinkedList memberlist = bVar.f374252e;
        if (q47) {
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String str = bVar.f374251d.f374254d;
            java.lang.String str2 = ((dm.w9) m7Var.f145897e.get(intValue)).f69025x3b2058a3;
            java.lang.String str3 = aVar.f374248e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(memberlist, "memberlist");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(memberlist, 10));
            java.util.Iterator it = memberlist.iterator();
            while (it.hasNext()) {
                arrayList2.add(((in.c) it.next()).f374254d);
            }
            ((za0.i) yVar).getClass();
            o41.a aVar2 = new o41.a(str, str2, str3, arrayList2);
            aVar2.f152182i = true;
            pq5.g l17 = aVar2.l();
            android.content.Context context = v17.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).h(new com.p314xaae8f345.mm.p648x55baa833.ui.e7(Q, v17, m7Var, intValue));
        } else {
            long j17 = aVar.f374250g;
            java.lang.String str4 = bVar.f374251d.f374254d;
            java.lang.String str5 = ((dm.w9) m7Var.f145897e.get(intValue)).f69025x3b2058a3;
            java.lang.String str6 = aVar.f374248e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(memberlist, "memberlist");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(memberlist, 10));
            java.util.Iterator it6 = memberlist.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((in.c) it6.next()).f374254d);
            }
            kn.d dVar = new kn.d(j17, str4, str5, str6, arrayList3);
            dVar.f152182i = true;
            pq5.g l18 = dVar.l();
            android.content.Context context2 = v17.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l18.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).h(new com.p314xaae8f345.mm.p648x55baa833.ui.f7(Q, v17, m7Var, intValue));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_confirm", v17, new java.util.HashMap(), 25772);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$agreeBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
