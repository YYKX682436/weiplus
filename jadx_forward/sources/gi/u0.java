package gi;

/* loaded from: classes12.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f353656a = true;

    /* renamed from: b, reason: collision with root package name */
    public static long f353657b;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map a(java.lang.String r12, gi.p1 r13) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.u0.a(java.lang.String, gi.p1):java.util.Map");
    }

    public static java.util.Map b(wh.n1 n1Var, final uh.g gVar, final rh.c1 c1Var, final m3.a aVar) {
        if (c1Var != null) {
            c1Var.u(uh.g.class, new gi.C28393x6871bb1());
        }
        final r.a aVar2 = new r.a() { // from class: gi.u0$$w
            @Override // r.a
            /* renamed from: apply */
            public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                ((m3.a) obj).mo3938xab27b508(linkedHashMap);
                m3.a aVar3 = m3.a.this;
                if (aVar3 != null) {
                    aVar3.mo3938xab27b508(linkedHashMap);
                }
                return linkedHashMap;
            }
        };
        return (java.util.Map) aVar2.mo1850x58b836e(new m3.a() { // from class: gi.u0$$c0
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                final java.lang.String str;
                boolean z17;
                final java.lang.String str2;
                final rh.c1 c1Var2 = c1Var;
                java.util.Map map = (java.util.Map) obj;
                final uh.g gVar2 = uh.g.this;
                final double doubleValue = ((java.lang.Double) gVar2.f509216g.f477085a).doubleValue();
                boolean z18 = doubleValue < 0.0d || ((java.lang.Long) gVar2.f509246v.f477085a).longValue() < 0 || ((java.lang.Long) gVar2.f509248w.f477085a).longValue() < 0;
                m3.a aVar3 = new m3.a() { // from class: gi.u0$$e0
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj2) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        uh.g gVar3 = gVar2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p((((java.lang.Long) gVar3.f509246v.f477085a).longValue() < 0 || ((java.lang.Long) gVar3.f509248w.f477085a).longValue() < 0 || (((java.lang.Long) gVar3.f509246v.f477085a).longValue() == 0 && ((java.lang.Long) gVar3.f509248w.f477085a).longValue() == 0)) ? 0.0d : doubleValue, 2)));
                        map2.put("usr", gVar3.f509246v.f477085a);
                        map2.put("sys", gVar3.f509248w.f477085a);
                    }
                };
                r.a aVar4 = aVar2;
                map.put("power-cpu", aVar4.mo1850x58b836e(aVar3));
                final double doubleValue2 = ((java.lang.Double) gVar2.f509242t.f477085a).doubleValue();
                if (doubleValue2 < 0.0d) {
                    z18 = true;
                }
                map.put("power-idle", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$h
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj2) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue2, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("realMs", gVar3.f509250x.f477085a);
                        map2.put("upMs", gVar3.f509252y.f477085a);
                        map2.put("offRealMs", gVar3.f509254z.f477085a);
                        map2.put("offUpMs", gVar3.A.f477085a);
                    }
                }));
                final double doubleValue3 = ((java.lang.Double) gVar2.f509218h.f477085a).doubleValue();
                final boolean z19 = doubleValue3 < 0.0d ? true : z18;
                map.put("power-wakelock", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$i
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj2) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue3, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("full", gVar3.f509208b0.f477085a);
                        map2.put("partial", gVar3.f509207a0.f477085a);
                        map2.put("window", gVar3.f509209c0.f477085a);
                        map2.put("draw", gVar3.f509211d0.f477085a);
                        map2.put("pidSum", gVar3.f509213e0.f477085a);
                    }
                }));
                java.util.Iterator it = java.util.Arrays.asList("power-mobile-radio", "power-mobile-controller", "power-mobile-packet", "power-mobile-statByte", "power-mobile-statPacket").iterator();
                final double d17 = 0.0d;
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    java.lang.String str3 = (java.lang.String) it.next();
                    java.lang.Object obj2 = gVar2.f509214f.get(str3);
                    double doubleValue4 = obj2 instanceof java.lang.Double ? ((java.lang.Double) obj2).doubleValue() : 0.0d;
                    if (doubleValue4 > 0.0d) {
                        java.lang.String substring = str3.substring(str3.lastIndexOf("-") + 1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HealthStatsHelper", "estimate mobile: " + substring);
                        d17 = doubleValue4;
                        str = substring;
                        break;
                    }
                    d17 = doubleValue4;
                }
                map.put("power-mobile", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$j
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj3) {
                        final java.util.Map map2 = (java.util.Map) obj3;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(d17, 2)));
                        map2.put("type", str);
                        uh.g gVar3 = gVar2;
                        map2.put("radioActive", gVar3.C.f477085a);
                        map2.put("idleMs", gVar3.D.f477085a);
                        map2.put("rxMs", gVar3.E.f477085a);
                        map2.put("txMs", gVar3.F.f477085a);
                        map2.put("rxByte", gVar3.G.f477085a);
                        map2.put("txByte", gVar3.H.f477085a);
                        map2.put("rxPacket", gVar3.I.f477085a);
                        map2.put("txPacket", gVar3.f509206J.f477085a);
                        rh.c1 c1Var3 = c1Var2;
                        if (c1Var3 != null) {
                            c1Var3.u(rh.n3.class, new wh.t0() { // from class: gi.u0$$y
                                @Override // wh.t0
                                /* renamed from: accept */
                                public final void mo40853xab27b508(java.lang.Object obj4) {
                                    rh.o2 o2Var = (rh.o2) obj4;
                                    java.lang.Number number = ((rh.n3) o2Var.f477019c).f477007h.f477085a;
                                    java.util.Map map3 = map2;
                                    map3.put("rxByteSys", number);
                                    rh.n3 n3Var = (rh.n3) o2Var.f477019c;
                                    map3.put("txByteSys", n3Var.f477008i.f477085a);
                                    map3.put("rxPacketSys", n3Var.f477009j.f477085a);
                                    map3.put("txPacketSys", n3Var.f477010k.f477085a);
                                }
                            });
                        }
                    }
                }));
                java.util.Iterator it6 = java.util.Arrays.asList("power-wifi-controller", "power-wifi-packet", "power-wifi-statByte", "power-wifi-statPacket").iterator();
                final double d18 = 0.0d;
                while (true) {
                    if (!it6.hasNext()) {
                        z17 = true;
                        str2 = "";
                        break;
                    }
                    java.lang.String str4 = (java.lang.String) it6.next();
                    java.lang.Object obj3 = gVar2.f509214f.get(str4);
                    double doubleValue5 = obj3 instanceof java.lang.Double ? ((java.lang.Double) obj3).doubleValue() : 0.0d;
                    if (doubleValue5 > 0.0d) {
                        z17 = true;
                        java.lang.String substring2 = str4.substring(str4.lastIndexOf("-") + 1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HealthStatsHelper", "estimate wifi: " + substring2);
                        d18 = doubleValue5;
                        str2 = substring2;
                        break;
                    }
                    d18 = doubleValue5;
                }
                map.put("power-wifi", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$k
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        final java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(d18, 2)));
                        map2.put("type", str2);
                        uh.g gVar3 = gVar2;
                        map2.put("idleMs", gVar3.L.f477085a);
                        map2.put("rxMs", gVar3.M.f477085a);
                        map2.put("txMs", gVar3.N.f477085a);
                        map2.put("runMs", gVar3.O.f477085a);
                        map2.put("lockMs", gVar3.P.f477085a);
                        map2.put("scanMs", gVar3.Q.f477085a);
                        map2.put("castMs", gVar3.R.f477085a);
                        map2.put("rxByte", gVar3.S.f477085a);
                        map2.put("txByte", gVar3.T.f477085a);
                        map2.put("rxPacket", gVar3.U.f477085a);
                        map2.put("txPacket", gVar3.V.f477085a);
                        rh.c1 c1Var3 = c1Var2;
                        if (c1Var3 != null) {
                            c1Var3.u(rh.n3.class, new wh.t0() { // from class: gi.u0$$z
                                @Override // wh.t0
                                /* renamed from: accept */
                                public final void mo40853xab27b508(java.lang.Object obj5) {
                                    rh.o2 o2Var = (rh.o2) obj5;
                                    java.lang.Number number = ((rh.n3) o2Var.f477019c).f477003d.f477085a;
                                    java.util.Map map3 = map2;
                                    map3.put("rxByteSys", number);
                                    rh.n3 n3Var = (rh.n3) o2Var.f477019c;
                                    map3.put("txByteSys", n3Var.f477004e.f477085a);
                                    map3.put("rxPacketSys", n3Var.f477005f.f477085a);
                                    map3.put("txPacketSys", n3Var.f477006g.f477085a);
                                }
                            });
                        }
                    }
                }));
                final double doubleValue6 = ((java.lang.Double) gVar2.f509224k.f477085a).doubleValue();
                if (doubleValue6 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-bluetooth", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$m
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue6, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("mams", gVar3.W.f477085a);
                        map2.put("idle", gVar3.X.f477085a);
                        map2.put("rx", gVar3.Y.f477085a);
                        map2.put("tx", gVar3.Z.f477085a);
                    }
                }));
                final double doubleValue7 = ((java.lang.Double) gVar2.f509226l.f477085a).doubleValue();
                if (doubleValue7 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-gps", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$n
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue7, 2)));
                        map2.put("time", gVar2.f509215f0.f477085a);
                    }
                }));
                final double doubleValue8 = ((java.lang.Double) gVar2.f509228m.f477085a).doubleValue();
                if (doubleValue8 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-sensors", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$o
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue8, 2)));
                        map2.put("mams", gVar2.f509217g0.f477085a);
                    }
                }));
                final double doubleValue9 = ((java.lang.Double) gVar2.f509230n.f477085a).doubleValue();
                if (doubleValue9 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-camera", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$p
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue9, 2)));
                        map2.put("time", gVar2.f509219h0.f477085a);
                    }
                }));
                final double doubleValue10 = ((java.lang.Double) gVar2.f509232o.f477085a).doubleValue();
                if (doubleValue10 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-flashlight", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$q
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue10, 2)));
                        map2.put("time", gVar2.f509221i0.f477085a);
                    }
                }));
                final double doubleValue11 = ((java.lang.Double) gVar2.f509234p.f477085a).doubleValue();
                if (doubleValue11 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-audio", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$f0
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue11, 2)));
                        map2.put("time", gVar2.f509223j0.f477085a);
                    }
                }));
                final double doubleValue12 = ((java.lang.Double) gVar2.f509236q.f477085a).doubleValue();
                if (doubleValue12 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-video", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$g0
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue12, 2)));
                        map2.put("time", gVar2.f509225k0.f477085a);
                    }
                }));
                final double doubleValue13 = ((java.lang.Double) gVar2.f509238r.f477085a).doubleValue();
                if (doubleValue13 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-screen", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$h0
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue13, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("topMs", gVar3.f509233o0.f477085a);
                        map2.put("fgActMs", gVar3.f509231n0.f477085a);
                        map2.put("procFgMs", gVar3.f509237q0.f477085a);
                        map2.put("procBgMs", gVar3.f509241s0.f477085a);
                    }
                }));
                final double doubleValue14 = ((java.lang.Double) gVar2.f509240s.f477085a).doubleValue();
                if (doubleValue14 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-sysSrv", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$i0
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        uh.g gVar3 = gVar2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p((((java.lang.Long) gVar3.f509227l0.f477085a).longValue() < 0 || ((java.lang.Long) gVar3.f509229m0.f477085a).longValue() < 0 || (((java.lang.Long) gVar3.f509227l0.f477085a).longValue() == 0 && ((java.lang.Long) gVar3.f509229m0.f477085a).longValue() == 0)) ? 0.0d : doubleValue14, 2)));
                        map2.put("jobsMs", gVar3.f509227l0.f477085a);
                        map2.put("syncMs", gVar3.f509229m0.f477085a);
                    }
                }));
                final double d19 = gVar2.d();
                map.put("power-total", aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$b
                    @Override // m3.a
                    /* renamed from: accept */
                    public final void mo3938xab27b508(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(d19, 2)));
                        map2.put("negative", java.lang.Boolean.valueOf(z19));
                    }
                }));
                if (gVar2.f476897b && c1Var2 != null && mm.o.f()) {
                    for (java.util.Map.Entry entry : gVar2.f509214f.entrySet()) {
                        java.lang.String str5 = (java.lang.String) entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if (str5.startsWith("power-mobile") && (value instanceof java.lang.Double)) {
                            final double doubleValue15 = ((java.lang.Double) value).doubleValue();
                            map.put(str5, aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$c
                                @Override // m3.a
                                /* renamed from: accept */
                                public final void mo3938xab27b508(java.lang.Object obj4) {
                                    ((java.util.Map) obj4).put("power", java.lang.Double.valueOf(uh.i.p(doubleValue15, 2)));
                                }
                            }));
                        }
                        if (str5.startsWith("power-wifi") && (value instanceof java.lang.Double)) {
                            final double doubleValue16 = ((java.lang.Double) value).doubleValue();
                            map.put(str5, aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$d
                                @Override // m3.a
                                /* renamed from: accept */
                                public final void mo3938xab27b508(java.lang.Object obj4) {
                                    ((java.util.Map) obj4).put("power", java.lang.Double.valueOf(uh.i.p(doubleValue16, 2)));
                                }
                            }));
                        }
                    }
                    java.util.List<java.lang.String> asList = java.util.Arrays.asList("JiffyUid", "TimeUid");
                    final r.a aVar5 = new r.a() { // from class: gi.u0$$e
                        @Override // r.a
                        /* renamed from: apply */
                        public final java.lang.Object mo1850x58b836e(java.lang.Object obj4) {
                            double doubleValue17 = ((java.lang.Double) obj4).doubleValue();
                            uh.g gVar3 = uh.g.this;
                            return java.lang.Double.valueOf(doubleValue17 + ((java.lang.Double) gVar3.f509218h.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509220i.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509222j.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509224k.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509226l.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509228m.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509232o.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509234p.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509236q.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509238r.f477085a).doubleValue() + ((java.lang.Double) gVar3.f509242t.f477085a).doubleValue());
                        }
                    };
                    for (java.lang.String str6 : asList) {
                        java.lang.Object obj4 = gVar2.f509214f.get(str6);
                        if (obj4 != null && (obj4 instanceof java.util.Map)) {
                            for (java.util.Map.Entry entry2 : ((java.util.Map) obj4).entrySet()) {
                                java.lang.String valueOf = java.lang.String.valueOf(entry2.getKey());
                                java.lang.Object value2 = entry2.getValue();
                                if (valueOf.startsWith("power-cpu") && (value2 instanceof java.lang.Double)) {
                                    final double doubleValue17 = ((java.lang.Double) value2).doubleValue();
                                    map.put(valueOf + str6, aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$f
                                        @Override // m3.a
                                        /* renamed from: accept */
                                        public final void mo3938xab27b508(java.lang.Object obj5) {
                                            ((java.util.Map) obj5).put("power", java.lang.Double.valueOf(uh.i.p(doubleValue17, 2)));
                                        }
                                    }));
                                    map.put(valueOf.replace("power-cpu", "power-total") + str6, aVar4.mo1850x58b836e(new m3.a() { // from class: gi.u0$$g
                                        @Override // m3.a
                                        /* renamed from: accept */
                                        public final void mo3938xab27b508(java.lang.Object obj5) {
                                            ((java.util.Map) obj5).put("power", java.lang.Double.valueOf(uh.i.p(((java.lang.Double) r.a.this.mo1850x58b836e(java.lang.Double.valueOf(doubleValue17))).doubleValue(), 2)));
                                        }
                                    }));
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public static void c(android.content.Context context) {
        ph.u uVar;
        rh.e3 i17;
        synchronized (gi.u0.class) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HealthStatsHelper", "dump");
                f353657b = java.lang.System.currentTimeMillis();
                android.os.health.HealthStats m17 = uh.i.m(context);
                g("root", m17, new gi.C28380xca5c59a7());
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
                cr0.r2.f303267a.c(m17);
                if (ih.d.c() && (uVar = (ph.u) ih.d.d().a(ph.u.class)) != null && (i17 = uVar.f435829h.i(uh.h.class)) != null) {
                    f(context, ((uh.h) i17).k(), null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HealthStatsHelper", "skip dump");
            }
        }
    }

    public static void d(android.content.Context context) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = 30;
        try {
            if (((e42.e0) i95.n0.c(e42.e0.class)) != null) {
                i17 = java.lang.Math.max(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(j62.e.g().a("clicfg_battery_stats_dump", java.lang.String.valueOf(30), false, true), 0), 1);
            }
        } catch (java.lang.Exception unused) {
        }
        long j17 = i17 * com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        if (currentTimeMillis - f353657b > j17) {
            synchronized (gi.u0.class) {
                if (currentTimeMillis - f353657b > j17) {
                    c(context);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(wh.n1 r18) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.u0.e(wh.n1):void");
    }

    public static void f(final android.content.Context context, final uh.g gVar, final rh.c1 c1Var) {
        try {
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference("");
            if (c1Var == null && !gVar.f476897b) {
                atomicReference.set("curr");
            } else if (c1Var != null && gVar.f476897b) {
                c1Var.q(new wh.t0() { // from class: gi.u0$$r
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj) {
                        atomicReference.set("avgPower" + ri.i.c(c1Var) + "_" + ((qh.b) obj).e());
                    }
                });
            }
            if (android.text.TextUtils.isEmpty((java.lang.CharSequence) atomicReference.get())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HealthStatsHelper", "skip invalid scope");
                return;
            }
            final boolean z17 = c1Var != null && "topShell".equals(c1Var.f476870s);
            final gi.C28400x6871bb8 c28400x6871bb8 = new gi.C28400x6871bb8();
            final gi.C28401x6871bb9 c28401x6871bb9 = new gi.C28401x6871bb9();
            ph.a.b(rh.k1.class, new wh.t0() { // from class: gi.u0$$u
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    android.os.health.HealthStats healthStats;
                    wh.n1 n1Var = ((rh.k1) obj).f476968k;
                    if (n1Var == null || !n1Var.l()) {
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("estimatePower ");
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                    sb6.append((java.lang.String) atomicReference2.get());
                    sb6.append(": ");
                    r.a aVar = c28400x6871bb8;
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(""));
                    sb6.append("cpuPower=");
                    uh.g gVar2 = gVar;
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509216g.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("wakelocksPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509218h.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("mobilePower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509220i.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("wifiPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509222j.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("blueToothPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509224k.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("gpsPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509226l.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("sensorsPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509228m.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("cameraPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509230n.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("flashLightPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509232o.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("audioPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509234p.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("videoPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509236q.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("screenPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509238r.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("systemServicePower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509240s.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("idlePower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f509242t.f477085a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("totalPower=");
                    sb6.append(uh.i.p(gVar2.d(), 2));
                    sb6.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb6.append("capacity=");
                    sb6.append(uh.i.p(wh.m.f(context), 2));
                    sb6.append("");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HealthStatsHelper", sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("estimateMeta ");
                    sb7.append((java.lang.String) atomicReference2.get());
                    sb7.append(": ");
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(""));
                    sb7.append("cpuPowerMams=");
                    java.lang.Number number = gVar2.f509244u.f477085a;
                    r.a aVar2 = c28401x6871bb9;
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(number));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("cpuUsrTimeMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509246v.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("cpuSysTimeMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509248w.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("realTimeMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509250x.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("upTimeMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509252y.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("offRealTimeMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509254z.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("offUpTimeMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.A.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobilePowerMams=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.B.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileRadioActiveMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.C.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileIdleMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.D.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileRxMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.E.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileTxMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.F.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileRxBytes=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.G.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileTxBytes=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.H.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileRxPackets=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.I.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("mobileTxPackets=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509206J.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiPowerMams=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.K.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiIdleMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.L.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiRxMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.M.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiTxMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.N.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiRunningMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.O.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiLockMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.P.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiScanMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.Q.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiMulticastMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.R.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiRxBytes=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.S.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiTxBytes=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.T.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiRxPackets=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.U.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wifiTxPackets=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.V.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("blueToothPowerMams=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.W.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("blueToothIdleMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.X.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("blueToothRxMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.Y.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("blueToothTxMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.Z.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wakelocksPartialMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509207a0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wakelocksFullMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509208b0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wakelocksWindowMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509209c0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wakelocksDrawMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509211d0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("wakelocksPidSum=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509213e0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("gpsMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509215f0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("sensorsPowerMams=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509217g0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("cameraMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509219h0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("flashLightMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509221i0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("audioMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509223j0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("videoMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509225k0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("jobsMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509227l0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("syncMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509229m0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("fgActMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509231n0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("procTopAppMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509233o0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("procTopSleepMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509235p0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("procFgMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509237q0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("procFgSrvMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509239r0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("procBgMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509241s0.f477085a));
                    sb7.append((java.lang.String) aVar.mo1850x58b836e(","));
                    sb7.append("procCacheMs=");
                    sb7.append((java.lang.String) aVar2.mo1850x58b836e(gVar2.f509243t0.f477085a));
                    sb7.append("");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HealthStatsHelper", sb7.toString());
                    if (z17 || (healthStats = gVar2.f509212e) == null) {
                        return;
                    }
                    java.lang.String concat = (!healthStats.hasMeasurement(10064) || healthStats.getMeasurement(10064) <= 0) ? "" : "".concat("cpuMams");
                    if (healthStats.hasMeasurement(10027) && healthStats.getMeasurement(10027) > 0) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(concat);
                        sb8.append(concat.length() == 0 ? "" : ";");
                        sb8.append("mobileMams");
                        concat = sb8.toString();
                    }
                    if (healthStats.hasMeasurement(10019) && healthStats.getMeasurement(10019) > 0) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(concat);
                        sb9.append(concat.length() == 0 ? "" : ";");
                        sb9.append("wifiMams");
                        concat = sb9.toString();
                    }
                    if (healthStats.hasMeasurement(10023) && healthStats.getMeasurement(10023) > 0) {
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        sb10.append(concat);
                        sb10.append(concat.length() != 0 ? ";" : "");
                        sb10.append("bleMams");
                        concat = sb10.toString();
                    }
                    if (!android.text.TextUtils.isEmpty(concat) || mm.o.c()) {
                        ap.a.a(1, "etmPower", null, gi.u0.b(n1Var, gVar2, null, null), java.lang.String.valueOf(gVar2.d()), concat);
                    }
                }
            });
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HealthStatsHelper", "load powerProfile err: " + th6.getMessage());
        }
    }

    public static void g(java.lang.String str, android.os.health.HealthStats healthStats, r.a aVar) {
        if (healthStats == null || ((java.lang.Boolean) aVar.mo1850x58b836e(new m3.d(str, healthStats))).booleanValue()) {
            return;
        }
        int statsKeyCount = healthStats.getStatsKeyCount();
        for (int i17 = 0; i17 < statsKeyCount; i17++) {
            int statsKeyAt = healthStats.getStatsKeyAt(i17);
            if (healthStats.hasStats(statsKeyAt)) {
                for (java.util.Map.Entry<java.lang.String, android.os.health.HealthStats> entry : healthStats.getStats(statsKeyAt).entrySet()) {
                    g(str + "-" + entry.getKey(), entry.getValue(), aVar);
                }
            }
        }
    }
}
