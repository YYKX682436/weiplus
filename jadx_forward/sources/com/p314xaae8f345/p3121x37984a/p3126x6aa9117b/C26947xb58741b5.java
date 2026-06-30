package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteCustomFunction */
/* loaded from: classes12.dex */
public final class C26947xb58741b5 {

    /* renamed from: callback */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CustomFunction f58206xf5bc2045;

    /* renamed from: name */
    public final java.lang.String f58207x337a8b;

    /* renamed from: numArgs */
    public final int f58208x88b3bd83;

    public C26947xb58741b5(java.lang.String str, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CustomFunction customFunction) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("name must not be null.");
        }
        this.f58207x337a8b = str;
        this.f58208x88b3bd83 = i17;
        this.f58206xf5bc2045 = customFunction;
    }

    /* renamed from: dispatchCallback */
    private void m107614xd7a8aedf(java.lang.String[] strArr) {
        this.f58206xf5bc2045.m107738xf5bc2045(strArr);
    }
}
