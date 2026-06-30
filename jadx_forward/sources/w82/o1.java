package w82;

/* loaded from: classes12.dex */
public class o1 implements zs3.t, o72.x3, com.p314xaae8f345.mm.p947xba6de98f.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525450d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505, w82.e1 e1Var) {
        this.f525450d = viewOnClickListenerC13625xe5fb4505;
    }

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar != null && yVar.f68319xf604e54a.equals(this.f525450d.B)) {
            b(yVar.f68328x10a0fed7, yVar.f68326x2260084a, yVar.f68325x90a9378, yVar.f68330xeb1a61d6);
        }
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        if (e2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e2Var.f67085xf604e54a) || !e2Var.f67085xf604e54a.equals(this.f525450d.B)) {
            return;
        }
        b(e2Var.f67093x10a0fed7, e2Var.f67091x2260084a, e2Var.f67090x90a9378, e2Var.f67094xeb1a61d6);
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.c1
    public void a(int i17, com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var) {
        if (java.util.Objects.equals(this.f525450d.B, d1Var.f152440c)) {
            if (i17 == 1) {
                b(2, d1Var.f152445h, d1Var.f152442e, d1Var.f152443f);
            } else {
                if (i17 != 4) {
                    return;
                }
                b(1, d1Var.f152445h, d1Var.f152442e, d1Var.f152443f);
            }
        }
    }

    public void b(int i17, java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525450d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC13625xe5fb4505.f183099d, "onCdnStatusChanged status:%s, offset:%s, totalLength:%s, path:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = viewOnClickListenerC13625xe5fb4505.f183100e;
        if ((i17 != 3 && i17 != 2) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            n3Var.mo50293x3498a0(new w82.l1(viewOnClickListenerC13625xe5fb4505, j17, j18));
            return;
        }
        viewOnClickListenerC13625xe5fb4505.f183102g.mo69303x360802();
        n3Var.mo50293x3498a0(new w82.d1(viewOnClickListenerC13625xe5fb4505));
        viewOnClickListenerC13625xe5fb4505.f183109q = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w82.n1(this));
    }
}
