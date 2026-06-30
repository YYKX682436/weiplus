package ty4;

@j95.b
/* loaded from: classes15.dex */
public class n extends i95.w implements uy4.v {
    public n(android.content.Context context) {
        new java.util.HashMap();
    }

    public boolean Ai(java.lang.String str) {
        yy4.a b17 = sy4.m.f495417c.b(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOnline ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(b17.y0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LabAppLifeService", sb6.toString());
        return b17.y0();
    }

    public boolean Bi(java.lang.String str) {
        if (sy4.m.f495417c.b(str).f66637xda33d239 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LabAppLifeService", "appid %s is open ", str);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LabAppLifeService", "appid %s is close", str);
        return false;
    }

    public void Di(java.lang.String str) {
        yy4.a b17 = sy4.m.f495417c.b(str);
        sy4.q qVar = new sy4.q();
        qVar.f495424a = str;
        qVar.f495425b = b17.f66653x29106093;
        qVar.f495427d = java.lang.System.currentTimeMillis();
        qVar.f495426c = 3;
        sy4.r.b(qVar);
    }

    public void Ni(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LabAppLifeService", "switchEntry " + str + "," + z17);
        sy4.m mVar = sy4.m.f495417c;
        yy4.a b17 = mVar.b(str);
        int i17 = z17 ? 2 : 1;
        if (b17.f66637xda33d239 != i17) {
            b17.f66637xda33d239 = i17;
            mVar.c().mo9952xce0038c9(b17, new java.lang.String[0]);
            r45.i54 i54Var = new r45.i54();
            r45.h54 h54Var = new r45.h54();
            h54Var.f457387d = b17.f66651xe408a7d5 == 1 ? 0 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(b17.f66653x29106093, 0);
            h54Var.f457388e = b17.f66634x369ad11;
            h54Var.f457389f = b17.f66637xda33d239 != 2 ? 2 : 1;
            i54Var.f458280d.add(h54Var);
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(207, i54Var));
            sy4.r.a(str, b17.f66637xda33d239 == 2 ? 4 : 5, false);
        }
    }

    public boolean wi(java.lang.String str) {
        yy4.a b17 = sy4.m.f495417c.b(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitExp ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(b17.z0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LabAppLifeService", sb6.toString());
        return b17.z0();
    }
}
