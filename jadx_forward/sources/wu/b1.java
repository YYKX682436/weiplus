package wu;

/* loaded from: classes9.dex */
public final class b1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
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
        z01.b0 b0Var = new z01.b0();
        b0Var.f550487f = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        s15.h hVar = item.f366530e;
        b0Var.f550485d = hVar.m75945x2fec8307(hVar.f384955d + 0);
        b0Var.f550486e = hVar.m75945x2fec8307(hVar.f384955d + 1);
        b0Var.f550488g = new wu.a1(this, item);
        abstractC11172x705e5905.m48330xfcfee142(b0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.h hVar = item.f366530e;
        s15.i0 H = hVar.H();
        if (H == null || (str = H.m126747x696739c()) == null) {
            str = "";
        }
        hu.f fVar = new hu.f();
        hu.f fVar2 = this.f531143e;
        fVar.w(fVar2.n());
        fVar.y(fVar2.p());
        fVar.z(fVar2.q());
        fVar.x(fVar2.o());
        fVar.u(0);
        fVar.A(str);
        fVar.C(hVar.m75945x2fec8307(hVar.f384955d + 0));
        fVar.B(false);
        fVar.t(fVar2.j() + 1);
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36.class);
        intent.putExtra("params", fVar.mo126745xcc31ba03().toString());
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert", "onClickFromRefer", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert", "onClickFromRefer", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22088xa3cc645c c22088xa3cc645c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22088xa3cc645c(context, null, 0, 6, null);
        c22088xa3cc645c.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22088xa3cc645c, -2, -2);
    }
}
