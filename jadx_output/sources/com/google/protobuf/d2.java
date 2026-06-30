package com.google.protobuf;

/* loaded from: classes16.dex */
public class d2 extends com.google.protobuf.g {
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.g2 g2Var = new com.google.protobuf.g2();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        char c17 = 0;
        while (true) {
            char c18 = 0;
            ?? r47 = 1048576;
            if (z17) {
                return g2Var;
            }
            try {
                try {
                    try {
                        int F = d0Var.F();
                        switch (F) {
                            case 0:
                                z17 = true;
                            case 10:
                                com.google.protobuf.y m17 = d0Var.m();
                                g2Var.f45102e = 1 | g2Var.f45102e;
                                g2Var.f45103f = m17;
                            case 66:
                                com.google.protobuf.y m18 = d0Var.m();
                                g2Var.f45102e |= 2;
                                g2Var.f45104g = m18;
                            case 72:
                                int o17 = d0Var.o();
                                if (com.google.protobuf.f2.a(o17) == null) {
                                    b17.g(9, o17);
                                } else {
                                    g2Var.f45102e |= 32;
                                    g2Var.f45108n = o17;
                                }
                            case 80:
                                g2Var.f45102e |= 4;
                                g2Var.f45105h = d0Var.l();
                            case 90:
                                com.google.protobuf.y m19 = d0Var.m();
                                g2Var.f45102e |= 64;
                                g2Var.f45109o = m19;
                            case 128:
                                g2Var.f45102e |= 128;
                                g2Var.f45110p = d0Var.l();
                            case 136:
                                g2Var.f45102e |= 256;
                                g2Var.f45111q = d0Var.l();
                            case 144:
                                g2Var.f45102e |= 512;
                                g2Var.f45112r = d0Var.l();
                            case 160:
                                g2Var.f45102e |= 8;
                                g2Var.f45106i = d0Var.l();
                            case 184:
                                g2Var.f45102e |= 2048;
                                g2Var.f45114t = d0Var.l();
                            case 216:
                                g2Var.f45102e |= 16;
                                g2Var.f45107m = d0Var.l();
                            case 248:
                                g2Var.f45102e |= 4096;
                                g2Var.f45115u = d0Var.l();
                            case com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX /* 290 */:
                                com.google.protobuf.y m27 = d0Var.m();
                                g2Var.f45102e |= 8192;
                                g2Var.f45116v = m27;
                            case com.tencent.mm.plugin.appbrand.jsapi.webview.u.CTRL_INDEX /* 298 */:
                                com.google.protobuf.y m28 = d0Var.m();
                                g2Var.f45102e |= 16384;
                                g2Var.f45117w = m28;
                            case 314:
                                com.google.protobuf.y m29 = d0Var.m();
                                g2Var.f45102e |= 32768;
                                g2Var.f45118x = m29;
                            case 322:
                                com.google.protobuf.y m37 = d0Var.m();
                                g2Var.f45102e |= 65536;
                                g2Var.f45119y = m37;
                            case 330:
                                com.google.protobuf.y m38 = d0Var.m();
                                g2Var.f45102e |= 131072;
                                g2Var.f45120z = m38;
                            case 336:
                                g2Var.f45102e |= 1024;
                                g2Var.f45113s = d0Var.l();
                            case com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX /* 354 */:
                                com.google.protobuf.y m39 = d0Var.m();
                                g2Var.f45102e |= 262144;
                                g2Var.A = m39;
                            case 362:
                                com.google.protobuf.y m47 = d0Var.m();
                                g2Var.f45102e |= 524288;
                                g2Var.B = m47;
                            case 7994:
                                int i17 = (c17 == true ? 1 : 0) & 1048576;
                                c17 = c17;
                                if (i17 == 0) {
                                    g2Var.C = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 0;
                                }
                                g2Var.C.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                            default:
                                r47 = g2Var.parseUnknownField(d0Var, b17, t4Var, F);
                                if (r47 == 0) {
                                    z17 = true;
                                }
                        }
                    } catch (java.io.IOException e17) {
                        com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e17);
                        y6Var.f45739d = g2Var;
                        throw y6Var;
                    }
                } catch (com.google.protobuf.y6 e18) {
                    e18.f45739d = g2Var;
                    throw e18;
                }
            } finally {
                if (((c17 == true ? 1 : 0) & r47) != 0) {
                    g2Var.C = java.util.Collections.unmodifiableList(g2Var.C);
                }
                g2Var.unknownFields = b17.build();
                g2Var.makeExtensionsImmutable();
            }
        }
    }
}
