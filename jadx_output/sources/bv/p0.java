package bv;

@j95.b
/* loaded from: classes12.dex */
public final class p0 extends i95.w implements cv.h1, cv.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f24670d = "MicroMsg.VoiceLogicService";

    public java.lang.String Ai(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        java.lang.String z07 = f9Var.z0();
        kotlin.jvm.internal.o.f(z07, "getImgPath(...)");
        return z07;
    }

    public w21.j Bi(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        w21.j i17 = w21.x0.i(f9Var, str);
        kotlin.jvm.internal.o.f(i17, "getFileOp(...)");
        return i17;
    }

    public final java.lang.String Di(bm5.y yVar, java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (yVar == null) {
                return "";
            }
            w21.w0 D0 = w21.p0.Di().D0(yVar.f22760c);
            if (D0 == null) {
                D0 = w21.p0.Di().J0(yVar.f22758a, yVar.f22759b);
            }
            java.lang.String str2 = D0 != null ? D0.f442485b : null;
            return str2 == null ? "" : str2;
        }
        if (str == null) {
            return "";
        }
        fp.j jVar = new fp.j();
        java.util.HashMap hashMap = w21.x0.f442511a;
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.h1.d(com.tencent.mm.vfs.q7.c("voice2") + "/", "msg_", str, ".amr", 2, z17);
        java.lang.String str3 = "getAmrFullPath cost: " + jVar.a() + ' ' + d17 + "beCreate: " + z17;
        java.lang.String str4 = this.f24670d;
        com.tencent.mars.xlog.Log.i(str4, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return "";
        }
        if (z17) {
            kotlin.jvm.internal.o.d(d17);
        } else {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(d17);
            java.lang.String str5 = a17.f213279f;
            if (str5 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                java.util.Iterator it = com.tencent.mm.vfs.q7.d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.String d18 = com.tencent.mm.sdk.platformtools.h1.d(lp0.b.D() + ((java.lang.String) it.next()) + "/voice2/", "msg_", str, ".amr", 2, false);
                        if (com.tencent.mm.vfs.w6.j(d18)) {
                            com.tencent.mm.vfs.w6.w(d18, d17);
                            com.tencent.mm.vfs.c1.f(1);
                            com.tencent.mars.xlog.Log.w(str4, "Found wrong moving file: " + d18);
                            break;
                        }
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(com.tencent.mm.vfs.q7.c("voice") + "/");
                        sb6.append(str);
                        java.lang.String sb7 = sb6.toString();
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(sb7 + ".amr");
                        java.lang.String str6 = a18.f213279f;
                        if (str6 != null) {
                            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str6, false, false);
                            if (!str6.equals(l18)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                        com.tencent.mm.vfs.z2 m18 = b3Var.m(a18, null);
                        if (!m18.a() ? false : m18.f213266a.F(m18.f213267b)) {
                            com.tencent.mm.vfs.w6.w(sb7 + ".amr", d17);
                        } else {
                            com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(sb7);
                            java.lang.String str7 = a19.f213279f;
                            if (str7 != null) {
                                java.lang.String l19 = com.tencent.mm.vfs.e8.l(str7, false, false);
                                if (!str7.equals(l19)) {
                                    a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m19 = b3Var.m(a19, null);
                            if (m19.a() ? m19.f213266a.F(m19.f213267b) : false) {
                                com.tencent.mm.vfs.w6.w(sb7, d17);
                            }
                        }
                    }
                }
            }
        }
        return d17;
    }

    public void Ni(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = this.f24670d;
        if (f9Var == null || f9Var.I0() <= 0) {
            com.tencent.mars.xlog.Log.e(str3, "moveVoiceToC2CPath error, msgInfo is illegal, fileName:" + str + ", originPath: " + str2);
            return;
        }
        if (!pt0.f0.f358209b1.j()) {
            com.tencent.mars.xlog.Log.i(str3, "c2c path is close");
            return;
        }
        java.lang.String Di = str2 == null ? Di(bm5.y.f22756i.a(f9Var, bm5.f0.f22573u), str, false) : str2;
        if (!com.tencent.mm.vfs.w6.j(Di)) {
            com.tencent.mars.xlog.Log.e(str3, "moveVoiceToC2CPath error, oldPath is not exist. fileName:" + str + ", originPath: " + str2 + ", oldPath: " + Di);
            return;
        }
        bm5.f0 f0Var = bm5.f0.f22573u;
        java.lang.String a17 = bm5.d0.a(f9Var, f0Var, false, true, 2, null);
        if (kotlin.jvm.internal.o.b(Di, a17)) {
            return;
        }
        boolean x17 = com.tencent.mm.vfs.w6.x(Di, a17, true);
        com.tencent.mm.vfs.w6.h(Di);
        com.tencent.mars.xlog.Log.i(str3, "move old voice to c2c file success: " + x17 + ", src[" + Di + "] -> dst[" + a17 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.getMsgId() + ", svrId: " + f9Var.I0());
        bm5.c0.f22550a.c(bm5.z.f(bm5.y.f22756i.a(f9Var, f0Var)), true);
    }

    public void Ri(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        kotlin.jvm.internal.o.g(context, "context");
        boolean a17 = com.tencent.mm.sdk.platformtools.v5.a(context);
        java.lang.String str = this.f24670d;
        if (a17) {
            com.tencent.mars.xlog.Log.i(str, "playUploadVoiceSound NotificationMuted");
            return;
        }
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voice_component_upload_sound_async, 0) == 1)) {
            com.tencent.mars.xlog.Log.i(str, "sync playUploadVoiceSound");
            com.tencent.mm.sdk.platformtools.v5.b(context, com.tencent.mm.R.string.f489944g9);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "async playUploadVoiceSound");
        java.util.HashMap hashMap = com.tencent.mm.modelbase.c.f70594a;
        final bv.o0 o0Var = new bv.o0(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AsyncMediaPlayerWrapper", "play, tag:".concat("VoiceComponent_playUploadVoiceSound"));
        java.util.HashMap hashMap2 = com.tencent.mm.modelbase.c.f70594a;
        com.tencent.mm.modelbase.j0 j0Var = (com.tencent.mm.modelbase.j0) hashMap2.get("VoiceComponent_playUploadVoiceSound");
        if (j0Var == null || !j0Var.f70655a.isAlive()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AsyncMediaPlayerWrapper", "createNewHandler, tag:".concat("VoiceComponent_playUploadVoiceSound"));
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("VoiceComponent_playUploadVoiceSound");
            handlerThread.start();
            com.tencent.mm.modelbase.j0 j0Var2 = new com.tencent.mm.modelbase.j0(handlerThread, new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper()));
            hashMap2.put("VoiceComponent_playUploadVoiceSound", j0Var2);
            n3Var = j0Var2.f70656b;
        } else {
            n3Var = j0Var.f70656b;
        }
        n3Var.post(new java.lang.Runnable(o0Var) { // from class: com.tencent.mm.modelbase.b

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f70590d;

            {
                kotlin.jvm.internal.o.g(o0Var, "function");
                this.f70590d = o0Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f70590d.invoke();
            }
        });
    }

    public boolean Ui(java.lang.String str, w21.w0 w0Var) {
        if (w0Var != null && w0Var.f442484a == -1) {
            return false;
        }
        return w21.p0.Di().P0(str, w0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String wi(bm5.y r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, com.tencent.mm.pointers.PString r29) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.p0.wi(bm5.y, java.lang.String, java.lang.String, boolean, boolean, com.tencent.mm.pointers.PString):java.lang.String");
    }
}
