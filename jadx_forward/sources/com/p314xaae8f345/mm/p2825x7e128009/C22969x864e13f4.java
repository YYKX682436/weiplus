package com.p314xaae8f345.mm.p2825x7e128009;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/xeffect/WeEffectCallbackMgr;", "", "", "ptr", dm.i4.f66865x76d1ec5a, "", "status", "playedTime", "maxPlayTime", "instanceId", "Ljz5/f0;", "dispatch", "Lcom/tencent/mm/xeffect/IWeEffectCallback;", "callback", "setCallback", "clearCallback", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "callbackMap", "Ljava/util/HashMap;", "<init>", "()V", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.WeEffectCallbackMgr */
/* loaded from: classes5.dex */
public final class C22969x864e13f4 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p2825x7e128009.C22969x864e13f4 f39979x4fbc8495 = new com.p314xaae8f345.mm.p2825x7e128009.C22969x864e13f4();
    private static final java.util.HashMap<java.lang.String, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd> callbackMap = new java.util.HashMap<>();

    private C22969x864e13f4() {
    }

    /* renamed from: dispatch */
    public static final void m83714x10f9447a(long j17, long j18, int i17, int i18, int i19, int i27) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j18);
        com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd interfaceC22960x759189cd = callbackMap.get(sb6.toString());
        if (interfaceC22960x759189cd != null) {
            interfaceC22960x759189cd.a(i17, i18, i19, i27);
        }
    }

    /* renamed from: clearCallback */
    public final void m83715xc9bb9db2(long j17) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd>> it = callbackMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String key = it.next().getKey();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append('-');
            if (r26.i0.A(key, sb6.toString(), false, 2, null)) {
                it.remove();
            }
        }
    }

    /* renamed from: setCallback */
    public final void m83716x6c4ebec7(long j17, long j18, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd interfaceC22960x759189cd) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j18);
        java.lang.String sb7 = sb6.toString();
        if (interfaceC22960x759189cd == null) {
            callbackMap.remove(sb7);
        } else {
            callbackMap.put(sb7, interfaceC22960x759189cd);
        }
    }
}
