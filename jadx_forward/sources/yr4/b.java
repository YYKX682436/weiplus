package yr4;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yr4.u uVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f546624c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "onNext for select bank card");
        this.f546624c.f295334c.putInt("key_err_code", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f546624c.f295334c.getParcelable("key_bankcard");
        if (c19091x9511676c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "directToBindNew()");
            yr4.u uVar = this.f546624c;
            uVar.f295334c.putInt("key_pay_flag", 2);
            uVar.o(this.f420366a, 0, uVar.f295334c);
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.a(c19091x9511676c.f69223x58802fcb) != null) {
            g();
        } else {
            this.f420367b.d(new ss4.z("", "", null), true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof as4.c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "onSceneEnd for select bank card, forward");
            yr4.u uVar = this.f546624c;
            uVar.o(this.f420366a, 0, uVar.f295334c);
            return true;
        }
        if (i17 == 0 && i18 == 0 && (m1Var instanceof ss4.z)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "onSceneEnd for select bank card, directToNext");
            g();
        }
        return false;
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "directToNext()");
        boolean z17 = this.f546624c.f295334c.getBoolean("key_balance_change_phone_need_confirm_phone", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) this.f546624c.f295334c.getParcelable("key_authen");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) this.f546624c.f295334c.getParcelable("key_orders");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f546624c.f295334c.getParcelable("key_bankcard");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.a(c19091x9511676c.f69223x58802fcb);
        this.f546624c.f295334c.putParcelable("elemt_query", a17);
        if (z17) {
            c19090x75920c71.f261078g = c19091x9511676c.f69223x58802fcb;
            c19090x75920c71.f261079h = c19091x9511676c.f69225xed6d60f6;
            yr4.u uVar = this.f546624c;
            uVar.o(this.f420366a, 0, uVar.f295334c);
            return;
        }
        c19090x75920c71.f261083o = "";
        c19090x75920c71.f261078g = c19091x9511676c.f69223x58802fcb;
        c19090x75920c71.f261079h = c19091x9511676c.f69225xed6d60f6;
        this.f546624c.f295334c.putString("key_mobile", c19091x9511676c.f69249x61dbf87);
        if (a17 != null && !a17.f261185i && !a17.f261186m) {
            this.f420367b.a(zr4.a.b(c19090x75920c71, c19099x8d444f05, this.f546624c.f295334c.getBoolean("key_isbalance", false)), true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "hy: need rewrite cvv or validThru");
        yr4.u uVar2 = this.f546624c;
        uVar2.o(this.f420366a, 0, uVar2.f295334c);
    }
}
