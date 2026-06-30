package cr0;

/* loaded from: classes12.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final cr0.j a() {
        cr0.j jVar = new cr0.j();
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec.getClass();
        java.util.ArrayList<com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795> arrayList = new java.util.ArrayList();
        java.lang.String[] b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("full-charge-proc-life-stats.bin").b();
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.i0.y(str, "key_proc_binder_calls_prefix_", false)) {
                    arrayList2.add(str);
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                mh.k kVar = mh.k.f407804a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e a17 = kVar.a(str2, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.class, "full-charge-proc-life-stats.bin");
                if (a17 instanceof com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795) {
                    if (((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795) a17).m46628x5241396d()) {
                        kVar.d(str2, "full-charge-proc-life-stats.bin");
                    } else {
                        arrayList.add(a17);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 c10869xaaca795 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795();
            for (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 c10869xaaca7952 : arrayList) {
                try {
                    c10869xaaca795.m40834x32c52b(new cr0.e(jVar, c10869xaaca7952, c10869xaaca795));
                } catch (java.lang.Exception e17) {
                    ap.a.a(1, "errAccStats", e17, null, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede, e17.getMessage(), "AggregateBinderProxyCallsStatsSnapshot");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BinderTracker", "errAccStats, dump accBinderCallsStats:");
                    java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f>> m46625x1828bc7f = c10869xaaca7952.m46625x1828bc7f();
                    if (m46625x1828bc7f != null) {
                        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f>> entry : m46625x1828bc7f.entrySet()) {
                            java.lang.String key = entry.getKey();
                            java.util.Map<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f> value = entry.getValue();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BinderTracker", " - " + key + '=');
                            if (value != null) {
                                for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f> entry2 : value.entrySet()) {
                                    java.lang.String key2 = entry2.getKey();
                                    com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f value2 = entry2.getValue();
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("   - ");
                                    sb6.append(key2);
                                    sb6.append("=(");
                                    sb6.append(value2 != null ? java.lang.Integer.valueOf(value2.f150222d) : null);
                                    sb6.append(':');
                                    sb6.append(value2 != null ? java.lang.Long.valueOf(value2.f150223e) : null);
                                    sb6.append(')');
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BinderTracker", sb6.toString());
                                }
                            }
                        }
                    }
                }
            }
            cr0.w.f303319h.a(jVar, c10869xaaca795);
            jVar.e();
        }
        return jVar;
    }
}
