package ls4;

/* loaded from: classes8.dex */
public final class z implements com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f402647a;

    public z(ls4.e0 e0Var) {
        this.f402647a = e0Var;
    }

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
    /* renamed from: MidasPayCallBack */
    public void mo41389xe81ffc73(com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec) {
        ls4.e0 e0Var = this.f402647a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = e0Var.f402581b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        e0Var.f402581b = null;
        pr4.m mVar = e0Var.f402580a;
        if (c4728x8ec3caec == null) {
            mVar.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "MidasPayCallBack: resultCode: " + c4728x8ec3caec.f20116xdde293aa + ", resultMsg: " + c4728x8ec3caec.f20118x938b9624);
        int i17 = c4728x8ec3caec.f20116xdde293aa;
        if (i17 == 0) {
            mVar.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439576f));
        } else if (i17 != 2) {
            mVar.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
        } else {
            mVar.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439575e));
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
    /* renamed from: MidasPayNeedLogin */
    public void mo41390x9af5fe25() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "Midas pay need login");
        ls4.e0 e0Var = this.f402647a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = e0Var.f402581b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        e0Var.f402581b = null;
        e0Var.f402580a.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
    }
}
