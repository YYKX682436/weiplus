package c05;

/* loaded from: classes9.dex */
public class r extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.s f37714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c05.s sVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37714c = sVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.s sVar = this.f37714c;
        if (sVar.f213801c.getBoolean("key_is_show_detail", true)) {
            return false;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) sVar.f213801c.getParcelable("key_bankcard");
        this.f338834b.d(new d05.f(bankcard.field_bankcardType, bankcard.field_bindSerial, sVar.f213801c.getString("key_pwd1")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof d05.f)) {
            return false;
        }
        c05.s sVar = this.f37714c;
        sVar.o(this.f338833a, 0, sVar.f213801c);
        return true;
    }
}
