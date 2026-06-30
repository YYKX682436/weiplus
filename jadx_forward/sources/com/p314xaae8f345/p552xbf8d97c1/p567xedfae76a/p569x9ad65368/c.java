package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[] a(android.content.Context context) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        concurrentHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19977x9d3dd13a;
        java.util.Collection values = concurrentHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "dispatchOwners.values");
        java.util.Collection<com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9 : collection) {
            java.lang.String statefulName = c4684xa6b8b6c9.getName();
            boolean mo40960xab2f7f06 = c4684xa6b8b6c9.getAttachedSource().mo40960xab2f7f06();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulName, "statefulName");
            int myPid = android.os.Process.myPid();
            java.lang.String b17 = oj.m.b(context);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixUtil.getProcessName(context)");
            arrayList.add(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea(myPid, b17, statefulName, mo40960xab2f7f06));
        }
        java.lang.Object[] array = arrayList.toArray(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[0]);
        if (array != null) {
            return (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[]) array;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
