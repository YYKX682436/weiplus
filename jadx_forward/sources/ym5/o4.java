package ym5;

/* loaded from: classes10.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f544986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f544988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yz5.a aVar, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, ym5.s3 s3Var) {
        super(0);
        this.f544986d = aVar;
        this.f544987e = c22801x87cbdc00;
        this.f544988f = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f544986d.mo152xb9724478();
        ym5.q3 actionCallback = this.f544987e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.c(this.f544988f);
        }
        return jz5.f0.f384359a;
    }
}
