package df;

/* loaded from: classes7.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f311038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(df.w1 w1Var) {
        super(0);
        this.f311038d = w1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f311038d;
        sb6.append(w1Var.f311113d);
        sb6.append(" attach, reconnectRenderToSurface:");
        sb6.append(w1Var.f311124r);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        df.a0 a0Var = w1Var.f311118i;
        if (a0Var != null) {
            a0Var.f(w1Var.f311132z);
        }
        df.a0 a0Var2 = w1Var.f311118i;
        if (a0Var2 != null) {
            a0Var2.l();
        }
        if (w1Var.f311124r) {
            w1Var.f311124r = false;
            df.a0 a0Var3 = w1Var.f311118i;
            if (a0Var3 != null) {
                a0Var3.m();
            }
        }
        df.w0 w0Var = df.w0.f311102a;
        df.o1 listener = w1Var.f311130x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = df.w0.f311111j;
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
        return jz5.f0.f384359a;
    }
}
