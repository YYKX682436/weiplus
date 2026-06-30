package gc4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f351989a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f351990b;

    public i(boolean z17, java.lang.String EduTriggerFeedid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(EduTriggerFeedid, "EduTriggerFeedid");
        this.f351989a = z17;
        this.f351990b = EduTriggerFeedid;
    }

    /* renamed from: equals */
    public boolean m131271xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return true;
        }
        if (!(obj instanceof gc4.i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return false;
        }
        gc4.i iVar = (gc4.i) obj;
        if (this.f351989a != iVar.f351989a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f351990b, iVar.f351990b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return b17;
    }

    /* renamed from: hashCode */
    public int m131272x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        int hashCode = (java.lang.Boolean.hashCode(this.f351989a) * 31) + this.f351990b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m131273x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        java.lang.String str = "SnsMsgStopRemindReportInfo(blockNotifyEduFlag=" + this.f351989a + ", EduTriggerFeedid=" + this.f351990b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return str;
    }
}
