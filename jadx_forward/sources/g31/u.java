package g31;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f349653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f349654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g31.y f349655f;

    public u(java.util.List list, java.util.List list2, g31.y yVar) {
        this.f349653d = list;
        this.f349654e = list2;
        this.f349655f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g31.y yVar;
        java.util.Iterator it = this.f349653d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yVar = this.f349655f;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0 c11155xafcbdcb0 = (com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0) it.next();
            k31.a aVar = yVar.f349662a;
            if (aVar != null) {
                java.lang.String bizUsername = c11155xafcbdcb0.f153300d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
                boolean z17 = c11155xafcbdcb0.f153301e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateMemScribeSwitchOpened bizUsername: %s, switchOpened: %b, ", bizUsername, java.lang.Boolean.valueOf(z17));
                ((k31.h) aVar).j(bizUsername, z17);
            }
            k31.a aVar2 = yVar.f349662a;
            if (aVar2 != null) {
                ((k31.h) aVar2).g(c11155xafcbdcb0.f153300d, c11155xafcbdcb0.f153302f);
            }
        }
        for (g31.t notifySwitchInfo : this.f349654e) {
            java.util.Iterator it6 = ((java.util.LinkedHashMap) yVar.f349665d).entrySet().iterator();
            while (it6.hasNext()) {
                g31.d dVar = (g31.d) ((g31.q) ((java.util.Map.Entry) it6.next()).getValue());
                dVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifySwitchInfo, "notifySwitchInfo");
                dVar.f349606a.s(notifySwitchInfo.f349650a, notifySwitchInfo.f349651b, notifySwitchInfo.f349652c);
            }
        }
    }
}
