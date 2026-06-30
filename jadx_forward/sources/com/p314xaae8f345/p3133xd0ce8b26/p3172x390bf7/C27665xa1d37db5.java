package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.BridgeMapJava */
/* loaded from: classes5.dex */
public class C27665xa1d37db5 {

    /* renamed from: interfaceMap */
    private java.util.Map<java.lang.Object, java.lang.Long> f60574x53928963 = new java.util.HashMap();

    /* renamed from: delete */
    public long m119311xb06685ab(java.lang.Object obj) {
        long longValue;
        synchronized (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27665xa1d37db5.class) {
            longValue = this.f60574x53928963.remove(obj).longValue();
        }
        return longValue;
    }

    /* renamed from: transfer */
    public java.lang.Object m119312x4c58b7eb(long j17, java.lang.String str) {
        synchronized (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27665xa1d37db5.class) {
            try {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                if (j17 == 0) {
                    throw new java.lang.NullPointerException();
                }
                for (java.util.Map.Entry<java.lang.Object, java.lang.Long> entry : this.f60574x53928963.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    if (entry.getValue().longValue() == j17) {
                        atomicReference.set(key);
                    }
                }
                if (atomicReference.get() != null) {
                    return atomicReference.get();
                }
                try {
                    java.lang.Object newInstance = java.lang.Class.forName(str).getConstructor(java.lang.Long.TYPE).newInstance(java.lang.Long.valueOf(j17));
                    this.f60574x53928963.put(newInstance, java.lang.Long.valueOf(j17));
                    return newInstance;
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    throw new java.lang.NullPointerException();
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                throw new java.lang.NullPointerException();
            }
        }
    }
}
