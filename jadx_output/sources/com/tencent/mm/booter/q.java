package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class q implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.s f63552d;

    public q(com.tencent.mm.booter.s sVar) {
        this.f63552d = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.database.Cursor cursor = (android.database.Cursor) this.f63552d.f63564c.get();
        if (cursor == null) {
            return java.util.Collections.emptyMap();
        }
        int columnIndex = cursor.getColumnIndex("key");
        int columnIndex2 = cursor.getColumnIndex("type");
        int columnIndex3 = cursor.getColumnIndex("value");
        java.util.HashMap hashMap = new java.util.HashMap();
        while (cursor.moveToNext()) {
            int i17 = cursor.getInt(columnIndex2);
            ?? string = cursor.getString(columnIndex3);
            switch (i17) {
                case 1:
                    string = java.lang.Integer.valueOf((java.lang.String) string);
                    break;
                case 2:
                    string = java.lang.Long.valueOf((java.lang.String) string);
                    break;
                case 3:
                    break;
                case 4:
                    string = java.lang.Boolean.valueOf((java.lang.String) string);
                    break;
                case 5:
                    string = java.lang.Float.valueOf((java.lang.String) string);
                    break;
                case 6:
                    string = java.lang.Double.valueOf((java.lang.String) string);
                    break;
                default:
                    try {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Debugger.Resolver", "unknown type");
                    } catch (java.lang.Exception unused) {
                    }
                    string = 0;
                    break;
            }
            hashMap.put(cursor.getString(columnIndex), string);
        }
        cursor.close();
        return hashMap;
    }
}
