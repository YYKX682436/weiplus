package ym5;

/* loaded from: classes10.dex */
public final class l4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f544963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f544965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(yz5.a aVar, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, ym5.s3 s3Var) {
        super(0);
        this.f544963d = aVar;
        this.f544964e = c22801x87cbdc00;
        this.f544965f = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f544963d.mo152xb9724478();
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f544964e;
        ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
        ym5.s3 s3Var = this.f544965f;
        if (actionCallback != null) {
            actionCallback.e(s3Var);
        }
        ym5.q3 reportCallback = c22801x87cbdc00.getReportCallback();
        if (reportCallback != null) {
            reportCallback.e(s3Var);
        }
        return jz5.f0.f384359a;
    }
}
