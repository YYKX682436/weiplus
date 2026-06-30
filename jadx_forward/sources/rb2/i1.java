package rb2;

/* loaded from: classes15.dex */
public final class i1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 f475182a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15) {
        this.f475182a = c13709xbc18ee15;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void a(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = this.f475182a;
        com.p314xaae8f345.mm.ui.p2740x696c9db.o5 o5Var = c13709xbc18ee15.A1;
        if (o5Var != null) {
            c13709xbc18ee15.f184613x0 = f18 > 200.0f;
            o5Var.a(f17, f18);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o5
    public void b(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o5 o5Var = this.f475182a.A1;
        if (o5Var != null) {
            o5Var.b(f17, f18);
        }
    }
}
