package ym5;

/* loaded from: classes10.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f544997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f544999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(yz5.a aVar, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, ym5.s3 s3Var) {
        super(0);
        this.f544997d = aVar;
        this.f544998e = c22801x87cbdc00;
        this.f544999f = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f544997d.mo152xb9724478();
        ym5.q3 actionCallback = this.f544998e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.c(this.f544999f);
        }
        return jz5.f0.f384359a;
    }
}
