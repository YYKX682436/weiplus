package ac2;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, ac2.t tVar) {
        super(1);
        this.f84575d = str;
        this.f84576e = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject appendClientReportInfo = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendClientReportInfo, "$this$appendClientReportInfo");
        appendClientReportInfo.put("drama_sessionid", this.f84575d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f84576e.f188103t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c) abstractC13919x46aff122 : null;
        java.lang.Integer valueOf = c13721x95edc87c != null ? java.lang.Integer.valueOf(c13721x95edc87c.f186824f) : null;
        java.lang.Integer num = valueOf != null && valueOf.intValue() > 0 ? valueOf : null;
        appendClientReportInfo.put("ref_commentscene", num != null ? num.intValue() : 0);
        return jz5.f0.f384359a;
    }
}
