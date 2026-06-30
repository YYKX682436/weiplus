package dr0;

/* loaded from: classes12.dex */
public final class h2 extends dr0.j2 {
    public h2() {
        super(40);
    }

    @Override // dr0.j2
    public boolean a() {
        return dr0.j2.f323973b.a() && mm.k.j(mm.k.N, null, 1, null);
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - dr0.t0.f324073k.f324080g) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingPeriodically, postMin=" + currentTimeMillis);
        if (!a()) {
            return null;
        }
        if (currentTimeMillis < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: postMin<0");
            return null;
        }
        boolean a17 = dr0.j2.f323976e.a();
        int i17 = this.f323982a;
        if (a17) {
            dr0.w1 w1Var = dr0.a3.f323936d;
            long f17 = w1Var.a().f();
            if (0 <= f17 && f17 <= currentTimeMillis) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingPeriodically: deepBg");
                return dr0.a3.b(w1Var.a(), i17 + 3);
            }
        }
        if (dr0.j2.f323975d.a()) {
            dr0.w1 w1Var2 = dr0.a3.f323936d;
            long e17 = w1Var2.a().e();
            if (1 <= e17 && e17 <= currentTimeMillis) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingPeriodically: bg");
                return dr0.a3.b(w1Var2.a(), i17 + 2);
            }
        }
        if (dr0.j2.f323978g.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingPeriodically: appStandby");
            return dr0.a3.b(dr0.a3.f323936d.a(), i17 + 5);
        }
        if (dr0.j2.f323979h.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingPeriodically: sysDoze");
            return dr0.a3.b(dr0.a3.f323936d.a(), i17 + 6);
        }
        if (dr0.j2.f323980i.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingPeriodically: battRestrict");
            return dr0.a3.b(dr0.a3.f323936d.a(), i17 + 7);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: recycle-nothing");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryNextLoop: curr=");
        dr0.w1 w1Var3 = dr0.a3.f323936d;
        sb6.append(w1Var3.a().f323942b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", sb6.toString());
        dr0.a3 a18 = w1Var3.a();
        a18.getClass();
        if (dr0.j2.f323973b.a()) {
            ((ku5.t0) ku5.t0.f394148d).g(new dr0.x2(a18, false));
        }
        return null;
    }
}
