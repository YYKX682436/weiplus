package wz3;

@j95.b
/* loaded from: classes.dex */
public final class h extends i95.w {

    /* renamed from: f, reason: collision with root package name */
    public int f532320f;

    /* renamed from: d, reason: collision with root package name */
    public final wz3.l f532318d = new wz3.l(0);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f532319e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f532321g = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2 A[Catch: all -> 0x0260, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0036, B:8:0x007e, B:9:0x0082, B:11:0x0088, B:50:0x01e2, B:52:0x0223, B:53:0x0226, B:54:0x01ec, B:58:0x021b, B:63:0x022e, B:64:0x0254, B:65:0x0257, B:67:0x023b, B:80:0x0258), top: B:3:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ec A[Catch: all -> 0x0260, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0036, B:8:0x007e, B:9:0x0082, B:11:0x0088, B:50:0x01e2, B:52:0x0223, B:53:0x0226, B:54:0x01ec, B:58:0x021b, B:63:0x022e, B:64:0x0254, B:65:0x0257, B:67:0x023b, B:80:0x0258), top: B:3:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e A[Catch: all -> 0x0260, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0036, B:8:0x007e, B:9:0x0082, B:11:0x0088, B:50:0x01e2, B:52:0x0223, B:53:0x0226, B:54:0x01ec, B:58:0x021b, B:63:0x022e, B:64:0x0254, B:65:0x0257, B:67:0x023b, B:80:0x0258), top: B:3:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023b A[Catch: all -> 0x0260, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0036, B:8:0x007e, B:9:0x0082, B:11:0x0088, B:50:0x01e2, B:52:0x0223, B:53:0x0226, B:54:0x01ec, B:58:0x021b, B:63:0x022e, B:64:0x0254, B:65:0x0257, B:67:0x023b, B:80:0x0258), top: B:3:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void wi(wz3.h r16, java.lang.String r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wz3.h.wi(wz3.h, java.lang.String, int, int, int):void");
    }

    public final boolean Ai() {
        java.lang.String str;
        boolean z17;
        wz3.l lVar = this.f532318d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f532319e;
        try {
            m134976x2690a4ac();
            if (this.f532321g != -1) {
                m134976x2690a4ac();
                return this.f532321g == 1;
            }
            java.lang.String str2 = Vi() + "/csc_config.json";
            if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                this.f532321g = 0;
                m134976x2690a4ac();
                concurrentHashMap.clear();
                this.f532320f = 0;
                lVar.a(3);
                return false;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(str2));
            this.f532320f = jSONObject.optInt("version", 0);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("file");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                this.f532321g = 0;
                m134976x2690a4ac();
                concurrentHashMap.clear();
                this.f532320f = 0;
                lVar.a(3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfDownloadModelResReady fileJsonArray is empty. version:");
                m134976x2690a4ac();
                sb6.append(this.f532320f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelResLogic", sb6.toString());
                return false;
            }
            int i17 = 0;
            while (true) {
                if (!(i17 < optJSONArray.length())) {
                    this.f532321g = 1;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append("checkIfDownloadModelResReady true. version:");
                    m134976x2690a4ac();
                    sb7.append(this.f532320f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", sb7.toString());
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append("下发模型已ready：");
                    m134976x2690a4ac();
                    sb8.append(this.f532320f);
                    fj(sb8.toString());
                    lVar.a(2);
                    return true;
                }
                java.lang.Object obj = optJSONArray.get(i17);
                i17++;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                java.lang.String optString2 = jSONObject2.optString("param");
                str = Vi() + '/' + optString;
                if (optString2 != null && !r26.n0.N(optString2)) {
                    z17 = false;
                    if (!z17 || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        break;
                    }
                    m134976x2690a4ac();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    concurrentHashMap.put(optString2, str);
                }
                z17 = true;
                if (!z17) {
                    break;
                    break;
                }
                m134976x2690a4ac();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                concurrentHashMap.put(optString2, str);
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append("checkIfDownloadModelResReady file not exist. version:");
            m134976x2690a4ac();
            sb9.append(this.f532320f);
            sb9.append(", filePath:");
            sb9.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelResLogic", sb9.toString());
            m134976x2690a4ac();
            concurrentHashMap.clear();
            this.f532320f = 0;
            this.f532321g = 0;
            lVar.a(3);
            return false;
        } catch (java.lang.Exception e17) {
            this.f532321g = 0;
            m134976x2690a4ac();
            concurrentHashMap.clear();
            this.f532320f = 0;
            lVar.a(3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanProductModelResLogic", e17, "checkIfDownloadModelResReady.", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean Bi() {
        try {
            int Di = Di(Ni());
            int Di2 = Di(Vi() + "/csc_config.json");
            if (Di <= Di2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanProductModelResLogic", "copyPendingDirToReadyDirIfNeed not copy, pendingVersion:" + Di + ", readyVersion:" + Di2);
                fj("下发模型已ready，无需拷贝：" + Di2 + ", " + Di);
                return true;
            }
            java.lang.String Vi = Vi();
            java.lang.String Ri = Ri();
            com.p314xaae8f345.mm.vfs.w6.f(Vi);
            com.p314xaae8f345.mm.vfs.w6.u(Vi);
            boolean b17 = com.p314xaae8f345.mm.vfs.w6.b(Ri, Vi);
            wz3.l lVar = this.f532318d;
            if (b17) {
                lVar.a(9);
            } else {
                lVar.a(10);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "copyPendingDirToReadyDirIfNeed copy, pendingVersion:" + Di + ", readyVersion:" + Di2 + ", result:" + b17);
            fj("拷贝模型到ready目录：" + Di2 + ", " + Di + ", " + b17);
            return b17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanProductModelResLogic", e17, "copyPendingDirToReadyDirIfNeed", new java.lang.Object[0]);
            return false;
        }
    }

    public final int Di(java.lang.String str) {
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanProductModelResLogic", "getConfigJsonVersion file is not exist. filePath:" + str);
                return 0;
            }
            int optInt = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(str)).optInt("version", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "getConfigJsonVersion version:" + optInt + " , filePath:" + str);
            return optInt;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanProductModelResLogic", e17, "getConfigJsonVersion", new java.lang.Object[0]);
            return 0;
        }
    }

    public final java.lang.String Ni() {
        return Ri() + "/csc_config.json";
    }

    public final java.lang.String Ri() {
        return Zi() + "pending";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x0015, B:10:0x0024, B:15:0x0030, B:17:0x0036, B:19:0x003c, B:21:0x004c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x0015, B:10:0x0024, B:15:0x0030, B:17:0x0036, B:19:0x003c, B:21:0x004c), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Ui() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.ScanProductModelResLogic"
            java.lang.String r2 = "getReadyModelConfigString  config:"
            java.lang.String r3 = "getReadyModelConfigString file is not exist. filePath:"
            r4 = 0
            boolean r5 = r7.Ai()     // Catch: java.lang.Exception -> L63
            if (r5 != 0) goto L15
            java.lang.String r2 = "getReadyModelConfigString res is not ready"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Exception -> L63
            return r0
        L15:
            r7.m134976x2690a4ac()     // Catch: java.lang.Exception -> L63
            java.util.concurrent.ConcurrentHashMap r5 = r7.f532319e     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = "csc_model_config"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L63
            if (r5 == 0) goto L2d
            boolean r6 = r26.n0.N(r5)     // Catch: java.lang.Exception -> L63
            if (r6 == 0) goto L2b
            goto L2d
        L2b:
            r6 = r4
            goto L2e
        L2d:
            r6 = 1
        L2e:
            if (r6 == 0) goto L36
            java.lang.String r2 = "getReadyModelConfigString fileName is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Exception -> L63
            return r0
        L36:
            boolean r6 = com.p314xaae8f345.mm.vfs.w6.j(r5)     // Catch: java.lang.Exception -> L63
            if (r6 != 0) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r2.<init>(r3)     // Catch: java.lang.Exception -> L63
            r2.append(r5)     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L63
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Exception -> L63
            return r0
        L4c:
            java.lang.String r3 = com.p314xaae8f345.mm.vfs.w6.M(r5)     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r5.<init>(r2)     // Catch: java.lang.Exception -> L63
            r5.append(r3)     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> L63
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)     // Catch: java.lang.Exception -> L63
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)     // Catch: java.lang.Exception -> L63
            return r3
        L63:
            r2 = move-exception
            java.lang.String r3 = "getReadyModelConfigString"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wz3.h.Ui():java.lang.String");
    }

    public final java.lang.String Vi() {
        return Zi() + "ready";
    }

    public final java.lang.String Zi() {
        m134976x2690a4ac();
        return lp0.b.h() + "scan_res/";
    }

    public final java.lang.String aj() {
        m134976x2690a4ac();
        return bj() + "/csc_config.json";
    }

    public final java.lang.String bj() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Zi() + "temp");
        sb6.append("/cscmodel");
        return sb6.toString();
    }

    public final boolean cj(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = bj() + '/' + str;
        java.lang.String str4 = Ri() + '/' + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "moveFileToPendingFilePath file tmp:" + str3 + "  pending:" + str4);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelResLogic", "moveFileToPendingFilePath file is not exist. tmpFilePath:" + str3);
            return false;
        }
        com.p314xaae8f345.mm.vfs.w6.w(str3, str4);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uk.k.b(str4), str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "moveFileToPendingFilePath move, result:" + b17 + "  file: " + str4);
        return b17;
    }

    public final void fj(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        boolean z17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "onAccountInitialized");
        try {
            this.f532320f = 0;
            this.f532321g = -1;
            m134976x2690a4ac();
            this.f532319e.clear();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanProductModelResLogic", e17, "resetData", new java.lang.Object[0]);
        }
        java.lang.String Ni = Ni();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "checkFile pendingConfigFilePath : " + Ni);
        if (com.p314xaae8f345.mm.vfs.w6.j(Ni)) {
            try {
                java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(Ni);
                org.json.JSONObject jSONObject = new org.json.JSONObject(M);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("file");
                int optInt = jSONObject.optInt("version");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unzipRes  jsonFile:");
                sb6.append(optJSONArray != null ? java.lang.Integer.valueOf(optJSONArray.length()) : null);
                sb6.append("  version:");
                sb6.append(optInt);
                sb6.append("  meta json: ");
                sb6.append(M);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", sb6.toString());
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelResLogic", "checkFile jsonFile is empty");
                } else {
                    int i17 = 0;
                    do {
                        if (!(i17 < optJSONArray.length())) {
                            Bi();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "checkFile true");
                            z17 = true;
                            break;
                        }
                        java.lang.Object obj = optJSONArray.get(i17);
                        i17++;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        str = Ri() + '/' + ((org.json.JSONObject) obj).optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    } while (com.p314xaae8f345.mm.vfs.w6.j(str));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelResLogic", "checkFile file not exist. filePath:" + str);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanProductModelResLogic", e18, "checkFile", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanProductModelResLogic", "checkFile config not exist.");
        }
        z17 = false;
        wz3.l lVar = this.f532318d;
        if (z17) {
            lVar.a(0);
            return;
        }
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(97, 1);
        if (com.p314xaae8f345.mm.vfs.w6.j(Bi)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "cache file exist " + Bi);
            gm0.j1.e().j(new wz3.f(this, Bi));
        }
        lVar.a(1);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductModelResLogic", "onAccountReleased");
        try {
            this.f532320f = 0;
            this.f532321g = -1;
            m134976x2690a4ac();
            this.f532319e.clear();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanProductModelResLogic", e17, "resetData", new java.lang.Object[0]);
        }
    }
}
