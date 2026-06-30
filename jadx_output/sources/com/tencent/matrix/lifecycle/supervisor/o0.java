package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class o0 {
    public o0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy a(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
        java.lang.Object putIfAbsent;
        java.lang.Object putIfAbsent2;
        kotlin.jvm.internal.o.g(token, "token");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.processProxies$delegate.getValue();
        java.lang.Object obj = concurrentHashMap.get(token);
        if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(token, (obj = new java.util.concurrent.ConcurrentHashMap()))) != null) {
            obj = putIfAbsent2;
        }
        java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) obj;
        java.lang.String str = token.f52794g;
        java.lang.Object obj2 = concurrentMap.get(str);
        if (obj2 == null && (putIfAbsent = concurrentMap.putIfAbsent(str, (obj2 = new com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy(token)))) != null) {
            obj2 = putIfAbsent;
        }
        return (com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy) obj2;
    }

    public final boolean b(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.o.g(token, "token");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) ((java.util.concurrent.ConcurrentHashMap) com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.processProxies$delegate.getValue()).remove(token);
        if (concurrentHashMap2 == null || concurrentHashMap2.isEmpty()) {
            return false;
        }
        for (java.util.Map.Entry entry : concurrentHashMap2.entrySet()) {
            com.tencent.matrix.lifecycle.supervisor.c cVar = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion;
            java.lang.String name = (java.lang.String) entry.getKey();
            com.tencent.matrix.lifecycle.StatefulOwner source = (com.tencent.matrix.lifecycle.StatefulOwner) entry.getValue();
            cVar.getClass();
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(source, "source");
            concurrentHashMap = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.dispatchOwners;
            com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner = (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) concurrentHashMap.get(name);
            if (dispatcherStateOwner != null) {
                dispatcherStateOwner.removeSourceOwner(source);
            }
        }
        return true;
    }
}
