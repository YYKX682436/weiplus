package wu;

/* loaded from: classes9.dex */
public final class x extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.m mVar = new z01.m();
        s15.h hVar = item.f366530e;
        java.lang.String m75945x2fec8307 = hVar.m75945x2fec8307(hVar.f384955d + 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m75945x2fec8307, "<set-?>");
        mVar.f550631i = m75945x2fec8307;
        java.lang.String f07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(hVar.m75942xfb822ef2(hVar.f384955d + 11));
        if (f07 == null) {
            f07 = "";
        }
        mVar.f550632m = f07;
        mVar.f550633n = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        java.lang.String n17 = hVar.n();
        i95.m c17 = i95.n0.c(pt.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mVar.f550636q = pt.m0.oa((pt.m0) c17, false, n17, false, false, 12, null);
        mVar.D = new wu.w(this, containerView, item);
        abstractC11172x705e5905.m48330xfcfee142(mVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r(context, item);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 s17 = ((bf5.a) Ai).s(context);
        s17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(s17, -2, -2);
    }

    public final java.lang.String q(java.lang.String str) {
        java.lang.String m126747x696739c;
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20164x8b5bf031()) == 1;
        hu.f fVar = this.f531143e;
        if (!z17) {
            s15.w wVar = fVar.f366538e;
            return (wVar == null || (m126747x696739c = wVar.m126747x696739c()) == null) ? "" : m126747x696739c;
        }
        s15.w wVar2 = fVar.f366538e;
        if (wVar2 == null) {
            return "";
        }
        s15.w wVar3 = new s15.w();
        wVar3.m75931xb5cb93b2(wVar2.mo126745xcc31ba03());
        java.util.LinkedList j17 = wVar3.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : j17) {
            s15.h hVar = (s15.h) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.m75945x2fec8307(hVar.f384955d + 3), str)) {
                arrayList.add(obj);
            }
        }
        wVar3.l(new java.util.LinkedList(arrayList));
        return wVar3.m126747x696739c();
    }

    public final void r(android.content.Context context, hu.b bVar) {
        ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) w2Var).getClass();
        if (!sc5.g.f488106b) {
            s(context, bVar);
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        hu.f fVar = this.f531143e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(fVar.q(), fVar.n());
        s15.h hVar = bVar.f366530e;
        java.lang.String m75945x2fec8307 = hVar.m75945x2fec8307(hVar.f384955d + 3);
        if (((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) w2Var).Bi(context, n17, q(m75945x2fec8307), m75945x2fec8307)) {
            return;
        }
        s(context, bVar);
    }

    public final void s(android.content.Context context, hu.b bVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.record.ui.RecordMsgFileUI");
        hu.f fVar = this.f531143e;
        intent.putExtra("message_id", fVar.n());
        intent.putExtra("message_talker", fVar.q());
        s15.h hVar = bVar.f366530e;
        intent.putExtra("record_xml", q(hVar.m75945x2fec8307(hVar.f384955d + 3)));
        s15.h hVar2 = bVar.f366530e;
        intent.putExtra("record_data_id", hVar2.m75945x2fec8307(hVar2.f384955d + 3));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert", "startLegacyFileUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert", "startLegacyFileUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
