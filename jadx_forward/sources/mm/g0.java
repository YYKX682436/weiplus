package mm;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mm.g0 f410016a = new mm.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f410017b = jz5.h.b(mm.e0.f410011d);

    public static final void e(java.lang.String tag, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.proc.ProcLifeTracker", "noteReportedPid: " + i17 + ", tag=" + tag);
        java.util.List i18 = kz5.c0.i("exception", com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c);
        java.lang.String lowerCase = tag.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (i18.contains(lowerCase)) {
            com.p314xaae8f345.mm.app.f4.a(new com.p314xaae8f345.mm.app.u3(new mm.f0(java.lang.System.currentTimeMillis(), i17)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.proc.ProcLifeTracker", "skip, not crashing tag");
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        return ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Bi();
    }

    public final java.util.List b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            byte[] j17 = a().j("def_proc_life_killed_pid");
            if (j17 != null) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(j17);
                while (wrap.remaining() >= 4) {
                    arrayList.add(java.lang.Integer.valueOf(wrap.getInt()));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.proc.ProcLifeTracker", e17, "loadKilledPidList err", new java.lang.Object[0]);
        }
        return kz5.n0.S0(arrayList);
    }

    public final java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            byte[] j17 = a().j("def_proc_life_report_pid");
            if (j17 != null) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(j17);
                while (wrap.remaining() >= 4) {
                    arrayList.add(java.lang.Integer.valueOf(wrap.getInt()));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.proc.ProcLifeTracker", e17, "loadReportPidList err", new java.lang.Object[0]);
        }
        return kz5.n0.S0(arrayList);
    }

    public final void d(java.util.List pidList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pidList, "pidList");
        ((java.util.Set) ((jz5.n) f410017b).mo141623x754a37bb()).addAll(pidList);
        java.util.List V0 = kz5.n0.V0(b());
        java.util.Iterator it = pidList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList = (java.util.ArrayList) V0;
            if (!arrayList.contains(java.lang.Integer.valueOf(intValue))) {
                arrayList.add(java.lang.Integer.valueOf(intValue));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.proc.ProcLifeTracker", "#markKillProcess: " + pidList);
        try {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(((java.util.ArrayList) V0).size() * 4);
            java.util.Iterator it6 = ((java.util.ArrayList) V0).iterator();
            while (it6.hasNext()) {
                allocate.putInt(((java.lang.Number) it6.next()).intValue());
            }
            a().H("def_proc_life_killed_pid", allocate.array());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.proc.ProcLifeTracker", e17, "markKillProcess err", new java.lang.Object[0]);
        }
    }
}
