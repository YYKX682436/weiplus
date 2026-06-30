package b92;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f18364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b92.d1 f18365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f18366g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18367h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18368i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f18369m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(boolean z17, com.tencent.mm.sdk.platformtools.o4 o4Var, b92.d1 d1Var, long j17, int i17, int i18, yz5.a aVar) {
        super(0);
        this.f18363d = z17;
        this.f18364e = o4Var;
        this.f18365f = d1Var;
        this.f18366g = j17;
        this.f18367h = i17;
        this.f18368i = i18;
        this.f18369m = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f18363d) {
            this.f18364e.putBoolean("finder_comment_recommend_live_mic_topic_education_has_shown_v1", true);
        }
        this.f18365f.qj(false, "feedid_comment_area_star_go", this.f18366g, this.f18367h, this.f18368i);
        this.f18369m.invoke();
        return jz5.f0.f302826a;
    }
}
