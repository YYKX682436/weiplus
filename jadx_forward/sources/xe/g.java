package xe;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final xe.g f535273a = new xe.g();

    /* renamed from: b, reason: collision with root package name */
    public static final xe.c f535274b = new xe.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f535275c = java.util.Collections.synchronizedSet(new x.d(0));

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479 message) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        java.util.Set runtimeList = f535275c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runtimeList, "runtimeList");
        java.util.Iterator it = runtimeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ze.n) obj).f156336n, message.getF129169d())) {
                    break;
                }
            }
        }
        ze.n nVar = (ze.n) obj;
        boolean z17 = true;
        if (nVar != null) {
            if (message instanceof xe.a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e c12606x6310078e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e) ((xe.a) message);
                java.lang.String str = c12606x6310078e.f170569f;
                if ((str == null || str.length() == 0) == false) {
                    java.lang.String str2 = c12606x6310078e.f170569f;
                    com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = nVar.u0();
                    if (!u46.l.c(str2, u07 != null ? u07.f128810w : null)) {
                        z17 = false;
                    }
                }
            }
            if (z17) {
                message.b(nVar);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageClientProcessMessageDispatcher", "dispatch: dispatch message[%s]appId[%s] fail", message.getClass().getSimpleName(), message.getF129169d());
        if (message instanceof xe.h) {
            java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958) ((xe.h) message)).f170762f;
            java.util.ArrayList arrayList2 = true ^ arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null && (c12627x488d3557 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557) kz5.n0.X(arrayList2)) != null) {
                rj1.m.c(c12627x488d3557);
            }
        }
        if (message instanceof xe.a) {
            xe.c cVar = f535274b;
            xe.b bVar = new xe.b(message.getF129169d(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e) ((xe.a) message)).f170569f);
            xe.d dVar = (xe.d) cVar;
            dVar.getClass();
            dVar.f535270a.add(bVar);
        }
    }
}
