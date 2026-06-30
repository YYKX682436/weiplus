package wu;

/* loaded from: classes9.dex */
public final class d1 extends wu.p {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f531090h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 c10524x8587e460;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.k z17 = item.f366530e.z();
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecordDetailShopCardItemConvert", "record item shop window share item == null");
            return;
        }
        if (this.f531090h == null) {
            z17.S();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(z17.S()) > 0) {
                c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
                android.content.Context context = containerView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                b00.r rVar = (b00.r) z2Var;
                rVar.getClass();
                rVar.f98290d.getClass();
                c10524x8587e460 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10523x7e6be700(context, null, 0);
            } else {
                c00.z2 z2Var2 = (c00.z2) i95.n0.c(c00.z2.class);
                android.content.Context context2 = containerView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                b00.r rVar2 = (b00.r) z2Var2;
                rVar2.getClass();
                rVar2.f98290d.getClass();
                c10524x8587e460 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10524x8587e460(context2, null, 0);
            }
            this.f531090h = c10524x8587e460;
            containerView.addView(c10524x8587e460, -2, -2);
        }
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String avatarUsername = item.f366531f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUsername, "avatarUsername");
        ((b00.r) ((c00.z2) c17)).f98290d.getClass();
        g00.f fVar = new g00.f(e00.l.e(z17), bw5.x8.ECS_REQ_SCENE_RECORD);
        fVar.f348933f = avatarUsername;
        fVar.f348937m = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f531090h;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(fVar);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f531090h;
        if (abstractC11172x705e59052 != null) {
            abstractC11172x705e59052.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d87);
        }
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(view), null, null, new wu.c1(view, item, null), 3, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
    }
}
