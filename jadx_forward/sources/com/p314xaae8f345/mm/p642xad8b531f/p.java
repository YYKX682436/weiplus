package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes9.dex */
public class p implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f145075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.s f145076e;

    public p(com.p314xaae8f345.mm.p642xad8b531f.s sVar, android.content.Context context) {
        this.f145076e = sVar;
        this.f145075d = context;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.database.Cursor cursor;
        android.content.Context context = this.f145075d;
        if (!"18c867f0717aa67b2ab7347505ba07ed".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c0("com.tencent.mm.coolassist", context))) {
            return null;
        }
        try {
            cursor = context.getContentResolver().query(android.net.Uri.parse("content://" + context.getPackageName() + ".coolassist.debugprovider/config"), this.f145076e.f145096b, null, null, null);
        } catch (java.lang.Exception unused) {
            cursor = null;
        }
        if (cursor == null) {
            return null;
        }
        if (cursor.getCount() > 0) {
            return cursor;
        }
        cursor.close();
        return null;
    }
}
