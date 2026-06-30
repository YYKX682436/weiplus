package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class aa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f100468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100469e;

    public aa(o72.r2 r2Var, com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f100468d = r2Var;
        this.f100469e = daVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        o72.r2 r2Var = this.f100468d;
        o72.t2 t2Var = new o72.t2(r2Var);
        int i19 = 3;
        t2Var.f343466d = 3;
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100469e;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        t2Var.f343469g = cVar.o() ? 1 : 0;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar2.o()) {
            com.tencent.mm.plugin.fav.ui.adapter.c cVar3 = daVar.f100583n;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
            i18 = cVar3.f100480m.indexOf(r2Var) + 1;
        } else {
            i18 = -1;
        }
        t2Var.f343470h = i18;
        t2Var.f343471i = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.field_localId)) + 1;
        int i27 = r2Var.field_type;
        r45.bq0 bq0Var = r2Var.field_favProto;
        if (i27 != 5) {
            i19 = i27 != 8 ? 0 : 1;
        } else if (bq0Var != null && bq0Var.K != null) {
            i19 = 2;
        }
        t2Var.f343467e = i19;
        o72.x1.l(r2Var, true, new com.tencent.mm.plugin.fav.ui.z9(daVar), 6, t2Var);
    }
}
