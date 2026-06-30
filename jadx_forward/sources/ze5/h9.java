package ze5;

/* loaded from: classes9.dex */
public class h9 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553510s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        ze5.m9.f553632a.a(this, item, ui6, msgData.f475787d.f526833b);
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        yb5.d dVar = this.f553510s;
        if (dVar == null) {
            return false;
        }
        ze5.m9.f553632a.b(dVar, menu, v17, f9Var, true);
        return true;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (dVar == null || f9Var == null) {
            return false;
        }
        return ze5.m9.f553632a.c(dVar, f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
    }

    @Override // ze5.w8
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 n17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).n(context);
        n17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562715mi);
        n17.setForeground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562678lu));
        n17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return n17;
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        this.f553510s = ui6;
        z01.e0 d17 = ze5.m9.f553632a.d(ui6, msgData.f475787d.f526833b);
        d17.f550536h = new ze5.g9(this, ui6, msgData);
        return d17;
    }
}
