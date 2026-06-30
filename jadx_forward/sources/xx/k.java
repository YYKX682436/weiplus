package xx;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f539332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xx.y yVar, boolean z17, java.lang.String str) {
        super(1);
        this.f539331d = yVar;
        this.f539332e = z17;
        this.f539333f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        xx.f[] fVarArr = xx.f.f539322d;
        int i17 = 2;
        getReportCommonData.put("model_speak_type", 2);
        getReportCommonData.put("room_type", java.lang.Integer.valueOf(this.f539331d.f539375o.f539326d));
        if (this.f539332e) {
            xx.a[] aVarArr = xx.a.f539302d;
            i17 = 1;
        } else {
            xx.a[] aVarArr2 = xx.a.f539302d;
        }
        getReportCommonData.put("answer_target", java.lang.Integer.valueOf(i17));
        getReportCommonData.put("trace_id", this.f539333f);
        return jz5.f0.f384359a;
    }
}
