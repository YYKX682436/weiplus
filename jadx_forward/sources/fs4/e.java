package fs4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.h f347871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fs4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f347871c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        fs4.h hVar = this.f347871c;
        boolean z17 = hVar.f295334c.getBoolean("key_is_set_pwd_after_face_action");
        np5.b0 b0Var = this.f420367b;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, after face verify, reset pwd by face");
            b0Var.d(new gs4.m(hVar.f295334c.getString("key_face_action_result_token"), z0Var.f95556b), true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, not after face verify, reset pwd normal");
            b0Var.d(new gs4.r(z0Var), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || (!(m1Var instanceof gs4.r) && !(m1Var instanceof gs4.m))) {
            return false;
        }
        fs4.h hVar = this.f347871c;
        hVar.o(this.f420366a, 0, hVar.f295334c);
        return true;
    }
}
