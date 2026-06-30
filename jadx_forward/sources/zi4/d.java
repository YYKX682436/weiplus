package zi4;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f554731a = new java.util.LinkedHashMap();

    public final void a(java.lang.String cmdId, yz5.q factory, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        java.util.Map map = this.f554731a;
        if (!map.containsKey(cmdId)) {
            map.put(cmdId, new zi4.c(factory, z17 ? new zi4.b(true) : zi4.b.f554721b));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusActionHandlerListConfig", "duplicate register cmdId=" + cmdId + ", keep first-registered, ignore this one");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }
}
