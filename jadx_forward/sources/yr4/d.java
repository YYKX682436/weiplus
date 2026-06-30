package yr4;

/* loaded from: classes9.dex */
public class d extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, np5.b0 b0Var) {
        super(uVar, abstractActivityC22902xe37969e, b0Var);
        this.f546625c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "start do authen");
        r45.jd jdVar = (r45.jd) objArr[0];
        yr4.u uVar = this.f546625c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) uVar.f295334c.getParcelable("key_authen");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
        c19091x9511676c.f69225xed6d60f6 = jdVar.f459246g;
        java.lang.String str = jdVar.f459244e;
        c19091x9511676c.f69249x61dbf87 = str;
        c19091x9511676c.f69233x225aa2b6 = jdVar.f459247h;
        c19091x9511676c.f69223x58802fcb = c19090x75920c71.f261078g;
        uVar.f295334c.putString("key_mobile", str);
        uVar.f295334c.putParcelable("key_bankcard", c19091x9511676c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) uVar.f295334c.getParcelable("key_orders");
        c19090x75920c71.I = jdVar.f459243d;
        c19090x75920c71.f261074J = jdVar.f459246g;
        c19090x75920c71.K = jdVar.f459245f;
        c19090x75920c71.L = "1";
        as4.b a17 = zr4.a.a(c19090x75920c71, c19099x8d444f05, false);
        if (a17 != null) {
            this.f420367b.d(a17, true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof as4.b)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "finish auth");
        as4.b bVar = (as4.b) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = bVar.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = bVar.A;
        yr4.u uVar = this.f546625c;
        uVar.f295334c.putParcelable("key_authen", c19090x75920c71);
        uVar.f295334c.putParcelable("key_orders", c19099x8d444f05);
        uVar.f295334c.putString("kreq_token", bVar.C);
        uVar.f295334c.putBoolean("key_is_return_from_switch_phone", true);
        uVar.f295334c.putInt("key_err_code", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) uVar.f295334c.getParcelable("key_bankcard");
        c19091x9511676c.f69223x58802fcb = c19090x75920c71.f261078g;
        c19091x9511676c.f69225xed6d60f6 = c19090x75920c71.f261079h;
        uVar.m(this.f420366a);
        return true;
    }
}
