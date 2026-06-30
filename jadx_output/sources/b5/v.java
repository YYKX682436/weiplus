package b5;

/* loaded from: classes13.dex */
public class v extends l4.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl f17891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl, int i17) {
        super(i17);
        this.f17891b = workDatabase_Impl;
    }

    @Override // l4.r
    public void a(p4.b bVar) {
        q4.c cVar = (q4.c) bVar;
        cVar.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        cVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        cVar.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.c("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.c("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // l4.r
    public l4.s b(p4.b bVar) {
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("work_spec_id", new n4.c("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new n4.c("prerequisite_id", "TEXT", true, 2, null, 1));
        java.util.HashSet hashSet = new java.util.HashSet(2);
        hashSet.add(new n4.d("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList(dm.i4.COL_ID)));
        hashSet.add(new n4.d("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("prerequisite_id"), java.util.Arrays.asList(dm.i4.COL_ID)));
        java.util.HashSet hashSet2 = new java.util.HashSet(2);
        hashSet2.add(new n4.f("index_Dependency_work_spec_id", false, java.util.Arrays.asList("work_spec_id")));
        hashSet2.add(new n4.f("index_Dependency_prerequisite_id", false, java.util.Arrays.asList("prerequisite_id")));
        n4.g gVar = new n4.g("Dependency", hashMap, hashSet, hashSet2);
        n4.g a17 = n4.g.a(bVar, "Dependency");
        if (!gVar.equals(a17)) {
            return new l4.s(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + a17);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(25);
        hashMap2.put(dm.i4.COL_ID, new n4.c(dm.i4.COL_ID, "TEXT", true, 1, null, 1));
        hashMap2.put("state", new n4.c("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new n4.c("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new n4.c("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new n4.c("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new n4.c("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new n4.c("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new n4.c("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new n4.c("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new n4.c("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new n4.c("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new n4.c("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new n4.c("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new n4.c("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new n4.c("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new n4.c("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new n4.c("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new n4.c("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new n4.c("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new n4.c("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new n4.c("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new n4.c("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new n4.c("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new n4.c("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new n4.c("content_uri_triggers", "BLOB", false, 0, null, 1));
        java.util.HashSet hashSet3 = new java.util.HashSet(0);
        java.util.HashSet hashSet4 = new java.util.HashSet(2);
        hashSet4.add(new n4.f("index_WorkSpec_schedule_requested_at", false, java.util.Arrays.asList("schedule_requested_at")));
        hashSet4.add(new n4.f("index_WorkSpec_period_start_time", false, java.util.Arrays.asList("period_start_time")));
        n4.g gVar2 = new n4.g("WorkSpec", hashMap2, hashSet3, hashSet4);
        n4.g a18 = n4.g.a(bVar, "WorkSpec");
        if (!gVar2.equals(a18)) {
            return new l4.s(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + a18);
        }
        java.util.HashMap hashMap3 = new java.util.HashMap(2);
        hashMap3.put("tag", new n4.c("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new n4.c("work_spec_id", "TEXT", true, 2, null, 1));
        java.util.HashSet hashSet5 = new java.util.HashSet(1);
        hashSet5.add(new n4.d("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList(dm.i4.COL_ID)));
        java.util.HashSet hashSet6 = new java.util.HashSet(1);
        hashSet6.add(new n4.f("index_WorkTag_work_spec_id", false, java.util.Arrays.asList("work_spec_id")));
        n4.g gVar3 = new n4.g("WorkTag", hashMap3, hashSet5, hashSet6);
        n4.g a19 = n4.g.a(bVar, "WorkTag");
        if (!gVar3.equals(a19)) {
            return new l4.s(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + a19);
        }
        java.util.HashMap hashMap4 = new java.util.HashMap(2);
        hashMap4.put("work_spec_id", new n4.c("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new n4.c("system_id", "INTEGER", true, 0, null, 1));
        java.util.HashSet hashSet7 = new java.util.HashSet(1);
        hashSet7.add(new n4.d("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList(dm.i4.COL_ID)));
        n4.g gVar4 = new n4.g("SystemIdInfo", hashMap4, hashSet7, new java.util.HashSet(0));
        n4.g a27 = n4.g.a(bVar, "SystemIdInfo");
        if (!gVar4.equals(a27)) {
            return new l4.s(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + a27);
        }
        java.util.HashMap hashMap5 = new java.util.HashMap(2);
        hashMap5.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, new n4.c(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new n4.c("work_spec_id", "TEXT", true, 2, null, 1));
        java.util.HashSet hashSet8 = new java.util.HashSet(1);
        hashSet8.add(new n4.d("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList(dm.i4.COL_ID)));
        java.util.HashSet hashSet9 = new java.util.HashSet(1);
        hashSet9.add(new n4.f("index_WorkName_work_spec_id", false, java.util.Arrays.asList("work_spec_id")));
        n4.g gVar5 = new n4.g("WorkName", hashMap5, hashSet8, hashSet9);
        n4.g a28 = n4.g.a(bVar, "WorkName");
        if (!gVar5.equals(a28)) {
            return new l4.s(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + a28);
        }
        java.util.HashMap hashMap6 = new java.util.HashMap(2);
        hashMap6.put("work_spec_id", new n4.c("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new n4.c("progress", "BLOB", true, 0, null, 1));
        java.util.HashSet hashSet10 = new java.util.HashSet(1);
        hashSet10.add(new n4.d("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList(dm.i4.COL_ID)));
        n4.g gVar6 = new n4.g("WorkProgress", hashMap6, hashSet10, new java.util.HashSet(0));
        n4.g a29 = n4.g.a(bVar, "WorkProgress");
        if (!gVar6.equals(a29)) {
            return new l4.s(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + a29);
        }
        java.util.HashMap hashMap7 = new java.util.HashMap(2);
        hashMap7.put("key", new n4.c("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new n4.c("long_value", "INTEGER", false, 0, null, 1));
        n4.g gVar7 = new n4.g("Preference", hashMap7, new java.util.HashSet(0), new java.util.HashSet(0));
        n4.g a37 = n4.g.a(bVar, "Preference");
        if (gVar7.equals(a37)) {
            return new l4.s(true, null);
        }
        return new l4.s(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + a37);
    }
}
