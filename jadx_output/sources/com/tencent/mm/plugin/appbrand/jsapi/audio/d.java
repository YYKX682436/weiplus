package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public enum d {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f79173d = new android.util.SparseArray(2);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f79174e = new java.util.HashMap();

    d() {
    }

    public gb1.a a(java.lang.String str) {
        int hashCode = str.hashCode();
        synchronized (this.f79173d) {
            int indexOfKey = this.f79173d.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                return (gb1.a) this.f79173d.valueAt(indexOfKey);
            }
            gb1.a aVar = new gb1.a();
            this.f79173d.put(hashCode, aVar);
            return aVar;
        }
    }
}
