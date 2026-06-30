package av4;

/* loaded from: classes.dex */
public final class g extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.g f14286d = new av4.g();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FetchSearchConfigJsApi", "FetchSearchConfig invoked");
        su4.o2.f(null, yc1.p.CTRL_INDEX, 0L, null, true);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 506;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "fetchSearchConfig";
    }
}
