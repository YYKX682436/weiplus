package com.tencent.mm.lan_cs;

/* loaded from: classes12.dex */
public class Client$C2Java {
    public static void onDisconnect(java.lang.String str, int i17) {
        sm0.a aVar = sm0.b.f409311a;
        if (aVar != null) {
            ln1.a aVar2 = (ln1.a) aVar;
            aVar2.getClass();
            aVar2.f319710a.b(true, 0, 10011, "client onDisconnect".getBytes());
        }
    }

    public static void onRecv(java.lang.String str, int i17, byte[] bArr) {
        sm0.a aVar = sm0.b.f409311a;
        if (aVar != null) {
            ln1.g gVar = ((ln1.a) aVar).f319710a;
            gVar.f319757b = str;
            gVar.f319758c = i17;
            try {
                ln1.g.a(gVar, bArr);
            } catch (java.io.IOException e17) {
                gVar.b(true, 0, 10006, ("client readErr:" + e17.toString()).getBytes());
            }
        }
    }
}
