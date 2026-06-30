package wu;

/* loaded from: classes9.dex */
public final class d0 extends wu.p {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f531089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
        this.f531089h = pd5.l.f435113b.a(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20103xeae93e71.class, false);
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!this.f531089h) {
            com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
            if (abstractC11172x705e5905 == null) {
                return;
            }
            z01.p pVar = new z01.p();
            pVar.f550669d = q(item);
            pVar.f550670e = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
            pVar.f550671f = new wu.c0(this, item);
            abstractC11172x705e5905.m48330xfcfee142(pVar);
            return;
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e59052 == null) {
            return;
        }
        z01.d dVar = new z01.d();
        dVar.f550511d = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        s15.h hVar = item.f366530e;
        s15.s y17 = hVar.y();
        java.lang.String m163621x8010e5e4 = y17 != null ? y17.m163621x8010e5e4() : null;
        android.content.Context context = containerView.getContext();
        if (m163621x8010e5e4 != null && context != null) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            dVar.f550513f = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m163621x8010e5e4);
        }
        s15.s y18 = hVar.y();
        dVar.f550512e = y18 != null ? y18.l() : null;
        s15.s y19 = hVar.y();
        dVar.f550514g = y19 != null ? y19.k() : null;
        android.content.Context context2 = containerView.getContext();
        s15.s y27 = hVar.y();
        java.lang.Integer valueOf = y27 != null ? java.lang.Integer.valueOf(y27.j()) : null;
        if (context2 != null && valueOf != null && (intValue = valueOf.intValue()) > 0) {
            if (intValue == 1) {
                dVar.f550515h = com.p314xaae8f345.mm.R.raw.f79909x77ca9e41;
                dVar.f550516i = b3.l.m9702x7444d5ad(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7);
            } else if (intValue == 2) {
                dVar.f550515h = com.p314xaae8f345.mm.R.raw.f79910x4f27281f;
            }
        }
        dVar.f550518n = new wu.b0(this, item);
        abstractC11172x705e59052.m48330xfcfee142(dVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        x05.c q17 = q(item);
        android.content.Intent intent = new android.content.Intent();
        hu.f fVar = this.f531143e;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(fVar.q())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(fVar.q()) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_ec_source", q17.n());
        intent.putExtra("finder_username", q17.m174810x6c03c64c());
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", q17.m174809x8010e5e4());
        intent.putExtra("key_finder_teen_mode_user_id", q17.m174810x6c03c64c());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 c22080x46c0e48c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        if (this.f531089h) {
            r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
            android.content.Context context = containerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c22080x46c0e48c = ((bf5.a) Ai).f(context);
        } else {
            ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
            android.content.Context context2 = containerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            c22080x46c0e48c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22080x46c0e48c(context2, null, 0, 6, null);
        }
        c22080x46c0e48c.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22080x46c0e48c, -2, -2);
    }

    public final x05.c q(hu.b bVar) {
        x05.c cVar = new x05.c();
        s15.s y17 = bVar.f366530e.y();
        if (y17 != null) {
            cVar.u(y17.m163622x6c03c64c());
            cVar.t(y17.m163621x8010e5e4());
            cVar.r(y17.l());
            cVar.q(y17.k());
            cVar.p(y17.j());
            cVar.s(y17.n());
        }
        return cVar;
    }
}
