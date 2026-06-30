package k53;

/* loaded from: classes4.dex */
public class g implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 f385891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385892e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f385893f;

    /* renamed from: g, reason: collision with root package name */
    public final k53.f f385894g = new k53.f(this, null);

    public g(com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800) {
        this.f385891d = c11149x9c6f800;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        java.lang.String str2 = this.f385892e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(str)) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().p(str, i17, i18, 0);
        }
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameOnlineVideoProxy", "%s start http stream[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, str3, str2);
        this.f385892e = str;
        if (this.f385893f) {
            this.f385893f = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new k53.a(this, str, str3, str2), 1000L);
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_GameOnlineVideoProxy";
        oVar.f69601xaca5bdda = str;
        oVar.M1 = str3;
        oVar.H1 = 1;
        oVar.Z = 3;
        oVar.f323342y0 = 4;
        oVar.f69595x6d25b0d9 = str2;
        oVar.f323348c2 = this.f385894g;
        Di.e(oVar, false);
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, stop stream[%s]", java.lang.Integer.valueOf(hashCode()), str);
        java.lang.String str2 = this.f385892e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(str)) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().g(str, null);
        }
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        java.lang.String str2 = this.f385892e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.equals(str)) {
            return false;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return t21.o2.Di().o(str, i17, i18);
    }
}
