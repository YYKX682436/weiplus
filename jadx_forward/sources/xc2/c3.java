package xc2;

/* loaded from: classes.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f534643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(r45.f96 f96Var) {
        super(0);
        this.f534643d = f96Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to preload POI basic info, id:");
        r45.f96 f96Var = this.f534643d;
        sb6.append(f96Var.m75945x2fec8307(5));
        sb6.append(" name:");
        sb6.append(f96Var.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PoiPreloadAndJumpHandler", sb6.toString());
        return jz5.f0.f384359a;
    }
}
