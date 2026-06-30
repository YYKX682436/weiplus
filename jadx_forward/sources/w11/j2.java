package w11;

/* loaded from: classes12.dex */
public class j2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f523599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.k2 f523600e;

    public j2(w11.k2 k2Var) {
        this.f523600e = k2Var;
        this.f523599d = k2Var.f523608d;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17 = this.f523599d;
        if (i17 <= 0) {
            return false;
        }
        this.f523599d = i17 - 1;
        o45.yh yhVar = new o45.yh();
        yhVar.f424572a.f455292e = new r45.c50();
        int R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(this.f523600e.f523609e, 1);
        for (int i18 = 0; i18 < R; i18++) {
            java.util.ArrayList arrayList = w11.l2.f523615a;
            r45.j4 j4Var = (r45.j4) arrayList.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(arrayList.size() - 1, 0));
            r45.du5 du5Var = new r45.du5();
            java.util.ArrayList arrayList2 = w11.l2.f523616b;
            du5Var.f454289d = ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) arrayList2.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(arrayList2.size() - 1, 0))).d1();
            du5Var.f454290e = true;
            j4Var.f459091e = du5Var;
            j4Var.f459098o = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            j4Var.f459101r = java.lang.Math.abs(((int) java.lang.System.currentTimeMillis()) % 10000000);
            try {
                r45.b50 b50Var = new r45.b50();
                r45.cu5 cu5Var = new r45.cu5();
                b50Var.f452064e = cu5Var;
                cu5Var.d(j4Var.mo14344x5f01b1f6());
                b50Var.f452063d = 5;
                yhVar.f424572a.f455292e.f452828e.add(b50Var);
                yhVar.f424572a.f455292e.f452827d++;
                yhVar.f424572a.f455292e.f452828e.size();
                java.lang.String str = j4Var.f459091e.f454289d;
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TestSyncAddMsg", e17, "", new java.lang.Object[0]);
            }
        }
        r45.ew4 ew4Var = yhVar.f424572a;
        ew4Var.f455293f = 0;
        ew4Var.f455294g = x51.j1.a(w11.c2.f523524a.a());
        r45.ew4 ew4Var2 = yhVar.f424572a;
        ew4Var2.f455291d = 0;
        ew4Var2.f455295h = 0;
        w11.w1.wi().g(yhVar, 0, com.p314xaae8f345.mm.p642xad8b531f.x1.e());
        return true;
    }
}
