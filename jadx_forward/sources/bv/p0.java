package bv;

@j95.b
/* loaded from: classes12.dex */
public final class p0 extends i95.w implements cv.h1, cv.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106203d = "MicroMsg.VoiceLogicService";

    public java.lang.String Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        java.lang.String z07 = f9Var.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z07, "getImgPath(...)");
        return z07;
    }

    public w21.j Bi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        w21.j i17 = w21.x0.i(f9Var, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getFileOp(...)");
        return i17;
    }

    public final java.lang.String Di(bm5.y yVar, java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (yVar == null) {
                return "";
            }
            w21.w0 D0 = w21.p0.Di().D0(yVar.f104293c);
            if (D0 == null) {
                D0 = w21.p0.Di().J0(yVar.f104291a, yVar.f104292b);
            }
            java.lang.String str2 = D0 != null ? D0.f524018b : null;
            return str2 == null ? "" : str2;
        }
        if (str == null) {
            return "";
        }
        fp.j jVar = new fp.j();
        java.util.HashMap hashMap = w21.x0.f524044a;
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.d(com.p314xaae8f345.mm.vfs.q7.c("voice2") + "/", "msg_", str, ".amr", 2, z17);
        java.lang.String str3 = "getAmrFullPath cost: " + jVar.a() + ' ' + d17 + "beCreate: " + z17;
        java.lang.String str4 = this.f106203d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return "";
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        } else {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17);
            java.lang.String str5 = a17.f294812f;
            if (str5 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                java.util.Iterator it = com.p314xaae8f345.mm.vfs.q7.d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.String d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.d(lp0.b.D() + ((java.lang.String) it.next()) + "/voice2/", "msg_", str, ".amr", 2, false);
                        if (com.p314xaae8f345.mm.vfs.w6.j(d18)) {
                            com.p314xaae8f345.mm.vfs.w6.w(d18, d17);
                            com.p314xaae8f345.mm.vfs.c1.f(1);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str4, "Found wrong moving file: " + d18);
                            break;
                        }
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(com.p314xaae8f345.mm.vfs.q7.c("voice") + "/");
                        sb6.append(str);
                        java.lang.String sb7 = sb6.toString();
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(sb7 + ".amr");
                        java.lang.String str6 = a18.f294812f;
                        if (str6 != null) {
                            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                            if (!str6.equals(l18)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                        com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, null);
                        if (!m18.a() ? false : m18.f294799a.F(m18.f294800b)) {
                            com.p314xaae8f345.mm.vfs.w6.w(sb7 + ".amr", d17);
                        } else {
                            com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
                            java.lang.String str7 = a19.f294812f;
                            if (str7 != null) {
                                java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str7, false, false);
                                if (!str7.equals(l19)) {
                                    a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a19, null);
                            if (m19.a() ? m19.f294799a.F(m19.f294800b) : false) {
                                com.p314xaae8f345.mm.vfs.w6.w(sb7, d17);
                            }
                        }
                    }
                }
            }
        }
        return d17;
    }

    public void Ni(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = this.f106203d;
        if (f9Var == null || f9Var.I0() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "moveVoiceToC2CPath error, msgInfo is illegal, fileName:" + str + ", originPath: " + str2);
            return;
        }
        if (!pt0.f0.f439742b1.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "c2c path is close");
            return;
        }
        java.lang.String Di = str2 == null ? Di(bm5.y.f104289i.a(f9Var, bm5.f0.f104106u), str, false) : str2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(Di)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "moveVoiceToC2CPath error, oldPath is not exist. fileName:" + str + ", originPath: " + str2 + ", oldPath: " + Di);
            return;
        }
        bm5.f0 f0Var = bm5.f0.f104106u;
        java.lang.String a17 = bm5.d0.a(f9Var, f0Var, false, true, 2, null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Di, a17)) {
            return;
        }
        boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(Di, a17, true);
        com.p314xaae8f345.mm.vfs.w6.h(Di);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "move old voice to c2c file success: " + x17 + ", src[" + Di + "] -> dst[" + a17 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.m124847x74d37ac6() + ", svrId: " + f9Var.I0());
        bm5.c0.f104083a.c(bm5.z.f(bm5.y.f104289i.a(f9Var, f0Var)), true);
    }

    public void Ri(android.content.Context context) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.a(context);
        java.lang.String str = this.f106203d;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "playUploadVoiceSound NotificationMuted");
            return;
        }
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voice_component_upload_sound_async, 0) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "sync playUploadVoiceSound");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571477g9);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "async playUploadVoiceSound");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p944x882e457a.c.f152127a;
        final bv.o0 o0Var = new bv.o0(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncMediaPlayerWrapper", "play, tag:".concat("VoiceComponent_playUploadVoiceSound"));
        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p944x882e457a.c.f152127a;
        com.p314xaae8f345.mm.p944x882e457a.j0 j0Var = (com.p314xaae8f345.mm.p944x882e457a.j0) hashMap2.get("VoiceComponent_playUploadVoiceSound");
        if (j0Var == null || !j0Var.f152188a.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncMediaPlayerWrapper", "createNewHandler, tag:".concat("VoiceComponent_playUploadVoiceSound"));
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("VoiceComponent_playUploadVoiceSound");
            handlerThread.start();
            com.p314xaae8f345.mm.p944x882e457a.j0 j0Var2 = new com.p314xaae8f345.mm.p944x882e457a.j0(handlerThread, new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper()));
            hashMap2.put("VoiceComponent_playUploadVoiceSound", j0Var2);
            n3Var = j0Var2.f152189b;
        } else {
            n3Var = j0Var.f152189b;
        }
        n3Var.mo50293x3498a0(new java.lang.Runnable(o0Var) { // from class: com.tencent.mm.modelbase.b

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f152123d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "function");
                this.f152123d = o0Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f152123d.mo152xb9724478();
            }
        });
    }

    public boolean Ui(java.lang.String str, w21.w0 w0Var) {
        if (w0Var != null && w0Var.f524017a == -1) {
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
    public java.lang.String wi(bm5.y r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r29) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.p0.wi(bm5.y, java.lang.String, java.lang.String, boolean, boolean, com.tencent.mm.pointers.PString):java.lang.String");
    }
}
