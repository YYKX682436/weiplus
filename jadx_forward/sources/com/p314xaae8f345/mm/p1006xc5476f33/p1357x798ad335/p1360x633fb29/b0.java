package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0 {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f178513j = vz.e1.f523073a;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f178514c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f178515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f178516e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f178517f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f178518g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f178519h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f178520i;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var) {
        super(l0Var);
        this.f178515d = new byte[0];
        this.f178519h = new java.util.HashMap();
        this.f178520i = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w(this);
        this.f178514c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f178516e = new java.util.HashMap();
        this.f178517f = new java.util.HashMap();
        this.f178518g = new java.util.concurrent.ConcurrentHashMap();
        iv1.f.f().f376647h = wVar;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 g(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var, h02.a aVar) {
        b0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00 = new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00();
        c13091xf399cf00.f177031d = true;
        java.lang.String str = aVar.f68411x238eb002;
        c13091xf399cf00.f177033f = str;
        c13091xf399cf00.f177032e = str;
        c13091xf399cf00.f177034g = aVar.f68419xf1e9b966;
        c13091xf399cf00.f177035h = aVar.f68433xf9fba680;
        c13091xf399cf00.f177037m = 15;
        c13091xf399cf00.f177038n = 3600;
        c13091xf399cf00.f177039o = true;
        c13091xf399cf00.f177040p = aVar.f68409xc4f9be67;
        c13091xf399cf00.f177042r = aVar.f68426x4b6e68b9;
        c13091xf399cf00.f177043s = aVar.f68415x8a7becfa;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            long j17 = aVar.f68420xf1eb3542;
            if (j17 > 0) {
                jSONObject.put("Content-Length", j17);
            }
            c13091xf399cf00.f177036i = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", "addVerifyHeaders: " + e17.getMessage());
        }
        return c13091xf399cf00;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean a(long j17) {
        return k(j17, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        if (t0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t0Var.f178683a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", "Invalid Request");
            return -1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask, appId : %s", t0Var.f178689g);
        java.lang.String str = t0Var.f178683a;
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(t0Var.f178689g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = null;
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = d(f17.f68408x32b20428);
            if (d17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask, status = " + d17.f178496f);
                int i17 = d17.f178496f;
                if (i17 == 1 || i17 == 6) {
                    return d17.f178494d;
                }
                if (i17 == 3) {
                    if (f17.f68406x8d834527) {
                        k02.l.a(d17.f178494d, false, null);
                    }
                    return d17.f178494d;
                }
            }
            c13222x107de37 = d17;
        }
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(f17.f68408x32b20428);
        }
        h02.a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.b(t0Var);
        if (!t0Var.f178695m || f17 == null) {
            b17.f68408x32b20428 = java.lang.System.currentTimeMillis();
            b17.f68446x1294bc41 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.e();
        } else {
            b17.f68408x32b20428 = f17.f68408x32b20428;
        }
        b17.f68414xf4f8adf4 = 3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t0Var.f178708z)) {
            b17.f68419xf1e9b966 = f178513j + com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0.f(str);
        } else {
            b17.f68419xf1e9b966 = t0Var.f178708z;
        }
        java.lang.String str2 = b17.f68419xf1e9b966;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2.substring(0, str2.lastIndexOf("/") + 1));
        if (!r6Var.m()) {
            if (!r6Var.s().m()) {
                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(s17.o());
                if (r6Var2.J()) {
                    r6Var2.L(s17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", "mkdir parent error, %s", s17.o());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "Make download dir result: %b", java.lang.Boolean.valueOf(r6Var.J()));
        }
        if (c13222x107de37 != null) {
            java.lang.String str3 = b17.f68419xf1e9b966;
            java.lang.String str4 = c13222x107de37.f178497g;
            if (str3 != null && str4 != null && !str3.equals(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "removeLastFile, new File = %s, oldFile = %s", str3, str4);
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str4));
                if (r6Var3.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "Delete previous file result: %b", java.lang.Boolean.valueOf(r6Var3.l()));
                }
            }
            int i18 = c13222x107de37.f178496f;
            if (i18 == 2) {
                b17.f68439x5ab9b1b4 = 1;
            } else if (i18 == 4) {
                b17.f68439x5ab9b1b4 = 2;
            } else {
                b17.f68439x5ab9b1b4 = 0;
            }
            b17.f68438x1bb3427e = c13222x107de37.f178500m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask, startSize = " + c13222x107de37.f178500m);
        } else {
            b17.f68439x5ab9b1b4 = 0;
        }
        if (!t0Var.f178696n || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                b17.f68409xc4f9be67 = true;
            }
            return e(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "downloadInWifi, not in wifi");
        b17.f68441x10a0fed7 = 0;
        b17.f68409xc4f9be67 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(b17);
        return b17.f68408x32b20428;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean c(long j17) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z(this, j17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d(long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, downloadid ; %d, appId : %s, status : %d", java.lang.Long.valueOf(c17.f68408x32b20428), c17.f68404x28d45f97, java.lang.Integer.valueOf(c17.f68441x10a0fed7));
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f h17 = java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId() ? iv1.f.f().h(c17.f68411x238eb002) : iv1.f.f().h(c17.f68411x238eb002);
        if (h17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, cdntaskstate: %d", java.lang.Integer.valueOf(h17.f177044d));
            switch (h17.f177044d) {
                case 100:
                    c13222x107de37.f178496f = 1;
                    c13222x107de37.f178500m = h17.f177045e;
                    c13222x107de37.f178501n = h17.f177046f;
                    break;
                case 101:
                    c13222x107de37.f178496f = 1;
                    c13222x107de37.f178500m = c17.f68413xf432b5ad;
                    c13222x107de37.f178501n = c17.f68443x78351860;
                    break;
                case 102:
                    c13222x107de37.f178496f = 2;
                    c13222x107de37.f178500m = h17.f177045e;
                    c13222x107de37.f178501n = h17.f177046f;
                    break;
                case 103:
                default:
                    int i17 = c17.f68441x10a0fed7;
                    if (i17 == 1) {
                        c13222x107de37.f178496f = 2;
                    } else {
                        c13222x107de37.f178496f = i17;
                    }
                    c13222x107de37.f178500m = c17.f68413xf432b5ad;
                    c13222x107de37.f178501n = c17.f68443x78351860;
                    break;
                case 104:
                    if (!com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                        c13222x107de37.f178496f = 0;
                        break;
                    } else if (c17.f68441x10a0fed7 != 6) {
                        c13222x107de37.f178496f = 3;
                        break;
                    } else {
                        c13222x107de37.f178496f = 6;
                        break;
                    }
            }
            long abs = java.lang.Math.abs(c13222x107de37.f178501n);
            c13222x107de37.f178501n = abs;
            long j18 = c13222x107de37.f178500m;
            if (j18 > abs) {
                j18 = abs;
            }
            c13222x107de37.f178500m = j18;
            c17.f68413xf432b5ad = j18;
            c17.f68443x78351860 = abs;
        } else {
            c13222x107de37.f178496f = c17.f68441x10a0fed7;
            if (com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                c13222x107de37.f178500m = c17.f68413xf432b5ad;
                c13222x107de37.f178501n = c17.f68443x78351860;
            } else {
                c13222x107de37.f178500m = 0L;
                c13222x107de37.f178501n = 0L;
            }
        }
        int i18 = c13222x107de37.f178496f;
        if ((i18 == 6 || i18 == 3) && !com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
            c13222x107de37.f178496f = 0;
        }
        if (c13222x107de37.f178496f == 6) {
            if (!((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a).contains(java.lang.Long.valueOf(c13222x107de37.f178494d))) {
                c13222x107de37.f178496f = 3;
            }
        }
        c13222x107de37.f178494d = j17;
        c13222x107de37.f178503p = c17.f68414xf4f8adf4;
        c13222x107de37.f178502o = c17.f68405x56e99a7c;
        c13222x107de37.f178497g = c17.f68419xf1e9b966;
        c13222x107de37.f178495e = c17.f68411x238eb002;
        c13222x107de37.f178498h = c17.f68426x4b6e68b9;
        c13222x107de37.f178499i = c17.f68404x28d45f97;
        c13222x107de37.f178506s = c17.f68446x1294bc41;
        int i19 = c17.f68441x10a0fed7;
        int i27 = c13222x107de37.f178496f;
        if (i19 != i27 && (i27 == 1 || i19 == 1)) {
            c17.f68441x10a0fed7 = i27;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, url: %s, status = %d, downloadedSize = %d, totalSize = %d", c13222x107de37.f178495e, java.lang.Integer.valueOf(c13222x107de37.f178496f), java.lang.Long.valueOf(c13222x107de37.f178500m), java.lang.Long.valueOf(c13222x107de37.f178501n));
        return c13222x107de37;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long e(h02.a aVar) {
        p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.x(this, aVar));
        return aVar.f68408x32b20428;
    }

    public final void h(java.lang.String str) {
        synchronized (this.f178515d) {
            java.lang.Integer num = (java.lang.Integer) this.f178518g.get(str);
            if (num == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "No notification id found");
                return;
            }
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(num.intValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "cancelNotification, id = " + num);
            this.f178518g.remove(str);
        }
    }

    public final android.app.PendingIntent i(h02.a aVar) {
        android.content.Context context = this.f178514c;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.C13234xcc804288.class);
        if (aVar.f68441x10a0fed7 != 4) {
            intent.putExtra("extra_download_id", aVar.f68408x32b20428);
        }
        return android.app.PendingIntent.getBroadcast(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(268435456));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r12 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(h02.a r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 4
            if (r11 != r0) goto L5
            r0 = 2
            goto L10
        L5:
            r1 = 3
            if (r11 != r1) goto L9
            goto Lf
        L9:
            r1 = 1
            if (r11 != r1) goto Lf
            if (r12 == 0) goto Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            java.lang.Class<m33.l1> r11 = m33.l1.class
            i95.m r11 = i95.n0.c(r11)
            m33.l1 r11 = (m33.l1) r11
            java.lang.String r2 = r10.f68417x26b3182a
            r3 = 11311002(0xac979a, double:5.5883775E-317)
            r5 = 0
            r7 = 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "{\"status\":"
            r10.<init>(r12)
            r10.append(r0)
            java.lang.String r12 = "}"
            r10.append(r12)
            java.lang.String r8 = r10.toString()
            r1 = r11
            com.tencent.mm.plugin.game.p0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) r1
            r1.nj(r2, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0.j(h02.a, int, boolean):void");
    }

    public boolean k(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || (d17 = d(c17.f68408x32b20428)) == null) {
            return false;
        }
        int i17 = d17.f178496f;
        if (i17 != 1 && i17 != 6) {
            if (i17 == 3) {
                if (c17.f68406x8d834527) {
                    k02.l.a(d17.f178494d, false, null);
                }
                return true;
            }
            if ((c17.f68431x4651c731 || c17.f68409xc4f9be67) && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask, downloadInWifi, not wifi");
                return true;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                c17.f68409xc4f9be67 = true;
            }
            p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a0(this, c17, z17, j17));
        }
        return true;
    }

    public final void l(java.lang.String str, int i17, int i18, boolean z17, boolean z18, boolean z19) {
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", "updateNotification failed: null task info");
            return;
        }
        if (f17.f68435x73c7b92d) {
            if (f17.f68421xf1ebe47b == 5 && (i17 == 4 || (i17 == 1 && z17))) {
                j(f17, i17, z19);
            }
            z2.k0 k0Var = new z2.k0(this.f178514c, "reminder_channel_id");
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.f178516e.put(str, java.lang.Long.valueOf(currentTimeMillis));
                k0Var.D.when = currentTimeMillis;
            } else {
                java.lang.Long l17 = (java.lang.Long) this.f178516e.get(str);
                if (l17 != null) {
                    k0Var.D.when = l17.longValue();
                } else {
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    this.f178516e.put(str, valueOf);
                    k0Var.D.when = valueOf.longValue();
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f68428x579b8428)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(f17.f68404x28d45f97, false, false);
                if (j17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f67372x453d1e07)) {
                    k0Var.f(f17.f68418xf1e8cfcc);
                } else {
                    k0Var.f(j17.f67372x453d1e07);
                }
            } else if (f17.f68421xf1ebe47b == 5) {
                k0Var.f(f17.f68428x579b8428);
            } else {
                k0Var.f(f17.f68428x579b8428 + " · " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cef));
            }
            if (i17 == 1) {
                k0Var.D.icon = android.R.drawable.stat_sys_download;
                if (i18 == 0) {
                    i18 = 1;
                }
                boolean z27 = i18 == 0;
                k0Var.f551003n = 100;
                k0Var.f551004o = i18;
                k0Var.f551005p = z27;
                if (f17.f68421xf1ebe47b != 5) {
                    if (f17.f68431x4651c731) {
                        k0Var.e(this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cem) + "·" + this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cek));
                    } else {
                        k0Var.e(this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cek));
                    }
                    android.content.Context context = this.f178514c;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13233xe6767370.class);
                    intent.putExtra("extra_download_id", f17.f68408x32b20428);
                    k0Var.f550996g = android.app.PendingIntent.getActivity(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(268435456));
                } else {
                    k0Var.e(this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhn));
                    k0Var.f550996g = i(f17);
                }
                k0Var.h(2, true);
            } else {
                if (i17 != 4) {
                    h(str);
                    return;
                }
                k0Var.D.icon = android.R.drawable.stat_sys_download_done;
                k0Var.d(true);
                if (f17.f68421xf1ebe47b != 5) {
                    if (z18) {
                        k0Var.e(this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cei));
                    } else {
                        k0Var.e(this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ceh));
                    }
                    k0Var.f550996g = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, new android.content.Intent(), fp.g0.a(0));
                } else {
                    k0Var.e(this.f178514c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhl));
                    k0Var.f550996g = i(f17);
                }
            }
            synchronized (this.f178515d) {
                java.lang.Integer num = (java.lang.Integer) this.f178518g.get(str);
                if (num == null) {
                    this.f178518g.put(str, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).m(k0Var.b(), true)));
                } else {
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(num.intValue(), k0Var.b(), true);
                }
                if (i17 == 4) {
                    this.f178518g.remove(str);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    /* renamed from: removeDownloadTask */
    public int mo54687xdf0c94d1(long j17) {
        p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y(this, j17));
        return 1;
    }
}
