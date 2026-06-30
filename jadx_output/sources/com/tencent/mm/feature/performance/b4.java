package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class b4 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f67532a;

    public b4(java.lang.StringBuilder sb6, r.a aVar, r.a aVar2) {
        this.f67532a = sb6;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        uh.h feat = (uh.h) obj;
        kotlin.jvm.internal.o.g(feat, "feat");
        ((com.tencent.mm.feature.performance.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
        long Ri = ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
        com.tencent.mm.feature.performance.d4 d4Var = com.tencent.mm.feature.performance.d4.f67555a;
        java.lang.String str = "\n";
        java.lang.StringBuilder sb6 = this.f67532a;
        if (Ri > 0) {
            sb6.append("[chargeLast] ");
            long longValue = java.lang.Long.valueOf(Ri).longValue();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
            sb6.append(new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.getDefault()).format(new java.util.Date(longValue)));
            sb6.append("\n");
            sb6.append("[chargeLast] ");
            sb6.append((java.lang.String) d4Var.apply(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - Ri)));
            sb6.append(" ago\n");
        }
        uh.g k17 = feat.k();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Map procStatsCpuSysTimeMs = k17.f427714v0;
        kotlin.jvm.internal.o.f(procStatsCpuSysTimeMs, "procStatsCpuSysTimeMs");
        for (java.util.Map.Entry entry : procStatsCpuSysTimeMs.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            rh.x2 x2Var = (rh.x2) entry.getValue();
            kotlin.jvm.internal.o.d(str2);
            java.lang.Object obj2 = hashMap.get(str2);
            if (obj2 == null) {
                obj2 = new com.tencent.mm.feature.performance.n3(0L, 0L, 0L, 0L, 0L, 31, null);
                hashMap.put(str2, obj2);
            }
            java.lang.Number number = x2Var.f395552a;
            kotlin.jvm.internal.o.f(number, "get(...)");
            ((com.tencent.mm.feature.performance.n3) obj2).f67613a = number.longValue();
        }
        java.util.Map procStatsCpuUsrTimeMs = k17.f427712u0;
        kotlin.jvm.internal.o.f(procStatsCpuUsrTimeMs, "procStatsCpuUsrTimeMs");
        for (java.util.Iterator it = procStatsCpuUsrTimeMs.entrySet().iterator(); it.hasNext(); it = it) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            java.lang.String str3 = (java.lang.String) entry2.getKey();
            rh.x2 x2Var2 = (rh.x2) entry2.getValue();
            kotlin.jvm.internal.o.d(str3);
            java.lang.Object obj3 = hashMap.get(str3);
            if (obj3 == null) {
                obj3 = new com.tencent.mm.feature.performance.n3(0L, 0L, 0L, 0L, 0L, 31, null);
                hashMap.put(str3, obj3);
            }
            java.lang.Number number2 = x2Var2.f395552a;
            kotlin.jvm.internal.o.f(number2, "get(...)");
            ((com.tencent.mm.feature.performance.n3) obj3).f67614b = number2.longValue();
        }
        java.util.Map procStatsStartCount = k17.f427718x0;
        kotlin.jvm.internal.o.f(procStatsStartCount, "procStatsStartCount");
        for (java.util.Iterator it6 = procStatsStartCount.entrySet().iterator(); it6.hasNext(); it6 = it6) {
            java.util.Map.Entry entry3 = (java.util.Map.Entry) it6.next();
            java.lang.String str4 = (java.lang.String) entry3.getKey();
            rh.x2 x2Var3 = (rh.x2) entry3.getValue();
            kotlin.jvm.internal.o.d(str4);
            java.lang.Object obj4 = hashMap.get(str4);
            if (obj4 == null) {
                obj4 = new com.tencent.mm.feature.performance.n3(0L, 0L, 0L, 0L, 0L, 31, null);
                hashMap.put(str4, obj4);
            }
            java.lang.Number number3 = x2Var3.f395552a;
            kotlin.jvm.internal.o.f(number3, "get(...)");
            ((com.tencent.mm.feature.performance.n3) obj4).f67615c = number3.longValue();
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && Ri > 0) {
            java.util.List c17 = dr0.p1.f242489d.a().c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj5 : c17) {
                if (((android.app.ApplicationExitInfo) obj5).getTimestamp() >= Ri) {
                    arrayList.add(obj5);
                }
            }
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                java.lang.String processName = ((android.app.ApplicationExitInfo) it7.next()).getProcessName();
                kotlin.jvm.internal.o.f(processName, "getProcessName(...)");
                java.lang.Object obj6 = hashMap.get(processName);
                if (obj6 == null) {
                    obj6 = new com.tencent.mm.feature.performance.n3(0L, 0L, 0L, 0L, 0L, 31, null);
                    hashMap.put(processName, obj6);
                }
                ((com.tencent.mm.feature.performance.n3) obj6).f67616d++;
            }
        }
        int i17 = 4;
        java.util.Set<java.lang.String> stringSet = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("acc-proc-life-stats.sp", 4).getStringSet("processList", kz5.r0.f314002d);
        if (stringSet != null) {
            sb6.append("[proc] ");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(stringSet, 10));
            java.util.Iterator<T> it8 = stringSet.iterator();
            while (it8.hasNext()) {
                arrayList2.add(ri.i.g((java.lang.String) it8.next()));
            }
            java.util.Set X0 = kz5.n0.X0(arrayList2);
            sb7.append(X0.size() + ": " + kz5.n0.g0(X0, ",", null, null, 0, null, null, 62, null));
            sb7.append('\n');
            sb6.append(sb7.toString());
            for (java.lang.String str5 : stringSet) {
                android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("full-charge-proc-life-cpu-stats.sp." + ri.i.g(str5), i17);
                long j17 = sharedPreferences.getLong("jiffies", 0L);
                java.lang.Object obj7 = hashMap.get(str5);
                if (obj7 == null) {
                    obj7 = new com.tencent.mm.feature.performance.n3(0L, 0L, 0L, 0L, 0L, 31, null);
                    hashMap.put(str5, obj7);
                }
                com.tencent.mm.feature.performance.d4 d4Var2 = d4Var;
                ((com.tencent.mm.feature.performance.n3) obj7).f67617e = 10 * j17;
                java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
                if (all != null) {
                    for (java.util.Map.Entry<java.lang.String, ?> entry4 : all.entrySet()) {
                        java.lang.String key = entry4.getKey();
                        java.lang.Object value = entry4.getValue();
                        kotlin.jvm.internal.o.d(key);
                        if (r26.i0.y(key, "jiffies-", false)) {
                            java.lang.String substring = key.substring(r26.n0.L(key, "jiffies-", 0, false, 6, null) + 8);
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                            kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((java.lang.Long) value).longValue();
                            java.lang.Long l17 = (java.lang.Long) hashMap2.get(substring);
                            if (l17 == null) {
                                l17 = 0L;
                            }
                            hashMap2.put(substring, java.lang.Long.valueOf(l17.longValue() + longValue2));
                        }
                    }
                }
                d4Var = d4Var2;
                i17 = 4;
            }
        }
        com.tencent.mm.feature.performance.d4 d4Var3 = d4Var;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[time] ");
        long longValue3 = k17.f427698n0.f395552a.longValue();
        long j18 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        sb8.append(longValue3 / j18);
        sb8.append(", ");
        sb8.append(k17.f427700o0.f395552a.longValue() / j18);
        sb8.append(", ");
        sb8.append(k17.f427702p0.f395552a.longValue() / j18);
        sb8.append(", ");
        sb8.append(k17.f427704q0.f395552a.longValue() / j18);
        sb8.append(", ");
        sb8.append(k17.f427706r0.f395552a.longValue() / j18);
        sb8.append(", ");
        sb8.append(k17.f427708s0.f395552a.longValue() / j18);
        sb8.append(", ");
        sb8.append(k17.f427710t0.f395552a.longValue() / j18);
        sb8.append('\n');
        sb6.append(sb8.toString());
        sb6.append("[impt] ");
        java.util.Set<java.util.Map.Entry> entrySet = hashMap2.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(entrySet, 10));
        for (java.util.Map.Entry entry5 : entrySet) {
            kotlin.jvm.internal.o.d(entry5);
            arrayList3.add(((java.lang.String) entry5.getKey()) + '=' + ((((java.lang.Long) entry5.getValue()).longValue() * 10) / j18));
            str = str;
        }
        sb6.append(kz5.n0.g0(kz5.n0.S0(arrayList3), " ", null, null, 0, null, null, 62, null));
        sb6.append(str);
        java.lang.String format = java.lang.String.format("[totl] " + ((java.lang.String) d4Var3.apply(k17.f427715w.f395552a)) + ", " + ((java.lang.String) d4Var3.apply(k17.f427713v.f395552a)) + '\n', java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        for (java.util.Map.Entry entry6 : kz5.c1.q(kz5.n0.F0(kz5.e1.v(hashMap), new com.tencent.mm.feature.performance.a4())).entrySet()) {
            java.lang.String str6 = (java.lang.String) entry6.getKey();
            com.tencent.mm.feature.performance.n3 n3Var = (com.tencent.mm.feature.performance.n3) entry6.getValue();
            java.lang.String F0 = kotlin.jvm.internal.o.b(str6, com.tencent.mm.sdk.platformtools.w9.f193053a) ? com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM : r26.p0.F0(str6, 4);
            sb6.append("[" + F0 + "] " + ((java.lang.String) d4Var3.apply(java.lang.Long.valueOf(n3Var.f67613a))) + ", " + ((java.lang.String) d4Var3.apply(java.lang.Long.valueOf(n3Var.f67614b))) + ", " + ((java.lang.String) d4Var3.apply(java.lang.Long.valueOf(n3Var.f67617e))) + ", " + n3Var.f67615c + '-' + n3Var.f67616d + '\n');
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("proc: ");
            sb9.append(F0);
            sb9.append(", ProcStats=");
            sb9.append(n3Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", sb9.toString());
        }
        dr0.m mVar = (dr0.m) ((lh.k) i95.n0.c(lh.k.class));
        mVar.getClass();
        mVar.Ni(new dr0.g(mVar));
        cr0.j a17 = cr0.j.f221654j.a();
        sb6.append("[bind] " + a17.f221789f.f395552a + '-' + (a17.f221790g.f395552a.longValue() / j18) + "mn of " + (a17.f221787d.f395552a.longValue() / j18) + "mn\n");
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[rank] ");
        java.util.List b17 = a17.b();
        int size = a17.b().size();
        if (size > 3) {
            size = 3;
        }
        sb10.append(kz5.n0.g0(b17.subList(0, size), ", ", null, null, 0, null, new com.tencent.mm.feature.performance.w3(a17), 30, null));
        sb10.append('\n');
        sb6.append(sb10.toString());
        sb6.append("[rate] " + kz5.n0.g0(kz5.e1.v(a17.d()), ", ", null, null, 0, null, com.tencent.mm.feature.performance.x3.f67774d, 30, null) + '\n');
        cr0.p a18 = cr0.p.f221705m.a();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[net ] ");
        long j19 = (long) 1048576;
        sb11.append(a18.f221637g.f395552a.longValue() / j19);
        sb11.append("MB-");
        sb11.append(a18.f221638h.f395552a.longValue() / j19);
        sb11.append("MB of ");
        sb11.append(a18.f221634d.f395552a.longValue() / j18);
        sb11.append("mn\n");
        sb6.append(sb11.toString());
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[rank] ");
        java.util.List list = a18.f221639i;
        int size2 = list.size();
        sb12.append(kz5.n0.g0(list.subList(0, size2 > 3 ? 3 : size2), ", ", null, null, 0, null, new com.tencent.mm.feature.performance.y3(a18), 30, null));
        sb12.append('\n');
        sb6.append(sb12.toString());
        sb6.append("[rate] " + kz5.n0.g0(kz5.e1.v(a18.e()), ", ", null, null, 0, null, com.tencent.mm.feature.performance.z3.f67787d, 30, null) + '\n');
    }
}
