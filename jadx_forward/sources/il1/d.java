package il1;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f70355x366c91de = 1227;

    /* renamed from: NAME */
    public static final java.lang.String f70356x24728b = "sheetModeWindowStateChangedEvent";

    public final void x(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y service, il1.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSheetModeWindowStateChangedEvent", "[dispatchEvent] state=" + state);
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            u(service);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", "fullPage");
            t(hashMap);
            m();
            return;
        }
        if (ordinal != 1) {
            return;
        }
        u(service);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("state", "halfPage");
        t(hashMap2);
        m();
    }
}
