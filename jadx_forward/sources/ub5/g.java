package ub5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ub5.g f507762a = new ub5.g();

    public final void a(android.app.Activity context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, java.util.List msgList, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, ub5.j jVar, yz5.a aVar, xj.m adInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToYuanBao, msgList: ");
        sb6.append(msgList.size());
        sb6.append(", talker: ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
        bc5.e eVar = new bc5.e(context, msgList, z3Var);
        eVar.f100728k = ac5.f.f84623a.b(context, z3Var == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.z3() : z3Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 2);
        z2Var.q(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.olt));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570998eo2, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1p)).setText(((ht.w) ((jt.c0) i95.n0.c(jt.c0.class))).wi(context));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a17);
        gk0.k kVar = new gk0.k(imageView.getWidth(), imageView.getHeight());
        kVar.f353966d = 0.5f;
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(imageView, com.p314xaae8f345.mm.ui.bk.C() ? adInfo.f536290e : adInfo.f536289d, kVar);
        jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ty9);
        ((jb0.g) xVar).getClass();
        boolean a17 = lb0.q.f399221a.a(textView, 8, false, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567448ug5)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574370i25, java.lang.Integer.valueOf(eVar.b(true, 1, true, true).size())));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cwk)).setOnClickListener(new ub5.a(eVar, context));
        z2Var.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getString(a17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq : com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq));
        ub5.b bVar = new ub5.b(z2Var);
        ub5.d dVar = new ub5.d(z2Var, eVar, adInfo, context, jVar, aVar, z3Var);
        z2Var.D = bVar;
        z2Var.E = dVar;
        z2Var.f293591g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cw_);
        z2Var.j(inflate);
        z2Var.C();
    }
}
