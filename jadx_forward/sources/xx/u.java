package xx;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f539356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17) {
        super(1);
        this.f539356d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("send_word_cnt", java.lang.Integer.valueOf(this.f539356d));
        return jz5.f0.f384359a;
    }
}
