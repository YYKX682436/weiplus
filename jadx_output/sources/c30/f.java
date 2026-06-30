package c30;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f38112a;

    public f(com.tencent.wcdb.core.Database db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        tq.a aVar = tq.a.f421178b;
        db6.createTable("EcsWeShopExtItem", aVar);
        com.tencent.wcdb.core.Table table = db6.getTable("EcsWeShopExtItem", aVar);
        kotlin.jvm.internal.o.f(table, "getTable(...)");
        this.f38112a = table;
    }
}
