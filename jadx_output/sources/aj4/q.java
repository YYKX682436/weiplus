package aj4;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5359h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5360i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f5361m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, yz5.l lVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5356e = str;
        this.f5357f = str2;
        this.f5358g = atomicBoolean;
        this.f5359h = atomicBoolean2;
        this.f5360i = lVar;
        this.f5361m = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj4.q(this.f5356e, this.f5357f, this.f5358g, this.f5359h, this.f5360i, this.f5361m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aj4.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5355d;
        java.lang.String str2 = this.f5356e;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatusFlutterMediaProvider", th6, "handleLivePhotoFromGallery: remux failed, fallback origin", new java.lang.Object[0]);
            str = null;
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj4.v vVar = aj4.v.f5377a;
            this.f5355d = 1;
            obj = aj4.v.a(vVar, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        str = (java.lang.String) obj;
        java.lang.String str3 = str == null ? str2 : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "handleLivePhotoFromGallery: remux done, origin=" + str2 + ", remuxed=" + str + ", final=" + str3 + ", cover=" + this.f5357f);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        aj4.p pVar = new aj4.p(this.f5358g, this.f5359h, this.f5360i, str3, this.f5357f, this.f5361m, null);
        this.f5355d = 2;
        if (kotlinx.coroutines.l.g(g3Var, pVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
