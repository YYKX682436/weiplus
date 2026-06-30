package xx;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f539357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xx.y yVar) {
        super(1);
        this.f539357d = yVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("speak_duration", java.lang.Long.valueOf(c01.id.a() - this.f539357d.f539362b));
        return jz5.f0.f384359a;
    }
}
