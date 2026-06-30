package z11;

/* loaded from: classes12.dex */
public class c implements w11.u {

    /* renamed from: d, reason: collision with root package name */
    public final w11.d2 f550806d;

    /* renamed from: e, reason: collision with root package name */
    public final int f550807e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ew4 f550808f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.cx4 f550809g;

    public c(w11.d2 d2Var, o45.yh yhVar, int i17, r45.cx4 cx4Var) {
        this.f550806d = d2Var;
        this.f550808f = yhVar == null ? null : yhVar.f424572a;
        this.f550809g = cx4Var;
        this.f550807e = i17;
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        r45.ew4 ew4Var = this.f550808f;
        if (ew4Var == null) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 40L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s run resp == null", this);
            return false;
        }
        if (10018 == x51.o1.f533597q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s Give up for test", this);
            return false;
        }
        r45.jj6 jj6Var = new r45.jj6();
        jj6Var.f459423n = 1;
        jj6Var.f459417e = true;
        jj6Var.f459416d = ew4Var;
        jj6Var.f459424o = this.f550807e;
        r45.cx4 cx4Var = this.f550809g;
        jj6Var.f459425p = cx4Var.f453432e;
        jj6Var.f459426q = cx4Var;
        w11.d2 d2Var = this.f550806d;
        d2Var.f523539h.b(jj6Var, this);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: z11.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                z11.c cVar = z11.c.this;
                r45.ew4 ew4Var2 = cVar.f550808f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag[%s]", cVar, java.lang.Integer.valueOf(ew4Var2.f455293f));
                gm0.j1.u().c().w(8196, java.lang.Long.valueOf(ew4Var2.f455293f));
                if ((ew4Var2.f455293f & 256) != 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47 c6099xc95a2e47 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47();
                    c6099xc95a2e47.f136376g.f90144a = 2;
                    c6099xc95a2e47.e();
                    jx3.f.INSTANCE.mo68477x336bdfd8(99L, 22L, 1L, false);
                }
            }
        };
        x51.q1 q1Var = d2Var.f523532a;
        q1Var.getClass();
        q1Var.a(runnable, 100L, true);
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, 21L, 1L, false);
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m178305x9616526c() {
        return "NotifyData[" + hashCode() + "]";
    }
}
