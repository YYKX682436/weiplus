package sc2;

/* loaded from: classes2.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.z3 f487891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f487892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(sc2.z3 z3Var, long j17, ad2.h hVar, android.view.View view) {
        super(0);
        this.f487891d = z3Var;
        this.f487892e = j17;
        this.f487893f = hVar;
        this.f487894g = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.wf6 wf6Var;
        ad2.h hVar = this.f487893f;
        int m75939xb282bd08 = (hVar == null || (wf6Var = hVar.f84682m) == null) ? -1 : wf6Var.m75939xb282bd08(2);
        java.util.HashMap hashMap = sc2.z3.f487945z;
        this.f487891d.G(this.f487892e, m75939xb282bd08);
        this.f487893f.f(400L, this.f487894g, true, null);
        return jz5.f0.f384359a;
    }
}
