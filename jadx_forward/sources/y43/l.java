package y43;

/* loaded from: classes8.dex */
public final class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m33.f1 f540887d;

    public l(m33.f1 f1Var) {
        this.f540887d = f1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        m33.f1 f1Var = this.f540887d;
        if (bundle == null) {
            if (f1Var != null) {
                f1Var.a(null);
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("appid");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        bundle.getString("wepkg_id");
        if (f1Var != null) {
            m33.e1 e1Var = new m33.e1();
            e1Var.f404815a = string;
            e1Var.f404816b = string2;
            f1Var.a(e1Var);
        }
    }
}
