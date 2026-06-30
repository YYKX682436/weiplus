package kw2;

/* loaded from: classes15.dex */
public class m0 implements nk4.s {

    /* renamed from: a, reason: collision with root package name */
    public r45.qt2 f394589a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f394590b;

    /* renamed from: c, reason: collision with root package name */
    public int f394591c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f394592d;

    /* renamed from: e, reason: collision with root package name */
    public final pw2.a f394593e;

    /* renamed from: f, reason: collision with root package name */
    public final kw2.a0 f394594f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f394595g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f394596h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f394597i;

    /* renamed from: j, reason: collision with root package name */
    public ni3.a1 f394598j;

    /* renamed from: k, reason: collision with root package name */
    public final int f394599k;

    /* renamed from: l, reason: collision with root package name */
    public nh.c f394600l;

    public m0(r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f394589a = contextObj;
        this.f394590b = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f394592d = new java.util.concurrent.ConcurrentHashMap();
        this.f394593e = new pw2.a("Finder.Stat.FirstFrame");
        this.f394594f = new kw2.a0();
        this.f394595g = true;
        this.f394596h = true;
        this.f394597i = new java.util.concurrent.ConcurrentHashMap();
        this.f394599k = hc1.i.f69826x366c91de;
    }

    public static final float e(kw2.m0 m0Var, double d17) {
        m0Var.getClass();
        if (d17 == 0.0d) {
            return 0.0f;
        }
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return java.lang.Float.parseFloat(format);
    }

    public void A(nk4.b data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.f394482x0 = true;
            long j17 = data.f419598b;
            d0Var.H = j17;
            long j18 = d0Var.F;
            if (j18 > 0) {
                d0Var.E += j17 - j18;
                d0Var.F = 0L;
            }
            if (d0Var.M == 0) {
                long j19 = j17 - d0Var.f394457l;
                d0Var.M = j19;
                long j27 = d0Var.F;
                if (j19 >= j27) {
                    d0Var.M = j19 - j27;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("firstCallStartPlayer", d0Var) + ' ' + m("firstCallStartPlayer", d0Var));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onResume", d0Var) + " onResume:" + d0Var.E);
        }
    }

    public void B(nk4.e data) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        boolean E;
        r45.vf2 vf2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "onStartPlay");
        kw2.d0 d0Var = new kw2.d0();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        d0Var.f394437b = Ri;
        d0Var.f394439c = data.f419597a;
        d0Var.f394441d = data.f419599c;
        java.lang.String str3 = data.f419603d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
        d0Var.f394443e = str3;
        java.lang.String str4 = data.f419604e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
        d0Var.f394449h = str4;
        d0Var.f394451i = data.f419608i;
        d0Var.f394453j = data.f419609j;
        java.lang.String str5 = data.f419612m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
        d0Var.f394445f = str5;
        d0Var.f394447g = hc2.b0.k(data.f419613n, 0, 0, 3, null);
        d0Var.f394457l = data.f419598b;
        d0Var.f394459m = data.f419610k;
        d0Var.B = true;
        d0Var.C0 = data.f419614o;
        d0Var.D = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2);
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        d0Var.f394460m0 = ((android.media.AudioManager) systemService).getStreamVolume(3);
        cu2.x xVar = cu2.x.f303982a;
        so2.i3 c17 = cu2.x.c(xVar, data.f419603d, false, false, false, 14, null);
        int i17 = d0Var.C0;
        d0Var.f394469r = i17 > 0 ? i17 + 1 : c17.w0() > 0 ? 1 : 0;
        d0Var.f394485z = !c17.f68979x84cd6908 ? 1 : 0;
        d0Var.f394471s = (int) c17.f68968x799e9d9e;
        long[] jArr = new long[3];
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(c17.f68981xaca5bdda, jArr);
        long j17 = 0;
        d0Var.R0 = java.lang.Long.max(0L, jArr[0]);
        java.lang.String str6 = c17.f68976xe1500f8;
        if (str6 == null) {
            str6 = "";
        }
        d0Var.f394472s0 = str6;
        if (android.text.TextUtils.isEmpty(data.f419607h)) {
            int i18 = c17.f68995x3b89adfb;
            if (i18 == 26) {
                str = "H264";
            } else if (i18 == 172) {
                str = "H265";
            } else if (i18 != 193) {
                str = "unknown@" + c17.f68995x3b89adfb;
            } else {
                str = "H266";
            }
        } else {
            str = data.f419607h;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        d0Var.f394480w0 = str;
        java.lang.String m40070xdc68a9b2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m40070xdc68a9b2, "getNetTypeString(...)");
        d0Var.f394481x = m40070xdc68a9b2;
        d0Var.f394483y = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ik();
        if (this.f394589a.m75933x41a8a7f2(13)) {
            java.lang.Long l17 = (java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206747m.get(d0Var.f394439c);
            if (l17 != null) {
                j17 = l17.longValue();
            }
        } else {
            java.lang.Long l18 = (java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206743f.get(d0Var.f394439c);
            if (l18 != null) {
                j17 = l18.longValue();
            }
        }
        d0Var.T = j17;
        if (cw2.l5.f305368a.e()) {
            str2 = "h266";
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            str2 = d11.s.Di(4) ? "h265" : "h264";
        }
        d0Var.f394478v0 = str2;
        d0Var.f394455k = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546228l;
        d0Var.f394486z0 = data.f419605f;
        d0Var.A0 = data.f419606g;
        d0Var.C0 = data.f419614o;
        this.f394592d.put(java.lang.Long.valueOf(data.f419597a), d0Var);
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        jz5.o oVar = (jz5.o) ek6.f546234r.get(d0Var.f394443e);
        if (oVar == null || (vf2Var = (r45.vf2) oVar.f384374d) == null) {
            num = null;
        } else {
            java.lang.String m75945x2fec8307 = vf2Var.m75945x2fec8307(15);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            d0Var.M0 = m75945x2fec8307;
            num = java.lang.Integer.valueOf(((long) vf2Var.m75939xb282bd08(2)) >= ek6.f546227k ? 1 : 0);
        }
        d0Var.J0 = num != null ? num.intValue() : -1;
        java.lang.String str7 = "Finder.Report." + data.f419616q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str7, "<set-?>");
        d0Var.f394435a = str7;
        d0Var.L0 = data.f419611l;
        java.lang.String mediaId = d0Var.f394443e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        so2.i3 c18 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        int i19 = c18.f68985x2928e136 + 1;
        c18.f68985x2928e136 = i19;
        xVar.i(mediaId, c18, false);
        d0Var.Q0 = i19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateApmInfoOnStart, lastProfiler=");
        nh.c cVar = this.f394600l;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", sb6.toString());
        nh.c cVar2 = this.f394600l;
        if (cVar2 != null) {
            synchronized (cVar2) {
                synchronized (cVar2) {
                    rh.c1 c1Var = cVar2.f418603c;
                    E = c1Var != null ? c1Var.E() : false;
                }
            }
            if (E) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderVideoPlayReporter", "still running, cancel it");
                cVar2.a();
                cVar2.b();
            }
        }
        nh.c cVar3 = new nh.c("Feed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "newProfiler=" + java.lang.Integer.valueOf(cVar3.f418602b));
        synchronized (cVar3) {
            cVar3.d();
        }
        this.f394600l = cVar3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "positionType:" + d0Var.L0 + ' ' + f("onStartPlay", d0Var) + " firstplay:" + d0Var.f394485z + "  hitPreloadPercent:" + d0Var.f394471s + " posterNickName:" + d0Var.f394445f + " mediaDesc:" + d0Var.f394447g);
    }

    public void C(nk4.o data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "onStopPlay");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f394592d;
        long j17 = data.f419597a;
        kw2.d0 d0Var = (kw2.d0) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (d0Var != null && d0Var.f394439c == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var.f394443e, data.f419629d)) {
            long j18 = d0Var.f394457l;
            long j19 = data.f419598b;
            d0Var.f394461n = j19 - j18;
            nk4.a aVar = data.f419630e;
            d0Var.I0 = aVar != null ? aVar.a() : null;
            long j27 = d0Var.F;
            if (j27 > 0) {
                d0Var.E += j19 - j27;
                d0Var.F = 0L;
            }
            long j28 = d0Var.H;
            if (j28 > 0) {
                d0Var.G += j19 - j28;
                d0Var.H = 0L;
            }
            long j29 = d0Var.R;
            if (j29 > 0) {
                d0Var.S += j19 - j29;
                r45.t23 t23Var = new r45.t23();
                t23Var.set(2, java.lang.Integer.valueOf((int) (j19 - d0Var.R)));
                t23Var.set(1, java.lang.Integer.valueOf((int) d0Var.f394465p));
                t23Var.set(0, 0);
                d0Var.f394456k0.add(t23Var);
                d0Var.R = 0L;
            }
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            d0Var.f394462n0 = ((android.media.AudioManager) systemService).getStreamVolume(3);
            if (d0Var.f394434J == 0 && d0Var.B && d0Var.f394463o < 5) {
                d0Var.C = 1;
            }
            if (d0Var.Y) {
                this.f394590b.add(d0Var);
            } else {
                G(d0Var);
            }
            this.f394592d.remove(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onStopPlay", d0Var) + " playTime:" + d0Var.f394461n + " pauseTotalTime:" + d0Var.E + " realPlayTime:" + d0Var.G + " playStatus:" + d0Var.C + " videoPlayCodeId:" + d0Var.f394480w0);
        }
    }

    public void D(nk4.f data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.B = true;
            d0Var.R = data.f419598b;
            boolean z17 = data.f419617d;
            d0Var.f394468q0 = z17;
            d0Var.Q++;
            if (d0Var.f394434J > 0) {
                if (z17) {
                    d0Var.f394436a0++;
                } else {
                    d0Var.Z++;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onWaiting", d0Var));
            try {
                byte[] N = gm0.j1.n().f354821b.f152297d.N(120, 20);
                if (N != null) {
                    java.util.LinkedList<r45.yw0> linkedList = new java.util.LinkedList();
                    com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m40181x6820db7f = com.p314xaae8f345.p542x3306d5.mm.C4565xc753cdad.m40181x6820db7f(N);
                    if (m40181x6820db7f != null) {
                        java.util.Iterator it = ((java.util.ArrayList) kz5.v.w(m40181x6820db7f, com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb.class)).iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb c4564xe93729bb = (com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb) it.next();
                            r45.yw0 yw0Var = new r45.yw0();
                            yw0Var.set(3, java.lang.Long.valueOf(c4564xe93729bb.f19381xaf41fa53));
                            yw0Var.set(1, java.lang.Boolean.valueOf(c4564xe93729bb.f19380xc99561f8));
                            yw0Var.set(2, java.lang.Long.valueOf(c4564xe93729bb.f19378x88c3a0f3));
                            yw0Var.set(0, java.lang.Integer.valueOf(c4564xe93729bb.f19383xdc409942));
                            linkedList.add(yw0Var);
                        }
                    }
                    if (linkedList.size() > 1) {
                        kz5.g0.t(linkedList, new kw2.g0());
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(d0Var.f394435a);
                    sb6.append(' ');
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    for (r45.yw0 yw0Var2 : linkedList) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("proto:");
                        sb7.append(yw0Var2.m75939xb282bd08(0) == 1 ? "QUIC" : "TCP");
                        sb7.append(" succeed:");
                        sb7.append(yw0Var2.m75933x41a8a7f2(1));
                        sb7.append(" begin:");
                        sb7.append(yw0Var2.m75942xfb822ef2(2));
                        sb7.append(" cost:");
                        sb7.append(yw0Var2.m75942xfb822ef2(3));
                        arrayList.add(sb7.toString());
                    }
                    sb6.append(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "dumpCgiCostInfo " + sb6.toString());
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderVideoPlayReporter", d0Var.f394435a + " CGI.REC deserialize " + th6);
            }
        }
    }

    public void E(nk4.b data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.B = false;
            long j17 = d0Var.R;
            if (j17 > 0) {
                long j18 = data.f419598b - j17;
                d0Var.S += j18;
                r45.t23 t23Var = new r45.t23();
                t23Var.set(2, java.lang.Integer.valueOf((int) j18));
                t23Var.set(1, java.lang.Integer.valueOf((int) d0Var.f394465p));
                if (d0Var.f394468q0) {
                    t23Var.set(0, 1);
                } else if (d0Var.Q == 1 && d0Var.Z == 0) {
                    t23Var.set(0, 2);
                } else {
                    t23Var.set(0, 0);
                }
                d0Var.f394456k0.add(t23Var);
                d0Var.R = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onWaitingEnd", d0Var) + " totalWaitingTime:" + d0Var.S);
            }
        }
    }

    public final void F(kw2.d0 d0Var) {
        if (this.f394595g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", d0Var != null ? f("report17000", d0Var) : null);
            if (d0Var != null) {
                kw2.f0 f0Var = d0Var.W;
                kw2.e0 e0Var = d0Var.X;
                if (f0Var == null || e0Var == null) {
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f c7060x39f93c0f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f();
                long c17 = a06.d.c(((float) (d0Var.f394471s * cu2.x.c(cu2.x.f303982a, d0Var.f394443e, false, false, false, 14, null).f68989x78351860)) / 100.0f);
                c7060x39f93c0f.f143667d = c7060x39f93c0f.b("StoryId", pm0.v.u(d0Var.f394439c), true);
                c7060x39f93c0f.f143668e = this.f394589a.m75939xb282bd08(5) + 100;
                c7060x39f93c0f.f143669f = d0Var.f394485z;
                c7060x39f93c0f.f143670g = d0Var.f394459m == 0 ? 1L : 0L;
                c7060x39f93c0f.f143671h = d0Var.f394451i;
                c7060x39f93c0f.f143672i = a06.d.c(((float) (r11 * d0Var.f394463o)) / 100.0f);
                c7060x39f93c0f.f143673j = d0Var.f394434J;
                c7060x39f93c0f.f143674k = d0Var.f394477v;
                c7060x39f93c0f.f143675l = d0Var.Z;
                c7060x39f93c0f.f143677n = 0L;
                c7060x39f93c0f.f143678o = 0L;
                c7060x39f93c0f.f143679p = e0Var.f394515b;
                c7060x39f93c0f.f143680q = c7060x39f93c0f.b("ErrorDescription", "", true);
                c7060x39f93c0f.f143681r = d0Var.f394474t0;
                c7060x39f93c0f.f143682s = c7060x39f93c0f.b("VideoFormat", java.lang.String.valueOf(f0Var.f394543b), true);
                c7060x39f93c0f.Z = c7060x39f93c0f.b("VideoFlag", f0Var.f394544c, true);
                c7060x39f93c0f.f143683t = e0Var.f394516c;
                c7060x39f93c0f.f143684u = e0Var.f394517d;
                c7060x39f93c0f.f143685v = e0Var.f394519f;
                c7060x39f93c0f.f143686w = e0Var.f394518e;
                c7060x39f93c0f.f143687x = e0Var.f394515b;
                c7060x39f93c0f.f143688y = e0Var.f394520g;
                c7060x39f93c0f.f143689z = e0Var.f394521h;
                c7060x39f93c0f.A = e0Var.f394522i;
                c7060x39f93c0f.B = e0Var.f394523j;
                c7060x39f93c0f.C = e0Var.f394524k ? 1L : 0L;
                c7060x39f93c0f.D = e0Var.f394525l;
                c7060x39f93c0f.E = e0Var.f394526m;
                c7060x39f93c0f.F = e0Var.f394527n;
                c7060x39f93c0f.G = e0Var.f394528o;
                c7060x39f93c0f.H = e0Var.f394529p;
                c7060x39f93c0f.I = e0Var.f394530q ? 1L : 0L;
                c7060x39f93c0f.f143663J = e0Var.f394531r;
                c7060x39f93c0f.K = e0Var.f394532s;
                c7060x39f93c0f.L = e0Var.f394533t;
                c7060x39f93c0f.M = c7060x39f93c0f.b("Iplist", e0Var.f394534u, true);
                c7060x39f93c0f.N = c7060x39f93c0f.b("XClientIp", e0Var.f394535v, true);
                c7060x39f93c0f.O = e0Var.f394536w ? 1L : 0L;
                c7060x39f93c0f.P = f0Var.f394545d;
                c7060x39f93c0f.Q = 0L;
                c7060x39f93c0f.R = d0Var.f394483y;
                c7060x39f93c0f.S = d0Var.f394457l;
                c7060x39f93c0f.T = c17;
                c7060x39f93c0f.U = 0L;
                c7060x39f93c0f.V = e0Var.f394537x;
                c7060x39f93c0f.W = e0Var.f394538y;
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                c7060x39f93c0f.X = 101L;
                c7060x39f93c0f.Y = e0Var.C;
                int i17 = d0Var.Q;
                if (i17 == 0) {
                    c7060x39f93c0f.f143676m = 0L;
                } else {
                    c7060x39f93c0f.f143676m = d0Var.S / i17;
                }
                c7060x39f93c0f.k();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c7060x39f93c0f);
            }
        }
    }

    public final void G(kw2.d0 d0Var) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        int o17;
        int b17;
        jz5.f0 f0Var2;
        java.lang.String str3;
        r45.vf2 vf2Var;
        r45.vf2 vf2Var2;
        org.json.JSONObject e17;
        java.lang.String jSONObject;
        r45.vf2 vf2Var3;
        java.lang.String m75945x2fec8307;
        boolean E;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", d0Var != null ? f("report19059", d0Var) : null);
        if (d0Var != null) {
            if (d0Var.f394439c == 0) {
                nh.c cVar = this.f394600l;
                if (cVar != null) {
                    synchronized (cVar) {
                        synchronized (cVar) {
                            rh.c1 c1Var = cVar.f418603c;
                            E = c1Var != null ? c1Var.E() : false;
                        }
                        return;
                    }
                    if (E) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderVideoPlayReporter", "cancel powerProfiler, currentFeedId=" + d0Var.f394439c);
                        cVar.a();
                        cVar.b();
                    }
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6606x4dac1dde c6606x4dac1dde = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6606x4dac1dde();
            c6606x4dac1dde.f139561d = 0L;
            c6606x4dac1dde.U = this.f394589a.m75939xb282bd08(5);
            c6606x4dac1dde.f139565f = d0Var.f394451i;
            c6606x4dac1dde.f139567g = d0Var.f394461n;
            c6606x4dac1dde.f139569h = d0Var.f394469r;
            c6606x4dac1dde.f139571i = d0Var.f394471s;
            c6606x4dac1dde.f139573j = d0Var.f394453j;
            cu2.x xVar = cu2.x.f303982a;
            so2.i3 c17 = cu2.x.c(xVar, d0Var.f394443e, false, false, false, 14, null);
            c6606x4dac1dde.f139573j = c17.f68989x78351860;
            java.lang.String str4 = c17.f68992x4b6e88aa;
            if (str4 == null) {
                str4 = "";
            }
            c6606x4dac1dde.f139563e = c6606x4dac1dde.b("MediaId", str4, true);
            c6606x4dac1dde.G0 = d0Var.L0;
            c6606x4dac1dde.f139575k = d0Var.I;
            c6606x4dac1dde.f139577l = d0Var.f394463o;
            c6606x4dac1dde.f139579m = d0Var.f394473t;
            long j17 = d0Var.f394439c;
            c6606x4dac1dde.f139581n = d0Var.f394477v;
            c6606x4dac1dde.f139583o = d0Var.f394479w;
            c6606x4dac1dde.f139585p = d0Var.f394457l;
            c6606x4dac1dde.f139587q = c6606x4dac1dde.b("NetType", d0Var.f394481x, true);
            c6606x4dac1dde.f139589r = c6606x4dac1dde.b("SessionId", d0Var.f394437b, true);
            c6606x4dac1dde.f139591s = d0Var.f394459m;
            c6606x4dac1dde.f139593t = 0L;
            c6606x4dac1dde.f139595u = d0Var.f394475u;
            c6606x4dac1dde.f139597v = d0Var.f394485z;
            c6606x4dac1dde.f139599w = d0Var.A;
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            c6606x4dac1dde.f139601x = 101L;
            c6606x4dac1dde.f139603y = d0Var.C;
            c6606x4dac1dde.f139605z = d0Var.D;
            c6606x4dac1dde.A = d0Var.E;
            c6606x4dac1dde.B = d0Var.G;
            c6606x4dac1dde.C = d0Var.f394434J;
            c6606x4dac1dde.K(pm0.v.u(j17));
            c6606x4dac1dde.E = d0Var.Q;
            c6606x4dac1dde.F = d0Var.T;
            if (this.f394589a.m75933x41a8a7f2(13)) {
                c6606x4dac1dde.J(pm0.v.u(d0Var.f394439c));
            }
            kw2.e0 e0Var = d0Var.X;
            if (e0Var != null) {
                c6606x4dac1dde.I = e0Var.f394531r;
                c6606x4dac1dde.L = e0Var.f394532s;
                c6606x4dac1dde.X(e0Var.f394539z);
                c6606x4dac1dde.N = e0Var.A;
                c6606x4dac1dde.f139560c0 = e0Var.f394515b;
                c6606x4dac1dde.f139586p0 = e0Var.C;
                c6606x4dac1dde.a0(e0Var.D);
                c6606x4dac1dde.f139592s0 = c6606x4dac1dde.b("NetConnInfo", e0Var.E, true);
                c6606x4dac1dde.f139590r0 = e0Var.F;
                c6606x4dac1dde.f139598v0 = e0Var.G;
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                c6606x4dac1dde.f139592s0 = c6606x4dac1dde.b("NetConnInfo", r26.i0.t(cu2.x.c(xVar, d0Var.f394443e, false, false, false, 14, null).v0(), ",", ";", false), true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "netprofile query " + d0Var.f394443e + " = " + c6606x4dac1dde.f139592s0);
            }
            c6606x4dac1dde.f139564e0 = d0Var.S;
            c6606x4dac1dde.f139562d0 = d0Var.B0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "netprofile now " + d0Var.f394443e + " = " + c6606x4dac1dde.f139592s0);
            d0Var.f394464o0 = d0Var.f394460m0 != d0Var.f394462n0 ? 1 : 0;
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            int streamMaxVolume = ((android.media.AudioManager) systemService).getStreamMaxVolume(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((d0Var.f394460m0 * 100) / streamMaxVolume);
            sb6.append(';');
            sb6.append((d0Var.f394462n0 * 100) / streamMaxVolume);
            sb6.append(';');
            sb6.append(d0Var.f394464o0);
            c6606x4dac1dde.d0(sb6.toString());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            cw2.p4 p4Var = cw2.p4.f305444a;
            java.util.Iterator it = cw2.p4.f305445b.iterator();
            while (it.hasNext()) {
                r45.m11 m11Var = (r45.m11) it.next();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("pos", m11Var.m75939xb282bd08(12));
                    jSONObject2.put("spe", m11Var.m75939xb282bd08(9));
                    jSONObject2.put("loadCost", m11Var.m75939xb282bd08(13));
                    jSONObject2.put("fSize", m11Var.m75939xb282bd08(5));
                    jSONArray.put(jSONObject2);
                } catch (java.lang.Exception unused) {
                }
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            c6606x4dac1dde.H(r26.i0.t(jSONArray2, ",", ";", false));
            c6606x4dac1dde.H = d0Var.V;
            c6606x4dac1dde.f139557J = d0Var.f394483y;
            c6606x4dac1dde.K = d0Var.Z;
            c6606x4dac1dde.R = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Ni() ? 1L : 0L;
            c6606x4dac1dde.V = d0Var.f394466p0;
            c6606x4dac1dde.W = d0Var.f394470r0;
            if (android.text.TextUtils.isEmpty(d0Var.f394480w0) || android.text.TextUtils.equals(d0Var.f394480w0, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
                int i17 = cu2.x.c(cu2.x.f303982a, d0Var.f394443e, false, false, false, 14, null).f68995x3b89adfb;
                d0Var.f394480w0 = i17 != 26 ? i17 != 172 ? i17 != 193 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "H266" : "H265" : "H264";
            }
            if (d0Var.f394474t0 == 0) {
                so2.i3 c18 = cu2.x.c(cu2.x.f303982a, d0Var.f394443e, false, false, false, 14, null);
                d0Var.f394474t0 = c18.f68994xfd4dbd97;
                d0Var.f394476u0 = c18.f68967xa78549dc;
                d0Var.f394484y0 = c18.f68978xbb1b16e8;
            }
            c6606x4dac1dde.P(d0Var.f394480w0 + ';' + d0Var.f394474t0 + ';' + d0Var.f394472s0 + ';' + d0Var.f394476u0 + ';' + d0Var.f394484y0 + ';' + d0Var.f394486z0 + ';' + d0Var.A0 + ';');
            java.lang.String m75945x2fec83072 = this.f394589a.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6606x4dac1dde.z(m75945x2fec83072);
            java.lang.String m75945x2fec83073 = this.f394589a.m75945x2fec8307(2);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            c6606x4dac1dde.x(m75945x2fec83073);
            c6606x4dac1dde.f139558a0 = c6606x4dac1dde.b("SessionBuffer", !this.f394589a.m75933x41a8a7f2(13) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(d0Var.f394439c, d0Var.f394441d, this.f394589a.m75939xb282bd08(5)) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(d0Var.f394439c, d0Var.f394441d, this.f394589a.m75939xb282bd08(5)), true);
            c6606x4dac1dde.b0(((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M2().c()).intValue());
            c6606x4dac1dde.T(java.lang.String.valueOf(d0Var.I()));
            c6606x4dac1dde.Z(d0Var.G());
            c6606x4dac1dde.N(d0Var.s());
            c6606x4dac1dde.O(d0Var.y());
            c6606x4dac1dde.L(d0Var.r());
            c6606x4dac1dde.F(d0Var.k());
            c6606x4dac1dde.c0((int) (d0Var.R() * d0Var.P()));
            c6606x4dac1dde.A(this.f394591c);
            c6606x4dac1dde.I(this.f394589a.m75945x2fec8307(16));
            i95.m c19 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.hk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c19, d0Var.d(), d0Var.c(), this.f394589a.m75939xb282bd08(5), null, 8, null);
            r45.fl2 a17 = hk6 != null ? hk6.a() : null;
            c6606x4dac1dde.y((a17 == null || (m75945x2fec8307 = a17.m75945x2fec8307(5)) == null) ? "" : r26.i0.v(m75945x2fec8307, ",", ";", false, 4, null));
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b, java.lang.Float.valueOf(d0Var.R()));
            jSONObject3.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122, java.lang.Float.valueOf(d0Var.P()));
            jSONObject3.put("screenWidth", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.b().getResources().getDisplayMetrics().widthPixels);
            jSONObject3.put("screenHeight", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.b().getResources().getDisplayMetrics().heightPixels);
            yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            jSONObject3.put("isMultiBitRate", ek6.v());
            jSONObject3.put("isSecondPre", ek6.w());
            jSONObject3.put("playLinkCnt", ek6.o());
            jSONObject3.put("preLinkCnt", ek6.p());
            jSONObject3.put("startPrePercent", ek6.s());
            jSONObject3.put("startPreSec", ek6.t());
            jSONObject3.put("preTaskCnt", ek6.l());
            jSONObject3.put("maxPrePercent", ek6.k());
            jSONObject3.put("maxPreBytes", ek6.j());
            jSONObject3.put("prevCnt", ek6.q());
            jSONObject3.put("nextCnt", ek6.n());
            jSONObject3.put("maxPreBitRate", ek6.i());
            jz5.o oVar = (jz5.o) ek6.g().get(d0Var.f());
            if (oVar == null || (str = (java.lang.String) oVar.e()) == null) {
                str = "";
            }
            jSONObject3.put("findSpecStep", str);
            jz5.o oVar2 = (jz5.o) ek6.g().get(d0Var.f());
            if (oVar2 == null || (vf2Var3 = (r45.vf2) oVar2.d()) == null || (str2 = vf2Var3.m75945x2fec8307(19)) == null) {
                str2 = "";
            }
            jSONObject3.put("transEnhanceInfo", str2);
            jSONObject3.put("hitPreloadBitrate", d0Var.l());
            jSONObject3.put("playDecoderType", d0Var.v());
            jSONObject3.put("fvfrd", d0Var.j());
            jSONObject3.put("mpnn", d0Var.g());
            jSONObject3.put("mpdp", d0Var.e());
            jSONObject3.put("outToMiniView", d0Var.p());
            jSONObject3.put("inFromMiniView", d0Var.n());
            so2.i3 c27 = cu2.x.c(cu2.x.f303982a, d0Var.f(), false, false, false, 14, null);
            if (d0Var.J() > 0) {
                o17 = c27.f68970xa7075739 * 1000;
                b17 = o17;
            } else {
                nk4.a i18 = d0Var.i();
                long min = java.lang.Math.min(java.lang.Long.max(i18 != null ? i18.c() : 0L, c27.t0()), c27.z0());
                o17 = min >= c27.z0() ? c27.f68970xa7075739 * 1000 : min <= d0Var.o() ? 0 : (int) (c27.f68970xa7075739 * 1000 * (((float) (min - d0Var.o())) / ((float) (c27.z0() - d0Var.o()))));
                nk4.a i19 = d0Var.i();
                int d17 = i19 != null ? (int) i19.d() : 0;
                java.lang.Long l17 = (java.lang.Long) kz5.n0.m0(d0Var.z());
                b17 = e06.p.b(d17, (l17 != null ? (int) l17.longValue() : 0) * 1000);
            }
            float f17 = 1000;
            float min2 = java.lang.Math.min(o17, c27.f68970xa7075739 * 1000) / f17;
            float min3 = java.lang.Math.min(b17, java.lang.Math.min(o17, c27.f68970xa7075739 * 1000)) / f17;
            jSONObject3.put("playablePos", java.lang.Float.valueOf(min2));
            jSONObject3.put("maxPlayBufferPos", java.lang.Float.valueOf(min3));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("maxProgressMs", d0Var) + " playablePosSec：" + min2 + " playablePosSec:" + min3);
            jSONObject3.put("enhanceStrategy", c27.f68973xffefc);
            jSONObject3.put("enhanceGPUScore", c27.f68972x7ed828cf);
            jSONObject3.put("enhanceStrength", c27.f68974x45abca);
            cu2.t tVar = cu2.u.f303974a;
            java.lang.String str6 = (java.lang.String) tVar.i().get(java.lang.Long.valueOf(d0Var.d()));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, (java.lang.String) tVar.g().get(java.lang.Long.valueOf(d0Var.d())))) {
                jSONObject3.put("sspec", 0);
            } else {
                jSONObject3.put("sspec", 1);
            }
            jSONObject3.put(ya.b.f77502x92235c1b, str6);
            nk4.a i27 = d0Var.i();
            if (i27 != null) {
                i27.j(jSONObject3);
            }
            jSONObject3.put("hitPreloadSizeReal", d0Var.m());
            jSONObject3.put("playerPrepareActionMs", d0Var.H());
            jSONObject3.put("downloaderStartActionMs", d0Var.h());
            jSONObject3.put("seekBeforeFirstFrame", d0Var.L());
            jSONObject3.put("pauseBeforeFirstFrame", d0Var.q());
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            c6606x4dac1dde.Q(r26.i0.v(jSONObject4, ",", ";", false, 4, null));
            nk4.a i28 = d0Var.i();
            c6606x4dac1dde.V(i28 != null ? i28.f() : null);
            nk4.a i29 = d0Var.i();
            c6606x4dac1dde.W(i29 != null ? i29.f() : null);
            c6606x4dac1dde.C(l());
            java.lang.String m75945x2fec83074 = this.f394589a.m75945x2fec8307(12);
            c6606x4dac1dde.B(m75945x2fec83074 != null ? r26.i0.v(m75945x2fec83074, ",", ";", false, 4, null) : "");
            d0Var.T(d0Var.N0 ? d0Var.O : java.lang.Long.max(d0Var.N, d0Var.M));
            c6606x4dac1dde.Y(d0Var.N());
            try {
                nk4.a i37 = d0Var.i();
                c6606x4dac1dde.D((i37 == null || (e17 = i37.e()) == null || (jSONObject = e17.toString()) == null) ? "" : r26.i0.v(jSONObject, ",", ";", false, 4, null));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderVideoPlayReporter", "firstFrameDetail error", e18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).dk(d0Var.d());
            if (dk6 != null) {
                c6606x4dac1dde.P = c6606x4dac1dde.b("Username", dk6.m59299x6bf53a6c(), true);
                f0Var2 = jz5.f0.f384359a;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                c6606x4dac1dde.P = c6606x4dac1dde.b("Username", "", true);
            }
            yr2.k ek7 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("limit", ek7.m() * 1000);
            kw2.b0 g17 = g(d0Var.a());
            jSONObject5.put("min", g17.c());
            jSONObject5.put("max", g17.b());
            jSONObject5.put("avg", java.lang.Float.valueOf(g17.a()));
            jSONObject5.put("cov", java.lang.Float.valueOf(g17.d()));
            long j18 = 1000;
            kw2.c0 j19 = j(d0Var.a(), ek7.d() * j18, ek7.e() * j18, ek7.f() * j18);
            jSONObject5.put("l1", j19.d());
            jSONObject5.put("l2", j19.b());
            jSONObject5.put("l3", j19.c());
            jSONObject5.put("l4", j19.a());
            java.lang.String jSONObject6 = jSONObject5.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
            c6606x4dac1dde.M(r26.i0.v(jSONObject6, ",", ";", false, 4, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "buffering_health " + c6606x4dac1dde.t() + " [0~" + ek7.d() + "] [" + ek7.d() + '~' + ek7.e() + "] [" + ek7.e() + '~' + ek7.f() + "] [" + ek7.f() + "~]");
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            for (r45.t23 t23Var : d0Var.S()) {
                try {
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    jSONObject7.put("waitMs", t23Var.m75939xb282bd08(2));
                    jSONObject7.put("percent", t23Var.m75939xb282bd08(1));
                    jSONObject7.put("type", t23Var.m75939xb282bd08(0));
                    jSONArray3.put(jSONObject7);
                } catch (java.lang.Exception unused2) {
                }
            }
            java.lang.String jSONArray4 = jSONArray3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray4, "toString(...)");
            c6606x4dac1dde.e0(r26.i0.v(jSONArray4, ",", ";", false, 4, null));
            java.lang.String str7 = "";
            java.util.Iterator it6 = d0Var.z().iterator();
            while (it6.hasNext()) {
                str7 = str7 + ((java.lang.Number) it6.next()).longValue() + ';';
            }
            c6606x4dac1dde.E((java.lang.String) cu2.u.f303974a.g().get(java.lang.Long.valueOf(d0Var.d())));
            c6606x4dac1dde.S(str7);
            c6606x4dac1dde.G(((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).Ai());
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            jSONObject8.put("playDecodingFps", java.lang.Float.valueOf(d0Var.w()));
            jSONObject8.put("playRenderingFps", java.lang.Float.valueOf(d0Var.D()));
            jSONObject8.put("playDecodeStuckCount", d0Var.t());
            jSONObject8.put("playRenderStuckCount", d0Var.B());
            jSONObject8.put("playDecodeStuckRatio", java.lang.Float.valueOf(d0Var.u()));
            jSONObject8.put("playRenderStuckRatio", java.lang.Float.valueOf(d0Var.C()));
            jSONObject8.put("playDecodingFrames", d0Var.x());
            jSONObject8.put("playRenderingFrames", d0Var.E());
            java.lang.String jSONObject9 = jSONObject8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject9, "toString(...)");
            c6606x4dac1dde.R(r26.i0.v(jSONObject9, ",", ";", false, 4, null));
            c6606x4dac1dde.D0 = c6606x4dac1dde.b("ampInfo", "", true);
            jz5.o oVar3 = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().g().get(d0Var.f());
            d0Var.U((oVar3 == null || (vf2Var2 = (r45.vf2) oVar3.d()) == null) ? -1 : vf2Var2.m75939xb282bd08(10));
            c6606x4dac1dde.U(d0Var.Q());
            c6606x4dac1dde.w(r26.i0.v(d0Var.b(), ",", ";", false, 4, null));
            c6606x4dac1dde.f139558a0 = c6606x4dac1dde.b("SessionBuffer", "", true);
            ni3.a1 a1Var = this.f394598j;
            if (a1Var != null) {
                a1Var.g(d0Var);
            }
            J(d0Var.d(), c6606x4dac1dde);
            c6606x4dac1dde.l();
            I(c6606x4dac1dde, d0Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6606x4dac1dde);
            H(d0Var);
            kw2.e0 K = d0Var.K();
            if (K != null) {
                r45.m11 m11Var2 = new r45.m11();
                m11Var2.set(0, java.lang.Long.valueOf(d0Var.d()));
                m11Var2.set(1, 0);
                m11Var2.set(9, java.lang.Integer.valueOf((int) c6606x4dac1dde.u()));
                m11Var2.set(13, java.lang.Integer.valueOf((int) c6606x4dac1dde.r()));
                m11Var2.set(5, java.lang.Integer.valueOf((int) c6606x4dac1dde.q()));
                m11Var2.set(3, java.lang.Integer.valueOf(a06.d.b(((float) (c6606x4dac1dde.q() * c6606x4dac1dde.s())) / 100.0f)));
                m11Var2.set(4, java.lang.Integer.valueOf(a06.d.b(((float) (c6606x4dac1dde.p() * c6606x4dac1dde.q())) / 100.0f)));
                m11Var2.set(2, java.lang.Integer.valueOf(this.f394589a.m75939xb282bd08(5)));
                m11Var2.set(6, java.lang.Integer.valueOf((int) d0Var.O()));
                m11Var2.set(12, java.lang.Integer.valueOf((int) c6606x4dac1dde.v()));
                m11Var2.set(11, java.lang.Integer.valueOf(c01.id.e()));
                m11Var2.set(7, java.lang.Integer.valueOf((int) d0Var.F()));
                m11Var2.set(8, java.lang.Integer.valueOf((int) d0Var.M()));
                m11Var2.set(10, d0Var.S());
                m11Var2.set(20, d0Var.y());
                m11Var2.set(16, java.lang.Integer.valueOf(K.a()));
                m11Var2.set(18, K.h());
                m11Var2.set(19, java.lang.Integer.valueOf(K.i()));
                m11Var2.set(17, java.lang.Integer.valueOf(K.d()));
                m11Var2.set(15, java.lang.Long.valueOf(d0Var.I()));
                m11Var2.set(21, java.lang.Long.valueOf(this.f394589a.m75933x41a8a7f2(13) ? d0Var.d() : 0L));
                m11Var2.set(22, java.lang.Integer.valueOf(d0Var.J()));
                r45.sf0 sf0Var = new r45.sf0();
                sf0Var.set(0, java.lang.Long.valueOf(K.f()));
                sf0Var.set(2, java.lang.Long.valueOf(K.g()));
                sf0Var.set(3, java.lang.Long.valueOf(K.c()));
                sf0Var.set(7, K.h());
                sf0Var.set(5, K.b());
                sf0Var.set(4, java.lang.Integer.valueOf(K.d()));
                sf0Var.set(6, 0);
                sf0Var.set(1, java.lang.Long.valueOf(K.e()));
                m11Var2.set(23, sf0Var);
                yr2.k ek8 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
                jz5.o oVar4 = (jz5.o) ek8.g().get(d0Var.f());
                m11Var2.set(24, java.lang.Integer.valueOf(oVar4 != null ? (int) ((java.lang.Number) oVar4.f()).longValue() : 0));
                jz5.o oVar5 = (jz5.o) ek8.g().get(d0Var.f());
                if (oVar5 == null || (vf2Var = (r45.vf2) oVar5.d()) == null || (str3 = vf2Var.m75945x2fec8307(0)) == null) {
                    str3 = "";
                }
                m11Var2.set(25, str3);
                m11Var2.set(26, java.lang.Long.valueOf(d0Var.O() * j18));
                m11Var2.set(27, java.lang.Integer.valueOf(d0Var.A()));
                m11Var2.set(28, java.lang.Long.valueOf(K.f()));
                m11Var2.set(30, java.lang.Integer.valueOf((int) d0Var.w()));
                m11Var2.set(31, java.lang.Integer.valueOf((int) d0Var.D()));
                cw2.p4 p4Var2 = cw2.p4.f305444a;
                p4Var2.b(m11Var2, ((c61.l7) i95.n0.c(c61.l7.class)).ek().h());
                p4Var2.c(m11Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "downloadInfoList " + p4Var2.i().size());
            }
        }
    }

    public final void H(kw2.d0 d0Var) {
        if (d0Var.P > 1000 || d0Var.Z > 0 || d0Var.f394436a0 > 0) {
            r45.qt2 contextObj = this.f394589a;
            this.f394594f.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6605xef403e08 c6605xef403e08 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6605xef403e08();
            c6605xef403e08.f139544d = c6605xef403e08.b("FeedId", pm0.v.u(d0Var.f394439c), true);
            c6605xef403e08.f139545e = contextObj.m75939xb282bd08(5);
            c6605xef403e08.f139546f = d0Var.f394459m;
            c6605xef403e08.f139547g = d0Var.f394465p / 1000;
            c6605xef403e08.f139548h = d0Var.f394471s;
            c6605xef403e08.f139549i = c6605xef403e08.b("SvrBypass", d0Var.M0, true);
            c6605xef403e08.f139550j = d0Var.P;
            c6605xef403e08.f139551k = (int) d0Var.Z;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (r45.t23 t23Var : d0Var.f394456k0) {
                if (t23Var.m75939xb282bd08(0) == 1) {
                    c6605xef403e08.f139553m++;
                    c6605xef403e08.f139554n += t23Var.m75939xb282bd08(2);
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("waitMs", t23Var.m75939xb282bd08(2));
                    jSONObject.put("percent", t23Var.m75939xb282bd08(1));
                    jSONObject.put("type", t23Var.m75939xb282bd08(0));
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception unused) {
                }
            }
            c6605xef403e08.f139552l = java.lang.Math.max(0L, d0Var.S - c6605xef403e08.f139554n);
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            c6605xef403e08.f139555o = c6605xef403e08.b("waittingDetail", r26.i0.t(jSONArray2, ",", ";", false), true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPlayLoading", "report waitingCountInSeeking:" + d0Var.f394436a0 + ' ' + c6605xef403e08.n());
            c6605xef403e08.l();
        }
    }

    public final void I(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6606x4dac1dde c6606x4dac1dde, kw2.d0 d0Var) {
        if (this.f394596h) {
            java.util.ArrayList arrayList = new java.util.ArrayList(8);
            long j17 = c6606x4dac1dde.K;
            int i17 = this.f394599k;
            if (j17 > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(i17);
                c4582x424c344.m40331x936762bd(0);
                c4582x424c344.m40332x57b2b64f(c6606x4dac1dde.K);
                arrayList.add(c4582x424c344);
            }
            if (c6606x4dac1dde.f139597v > 0 && c6606x4dac1dde.K > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(i17);
                c4582x424c3442.m40331x936762bd(1);
                c4582x424c3442.m40332x57b2b64f(c6606x4dac1dde.K);
                arrayList.add(c4582x424c3442);
            }
            if (c6606x4dac1dde.f139597v > 0 && c6606x4dac1dde.f139569h > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3443.m40330x4c144dd(i17);
                c4582x424c3443.m40331x936762bd(2);
                c4582x424c3443.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3443);
            }
            if (c6606x4dac1dde.f139597v > 0 && c6606x4dac1dde.C > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3444.m40330x4c144dd(i17);
                c4582x424c3444.m40331x936762bd(3);
                c4582x424c3444.m40332x57b2b64f(c6606x4dac1dde.C);
                arrayList.add(c4582x424c3444);
                long j18 = c6606x4dac1dde.C;
                if (j18 <= 500) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3445.m40330x4c144dd(i17);
                    c4582x424c3445.m40331x936762bd(5);
                    c4582x424c3445.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3445);
                } else if (j18 <= 1000) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3446.m40330x4c144dd(i17);
                    c4582x424c3446.m40331x936762bd(6);
                    c4582x424c3446.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3446);
                } else if (j18 > 1000) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3447 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3447.m40330x4c144dd(i17);
                    c4582x424c3447.m40331x936762bd(7);
                    c4582x424c3447.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3447);
                }
            }
            if (c6606x4dac1dde.f139597v > 0 && c6606x4dac1dde.f139564e0 > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3448 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3448.m40330x4c144dd(i17);
                c4582x424c3448.m40331x936762bd(4);
                c4582x424c3448.m40332x57b2b64f(c6606x4dac1dde.f139564e0);
                arrayList.add(c4582x424c3448);
            }
            if (c6606x4dac1dde.R == 1) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3449 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3449.m40330x4c144dd(i17);
                c4582x424c3449.m40332x57b2b64f(1L);
                int i18 = d0Var.U;
                if (i18 == 102) {
                    c4582x424c3449.m40331x936762bd(104);
                    arrayList.add(c4582x424c3449);
                } else if (i18 == 101) {
                    c4582x424c3449.m40331x936762bd(105);
                    arrayList.add(c4582x424c3449);
                }
            }
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34410 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c34410.m40330x4c144dd(i17);
            c4582x424c34410.m40331x936762bd(100);
            c4582x424c34410.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c34410);
            if (c6606x4dac1dde.f139597v > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34411 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c34411.m40330x4c144dd(i17);
                c4582x424c34411.m40331x936762bd(101);
                c4582x424c34411.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c34411);
            }
            if (c6606x4dac1dde.f139597v > 0 && c6606x4dac1dde.C > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34412 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c34412.m40330x4c144dd(i17);
                c4582x424c34412.m40331x936762bd(102);
                c4582x424c34412.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c34412);
            }
            if (c6606x4dac1dde.f139597v > 0 && c6606x4dac1dde.f139564e0 > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34413 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c34413.m40330x4c144dd(i17);
                c4582x424c34413.m40331x936762bd(103);
                c4582x424c34413.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c34413);
            }
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
            }
        }
    }

    public final void J(long j17, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6606x4dac1dde c6606x4dac1dde) {
        boolean E;
        qh.b bVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateApmInfoOnStop, currProfiler=");
        nh.c cVar = this.f394600l;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", sb6.toString());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 c0Var = or2.j.f429191c;
            or2.h hVar = (or2.h) c0Var.b(java.lang.Long.valueOf(j17));
            if (hVar != null) {
                jSONObject.put("feed_id", pm0.v.u(j17));
                jSONObject.put("jank", hVar.f());
                jSONObject.put("big_jank", hVar.c());
                jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, hVar.e());
                jSONObject.put("display_fps", hVar.f429162b);
                jSONObject.put(ya.b.f77498x4b14672, 0);
                jSONObject.put("duration_ms", hVar.d());
            }
            c0Var.e(java.lang.Long.valueOf(j17));
            nh.c cVar2 = this.f394600l;
            if (cVar2 != null) {
                synchronized (cVar2) {
                    try {
                        synchronized (cVar2) {
                            rh.c1 c1Var = cVar2.f418603c;
                            E = c1Var != null ? c1Var.E() : false;
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                if (E) {
                    rh.c1 c17 = cVar2.c();
                    if (c17 != null && (bVar = c17.f476863l) != null) {
                        long j18 = bVar.f444854n;
                        int i17 = bVar.f444845e;
                        if (ph.t.f435816k == null) {
                            synchronized ("Matrix.battery.LifeCycle") {
                                if (ph.t.f435816k == null) {
                                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                                }
                            }
                        }
                        ph.t tVar = ph.t.f435816k;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
                        boolean c18 = tVar.c().c();
                        int s17 = c17.s();
                        int A = c17.A();
                        rh.b3 B = c17.B(oh.f.class);
                        float e17 = B != null ? ri.b0.e((float) B.f476849h, 2) : 0.0f;
                        jSONObject.put("duringMillis", j18);
                        jSONObject.put("devChargingRate", i17);
                        jSONObject.put("powerSaveMode", c18 ? 1 : 0);
                        jSONObject.put("cpuLoad", s17);
                        jSONObject.put("cpuLoadNor", A);
                        jSONObject.put("gpuLoad", java.lang.Float.valueOf(e17));
                        c17.C(rh.t1.class, new kw2.h0(this, jSONObject));
                        c17.C(rh.c2.class, new kw2.i0(this, jSONObject));
                        c17.C(gi.l.class, new kw2.j0(this, jSONObject));
                        c17.u(oh.b.class, new kw2.k0(jSONObject));
                        rh.b3 B2 = c17.B(oh.c.class);
                        if (B2 != null) {
                            float e18 = e(this, B2.f476849h);
                            float e19 = e(this, B2.f476847f);
                            float e27 = e(this, B2.f476848g);
                            jSONObject.put("batteryVoltageAvg", java.lang.Float.valueOf(e18));
                            jSONObject.put("batteryVoltageMax", java.lang.Float.valueOf(e19));
                            jSONObject.put("batteryVoltageMin", java.lang.Float.valueOf(e27));
                        }
                        rh.b3 B3 = c17.B(rh.r1.class);
                        if (B3 != null) {
                            float e28 = e(this, B3.f476849h);
                            float e29 = e(this, B3.f476847f);
                            float e37 = e(this, B3.f476848g);
                            jSONObject.put("batteryCurrentAvg", java.lang.Float.valueOf(e28));
                            jSONObject.put("batteryCurrentMax", java.lang.Float.valueOf(e29));
                            jSONObject.put("batteryCurrentMin", java.lang.Float.valueOf(e37));
                        }
                        c17.u(uh.g.class, new kw2.l0(this, jSONObject));
                        cw2.p4 p4Var = cw2.p4.f305444a;
                        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                        jSONObject.put("lowPowerMode", ((android.os.PowerManager) systemService).isPowerSaveMode() ? 1 : 0);
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        jSONObject.put("thermalState", wh.m.l(context));
                        jSONObject.put("batteryChargeInfo", p4Var.f());
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        jSONObject.put("batteryInfo", wh.m.i(context2));
                        jSONObject.put("cpuUsage", 0);
                        jSONObject.put("deviceCpuUsage", p4Var.g());
                    }
                    cVar2.b();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderVideoPlayReporter", "no yet started, skip it");
                }
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6606x4dac1dde.D0 = c6606x4dac1dde.b("ampInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderVideoPlayReporter", "updateApmInfoOnStop " + th7);
        }
    }

    public void K(int i17, java.lang.String contextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        this.f394589a.set(1, contextId);
        this.f394589a.set(5, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "updateReportContext " + i17 + ' ' + contextId);
    }

    @Override // nk4.s
    public void a(nk4.b data, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.Y = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onDownloadStart", d0Var));
        }
    }

    @Override // nk4.s
    public void b(nk4.i data, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "onDownloadStop");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f394592d;
        long j17 = data.f419597a;
        kw2.d0 d0Var = (kw2.d0) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        dn.h hVar = data.f419622e;
        dn.o oVar = data.f419621d;
        if (d0Var != null && d0Var.Y) {
            if (oVar != null && d0Var.W == null) {
                d0Var.W = i(oVar);
            }
            if (hVar != null && d0Var.X == null) {
                d0Var.X = h(hVar);
            }
            d0Var.Y = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onDownloadStop", d0Var));
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f394590b;
        java.util.ArrayList<kw2.d0> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : concurrentLinkedDeque) {
            if (((kw2.d0) obj).f394439c == j17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kw2.d0> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (kw2.d0 d0Var2 : arrayList) {
            if (oVar != null && d0Var2.W == null) {
                d0Var2.W = i(oVar);
            }
            if (hVar != null && d0Var2.X == null) {
                d0Var2.X = h(hVar);
            }
            arrayList2.add(d0Var2);
        }
        concurrentLinkedDeque.removeAll(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "lazyReportDataList " + concurrentLinkedDeque.size() + " reportList " + arrayList2.size());
        for (kw2.d0 d0Var3 : arrayList2) {
            G(d0Var3);
            F(d0Var3);
        }
    }

    public final java.lang.String f(java.lang.String str, kw2.d0 d0Var) {
        return d0Var.f394435a + ' ' + str + " position:" + d0Var.f394459m + " bgPreparedStatus:" + d0Var.C0;
    }

    public final kw2.b0 g(java.util.List list) {
        if (list.isEmpty()) {
            return new kw2.b0(0L, 0L, 0.0f, 0.0f);
        }
        java.lang.Long l17 = (java.lang.Long) kz5.n0.o0(list);
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Long l18 = (java.lang.Long) kz5.n0.m0(list);
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        float J0 = ((float) kz5.n0.J0(list)) / list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf((float) java.lang.Math.pow(((float) ((java.lang.Number) it.next()).longValue()) - J0, 2)));
        }
        return new kw2.b0(longValue, longValue2, J0, list.size() > 1 ? kz5.n0.H0(arrayList) / (list.size() - 1) : 0.0f);
    }

    public final kw2.e0 h(dn.h hVar) {
        java.lang.String str = hVar.f323299a;
        if (str == null) {
            str = "";
        }
        kw2.e0 e0Var = new kw2.e0(str);
        e0Var.f394515b = hVar.f69553xb5f54fe9;
        e0Var.f394516c = hVar.f69523x17c343e7;
        e0Var.f394517d = hVar.f69548xe026fea1;
        e0Var.f394518e = hVar.f69520x14c61803;
        e0Var.f394519f = hVar.f69559x1bb3b54a;
        e0Var.f394520g = hVar.f69519x314c8910;
        e0Var.f394521h = hVar.f69541xda6d4445;
        e0Var.f394522i = hVar.f69539xc7fbc1b;
        e0Var.f394523j = hVar.f69542xc86ec4f;
        e0Var.f394524k = hVar.f69538xa9f16abd;
        e0Var.f394525l = hVar.f69540xb5d620d0;
        e0Var.f394526m = hVar.f69527x5e24f3ac;
        e0Var.f394527n = hVar.f69529x3bf012d1;
        e0Var.f394528o = hVar.f69531x3bf74305;
        e0Var.f394529p = hVar.f69530xf4dab7ad;
        e0Var.f394530q = hVar.f69528x97d8d5c7;
        e0Var.f394531r = hVar.f69508x556c2b4f;
        e0Var.f394532s = hVar.f69505x1282dcdf;
        e0Var.f394533t = hVar.f69545x96fadd74;
        java.lang.String a17 = hVar.a();
        if (a17 != null) {
            e0Var.f394534u = a17;
        }
        java.lang.String str2 = hVar.f69512x53e83fd7;
        if (str2 != null) {
            e0Var.f394535v = str2;
        }
        e0Var.f394536w = hVar.f69534x86d8cec;
        e0Var.f394537x = hVar.f323308j;
        e0Var.f394538y = hVar.f323309k;
        java.lang.String str3 = hVar.f323302d;
        if (str3 != null) {
            e0Var.f394539z = str3;
        }
        e0Var.A = hVar.f323303e;
        e0Var.B = hVar.f323304f;
        e0Var.C = hVar.f323310l;
        java.lang.String field_videoCdnMsg = hVar.f69568x8db7f4aa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_videoCdnMsg, "field_videoCdnMsg");
        e0Var.D = field_videoCdnMsg;
        java.lang.String field_videoFlag = hVar.f69570xea0afd82;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_videoFlag, "field_videoFlag");
        java.lang.String profile = hVar.f323311m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(profile, "profile");
        e0Var.E = r26.i0.t(profile, ",", ";", false);
        e0Var.F = hVar.f69572xa89a7555;
        e0Var.G = hVar.f323308j;
        e0Var.H = hVar.f69547xcabbcef8;
        return e0Var;
    }

    public final kw2.f0 i(dn.o oVar) {
        java.lang.String str = oVar.f69601xaca5bdda;
        if (str == null) {
            str = "";
        }
        kw2.f0 f0Var = new kw2.f0(str);
        f0Var.f394543b = oVar.f69610x4f5245a8;
        java.lang.String videoFlag = oVar.X1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoFlag, "videoFlag");
        f0Var.f394544c = videoFlag;
        f0Var.f394545d = oVar.W1;
        return f0Var;
    }

    public final kw2.c0 j(java.util.List list, long j17, long j18, long j19) {
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            if (longValue < j17) {
                i17++;
            } else {
                if (j17 <= longValue && longValue < j18) {
                    i18++;
                } else {
                    if (j18 <= longValue && longValue < j19) {
                        i19++;
                    } else if (longValue >= j19) {
                        i27++;
                    }
                }
            }
        }
        return new kw2.c0(i17, i18, i19, i27);
    }

    public final void k(kw2.d0 d0Var) {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        d0Var.f394462n0 = ((android.media.AudioManager) systemService).getStreamVolume(3);
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
        java.lang.String str = d0Var.f394449h;
        ((be0.e) oVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 != null) {
            d0Var.f394474t0 = d17.f243916b;
            d0Var.f394476u0 = d17.f243921g;
        }
        if (d0Var.P == 0) {
            d0Var.P = d0Var.N0 ? d0Var.O : java.lang.Long.max(d0Var.N, d0Var.M);
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (d0Var.f394461n == 0) {
            d0Var.f394461n = uptimeMillis - d0Var.f394457l;
            long j17 = d0Var.F;
            if (j17 > 0) {
                d0Var.E += uptimeMillis - j17;
                d0Var.F = 0L;
            }
            long j18 = d0Var.H;
            if (j18 > 0) {
                d0Var.G += uptimeMillis - j18;
                d0Var.H = 0L;
            }
        }
        long j19 = d0Var.R;
        if (j19 > 0) {
            d0Var.S += uptimeMillis - j19;
            r45.t23 t23Var = new r45.t23();
            t23Var.set(2, java.lang.Integer.valueOf((int) (uptimeMillis - d0Var.R)));
            t23Var.set(1, java.lang.Integer.valueOf((int) d0Var.f394465p));
            t23Var.set(0, 0);
            d0Var.f394456k0.add(t23Var);
            d0Var.R = 0L;
        }
        if (d0Var.f394434J == 0 && d0Var.B && d0Var.f394463o < 5) {
            d0Var.C = 1;
        }
    }

    public final java.lang.String l() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String m75945x2fec8307 = this.f394589a.m75945x2fec8307(11);
            if (m75945x2fec8307 != null) {
                if (m75945x2fec8307.length() > 0) {
                    jSONObject = new org.json.JSONObject(m75945x2fec8307);
                }
            }
            try {
                if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206813r)) {
                    jSONObject.put("bell_info", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206813r);
                }
            } catch (java.lang.Exception unused) {
            }
            java.lang.Object obj = this.f394597i.get("kWCFinderLVPlayerImmersiveInfo");
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
            if (jSONObject.length() > 0) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return r26.i0.t(jSONObject2, ",", ";", false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "generateExtraInfo error " + e17);
        }
        return null;
    }

    public final java.lang.String m(java.lang.String str, kw2.d0 d0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kernelFirstFrameTimeInfo \n");
        sb6.append(str);
        sb6.append(" \n==> firstLoadTime:");
        sb6.append(d0Var.I);
        sb6.append(" firstFrameTime:");
        sb6.append(d0Var.f394434J);
        sb6.append(" \n==========\n==> max:");
        sb6.append(d0Var.N0 ? d0Var.O : java.lang.Long.max(d0Var.N, d0Var.M));
        sb6.append(" onStartTime:");
        sb6.append(d0Var.M);
        sb6.append(" userPrepared:");
        sb6.append(d0Var.L);
        sb6.append(" playerPrepared:");
        sb6.append(d0Var.K);
        sb6.append(" firstVideo:");
        sb6.append(d0Var.N);
        sb6.append(" firstAudio:");
        sb6.append(d0Var.O);
        return sb6.toString();
    }

    public void n(nk4.g data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.f394473t = data.f419598b - d0Var.f394457l;
            dn.h hVar = data.f419618d;
            if (hVar != null && d0Var.X == null) {
                d0Var.X = h(hVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onDownloadFinish", d0Var));
        }
    }

    public void o(nk4.h data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            long j17 = data.f419620e;
            int i17 = j17 != 0 ? (int) ((((float) data.f419619d) * 100.0f) / ((float) j17)) : 0;
            if (i17 > d0Var.f394475u) {
                d0Var.f394475u = i17;
            }
        }
    }

    public void p(nk4.j data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            if (d0Var.O == 0) {
                d0Var.O = data.f419598b - d0Var.f394457l;
            }
            long j17 = d0Var.O;
            long j18 = d0Var.E;
            if (j17 > j18) {
                d0Var.O = j17 - j18;
            }
            d0Var.N0 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onFirstAudioFrameRendered", d0Var) + " onFirstAudioFrameRendered:" + d0Var.O + ' ' + m("onFirstAudioFrameRendered", d0Var));
        }
    }

    public void q(nk4.k data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            if (d0Var.f394434J == 0) {
                long j17 = data.f419598b - d0Var.f394457l;
                d0Var.f394434J = j17;
                long j18 = d0Var.E;
                if (j17 > j18) {
                    d0Var.f394434J = j17 - j18;
                }
                if (j18 != 0) {
                    d0Var.V0 = 1;
                }
                long j19 = d0Var.f394434J;
                pw2.a aVar = this.f394593e;
                aVar.f440217d = j19;
                long j27 = aVar.f440215b + j19;
                aVar.f440215b = j27;
                int i17 = aVar.f440216c + 1;
                aVar.f440216c = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.f440214a, "count:" + aVar.f440216c + " current:" + aVar.f440217d + ",  average:" + ((((float) j27) * 1.0f) / i17));
            }
            long j28 = d0Var.I;
            long j29 = data.f419624e;
            if (j28 == 0) {
                d0Var.I = j29;
            }
            if (d0Var.K == 0) {
                d0Var.K = j29;
            }
            d0Var.U = data.f419623d;
            if (d0Var.f394434J > 1000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("firstFrameTimeCauseBuffering", d0Var) + " firstFrameTime:" + d0Var.f394434J + " firstLoadTime:" + d0Var.I + " playDecoderType=" + d0Var.U);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onFirstFrameUpdate", d0Var) + " firstFrameTime:" + d0Var.f394434J + " firstLoadTime:" + d0Var.I + " playDecoderType=" + d0Var.U + ' ' + m("onFirstFrameUpdate", d0Var));
        }
    }

    public void r(nk4.k data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            if (d0Var.N == 0) {
                long j17 = data.f419598b - d0Var.f394457l;
                d0Var.N = j17;
                long j18 = d0Var.E;
                if (j17 > j18) {
                    d0Var.N = j17 - j18;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onFirstVideoFrameRendered", d0Var) + " firstVideoFrameRendered:" + d0Var.N + ' ' + m("onFirstVideoFrameRendered", d0Var));
        }
    }

    public void s(nk4.l data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            if (d0Var.f394477v == 0) {
                d0Var.f394477v = (data.f419598b - d0Var.f394457l) - d0Var.E;
            }
            d0Var.f394479w = data.f419625d + data.f419626e;
            d0Var.B = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onMoovReady", d0Var) + " moovReadyTime:" + d0Var.f394477v);
        }
    }

    public void t(nk4.m data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            nk4.a aVar = data.f419627d;
            d0Var.I0 = aVar != null ? aVar.a() : null;
            d0Var.f394482x0 = false;
            long j17 = data.f419598b;
            d0Var.F = j17;
            long j18 = d0Var.H;
            if (j18 > 0) {
                d0Var.G += j17 - j18;
                d0Var.H = 0L;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onPause", d0Var) + " realPlayTime:" + d0Var.G);
        }
    }

    public void u(nk4.n data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.B0 = data.f419628d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onPlayError", d0Var) + " playerErrCode:" + d0Var.B0);
        }
    }

    public void v(nk4.r data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            java.util.HashSet hashSet = d0Var.f394458l0;
            long j17 = data.f419633d;
            hashSet.add(java.lang.Long.valueOf(j17));
            d0Var.f394465p = j17;
            d0Var.f394467q = java.lang.Long.max(d0Var.f394467q, j17);
            long j18 = data.f419634e;
            int i17 = j18 != 0 ? (int) ((((float) j17) * 100.0f) / ((float) j18)) : 0;
            if (i17 > d0Var.f394463o) {
                d0Var.f394463o = i17;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = d0Var.W0;
            if (!copyOnWriteArrayList.isEmpty() || j17 >= 1) {
                copyOnWriteArrayList.add(java.lang.Long.valueOf(data.f419635f));
            }
        }
    }

    public void w(nk4.p data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        nk4.t tVar = data.f419631d;
        this.f394591c = tVar != null ? tVar.f419637b : this.f394591c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "onPlayerConfig enableRendererSharpen:" + this.f394591c);
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.D0 = tVar != null ? tVar.f419636a : -1;
            d0Var.E0 = tVar != null ? tVar.f419638c : -1;
            d0Var.F0 = tVar != null ? tVar.f419639d : -1;
            java.lang.String str = tVar != null ? tVar.f419641f : null;
            if (str == null) {
                str = "0";
            }
            d0Var.G0 = str;
            d0Var.H0 = tVar != null ? tVar.f419640e : -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onPlayerConfig", d0Var) + " mediaCodecInitDuration " + d0Var.H0 + " enableMediaCodecReuse:" + d0Var.D0 + " mediaCodecReuseEnabled:" + d0Var.E0 + " mediaCodecReused:" + d0Var.F0 + " mediaCodecErrorCode:" + d0Var.G0);
        }
    }

    public void x(nk4.q data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            if (d0Var.L == 0) {
                long j17 = d0Var.f394457l;
                if (j17 != 0) {
                    d0Var.L = data.f419598b - j17;
                }
            }
            long j18 = d0Var.L;
            long j19 = d0Var.E;
            if (j18 > j19) {
                d0Var.L = j18 - j19;
            }
            if (d0Var.K == 0) {
                d0Var.K = data.f419632d;
            }
            so2.i3 c17 = cu2.x.c(cu2.x.f303982a, d0Var.f394443e, false, false, false, 14, null);
            int i17 = c17.f68995x3b89adfb;
            d0Var.f394480w0 = i17 != 26 ? i17 != 172 ? i17 != 193 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "H266" : "H265" : "H264";
            d0Var.f394474t0 = c17.f68994xfd4dbd97;
            d0Var.f394476u0 = c17.f68967xa78549dc;
            d0Var.f394484y0 = c17.f68978xbb1b16e8;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onPrepared", d0Var) + " playerPreparedTime:" + d0Var.L + ' ' + m("onPrepared", d0Var));
        }
    }

    public void y() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRelease(), size:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f394592d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", sb6.toString());
        java.util.Iterator it = this.f394592d.entrySet().iterator();
        while (it.hasNext()) {
            kw2.d0 d0Var = (kw2.d0) ((java.util.Map.Entry) it.next()).getValue();
            k(d0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", f("onRelease", d0Var) + " playTime:" + d0Var.f394461n + " pauseTotalTime:" + d0Var.E + " realPlayTime:" + d0Var.G + " playStatus:" + d0Var.C);
            G(d0Var);
            F(d0Var);
        }
        this.f394592d = new java.util.concurrent.ConcurrentHashMap();
    }

    public void z(nk4.b data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f394592d.get(java.lang.Long.valueOf(data.f419597a));
        if (d0Var != null) {
            d0Var.A++;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String m75945x2fec8307 = this.f394589a.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            hashMap.put("finder_tab_context_id", m75945x2fec8307);
            java.lang.String m75945x2fec83072 = this.f394589a.m75945x2fec8307(1);
            hashMap.put("finder_context_id", m75945x2fec83072 != null ? m75945x2fec83072 : "");
            hashMap.put("comment_scene", java.lang.Integer.valueOf(this.f394589a.m75939xb282bd08(5)));
            hashMap.put("feed_id", pm0.v.u(d0Var.f394439c));
            hashMap.put("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(d0Var.f394439c, d0Var.f394441d, this.f394589a.m75939xb282bd08(5)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("progress_completion", null, hashMap, 1, false);
        }
    }
}
