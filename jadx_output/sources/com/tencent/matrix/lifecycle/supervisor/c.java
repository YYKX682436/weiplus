package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.matrix.lifecycle.supervisor.ProcessToken[] a(android.content.Context context) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.o.g(context, "context");
        concurrentHashMap = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.dispatchOwners;
        java.util.Collection values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "dispatchOwners.values");
        java.util.Collection<com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner : collection) {
            java.lang.String statefulName = dispatcherStateOwner.getName();
            boolean active = dispatcherStateOwner.getAttachedSource().active();
            kotlin.jvm.internal.o.g(statefulName, "statefulName");
            int myPid = android.os.Process.myPid();
            java.lang.String b17 = oj.m.b(context);
            kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessName(context)");
            arrayList.add(new com.tencent.matrix.lifecycle.supervisor.ProcessToken(myPid, b17, statefulName, active));
        }
        java.lang.Object[] array = arrayList.toArray(new com.tencent.matrix.lifecycle.supervisor.ProcessToken[0]);
        if (array != null) {
            return (com.tencent.matrix.lifecycle.supervisor.ProcessToken[]) array;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
