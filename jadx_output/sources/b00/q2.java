package b00;

@j95.b
/* loaded from: classes8.dex */
public final class q2 extends i95.w implements c00.b4 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f16753d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f16754e;

    /* renamed from: f, reason: collision with root package name */
    public long f16755f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16756g;

    public void Ai(c00.a4 reason, java.lang.String eventId, r45.vs2 ctrlInfo, r45.f03 showInfo, long j17) {
        kotlin.jvm.internal.o.g(reason, "reason");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        if (((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("reddot_exit", null, kz5.c1.k(new jz5.l("page_id", "my_page"), new jz5.l("element_id", eventId), new jz5.l("reddot_id", ctrlInfo.f388503x), new jz5.l("reddot_ext_info", ctrlInfo.f388499t), new jz5.l("reddot_show_path", showInfo.f373892i), new jz5.l("reddot_show_type", java.lang.Integer.valueOf(showInfo.f373887d)), new jz5.l("reddot_show_num", java.lang.Integer.valueOf(showInfo.f373888e)), new jz5.l("reddot_show_title", showInfo.f373889f), new jz5.l("reddot_rec_timestamp", java.lang.Long.valueOf(j17)), new jz5.l("reddot_clear_reason", java.lang.Integer.valueOf(reason.f36954d)), new jz5.l("reddot_type", java.lang.Integer.valueOf(ctrlInfo.f388487e))), 12, false);
        }
    }

    public void wi(java.lang.String key, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32325, key, java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
