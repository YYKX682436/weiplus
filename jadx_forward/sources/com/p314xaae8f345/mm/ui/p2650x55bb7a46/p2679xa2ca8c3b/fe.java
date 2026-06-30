package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes11.dex */
public class fe extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 f285495b;

    public static void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fe feVar, rd5.d dVar, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (feVar == null) {
            return;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 c18737x1ba35fc6 = feVar.f285495b;
        c18737x1ba35fc6.getClass();
        c18737x1ba35fc6.b(nm4.m.f420033d);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingChatRoomItemHolder", "null == content");
            return;
        }
        if (118 == v17.f430199i) {
            il4.b bVar = (il4.b) v17.y(il4.b.class);
            feVar.f285495b.m72285x69ac84bb(bVar.f373632e);
            feVar.f285495b.m72286xefe20a96(dVar2.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
            feVar.f285495b.c(il4.d.d(dVar2.g(), v17.f430187f, bVar.f373633f, bVar.f373634g));
            c(feVar.f285495b, bVar.f373632e);
            feVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar, dVar2.D(), feVar, null));
            feVar.f39493x8ad70635.setOnClickListener(a0Var.w(dVar2));
            feVar.f39493x8ad70635.setOnLongClickListener(a0Var.u(dVar2));
            feVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar2.f542241c.a(sb5.z.class))).B1);
            feVar.f39493x8ad70635.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ge(feVar, bVar));
        }
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 c18737x1ba35fc6, final java.lang.String categoryId) {
        jm4.g3 f17;
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(c18737x1ba35fc6);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.chatting.viewitems.fe$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                bw5.p90 p90Var = (bw5.p90) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 c18737x1ba35fc62 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6) weakReference.get();
                if (p90Var == null || c18737x1ba35fc62 == null) {
                    return null;
                }
                if (!categoryId.equals(c18737x1ba35fc62.getCategoryId())) {
                    return null;
                }
                c18737x1ba35fc62.b(p90Var.f113053t ? nm4.m.f420034e : nm4.m.f420035f);
                return null;
            }
        };
        ((ef0.l4) i9Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryId, "categoryId");
        jm4.v2 v2Var = jm4.w2.f381968d;
        jm4.u2 a17 = v2Var.a();
        bw5.eq0 eq0Var = bw5.eq0.TingChatRoom;
        jm4.d1 d1Var = null;
        jm4.n2 a18 = a17 != null ? ((jm4.w2) a17).a(eq0Var) : null;
        if (a18 == null) {
            jm4.u2 a19 = v2Var.a();
            a18 = a19 != null ? ((jm4.w2) a19).d(eq0Var) : null;
        }
        if (a18 != null && (f17 = ((jm4.p2) a18).f()) != null) {
            d1Var = ((jm4.h3) f17).p();
        }
        if (d1Var != null) {
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f381982o = lVar;
            p3380x6a61f93.p3381xf512d0a5.C30435x21b2e5fd.m168918x21b3c70a(((jm4.e1) d1Var).m105978x2737f10(), categoryId, x1Var);
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f285495b = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6) view.findViewById(com.p314xaae8f345.mm.R.id.srq);
        this.f39493x8ad70635 = view.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f39501x4004bbf3 = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.ott);
        if (!z17) {
        }
        return this;
    }
}
