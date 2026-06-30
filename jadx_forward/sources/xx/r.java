package xx;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f539352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx.d f539353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xx.y yVar, int i17, xx.d dVar) {
        super(1);
        this.f539351d = yVar;
        this.f539352e = i17;
        this.f539353f = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("voice_id", this.f539351d.f539374n);
        getReportCommonData.put("word_cnt", java.lang.Integer.valueOf(this.f539352e));
        getReportCommonData.put("end_voice_reason", java.lang.Integer.valueOf(this.f539353f.f539316d));
        return jz5.f0.f384359a;
    }
}
