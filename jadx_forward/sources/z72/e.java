package z72;

/* loaded from: classes12.dex */
public class e extends l75.s0 implements o72.d4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f552086d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae f552087e;

    public e(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.f552086d = c26918x6e83759b;
        this.f552087e = c26918x6e83759b.m106824x752de218("FavEditInfo", up5.e.f511458b);
    }

    public static o72.m2 m0(z72.d dVar) {
        r45.kp0 kp0Var;
        if (dVar == null) {
            return null;
        }
        o72.m2 m2Var = new o72.m2();
        m2Var.f67419x88be67a1 = dVar.f511587a;
        if (dVar.f552085f == null) {
            byte[] bArr = dVar.f511588b;
            if (bArr == null) {
                kp0Var = new r45.kp0();
                m2Var.f67420xbda7f2f0 = kp0Var;
                m2Var.f67422x2261f6f2 = dVar.f511589c;
                m2Var.f67423x2262335f = dVar.f511590d;
                m2Var.f67421x29cbf907 = dVar.f511591e;
                return m2Var;
            }
            dVar.f552085f = (r45.kp0) tp5.a.e(bArr, r45.kp0.class);
        }
        kp0Var = dVar.f552085f;
        m2Var.f67420xbda7f2f0 = kp0Var;
        m2Var.f67422x2261f6f2 = dVar.f511589c;
        m2Var.f67423x2262335f = dVar.f511590d;
        m2Var.f67421x29cbf907 = dVar.f511591e;
        return m2Var;
    }

    public static z72.d n0(o72.m2 m2Var) {
        if (m2Var == null) {
            return null;
        }
        z72.d dVar = new z72.d(null);
        dVar.f511587a = m2Var.f67419x88be67a1;
        dVar.f511588b = tp5.a.h(m2Var.f67420xbda7f2f0);
        dVar.f511589c = m2Var.f67422x2261f6f2;
        dVar.f511590d = m2Var.f67423x2262335f;
        dVar.f511591e = m2Var.f67421x29cbf907;
        return dVar;
    }

    @Override // o72.d4
    public java.util.List E5() {
        try {
            java.util.List<R> m107108xde3eb429 = this.f552087e.m107108xde3eb429(z72.d.class);
            if (m107108xde3eb429 == 0) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(m107108xde3eb429.size());
            java.util.Iterator it = m107108xde3eb429.iterator();
            while (it.hasNext()) {
                arrayList.add(m0((z72.d) it.next()));
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.d4
    public boolean M1(o72.m2 m2Var) {
        try {
            long m106416x5fe15ab0 = this.f552087e.m107163x36a99aa0().m106421x6ac9171(n0(m2Var)).m106418x42fa5578(up5.e.f511459c, up5.e.f511460d, up5.e.f511461e, up5.e.f511462f, up5.e.f511463g).m106415xb158f775().m106416x5fe15ab0();
            m2Var.f72763xa3c65b86 = m106416x5fe15ab0;
            mo142179xf35bbb4(java.lang.Long.toString(m106416x5fe15ab0), 2, m2Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.d4
    public o72.m2 c1(long j17, int i17) {
        try {
            return m0((z72.d) this.f552087e.m107132x946de4d9(up5.e.f511459c.eq(j17).and(up5.e.f511462f.eq(i17)), z72.d.class));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return null;
        }
    }

    @Override // o72.d4
    public boolean i7(o72.m2 m2Var, java.lang.String... strArr) {
        try {
            tp5.a.i(n0(m2Var), this.f552087e, strArr);
            mo142179xf35bbb4(java.lang.Long.toString(m2Var.f72763xa3c65b86), 2, m2Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.d4
    public void j1(long j17, int i17) {
        try {
            this.f552087e.m107088x90df30e9(up5.e.f511459c.eq(j17).and(up5.e.f511462f.eq(i17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavEditInfoStorage", "Operation failed: " + e17.getMessage());
        }
    }
}
