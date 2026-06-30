package kd2;

/* loaded from: classes10.dex */
public final class p1 extends kd2.q implements kd2.q1 {
    public static final kd2.o0 N = new kd2.o0(null);
    public static final jz5.g P = jz5.h.b(kd2.n0.f388310d);
    public static final jz5.g Q = jz5.h.a(jz5.i.f384362d, kd2.m0.f388307d);
    public static final gp1.z R = new kd2.l0();
    public kd2.s1 A;
    public kd2.d0 B;
    public kd2.q0 C;
    public java.lang.String D;
    public int E;
    public boolean G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea H;
    public kd2.q0 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f388319J;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14147x729f4630 L;
    public final os5.r M;

    /* renamed from: x, reason: collision with root package name */
    public kd2.q0 f388320x;

    /* renamed from: y, reason: collision with root package name */
    public cw2.da f388321y;

    /* renamed from: z, reason: collision with root package name */
    public vo2.d f388322z;
    public boolean F = true;
    public final jz5.g K = jz5.h.b(kd2.t0.f388365d);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1] */
    public p1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.L = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.V(0L, new kd2.h1(event, kd2.p1.this));
                return false;
            }
        };
        this.M = new kd2.i1(this);
    }

    public static /* synthetic */ void H0(kd2.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, long j17, float f17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = -1;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            f17 = 1.0f;
        }
        float f18 = f17;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z19 = z17;
        if ((i17 & 16) != 0) {
            z18 = true;
        }
        p1Var.G0(c15188xd8bd4bd, j18, f18, z19, z18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[LOOP:0: B:21:0x0073->B:29:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[EDGE_INSN: B:30:0x00a3->B:33:0x00a3 BREAK  A[LOOP:0: B:21:0x0073->B:29:0x009b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0445  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.tencent.mm.plugin.finder.viewmodel.component.ny] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [r45.qt2] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J0(kd2.p1 r19, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r20, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r21, int r22, boolean r23, long r24, boolean r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.J0(kd2.p1, androidx.appcompat.app.AppCompatActivity, androidx.recyclerview.widget.RecyclerView, int, boolean, long, boolean, int, java.lang.Object):void");
    }

    public static boolean T0(kd2.p1 p1Var, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae883;
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = true;
        }
        boolean K0 = p1Var.K0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "togglePlayer: isPlaying = " + K0 + ", forcePause = " + z17 + ", controlAudioFocus = " + z18 + ", controlBtnStatus = " + z19);
        if (K0) {
            cw2.da daVar = p1Var.f388321y;
            if (daVar != null) {
                daVar.mo58788x65825f6();
            }
            vo2.d dVar = p1Var.f388322z;
            if (dVar != null) {
                ((vo2.c) dVar).c();
            }
            kd2.s1 s1Var = p1Var.A;
            if (s1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) s1Var).mo58788x65825f6();
            }
            if (z19) {
                p1Var.k0().m58249xa2fbf520(false);
            }
            if (z18) {
                p1Var.e0();
            }
        } else if (!z17) {
            if (p1Var.f388321y == null && p1Var.f388322z == null && p1Var.A == null) {
                p1Var.k0().m58249xa2fbf520(false);
                db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.gva, 0).show();
            } else {
                kd2.q0 q0Var = p1Var.C;
                if (q0Var != null) {
                    q0Var.f388341i = false;
                }
                if ((q0Var == null || (c14989xf862ae883 = q0Var.f388339g) == null || c14989xf862ae883.getMediaType() != 9) ? false : true) {
                    kd2.q0 q0Var2 = p1Var.C;
                    if (!((q0Var2 == null || (c14989xf862ae882 = q0Var2.f388339g) == null || c14989xf862ae882.getLiveId() != 0) ? false : true)) {
                        kd2.q0 q0Var3 = p1Var.C;
                        if ((q0Var3 == null || (c14989xf862ae88 = q0Var3.f388339g) == null || c14989xf862ae88.getLiveStatus() != 2) ? false : true) {
                            db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cxa, 0).show();
                        }
                    }
                }
                if (z18) {
                    p1Var.u0(false);
                }
                f25.m0 m0Var = p1Var.f388323n;
                if (m0Var != null && ((g25.e) m0Var).f349513c) {
                    cw2.da daVar2 = p1Var.f388321y;
                    if (daVar2 != null) {
                        daVar2.mo56709x764d819b(false);
                    }
                    vo2.d dVar2 = p1Var.f388322z;
                    if (dVar2 != null && (c15188xd8bd4bd = ((vo2.c) dVar2).f520092b) != null) {
                        c15188xd8bd4bd.mo56709x764d819b(false);
                    }
                    kd2.s1 s1Var2 = p1Var.A;
                    if (s1Var2 != null) {
                        s1Var2.mo56709x764d819b(false);
                    }
                }
                cw2.da daVar3 = p1Var.f388321y;
                if (daVar3 != null) {
                    zy2.g5.u(daVar3, null, 1, null);
                }
                vo2.d dVar3 = p1Var.f388322z;
                if (dVar3 != null) {
                    ((vo2.c) dVar3).d();
                }
                kd2.s1 s1Var3 = p1Var.A;
                if (s1Var3 != null) {
                    zy2.g5.u(s1Var3, null, 1, null);
                }
                if (p1Var.f388321y != null) {
                    p1Var.k0().getClass();
                }
                if (z19) {
                    p1Var.k0().m58249xa2fbf520(true);
                }
            }
        }
        return K0;
    }

    public static /* synthetic */ java.lang.Object y0(kd2.p1 p1Var, boolean z17, boolean z18, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar, boolean z27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        boolean z28 = z17;
        boolean z29 = (i17 & 2) != 0 ? false : z18;
        boolean z37 = (i17 & 4) != 0 ? false : z19;
        if ((i17 & 8) != 0) {
            eaVar = null;
        }
        return p1Var.x0(z28, z29, z37, eaVar, (i17 & 16) != 0 ? false : z27, interfaceC29045xdcb5ca57);
    }

    public final void A0() {
        if (this.f388319J) {
            i95.m c17 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((eu2.b0) c17).hj(eu2.k.f338328e);
        }
        this.f388319J = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "cancelPlayerNotification");
    }

    public final boolean B0(boolean z17, boolean z18) {
        boolean z19;
        if (iq.b.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false, null)) {
            if (!z17 && !z18) {
                db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.aqd, 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoPassive", "checkEnableAddFinderFloatBall: failed to add video float ball, checkCameraUsingAndShowToast");
            return false;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        boolean z27 = (z17 || z18) ? false : true;
        if (iq.b.H()) {
            if (z27) {
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqf);
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = string;
                e4Var.c();
            }
            z19 = true;
        } else {
            z19 = false;
        }
        if (!z19) {
            if (!iq.b.F(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (z17 || z18) ? false : true) && !iq.b.d() && !iq.b.a()) {
                if (!iq.b.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (z17 || z18) ? false : true, null) && (!z17 || !iq.b.l(null, false))) {
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoPassive", "checkEnableAddFinderFloatBall: failed to add video float ball");
        return false;
    }

    public final void C0(int i17) {
        this.D = java.util.UUID.randomUUID().toString();
        this.E = i17;
    }

    public final java.lang.String D0(r45.mb4 mb4Var) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.lang.String str2;
        java.lang.String m75945x2fec83072;
        java.lang.String str3 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var != null ? mb4Var.m75945x2fec8307(16) : null)) {
            if (mb4Var == null || (str2 = mb4Var.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            if (mb4Var != null && (m75945x2fec83072 = mb4Var.m75945x2fec8307(19)) != null) {
                str3 = m75945x2fec83072;
            }
            return str2.concat(str3);
        }
        if (mb4Var == null || (str = mb4Var.m75945x2fec8307(16)) == null) {
            str = "";
        }
        if (mb4Var != null && (m75945x2fec8307 = mb4Var.m75945x2fec8307(20)) != null) {
            str3 = m75945x2fec8307;
        }
        return str.concat(str3);
    }

    public final kd2.b0 E0() {
        return (kd2.b0) ((jz5.n) this.K).mo141623x754a37bb();
    }

    public final long F0() {
        boolean booleanValue;
        kd2.q0 q0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        cw2.da daVar = this.f388321y;
        if (daVar != null) {
            booleanValue = daVar.l();
        } else {
            vo2.d dVar = this.f388322z;
            if (dVar != null) {
                booleanValue = ((vo2.c) dVar).b();
            } else {
                kd2.s1 s1Var = this.A;
                java.lang.Boolean valueOf = s1Var != null ? java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) s1Var).mo58787xc00617a4()) : null;
                booleanValue = valueOf != null ? valueOf.booleanValue() : false;
            }
        }
        if (!booleanValue || (q0Var = this.C) == null || (c14989xf862ae88 = q0Var.f388339g) == null) {
            return 0L;
        }
        return c14989xf862ae88.getFeedId();
    }

    public final void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, long j17, float f17, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "initVideoView: targetTimeMs = " + j17 + ", playSpeedRatio = " + f17 + ", isPassive = " + z17 + ", isOnlyAudio = " + z18);
        c15188xd8bd4bd.m61412x49bc1928(new kd2.y0(j17, this, f17, z17, c15188xd8bd4bd, k0()));
        c15188xd8bd4bd.m61419x6b94a948(z18);
        c15188xd8bd4bd.m61433x70cb65e3(k0().getVideoViewCallback());
        c15188xd8bd4bd.mo56708x764cf626(false);
        c15188xd8bd4bd.mo56709x764d819b(false);
        c15188xd8bd4bd.mo56716x4121a19(true);
        if (c15188xd8bd4bd.V()) {
            return;
        }
        zy2.g5.u(c15188xd8bd4bd, null, 1, null);
    }

    public final void I0(boolean z17, boolean z18, boolean z19, boolean z27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar, boolean z28) {
        java.lang.String str;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        r45.qt2 qt2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae883;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae884;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "innerAddMiniView: isPassive = " + z17 + ", fromMessage = " + z19 + ", needPost = " + z18 + ", forcePause=" + z28);
        or2.a aVar = or2.a.f429140a;
        or2.a.f429147h = true;
        int i17 = or2.a.f429145f + 1;
        or2.a.f429145f = i17;
        if (i17 >= 1) {
            aVar.b(true, true);
        }
        this.H = eaVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        c12886x91aa2b6d.f174579d = 32;
        c12886x91aa2b6d.f174580e = 32;
        if (z19) {
            c12886x91aa2b6d.f174591s = true;
        }
        kd2.q0 q0Var = this.f388320x;
        this.C = q0Var;
        int i18 = (z19 && z17) ? 5 : z17 ? 3 : 8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d.M;
        c12887x942bef81.f174617d = i18;
        if (q0Var == null || (c14989xf862ae884 = q0Var.f388339g) == null || (str = java.lang.Long.valueOf(c14989xf862ae884.getFeedId()).toString()) == null) {
            str = "";
        }
        c12887x942bef81.f174620g = str;
        kd2.q0 q0Var2 = this.C;
        if (q0Var2 == null || (c14989xf862ae883 = q0Var2.f388339g) == null) {
            f0Var = null;
        } else {
            z0(q0Var2.f388338f, c14989xf862ae883, q0Var2.f388333a, q0Var2.f388340h, q0Var2.f388334b, q0Var2.f388335c, z18, z17, z27, z28);
            f0Var = jz5.f0.f384359a;
        }
        boolean z29 = false;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoPassive", "innerAddMiniView: feedData is null");
            S0();
            if (this.F) {
                g0(z18);
                k0().m58249xa2fbf520(false);
            }
        }
        kd2.q0 q0Var3 = this.C;
        if (q0Var3 != null && (qt2Var = q0Var3.f388336d) != null) {
            if (z19) {
                C0(2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String str2 = this.D;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("float_frame_id", str2);
                kd2.q0 q0Var4 = this.C;
                if (q0Var4 != null && (c14989xf862ae882 = q0Var4.f388339g) != null) {
                    jSONObject.put("feedid", pm0.v.u(c14989xf862ae882.getFeedId()));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, qt2Var, "wechat_push_card", 1, jSONObject, false, null, 48, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef812 = this.f174665d.M;
            int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
            int i19 = 17;
            if (m75939xb282bd08 == 17) {
                i19 = 15;
            } else if (m75939xb282bd08 == 18) {
                i19 = 16;
            } else if (m75939xb282bd08 != 20) {
                i19 = 0;
            }
            c12887x942bef812.f174618e = i19;
        }
        this.f174665d.M.f174623m = 16;
        kd2.q0 q0Var5 = this.f388320x;
        if (q0Var5 != null && (c14989xf862ae88 = q0Var5.f388339g) != null && c14989xf862ae88.getMediaType() == 4) {
            z29 = true;
        }
        if (z29) {
            this.f388319J = true;
            U0();
        }
    }

    public final boolean K0() {
        cw2.da daVar = this.f388321y;
        boolean mo58787xc00617a4 = daVar != null ? daVar.mo58787xc00617a4() : false;
        vo2.d dVar = this.f388322z;
        boolean b17 = mo58787xc00617a4 | (dVar != null ? ((vo2.c) dVar).b() : false);
        kd2.s1 s1Var = this.A;
        return b17 | (s1Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) s1Var).mo58787xc00617a4() : false);
    }

    public final boolean L0(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Class<?> cls = activity.getClass();
        kd2.q0 q0Var = this.C;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, q0Var != null ? q0Var.f388346n : null);
    }

    public final boolean M0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        kd2.q0 q0Var = this.C;
        return (q0Var == null || (c14989xf862ae88 = q0Var.f388339g) == null || c14989xf862ae88.getMediaType() != 9) ? false : true;
    }

    public final boolean N0() {
        kd2.q0 q0Var = this.C;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class, q0Var != null ? q0Var.f388346n : null)) {
            kd2.q0 q0Var2 = this.C;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799.class, q0Var2 != null ? q0Var2.f388346n : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean O0() {
        java.lang.Class cls;
        kd2.q0 q0Var = this.C;
        if (q0Var == null || (cls = q0Var.f388346n) == null) {
            return false;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102.class.isAssignableFrom(cls);
    }

    public void P0() {
        java.lang.Object obj = this.f388321y;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) parent : null;
            if (c15196x85976f5f != null) {
                c15196x85976f5f.removeView(view);
            }
        }
        java.lang.Object obj2 = this.A;
        android.view.View view2 = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
        if (view2 != null) {
            android.view.ViewParent parent2 = view2.getParent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = parent2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) parent2 : null;
            if (c15196x85976f5f2 != null) {
                c15196x85976f5f2.removeView(view2);
            }
        }
        N();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(int r41) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.Q0(int):void");
    }

    public final void R0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.AbstractC14145xbd0afa06 f192851e;
        kd2.s1 s1Var = this.A;
        if (s1Var != null) {
            s1Var.mo56715xe9d735dd(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) s1Var;
            c15182x1607686b.d();
            c15182x1607686b.b();
        }
        this.A = null;
        kd2.d0 d0Var = this.B;
        if (d0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreFeedMini", "removeLivePlayerView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc = d0Var.f388259c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.AbstractC14145xbd0afa06 f192851e2 = c14146x2a22facc != null ? c14146x2a22facc.getF192851e() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc2 = d0Var.f388259c;
            if (c14146x2a22facc2 != null && (f192851e = c14146x2a22facc2.getF192851e()) != null) {
                f192851e.mo56710x6332291b(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc3 = d0Var.f388259c;
            if (c14146x2a22facc3 != null) {
                c14146x2a22facc3.f192850d.removeAllViews();
                c14146x2a22facc3.f192851e = null;
                c14146x2a22facc3.f192852f = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreFeedMini", "exitMinimizeMode:" + f192851e2);
            if (f192851e2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc4 = d0Var.f388259c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) f192851e2;
                c15182x1607686b2.Y("exitMinimizeMode:" + c14146x2a22facc4);
                c15182x1607686b2.K = false;
                zy2.a8 a8Var = c15182x1607686b2.liveFeedDecorator;
                if (a8Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) a8Var;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ufVar.j(), "exitMinimizeMode:" + c14146x2a22facc4);
                    ufVar.f190712y = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = ufVar.f190701n;
                    kfVar.getClass();
                    java.lang.String str = kfVar.f188724e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "exitMinimizeMode:" + c14146x2a22facc4);
                    kfVar.L = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "prepareForExitMinimize");
                    com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = kfVar.D;
                    if (c22840x82866af5 != null) {
                        c22840x82866af5.m82883x6cab2c8d(kfVar.f188729j);
                    }
                    for (java.util.Map.Entry entry : kfVar.f188726g.entrySet()) {
                        kfVar.e(((java.lang.Boolean) entry.getValue()).booleanValue(), (java.lang.String) entry.getKey());
                    }
                    kfVar.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = kfVar.E;
                    if (c14245x86828950 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14245x86828950.f193232v, "onUnBind");
                        c14245x86828950.singContentLayout.removeAllViews();
                        c14245x86828950.coverBackgroundLayout.removeAllViews();
                    }
                    kfVar.c().b(kfVar.E);
                    em2.i iVar = kfVar.f188735p;
                    if (iVar != null) {
                        iVar.mo56532x6761d4f();
                    }
                    kfVar.M = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ufVar.j(), "prepareForExitMinimize");
                    ufVar.t(true);
                    ufVar.s();
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nf(ufVar));
                }
                mn0.b0 b0Var = c15182x1607686b2.txLivePlayer;
                if (b0Var != null) {
                    android.content.Context context = c15182x1607686b2.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    ((mn0.y) b0Var).Q(c15182x1607686b2.P(context, c15182x1607686b2.f212147t, c15182x1607686b2.f212148u));
                }
            }
        }
    }

    public final void S0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "resetPlayers: playingView = " + this.f388321y + ", musicPlayer = " + this.f388322z + ", livePlayer = " + this.A);
        cw2.da daVar = this.f388321y;
        if (daVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar : null;
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.m61433x70cb65e3(null);
                c15188xd8bd4bd.m61412x49bc1928(null);
            }
            daVar.mo56715xe9d735dd(null);
            daVar.d();
            daVar.b();
            A0();
        }
        this.f388321y = null;
        vo2.d dVar = this.f388322z;
        if (dVar != null) {
            vo2.c cVar = (vo2.c) dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = cVar.f520092b;
            if (c15188xd8bd4bd2 != null) {
                c15188xd8bd4bd2.mo56716x4121a19(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = cVar.f520092b;
            if (c15188xd8bd4bd3 != null) {
                c15188xd8bd4bd3.mo58801x360802();
            }
            cVar.e();
        }
        this.f388322z = null;
        R0();
    }

    public final void U0() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ng).mo141623x754a37bb()).r()).booleanValue()) {
            boolean u17 = u();
            if (!this.f388319J || !u17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "[updateSystemPlayer] unable update system player, hasFloatBall = " + u17 + ", enableSystemPlayer = " + this.f388319J);
                return;
            }
            i95.m c18 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((eu2.b0) c18).qj(this.f388321y, eu2.k.f338328e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateSystemPlayer], isPlaying = ");
            cw2.da daVar = this.f388321y;
            sb6.append(daVar != null ? java.lang.Boolean.valueOf(daVar.mo58787xc00617a4()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f174619f = 24;
    }

    @Override // kd2.q
    public void h0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
        if (!K0()) {
            T0(this, false, false, false, 4, null);
        }
        cw2.da daVar = this.f388321y;
        if (daVar != null) {
            daVar.mo56709x764d819b(false);
        }
        vo2.d dVar = this.f388322z;
        if (dVar != null && (c15188xd8bd4bd = ((vo2.c) dVar).f520092b) != null) {
            c15188xd8bd4bd.mo56709x764d819b(false);
        }
        kd2.s1 s1Var = this.A;
        if (s1Var != null) {
            s1Var.mo56709x764d819b(false);
        }
    }

    @Override // kd2.q
    public android.view.View.OnClickListener i0() {
        return new kd2.u0(new kd2.c(this));
    }

    @Override // kd2.q
    public android.view.View.OnClickListener j0() {
        return new kd2.v0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    @Override // kd2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.l0():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r1 != false) goto L15;
     */
    @Override // kd2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0() {
        /*
            r9 = this;
            cw2.da r0 = r9.f388321y
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.mo58787xc00617a4()
            if (r0 != r2) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != 0) goto L20
            kd2.s1 r0 = r9.A
            if (r0 == 0) goto L1e
            com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) r0
            boolean r0 = r0.mo58787xc00617a4()
            if (r0 != r2) goto L1e
            r1 = r2
        L1e:
            if (r1 == 0) goto L33
        L20:
            java.lang.Class<pv.d0> r0 = pv.d0.class
            i95.m r0 = i95.n0.c(r0)
            pv.d0 r0 = (pv.d0) r0
            ov.i0 r0 = (ov.i0) r0
            gp1.v r0 = r0.Bi()
            if (r0 == 0) goto L33
            r0.k0()
        L33:
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            T0(r3, r4, r5, r6, r7, r8)
            cw2.da r0 = r9.f388321y
            if (r0 == 0) goto L43
            r0.mo56709x764d819b(r2)
        L43:
            vo2.d r0 = r9.f388322z
            if (r0 == 0) goto L50
            vo2.c r0 = (vo2.c) r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r0.f520092b
            if (r0 == 0) goto L50
            r0.mo56709x764d819b(r2)
        L50:
            kd2.s1 r0 = r9.A
            if (r0 == 0) goto L57
            r0.mo56709x764d819b(r2)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.n0():void");
    }

    @Override // kd2.q
    public void o0(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        if (O0()) {
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d;
            eaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189368f).mo141623x754a37bb();
        } else {
            eaVar = this.H;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar2 = eaVar;
        if (eaVar2 == null) {
            return;
        }
        kd2.q0 q0Var = this.f388320x;
        java.lang.Long valueOf = (q0Var == null || (c14989xf862ae882 = q0Var.f388339g) == null) ? null : java.lang.Long.valueOf(c14989xf862ae882.getFeedId());
        if (valueOf != null) {
            if (valueOf.longValue() == eaVar2.f189370b) {
                return;
            }
            long j17 = i17;
            jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d;
            if (j17 + ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d).mo141623x754a37bb()).longValue() < i18) {
                return;
            }
            if (!O0()) {
                long longValue = valueOf.longValue();
                kd2.q0 q0Var2 = this.C;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.b(eaVar2, longValue, (q0Var2 == null || (c14989xf862ae88 = q0Var2.f388339g) == null) ? null : c14989xf862ae88.getNonceId(), null, null, null, null, 60, null);
                return;
            }
            qg3.i0 a17 = qg3.k0.f444359d.a();
            qg3.h1 a18 = a17 != null ? ((qg3.k0) a17).a() : null;
            if (a18 != null) {
                qg3.i1 i1Var = (qg3.i1) a18;
                if (p3380x6a61f93.p3383xf5152754.C30546x21b188e2.m169810x21b14113(i1Var.m105978x2737f10()).length() == 0) {
                    com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 m169808x21b0da3a = p3380x6a61f93.p3383xf5152754.C30546x21b188e2.m169808x21b0da3a(i1Var.m105978x2737f10());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m169808x21b0da3a, "null cannot be cast to non-null type com.tencent.mm.plugin.mega_video.ur.FeedFlowModel");
                    kd2.j1 j1Var = kd2.j1.f388297d;
                    qg3.q qVar = new qg3.q();
                    qVar.f444379e = j1Var;
                    p3380x6a61f93.p3383xf5152754.C30545x21b15b31.m169778x21b06377(((qg3.f) ((qg3.e) m169808x21b0da3a)).m105978x2737f10(), 2, qVar);
                }
            }
        }
    }

    @Override // kd2.q
    public void p0() {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        kd2.o0 o0Var = N;
        kd2.q0 q0Var = o0Var.a().f388320x;
        if (q0Var != null && (p0Var2 = q0Var.f388342j) != null) {
            p0Var2.f388317b = android.os.SystemClock.elapsedRealtime();
        }
        kd2.q0 q0Var2 = o0Var.a().f388320x;
        if (q0Var2 != null && (p0Var = q0Var2.f388343k) != null) {
            p0Var.f388317b = android.os.SystemClock.elapsedRealtime();
        }
        U0();
    }

    @Override // kd2.q
    public void q0() {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        kd2.o0 o0Var = N;
        kd2.q0 q0Var = o0Var.a().f388320x;
        if (q0Var != null && (p0Var2 = q0Var.f388342j) != null) {
            p0Var2.f388317b = android.os.SystemClock.elapsedRealtime();
        }
        kd2.q0 q0Var2 = o0Var.a().f388320x;
        if (q0Var2 != null && (p0Var = q0Var2.f388343k) != null) {
            p0Var.f388317b = android.os.SystemClock.elapsedRealtime();
        }
        U0();
    }

    @Override // kd2.q
    public void r0() {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        kd2.o0 o0Var = N;
        kd2.q0 q0Var = o0Var.a().f388320x;
        if (q0Var != null && (p0Var2 = q0Var.f388342j) != null) {
            if (p0Var2.f388317b > 0) {
                p0Var2.f388318c += android.os.SystemClock.elapsedRealtime() - p0Var2.f388317b;
            }
            p0Var2.f388317b = 0L;
        }
        kd2.q0 q0Var2 = o0Var.a().f388320x;
        if (q0Var2 != null && (p0Var = q0Var2.f388343k) != null) {
            if (p0Var.f388317b > 0) {
                p0Var.f388318c += android.os.SystemClock.elapsedRealtime() - p0Var.f388317b;
            }
            p0Var.f388317b = 0L;
        }
        U0();
    }

    @Override // kd2.q
    public void s0() {
        super.s0();
        mo48814x2efc64();
    }

    @Override // kd2.q
    public boolean t0() {
        ls5.m mo56688x8a1470ca;
        ls5.k mo58776x51603325;
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.FinderVideoPassiveMiniViewHelper");
        this.H = null;
        this.G = false;
        cw2.da daVar = this.f388321y;
        if (daVar != null && (mo56688x8a1470ca = daVar.mo56688x8a1470ca()) != null && (mo58776x51603325 = mo56688x8a1470ca.mo58776x51603325()) != null) {
            ((ls5.d) mo58776x51603325).b(null);
        }
        S0();
        kd2.q0 q0Var = this.f388320x;
        if (q0Var != null) {
            this.I = q0Var;
        }
        this.f388320x = null;
        this.C = null;
        return super.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(boolean r19, boolean r20, boolean r21, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea r22, boolean r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.x0(boolean, boolean, boolean, com.tencent.mm.plugin.finder.feed.model.ea, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (((r3 == null || r3.f388341i) ? false : true) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09c8  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r1v28, types: [r45.qt2] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [android.view.View, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r3v50, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r3v52, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0(int r34, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 r35, cw2.wa r36, r45.zi2 r37, long r38, float r40, boolean r41, boolean r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 2711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.z0(int, com.tencent.mm.plugin.finder.storage.FeedData, cw2.wa, r45.zi2, long, float, boolean, boolean, boolean, boolean):void");
    }
}
