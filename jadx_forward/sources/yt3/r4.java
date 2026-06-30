package yt3;

/* loaded from: classes10.dex */
public final class r4 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f547179d;

    /* renamed from: e, reason: collision with root package name */
    public ru3.f f547180e;

    /* renamed from: f, reason: collision with root package name */
    public ct0.b f547181f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f547182g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f547183h;

    /* renamed from: i, reason: collision with root package name */
    public st3.s f547184i;

    /* renamed from: m, reason: collision with root package name */
    public st3.r f547185m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.q f547186n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f547187o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f547188p;

    /* renamed from: q, reason: collision with root package name */
    public int f547189q;

    public r4(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f547179d = context;
        this.f547183h = true;
        this.f547185m = new st3.r(0, 0, 0, 0, 0, 0, 0, 0, false, false, 0, 0, 0, 0, 16383, null);
        this.f547187o = p3325xe03a0797.p3326xc267989b.z0.i(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (((yt3.r4) r7) != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yt3.r4 r5, yz5.a r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof yt3.g4
            if (r0 == 0) goto L16
            r0 = r7
            yt3.g4 r0 = (yt3.g4) r0
            int r1 = r0.f547002i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f547002i = r1
            goto L1b
        L16:
            yt3.g4 r0 = new yt3.g4
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f547000g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f547002i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f546998e
            r6 = r5
            yz5.a r6 = (yz5.a) r6
            java.lang.Object r5 = r0.f546997d
            yt3.r4 r5 = (yt3.r4) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r5.f547182g
            if (r7 == 0) goto L90
            st3.r r2 = r5.f547185m
            boolean r2 = r2.f494115j
            if (r2 != 0) goto L62
            boolean r2 = r7.T
            if (r2 == 0) goto L62
            r0.f546997d = r5
            r0.f546998e = r6
            r0.f546999f = r7
            r0.f547002i = r3
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L5c
            goto L94
        L5c:
            yt3.r4 r7 = (yt3.r4) r7
            if (r7 != 0) goto L62
        L60:
            r1 = r4
            goto L94
        L62:
            st3.r r7 = r5.f547185m
            boolean r0 = r7.f494114i
            if (r0 == 0) goto L70
            boolean r7 = r7.f494115j
            if (r7 != 0) goto L90
            boolean r7 = es0.b.f337843a
            if (r7 == 0) goto L90
        L70:
            st3.s r7 = r5.f547184i
            if (r7 == 0) goto L77
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = r7.f494121b
            goto L78
        L77:
            r7 = r4
        L78:
            if (r7 != 0) goto L90
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r6 = r5.h()
            if (r6 != 0) goto L81
            goto L60
        L81:
            r5.f(r6)
            nu3.m r5 = nu3.m.f421762a
            r6 = 2
            r5.n(r6)
            r6 = 1
            r5.i(r3, r6)
            goto L60
        L90:
            r6.mo152xb9724478()
            r1 = r5
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.a(yt3.r4, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(yt3.r4 r4Var) {
        android.content.Context context = r4Var.f547179d;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            ru3.f fVar = r4Var.f547180e;
            boolean z17 = false;
            if (fVar != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = fVar.f481287a;
                if (u3Var != null ? u3Var.isShowing() : false) {
                    z17 = true;
                }
            }
            if (z17) {
                ru3.f fVar2 = r4Var.f547180e;
                if (fVar2 != null) {
                    fVar2.a();
                }
                r4Var.f547180e = null;
            }
        }
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.h(str2);
        }
        android.graphics.Bitmap p17 = ai3.d.p(str);
        if (p17 != null) {
            dw3.c0 c0Var = dw3.c0.f325715a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f547182g;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(c0Var.f(p17, (c16993xacc19624 == null || (c11120x15dce88d = c16993xacc19624.f237209n) == null) ? 0 : c11120x15dce88d.f152737t), 60, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(yz5.a r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.d(yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lt3.f0 e(st3.s r38, st3.r r39) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.e(st3.s, st3.r):lt3.f0");
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("mediacodec_create_error", false);
        ut3.f.f512709c.a(this.f547179d, c16991x15ced046);
    }

    public final void g(st3.r rVar) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 154L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "start forceRemux");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f547182g;
        sb6.append(c16993xacc19624 != null ? c16993xacc19624.B : null);
        sb6.append("_tmp");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f547182g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
        if (c16993xacc196242.f237209n.f152739v == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = this.f547182g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196243);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c16993xacc196243.f237209n.D);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = this.f547182g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196244);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "ABA: Using Min Max QP Limitation: [%d], [%d] ", valueOf, java.lang.Integer.valueOf(c16993xacc196244.f237209n.E));
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196245 = this.f547182g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196245);
            i17 = c16993xacc196245.f237209n.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196246 = this.f547182g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196246);
            i18 = c16993xacc196246.f237209n.E;
        } else {
            i17 = 0;
            i18 = 51;
        }
        int i19 = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196247 = this.f547182g;
        java.lang.String str = c16993xacc196247 != null ? c16993xacc196247.B : null;
        int i27 = rVar.f494106a;
        int i28 = rVar.f494107b;
        int i29 = rVar.f494108c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196247);
        int i37 = c16993xacc196247.f237209n.f152735r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196248 = this.f547182g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196248);
        int m69233xcf34d77e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69233xcf34d77e(str, sb7, i27, i28, i29, i37, 8, c16993xacc196248.f237209n.f152734q, 25.0f, rVar.f494110e, null, 0, false, i17, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196249 = this.f547182g;
        com.p314xaae8f345.mm.vfs.w6.c(sb7, c16993xacc196249 != null ? c16993xacc196249.B : null);
        com.p314xaae8f345.mm.vfs.w6.h(sb7);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "minQP :" + i17 + "  maxQP :" + i19 + "  duration:" + m69233xcf34d77e + " cost:" + elapsedRealtime2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 155L, elapsedRealtime2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 h() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.h():com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel");
    }

    public final void i(lt3.f0 f0Var, st3.s sVar, st3.r rVar) {
        if (this.f547180e == null) {
            ru3.f fVar = new ru3.f();
            fVar.b(this.f547179d, false, com.p314xaae8f345.mm.R.C30867xcad56011.i1q, yt3.j4.f547041d);
            this.f547180e = fVar;
        }
        lt3.v vVar = lt3.v.f402810a;
        yt3.l4 l4Var = new yt3.l4(this, rVar, f0Var, sVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler stopBgMix!");
        lt3.v.f402815f = l4Var;
        lt3.v.f402812c = true;
        java.util.ArrayList arrayList = lt3.v.f402813d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lt3.u uVar = new lt3.u((lt3.r) it.next());
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(new pm0.p(uVar));
        }
        arrayList.clear();
        if (lt3.v.f402811b) {
            return;
        }
        yz5.a aVar = lt3.v.f402815f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        lt3.v.f402815f = null;
    }

    public final void j(ct0.b info, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        this.f547181f = info;
        this.f547182g = configProvider;
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_IS_CAPUTRE_BOOLEAN", java.lang.Boolean.valueOf(info.f303739c));
        if (info.f303739c) {
            iVar.n("KEY_CAPUTRE_VIDEO_PATH_STRING", info.d());
            iVar.n("KEY_CAPUTRE_THUMB_PATH_STRING", info.a() ? info.f303738b : info.f303743g);
        }
    }

    public final void k(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69219x922a682f(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void m(st3.s editConfig) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editConfig, "editConfig");
        if (this.f547183h) {
            z17 = false;
            this.f547183h = false;
        } else {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "is repeat to return");
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f547188p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f547188p = p3325xe03a0797.p3326xc267989b.l.d(this.f547187o, null, null, new yt3.q4(this, editConfig, null), 3, null);
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f547188p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
