package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 f281443d;

    public s5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var) {
        this.f281443d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        long[] jArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = this.f281443d;
        sb5.z zVar = (sb5.z) b5Var.f280113d.f542241c.a(sb5.z.class);
        yb5.d chattingContext = b5Var.f280113d;
        java.lang.String x17 = chattingContext.x();
        java.util.concurrent.CopyOnWriteArraySet msgIdSet = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).W;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oi oiVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qi.f281319f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdSet, "msgIdSet");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = msgIdSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(pt0.f0.f439742b1.n(x17, ((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next()).f231013d));
        }
        if (oiVar.a(chattingContext, arrayList2)) {
            fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
            android.app.Activity context = b5Var.f280113d.g();
            java.lang.String x18 = b5Var.f280113d.x();
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).W;
            ((gb0.n) kVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            bh5.c cVar = new bh5.c();
            android.content.Intent intent = new android.content.Intent();
            if (copyOnWriteArraySet != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArraySet, 10));
                java.util.Iterator it6 = copyOnWriteArraySet.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it6.next()).f231013d));
                }
                jArr = kz5.n0.T0(arrayList3);
            } else {
                jArr = null;
            }
            intent.putExtra("key_msg_id_list", jArr);
            intent.putExtra("key_talker", x18);
            intent.putExtra("key_is_multi_select", true);
            intent.putExtra("key_material_origin", "chat");
            pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n.class);
            pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.p0.class);
            pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.b.class);
            cVar.d(intent);
            cVar.f102455a.f102457a = context;
            cVar.a(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.ActivityC10638xd29f3d8b.class.getName());
            cVar.b(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.C10637x3843837e.class);
            cVar.g();
        }
        tb5.i0.f498588a.c(b5Var.p0(), "open", b5Var.f280113d.x(), b5Var.f280236q);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
