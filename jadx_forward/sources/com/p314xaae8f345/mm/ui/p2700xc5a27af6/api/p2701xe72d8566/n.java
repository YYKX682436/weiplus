package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p f290060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f290062f;

    public n(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p pVar, java.lang.String str, boolean z17) {
        this.f290060d = pVar;
        this.f290061e = str;
        this.f290062f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p pVar = this.f290060d;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) pVar.f290074a;
        java.lang.String str = this.f290061e;
        java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
        boolean z17 = false;
        int intValue = num != null ? num.intValue() : 0;
        int i17 = this.f290062f ? 1 : -1;
        java.util.Map map = pVar.f290074a;
        int i18 = intValue + i17;
        if (i18 < 0) {
            i18 = 0;
        }
        map.put(str, java.lang.Integer.valueOf(i18));
        java.util.Collection values = ((java.util.LinkedHashMap) pVar.f290074a).values();
        if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
            java.util.Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((java.lang.Number) it.next()).intValue() > 0) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            if (pVar.f290075b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl, setCallback, register notifyCallback");
                com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.o oVar = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.o(pVar);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.b(context, oVar);
                pVar.f290075b = oVar;
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var = pVar.f290075b;
        if (f7Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl, setCallback, unregister notifyCallback");
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.d(context2, f7Var);
        pVar.f290075b = null;
    }
}
