package qk2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f445966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.MenuItem menuItem) {
        super(2);
        this.f445966d = menuItem;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a result = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result.f186860a;
        android.view.MenuItem menuItem = this.f445966d;
        if (z17) {
            r45.f03 f03Var = result.f186861b;
            if (!(f03Var != null && f03Var.f455420d == 6) || booleanValue) {
                db5.h4 h4Var = (db5.h4) menuItem;
                h4Var.f309896d = false;
                h4Var.f309897e = true;
            } else {
                db5.h4 h4Var2 = (db5.h4) menuItem;
                h4Var2.f309896d = true;
                h4Var2.f309897e = false;
            }
        } else {
            db5.h4 h4Var3 = (db5.h4) menuItem;
            h4Var3.f309896d = false;
            h4Var3.f309897e = false;
        }
        return jz5.f0.f384359a;
    }
}
