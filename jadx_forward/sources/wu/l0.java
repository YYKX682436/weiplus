package wu;

/* loaded from: classes9.dex */
public final class l0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
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
        z01.y yVar = new z01.y();
        s15.i0 H = item.f366530e.H();
        yVar.f550720g = H != null ? H.j() : null;
        hu.f fVar = this.f531143e;
        yVar.f550717d = fVar.n();
        java.lang.String q17 = fVar.q();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(q17, "<set-?>");
        yVar.f550718e = q17;
        yVar.f550719f = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        yVar.f550722i = new wu.k0(this, item);
        abstractC11172x705e5905.m48330xfcfee142(yVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        s15.w j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        hu.f fVar = this.f531143e;
        if (fVar.n() == 0 || r26.n0.N(fVar.q())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordDetailNoteItemConvert", "empty msgId");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
        c5824x69fbb00a.f136132g.f89439c = view.getContext();
        c5824x69fbb00a.f136132g.f89437a = fVar.n();
        c5824x69fbb00a.f136132g.f89442f = fVar.q();
        am.sn snVar = c5824x69fbb00a.f136132g;
        snVar.f89440d = false;
        s15.i0 H = item.f366530e.H();
        if (H == null || (j17 = H.j()) == null || (str = j17.m126747x696739c()) == null) {
            str = "";
        }
        snVar.f89438b = str;
        c5824x69fbb00a.f136132g.f89443g = 10;
        c5824x69fbb00a.e();
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22085xd1dcc07d c22085xd1dcc07d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22085xd1dcc07d(context, null, 0, 6, null);
        c22085xd1dcc07d.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22085xd1dcc07d, -2, -2);
    }
}
