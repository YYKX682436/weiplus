package c05;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.h f37705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c05.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37705c = hVar;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) objArr[0];
        this.f338834b.d(new d05.d(bankcard.field_bindSerial, true, bankcard.field_bankcardType), true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f37705c.f213801c.getParcelable("key_bankcard");
        this.f338834b.d(new d05.f(bankcard.field_bankcardType, bankcard.field_bindSerial, (java.lang.String) objArr[0]), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (m1Var instanceof d05.f) {
            this.f338834b.a(new ss4.e0(null, 0), true);
        } else if (m1Var instanceof ss4.e0) {
            c05.h hVar = this.f37705c;
            hVar.f(this.f338833a, hVar.f213801c);
        }
        return true;
    }
}
