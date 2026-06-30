package bq;

/* loaded from: classes10.dex */
public final class z extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dm.pd mention, int i17, r45.qt2 contextObj) {
        super(contextObj);
        kotlin.jvm.internal.o.g(mention, "mention");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6618;
        r45.u31 u31Var = new r45.u31();
        u31Var.set(1, java.lang.Long.valueOf(mention.field_followId));
        u31Var.set(2, java.lang.Integer.valueOf(i17));
        u31Var.set(3, db2.t4.f228171a.b(6618, contextObj));
        u31Var.set(4, xy2.c.f(contextObj));
        lVar.f70664a = u31Var;
        r45.t31 t31Var = new r45.t31();
        t31Var.set(0, new r45.ie());
        lVar.f70665b = t31Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfollowverify";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowVerifyCgi", "init id:" + mention.field_id + ", " + u31Var.getLong(1) + " opType " + i17);
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
