package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ua extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 f229027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f229028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        super(false);
        this.f229027d = q0Var;
        this.f229028e = activityC16373x8a110f13;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 q0Var = this.f229027d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "jump to action type: %s", java.lang.Integer.valueOf(q0Var.f227086g));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f229028e;
        g0Var.d(18890, 12, java.lang.Integer.valueOf(activityC16373x8a110f13.q7()), activityC16373x8a110f13.T1, activityC16373x8a110f13.s7(), activityC16373x8a110f13.p7(), activityC16373x8a110f13.r7());
        switch (q0Var.f227086g) {
            case 1:
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16373x8a110f13.mo55332x76847179(), q0Var.f227087h, false);
                return;
            case 2:
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a0(activityC16373x8a110f13.mo55332x76847179(), q0Var.f227088i);
                return;
            case 3:
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c0(q0Var.f227088i, q0Var.f227087h, 0, 1100, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ta(activityC16373x8a110f13));
                return;
            case 4:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", q0Var.f227088i);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f542005a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16373x8a110f13.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                e1Var.w(mo55332x76847179, intent);
                return;
            case 5:
            case 6:
                java.lang.String str = q0Var.f227088i;
                jz5.f0 f0Var = null;
                if (str != null) {
                    qk.c0 c0Var = new qk.c0(str);
                    c0Var.f445731g = 21;
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                    jz5.f0 f0Var2 = jz5.f0.f384359a;
                    if (p6Var != null) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(activityC16373x8a110f13.mo55332x76847179(), c0Var);
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "emoticon liteapp service not found");
                    }
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "emoticon liteapp pid is null");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
