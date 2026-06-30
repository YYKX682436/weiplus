package c20;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f37981d;

    /* renamed from: e, reason: collision with root package name */
    public int f37982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f37983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f37984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t10.d f37985h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bw5.x7 x7Var, android.content.Context context, t10.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f37983f = x7Var;
        this.f37984g = context;
        this.f37985h = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c20.d(this.f37983f, this.f37984g, this.f37985h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c20.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f37982e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.g b17 = this.f37983f.g().b();
            if (b17 == null) {
                return f0Var;
            }
            pi0.l1 l1Var2 = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "live_multiplatform", null, false, null, 28, null);
            l1Var2.f354649h = true;
            jz5.l[] lVarArr = new jz5.l[1];
            java.lang.String encodeToString = android.util.Base64.encodeToString(b17.g(), 2);
            if (encodeToString == null) {
                encodeToString = "";
            }
            lVarArr[0] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, encodeToString);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            this.f37981d = l1Var2;
            this.f37982e = 1;
            if (l1Var2.o("select_pending_product_half_page_shower", l17, this) == aVar) {
                return aVar;
            }
            l1Var = l1Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l1Var = (pi0.l1) this.f37981d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.b0.c(new d20.a(this.f37984g, new c20.c(this.f37985h))));
        android.content.Context context = this.f37984g;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(1, 1, null, false, false, false, null, 0, false, false, false, null, 4092, null);
        this.f37981d = null;
        this.f37982e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        return s17 == aVar ? aVar : f0Var;
    }
}
