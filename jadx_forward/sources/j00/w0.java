package j00;

/* loaded from: classes9.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f378457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f378458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j00.k1 k1Var, android.content.Context context, yz5.a aVar) {
        super(3);
        this.f378456d = k1Var;
        this.f378457e = context;
        this.f378458f = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.Map enrichedParams = (java.util.Map) obj;
        bw5.bf0 resp = (bw5.bf0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enrichedParams, "enrichedParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((bw5.ph0) obj3, "<anonymous parameter 2>");
        bw5.yh0 b17 = resp.b().b();
        bw5.ph0 ph0Var = (bw5.ph0) b17.c().f113657d.get(0);
        boolean z17 = b17.f117026i == 1;
        java.lang.Object obj4 = enrichedParams.get("orderId");
        java.lang.String str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.Object orDefault = enrichedParams.getOrDefault("isGroupChatroom", java.lang.Boolean.FALSE);
        java.lang.Boolean bool = orDefault instanceof java.lang.Boolean ? (java.lang.Boolean) orDefault : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        android.content.Context context = this.f378457e;
        j00.k1 k1Var = this.f378456d;
        k1Var.qj(j00.k1.Ai(k1Var, context), z17, booleanValue, str2, ph0Var.f113172m, enrichedParams, this.f378458f);
        return jz5.f0.f384359a;
    }
}
