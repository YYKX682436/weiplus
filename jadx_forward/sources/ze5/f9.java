package ze5;

/* loaded from: classes9.dex */
public final class f9 extends ze5.c9 {
    @Override // ze5.c9, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        menu.b(100, com.p314xaae8f345.mm.R.C30867xcad56011.b3p, com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
    }

    @Override // ze5.c9
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429(context, null, 0, 6, null);
    }

    @Override // ze5.c9
    public q31.p e0(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        java.lang.String n17;
        d15.a aVar;
        java.lang.Long k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        z01.d0 d0Var = new z01.d0();
        java.lang.String U1 = msg.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.d0();
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(U1);
        v05.b k18 = cVar.k();
        if (k18 == null) {
            return new z01.d0();
        }
        int i17 = k18.f513848e + 33;
        d15.a aVar2 = (d15.a) k18.m75936x14adae67(i17);
        if (aVar2 == null || (n17 = aVar2.n()) == null || (aVar = (d15.a) k18.m75936x14adae67(i17)) == null || (k17 = aVar.k()) == null) {
            return d0Var;
        }
        long longValue = k17.longValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).o2(n17, longValue);
        d15.a aVar3 = (d15.a) k18.m75936x14adae67(i17);
        d0Var.f550519d = aVar3 != null ? aVar3.j() : null;
        d0Var.f550520e = pj5.k.f436919a.b(o27);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        d0Var.f550521f = c01.a2.e(n17);
        android.icu.text.SimpleDateFormat simpleDateFormat = new android.icu.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        d15.a aVar4 = (d15.a) k18.m75936x14adae67(i17);
        d0Var.f550522g = java.lang.Long.valueOf(simpleDateFormat.parse(aVar4 != null ? aVar4.l() : null).getTime());
        d0Var.f550523h = java.lang.Long.valueOf(longValue);
        d0Var.f550525m = new ze5.d9(ui6, o27);
        d0Var.f550524i = new ze5.e9(ui6, o27);
        return d0Var;
    }
}
