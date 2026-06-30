package xr;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f537675a;

    /* renamed from: b, reason: collision with root package name */
    public final qk.h6 f537676b;

    /* renamed from: c, reason: collision with root package name */
    public final as.a f537677c;

    public e(int i17, qk.h6 item, as.a executor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        this.f537675a = i17;
        this.f537676b = item;
        this.f537677c = executor;
    }

    /* renamed from: equals */
    public boolean m175776xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof xr.e) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xr.e) obj).f537676b.f66769xf47740ff, this.f537676b.f66769xf47740ff);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m175777x9616526c() {
        return "FunctionMsgTask(mOpCode=" + this.f537675a + ", mItem=" + this.f537676b + ')';
    }
}
