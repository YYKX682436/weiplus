package xx;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.e f539335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xx.y yVar, xx.e eVar) {
        super(1);
        this.f539334d = yVar;
        this.f539335e = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        long a17 = c01.id.a();
        xx.y yVar = this.f539334d;
        getReportCommonData.put("model_speak_duration", java.lang.Long.valueOf(a17 - yVar.f539364d));
        getReportCommonData.put("model_speak_end_type", java.lang.Integer.valueOf(this.f539335e.f539321d));
        if (yVar.f539370j) {
            xx.f[] fVarArr = xx.f.f539322d;
            i17 = 2;
        } else {
            xx.f[] fVarArr2 = xx.f.f539322d;
            i17 = 1;
        }
        getReportCommonData.put("model_speak_type", java.lang.Integer.valueOf(i17));
        getReportCommonData.put("room_type", java.lang.Integer.valueOf(yVar.f539375o.f539326d));
        return jz5.f0.f384359a;
    }
}
