package dr4;

/* loaded from: classes14.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324293d;

    public x0(dr4.p1 p1Var) {
        this.f324293d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.p1 p1Var;
        xq4.a aVar;
        dr4.i iVar = this.f324293d.f324253s;
        if (iVar != null) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) iVar;
            if (d0Var.C || d0Var.f257909g == null || d0Var.f257909g.J4() == null || (p1Var = d0Var.f257908f) == null || (aVar = p1Var.f324237c) == null || ((zq4.b) aVar).f556583j) {
                return;
            }
            if (android.os.Build.MANUFACTURER.equalsIgnoreCase("meizu") && !zo.e.d() && fp.h.a(29)) {
                return;
            }
            if (fp.h.c(28)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "api level: %s, in keyguard, ignore", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11306, 0, 0);
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(d0Var.f257909g.J4(), "android.permission.CAMERA", 19, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.d0$$e
                @Override // j35.b0
                /* renamed from: onRequestPermissionsResult */
                public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                    d0Var2.getClass();
                    if (iArr[0] != 0) {
                        db5.e1.C(d0Var2.f257909g.J4(), d0Var2.f257909g.J4().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), d0Var2.f257909g.J4().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572307aq2), d0Var2.f257909g.J4().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kct), d0Var2.f257909g.J4().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$g
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                                d0Var3.getClass();
                                dialogInterface.dismiss();
                                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                                android.content.Context J4 = d0Var3.f257909g.J4();
                                ((sb0.f) jVar).getClass();
                                j35.u.g(J4);
                            }
                        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$h
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.t0(4103);
                                gq4.v.Bi().k();
                                dialogInterface.dismiss();
                            }
                        });
                    }
                }
            })) {
                d0Var.C = true;
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
            try {
                j0Var = db5.e1.y(d0Var.f257909g.J4(), d0Var.f257909g.J4().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcm), null, d0Var.f257909g.J4().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.t0(4103);
                        gq4.v.Bi().k();
                        dialogInterface.dismiss();
                    }
                });
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.NewVoipMgr", e17, "failed to show alert", new java.lang.Object[0]);
            }
            if (j0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.NewVoipMgr", "new dialog failed");
                return;
            }
            j0Var.setCancelable(false);
            j0Var.setCanceledOnTouchOutside(false);
            j0Var.show();
            d0Var.C = true;
        }
    }
}
