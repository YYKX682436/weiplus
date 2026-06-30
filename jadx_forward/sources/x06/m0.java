package x06;

/* loaded from: classes16.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x06.n0 f532809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(x06.n0 n0Var) {
        super(0);
        this.f532809d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List b17 = kz5.b0.b();
        x06.n0 n0Var = this.f532809d;
        lz5.e eVar = (lz5.e) b17;
        eVar.add(n0Var.f532811a.f532867d);
        x06.w0 w0Var = n0Var.f532812b;
        if (w0Var != null) {
            eVar.add("under-migration:" + w0Var.f532867d);
        }
        for (java.util.Map.Entry entry : n0Var.f532813c.entrySet()) {
            eVar.add("@" + entry.getKey() + ':' + ((x06.w0) entry.getValue()).f532867d);
        }
        return (java.lang.String[]) ((lz5.e) kz5.b0.a(b17)).toArray(new java.lang.String[0]);
    }
}
