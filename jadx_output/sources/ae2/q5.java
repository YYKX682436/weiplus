package ae2;

/* loaded from: classes3.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.q5 f4115d = new ae2.q5();

    public q5() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wcdb.core.Table table;
        qo2.e Zj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Zj();
        Zj.getClass();
        try {
            table = Zj.f365582d;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(Zj.f365580b, "[clearTable] e:" + e17.getMessage());
        }
        if (table == null) {
            kotlin.jvm.internal.o.o("msgTable");
            throw null;
        }
        table.deleteObjects();
        com.tencent.wcdb.core.Table table2 = Zj.f365581c;
        if (table2 != null) {
            table2.deleteObjects();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("sessionTable");
        throw null;
    }
}
