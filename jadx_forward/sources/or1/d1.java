package or1;

/* loaded from: classes9.dex */
public class d1 implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ or1.f1 f429005a;

    public d1(or1.f1 f1Var) {
        this.f429005a = f1Var;
    }

    @Override // bb5.e
    public int a() {
        return this.f429005a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            or1.f1 f1Var = this.f429005a;
            if (i17 < f1Var.getCount()) {
                r45.co coVar = (r45.co) f1Var.getItem(i17);
                if (coVar == null) {
                    return null;
                }
                return coVar.f453209d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseBizListAdapter", "pos is invalid");
        return null;
    }
}
