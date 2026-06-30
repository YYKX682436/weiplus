package av4;

/* loaded from: classes8.dex */
public final class l extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.l f14299d = new av4.l();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map map = msg.f340790a;
        if (!map.containsKey("bizName") || !map.containsKey("bizKey")) {
            return false;
        }
        java.lang.Object obj = msg.f340790a.get("bizName");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        int i17 = (!kotlin.jvm.internal.o.b(str, "k1kVideo") && kotlin.jvm.internal.o.b(str, ya.a.SEARCH)) ? 30 : 27;
        java.lang.Object obj2 = msg.f340790a.get("bizKey");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = msg.f341013c;
        java.lang.String str3 = msg.f341019i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = (java.lang.String) obj2;
        multiTaskInfo.field_type = i17;
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Integer.valueOf(((com.tencent.mm.plugin.multitask.p1) l0Var).Ri(multiTaskInfo) ? 1 : 0));
        env.f340863d.e(str2, str3, hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "isTaskMinimized";
    }
}
