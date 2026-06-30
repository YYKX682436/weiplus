package c20;

/* loaded from: classes11.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f37976d;

    /* renamed from: e, reason: collision with root package name */
    public int f37977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f37978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq.a f37979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bw5.x7 x7Var, pq.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f37978f = x7Var;
        this.f37979g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c20.a(this.f37978f, this.f37979g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c20.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f37977e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.g b17 = this.f37978f.g().b();
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
            this.f37976d = l1Var2;
            this.f37977e = 1;
            if (l1Var2.o("display_pending_product_half_page_shower", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f37976d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.content.Context c17 = this.f37979g.c();
        if (c17 == null) {
            c17 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(c17);
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(1, 1, null, false, false, false, null, 0, false, false, false, null, 4092, null);
        this.f37976d = null;
        this.f37977e = 2;
        s17 = l1Var.s(c17, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        return s17 == aVar ? aVar : f0Var;
    }
}
