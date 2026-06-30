package xx;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.c f539329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xx.y yVar, xx.c cVar) {
        super(1);
        this.f539328d = yVar;
        this.f539329e = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("loading_duration", java.lang.Long.valueOf(c01.id.a() - this.f539328d.f539363c));
        getReportCommonData.put("loading_end_type", java.lang.Integer.valueOf(this.f539329e.f539312d));
        return jz5.f0.f384359a;
    }
}
