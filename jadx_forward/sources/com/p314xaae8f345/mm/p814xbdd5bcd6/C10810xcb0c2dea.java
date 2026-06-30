package com.p314xaae8f345.mm.p814xbdd5bcd6;

/* renamed from: com.tencent.mm.lan_cs.Client$C2Java */
/* loaded from: classes12.dex */
public class C10810xcb0c2dea {
    /* renamed from: onDisconnect */
    public static void m46356xe6bab7db(java.lang.String str, int i17) {
        sm0.a aVar = sm0.b.f490844a;
        if (aVar != null) {
            ln1.a aVar2 = (ln1.a) aVar;
            aVar2.getClass();
            aVar2.f401243a.b(true, 0, 10011, "client onDisconnect".getBytes());
        }
    }

    /* renamed from: onRecv */
    public static void m46357xc39ed465(java.lang.String str, int i17, byte[] bArr) {
        sm0.a aVar = sm0.b.f490844a;
        if (aVar != null) {
            ln1.g gVar = ((ln1.a) aVar).f401243a;
            gVar.f401290b = str;
            gVar.f401291c = i17;
            try {
                ln1.g.a(gVar, bArr);
            } catch (java.io.IOException e17) {
                gVar.b(true, 0, 10006, ("client readErr:" + e17.toString()).getBytes());
            }
        }
    }
}
