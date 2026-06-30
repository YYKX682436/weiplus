package j5;

/* loaded from: classes13.dex */
public final class g0 implements j5.x {

    /* renamed from: a, reason: collision with root package name */
    public final l4.q f379267a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f379268b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.w f379269c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.w f379270d;

    /* renamed from: e, reason: collision with root package name */
    public final l4.w f379271e;

    /* renamed from: f, reason: collision with root package name */
    public final l4.w f379272f;

    /* renamed from: g, reason: collision with root package name */
    public final l4.w f379273g;

    /* renamed from: h, reason: collision with root package name */
    public final l4.w f379274h;

    /* renamed from: i, reason: collision with root package name */
    public final l4.w f379275i;

    public g0(l4.q qVar) {
        this.f379267a = qVar;
        this.f379268b = new j5.y(this, qVar);
        this.f379269c = new j5.z(this, qVar);
        this.f379270d = new j5.a0(this, qVar);
        this.f379271e = new j5.b0(this, qVar);
        this.f379272f = new j5.c0(this, qVar);
        this.f379273g = new j5.d0(this, qVar);
        this.f379274h = new j5.e0(this, qVar);
        this.f379275i = new j5.f0(this, qVar);
        new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(java.lang.String str) {
        l4.q qVar = this.f379267a;
        qVar.b();
        l4.w wVar = this.f379269c;
        p4.i a17 = wVar.a();
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(1);
        } else {
            ((q4.h) a17).mo145067x35198eae(1, str);
        }
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }

    public java.util.List b(int i17) {
        l4.u uVar;
        l4.u c17 = l4.u.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c17.mo145065x37fbf859(1, i17);
        l4.q qVar = this.f379267a;
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
            int a47 = n4.a.a(a17, dm.i4.f66865x76d1ec5a);
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
                    fVar.f82918a = j5.l0.c(a17.getInt(a18));
                    fVar.f82919b = a17.getInt(a19) != 0;
                    fVar.f82920c = a17.getInt(a27) != 0;
                    fVar.f82921d = a17.getInt(a28) != 0;
                    fVar.f82922e = a17.getInt(a29) != 0;
                    int i29 = a19;
                    int i37 = a27;
                    fVar.f82923f = a17.getLong(a37);
                    fVar.f82924g = a17.getLong(a38);
                    fVar.f82925h = j5.l0.a(a17.getBlob(a39));
                    j5.w wVar = new j5.w(string, string2);
                    wVar.f379298b = j5.l0.e(a17.getInt(a48));
                    wVar.f379300d = a17.getString(a57);
                    wVar.f379301e = a5.m.a(a17.getBlob(a58));
                    int i38 = i18;
                    wVar.f379302f = a5.m.a(a17.getBlob(i38));
                    int i39 = a57;
                    int i47 = a67;
                    wVar.f379303g = a17.getLong(i47);
                    int i48 = a28;
                    int i49 = a68;
                    wVar.f379304h = a17.getLong(i49);
                    int i57 = a69;
                    wVar.f379305i = a17.getLong(i57);
                    int i58 = a76;
                    wVar.f379307k = a17.getInt(i58);
                    int i59 = a77;
                    wVar.f379308l = j5.l0.b(a17.getInt(i59));
                    int i66 = a78;
                    wVar.f379309m = a17.getLong(i66);
                    int i67 = a79;
                    wVar.f379310n = a17.getLong(i67);
                    int i68 = a86;
                    wVar.f379311o = a17.getLong(i68);
                    int i69 = a87;
                    wVar.f379312p = a17.getLong(i69);
                    int i76 = a88;
                    wVar.f379313q = a17.getInt(i76) != 0;
                    int i77 = a89;
                    wVar.f379314r = j5.l0.d(a17.getInt(i77));
                    wVar.f379306j = fVar;
                    arrayList.add(wVar);
                    i18 = i38;
                    a19 = i29;
                    a67 = i47;
                    a68 = i49;
                    a78 = i66;
                    a79 = i67;
                    a88 = i76;
                    a49 = i27;
                    a18 = i28;
                    a89 = i77;
                    a87 = i69;
                    a57 = i39;
                    a47 = i19;
                    a27 = i37;
                    a86 = i68;
                    a28 = i48;
                    a69 = i57;
                    a76 = i58;
                    a77 = i59;
                }
                a17.close();
                uVar.m145068x41012807();
                return arrayList;
            } catch (java.lang.Throwable th6) {
                th = th6;
                a17.close();
                uVar.m145068x41012807();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            uVar = c17;
        }
    }

    public java.util.List c(int i17) {
        l4.u uVar;
        l4.u c17 = l4.u.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c17.mo145065x37fbf859(1, i17);
        l4.q qVar = this.f379267a;
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
            int a47 = n4.a.a(a17, dm.i4.f66865x76d1ec5a);
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
                    fVar.f82918a = j5.l0.c(a17.getInt(a18));
                    fVar.f82919b = a17.getInt(a19) != 0;
                    fVar.f82920c = a17.getInt(a27) != 0;
                    fVar.f82921d = a17.getInt(a28) != 0;
                    fVar.f82922e = a17.getInt(a29) != 0;
                    int i29 = a19;
                    int i37 = a27;
                    fVar.f82923f = a17.getLong(a37);
                    fVar.f82924g = a17.getLong(a38);
                    fVar.f82925h = j5.l0.a(a17.getBlob(a39));
                    j5.w wVar = new j5.w(string, string2);
                    wVar.f379298b = j5.l0.e(a17.getInt(a48));
                    wVar.f379300d = a17.getString(a57);
                    wVar.f379301e = a5.m.a(a17.getBlob(a58));
                    int i38 = i18;
                    wVar.f379302f = a5.m.a(a17.getBlob(i38));
                    int i39 = a57;
                    int i47 = a67;
                    wVar.f379303g = a17.getLong(i47);
                    int i48 = a28;
                    int i49 = a68;
                    wVar.f379304h = a17.getLong(i49);
                    int i57 = a69;
                    wVar.f379305i = a17.getLong(i57);
                    int i58 = a76;
                    wVar.f379307k = a17.getInt(i58);
                    int i59 = a77;
                    wVar.f379308l = j5.l0.b(a17.getInt(i59));
                    int i66 = a78;
                    wVar.f379309m = a17.getLong(i66);
                    int i67 = a79;
                    wVar.f379310n = a17.getLong(i67);
                    int i68 = a86;
                    wVar.f379311o = a17.getLong(i68);
                    int i69 = a87;
                    wVar.f379312p = a17.getLong(i69);
                    int i76 = a88;
                    wVar.f379313q = a17.getInt(i76) != 0;
                    int i77 = a89;
                    wVar.f379314r = j5.l0.d(a17.getInt(i77));
                    wVar.f379306j = fVar;
                    arrayList.add(wVar);
                    i18 = i38;
                    a19 = i29;
                    a67 = i47;
                    a68 = i49;
                    a78 = i66;
                    a79 = i67;
                    a88 = i76;
                    a49 = i27;
                    a18 = i28;
                    a89 = i77;
                    a87 = i69;
                    a57 = i39;
                    a47 = i19;
                    a27 = i37;
                    a86 = i68;
                    a28 = i48;
                    a69 = i57;
                    a76 = i58;
                    a77 = i59;
                }
                a17.close();
                uVar.m145068x41012807();
                return arrayList;
            } catch (java.lang.Throwable th6) {
                th = th6;
                a17.close();
                uVar.m145068x41012807();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            uVar = c17;
        }
    }

    public java.util.List d() {
        l4.u uVar;
        l4.u c17 = l4.u.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        l4.q qVar = this.f379267a;
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
            int a47 = n4.a.a(a17, dm.i4.f66865x76d1ec5a);
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
                int i17 = a59;
                java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
                while (a17.moveToNext()) {
                    java.lang.String string = a17.getString(a47);
                    int i18 = a47;
                    java.lang.String string2 = a17.getString(a49);
                    int i19 = a49;
                    a5.f fVar = new a5.f();
                    int i27 = a18;
                    fVar.f82918a = j5.l0.c(a17.getInt(a18));
                    fVar.f82919b = a17.getInt(a19) != 0;
                    fVar.f82920c = a17.getInt(a27) != 0;
                    fVar.f82921d = a17.getInt(a28) != 0;
                    fVar.f82922e = a17.getInt(a29) != 0;
                    int i28 = a19;
                    int i29 = a27;
                    fVar.f82923f = a17.getLong(a37);
                    fVar.f82924g = a17.getLong(a38);
                    fVar.f82925h = j5.l0.a(a17.getBlob(a39));
                    j5.w wVar = new j5.w(string, string2);
                    wVar.f379298b = j5.l0.e(a17.getInt(a48));
                    wVar.f379300d = a17.getString(a57);
                    wVar.f379301e = a5.m.a(a17.getBlob(a58));
                    int i37 = i17;
                    wVar.f379302f = a5.m.a(a17.getBlob(i37));
                    int i38 = a58;
                    int i39 = a67;
                    wVar.f379303g = a17.getLong(i39);
                    int i47 = a28;
                    int i48 = a68;
                    wVar.f379304h = a17.getLong(i48);
                    int i49 = a69;
                    wVar.f379305i = a17.getLong(i49);
                    int i57 = a76;
                    wVar.f379307k = a17.getInt(i57);
                    int i58 = a77;
                    wVar.f379308l = j5.l0.b(a17.getInt(i58));
                    int i59 = a78;
                    wVar.f379309m = a17.getLong(i59);
                    int i66 = a79;
                    wVar.f379310n = a17.getLong(i66);
                    int i67 = a86;
                    wVar.f379311o = a17.getLong(i67);
                    int i68 = a87;
                    wVar.f379312p = a17.getLong(i68);
                    int i69 = a88;
                    wVar.f379313q = a17.getInt(i69) != 0;
                    int i76 = a89;
                    wVar.f379314r = j5.l0.d(a17.getInt(i76));
                    wVar.f379306j = fVar;
                    arrayList.add(wVar);
                    i17 = i37;
                    a19 = i28;
                    a67 = i39;
                    a68 = i48;
                    a78 = i59;
                    a79 = i66;
                    a88 = i69;
                    a49 = i19;
                    a18 = i27;
                    a89 = i76;
                    a87 = i68;
                    a58 = i38;
                    a47 = i18;
                    a27 = i29;
                    a86 = i67;
                    a28 = i47;
                    a69 = i49;
                    a76 = i57;
                    a77 = i58;
                }
                a17.close();
                uVar.m145068x41012807();
                return arrayList;
            } catch (java.lang.Throwable th6) {
                th = th6;
                a17.close();
                uVar.m145068x41012807();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            uVar = c17;
        }
    }

    public java.util.List e() {
        l4.u uVar;
        l4.u c17 = l4.u.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        l4.q qVar = this.f379267a;
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
            int a47 = n4.a.a(a17, dm.i4.f66865x76d1ec5a);
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
                int i17 = a59;
                java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
                while (a17.moveToNext()) {
                    java.lang.String string = a17.getString(a47);
                    int i18 = a47;
                    java.lang.String string2 = a17.getString(a49);
                    int i19 = a49;
                    a5.f fVar = new a5.f();
                    int i27 = a18;
                    fVar.f82918a = j5.l0.c(a17.getInt(a18));
                    fVar.f82919b = a17.getInt(a19) != 0;
                    fVar.f82920c = a17.getInt(a27) != 0;
                    fVar.f82921d = a17.getInt(a28) != 0;
                    fVar.f82922e = a17.getInt(a29) != 0;
                    int i28 = a19;
                    int i29 = a27;
                    fVar.f82923f = a17.getLong(a37);
                    fVar.f82924g = a17.getLong(a38);
                    fVar.f82925h = j5.l0.a(a17.getBlob(a39));
                    j5.w wVar = new j5.w(string, string2);
                    wVar.f379298b = j5.l0.e(a17.getInt(a48));
                    wVar.f379300d = a17.getString(a57);
                    wVar.f379301e = a5.m.a(a17.getBlob(a58));
                    int i37 = i17;
                    wVar.f379302f = a5.m.a(a17.getBlob(i37));
                    int i38 = a58;
                    int i39 = a67;
                    wVar.f379303g = a17.getLong(i39);
                    int i47 = a28;
                    int i48 = a68;
                    wVar.f379304h = a17.getLong(i48);
                    int i49 = a69;
                    wVar.f379305i = a17.getLong(i49);
                    int i57 = a76;
                    wVar.f379307k = a17.getInt(i57);
                    int i58 = a77;
                    wVar.f379308l = j5.l0.b(a17.getInt(i58));
                    int i59 = a78;
                    wVar.f379309m = a17.getLong(i59);
                    int i66 = a79;
                    wVar.f379310n = a17.getLong(i66);
                    int i67 = a86;
                    wVar.f379311o = a17.getLong(i67);
                    int i68 = a87;
                    wVar.f379312p = a17.getLong(i68);
                    int i69 = a88;
                    wVar.f379313q = a17.getInt(i69) != 0;
                    int i76 = a89;
                    wVar.f379314r = j5.l0.d(a17.getInt(i76));
                    wVar.f379306j = fVar;
                    arrayList.add(wVar);
                    i17 = i37;
                    a19 = i28;
                    a67 = i39;
                    a68 = i48;
                    a78 = i59;
                    a79 = i66;
                    a88 = i69;
                    a49 = i19;
                    a18 = i27;
                    a89 = i76;
                    a87 = i68;
                    a58 = i38;
                    a47 = i18;
                    a27 = i29;
                    a86 = i67;
                    a28 = i47;
                    a69 = i49;
                    a76 = i57;
                    a77 = i58;
                }
                a17.close();
                uVar.m145068x41012807();
                return arrayList;
            } catch (java.lang.Throwable th6) {
                th = th6;
                a17.close();
                uVar.m145068x41012807();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            uVar = c17;
        }
    }

    public a5.q0 f(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c17.mo145066x37fcf764(1);
        } else {
            c17.mo145067x35198eae(1, str);
        }
        l4.q qVar = this.f379267a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            return a17.moveToFirst() ? j5.l0.e(a17.getInt(0)) : null;
        } finally {
            a17.close();
            c17.m145068x41012807();
        }
    }

    public java.util.List g(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c17.mo145066x37fcf764(1);
        } else {
            c17.mo145067x35198eae(1, str);
        }
        l4.q qVar = this.f379267a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
            while (a17.moveToNext()) {
                arrayList.add(a17.getString(0));
            }
            return arrayList;
        } finally {
            a17.close();
            c17.m145068x41012807();
        }
    }

    public java.util.List h(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c17.mo145066x37fcf764(1);
        } else {
            c17.mo145067x35198eae(1, str);
        }
        l4.q qVar = this.f379267a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
            while (a17.moveToNext()) {
                arrayList.add(a17.getString(0));
            }
            return arrayList;
        } finally {
            a17.close();
            c17.m145068x41012807();
        }
    }

    public j5.w i(java.lang.String str) {
        l4.u uVar;
        j5.w wVar;
        l4.u c17 = l4.u.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c17.mo145066x37fcf764(1);
        } else {
            c17.mo145067x35198eae(1, str);
        }
        l4.q qVar = this.f379267a;
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
            int a47 = n4.a.a(a17, dm.i4.f66865x76d1ec5a);
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
                if (a17.moveToFirst()) {
                    java.lang.String string = a17.getString(a47);
                    java.lang.String string2 = a17.getString(a49);
                    a5.f fVar = new a5.f();
                    fVar.f82918a = j5.l0.c(a17.getInt(a18));
                    fVar.f82919b = a17.getInt(a19) != 0;
                    fVar.f82920c = a17.getInt(a27) != 0;
                    fVar.f82921d = a17.getInt(a28) != 0;
                    fVar.f82922e = a17.getInt(a29) != 0;
                    fVar.f82923f = a17.getLong(a37);
                    fVar.f82924g = a17.getLong(a38);
                    fVar.f82925h = j5.l0.a(a17.getBlob(a39));
                    j5.w wVar2 = new j5.w(string, string2);
                    wVar2.f379298b = j5.l0.e(a17.getInt(a48));
                    wVar2.f379300d = a17.getString(a57);
                    wVar2.f379301e = a5.m.a(a17.getBlob(a58));
                    wVar2.f379302f = a5.m.a(a17.getBlob(a59));
                    wVar2.f379303g = a17.getLong(a67);
                    wVar2.f379304h = a17.getLong(a68);
                    wVar2.f379305i = a17.getLong(a69);
                    wVar2.f379307k = a17.getInt(a76);
                    wVar2.f379308l = j5.l0.b(a17.getInt(a77));
                    wVar2.f379309m = a17.getLong(a78);
                    wVar2.f379310n = a17.getLong(a79);
                    wVar2.f379311o = a17.getLong(a86);
                    wVar2.f379312p = a17.getLong(a87);
                    wVar2.f379313q = a17.getInt(a88) != 0;
                    wVar2.f379314r = j5.l0.d(a17.getInt(a89));
                    wVar2.f379306j = fVar;
                    wVar = wVar2;
                } else {
                    wVar = null;
                }
                a17.close();
                uVar.m145068x41012807();
                return wVar;
            } catch (java.lang.Throwable th6) {
                th = th6;
                a17.close();
                uVar.m145068x41012807();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            uVar = c17;
        }
    }

    public java.util.List j(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c17.mo145066x37fcf764(1);
        } else {
            c17.mo145067x35198eae(1, str);
        }
        l4.q qVar = this.f379267a;
        qVar.b();
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            int a18 = n4.a.a(a17, dm.i4.f66865x76d1ec5a);
            int a19 = n4.a.a(a17, "state");
            java.util.ArrayList arrayList = new java.util.ArrayList(a17.getCount());
            while (a17.moveToNext()) {
                j5.v vVar = new j5.v();
                vVar.f379294a = a17.getString(a18);
                vVar.f379295b = j5.l0.e(a17.getInt(a19));
                arrayList.add(vVar);
            }
            return arrayList;
        } finally {
            a17.close();
            c17.m145068x41012807();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int k(java.lang.String str) {
        l4.q qVar = this.f379267a;
        qVar.b();
        l4.w wVar = this.f379272f;
        p4.i a17 = wVar.a();
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(1);
        } else {
            ((q4.h) a17).mo145067x35198eae(1, str);
        }
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            int a18 = iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
            return a18;
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int l(java.lang.String str, long j17) {
        l4.q qVar = this.f379267a;
        qVar.b();
        l4.w wVar = this.f379274h;
        p4.i a17 = wVar.a();
        ((q4.h) a17).mo145065x37fbf859(1, j17);
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(2);
        } else {
            ((q4.h) a17).mo145067x35198eae(2, str);
        }
        qVar.c();
        try {
            int a18 = ((q4.i) a17).a();
            qVar.h();
            return a18;
        } finally {
            qVar.f();
            wVar.c(a17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(java.lang.String str) {
        l4.q qVar = this.f379267a;
        qVar.b();
        l4.w wVar = this.f379273g;
        p4.i a17 = wVar.a();
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(1);
        } else {
            ((q4.h) a17).mo145067x35198eae(1, str);
        }
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            int a18 = iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
            return a18;
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(java.lang.String str, a5.m mVar) {
        l4.q qVar = this.f379267a;
        qVar.b();
        l4.w wVar = this.f379270d;
        p4.i a17 = wVar.a();
        byte[] d17 = a5.m.d(mVar);
        if (d17 == null) {
            ((q4.h) a17).mo145066x37fcf764(1);
        } else {
            ((q4.h) a17).mo145063x37f7617a(1, d17);
        }
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(2);
        } else {
            ((q4.h) a17).mo145067x35198eae(2, str);
        }
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(java.lang.String str, long j17) {
        l4.q qVar = this.f379267a;
        qVar.b();
        l4.w wVar = this.f379271e;
        p4.i a17 = wVar.a();
        ((q4.h) a17).mo145065x37fbf859(1, j17);
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(2);
        } else {
            ((q4.h) a17).mo145067x35198eae(2, str);
        }
        qVar.c();
        try {
            ((q4.i) a17).a();
            qVar.h();
        } finally {
            qVar.f();
            wVar.c(a17);
        }
    }

    public int p(a5.q0 q0Var, java.lang.String... strArr) {
        l4.q qVar = this.f379267a;
        qVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append("?");
            if (i17 < length - 1) {
                sb6.append(",");
            }
        }
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        qVar.a();
        qVar.b();
        android.database.sqlite.SQLiteStatement compileStatement = ((q4.c) qVar.f397281c.d0()).f441540d.compileStatement(sb7);
        compileStatement.bindLong(1, j5.l0.f(q0Var));
        int i18 = 2;
        for (java.lang.String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i18);
            } else {
                compileStatement.bindString(i18, str);
            }
            i18++;
        }
        qVar.c();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            qVar.h();
            return executeUpdateDelete;
        } finally {
            qVar.f();
        }
    }
}
