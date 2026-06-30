package com.p314xaae8f345.p542x3306d5.app;

/* renamed from: com.tencent.mars.app.BridgeMap */
/* loaded from: classes5.dex */
public class C4442xded810f3 {

    /* renamed from: interfaceMap */
    protected java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> f17600x53928963 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: delete */
    public long m37606xb06685ab(java.lang.Object obj) {
        long longValue;
        synchronized (com.p314xaae8f345.p542x3306d5.app.C4442xded810f3.class) {
            longValue = this.f17600x53928963.remove(obj).longValue();
        }
        return longValue;
    }

    public void put(long j17, java.lang.Object obj) {
        synchronized (com.p314xaae8f345.p542x3306d5.app.C4442xded810f3.class) {
            this.f17600x53928963.put(obj, java.lang.Long.valueOf(j17));
        }
    }

    /* renamed from: transfer */
    public java.lang.Object m37607x4c58b7eb(long j17, java.lang.String str) {
        synchronized (com.p314xaae8f345.p542x3306d5.app.C4442xded810f3.class) {
            try {
                try {
                    java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                    if (j17 == 0) {
                        return null;
                    }
                    for (java.util.Map.Entry<java.lang.Object, java.lang.Long> entry : this.f17600x53928963.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        if (entry.getValue().longValue() == j17) {
                            atomicReference.set(key);
                        }
                    }
                    if (atomicReference.get() != null) {
                        return atomicReference.get();
                    }
                    java.lang.Object newInstance = java.lang.Class.forName(str).getConstructor(java.lang.Long.TYPE).newInstance(java.lang.Long.valueOf(j17));
                    this.f17600x53928963.put(newInstance, java.lang.Long.valueOf(j17));
                    return newInstance;
                } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
