package wu;

/* loaded from: classes9.dex */
public final class l1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        hu.f fVar = this.f531143e;
        java.lang.String d17 = vu.a.d(item, fVar.q(), fVar.n(), fVar.p());
        bw5.o50 q17 = q(item);
        if (q17 == null) {
            return;
        }
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.h hVar = item.f366530e;
        r45.lm6 b17 = il4.d.b(context, hVar.m75945x2fec8307(hVar.f384955d + 0), q17, d17);
        android.content.Context context2 = abstractC11172x705e5905.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731(context2);
        c18735xc3936731.c();
        c18735xc3936731.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d87);
        c18735xc3936731.g(b17, null);
        z01.e0 e0Var = new z01.e0();
        java.lang.String str = b17.f461170d;
        if (str == null) {
            str = "";
        }
        e0Var.f550533e = str;
        java.lang.String str2 = b17.f461171e;
        e0Var.f550534f = str2 != null ? str2 : "";
        e0Var.f550532d = c18735xc3936731;
        e0Var.f550535g = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        e0Var.f550536h = new wu.k1(this, item);
        abstractC11172x705e5905.m48330xfcfee142(e0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        java.lang.Integer k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        bw5.o50 q17 = q(item);
        if (q17 == null) {
            return;
        }
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        hu.f fVar = this.f531143e;
        eVar.f373639c = (fVar.l() == 1 ? bw5.ar0.TingScene_Fav : bw5.ar0.TingScene_ChatHistory).f106955d;
        java.lang.String q18 = fVar.q();
        if ((q18 == null || q18.length() == 0) && ((k17 = fVar.k()) == null || (q18 = k17.toString()) == null)) {
            q18 = "";
        }
        eVar.f373647k = q18;
        boolean z17 = !r26.n0.N(fVar.q());
        il4.f fVar2 = eVar.f373655s;
        if (z17) {
            java.lang.Long p17 = fVar.p();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17 != null ? p17.toString() : null)) {
                java.util.Map map = fVar2.f373665d;
                java.lang.Long p18 = fVar.p();
                if (p18 == null || (str = p18.toString()) == null) {
                    str = "";
                }
                map.put("msgid", str);
            }
            java.util.Map map2 = fVar2.f373665d;
            java.lang.String str2 = eVar.f373647k;
            map2.put("chat", str2 != null ? str2 : "");
        } else {
            java.util.Map map3 = fVar2.f373665d;
            java.lang.String str3 = eVar.f373647k;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            map3.put("favid", str3 != null ? str3 : "");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.o())) {
            fVar2.f373665d.put("sourceuser", fVar.o());
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((rk4.k8) aj6).o(context, q17, fVar.l() == 1 ? bw5.ar0.TingScene_Fav : bw5.ar0.TingScene_ChatHistory, eVar, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 n17 = ((bf5.a) Ai).n(context);
        n17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(n17, -2, -2);
    }

    public final bw5.o50 q(hu.b bVar) {
        java.lang.String j17;
        bw5.o50 v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        s15.f0 V = bVar.f366530e.V();
        if (V == null || (j17 = V.j()) == null || (v17 = il4.d.v(j17)) == null) {
            return null;
        }
        return v17;
    }
}
