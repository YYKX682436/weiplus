package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class d9 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166104a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166105b = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(java.lang.String instanceId, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7026x2f5b9c09 c7026x2f5b9c09 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7026x2f5b9c09) f166104a.remove(instanceId);
        if (c7026x2f5b9c09 == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7025xb32ddf15 c7025xb32ddf15 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7025xb32ddf15();
        c7025xb32ddf15.f143414d = c7025xb32ddf15.b("Appid", c7026x2f5b9c09.f143426d, true);
        c7025xb32ddf15.f143415e = c7025xb32ddf15.b("Username", c7026x2f5b9c09.f143427e, true);
        c7025xb32ddf15.f143416f = c7025xb32ddf15.b("InstanceId", c7026x2f5b9c09.f143435m, true);
        c7025xb32ddf15.f143417g = c7026x2f5b9c09.f143428f;
        c7025xb32ddf15.f143418h = c7026x2f5b9c09.f143429g;
        c7025xb32ddf15.f143419i = c7026x2f5b9c09.f143430h;
        c7025xb32ddf15.f143420j = z17 ? 1L : 0L;
        c7025xb32ddf15.f143421k = j17;
        c7025xb32ddf15.f143422l = c7026x2f5b9c09.f143432j;
        c7025xb32ddf15.f143423m = c7025xb32ddf15.b("NetType", c7026x2f5b9c09.f143433k, true);
        c7025xb32ddf15.f143424n = c7026x2f5b9c09.f143434l;
        java.lang.Integer num = (java.lang.Integer) f166105b.remove(instanceId);
        if (num == null) {
            num = 10000;
        }
        c7025xb32ddf15.f143425o = num.intValue();
        c7025xb32ddf15.k();
    }

    public static final void b(java.lang.String instanceId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        f166105b.put(instanceId, java.lang.Integer.valueOf(i17));
    }
}
