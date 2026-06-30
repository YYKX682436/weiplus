package th5;

/* loaded from: classes12.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 f500928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.q f500929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.l0 f500930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f500931g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c16492xe3ef89b2, th5.q qVar, th5.l0 l0Var, android.view.View view) {
        super(1);
        this.f500928d = c16492xe3ef89b2;
        this.f500929e = qVar;
        this.f500930f = l0Var;
        this.f500931g = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "$this$visibility");
        visibility.c(this.f500928d);
        android.view.View view = this.f500931g;
        th5.q qVar = this.f500929e;
        if (qVar == null || !qVar.h() || this.f500930f.g0(qVar)) {
            visibility.b(view);
        } else {
            visibility.c(view);
        }
        return jz5.f0.f384359a;
    }
}
