package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class md {
    public md(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.ui.td a(java.lang.Object tag) {
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.ui.td.f291427d;
        java.lang.Object obj = concurrentHashMap.get(tag);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new com.p314xaae8f345.mm.ui.td(null)))) != null) {
            obj = putIfAbsent;
        }
        return (com.p314xaae8f345.mm.ui.td) obj;
    }
}
