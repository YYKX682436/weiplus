package z;

/* loaded from: classes14.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f550366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f550367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.l f550368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.w f550369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.r f550370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f550371i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f550372m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Object obj, z.l lVar, z.w wVar, z.r rVar, float f17, yz5.l lVar2) {
        super(1);
        this.f550366d = h0Var;
        this.f550367e = obj;
        this.f550368f = lVar;
        this.f550369g = wVar;
        this.f550370h = rVar;
        this.f550371i = f17;
        this.f550372m = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.Object obj2 = this.f550367e;
        z.l lVar = this.f550368f;
        z.o oVar = new z.o(obj2, lVar.d(), this.f550369g, longValue, lVar.f(), longValue, true, new z.s1(this.f550370h));
        z.z1.d(oVar, longValue, this.f550371i, this.f550368f, this.f550370h, this.f550372m);
        this.f550366d.f391656d = oVar;
        return jz5.f0.f384359a;
    }
}
