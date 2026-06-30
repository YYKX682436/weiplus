package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public class p implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f63542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.s f63543e;

    public p(com.tencent.mm.booter.s sVar, android.content.Context context) {
        this.f63543e = sVar;
        this.f63542d = context;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.database.Cursor cursor;
        android.content.Context context = this.f63542d;
        if (!"18c867f0717aa67b2ab7347505ba07ed".equals(com.tencent.mm.sdk.platformtools.t8.c0("com.tencent.mm.coolassist", context))) {
            return null;
        }
        try {
            cursor = context.getContentResolver().query(android.net.Uri.parse("content://" + context.getPackageName() + ".coolassist.debugprovider/config"), this.f63543e.f63563b, null, null, null);
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
