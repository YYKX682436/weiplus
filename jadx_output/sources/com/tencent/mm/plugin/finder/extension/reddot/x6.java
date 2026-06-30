package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.x6 f105995a = new com.tencent.mm.plugin.finder.extension.reddot.x6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f105996b = kz5.b0.c(new android.util.Pair("FinderRedDotHistoryRecordTable", mi0.a.f326497b));

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f105997c = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.v6.f105927d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f105998d = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.w6.f105967d);

    public final java.util.List a() {
        boolean z17;
        try {
            java.util.List<T> allObjects = ((com.tencent.wcdb.core.Table) ((jz5.n) f105998d).getValue()).getAllObjects();
            kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
            boolean z18 = false;
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (z18) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getAll: ");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
                for (T t17 : allObjects) {
                    com.tencent.mm.plugin.finder.extension.reddot.x6 x6Var = f105995a;
                    kotlin.jvm.internal.o.d(t17);
                    r45.sw3 b17 = x6Var.b(t17);
                    arrayList.add(b17 != null ? com.tencent.mm.plugin.finder.extension.reddot.qa.e(b17) : null);
                }
                sb6.append(arrayList);
                com.tencent.mars.xlog.Log.i("FinderRedDotHistoryRecordProvider", sb6.toString());
            }
            return allObjects;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderRedDotHistoryRecordProvider", "[getAll] e:" + e17.getMessage());
            return kz5.p0.f313996d;
        }
    }

    public final r45.sw3 b(mi0.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        try {
            if (bVar.f326503c == null) {
                return null;
            }
            r45.sw3 sw3Var = new r45.sw3();
            sw3Var.parseFrom(bVar.f326503c);
            return sw3Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("toHistoryRecord", e17.toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(r45.sw3 historyRecord, int i17) {
        mi0.b bVar;
        boolean z17;
        boolean z18;
        boolean z19;
        jz5.g gVar = f105998d;
        kotlin.jvm.internal.o.g(historyRecord, "historyRecord");
        boolean z27 = false;
        int integer = historyRecord.getInteger(0);
        try {
            bVar = (mi0.b) ((com.tencent.wcdb.core.Table) ((jz5.n) gVar).getValue()).getFirstObject(mi0.a.f326498c.eq(integer));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderRedDotHistoryRecordProvider", "[get] by businessType:" + integer + ", e:" + e17.getMessage());
            bVar = null;
        }
        if (bVar == null) {
            bVar = new mi0.b();
            bVar.f326501a = historyRecord.getInteger(0);
        }
        bVar.f326502b = i17;
        try {
            bVar.f326503c = historyRecord.toByteArray();
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("FinderRedDotHistoryRecordProvider", e18.toString());
        }
        try {
            if (bVar.f326501a > 0) {
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                    z18 = true;
                } else {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z18 = false;
                }
                if (z18 || z65.c.a()) {
                    z19 = true;
                } else {
                    kb2.b bVar2 = kb2.b.f306225a;
                    z19 = false;
                }
                if (z19) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdateHistoryRecord: businessType=");
                    sb6.append(bVar.f326501a);
                    sb6.append(' ');
                    r45.sw3 b17 = b(bVar);
                    sb6.append(b17 != null ? com.tencent.mm.plugin.finder.extension.reddot.qa.e(b17) : null);
                    com.tencent.mars.xlog.Log.i("FinderRedDotHistoryRecordProvider", sb6.toString());
                }
                ((com.tencent.wcdb.core.Table) ((jz5.n) gVar).getValue()).insertOrReplaceObject(bVar);
            } else {
                com.tencent.mars.xlog.Log.e("FinderRedDotHistoryRecordProvider", "[insert] invalid, record = " + bVar);
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("FinderRedDotHistoryRecordProvider", "[insert] businessType:" + java.lang.Integer.valueOf(bVar.f326501a) + ", e:" + e19.getMessage());
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z27 = true;
        } else {
            kb2.b bVar3 = kb2.b.f306225a;
        }
        if (z27) {
            com.tencent.mars.xlog.Log.i("FinderRedDotHistoryRecordProvider", "update: businessType=" + bVar.f326501a + " updateTime=" + i17 + ' ' + com.tencent.mm.plugin.finder.extension.reddot.qa.e(historyRecord));
        }
    }
}
