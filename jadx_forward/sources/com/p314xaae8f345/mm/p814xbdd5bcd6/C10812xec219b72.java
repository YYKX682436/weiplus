package com.p314xaae8f345.mm.p814xbdd5bcd6;

/* renamed from: com.tencent.mm.lan_cs.Server$C2Java */
/* loaded from: classes12.dex */
public class C10812xec219b72 {
    /* renamed from: onConnect */
    public static void m46360x885a7a0b(java.lang.String str, int i17) {
        sm0.c cVar = sm0.d.f490845a;
        if (cVar != null) {
            ln1.g gVar = ((ln1.f) cVar).f401282a;
            gVar.f401290b = str;
            gVar.f401291c = i17;
        }
    }

    /* renamed from: onDisconnect */
    public static void m46361xe6bab7db(java.lang.String str, int i17) {
        sm0.c cVar = sm0.d.f490845a;
        if (cVar != null) {
            ln1.f fVar = (ln1.f) cVar;
            fVar.getClass();
            fVar.f401282a.b(true, 0, 10011, "listen server onDisconnect".getBytes());
        }
    }

    /* renamed from: onRecv */
    public static void m46362xc39ed465(java.lang.String str, int i17, byte[] bArr) {
        sm0.c cVar = sm0.d.f490845a;
        if (cVar != null) {
            ln1.g gVar = ((ln1.f) cVar).f401282a;
            gVar.f401290b = str;
            gVar.f401291c = i17;
            try {
                ln1.g.a(gVar, bArr);
            } catch (java.io.IOException e17) {
                gVar.b(true, 0, 10006, ("server readErr:" + e17.toString()).getBytes());
            }
        }
    }

    /* renamed from: onSend */
    public static void m46363xc39f4a07(java.lang.String str, int i17, int i18) {
        sm0.c cVar = sm0.d.f490845a;
        if (cVar == null || ((ln1.f) cVar).f401282a.f401289a.get() != 1) {
            return;
        }
        sn1.i.H(i18);
    }
}
