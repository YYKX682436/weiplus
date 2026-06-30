package ku1;

/* loaded from: classes15.dex */
public class n extends ku1.i {
    @Override // ku1.i
    public ku1.l0 g() {
        return new ku1.g(this, this.f393626b);
    }

    @Override // ku1.i
    public java.lang.String h(lu1.e eVar) {
        return this.f393628d.i0().f466722o;
    }

    @Override // ku1.i
    public ku1.l0 i() {
        return new ku1.b0(this, this.f393626b);
    }

    @Override // ku1.i
    public ku1.l0 j() {
        return new ku1.d0(this, this.f393626b);
    }

    @Override // ku1.i
    public boolean k(tt1.j jVar) {
        tt1.j jVar2 = this.f393628d;
        if (jVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        }
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        }
        java.lang.String str = jVar2.i0().f466722o;
        java.lang.String str2 = jVar.i0().f466722o;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || str.equals(str2)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
        return true;
    }
}
