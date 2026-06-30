package xx;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f539350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xx.y yVar, int i17) {
        super(1);
        this.f539349d = yVar;
        this.f539350e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("voice_id", this.f539349d.f539374n);
        getReportCommonData.put("word_cnt", java.lang.Integer.valueOf(this.f539350e));
        return jz5.f0.f384359a;
    }
}
