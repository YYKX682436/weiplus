package com.p314xaae8f345.mm.p2825x7e128009;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002R4\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000ej\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/xeffect/WeJsonMessageCallbackMgr;", "", "", "nPtr", "", "sourceId", "", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "type", "callback", "Lcom/tencent/mm/xeffect/IWeJsonMessageCallback;", "Ljz5/f0;", "setCallback", "removeAll", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "callbackMap", "Ljava/util/HashMap;", "<init>", "()V", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.WeJsonMessageCallbackMgr */
/* loaded from: classes10.dex */
public final class C22974x508788a2 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p2825x7e128009.C22974x508788a2 f39981x4fbc8495 = new com.p314xaae8f345.mm.p2825x7e128009.C22974x508788a2();
    private static final java.util.HashMap<java.lang.Long, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced> callbackMap = new java.util.HashMap<>();

    private C22974x508788a2() {
    }

    /* renamed from: callback */
    public static final int m83788xf5bc2045(long nPtr, int sourceId, java.lang.String message, int type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(message, "message");
        com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced interfaceC22961x9807eced = callbackMap.get(java.lang.Long.valueOf(nPtr));
        if (interfaceC22961x9807eced == null) {
            return 0;
        }
        interfaceC22961x9807eced.a(sourceId, message, tq5.g.m166971xcee59d22()[type]);
        return 0;
    }

    /* renamed from: removeAll */
    public final com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced m83789x4c6f0a7d(long nPtr) {
        com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced remove;
        java.util.HashMap<java.lang.Long, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced> hashMap = callbackMap;
        synchronized (hashMap) {
            remove = hashMap.remove(java.lang.Long.valueOf(nPtr));
        }
        return remove;
    }

    /* renamed from: setCallback */
    public final void m83790x6c4ebec7(long j17, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced interfaceC22961x9807eced) {
        java.util.HashMap<java.lang.Long, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced> hashMap = callbackMap;
        synchronized (hashMap) {
            hashMap.put(java.lang.Long.valueOf(j17), interfaceC22961x9807eced);
        }
    }
}
