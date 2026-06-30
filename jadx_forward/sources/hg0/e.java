package hg0;

/* loaded from: classes12.dex */
public abstract class e {
    public static final void a(java.lang.String eventId, java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7009x9ec98c72 c7009x9ec98c72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7009x9ec98c72();
            c7009x9ec98c72.f143229k = c7009x9ec98c72.b("EventId", eventId, true);
            c7009x9ec98c72.f143230l = java.lang.System.currentTimeMillis();
            c7009x9ec98c72.f143231m = c7009x9ec98c72.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(params)), ",", ";", false), true);
            c7009x9ec98c72.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Report26956Receive", e17, "report", new java.lang.Object[0]);
        }
    }

    public static final void b(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        a("after_download_voice_msg", params);
    }
}
