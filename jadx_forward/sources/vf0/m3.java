package vf0;

/* loaded from: classes12.dex */
public abstract class m3 {
    public static final java.lang.String a(t21.v2 v2Var) {
        java.lang.String v17;
        java.lang.String str = null;
        if (v2Var != null) {
            java.lang.String str2 = v2Var.M;
            if (str2 == null || r26.n0.N(str2)) {
                long j17 = v2Var.K;
                if (j17 != 0) {
                    try {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(v2Var.L, j17);
                        if (k17 != null) {
                            v17 = c01.ia.v(k17.G);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoMsg.VideoSendUtils", th6, "", new java.lang.Object[0]);
                    }
                } else {
                    v17 = ((yb0.g) ((zb0.d0) i95.n0.c(zb0.d0.class))).Di(com.p314xaae8f345.mm.vfs.w6.p(v2Var.f()));
                }
            } else {
                v17 = v2Var.M;
            }
            str = v17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendUtils", "createVideoMsgSource  forward uuid %s", str);
        java.lang.String n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? c01.ia.n() : c01.ia.o(str);
        return n17 == null ? "" : n17;
    }

    public static final int b(dn.h sceneResult, boolean z17, vf0.h3 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneResult, "sceneResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        y15.c n17 = params.f517712f.n();
        vf0.d3 d3Var = params.f517721o;
        if (z17) {
            java.lang.String str = sceneResult.f69522xf9dbbe9c;
            if (str == null) {
                str = "";
            }
            n17.set(n17.f540455d + 23, str);
            java.lang.String str2 = sceneResult.f69502xf11df5f5;
            java.lang.String str3 = str2 != null ? str2 : "";
            int i17 = n17.f540455d;
            n17.set(i17 + 24, str3);
            n17.set(i17 + 22, java.lang.Integer.valueOf((int) sceneResult.f69523x17c343e7));
            n17.set(i17 + 21, sceneResult.f69526x419c9c3d);
            d3Var.f517676d = sceneResult;
            return 0;
        }
        java.lang.String str4 = sceneResult.f69522xf9dbbe9c;
        if (str4 == null) {
            str4 = "";
        }
        n17.set(n17.f540455d + 1, str4);
        java.lang.String str5 = sceneResult.f69502xf11df5f5;
        if (str5 == null) {
            str5 = "";
        }
        int i18 = n17.f540455d;
        n17.set(i18 + 0, str5);
        java.lang.String str6 = sceneResult.f69502xf11df5f5;
        if (str6 == null) {
            str6 = "";
        }
        n17.set(i18 + 2, str6);
        java.lang.String str7 = sceneResult.f69522xf9dbbe9c;
        n17.set(i18 + 3, str7 != null ? str7 : "");
        n17.set(i18 + 8, java.lang.Integer.valueOf((int) sceneResult.f69523x17c343e7));
        n17.set(i18 + 11, java.lang.Integer.valueOf(sceneResult.f69562x366b1958));
        n17.set(i18 + 18, sceneResult.f69526x419c9c3d);
        n17.set(i18 + 19, sceneResult.f69543x16680d46);
        d3Var.f517675c = sceneResult;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(gp.a r6, java.lang.String r7, java.lang.String r8, boolean r9, java.util.Map r10) {
        /*
            java.lang.String r0 = "importPath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.String r0 = "thumbPath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            if (r6 == 0) goto L10
            android.graphics.Bitmap r0 = r6.f355693b
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.VideoMsg.VideoSendUtils"
            r3 = 0
            r4 = 60
            r5 = 1
            if (r0 == 0) goto L2b
            android.graphics.Bitmap r6 = r6.f355693b     // Catch: java.lang.Exception -> L24
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L24
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r6, r4, r7, r8, r5)     // Catch: java.lang.Exception -> L24
        L22:
            r6 = r3
            goto L44
        L24:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r6, r1, r7)
            goto L43
        L2b:
            if (r9 == 0) goto L43
            java.lang.String r6 = "create video thumb from temp copy path"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            r6 = -1
            android.graphics.Bitmap r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(r7, r5, r6)     // Catch: java.lang.Exception -> L3d
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L3d
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r6, r4, r7, r8, r5)     // Catch: java.lang.Exception -> L3d
            goto L22
        L3d:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r6, r1, r7)
        L43:
            r6 = r5
        L44:
            if (r6 == 0) goto L65
            if (r10 == 0) goto L4f
            java.lang.String r6 = "e_generate_thumb_black_fallback"
            java.lang.String r7 = "1"
            r10.put(r6, r7)
        L4f:
            r6 = 320(0x140, float:4.48E-43)
            r7 = 480(0x1e0, float:6.73E-43)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.Bitmap r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(r9, r6, r7)     // Catch: java.lang.Exception -> L5f
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L5f
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r6, r4, r7, r8, r5)     // Catch: java.lang.Exception -> L5f
            goto L65
        L5f:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r6, r1, r7)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.m3.c(gp.a, java.lang.String, java.lang.String, boolean, java.util.Map):void");
    }

    public static final t21.v2 d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        java.util.List h17 = t21.o2.Ui().h(f9Var, f9Var.z0());
        java.lang.Object obj = null;
        if (h17 == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((t21.v2) next).d(), "getFileName(...)");
            if (!r26.i0.n(r2, ya.b.f77495x8b74a326, false)) {
                obj = next;
                break;
            }
        }
        return (t21.v2) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004d -> B:23:0x005c). Please report as a decompilation issue!!! */
    public static final t21.v2 e(oi3.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.w2 Ui = t21.o2.Ui();
        java.lang.String j17 = hVar.j();
        Ui.getClass();
        ?? arrayList = new java.util.ArrayList();
        if (j17 == null || android.text.TextUtils.isEmpty(j17)) {
            try {
                arrayList = hVar.m75942xfb822ef2(hVar.f427150d + 1) > 0 ? Ui.m(hVar) : Ui.k(hVar);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfoStorage", e17, "getBySimpleMsgInfo error[%s]", e17.toString());
                arrayList = arrayList;
            }
        } else {
            t21.v2 g17 = Ui.g(j17);
            if (g17 != null) {
                arrayList.add(g17);
            }
        }
        t21.v2 v2Var = null;
        if (arrayList == 0) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ?? next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((t21.v2) next).d(), "getFileName(...)");
            if (!r26.i0.n(r2, ya.b.f77495x8b74a326, false)) {
                v2Var = next;
                break;
            }
        }
        return v2Var;
    }

    public static final t21.v2 f(oi3.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        t21.v2 e17 = e(hVar);
        if (e17 == null) {
            return null;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        return t21.o2.Ui().g(e17.S);
    }

    public static final int g(gp.a aVar, java.lang.String importPath, boolean z17) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(importPath, "importPath");
        if (aVar != null && (i17 = aVar.f355694c) > 0) {
            int V1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendUtils", "GetVideoMetadata duration >> " + aVar.f355694c + ", converted to seconds: " + V1);
            return V1;
        }
        if (z17) {
            ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(importPath, true) != null) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(r2.f243915a);
            }
            return 0;
        }
        qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(importPath);
        int V12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(wi6 != null ? wi6.f442899d : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendUtils", "GetVideoMetadata duration error to fix >> " + V12);
        return V12;
    }

    public static final vf0.g3 h(int i17) {
        return i17 != 1 ? i17 != 2 ? (i17 == 3 || i17 == 6) ? new vf0.g3(2, 3) : i17 != 7 ? i17 != 8 ? new vf0.g3(0, 0) : new vf0.g3(1, 5) : new vf0.g3(3, 4) : new vf0.g3(1, 1) : new vf0.g3(1, 2);
    }

    public static final boolean i(oi3.h hVar, bm5.f0 resType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        int ordinal = resType.ordinal();
        t21.v2 e17 = ordinal != 9 ? ordinal != 10 ? null : e(hVar) : f(hVar);
        if (e17 == null) {
            return false;
        }
        return com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).sj(hVar, resType, e17.d(), false));
    }

    public static final boolean j(qi3.e0 e0Var) {
        qi3.d0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e0Var, "<this>");
        if (!(e0Var instanceof yf0.l0)) {
            return false;
        }
        if (e0Var.f445224a == qi3.g0.f445245n && (d0Var = e0Var.f445228e) != null) {
            if (d0Var != null && d0Var.f445218c == 0) {
                if (d0Var != null && d0Var.f445219d == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean k(t21.v2 v2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v2Var, "<this>");
        v2Var.f496546k = c01.id.a();
        v2Var.f496547l = c01.id.a();
        v2Var.U = v2Var.U | 1024 | 2048;
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        return t21.o2.Ui().C(v2Var);
    }

    public static final boolean l(t21.v2 v2Var, yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        block.mo146xb9724478(v2Var);
        return k(v2Var);
    }

    public static final void m(t21.v2 v2Var, long j17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v2Var, "<this>");
        if (v2Var.f496539d < j17) {
            v2Var.f496539d = (int) j17;
            v2Var.U = 8;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            k(v2Var);
        }
    }

    public static final int n(t21.v2 v2Var, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(path);
        if (k17 > 0) {
            l(v2Var, new vf0.l3(k17));
        }
        return k17;
    }
}
