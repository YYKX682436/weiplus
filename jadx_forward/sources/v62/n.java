package v62;

/* loaded from: classes12.dex */
public class n extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f515054i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f515055j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v62.p pVar, long j17, java.lang.Boolean bool, boolean z17, java.lang.String str, int i17, int i18) {
        super(j17, bool, z17);
        this.f515053h = str;
        this.f515054i = i17;
        this.f515055j = i18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        gm0.j1.n().f354821b.a(782, new v62.m(this));
        gm0.j1.n().f354821b.g(new w62.a(this.f515053h, this.f515054i, this.f515055j));
        return java.lang.Boolean.TRUE;
    }
}
