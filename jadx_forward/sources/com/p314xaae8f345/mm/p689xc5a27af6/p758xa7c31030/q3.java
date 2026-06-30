package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f149170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f149171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f149172g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f149173h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f149174i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f149175m;

    public q3(long j17, long j18, long j19, long j27, long j28, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4 r4Var, java.lang.String str, long j29, long j37) {
        this.f149169d = j17;
        this.f149170e = j18;
        this.f149171f = j19;
        this.f149172g = j27;
        this.f149173h = j28;
        this.f149174i = j29;
        this.f149175m = j37;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        dr0.t0 t0Var = dr0.t0.f324073k;
        java.lang.String PROCESS_PUSH = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_PUSH, "PROCESS_PUSH");
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c l17 = t0Var.l(PROCESS_PUSH);
        if (l17 == null) {
            return;
        }
        java.util.List r17 = kz5.d0.r(l17.m46707x9e267bcb().values());
        long j17 = this.f149169d;
        boolean contains = ((java.util.ArrayList) r17).contains(java.lang.Long.valueOf(j17));
        long j18 = this.f149171f;
        long j19 = this.f149170e;
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.FeatureService", "Skip light-push msg: " + j17);
            long j27 = j19 - j18;
            if (j27 > 600000) {
                ap.a.a(1, "longMsgNotifyLightPush", null, null, java.lang.String.valueOf(j27 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8), java.lang.String.valueOf(j17), java.lang.String.valueOf(j17), java.lang.String.valueOf(((java.util.ArrayList) kz5.d0.r(l17.m46707x9e267bcb().values())).size()));
                return;
            }
            return;
        }
        long j28 = j19 - j18;
        long j29 = this.f149172g;
        long j37 = j29 - j18;
        long j38 = j29 - this.f149173h;
        t0Var.i().m46676x1826480d(j28);
        if (j28 > 1800000) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            long j39 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            long j47 = j28 / j39;
            long j48 = j37 / j39;
            long j49 = j38 / j39;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3.f149161a;
            long j57 = j28 + 600000;
            long j58 = j29 - j57;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", "startTime=" + ((java.lang.String) p3Var.mo1850x58b836e(java.lang.Long.valueOf(j58))) + ", duringMin=" + (j57 / j39));
            java.util.List<jz5.l> m46721xdb445020 = l17.m46721xdb445020();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m46721xdb445020.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                jz5.l lVar = (jz5.l) next;
                java.util.Iterator it6 = it;
                if (((java.lang.Number) lVar.f384366d).longValue() >= j58 || ((java.lang.Number) lVar.f384367e).longValue() >= j58) {
                    arrayList.add(next);
                }
                it = it6;
            }
            java.util.List S0 = kz5.n0.S0(arrayList);
            java.util.Iterator it7 = S0.iterator();
            long j59 = 0;
            while (it7.hasNext()) {
                java.util.Iterator it8 = it7;
                jz5.l lVar2 = (jz5.l) it7.next();
                long j66 = j47;
                long longValue = ((java.lang.Number) lVar2.f384366d).longValue();
                java.lang.Number number = (java.lang.Number) lVar2.f384367e;
                j59 += longValue >= j58 ? number.longValue() - ((java.lang.Number) lVar2.f384366d).longValue() : number.longValue() - j58;
                it7 = it8;
                j47 = j66;
            }
            long j67 = j47;
            float f17 = (float) j59;
            float f18 = (float) j57;
            long c17 = a06.d.c((f17 * 100.0f) / f18);
            java.lang.String str6 = "";
            if (("".length() == 0) && c17 >= 90) {
                str6 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63;
            }
            linkedHashMap.put("push-port-0", java.lang.Long.valueOf(c17));
            float f19 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var2 = p3Var;
            linkedHashMap.put("push-lost-min", java.lang.Long.valueOf(a06.d.c((f17 * 1.0f) / f19)));
            linkedHashMap.put("push-lost-cnt", java.lang.Integer.valueOf(S0.size()));
            int size = S0.size();
            if (5 <= size) {
                size = 5;
            }
            java.util.List subList = S0.subList(0, size);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(subList, 10));
            java.util.Iterator it9 = subList.iterator();
            while (it9.hasNext()) {
                jz5.l lVar3 = (jz5.l) it9.next();
                long longValue2 = ((java.lang.Number) lVar3.f384366d).longValue();
                java.util.Iterator it10 = it9;
                java.lang.Number number2 = (java.lang.Number) lVar3.f384367e;
                arrayList2.add(java.lang.Long.valueOf((longValue2 >= j58 ? number2.longValue() - ((java.lang.Number) lVar3.f384366d).longValue() : number2.longValue() - j58) / j39));
                it9 = it10;
            }
            linkedHashMap.put("push-lost-lst", kz5.n0.S0(arrayList2));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("push bounded: lostMin=");
            java.util.Iterator it11 = S0.iterator();
            long j68 = 0;
            while (it11.hasNext()) {
                java.util.Iterator it12 = it11;
                jz5.l lVar4 = (jz5.l) it11.next();
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var3 = p3Var2;
                long longValue3 = ((java.lang.Number) lVar4.f384366d).longValue();
                float f27 = f19;
                java.lang.Number number3 = (java.lang.Number) lVar4.f384367e;
                j68 += (longValue3 >= j58 ? number3.longValue() - ((java.lang.Number) lVar4.f384366d).longValue() : number3.longValue() - j58) / j39;
                p3Var2 = p3Var3;
                it11 = it12;
                f19 = f27;
            }
            float f28 = f19;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var4 = p3Var2;
            sb6.append(j68);
            java.lang.String str7 = ", boundedSize=";
            sb6.append(", boundedSize=");
            sb6.append(S0.size());
            java.lang.String str8 = ", \nboundedList=\n - ";
            sb6.append(", \nboundedList=\n - ");
            java.util.List x07 = kz5.n0.x0(S0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(x07, 10));
            java.util.Iterator it13 = x07.iterator();
            while (true) {
                str = "min";
                str2 = str8;
                str3 = "\t=\t";
                str4 = str7;
                str5 = "\t-\t";
                if (!it13.hasNext()) {
                    break;
                }
                jz5.l lVar5 = (jz5.l) it13.next();
                java.util.Iterator it14 = it13;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
                java.lang.String str9 = str6;
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var5 = p3Var4;
                sb7.append((java.lang.String) p3Var5.mo1850x58b836e(lVar5.f384367e));
                sb7.append("\t-\t");
                java.lang.Object obj = lVar5.f384366d;
                sb7.append((java.lang.String) p3Var5.mo1850x58b836e(obj));
                sb7.append("\t=\t");
                java.lang.Number number4 = (java.lang.Number) obj;
                long longValue4 = number4.longValue();
                long longValue5 = ((java.lang.Number) lVar5.f384367e).longValue();
                p3Var4 = p3Var5;
                sb7.append((longValue4 >= j58 ? longValue5 - number4.longValue() : longValue5 - j58) / j39);
                sb7.append("min");
                arrayList3.add(sb7.toString());
                f18 = f18;
                str8 = str2;
                str7 = str4;
                it13 = it14;
                linkedHashMap = linkedHashMap2;
                str6 = str9;
            }
            java.util.LinkedHashMap linkedHashMap3 = linkedHashMap;
            java.lang.String str10 = str6;
            float f29 = f18;
            sb6.append(kz5.n0.g0(kz5.n0.S0(arrayList3), "\n - ", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", sb6.toString());
            java.util.List<jz5.l> m46718x8dee8bee = l17.m46718x8dee8bee();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : m46718x8dee8bee) {
                jz5.l lVar6 = (jz5.l) obj2;
                if (((java.lang.Number) lVar6.f384366d).longValue() >= j58 || ((java.lang.Number) lVar6.f384367e).longValue() >= j58) {
                    arrayList4.add(obj2);
                }
            }
            java.util.List V0 = kz5.n0.V0(arrayList4);
            if (l17.getLastNetworkState() != null) {
                jz5.l lastNetworkState = l17.getLastNetworkState();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lastNetworkState);
                ((java.util.ArrayList) V0).add(new jz5.l(lastNetworkState.f384367e, java.lang.Long.valueOf(j29)));
            }
            java.util.ArrayList arrayList5 = (java.util.ArrayList) V0;
            java.util.Iterator it15 = arrayList5.iterator();
            java.lang.String str11 = "MicroMsg.proc.FeatureService";
            long j69 = 0;
            while (it15.hasNext()) {
                jz5.l lVar7 = (jz5.l) it15.next();
                java.util.Iterator it16 = it15;
                long longValue6 = ((java.lang.Number) lVar7.f384366d).longValue();
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = l17;
                long longValue7 = ((java.lang.Number) lVar7.f384367e).longValue();
                j69 += longValue6 >= j58 ? longValue7 - ((java.lang.Number) lVar7.f384366d).longValue() : longValue7 - j58;
                it15 = it16;
                l17 = c10875xc0cf956c;
            }
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c2 = l17;
            float f37 = (float) j69;
            long c18 = a06.d.c((f37 * 100.0f) / f29);
            java.lang.String str12 = (!(str10.length() == 0) || c18 < 90) ? str10 : "net";
            java.util.LinkedHashMap linkedHashMap4 = linkedHashMap3;
            linkedHashMap4.put("net-port-0", java.lang.Long.valueOf(c18));
            linkedHashMap4.put("net-lost-min", java.lang.Long.valueOf(a06.d.c((f37 * 1.0f) / f28)));
            linkedHashMap4.put("net-lost-cnt", java.lang.Integer.valueOf(arrayList5.size()));
            int size2 = arrayList5.size();
            if (5 <= size2) {
                size2 = 5;
            }
            java.util.List subList2 = arrayList5.subList(0, size2);
            java.lang.String str13 = str12;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(subList2, 10));
            java.util.Iterator it17 = subList2.iterator();
            while (it17.hasNext()) {
                jz5.l lVar8 = (jz5.l) it17.next();
                long longValue8 = ((java.lang.Number) lVar8.f384366d).longValue();
                java.util.Iterator it18 = it17;
                long longValue9 = ((java.lang.Number) lVar8.f384367e).longValue();
                arrayList6.add(java.lang.Long.valueOf((longValue8 >= j58 ? longValue9 - ((java.lang.Number) lVar8.f384366d).longValue() : longValue9 - j58) / j39));
                it17 = it18;
            }
            linkedHashMap4.put("net-lost-lst", kz5.n0.S0(arrayList6));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("network bounded: lostMin=");
            java.util.Iterator it19 = arrayList5.iterator();
            long j76 = 0;
            while (it19.hasNext()) {
                java.util.Iterator it20 = it19;
                jz5.l lVar9 = (jz5.l) it19.next();
                java.util.LinkedHashMap linkedHashMap5 = linkedHashMap4;
                long longValue10 = ((java.lang.Number) lVar9.f384366d).longValue();
                float f38 = f29;
                long longValue11 = ((java.lang.Number) lVar9.f384367e).longValue();
                j76 += (longValue10 >= j58 ? longValue11 - ((java.lang.Number) lVar9.f384366d).longValue() : longValue11 - j58) / j39;
                linkedHashMap4 = linkedHashMap5;
                it19 = it20;
                f29 = f38;
            }
            float f39 = f29;
            java.util.LinkedHashMap linkedHashMap6 = linkedHashMap4;
            sb8.append(j76);
            sb8.append(str4);
            sb8.append(arrayList5.size());
            sb8.append(str2);
            java.util.List x08 = kz5.n0.x0(V0);
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(x08, 10));
            java.util.Iterator it21 = x08.iterator();
            while (it21.hasNext()) {
                jz5.l lVar10 = (jz5.l) it21.next();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                java.util.Iterator it22 = it21;
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var6 = p3Var4;
                sb9.append((java.lang.String) p3Var6.mo1850x58b836e(lVar10.f384367e));
                sb9.append(str5);
                java.lang.Object obj3 = lVar10.f384366d;
                java.lang.String str14 = str5;
                sb9.append((java.lang.String) p3Var6.mo1850x58b836e(obj3));
                sb9.append(str3);
                java.lang.Number number5 = (java.lang.Number) obj3;
                long longValue12 = number5.longValue();
                long longValue13 = ((java.lang.Number) lVar10.f384367e).longValue();
                sb9.append((longValue12 >= j58 ? longValue13 - number5.longValue() : longValue13 - j58) / j39);
                sb9.append("min");
                arrayList7.add(sb9.toString());
                p3Var4 = p3Var6;
                str3 = str3;
                it21 = it22;
                str5 = str14;
            }
            java.lang.String str15 = str5;
            java.lang.String str16 = str3;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p3 p3Var7 = p3Var4;
            sb8.append(kz5.n0.g0(kz5.n0.S0(arrayList7), "\n - ", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str11, sb8.toString());
            java.util.List<jz5.l> m46712xa48d05b1 = c10875xc0cf956c2.m46712xa48d05b1();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            for (java.lang.Object obj4 : m46712xa48d05b1) {
                jz5.l lVar11 = (jz5.l) obj4;
                if (((java.lang.Number) lVar11.f384366d).longValue() >= j58 || ((java.lang.Number) lVar11.f384367e).longValue() >= j58) {
                    arrayList8.add(obj4);
                }
            }
            java.util.List V02 = kz5.n0.V0(arrayList8);
            if (c10875xc0cf956c2.getLastMarsState() != null) {
                jz5.l lastMarsState = c10875xc0cf956c2.getLastMarsState();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lastMarsState);
                ((java.util.ArrayList) V02).add(new jz5.l(lastMarsState.f384367e, java.lang.Long.valueOf(j29)));
            }
            java.util.ArrayList arrayList9 = (java.util.ArrayList) V02;
            java.util.Iterator it23 = arrayList9.iterator();
            long j77 = 0;
            while (it23.hasNext()) {
                jz5.l lVar12 = (jz5.l) it23.next();
                java.util.Iterator it24 = it23;
                long longValue14 = ((java.lang.Number) lVar12.f384366d).longValue();
                java.lang.String str17 = str11;
                java.lang.Number number6 = (java.lang.Number) lVar12.f384367e;
                j77 += longValue14 >= j58 ? number6.longValue() - ((java.lang.Number) lVar12.f384366d).longValue() : number6.longValue() - j58;
                it23 = it24;
                str11 = str17;
            }
            java.lang.String str18 = str11;
            float f47 = (float) j77;
            long c19 = a06.d.c((f47 * 100.0f) / f39);
            if ((str13.length() == 0) && c19 >= 90) {
                str13 = "mars";
            }
            linkedHashMap6.put("mars-port-0", java.lang.Long.valueOf(c19));
            linkedHashMap6.put("mars-lost-min", java.lang.Long.valueOf(a06.d.c((f47 * 1.0f) / f28)));
            linkedHashMap6.put("mars-lost-cnt", java.lang.Integer.valueOf(arrayList9.size()));
            int size3 = arrayList9.size();
            if (5 <= size3) {
                size3 = 5;
            }
            java.util.List subList3 = arrayList9.subList(0, size3);
            java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(subList3, 10));
            java.util.Iterator it25 = subList3.iterator();
            while (it25.hasNext()) {
                jz5.l lVar13 = (jz5.l) it25.next();
                long longValue15 = ((java.lang.Number) lVar13.f384366d).longValue();
                java.util.Iterator it26 = it25;
                java.lang.Number number7 = (java.lang.Number) lVar13.f384367e;
                arrayList10.add(java.lang.Long.valueOf((longValue15 >= j58 ? number7.longValue() - ((java.lang.Number) lVar13.f384366d).longValue() : number7.longValue() - j58) / j39));
                it25 = it26;
            }
            linkedHashMap6.put("mars-lost-lst", kz5.n0.S0(arrayList10));
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("mars bounded: lostMin=");
            java.util.Iterator it27 = arrayList9.iterator();
            long j78 = 0;
            while (it27.hasNext()) {
                jz5.l lVar14 = (jz5.l) it27.next();
                java.util.Iterator it28 = it27;
                long longValue16 = ((java.lang.Number) lVar14.f384366d).longValue();
                java.lang.String str19 = str;
                java.lang.Number number8 = (java.lang.Number) lVar14.f384367e;
                j78 += (longValue16 >= j58 ? number8.longValue() - ((java.lang.Number) lVar14.f384366d).longValue() : number8.longValue() - j58) / j39;
                it27 = it28;
                str = str19;
            }
            java.lang.String str20 = str;
            sb10.append(j78);
            sb10.append(str4);
            sb10.append(arrayList9.size());
            sb10.append(str2);
            java.util.List<jz5.l> x09 = kz5.n0.x0(V02);
            java.util.ArrayList arrayList11 = new java.util.ArrayList(kz5.d0.q(x09, 10));
            for (jz5.l lVar15 : x09) {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                sb11.append((java.lang.String) p3Var7.mo1850x58b836e(lVar15.f384367e));
                java.lang.String str21 = str15;
                sb11.append(str21);
                java.lang.Object obj5 = lVar15.f384366d;
                sb11.append((java.lang.String) p3Var7.mo1850x58b836e(obj5));
                sb11.append(str16);
                long longValue17 = ((java.lang.Number) obj5).longValue();
                java.lang.Number number9 = (java.lang.Number) lVar15.f384367e;
                sb11.append((longValue17 >= j58 ? number9.longValue() - ((java.lang.Number) obj5).longValue() : number9.longValue() - j58) / j39);
                sb11.append(str20);
                arrayList11.add(sb11.toString());
                str15 = str21;
            }
            java.lang.String str22 = str15;
            sb10.append(kz5.n0.g0(kz5.n0.S0(arrayList11), "\n - ", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str18, sb10.toString());
            java.util.List<jz5.l> m46705x5615fc85 = c10875xc0cf956c2.m46705x5615fc85();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            for (java.lang.Object obj6 : m46705x5615fc85) {
                jz5.l lVar16 = (jz5.l) obj6;
                if (((java.lang.Number) lVar16.f384366d).longValue() >= j58 || ((java.lang.Number) lVar16.f384367e).longValue() >= j58) {
                    arrayList12.add(obj6);
                }
            }
            java.util.List S02 = kz5.n0.S0(arrayList12);
            java.util.Iterator it29 = S02.iterator();
            long j79 = 0;
            while (it29.hasNext()) {
                jz5.l lVar17 = (jz5.l) it29.next();
                java.util.Iterator it30 = it29;
                j79 += ((java.lang.Number) lVar17.f384366d).longValue() >= j58 ? ((java.lang.Number) lVar17.f384367e).longValue() - ((java.lang.Number) lVar17.f384366d).longValue() : ((java.lang.Number) lVar17.f384367e).longValue() - j58;
                it29 = it30;
            }
            float f48 = (float) j79;
            long c27 = a06.d.c((100.0f * f48) / f39);
            if ((str13.length() == 0) && c27 >= 90) {
                str13 = "doze";
            }
            linkedHashMap6.put("doze-port-0", java.lang.Long.valueOf(c27));
            linkedHashMap6.put("doze-lost-min", java.lang.Long.valueOf(a06.d.c((f48 * 1.0f) / f28)));
            linkedHashMap6.put("doze-lost-cnt", java.lang.Integer.valueOf(S02.size()));
            int size4 = S02.size();
            if (5 <= size4) {
                size4 = 5;
            }
            java.util.List<jz5.l> subList4 = S02.subList(0, size4);
            java.util.ArrayList arrayList13 = new java.util.ArrayList(kz5.d0.q(subList4, 10));
            for (jz5.l lVar18 : subList4) {
                arrayList13.add(java.lang.Long.valueOf((((java.lang.Number) lVar18.f384366d).longValue() >= j58 ? ((java.lang.Number) lVar18.f384367e).longValue() - ((java.lang.Number) lVar18.f384366d).longValue() : ((java.lang.Number) lVar18.f384367e).longValue() - j58) / j39));
            }
            linkedHashMap6.put("doze-lost-lst", kz5.n0.S0(arrayList13));
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("hibernate bounded: lostMin=");
            java.util.Iterator it31 = S02.iterator();
            long j86 = 0;
            while (it31.hasNext()) {
                jz5.l lVar19 = (jz5.l) it31.next();
                java.util.Iterator it32 = it31;
                j86 += (((java.lang.Number) lVar19.f384366d).longValue() >= j58 ? ((java.lang.Number) lVar19.f384367e).longValue() - ((java.lang.Number) lVar19.f384366d).longValue() : ((java.lang.Number) lVar19.f384367e).longValue() - j58) / j39;
                it31 = it32;
            }
            sb12.append(j86);
            sb12.append(str4);
            sb12.append(S02.size());
            sb12.append(str2);
            java.util.List<jz5.l> x010 = kz5.n0.x0(S02);
            java.util.ArrayList arrayList14 = new java.util.ArrayList(kz5.d0.q(x010, 10));
            for (jz5.l lVar20 : x010) {
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                sb13.append((java.lang.String) p3Var7.mo1850x58b836e(lVar20.f384367e));
                sb13.append(str22);
                java.lang.Object obj7 = lVar20.f384366d;
                sb13.append((java.lang.String) p3Var7.mo1850x58b836e(obj7));
                sb13.append(str16);
                long longValue18 = ((java.lang.Number) obj7).longValue();
                java.lang.Number number10 = (java.lang.Number) lVar20.f384367e;
                sb13.append((longValue18 >= j58 ? number10.longValue() - ((java.lang.Number) obj7).longValue() : number10.longValue() - j58) / j39);
                sb13.append(str20);
                arrayList14.add(sb13.toString());
            }
            sb12.append(kz5.n0.g0(kz5.n0.S0(arrayList14), "\n - ", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str18, sb12.toString());
            linkedHashMap6.put("standby-addMsgGroupCount", java.lang.Integer.valueOf(c10875xc0cf956c2.m46707x9e267bcb().keySet().size()));
            java.util.Iterator<T> it33 = c10875xc0cf956c2.m46707x9e267bcb().values().iterator();
            int i17 = 0;
            while (it33.hasNext()) {
                i17 += ((java.util.List) it33.next()).size();
            }
            linkedHashMap6.put("standby-addMsgCount", java.lang.Integer.valueOf(i17));
            linkedHashMap6.put("start-push-count", java.lang.Long.valueOf(c10875xc0cf956c2.getAccStartsCount()));
            linkedHashMap6.put("exit-push-count", java.lang.Long.valueOf(c10875xc0cf956c2.getAccExitCount()));
            linkedHashMap6.put("exit-push-duringMin", java.lang.Long.valueOf(c10875xc0cf956c2.getAccExitDuringMs() / j39));
            dr0.t tVar = dr0.t0.f324072j;
            dr0.t0 t0Var2 = dr0.t0.f324073k;
            java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c l18 = t0Var2.l(PROCESS_MAIN);
            if (l18 != null) {
                linkedHashMap6.put("start-main-count", java.lang.Long.valueOf(l18.getAccStartsCount()));
                linkedHashMap6.put("exit-main-count", java.lang.Long.valueOf(l18.getAccExitCount()));
                linkedHashMap6.put("exit-main-duringMin", java.lang.Long.valueOf(l18.getAccExitDuringMs() / j39));
            }
            ((dr0.m) ((lh.k) i95.n0.c(lh.k.class))).getClass();
            long j87 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("battery-accstats-lastreportms", 0L);
            if (j87 > 0) {
                long j88 = (j29 - j87) / j39;
                linkedHashMap6.put("report-agoMin", java.lang.Long.valueOf(j88));
                if (j88 >= j67) {
                    if (str13.length() == 0) {
                        str13 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                    }
                    t0Var2.i().m46675xeca0303f(str13);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str18, "longMsgNotifyDispatch:" + j17 + ", costSrv=" + j19 + '-' + j18 + '=' + j67 + "min, costLocal=" + j48 + "min, diffMs=" + this.f149174i + "ms, costNotify=" + j49 + "min, syncNum=" + this.f149175m);
            ap.a.a(1, "longMsgNotifyDispatch", null, linkedHashMap6, java.lang.String.valueOf(j67), java.lang.String.valueOf(j48), java.lang.String.valueOf(this.f149174i), java.lang.String.valueOf(j49), java.lang.String.valueOf(this.f149175m));
        }
    }
}
