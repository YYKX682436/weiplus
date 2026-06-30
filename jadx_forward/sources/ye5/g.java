package ye5;

/* loaded from: classes9.dex */
public final class g extends ye5.a implements qd5.h {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f542786s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        ye5.k0.d(ye5.l0.f542804a, item, ui6, msgData);
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        yb5.d dVar = this.f542786s;
        if (dVar == null) {
            return false;
        }
        ye5.k0.c(ye5.l0.f542804a, menu, v17, msgData, dVar);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void S(yb5.d dVar, rd5.d dVar2) {
        if (dVar2 instanceof qd5.i) {
            qd5.i iVar = (qd5.i) dVar2;
            if (g95.e0.j(iVar.f475787d.f526833b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupItem", "ChattingItemMediaGroupItemFrom onMsgExposed, msg is expired, skip download");
            } else {
                te5.d.f500155a.a(iVar.f475787d.f526833b, new ye5.f(dVar, dVar2));
            }
        }
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
        return ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).m(context);
    }

    @Override // ze5.w8
    public java.util.List e0(ze5.n8 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return kz5.b0.c(ze5.y8.a(ye5.t.f542816d, ye5.x.f542821d, ye5.y.f542822d));
    }

    @Override // ze5.w8
    public java.util.List f0(ze5.n8 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return kz5.b0.c(ze5.y8.a(ye5.h0.f542793d, new ye5.i0(holder, this), ye5.j0.f542799d));
    }

    @Override // qd5.h
    public qd5.f g(rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return new ye5.a0(msgData);
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f542786s = ui6;
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return ye5.k0.a(ye5.l0.f542804a, ui6, msgData, this);
    }
}
