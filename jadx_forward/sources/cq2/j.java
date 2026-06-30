package cq2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys5.e f302931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f302932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ws5.h f302934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f302935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f302936i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f302937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ys5.e eVar, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, ws5.h hVar, float f17, boolean z18, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(0);
        this.f302931d = eVar;
        this.f302932e = z17;
        this.f302933f = f0Var;
        this.f302934g = hVar;
        this.f302935h = f17;
        this.f302936i = z18;
        this.f302937m = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        cq2.q qVar = cq2.q.f302961a;
        ys5.e eVar = this.f302931d;
        cq2.q.a(qVar, eVar);
        if (this.f302932e) {
            cq2.q.f302973m++;
        }
        int i17 = this.f302933f.f391649d;
        ws5.h hVar = this.f302934g;
        if (hVar == null || (str = hVar.f530747c) == null) {
            str = "";
        }
        kz5.p0 p0Var = kz5.p0.f395529d;
        int i18 = hVar != null ? hVar.f530746b : 135;
        int ordinal = eVar.ordinal();
        int i19 = ordinal != 2 ? ordinal != 3 ? 0 : 1 : 2;
        float f17 = this.f302935h;
        boolean z17 = eVar == ys5.e.f546790e;
        if (hVar == null || (str2 = hVar.f530745a) == null) {
            str2 = "default";
        }
        return new aq2.b(new aq2.a(i17, 0, null, str, p0Var, i18, 0L, null, null, i19, f17, z17, str2, hVar != null ? hVar.f530748d : null, this.f302936i ? qVar.c() : null, this.f302937m.f391645d, null, 65984, null), null, null, 6, null);
    }
}
