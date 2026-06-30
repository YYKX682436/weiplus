package c05;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.c f37702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c05.c cVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37702c = cVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f338834b.d(new d05.e(((com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f37702c.f213801c.getParcelable("key_bankcard")).field_bindSerial), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof d05.e;
            c05.c cVar = this.f37702c;
            if (z17) {
                cVar.f213801c.putString("kreq_token", ((d05.e) m1Var).f225589e);
                return false;
            }
            if (m1Var instanceof d05.c) {
                cVar.f213801c.putDouble("key_credit_amount", ((d05.c) m1Var).f225586d);
                cVar.o(this.f338833a, 0, cVar.f213801c);
                return true;
            }
        }
        return false;
    }
}
