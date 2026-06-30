package gt2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final gt2.d f356912b = gt2.c.f356911a;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f356913a = new java.util.concurrent.ConcurrentHashMap();

    public d() {
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new gt2.b(this));
    }

    public final int a(android.app.Activity activity) {
        android.content.Intent intent = activity.getIntent();
        if (intent != null) {
            return intent.getIntExtra("KEY_FINDER_PROCESS_ID", 0);
        }
        return 0;
    }

    public final void b(java.lang.String str, gt2.a aVar, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportData activity:");
        sb6.append(str);
        sb6.append(" processId:");
        sb6.append(aVar.f356906a);
        sb6.append(" inTime:");
        long j17 = aVar.f356907b;
        sb6.append(j17);
        sb6.append(" outTime:");
        sb6.append(aVar.f356908c);
        sb6.append(" source:");
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProcessOutReporter", sb6.toString());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        r45.qt2 qt2Var = aVar.f356909d;
        ((cy1.a) rVar).Cj("finder_process_out", null, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5))), new jz5.l("finder_context_id", qt2Var.m75945x2fec8307(1)), new jz5.l("finder_tab_context_id", qt2Var.m75945x2fec8307(2)), new jz5.l("in_time", java.lang.Long.valueOf(j17)), new jz5.l("out_time", java.lang.Long.valueOf(aVar.f356908c)), new jz5.l("finder_process_id", java.lang.Integer.valueOf(aVar.f356906a))), 25496);
    }
}
