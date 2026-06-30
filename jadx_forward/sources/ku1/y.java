package ku1;

/* loaded from: classes15.dex */
public class y extends ku1.i {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f393690l = "";

    @Override // ku1.i
    public ku1.l0 g() {
        return new ku1.x(this, this.f393626b);
    }

    @Override // ku1.i
    public java.lang.String h(lu1.e eVar) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f393628d.i0().C) ? this.f393628d.i0().C : (!this.f393628d.N() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f393690l)) ? this.f393628d.i0().f466722o : this.f393690l;
    }

    @Override // ku1.i
    public ku1.l0 i() {
        return new ku1.z(this, this.f393626b);
    }

    @Override // ku1.i
    public ku1.l0 j() {
        return new ku1.a0(this, this.f393626b);
    }

    @Override // ku1.i
    public boolean k(tt1.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        tt1.j jVar2 = this.f393628d;
        if (jVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        }
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        }
        java.lang.String str5 = jVar2.i0().f466722o;
        java.lang.String str6 = jVar.i0().f466722o;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) && !str5.equals(str6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
            return true;
        }
        r45.w50 w50Var = this.f393628d.s0().Z;
        r45.w50 w50Var2 = jVar.s0().Z;
        if ((w50Var == null && w50Var2 != null) || (w50Var != null && w50Var2 == null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
            return true;
        }
        if (w50Var != null && w50Var2 != null && (str3 = w50Var.f470411d) != null && (str4 = w50Var2.f470411d) != null && !str3.equals(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
            return true;
        }
        if (w50Var != null && w50Var2 != null && (str = w50Var.f470413f) != null && (str2 = w50Var2.f470413f) != null && !str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
            return true;
        }
        if (!this.f393628d.N() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f393690l)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "dynamicCode updated！");
        return true;
    }
}
