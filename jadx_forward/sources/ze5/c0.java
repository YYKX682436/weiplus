package ze5;

/* loaded from: classes9.dex */
public abstract class c0 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553395s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553396t;

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (view == null || dVar == null || f9Var == null) {
            return false;
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_wa_native_app");
        k0("view_clk");
        return te5.t.f500282a.d(dVar, f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (view == null || dVar == null || f9Var == null) {
            return;
        }
        db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ze5.z(f9Var, dVar), ze5.a0.f553339d);
    }

    @Override // ze5.w8
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22113x623ab877(context, null, 0, 6, null);
    }

    @Override // ze5.w8, we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlock, "uiBlock");
        super.e(ui6, msgData, str, uiBlock);
        uiBlock.d(new ze5.y(this, ui6));
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.h0(holder, ui6, msg, str);
        this.f553395s = ui6;
        this.f553396t = msg;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = holder.f553644c;
        if (abstractC11172x705e5905 != null) {
            if (M()) {
                abstractC11172x705e5905.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
                abstractC11172x705e5905.setForeground(abstractC11172x705e5905.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562704me));
                abstractC11172x705e5905.setPadding(0, 0, i65.a.b(abstractC11172x705e5905.getContext(), 5), 0);
            } else {
                abstractC11172x705e5905.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562715mi);
                abstractC11172x705e5905.setForeground(abstractC11172x705e5905.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562678lu));
                abstractC11172x705e5905.setPadding(i65.a.b(abstractC11172x705e5905.getContext(), 5), 0, 0, 0);
            }
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(holder.f553644c, msg, "ecs_kf_card_shop", -1);
        k0("view_exp");
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        w05.h hVar = k17 != null ? (w05.h) k17.m75936x14adae67(k17.f513848e + 74) : null;
        c11.a aVar = new c11.a();
        if (hVar != null) {
            aVar.f119335f = hVar.w();
            aVar.f119339m = hVar.s();
            aVar.f119341o = hVar.u();
            aVar.f119334e = new ze5.b0(hVar);
        }
        return aVar;
    }

    public final void k0(java.lang.String str) {
        yb5.d dVar;
        java.lang.String p17;
        java.lang.String m163512x74292566;
        w05.h hVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553396t;
        if (f9Var == null || (dVar = this.f553395s) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        s05.d dVar2 = k17 != null ? (s05.d) k17.m75936x14adae67(k17.f513848e + 39) : null;
        java.lang.Integer valueOf = dVar.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x())) : null;
        boolean D = dVar.D();
        java.lang.String x17 = dVar.x();
        v05.b k18 = cVar.k();
        e00.g.e(str, f9Var, D, x17, 9, (k18 == null || (hVar = (w05.h) k18.m75936x14adae67(k18.f513848e + 74)) == null) ? 0 : hVar.o(), (dVar2 == null || (m163512x74292566 = dVar2.m163512x74292566()) == null) ? "" : m163512x74292566, (dVar2 == null || (p17 = dVar2.p()) == null) ? "" : p17, valueOf, null);
    }
}
