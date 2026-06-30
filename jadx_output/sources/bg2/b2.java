package bg2;

/* loaded from: classes3.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f19929d;

    /* renamed from: e, reason: collision with root package name */
    public int f19930e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f19931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f19932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f19933h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19934i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f19935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f19936n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(bg2.d2 d2Var, r45.nw1 nw1Var, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.kr0 kr0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19932g = d2Var;
        this.f19933h = nw1Var;
        this.f19934i = context;
        this.f19935m = finderObject;
        this.f19936n = kr0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        bg2.b2 b2Var = new bg2.b2(this.f19932g, this.f19933h, this.f19934i, this.f19935m, this.f19936n, continuation);
        b2Var.f19931f = obj;
        return b2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int integer;
        java.lang.Object a76;
        kotlinx.coroutines.y0 y0Var;
        r45.qt2 qt2Var;
        kotlinx.coroutines.y0 y0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f19930e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f19931f;
            int i18 = bg2.d2.f20008z;
            bg2.d2 d2Var = this.f19932g;
            d2Var.getClass();
            r45.nw1 nw1Var = this.f19933h;
            if (pm0.v.A(nw1Var != null ? nw1Var.getLong(57) : 0L, 1L)) {
                integer = 0;
            } else {
                integer = ((nw1Var != null ? nw1Var.getInteger(38) : 0) <= 0 || nw1Var == null) ? bg2.d2.f20008z : nw1Var.getInteger(38);
            }
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(this.f19934i);
            r45.qt2 V6 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null;
            r45.nw1 nw1Var2 = this.f19933h;
            android.content.Context context = this.f19934i;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f19935m;
            r45.kr0 kr0Var = this.f19936n;
            int integer2 = nw1Var2.getInteger(38);
            if (integer > 0) {
                in5.s0 s0Var = d2Var.f417141d.f417149i;
                d2Var.f20024w = (s0Var == null || (y0Var2 = s0Var.f293120d) == null) ? null : kotlinx.coroutines.l.d(y0Var2, kotlinx.coroutines.q1.f310570c, null, new bg2.v1(d2Var, nw1Var2, integer, context, finderObject, V6, kr0Var, integer2, null), 2, null);
            } else {
                d2Var.getClass();
            }
            d2Var.f20022u = c01.id.c();
            bg2.d2 d2Var2 = this.f19932g;
            r45.nw1 nw1Var3 = this.f19933h;
            android.content.Context context2 = this.f19934i;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f19935m;
            r45.kr0 kr0Var2 = this.f19936n;
            int integer3 = nw1Var3.getInteger(38);
            this.f19931f = y0Var3;
            this.f19929d = V6;
            this.f19930e = 1;
            r45.qt2 qt2Var2 = V6;
            a76 = d2Var2.a7(false, nw1Var3, context2, finderObject2, V6, kr0Var2, integer3, this);
            if (a76 == aVar) {
                return aVar;
            }
            y0Var = y0Var3;
            qt2Var = qt2Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r45.qt2 qt2Var3 = (r45.qt2) this.f19929d;
            y0Var = (kotlinx.coroutines.y0) this.f19931f;
            kotlin.ResultKt.throwOnFailure(obj);
            qt2Var = qt2Var3;
            a76 = obj;
        }
        r45.hc1 hc1Var = (r45.hc1) a76;
        if (hc1Var == null) {
            return f0Var;
        }
        bg2.d2 d2Var3 = this.f19932g;
        android.content.Context context3 = this.f19934i;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = this.f19935m;
        r45.nw1 nw1Var4 = this.f19933h;
        r45.kr0 kr0Var3 = this.f19936n;
        this.f19931f = null;
        this.f19929d = null;
        this.f19930e = 2;
        return bg2.d2.Y6(d2Var3, y0Var, hc1Var, context3, finderObject3, qt2Var, nw1Var4, kr0Var3, this) == aVar ? aVar : f0Var;
    }
}
