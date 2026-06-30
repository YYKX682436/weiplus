package cr0;

/* loaded from: classes12.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final cr0.p a() {
        cr0.p pVar = new cr0.p();
        if (cr0.w3.f303333a.b()) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212.f29671x233c02ec.getClass();
            java.util.ArrayList<com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212> arrayList = new java.util.ArrayList();
            java.lang.String[] b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("full-charge-proc-life-stats.bin").b();
            if (b17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str : b17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    if (r26.i0.y(str, "key_proc_network_stats_prefix", false)) {
                        arrayList2.add(str);
                    }
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    mh.k kVar = mh.k.f407804a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e a17 = kVar.a(str2, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212.class, "full-charge-proc-life-stats.bin");
                    if (a17 instanceof com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212) {
                        if (((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212) a17).m46639x5241396d()) {
                            kVar.d(str2, "full-charge-proc-life-stats.bin");
                        } else {
                            arrayList.add(a17);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212 c10870x6e1f7212 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212();
                for (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212 c10870x6e1f72122 : arrayList) {
                    java.util.LinkedHashMap e17 = pVar.e();
                    java.lang.String accProcName = c10870x6e1f72122.getAccProcName();
                    java.util.Iterator<T> it6 = c10870x6e1f72122.m46636xc3ec362e().values().iterator();
                    long j17 = 0;
                    long j18 = 0;
                    while (it6.hasNext()) {
                        j18 += kz5.n0.J0(((java.util.Map) it6.next()).values());
                    }
                    java.util.Iterator<T> it7 = c10870x6e1f72122.m46637x2db8acb0().values().iterator();
                    while (it7.hasNext()) {
                        j17 += kz5.n0.J0(((java.util.Map) it7.next()).values());
                    }
                    e17.put(accProcName, java.lang.Long.valueOf(j18 + j17));
                    c10870x6e1f7212.m40834x32c52b(new cr0.k(c10870x6e1f7212, c10870x6e1f72122));
                }
                cr0.h0.f303166k.a(pVar, c10870x6e1f7212);
                pVar.f();
            }
        }
        return pVar;
    }
}
