package ze5;

/* loaded from: classes9.dex */
public class o4 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553660s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null) {
            return false;
        }
        ze5.q4.c(ze5.r4.f553713a, item, ui6, f9Var);
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        yb5.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null || (dVar = this.f553660s) == null) {
            return false;
        }
        return ze5.q4.b(ze5.r4.f553713a, menu, v17, f9Var, dVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (dVar == null || f9Var == null) {
            return;
        }
        db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ze5.m4(f9Var, dVar), ze5.n4.f553640d);
    }

    @Override // ze5.w8
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 x17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).x(context);
        x17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
        x17.setForeground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562704me));
        x17.setPadding(0, 0, i65.a.b(context, 5), 0);
        return x17;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f553660s = ui6;
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return ze5.q4.a(ze5.r4.f553713a, ui6, msgData.f475787d.f526833b);
    }
}
