package ze5;

/* loaded from: classes9.dex */
public abstract class w8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements we5.b, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (layoutInflater == null) {
            return null;
        }
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, M() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e1x : com.p314xaae8f345.mm.R.C30864xbddafb2a.e1i);
        android.content.Context context = layoutInflater.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d07 = d0(context);
        ze5.n8 n8Var = new ze5.n8();
        n8Var.a(xgVar, d07);
        xgVar.setTag(n8Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return true;
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    public abstract com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context);

    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlock, "uiBlock");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        uiBlock.d(new ze5.o8(msgData, ui6, this, i0(ui6, msgData, str)));
        if (M()) {
            uiBlock.d(new ze5.p8(this, f9Var, msgData, ui6));
        }
        uiBlock.d(new ze5.q8(this, ui6, f9Var, str));
        uiBlock.d(new ze5.r8(this));
        uiBlock.d(new ze5.s8(this, ui6, msgData));
        uiBlock.d(new ze5.t8(this, ui6, msgData));
        uiBlock.d(new ze5.u8(this, ui6, msgData));
    }

    public java.util.List e0(ze5.n8 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return kz5.p0.f395529d;
    }

    public java.util.List f0(ze5.n8 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return kz5.p0.f395529d;
    }

    public java.util.List g0(ze5.n8 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return kz5.p0.f395529d;
    }

    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    public abstract q31.p i0(yb5.d dVar, rd5.d dVar2, java.lang.String str);

    @Override // we5.b
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public ze5.la b(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new ze5.la(params, getClass());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        e(ui6, msgData, userName, new we5.y0(new we5.u0((ze5.n8) holder)));
    }
}
