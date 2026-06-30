package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class o0 {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
        java.lang.Object putIfAbsent;
        java.lang.Object putIfAbsent2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19988xa3242c.mo141623x754a37bb();
        java.lang.Object obj = concurrentHashMap.get(token);
        if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(token, (obj = new java.util.concurrent.ConcurrentHashMap()))) != null) {
            obj = putIfAbsent2;
        }
        java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) obj;
        java.lang.String str = token.f134327g;
        java.lang.Object obj2 = concurrentMap.get(str);
        if (obj2 == null && (putIfAbsent = concurrentMap.putIfAbsent(str, (obj2 = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy(token)))) != null) {
            obj2 = putIfAbsent;
        }
        return (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy) obj2;
    }

    public final boolean b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19988xa3242c.mo141623x754a37bb()).remove(token);
        if (concurrentHashMap2 == null || concurrentHashMap2.isEmpty()) {
            return false;
        }
        for (java.util.Map.Entry entry : concurrentHashMap2.entrySet()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c cVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec;
            java.lang.String name = (java.lang.String) entry.getKey();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 source = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7) entry.getValue();
            cVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            concurrentHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19977x9d3dd13a;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) concurrentHashMap.get(name);
            if (c4684xa6b8b6c9 != null) {
                c4684xa6b8b6c9.mo40980x72c16834(source);
            }
        }
        return true;
    }
}
