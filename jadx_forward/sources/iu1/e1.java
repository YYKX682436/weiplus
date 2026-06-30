package iu1;

/* loaded from: classes9.dex */
public final class e1 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e f376396a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e) {
        this.f376396a = activityC13068x5a32e52e;
    }

    @Override // vl1.n
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        r45.iu iuVar;
        r45.nj4 nj4Var;
        r45.iu iuVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "click item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e = this.f376396a;
        iu1.v0 v0Var = activityC13068x5a32e52e.f176751m;
        if (v0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
            throw null;
        }
        iu1.w0 x17 = v0Var.x(i17);
        if (x17 != null) {
            int i18 = x17.f376504a;
            if (i18 == 1) {
                r45.h45 h45Var = x17.f376506c;
                if (h45Var != null) {
                    int i19 = h45Var.f457361g;
                    if (i19 == 1) {
                        lu1.d.j(activityC13068x5a32e52e, h45Var.f457362h, 0);
                    } else if (i19 == 2 && (iuVar = h45Var.f457363i) != null) {
                        lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 7);
                return;
            }
            if (i18 != 2) {
                if (i18 == 3 && (nj4Var = x17.f376508e) != null) {
                    int i27 = nj4Var.f462979g;
                    if (i27 == 1) {
                        lu1.d.j(activityC13068x5a32e52e, nj4Var.f462980h, 0);
                        activityC13068x5a32e52e.f176762x = true;
                        return;
                    }
                    if (i27 == 2 && (iuVar2 = nj4Var.f462981i) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
                        l81.b1 b1Var = new l81.b1();
                        b1Var.f398545a = iuVar2.f458861d;
                        b1Var.f398555f = iuVar2.f458862e;
                        b1Var.f398551d = iuVar2.f458863f;
                        b1Var.f398565k = 1028;
                        b1Var.L = activityC13068x5a32e52e.f176764z;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(activityC13068x5a32e52e, b1Var);
                        return;
                    }
                    return;
                }
                return;
            }
            r45.g45 g45Var = x17.f376507d;
            if (g45Var != null) {
                java.lang.String user_card_id = g45Var.f456404d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
                activityC13068x5a32e52e.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "go to card detail: %s", user_card_id);
                android.content.Intent intent = new android.content.Intent(activityC13068x5a32e52e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
                intent.putExtra("key_card_id", user_card_id);
                intent.addFlags(131072);
                intent.putExtra("key_from_scene", 3);
                activityC13068x5a32e52e.startActivityForResult(intent, 256);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(16322, 10);
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Integer.valueOf(g45Var.f456408h);
                java.lang.String user_card_id2 = g45Var.f456404d;
                objArr[1] = user_card_id2;
                iu1.v0 v0Var2 = activityC13068x5a32e52e.f176751m;
                if (v0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                    throw null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id2, "user_card_id");
                objArr[2] = java.lang.Integer.valueOf(v0Var2.y(user_card_id2, g45Var.f456408h));
                objArr[3] = 1;
                objArr[4] = java.lang.Integer.valueOf(activityC13068x5a32e52e.f176757s);
                g0Var.d(16326, objArr);
            }
        }
    }
}
