package hn0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a */
    public mn0.b0 f363942a;

    /* renamed from: b */
    public kn0.g f363943b;

    /* renamed from: c */
    public long f363944c;

    /* renamed from: d */
    public int f363945d;

    /* renamed from: e */
    public int f363946e;

    /* renamed from: f */
    public int f363947f;

    /* renamed from: g */
    public final java.util.ArrayList f363948g;

    /* renamed from: h */
    public long f363949h;

    /* renamed from: i */
    public long f363950i;

    /* renamed from: j */
    public long f363951j;

    /* renamed from: k */
    public final int f363952k;

    /* renamed from: l */
    public int f363953l;

    /* renamed from: m */
    public com.p314xaae8f345.p2926x359365.C25484xcc963946 f363954m;

    /* renamed from: n */
    public int f363955n;

    /* renamed from: o */
    public int f363956o;

    /* renamed from: p */
    public co0.c f363957p;

    /* renamed from: q */
    public int f363958q;

    /* renamed from: r */
    public int f363959r;

    /* renamed from: s */
    public int f363960s;

    /* renamed from: t */
    public co0.g f363961t;

    /* renamed from: u */
    public long f363962u;

    /* renamed from: v */
    public java.lang.String f363963v;

    /* renamed from: w */
    public r45.nw1 f363964w;

    /* renamed from: x */
    public final java.util.Map f363965x;

    /* renamed from: y */
    public long f363966y;

    /* renamed from: z */
    public long f363967z;

    public r() {
        hn0.a[] aVarArr = hn0.a.f363915d;
        this.f363946e = 0;
        this.f363947f = 0;
        this.f363948g = new java.util.ArrayList(100);
        this.f363951j = 5 * com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f363952k = 3;
        this.f363963v = "";
        this.f363965x = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ boolean m(hn0.r rVar, int i17, java.lang.String str, boolean z17, r45.p72 p72Var, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        return rVar.l(i17, str, z17, p72Var);
    }

    public static final void n(hn0.r rVar, r45.ka4 ka4Var, java.lang.String str, java.lang.String str2, r45.p72 p72Var, boolean z17) {
        mn0.b0 b0Var = rVar.f363942a;
        if (b0Var != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
        }
        mn0.b0 b0Var2 = rVar.f363942a;
        if (b0Var2 != null) {
            mn0.b0.D(b0Var2, str, 1, ka4Var, p72Var, false, z17, 16, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchCdnStream ");
        sb6.append(str2);
        sb6.append(" startPlay done, liveId:");
        kn0.g gVar = rVar.f363943b;
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f391068b) : null);
        sb6.append(',');
        sb6.append(rVar.f363942a);
        sb6.append(", url:");
        sb6.append(str);
        sb6.append(", enableP2P:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb6.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(hn0.r r11, r45.ka4 r12, java.lang.String r13, java.lang.String r14, r45.p72 r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn0.r.o(hn0.r, r45.ka4, java.lang.String, java.lang.String, r45.p72, boolean):void");
    }

    public static /* synthetic */ void r(hn0.r rVar, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = rVar.d();
        }
        rVar.q(i17, str);
    }

    public final void a() {
        java.lang.Integer num = (java.lang.Integer) kz5.n0.o0(((java.util.LinkedHashMap) this.f363965x).values());
        int intValue = num != null ? num.intValue() : 100;
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).p().m94532x27f73e1c(intValue);
        }
    }

    public final void b(r45.p72 p72Var) {
        java.lang.String str;
        kn0.r g17;
        kn0.g gVar = this.f363943b;
        if (gVar == null || (g17 = gVar.g(this.f363946e)) == null || (str = g17.f391129a) == null) {
            str = "";
        }
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
        }
        mn0.b0 b0Var2 = this.f363942a;
        if (b0Var2 != null) {
            kn0.g gVar2 = this.f363943b;
            mn0.b0.D(b0Var2, str, 1, gVar2 != null ? gVar2.f391081o : null, p72Var, false, gVar2 != null ? gVar2.f391085s : false, 16, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchCdnStream startPlay done, liveId:");
        kn0.g gVar3 = this.f363943b;
        sb6.append(gVar3 != null ? java.lang.Long.valueOf(gVar3.f391068b) : null);
        sb6.append(',');
        sb6.append(this.f363942a);
        sb6.append(", url:");
        sb6.append(str);
        sb6.append(", enableP2P:");
        kn0.g gVar4 = this.f363943b;
        sb6.append(gVar4 != null ? java.lang.Boolean.valueOf(gVar4.f391085s) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb6.toString());
    }

    public final kn0.r c() {
        kn0.g gVar = this.f363943b;
        if (gVar != null) {
            return gVar.g(this.f363946e);
        }
        return null;
    }

    public final java.lang.String d() {
        java.lang.String e17;
        kn0.g gVar = this.f363943b;
        return (gVar == null || (e17 = gVar.e(this.f363946e)) == null) ? "" : e17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(int i17, kn0.r liveUrlInfo, int i18, r45.p72 p72Var) {
        java.lang.String str;
        int i19;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveUrlInfo, "liveUrlInfo");
        kn0.g gVar = this.f363943b;
        kn0.r rVar = null;
        if (gVar != null) {
            java.util.Collection values = gVar.f391077k.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((kn0.r) next).f391130b == liveUrlInfo.f391130b) {
                    rVar = next;
                    break;
                }
            }
            rVar = rVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "customerSwitchCdnStream liveUrlInfo:" + liveUrlInfo + ",mainUrlBlock: " + i18 + ", customerLiveInfo:" + rVar);
        if (rVar == null || (str = rVar.f391129a) == null) {
            str = "";
        }
        if (i18 == 1 && rVar != null && (str2 = rVar.f391132d) != null) {
            str = str2;
        }
        m(this, i17, null, false, p72Var, 6, null);
        if (!(str.length() > 0) || (i19 = liveUrlInfo.f391130b) <= 0) {
            return false;
        }
        kn0.g gVar2 = this.f363943b;
        if (gVar2 != null) {
            gVar2.f391076j = i19;
        }
        return true;
    }

    public final java.lang.String f() {
        kn0.g gVar = this.f363943b;
        java.lang.String str = null;
        java.lang.String c17 = gVar != null ? gVar.c(this.f363946e) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "getBackupUrl lastCdnQuality: " + this.f363946e + " backUrl: " + c17);
        if (c17 != null) {
            if (!(c17.length() > 0)) {
                c17 = null;
            }
            if (c17 != null) {
                return c17;
            }
        }
        kn0.g gVar2 = this.f363943b;
        if (gVar2 != null) {
            int i17 = gVar2.f391075i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "play fail! try backup url, quality change: %d --> %d, switchCnt:%d", java.lang.Integer.valueOf(this.f363946e), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f363945d));
            kn0.g gVar3 = this.f363943b;
            if (gVar3 != null) {
                str = gVar3.e(i17);
            }
        }
        if (str != null) {
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "play fail! backup is null");
        return "";
    }

    public final r45.p72 g() {
        r45.p72 p72Var = new r45.p72();
        p72Var.set(0, this.f363963v);
        java.lang.String m75945x2fec8307 = p72Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            pm0.z.b(xy2.b.f539688b, "LiveCdnPlayCommentSceneIsEmpty", false, pm0.w.f438338f, null, false, false, null, 120, null);
        }
        p72Var.set(1, "LiveCdn_" + c01.id.c());
        p72Var.set(3, java.lang.Long.valueOf(this.f363962u));
        kn0.g gVar = this.f363943b;
        p72Var.set(4, java.lang.Long.valueOf(gVar != null ? gVar.f391068b : 0L));
        p72Var.set(5, 0);
        return p72Var;
    }

    public final boolean h() {
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            return ((mn0.y) b0Var).b(false);
        }
        return false;
    }

    public final void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "pausePlay isInitiative: " + z17);
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).s(z17);
        }
    }

    public final void j(java.lang.String commentScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "setCommentSceneStr: commentScene=" + commentScene + ", oldCommentScene=" + this.f363963v);
        this.f363963v = commentScene;
    }

    public final void k(boolean z17) {
        long j17;
        long j18;
        mn0.i0 n17;
        long j19;
        mn0.i0 n18;
        mn0.i0 n19;
        long j27;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlay liveId:");
        kn0.g gVar = this.f363943b;
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f391068b) : null);
        sb6.append(",player:");
        sb6.append(this.f363942a);
        sb6.append(',');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb6.toString());
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            mn0.b0.C(b0Var, z17, false, false, 6, null);
        }
        mn0.b0 b0Var2 = this.f363942a;
        if (b0Var2 != null) {
            ((mn0.y) b0Var2).J(null);
        }
        mn0.b0 b0Var3 = this.f363942a;
        if (b0Var3 != null) {
            ((mn0.y) b0Var3).w();
        }
        mn0.b0 b0Var4 = this.f363942a;
        if (b0Var4 != null) {
            mn0.i0 n27 = ((mn0.y) b0Var4).n();
            if (n27 != null) {
                long j28 = n27.f411282o;
                long j29 = n27.f411278h;
                j17 = j28 - j29;
                if (n27.f411275e) {
                    j17 = n27.f411283p - j29;
                }
            } else {
                j17 = 0;
            }
            this.f363966y = j17;
            mn0.b0 b0Var5 = this.f363942a;
            if (b0Var5 == null || (n19 = ((mn0.y) b0Var5).n()) == null) {
                j18 = 0;
            } else {
                long j37 = n19.f411279i;
                if (j37 == 0) {
                    j37 = android.os.SystemClock.elapsedRealtime();
                    j27 = n19.f411283p;
                } else {
                    j27 = n19.f411283p;
                }
                j18 = j37 - j27;
            }
            this.f363967z = j18;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("stopPlay save temp data firstFrameRenderTimeCostMs=");
            long j38 = this.f363966y;
            if (j38 <= 0) {
                mn0.b0 b0Var6 = this.f363942a;
                if (b0Var6 == null || (n18 = ((mn0.y) b0Var6).n()) == null) {
                    j38 = 0;
                } else {
                    long j39 = n18.f411282o;
                    long j47 = n18.f411278h;
                    j38 = j39 - j47;
                    if (n18.f411275e) {
                        j38 = n18.f411283p - j47;
                    }
                }
            }
            sb7.append(j38);
            sb7.append(" playTimeMs=");
            long j48 = this.f363967z;
            if (j48 <= 0) {
                mn0.b0 b0Var7 = this.f363942a;
                if (b0Var7 == null || (n17 = ((mn0.y) b0Var7).n()) == null) {
                    j48 = 0;
                } else {
                    long j49 = n17.f411279i;
                    if (j49 == 0) {
                        j49 = android.os.SystemClock.elapsedRealtime();
                        j19 = n17.f411283p;
                    } else {
                        j19 = n17.f411283p;
                    }
                    j48 = j49 - j19;
                }
            }
            sb7.append(j48);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb7.toString());
        }
        this.f363942a = null;
        this.f363944c = 0L;
        this.f363945d = 0;
        this.f363948g.clear();
        this.f363949h = 0L;
        this.f363950i = 0L;
        this.f363951j = 5 * com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f363960s = 0;
        co0.g gVar2 = this.f363961t;
        if (gVar2 != null) {
            gVar2.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1 == null) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(int r17, java.lang.String r18, boolean r19, r45.p72 r20) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn0.r.l(int, java.lang.String, boolean, r45.p72):boolean");
    }

    public final void p(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "tryPlayBackupUrl: ".concat(url));
        m(this, this.f363946e, url, false, g(), 4, null);
        this.f363945d++;
        this.f363953l++;
    }

    public final void q(int i17, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (url.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCdnPlayerManager", "tryRestartPlay fail: url is nullornil");
            return;
        }
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
        }
        mn0.b0 b0Var2 = this.f363942a;
        if (b0Var2 != null) {
            kn0.g gVar = this.f363943b;
            r45.ka4 ka4Var = gVar != null ? gVar.f391081o : null;
            r45.p72 g17 = g();
            kn0.g gVar2 = this.f363943b;
            ((mn0.y) b0Var2).R(url, i17, ka4Var, g17, true, gVar2 != null ? gVar2.f391085s : false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryRestartPlay liveId:");
        kn0.g gVar3 = this.f363943b;
        sb6.append(gVar3 != null ? java.lang.Long.valueOf(gVar3.f391068b) : null);
        sb6.append(", player:");
        sb6.append(this.f363942a);
        sb6.append(", lastCdnQuality:");
        sb6.append(this.f363946e);
        sb6.append(", url:");
        sb6.append(url);
        sb6.append(", enableP2P:");
        kn0.g gVar4 = this.f363943b;
        sb6.append(gVar4 != null ? java.lang.Boolean.valueOf(gVar4.f391085s) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", sb6.toString());
    }

    public final void s(kn0.g gVar, boolean z17, com.p314xaae8f345.p2926x359365.C25484xcc963946 config, r45.p72 reportInfo) {
        int i17;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo fail liveRoomInfo is null!");
            return;
        }
        if (!gVar.b() || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo isChargeLive:" + z17 + ", cdnCustomerSwitchCfg:" + gVar.f391076j + " invalid");
            gVar.f391076j = -1;
            i17 = gVar.f391074h;
        } else {
            i17 = gVar.i(gVar.f391076j);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo isChargeLive:" + z17 + ", use cdnCustomerSwitchCfg:" + gVar.f391076j + ",index:" + i17);
        }
        this.f363956o = gVar.f391075i;
        int size = gVar.f391077k.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo ,newCdnQuality:" + i17 + ", cdnUrlSize:" + size + " lastCdnQuality: " + this.f363946e + " cdnH265BackCfg: " + this.f363956o);
        if (i17 >= size) {
            return;
        }
        int i27 = this.f363946e;
        if (i27 == 0 || (i19 = this.f363956o) == 0 || i19 != i27) {
            i18 = i17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo last had retry 265 backout ,still use newCdnQuality:" + i19 + ", cdnUrlSize:" + size + '!');
            i18 = i19;
        }
        java.lang.String e17 = gVar.e(i18);
        if (e17 == null || e17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo fail: newSwitchUrl is nullornil");
            return;
        }
        kn0.g gVar2 = this.f363943b;
        if (gVar2 != null) {
            gVar2.e(this.f363946e);
        }
        gVar.f391083q = this.f363958q;
        gVar.f391084r = this.f363959r;
        this.f363943b = gVar;
        this.f363946e = i18;
        m(this, i18, null, false, reportInfo, 6, null);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (this.f363954m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo: mPlayConfig is null, use config:" + config);
            this.f363954m = config;
        }
        t();
        u();
    }

    public final void t() {
        r45.ka4 ka4Var;
        r45.ka4 ka4Var2;
        r45.ka4 ka4Var3;
        r45.ka4 ka4Var4;
        kn0.g gVar = this.f363943b;
        int i17 = 0;
        int i18 = (gVar == null || (ka4Var4 = gVar.f391081o) == null) ? 0 : ka4Var4.Z;
        if (gVar != null && (ka4Var3 = gVar.f391081o) != null) {
            i17 = ka4Var3.f460077p0;
        }
        float f17 = 0.0f;
        float f18 = ((gVar == null || (ka4Var2 = gVar.f391081o) == null) ? 0.0f : ka4Var2.f460087x0) / 100.0f;
        if (gVar != null && (ka4Var = gVar.f391081o) != null) {
            f17 = ka4Var.f460090y0;
        }
        float f19 = f17 / 100.0f;
        if (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce.f150097b == null) {
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce.f150097b = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce();
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce c10834xb010c4ce = com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce.f150097b;
        c10834xb010c4ce.b(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WaveJBM:", "After JoinLive updatePlayerAudioJitterBufferConfig, waveJbmFlag:" + i18 + ", waveJbmMode:" + i17 + ", waveJbmMinSpeed:" + f18 + ", waveJbmMaxSpeed:" + f19 + ", waveJbmFactoryInstance:" + c10834xb010c4ce);
        mn0.b0 b0Var = this.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).V(i18, i17, f18, f19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn0.r.u():void");
    }
}
