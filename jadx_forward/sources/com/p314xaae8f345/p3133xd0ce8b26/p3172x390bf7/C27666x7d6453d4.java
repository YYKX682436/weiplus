package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001J\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tencent/wechat/zidl/BridgeMapKotlin;", "", "()V", "interfaceMap", "", "", "delete", "item", "size", "", "transfer", "handle", "className", "", "zidl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.tencent.wechat.zidl.BridgeMapKotlin */
/* loaded from: classes5.dex */
public final class C27666x7d6453d4 {
    private final java.util.Map<java.lang.Object, java.lang.Long> interfaceMap = new java.util.HashMap();

    /* renamed from: delete */
    public final long m119313xb06685ab(java.lang.Object item) {
        long longValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        synchronized (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27666x7d6453d4.class) {
            java.lang.Long remove = this.interfaceMap.remove(item);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(remove);
            longValue = remove.longValue();
        }
        return longValue;
    }

    /* renamed from: size */
    public final int m119314x35e001() {
        int size;
        synchronized (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27666x7d6453d4.class) {
            size = this.interfaceMap.size();
        }
        return size;
    }

    /* renamed from: transfer */
    public final java.lang.Object m119315x4c58b7eb(long handle, java.lang.String className) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
        synchronized (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27666x7d6453d4.class) {
            try {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                if (handle == 0) {
                    throw new java.lang.NullPointerException();
                }
                for (java.util.Map.Entry<java.lang.Object, java.lang.Long> entry : this.interfaceMap.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    if (entry.getValue().longValue() == handle) {
                        atomicReference.set(key);
                    }
                }
                if (atomicReference.get() != null) {
                    return atomicReference.get();
                }
                try {
                    java.lang.Object obj = java.lang.Class.forName(className).getConstructor(java.lang.Long.TYPE).newInstance(java.lang.Long.valueOf(handle));
                    java.lang.Long valueOf = java.lang.Long.valueOf(handle);
                    java.util.Map<java.lang.Object, java.lang.Long> map = this.interfaceMap;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "obj");
                    map.put(obj, valueOf);
                    return obj;
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    throw new java.lang.NullPointerException();
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                throw new java.lang.NullPointerException();
            }
        }
    }
}
