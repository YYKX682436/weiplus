package xc2;

/* loaded from: classes.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f534623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(r45.f96 f96Var) {
        super(1);
        this.f534623d = f96Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.c35 it = (r45.c35) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Succeed to preload POI basic info, id:");
        r45.f96 f96Var = this.f534623d;
        sb6.append(f96Var.m75945x2fec8307(5));
        sb6.append(" name:");
        sb6.append(f96Var.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PoiPreloadAndJumpHandler", sb6.toString());
        return jz5.f0.f384359a;
    }
}
