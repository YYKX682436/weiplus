package androidx.work.impl.workers;

/* loaded from: classes13.dex */
public class DiagnosticsWorker extends androidx.work.Worker {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f12502m = a5.a0.e("DiagnosticsWrkr");

    public DiagnosticsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static java.lang.String i(j5.o oVar, j5.i0 i0Var, j5.j jVar, java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            j5.w wVar = (j5.w) it.next();
            j5.i a17 = ((j5.m) jVar).a(wVar.f297764a);
            java.lang.Integer valueOf = a17 != null ? java.lang.Integer.valueOf(a17.f297748b) : null;
            java.lang.String str = wVar.f297764a;
            j5.q qVar = (j5.q) oVar;
            qVar.getClass();
            l4.u c17 = l4.u.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                c17.bindNull(1);
            } else {
                c17.bindString(1, str);
            }
            l4.q qVar2 = qVar.f297756a;
            qVar2.b();
            android.database.Cursor a18 = n4.b.a(qVar2, c17, false, null);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList(a18.getCount());
                while (a18.moveToNext()) {
                    arrayList.add(a18.getString(0));
                }
                a18.close();
                c17.release();
                sb6.append(java.lang.String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", wVar.f297764a, wVar.f297766c, valueOf, wVar.f297765b.name(), android.text.TextUtils.join(",", arrayList), android.text.TextUtils.join(",", ((j5.k0) i0Var).a(wVar.f297764a))));
            } catch (java.lang.Throwable th6) {
                a18.close();
                c17.release();
                throw th6;
            }
        }
        return sb6.toString();
    }

    @Override // androidx.work.Worker
    public a5.y h() {
        l4.u uVar;
        j5.j jVar;
        j5.o oVar;
        j5.i0 i0Var;
        int i17;
        androidx.work.impl.WorkDatabase workDatabase = b5.w.c(this.f12458d).f17897c;
        j5.x n17 = workDatabase.n();
        j5.o l17 = workDatabase.l();
        j5.i0 o17 = workDatabase.o();
        j5.j k17 = workDatabase.k();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.DAYS.toMillis(1L);
        j5.g0 g0Var = (j5.g0) n17;
        g0Var.getClass();
        l4.u c17 = l4.u.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c17.bindLong(1, currentTimeMillis);
        l4.q qVar = g0Var.f297734a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            int a18 = n4.a.a(a17, "required_network_type");
            int a19 = n4.a.a(a17, "requires_charging");
            int a27 = n4.a.a(a17, "requires_device_idle");
            int a28 = n4.a.a(a17, "requires_battery_not_low");
            int a29 = n4.a.a(a17, "requires_storage_not_low");
            int a37 = n4.a.a(a17, "trigger_content_update_delay");
            int a38 = n4.a.a(a17, "trigger_max_content_delay");
            int a39 = n4.a.a(a17, "content_uri_triggers");
            int a47 = n4.a.a(a17, dm.i4.COL_ID);
            int a48 = n4.a.a(a17, "state");
            int a49 = n4.a.a(a17, "worker_class_name");
            int a57 = n4.a.a(a17, "input_merger_class_name");
            int a58 = n4.a.a(a17, "input");
            int a59 = n4.a.a(a17, "output");
            uVar = c17;
            try {
                int a67 = n4.a.a(a17, "initial_delay");
                int a68 = n4.a.a(a17, "interval_duration");
                int a69 = n4.a.a(a17, "flex_duration");
                int a76 = n4.a.a(a17, "run_attempt_count");
                int a77 = n4.a.a(a17, "backoff_policy");
                int a78 = n4.a.a(a17, "backoff_delay_duration");
                int a79 = n4.a.a(a17, "period_start_time");
                int a86 = n4.a.a(a17, "minimum_retention_duration");
                int a87 = n4.a.a(a17, "schedule_requested_at");
                int a88 = n4.a.a(a17, "run_in_foreground");
                int a89 = n4.a.a(a17, "out_of_quota_policy");
                int i18 = a59;
                java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
                while (a17.moveToNext()) {
                    java.lang.String string = a17.getString(a47);
                    int i19 = a47;
                    java.lang.String string2 = a17.getString(a49);
                    int i27 = a49;
                    a5.f fVar = new a5.f();
                    int i28 = a18;
                    fVar.f1385a = j5.l0.c(a17.getInt(a18));
                    fVar.f1386b = a17.getInt(a19) != 0;
                    fVar.f1387c = a17.getInt(a27) != 0;
                    fVar.f1388d = a17.getInt(a28) != 0;
                    fVar.f1389e = a17.getInt(a29) != 0;
                    int i29 = a19;
                    int i37 = a27;
                    fVar.f1390f = a17.getLong(a37);
                    fVar.f1391g = a17.getLong(a38);
                    fVar.f1392h = j5.l0.a(a17.getBlob(a39));
                    j5.w wVar = new j5.w(string, string2);
                    wVar.f297765b = j5.l0.e(a17.getInt(a48));
                    wVar.f297767d = a17.getString(a57);
                    wVar.f297768e = a5.m.a(a17.getBlob(a58));
                    int i38 = i18;
                    wVar.f297769f = a5.m.a(a17.getBlob(i38));
                    int i39 = a48;
                    i18 = i38;
                    int i47 = a67;
                    wVar.f297770g = a17.getLong(i47);
                    int i48 = a57;
                    int i49 = a68;
                    wVar.f297771h = a17.getLong(i49);
                    int i57 = a58;
                    int i58 = a69;
                    wVar.f297772i = a17.getLong(i58);
                    int i59 = a76;
                    wVar.f297774k = a17.getInt(i59);
                    int i66 = a77;
                    wVar.f297775l = j5.l0.b(a17.getInt(i66));
                    a69 = i58;
                    int i67 = a78;
                    wVar.f297776m = a17.getLong(i67);
                    int i68 = a79;
                    wVar.f297777n = a17.getLong(i68);
                    a79 = i68;
                    int i69 = a86;
                    wVar.f297778o = a17.getLong(i69);
                    a86 = i69;
                    int i76 = a87;
                    wVar.f297779p = a17.getLong(i76);
                    int i77 = a88;
                    wVar.f297780q = a17.getInt(i77) != 0;
                    int i78 = a89;
                    wVar.f297781r = j5.l0.d(a17.getInt(i78));
                    wVar.f297773j = fVar;
                    arrayList.add(wVar);
                    a89 = i78;
                    a19 = i29;
                    a48 = i39;
                    a57 = i48;
                    a87 = i76;
                    a49 = i27;
                    a27 = i37;
                    a18 = i28;
                    a88 = i77;
                    a67 = i47;
                    a47 = i19;
                    a78 = i67;
                    a58 = i57;
                    a68 = i49;
                    a76 = i59;
                    a77 = i66;
                }
                a17.close();
                uVar.release();
                j5.g0 g0Var2 = (j5.g0) n17;
                java.util.List d17 = g0Var2.d();
                java.util.List b17 = g0Var2.b(200);
                boolean isEmpty = arrayList.isEmpty();
                java.lang.String str = f12502m;
                if (isEmpty) {
                    jVar = k17;
                    oVar = l17;
                    i0Var = o17;
                    i17 = 0;
                } else {
                    i17 = 0;
                    a5.a0.c().d(str, "Recently completed work:\n\n", new java.lang.Throwable[0]);
                    jVar = k17;
                    oVar = l17;
                    i0Var = o17;
                    a5.a0.c().d(str, i(oVar, i0Var, jVar, arrayList), new java.lang.Throwable[0]);
                }
                if (!((java.util.ArrayList) d17).isEmpty()) {
                    a5.a0.c().d(str, "Running work:\n\n", new java.lang.Throwable[i17]);
                    a5.a0.c().d(str, i(oVar, i0Var, jVar, d17), new java.lang.Throwable[i17]);
                }
                if (!((java.util.ArrayList) b17).isEmpty()) {
                    a5.a0.c().d(str, "Enqueued work:\n\n", new java.lang.Throwable[i17]);
                    a5.a0.c().d(str, i(oVar, i0Var, jVar, b17), new java.lang.Throwable[i17]);
                }
                return a5.y.a();
            } catch (java.lang.Throwable th6) {
                th = th6;
                a17.close();
                uVar.release();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            uVar = c17;
        }
    }
}
