package dz0;

/* loaded from: classes5.dex */
public final class v implements dz0.d {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.z f326565d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f326566e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326568g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f326562a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f326563b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f326564c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f326567f = dz0.q.f326512d;

    public v(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b) {
        this.f326568g = c11015x5b190a3b;
    }

    public static final void a(dz0.v vVar, yz5.l lVar, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        vVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEndSegmentClipComplete ");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", sb6.toString());
        if (lVar != null) {
            lVar.mo146xb9724478(c4093x6b88526b);
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = vVar.f326568g;
        p3325xe03a0797.p3326xc267989b.l.d(c11015x5b190a3b.m158345xefc66565(), null, null, new dz0.s(c11015x5b190a3b, null), 3, null);
        bz0.h hVar = bz0.j.f118294l;
        if (hVar != null) {
            if (hVar.f118279c == null) {
                hVar.f118279c = 0;
            }
            ((java.util.ArrayList) bz0.j.f118295m).add(hVar);
        }
        bz0.j.f118294l = null;
    }

    public final boolean b(bg0.y yVar) {
        if (yVar == null) {
            return false;
        }
        long j17 = yVar.f101401d;
        return j17 > 0 && j17 > yVar.f101400c;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 c(java.lang.String str, java.util.List list) {
        java.lang.Object obj = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) next).f219963e, str)) {
                obj = next;
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
    }

    public final int d(bg0.y yVar) {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a;
        if (!this.f326566e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJSegmentClipBehaviorHolder", "updateClipSegmentPlayRange: not doingSegmentClip");
            return -1;
        }
        java.util.Iterator it = this.f326564c.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a) it.next()).f129698a, yVar.f101398a)) {
                break;
            }
            i17++;
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a aVar = i17 >= 0 ? (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a) kz5.n0.a0(this.f326564c, i17) : null;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "onSegmentClipTimeRangeUpdateComplete: failed, " + yVar.f101399b);
            return -1;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 b17 = aVar.b();
        if (!((b17 == null || b17.m34010x7b953cf2()) ? false : true)) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 a17 = aVar.a();
            if (a17 != null && !a17.m34010x7b953cf2()) {
                z17 = true;
            }
            if (!z17) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33967x6fa736dc = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc((long) yVar.f101403f);
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 b18 = aVar.b();
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(b18 != null ? b18.m34009x8082fb99() : null);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", "safeGetValue: err=" + m143898xd4a2fc34.getMessage());
                    m143895xf1229813 = null;
                }
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) m143895xf1229813;
                if (c4128x879fba0a == null) {
                    c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(0.0d);
                }
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = c4128x879fba0a.add(m33967x6fa736dc);
                try {
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 a18 = aVar.a();
                    m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((a18 == null || (m34005x51e8b0a = a18.m34005x51e8b0a()) == null) ? null : java.lang.Double.valueOf(m34005x51e8b0a.m33988x124aa384()));
                } catch (java.lang.Throwable th7) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                }
                java.lang.Throwable m143898xd4a2fc342 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
                if (m143898xd4a2fc342 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", "safeGetValue: err=" + m143898xd4a2fc342.getMessage());
                    m143895xf12298132 = null;
                }
                java.lang.Double d17 = (java.lang.Double) m143895xf12298132;
                double doubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33997xe9d83e0e = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33997xe9d83e0e(add.m33988x124aa384(), doubleValue);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "updateClipSegmentPlayRange:" + aVar.f129698a + ", startSecond:" + add.m33988x124aa384() + ", durationSecond:" + doubleValue);
                com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326568g;
                p3325xe03a0797.p3326xc267989b.l.d(c11015x5b190a3b.m158345xefc66565(), null, null, new dz0.u(c11015x5b190a3b, add, m33997xe9d83e0e, null), 3, null);
                return i17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJSegmentClipBehaviorHolder", "updateClipSegmentPlayRange: failed, time invalid");
        return -1;
    }

    public void e() {
        java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a> list;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a;
        az0.n7 n7Var = this.f326568g.f151316d;
        if (n7Var != null) {
            list = n7Var.f97275a.m33407xd231f663();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getStorylineClipSegments(...)");
        } else {
            list = kz5.p0.f395529d;
        }
        if (list.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "updateMJClipSegment: data size:" + ((java.util.ArrayList) this.f326563b).size() + ", mj size" + list.size());
        java.util.Iterator it = ((java.util.ArrayList) this.f326563b).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                bz0.h hVar = bz0.j.f118294l;
                if ((hVar != null ? hVar.f118279c : null) != null || hVar == null) {
                    return;
                }
                hVar.f118279c = 1;
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bg0.y yVar = (bg0.y) next;
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a) next2).f129698a, yVar.f101398a)) {
                    r4 = next2;
                    break;
                }
            }
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a aVar = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a) r4;
            if (aVar != null) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 a17 = aVar.a();
                double d17 = yVar.f101403f / 1000.0d;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 a18 = aVar.a();
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33997xe9d83e0e = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33997xe9d83e0e(d17, (a18 == null || (m34005x51e8b0a = a18.m34005x51e8b0a()) == null) ? 0.0d : m34005x51e8b0a.m33988x124aa384());
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83) aVar.f129699b.get();
                if (c4079x793f83 != null) {
                    c4079x793f83.m33442xd4c8ff4(aVar.f129698a, m33997xe9d83e0e);
                }
                if (a17 != null && (m34009x8082fb99 = a17.m34009x8082fb99()) != null) {
                    m34009x8082fb99.m33988x124aa384();
                }
                if (a17 != null && (m34007xde00a612 = a17.m34007xde00a612()) != null) {
                    m34007xde00a612.m33988x124aa384();
                }
                m33997xe9d83e0e.m34009x8082fb99().m33988x124aa384();
                m33997xe9d83e0e.m34007xde00a612().m33988x124aa384();
            }
            i17 = i18;
        }
    }
}
