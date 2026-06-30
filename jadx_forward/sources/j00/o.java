package j00;

@j95.b
/* loaded from: classes9.dex */
public final class o extends i95.w implements c00.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f378378d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(java.lang.String str, bw5.j8 eventType, bw5.i8 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEventService", "triggerEcsOpenEventActionWithId, eventId:" + str);
        yz5.p pVar = (yz5.p) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(this.f378378d).remove(str);
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEventService", "triggerEcsOpenEventActionWithId:" + str + ", event action not find.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEventService", "triggerEcsOpenEventActionWithId:" + str + ", find event action, type:" + eventType);
        pVar.mo149xb9724478(eventType, info);
    }

    public java.lang.String wi(yz5.p pVar) {
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftEventService", "eventAction is null");
            return "";
        }
        java.lang.String str = "openecs_" + java.util.UUID.randomUUID();
        this.f378378d.put(str, pVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEventService", "add eventId:" + str + " to map");
        return str;
    }
}
