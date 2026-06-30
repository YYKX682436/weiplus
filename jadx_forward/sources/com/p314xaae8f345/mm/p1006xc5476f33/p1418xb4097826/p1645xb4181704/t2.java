package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class t2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211947f;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, jv2.i iVar, android.content.Context context) {
        this.f211945d = q3Var;
        this.f211946e = iVar;
        this.f211947f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211945d;
        android.app.Dialog dialog = q3Var.D;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        android.content.Context context = this.f211947f;
        if (f0Var == null) {
            q3Var.D = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.n2.f211852d);
        }
        jv2.i iVar = this.f211946e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p2(q3Var, iVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.s2(q3Var, iVar, context), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q2(q3Var, context));
        jv2.c cVar = iVar.f383756d;
        int i18 = cVar.f67484x29d3a50c;
        if (((i18 == 1 || i18 == -1) ? false : true) || cVar.f67480xf609be94 == 0) {
            p2Var.mo152xb9724478();
        }
    }
}
