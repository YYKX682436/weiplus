package com.tencent.mm.lan_cs;

/* loaded from: classes12.dex */
public class Server$C2Java {
    public static void onConnect(java.lang.String str, int i17) {
        sm0.c cVar = sm0.d.f409312a;
        if (cVar != null) {
            ln1.g gVar = ((ln1.f) cVar).f319749a;
            gVar.f319757b = str;
            gVar.f319758c = i17;
        }
    }

    public static void onDisconnect(java.lang.String str, int i17) {
        sm0.c cVar = sm0.d.f409312a;
        if (cVar != null) {
            ln1.f fVar = (ln1.f) cVar;
            fVar.getClass();
            fVar.f319749a.b(true, 0, 10011, "listen server onDisconnect".getBytes());
        }
    }

    public static void onRecv(java.lang.String str, int i17, byte[] bArr) {
        sm0.c cVar = sm0.d.f409312a;
        if (cVar != null) {
            ln1.g gVar = ((ln1.f) cVar).f319749a;
            gVar.f319757b = str;
            gVar.f319758c = i17;
            try {
                ln1.g.a(gVar, bArr);
            } catch (java.io.IOException e17) {
                gVar.b(true, 0, 10006, ("server readErr:" + e17.toString()).getBytes());
            }
        }
    }

    public static void onSend(java.lang.String str, int i17, int i18) {
        sm0.c cVar = sm0.d.f409312a;
        if (cVar == null || ((ln1.f) cVar).f319749a.f319756a.get() != 1) {
            return;
        }
        sn1.i.H(i18);
    }
}
