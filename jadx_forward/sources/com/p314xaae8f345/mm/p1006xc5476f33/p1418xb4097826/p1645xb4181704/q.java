package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.d f211895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211896f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, jv2.d dVar, android.content.Context context) {
        this.f211894d = o0Var;
        this.f211895e = dVar;
        this.f211896f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211894d;
        android.app.Dialog dialog = o0Var.F;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        android.content.Context context = this.f211896f;
        if (f0Var == null) {
            o0Var.F = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.k.f211811d);
        }
        jv2.d dVar = this.f211895e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p(o0Var, dVar, context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.m(o0Var, dVar, pVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.n(o0Var, context));
        jv2.a aVar = dVar.f383740d;
        int i18 = aVar.f67484x29d3a50c;
        boolean z17 = true;
        if (((i18 == 1 || i18 == -1) ? false : true) || aVar.f67480xf609be94 == 0) {
            mVar.mo152xb9724478();
            return;
        }
        ev2.c cVar = ev2.c.f338433c;
        cVar.getClass();
        ev2.d dVar2 = new ev2.d(aVar, aVar.M);
        fp0.o oVar = cVar.f338434a;
        oVar.getClass();
        pm0.v.X(new fp0.l(oVar, dVar2));
        if (oVar.e(new ev2.d(aVar, aVar.M))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionManager", "removeWhenNotDoingNetScene " + aVar + " is running");
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionManager", "removeWhenNotDoingNetScene " + aVar);
            p000.y.f539830f.a().z0(aVar.f67480xf609be94);
        }
        if (z17) {
            pVar.mo152xb9724478();
            return;
        }
        android.app.Dialog dialog2 = o0Var.F;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.eyg, 0).show();
    }
}
