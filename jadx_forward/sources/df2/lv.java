package df2;

/* loaded from: classes3.dex */
public final class lv extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312253m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f312254n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f312255o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312253m = "Finder.LiveVideoBannerController";
        this.f312254n = jz5.h.b(df2.cv.f311444d);
        this.f312255o = jz5.h.b(df2.bv.f311363d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if ((r1 != null && r1.w0() == 0) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.lv r10, java.lang.String r11, boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.si> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.si.class
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r10.R6(r0)
            com.tencent.mm.plugin.finder.live.plugin.si r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.si) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            int r1 = r1.w0()
            if (r1 != 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = r3
        L15:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.wi> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi.class
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.ti> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ti.class
            if (r1 != 0) goto L41
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r10.R6(r5)
            com.tencent.mm.plugin.finder.live.plugin.ti r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ti) r1
            if (r1 == 0) goto L2b
            int r1 = r1.w0()
            if (r1 != 0) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r1 != 0) goto L41
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r10.R6(r4)
            com.tencent.mm.plugin.finder.live.plugin.wi r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi) r1
            if (r1 == 0) goto L3e
            int r1 = r1.w0()
            if (r1 != 0) goto L3e
            r1 = r2
            goto L3f
        L3e:
            r1 = r3
        L3f:
            if (r1 == 0) goto L42
        L41:
            r3 = r2
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = " gameDataBannerUpdate set to visible:"
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ",gameDynamicVisible:"
            r1.append(r11)
            r1.append(r3)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = r10.f312253m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)
            jz5.f0 r11 = jz5.f0.f384359a
            if (r12 == 0) goto Ld3
            if (r3 == 0) goto L9d
            long r6 = android.os.SystemClock.elapsedRealtime()
            jz5.g r12 = r10.f312254n
            r1 = r12
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            df2.av r1 = (df2.av) r1
            long r8 = r1.f311286a
            long r6 = r6 - r8
            r8 = 5000(0x1388, double:2.4703E-320)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L9d
            r1 = r12
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            df2.av r1 = (df2.av) r1
            long r6 = android.os.SystemClock.elapsedRealtime()
            r1.f311286a = r6
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.mo141623x754a37bb()
            df2.av r12 = (df2.av) r12
            int r1 = r12.f311287b
            int r1 = r1 + r2
            r12.f311287b = r1
        L9d:
            com.tencent.mm.plugin.finder.live.plugin.l r12 = r10.R6(r0)
            com.tencent.mm.plugin.finder.live.plugin.si r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.si) r12
            r0 = 8
            if (r12 == 0) goto Laa
            r12.K0(r0)
        Laa:
            com.tencent.mm.plugin.finder.live.plugin.l r12 = r10.R6(r5)
            com.tencent.mm.plugin.finder.live.plugin.ti r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ti) r12
            if (r12 == 0) goto Lb5
            r12.K0(r0)
        Lb5:
            com.tencent.mm.plugin.finder.live.plugin.l r12 = r10.R6(r4)
            com.tencent.mm.plugin.finder.live.plugin.wi r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi) r12
            if (r12 == 0) goto Lc0
            r12.K0(r0)
        Lc0:
            java.lang.Class<df2.vh> r12 = df2.vh.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r10 = r10.m56789x25fe639c(r12)
            df2.vh r10 = (df2.vh) r10
            if (r10 == 0) goto Ld3
            java.lang.Object r10 = r10.g7(r13)
            pz5.a r12 = pz5.a.f440719d
            if (r10 != r12) goto Ld3
            r11 = r10
        Ld3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lv.Z6(df2.lv, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void a7(df2.lv lvVar, java.lang.String str, boolean z17) {
        java.lang.Boolean bool;
        df2.vh vhVar = (df2.vh) lvVar.m56789x25fe639c(df2.vh.class);
        if (vhVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = vhVar.f313137o;
            bool = java.lang.Boolean.valueOf(c14316xd081b6f3 != null ? c14316xd081b6f3.isShown() : false);
        } else {
            bool = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lvVar.f312253m, str + " set gameDynamicVisible to " + z17 + ",gameDataCardVisible:" + bool);
        if (z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                jz5.g gVar = lvVar.f312255o;
                if (elapsedRealtime - ((df2.av) ((jz5.n) gVar).mo141623x754a37bb()).f311286a < 5000) {
                    ((df2.av) ((jz5.n) gVar).mo141623x754a37bb()).f311286a = android.os.SystemClock.elapsedRealtime();
                    ((df2.av) ((jz5.n) gVar).mo141623x754a37bb()).f311287b++;
                }
            }
            df2.vh vhVar2 = (df2.vh) lvVar.m56789x25fe639c(df2.vh.class);
            if (vhVar2 != null) {
                vhVar2.c7("gameDynamicVisible");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ev(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.gv(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.iv(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.kv(this, null), 3, null);
    }
}
