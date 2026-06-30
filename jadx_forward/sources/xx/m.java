package xx;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.e f539337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f539338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xx.y yVar, xx.e eVar, boolean z17, java.lang.String str) {
        super(1);
        this.f539336d = yVar;
        this.f539337e = eVar;
        this.f539338f = z17;
        this.f539339g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        long a17 = c01.id.a();
        xx.y yVar = this.f539336d;
        getReportCommonData.put("model_speak_duration", java.lang.Long.valueOf(a17 - yVar.f539364d));
        getReportCommonData.put("model_speak_end_type", java.lang.Integer.valueOf(this.f539337e.f539321d));
        xx.f[] fVarArr = xx.f.f539322d;
        int i17 = 2;
        getReportCommonData.put("model_speak_type", 2);
        getReportCommonData.put("room_type", java.lang.Integer.valueOf(yVar.f539375o.f539326d));
        if (this.f539338f) {
            xx.a[] aVarArr = xx.a.f539302d;
            i17 = 1;
        } else {
            xx.a[] aVarArr2 = xx.a.f539302d;
        }
        getReportCommonData.put("answer_target", java.lang.Integer.valueOf(i17));
        getReportCommonData.put("trace_id", this.f539339g);
        return jz5.f0.f384359a;
    }
}
