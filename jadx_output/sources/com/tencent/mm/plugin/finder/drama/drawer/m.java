package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class m implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb2.d f105259b;

    public m(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, zb2.d dVar) {
        this.f105258a = e0Var;
        this.f105259b = dVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105258a;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(e0Var.f105232v));
        r45.qj2 qj2Var = e0Var.f105217d;
        lVarArr[1] = new jz5.l("native_drama_id", pm0.v.u(qj2Var != null ? qj2Var.getLong(0) : 0L));
        lVarArr[2] = new jz5.l("native_drama_item_num", java.lang.Integer.valueOf(e0Var.f105229s));
        zb2.d dVar = this.f105259b;
        r45.fl5 fl5Var = dVar.f471260d;
        lVarArr[3] = new jz5.l("card_native_drama_id", pm0.v.u(fl5Var != null ? fl5Var.getLong(0) : 0L));
        lVarArr[4] = new jz5.l("card_region", java.lang.Integer.valueOf(dVar.f471264h));
        return kz5.c1.l(lVarArr);
    }
}
