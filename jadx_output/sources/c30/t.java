package c30;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f38162a;

    public t(com.tencent.wcdb.core.Database db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        tq.b bVar = tq.b.f421182b;
        db6.createTable("EcsWeShopItem", bVar);
        com.tencent.wcdb.core.Table table = db6.getTable("EcsWeShopItem", bVar);
        kotlin.jvm.internal.o.f(table, "getTable(...)");
        this.f38162a = table;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tq.d a(java.lang.String shopAppId) {
        kotlin.jvm.internal.o.g(shopAppId, "shopAppId");
        try {
            return (tq.d) this.f38162a.getFirstObject(b(), tq.b.f421184d.eq(shopAppId));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopItemStorage", e17, "getByShopAppId error: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public final com.tencent.wcdb.orm.Field[] b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wcdb.orm.Field localId = tq.b.f421183c;
        kotlin.jvm.internal.o.f(localId, "localId");
        arrayList.add(localId);
        com.tencent.wcdb.orm.Field shopAppId = tq.b.f421184d;
        kotlin.jvm.internal.o.f(shopAppId, "shopAppId");
        arrayList.add(shopAppId);
        com.tencent.wcdb.orm.Field shopName = tq.b.f421185e;
        kotlin.jvm.internal.o.f(shopName, "shopName");
        arrayList.add(shopName);
        com.tencent.wcdb.orm.Field shopLogoUrl = tq.b.f421186f;
        kotlin.jvm.internal.o.f(shopLogoUrl, "shopLogoUrl");
        arrayList.add(shopLogoUrl);
        com.tencent.wcdb.orm.Field shopRIconLightUrl = tq.b.f421187g;
        kotlin.jvm.internal.o.f(shopRIconLightUrl, "shopRIconLightUrl");
        arrayList.add(shopRIconLightUrl);
        com.tencent.wcdb.orm.Field shopRIconDarkUrl = tq.b.f421188h;
        kotlin.jvm.internal.o.f(shopRIconDarkUrl, "shopRIconDarkUrl");
        arrayList.add(shopRIconDarkUrl);
        com.tencent.wcdb.orm.Field shopStatusValue = tq.b.f421189i;
        kotlin.jvm.internal.o.f(shopStatusValue, "shopStatusValue");
        arrayList.add(shopStatusValue);
        com.tencent.wcdb.orm.Field shopTagTypeValue = tq.b.f421190j;
        kotlin.jvm.internal.o.f(shopTagTypeValue, "shopTagTypeValue");
        arrayList.add(shopTagTypeValue);
        com.tencent.wcdb.orm.Field shopTagModifyTime = tq.b.f421191k;
        kotlin.jvm.internal.o.f(shopTagModifyTime, "shopTagModifyTime");
        arrayList.add(shopTagModifyTime);
        com.tencent.wcdb.orm.Field updateSeq = tq.b.f421193m;
        kotlin.jvm.internal.o.f(updateSeq, "updateSeq");
        arrayList.add(updateSeq);
        return (com.tencent.wcdb.orm.Field[]) arrayList.toArray(new com.tencent.wcdb.orm.Field[0]);
    }

    public final com.tencent.wcdb.orm.Field[] c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wcdb.orm.Field shopName = tq.b.f421185e;
        kotlin.jvm.internal.o.f(shopName, "shopName");
        arrayList.add(shopName);
        com.tencent.wcdb.orm.Field shopLogoUrl = tq.b.f421186f;
        kotlin.jvm.internal.o.f(shopLogoUrl, "shopLogoUrl");
        arrayList.add(shopLogoUrl);
        com.tencent.wcdb.orm.Field shopRIconLightUrl = tq.b.f421187g;
        kotlin.jvm.internal.o.f(shopRIconLightUrl, "shopRIconLightUrl");
        arrayList.add(shopRIconLightUrl);
        com.tencent.wcdb.orm.Field shopRIconDarkUrl = tq.b.f421188h;
        kotlin.jvm.internal.o.f(shopRIconDarkUrl, "shopRIconDarkUrl");
        arrayList.add(shopRIconDarkUrl);
        com.tencent.wcdb.orm.Field shopStatusValue = tq.b.f421189i;
        kotlin.jvm.internal.o.f(shopStatusValue, "shopStatusValue");
        arrayList.add(shopStatusValue);
        com.tencent.wcdb.orm.Field shopTagTypeValue = tq.b.f421190j;
        kotlin.jvm.internal.o.f(shopTagTypeValue, "shopTagTypeValue");
        arrayList.add(shopTagTypeValue);
        com.tencent.wcdb.orm.Field shopTagModifyTime = tq.b.f421191k;
        kotlin.jvm.internal.o.f(shopTagModifyTime, "shopTagModifyTime");
        arrayList.add(shopTagModifyTime);
        com.tencent.wcdb.orm.Field updateSeq = tq.b.f421193m;
        kotlin.jvm.internal.o.f(updateSeq, "updateSeq");
        arrayList.add(updateSeq);
        return (com.tencent.wcdb.orm.Field[]) arrayList.toArray(new com.tencent.wcdb.orm.Field[0]);
    }

    public final boolean d(tq.d item) {
        kotlin.jvm.internal.o.g(item, "item");
        try {
            this.f38162a.updateObject((com.tencent.wcdb.core.Table) item, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.Table>[]) c(), tq.b.f421183c.eq(item.f421196a));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopItemStorage", e17, "update error: " + e17.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }
}
