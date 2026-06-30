package xx;

/* loaded from: classes14.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f539347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx.b f539348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, long j17, xx.b bVar) {
        super(1);
        this.f539346d = str;
        this.f539347e = j17;
        this.f539348f = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("trace_id", this.f539346d);
        getReportCommonData.put("commenter_uin", java.lang.Long.valueOf(this.f539347e));
        getReportCommonData.put("comment_type", java.lang.Integer.valueOf(this.f539348f.f539306d));
        return jz5.f0.f384359a;
    }
}
