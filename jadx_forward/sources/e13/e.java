package e13;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) ((h13.l0) i95.n0.c(h13.l0.class)).f359677g).mo141623x754a37bb()).mo50293x3498a0(h13.k0.f359671d);
        j13.a aVar = j13.a.f378710d;
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "deleteGameLife()");
        if (j13.a.f378711e.mo70514xb06685ab("ForceNotifyData", "UserName like ? ", new java.lang.String[]{"%@gamelifesess"}) > 0) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f378712f;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String field_UserName = ((i13.j) entry.getValue()).f66503x11b86abb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_UserName, "field_UserName");
                if (r26.i0.n(field_UserName, "@gamelifesess", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                concurrentHashMap.remove(((i13.j) ((java.util.Map.Entry) it.next()).getValue()).f66499xaeadb4bb);
            }
            aVar.m145262xf35bbb4();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        ((h13.l0) i95.n0.c(h13.l0.class)).getClass();
    }
}
