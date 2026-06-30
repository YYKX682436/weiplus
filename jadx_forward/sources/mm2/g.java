package mm2;

/* loaded from: classes3.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String liveId) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        java.util.Iterator it = mm2.w.f411029v.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (r26.n0.D((java.lang.CharSequence) ((java.util.Map.Entry) it.next()).getKey(), liveId, false, 2, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            ae2.in inVar = ae2.in.f85221a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C1).mo141623x754a37bb()).r()).intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(java.lang.String liveId_adId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId_adId, "liveId_adId");
        java.lang.Boolean bool = (java.lang.Boolean) mm2.w.f411029v.get(liveId_adId);
        if (!(bool == null ? false : bool.booleanValue())) {
            return false;
        }
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C1).mo141623x754a37bb()).r()).intValue() == 0;
    }
}
