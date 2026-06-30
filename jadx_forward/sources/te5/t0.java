package te5;

/* loaded from: classes9.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final te5.t0 f500283d = new te5.t0();

    public t0() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 chattingHolder = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingHolder, "chattingHolder");
        if (!(msgData instanceof qd5.i)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            boolean z17 = false;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2", "invoke", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2", "invoke", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = view instanceof com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 ? (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) view : null;
            if (abstractC11172x705e5905 != null) {
                z01.l lVar = (z01.l) abstractC11172x705e5905.m48328xa0ab20ce();
                if (lVar == null) {
                    lVar = new z01.l();
                }
                lVar.f550620d = false;
                lVar.f550625i = new te5.r0(chattingContext, msgData);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = chattingContext.f542241c;
                lVar.f550624h = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) cVar.a(sb5.e.class))).f281644m.f272402d;
                wg3.i iVar = (wg3.i) i95.n0.c(wg3.i.class);
                te5.s0 s0Var = new te5.s0(msgData, chattingContext);
                kc5.s sVar = (kc5.s) iVar;
                sVar.getClass();
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(abstractC11172x705e5905, "collection_album_msg_fold_btn");
                ((cy1.a) aVar.ik(abstractC11172x705e5905, 8, 37491)).Ai(abstractC11172x705e5905, new kc5.p(s0Var, sVar));
                abstractC11172x705e5905.m48330xfcfee142(lVar);
                sb5.a0 a0Var = (sb5.a0) cVar.a(sb5.a0.class);
                if (a0Var != null) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) a0Var).q0(msgData.f475787d.f526833b, abstractC11172x705e5905);
                }
                java.lang.String b17 = ic5.f.f371970c.b(msgData.f475787d.f526833b);
                if (a0Var != null) {
                    if (r26.n0.N(b17) ? false : ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) a0Var).f281155g.contains(b17)) {
                        z17 = true;
                    }
                }
                abstractC11172x705e5905.setAlpha(z17 ? 0.0f : 1.0f);
            }
        }
        return jz5.f0.f384359a;
    }
}
