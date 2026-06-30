package sf2;

/* loaded from: classes10.dex */
public final class d3 extends if2.b implements if2.e, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public fn2.s1 f488636m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f488637n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f488638o;

    /* renamed from: p, reason: collision with root package name */
    public hn2.d f488639p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f488640q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f488641r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f488642s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f488641r = jz5.h.b(new sf2.y1(this));
        this.f488642s = new java.util.LinkedHashMap();
    }

    public static final void Z6(sf2.d3 d3Var, int i17, r45.mx1 mx1Var, java.lang.String str) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.gw1 gw1Var;
        d3Var.getClass();
        r45.fw1 fw1Var = mx1Var.f462423p;
        if (fw1Var != null && (m75941xfb8219142 = fw1Var.m75941xfb821914(0)) != null && (gw1Var = (r45.gw1) kz5.n0.Z(m75941xfb8219142)) != null) {
            ((om2.l) d3Var.m56788xbba4bfc0(om2.l.class)).T6(gw1Var);
        }
        ((om2.g) d3Var.m56788xbba4bfc0(om2.g.class)).X6("modCgi_" + i17 + '_' + str, mx1Var.f462418h);
        om2.g gVar = (om2.g) d3Var.m56788xbba4bfc0(om2.g.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modCgi_");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.util.LinkedList song_info_list = mx1Var.f462415e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_info_list, "song_info_list");
        gVar.V6(sb7, song_info_list, mx1Var.f462416f);
        ((om2.g) d3Var.m56788xbba4bfc0(om2.g.class)).W6("modCgi_" + i17 + '_' + str, mx1Var.f462419i);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mod handleResp, modType: ");
        sb8.append(i17);
        sb8.append(" all_wait_song_size: ");
        sb8.append(mx1Var.f462422o);
        sb8.append(" self_wait_song_size: ");
        sb8.append(mx1Var.f462420m);
        sb8.append(" guide: ");
        r45.fw1 fw1Var2 = mx1Var.f462423p;
        sb8.append((fw1Var2 == null || (m75941xfb821914 = fw1Var2.m75941xfb821914(0)) == null) ? null : (r45.gw1) kz5.n0.Z(m75941xfb821914));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", sb8.toString());
        ((om2.g) d3Var.m56788xbba4bfc0(om2.g.class)).Y6("modCgi_" + i17, mx1Var.f462420m, mx1Var.f462422o);
    }

    public static /* synthetic */ java.lang.Object i7(sf2.d3 d3Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, java.lang.String str, java.lang.Integer num, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i17 & 1) != 0 ? null : gVar;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return d3Var.h7(gVar2, z17, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : num, interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ java.lang.Object l7(sf2.d3 d3Var, int i17, int i18, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        return d3Var.k7(i17, i18, z17, interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ java.lang.Object p7(sf2.d3 d3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, r45.dy1 dy1Var, sf2.x1 x1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i18, java.lang.Object obj) {
        return d3Var.n7(i17, str, (i18 & 4) != 0 ? "" : str2, (i18 & 8) != 0 ? null : str3, (i18 & 16) != 0 ? false : z17, (i18 & 32) != 0 ? null : dy1Var, (i18 & 64) != 0 ? null : x1Var, interfaceC29045xdcb5ca57);
    }

    @Override // mf2.c
    public void U0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "enterTRTCState: checking audition state");
        f7().m();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(int r20, r45.nx1 r21, boolean r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.a7(int, r45.nx1, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int b7() {
        if (zl2.r4.f555483a.w1()) {
            return 1;
        }
        mm2.n0 n0Var = (mm2.n0) m56788xbba4bfc0(mm2.n0.class);
        return n0Var != null && n0Var.f410806r ? 16 : 2;
    }

    public final void c7() {
        java.lang.String str;
        fn2.s1 s1Var = this.f488636m;
        if (s1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0.i(s1Var, false, 1, null);
        }
        this.f488636m = null;
        nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) g7()).mo144003x754a37bb();
        if (aVar == null || (str = aVar.b()) == null) {
            str = "";
        }
        nm2.a aVar2 = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) g7()).mo144003x754a37bb();
        boolean d17 = aVar2 != null ? aVar2.d() : false;
        if (str.length() > 0) {
            x7(str, d17, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(hn2.d r18, r45.mx1 r19, yz5.a r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.d7(hn2.d, r45.mx1, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String e7(java.lang.String str) {
        if (str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.util.UUID.randomUUID());
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            return sb6.toString();
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f488642s;
        java.lang.Object obj = linkedHashMap.get(str);
        if (obj == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(java.util.UUID.randomUUID());
            sb7.append('_');
            sb7.append(java.lang.System.currentTimeMillis());
            obj = sb7.toString();
            linkedHashMap.put(str, obj);
        }
        return (java.lang.String) obj;
    }

    public final sf2.f3 f7() {
        return (sf2.f3) ((jz5.n) this.f488641r).mo141623x754a37bb();
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 g7() {
        return ((mm2.j5) m56788xbba4bfc0(mm2.j5.class)).f410715g;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h7(com.p314xaae8f345.mm.p2495xc50a8b8b.g r16, boolean r17, java.lang.String r18, java.lang.Integer r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.h7(com.tencent.mm.protobuf.g, boolean, java.lang.String, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k7(int r18, int r19, boolean r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.k7(int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7(java.lang.Integer r11, java.lang.Integer r12, com.p314xaae8f345.mm.p2495xc50a8b8b.g r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.m7(java.lang.Integer, java.lang.Integer, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n7(int r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31, r45.dy1 r32, sf2.x1 r33, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r34) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.n7(int, java.lang.String, java.lang.String, java.lang.String, boolean, r45.dy1, sf2.x1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o7(int r16, r45.yx1 r17, boolean r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof sf2.t2
            if (r2 == 0) goto L18
            r2 = r1
            sf2.t2 r2 = (sf2.t2) r2
            int r3 = r2.f488826f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f488826f = r3
            r14 = r15
            goto L1e
        L18:
            sf2.t2 r2 = new sf2.t2
            r14 = r15
            r2.<init>(r15, r1)
        L1e:
            r11 = r2
            java.lang.Object r1 = r11.f488824d
            pz5.a r2 = pz5.a.f440719d
            int r3 = r11.f488826f
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto L63
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            java.lang.String r5 = r0.f472991d
            java.lang.String r1 = "song_mid"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)
            java.lang.String r6 = r0.f472992e
            r45.by1 r0 = r0.f472999o
            if (r0 == 0) goto L4e
            r45.ay1 r0 = r0.f452676d
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.f451884e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r7 = r0
            r9 = 0
            r10 = 0
            r12 = 96
            r13 = 0
            r11.f488826f = r4
            r3 = r15
            r4 = r16
            r8 = r18
            java.lang.Object r1 = p7(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r2) goto L63
            return r2
        L63:
            jz5.l r1 = (jz5.l) r1
            java.lang.Object r0 = r1.f384366d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.o7(int, r45.yx1, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "onLiveEnd");
        c7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "onViewUnmount");
        c7();
    }

    public final boolean q7(int i17) {
        if (zl2.r4.f555483a.x1()) {
            return true;
        }
        tn0.w0 Q6 = Q6();
        if (Q6 != null && Q6.X()) {
            if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410429v) {
                return true;
            }
            db5.t7.m123883x26a183b(O6(), O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mka), 0).show();
            return false;
        }
        db5.t7.m123883x26a183b(O6(), O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwr), 0).show();
        qo0.b bVar = qo0.b.V3;
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 != -1) {
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", i17);
        }
        X6(bVar, bundle);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r7(hn2.d r11, r45.dy1 r12, boolean r13, r45.gy1 r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof sf2.w2
            if (r0 == 0) goto L13
            r0 = r15
            sf2.w2 r0 = (sf2.w2) r0
            int r1 = r0.f488876g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f488876g = r1
            goto L18
        L13:
            sf2.w2 r0 = new sf2.w2
            r0.<init>(r10, r15)
        L18:
            r7 = r0
            java.lang.Object r15 = r7.f488874e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f488876g
            r8 = 0
            r9 = 1
            if (r1 == 0) goto L35
            if (r1 != r9) goto L2d
            java.lang.Object r11 = r7.f488873d
            hn2.d r11 = (hn2.d) r11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L4f
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.String r2 = r11.f364038a
            if (r2 == 0) goto L59
            r11.f364047j = r9
            java.lang.String r3 = r11.f364039b
            r7.f488873d = r11
            r7.f488876g = r9
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r15 = r1.s7(r2, r3, r4, r5, r6, r7)
            if (r15 != r0) goto L4f
            return r0
        L4f:
            r45.mx1 r15 = (r45.mx1) r15
            if (r15 == 0) goto L56
            r11.f364046i = r9
            return r15
        L56:
            r12 = 0
            r11.f364047j = r12
        L59:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.r7(hn2.d, r45.dy1, boolean, r45.gy1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s7(java.lang.String r15, java.lang.String r16, r45.dy1 r17, boolean r18, r45.gy1 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            r14 = this;
            r0 = r20
            boolean r1 = r0 instanceof sf2.v2
            if (r1 == 0) goto L16
            r1 = r0
            sf2.v2 r1 = (sf2.v2) r1
            int r2 = r1.f488858f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f488858f = r2
            r13 = r14
            goto L1c
        L16:
            sf2.v2 r1 = new sf2.v2
            r13 = r14
            r1.<init>(r14, r0)
        L1c:
            r10 = r1
            java.lang.Object r0 = r10.f488856d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r10.f488858f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            goto L56
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r0 = 1
            r5 = 0
            r7 = 0
            sf2.x1 r9 = new sf2.x1
            r2 = r18
            r4 = r19
            r9.<init>(r2, r4)
            r11 = 20
            r12 = 0
            r10.f488858f = r3
            r2 = r14
            r3 = r0
            r4 = r15
            r6 = r16
            r8 = r17
            java.lang.Object r0 = p7(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r1) goto L56
            return r1
        L56:
            jz5.l r0 = (jz5.l) r0
            java.lang.Object r0 = r0.f384366d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.s7(java.lang.String, java.lang.String, r45.dy1, boolean, r45.gy1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t7(java.lang.String r19, com.p314xaae8f345.mm.p2495xc50a8b8b.g r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.t7(java.lang.String, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u7(java.lang.String r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.u7(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void v7(fn2.u1 sourceScene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        w7(i17, sourceScene, fn2.v1.f345955e, null);
    }

    @Override // mf2.c
    public void w0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "exitTRTCState: checking audition state");
        f7().m();
    }

    public final void w7(int i17, fn2.u1 u1Var, fn2.v1 v1Var, java.lang.String str) {
        boolean z17;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i18;
        boolean z18;
        android.app.Dialog dialog;
        android.view.Window b17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046;
        fn2.s1 s1Var = this.f488636m;
        if (s1Var != null && s1Var.u()) {
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "Unified song panel is already showing, switching to tab: " + v1Var.f345958d);
                s1Var.w(v1Var.f345958d);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "Unified song panel is showing, but need to locate song: " + str + ", reopening panel");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0.i(s1Var, false, 1, null);
            this.f488636m = null;
        }
        fn2.s1 s1Var2 = new fn2.s1(O6(), this, new fn2.t1(i17, u1Var, v1Var, str));
        this.f488636m = s1Var2;
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        s1Var2.C = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        boolean z19 = s1Var2.E;
        jz5.g gVar = s1Var2.f201805z;
        jz5.g gVar2 = s1Var2.f201799t;
        android.content.Context context = s1Var2.f201787e;
        if (!z19) {
            s1Var2.E = true;
            jz5.g gVar3 = s1Var2.f201797r;
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View findViewById = s1Var2.s().findViewById(com.p314xaae8f345.mm.R.id.f568885vg1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            s1Var2.f201791i = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
            jz5.g gVar4 = s1Var2.f201795p;
            android.view.View view = (android.view.View) ((jz5.n) gVar4).mo141623x754a37bb();
            if (view != null) {
                view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m0(s1Var2));
            }
            jz5.g gVar5 = s1Var2.f201796q;
            android.view.View view2 = (android.view.View) ((jz5.n) gVar5).mo141623x754a37bb();
            if (view2 != null) {
                view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n0(s1Var2));
            }
            android.view.View view3 = (android.view.View) ((jz5.n) gVar4).mo141623x754a37bb();
            jz5.g gVar6 = s1Var2.f201801v;
            jz5.g gVar7 = s1Var2.f201802w;
            if (view3 != null) {
                java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar7).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
                ((android.widget.FrameLayout) mo141623x754a37bb2).addView(view3);
                java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar6).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
                android.view.View view4 = (android.view.View) mo141623x754a37bb3;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = (android.view.View) ((jz5.n) gVar5).mo141623x754a37bb();
            if (view5 != null) {
                java.lang.Object mo141623x754a37bb4 = ((jz5.n) s1Var2.f201803x).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
                ((android.widget.FrameLayout) mo141623x754a37bb4).addView(view5);
                java.lang.Object mo141623x754a37bb5 = ((jz5.n) s1Var2.f201804y).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
                ((android.widget.TextView) mo141623x754a37bb5).setVisibility(8);
            }
            java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar6).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
            ((android.view.View) mo141623x754a37bb6).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o0(s1Var2));
            zl2.r4 r4Var = zl2.r4.f555483a;
            java.lang.Object mo141623x754a37bb7 = ((jz5.n) gVar7).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
            zl2.r4.c3(r4Var, (android.widget.FrameLayout) mo141623x754a37bb7, 0, 0, 6, null);
            java.lang.Object mo141623x754a37bb8 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb8, "getValue(...)");
            ((android.widget.RelativeLayout) mo141623x754a37bb8).setVisibility(0);
            android.view.View view6 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            if (view6 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view7 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            if (view7 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = s1Var2.f201791i;
            if (c2718xca2902ff == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            c2718xca2902ff.n();
            java.lang.String[] strArr = s1Var2.H;
            for (java.lang.String str2 : strArr) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = s1Var2.f201791i;
                if (c2718xca2902ff2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                    throw null;
                }
                oa.i l17 = c2718xca2902ff2.l();
                l17.e(str2);
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff3 = s1Var2.f201791i;
                if (c2718xca2902ff3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                    throw null;
                }
                c2718xca2902ff3.b(l17);
            }
            s1Var2.f201792m = new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe(context);
            jz5.g gVar8 = s1Var2.f201800u;
            java.lang.Object mo141623x754a37bb9 = ((jz5.n) gVar8).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb9, "getValue(...)");
            ((android.widget.FrameLayout) mo141623x754a37bb9).addView(s1Var2.t(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            s1Var2.f201794o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f0(s1Var2);
            s1Var2.t().m8315x6cab2c8d(s1Var2.f201794o);
            s1Var2.t().m8321x40341e13(strArr.length);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff4 = s1Var2.f201791i;
            if (c2718xca2902ff4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            c2718xca2902ff4.m20382x3da43a7b(s1Var2.t());
            int length = strArr.length;
            int i19 = 0;
            int i27 = 0;
            while (i19 < length) {
                java.lang.String str3 = strArr[i19];
                int i28 = i27 + 1;
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff5 = s1Var2.f201791i;
                if (c2718xca2902ff5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                    throw null;
                }
                oa.i k17 = c2718xca2902ff5.k(i27);
                if (k17 != null) {
                    k17.e(str3);
                }
                i19++;
                i27 = i28;
            }
            s1Var2.f201793n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w0(s1Var2);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe t17 = s1Var2.t();
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = s1Var2.f201793n;
            if (onPageChangeListener == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageChangeListener");
                throw null;
            }
            t17.m8289xa5a25773(onPageChangeListener);
            s1Var2.t().post(new fn2.r1(s1Var2));
            java.lang.Object mo141623x754a37bb10 = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb10, "getValue(...)");
            java.lang.Object mo141623x754a37bb11 = ((jz5.n) gVar8).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb11, "getValue(...)");
            ((android.widget.FrameLayout) mo141623x754a37bb11).addView((android.view.View) mo141623x754a37bb10);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_scene", s1Var2.G.f345937b.f345950d);
        zl2.r4 r4Var2 = zl2.r4.f555483a;
        if (r4Var2.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409898n2, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.S2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 r17 = s1Var2.r(null);
        if (r17 != null && r17.u()) {
            s1Var2.B = s1Var2.r(r17);
            r4Var2.Q2(s1Var2.s());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = r17.A;
            if (y1Var != null) {
                y1Var.h(s1Var2);
                return;
            }
            return;
        }
        boolean z27 = s1Var2.D;
        float f17 = s1Var2.f201790h;
        if (z27) {
            z17 = false;
        } else {
            s1Var2.D = true;
            r4Var2.Q2(s1Var2.s());
            boolean z28 = s1Var2.f201788f;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context, 0, false, z28);
            s1Var2.A = y1Var2;
            y1Var2.k(s1Var2.s());
            y1Var2.p(true);
            y1Var2.f293566o = true;
            if (r4Var2.Y1(context)) {
                y1Var2.m(java.lang.Boolean.TRUE);
                y1Var2.G = true;
            }
            y1Var2.i(true);
            y1Var2.F = true;
            z17 = false;
            y1Var2.f293577z = false;
            y1Var2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k0(s1Var2));
            y1Var2.f293570s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l0(s1Var2);
            android.view.Window b18 = y1Var2.b();
            if (b18 != null) {
                b18.setSoftInputMode(48);
            }
            android.view.View view8 = y1Var2.f293560f;
            if (view8 != null && (layoutParams = view8.getLayoutParams()) != null) {
                if (!(f17 == -1.0f)) {
                    layoutParams.height = (int) ((com.p314xaae8f345.mm.ui.bl.b(context).y - com.p314xaae8f345.mm.ui.bl.c(context)) * f17);
                }
            }
            if (context.getResources().getConfiguration().orientation == 2) {
                int b19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.b(context);
                android.view.ViewGroup.LayoutParams layoutParams2 = y1Var2.f293560f.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = b19;
                    layoutParams2.height = b19 - com.p314xaae8f345.mm.ui.bl.h(context);
                }
                y1Var2.A = b19;
                if (z28) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = y1Var2.f293560f.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.bl.h(context);
                    }
                }
            }
        }
        java.lang.Object mo141623x754a37bb12 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb12, "getValue(...)");
        if (((android.widget.RelativeLayout) mo141623x754a37bb12).getVisibility() == 0 ? true : z17) {
            java.lang.Object mo141623x754a37bb13 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb13, "getValue(...)");
            i18 = ((android.widget.RelativeLayout) mo141623x754a37bb13).getLayoutParams().height;
        } else {
            i18 = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams().height;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = s1Var2.A;
        if (y1Var3 != null && (c2690x46972046 = y1Var3.f293569r) != null) {
            if (!(f17 == -1.0f ? true : z17)) {
                c2690x46972046.C(((int) (com.p314xaae8f345.mm.ui.bl.b(context).y * f17)) + i18);
            }
            c2690x46972046.D(3);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var4 = s1Var2.A;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x469720462 = y1Var4 != null ? y1Var4.f293569r : null;
        if (c2690x469720462 == null) {
            z18 = true;
        } else {
            z18 = true;
            c2690x469720462.f125977q = true;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x469720463 = y1Var4 != null ? y1Var4.f293569r : null;
        if (c2690x469720463 != null) {
            c2690x469720463.D(3);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var5 = s1Var2.A;
        if ((y1Var5 == null || y1Var5.f()) ? z17 : z18) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var6 = s1Var2.A;
            if (y1Var6 != null && (b17 = y1Var6.b()) != null) {
                b17.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575680ff);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var7 = s1Var2.A;
            if (y1Var7 != null) {
                y1Var7.s();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var8 = s1Var2.A;
            if (y1Var8 == null || (dialog = y1Var8.f293558d) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.a(dialog, context);
        }
    }

    public final void x7(java.lang.String songMid, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        f7().k(songMid, z17, z18);
    }
}
