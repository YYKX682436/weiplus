package c30;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae f119695a;

    public t(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        tq.b bVar = tq.b.f502715b;
        db6.m106786xe1f0e832("EcsWeShopItem", bVar);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = db6.m106824x752de218("EcsWeShopItem", bVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
        this.f119695a = m106824x752de218;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tq.d a(java.lang.String shopAppId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopAppId, "shopAppId");
        try {
            return (tq.d) this.f119695a.m107139x946de4d9(b(), tq.b.f502717d.eq(shopAppId));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopItemStorage", e17, "getByShopAppId error: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da localId = tq.b.f502716c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localId, "localId");
        arrayList.add(localId);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopAppId = tq.b.f502717d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopAppId, "shopAppId");
        arrayList.add(shopAppId);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopName = tq.b.f502718e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopName, "shopName");
        arrayList.add(shopName);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopLogoUrl = tq.b.f502719f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopLogoUrl, "shopLogoUrl");
        arrayList.add(shopLogoUrl);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopRIconLightUrl = tq.b.f502720g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopRIconLightUrl, "shopRIconLightUrl");
        arrayList.add(shopRIconLightUrl);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopRIconDarkUrl = tq.b.f502721h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopRIconDarkUrl, "shopRIconDarkUrl");
        arrayList.add(shopRIconDarkUrl);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopStatusValue = tq.b.f502722i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopStatusValue, "shopStatusValue");
        arrayList.add(shopStatusValue);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopTagTypeValue = tq.b.f502723j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopTagTypeValue, "shopTagTypeValue");
        arrayList.add(shopTagTypeValue);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopTagModifyTime = tq.b.f502724k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopTagModifyTime, "shopTagModifyTime");
        arrayList.add(shopTagModifyTime);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da updateSeq = tq.b.f502726m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(updateSeq, "updateSeq");
        arrayList.add(updateSeq);
        return (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) arrayList.toArray(new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[0]);
    }

    public final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopName = tq.b.f502718e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopName, "shopName");
        arrayList.add(shopName);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopLogoUrl = tq.b.f502719f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopLogoUrl, "shopLogoUrl");
        arrayList.add(shopLogoUrl);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopRIconLightUrl = tq.b.f502720g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopRIconLightUrl, "shopRIconLightUrl");
        arrayList.add(shopRIconLightUrl);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopRIconDarkUrl = tq.b.f502721h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopRIconDarkUrl, "shopRIconDarkUrl");
        arrayList.add(shopRIconDarkUrl);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopStatusValue = tq.b.f502722i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopStatusValue, "shopStatusValue");
        arrayList.add(shopStatusValue);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopTagTypeValue = tq.b.f502723j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopTagTypeValue, "shopTagTypeValue");
        arrayList.add(shopTagTypeValue);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da shopTagModifyTime = tq.b.f502724k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopTagModifyTime, "shopTagModifyTime");
        arrayList.add(shopTagModifyTime);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da updateSeq = tq.b.f502726m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(updateSeq, "updateSeq");
        arrayList.add(updateSeq);
        return (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) arrayList.toArray(new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[0]);
    }

    public final boolean d(tq.d item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        try {
            this.f119695a.m107179xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) item, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae>[]) c(), tq.b.f502716c.eq(item.f502729a));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopItemStorage", e17, "update error: " + e17.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }
}
