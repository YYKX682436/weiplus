package bq;

/* loaded from: classes.dex */
public final class o extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.Long l17, r45.ug7 favType, java.lang.Long l18) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(favType, "favType");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.b11 b11Var = new r45.b11();
        if (l17 != null) {
            b11Var.set(2, java.lang.Long.valueOf(l17.longValue()));
        }
        if (l18 != null) {
            b11Var.set(4, java.lang.Long.valueOf(l18.longValue()));
        }
        b11Var.set(3, java.lang.Integer.valueOf(favType.f387374d));
        b11Var.set(1, db2.t4.f228171a.a(15954));
        lVar.f70664a = b11Var;
        r45.c11 c11Var = new r45.c11();
        c11Var.set(0, new r45.ie());
        lVar.f70665b = c11Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdelglobalfav";
        lVar.f70667d = 15954;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderDelGlobalFavCGI", "objectId:" + l17);
    }
}
