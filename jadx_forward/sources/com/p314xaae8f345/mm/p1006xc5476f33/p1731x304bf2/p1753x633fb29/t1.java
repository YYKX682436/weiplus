package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class t1 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a(m53.h hVar) {
        m53.i6 i6Var;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBData", "Invalid pb object");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f405250d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBData", "No AppID field, abort");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePBData", "Parsing AppID: %s", hVar.f405250d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b();
        bVar.f67370x28d45f97 = hVar.f405250d;
        bVar.f67372x453d1e07 = hVar.f405252f;
        bVar.f67369x5e556d3a = hVar.f405251e;
        bVar.f67378x454032b6 = ",1,";
        bVar.f67386xa1e9e82c = hVar.f405256m;
        bVar.f67379x119cf7dc = hVar.f405265v;
        bVar.f67371xa2e856b6 = hVar.f405260q;
        m53.b0 b0Var = hVar.f405258o;
        if (b0Var != null) {
            bVar.z0(b0Var.f405101d);
            bVar.y0(hVar.f405258o.f405102e);
            bVar.w0(hVar.f405258o.f405105h);
            bVar.A0(hVar.f405258o.f405103f);
            m53.b0 b0Var2 = hVar.f405258o;
            bVar.f221755y2 = b0Var2.f405107m;
            bVar.f221756z2 = b0Var2.f405106i;
            bVar.A2 = b0Var2.f405108n;
        }
        m53.b0 b0Var3 = hVar.f405258o;
        if (b0Var3 != null && (i6Var = b0Var3.f405104g) != null) {
            bVar.W = i6Var.f405331d;
            bVar.A = true;
            bVar.X = i6Var.f405332e;
            bVar.A = true;
            bVar.U = i6Var.f405333f;
            bVar.A = true;
            bVar.V = i6Var.f405334g;
            bVar.A = true;
            bVar.Z = i6Var.f405336i;
            bVar.A = true;
        }
        bVar.f221740j2 = hVar.f405253g;
        bVar.f221739i2 = hVar.f405254h;
        bVar.f221737g2 = hVar.f405259p;
        bVar.f221741k2 = hVar.f405255i;
        bVar.f221748r2 = hVar.f405257n;
        bVar.f221743m2 = hVar.f405261r;
        bVar.f221744n2 = hVar.f405262s;
        bVar.f221751u2 = hVar.f405268y;
        bVar.B2 = hVar.A;
        bVar.C2 = hVar.B;
        return bVar;
    }
}
