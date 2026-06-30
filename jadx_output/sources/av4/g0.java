package av4;

/* loaded from: classes.dex */
public final class g0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.g0 f14287d = new av4.g0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.tencent.mm.plugin.webview.stub.z0 b17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map map = msg.f340790a;
        if (!map.containsKey("bizName") || !map.containsKey("bizKey")) {
            return false;
        }
        java.lang.Object obj = msg.f340790a.get("bizName");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        zv4.g gVar = zv4.h.f476461a;
        int b18 = gVar.b((java.lang.String) obj);
        java.lang.Object obj2 = msg.f340790a.get("bizKey");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj2;
        gVar.f(b18, str, env.f340860a);
        if (b18 == 30 && (b17 = env.b()) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bizKey", str);
            b17.callback(163, bundle);
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", new java.util.HashMap());
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "removeMinimizeTask";
    }
}
