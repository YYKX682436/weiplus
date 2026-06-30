package b80;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f18256d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f18257e;

    /* renamed from: f, reason: collision with root package name */
    public int f18258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o70.h f18259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b80.u f18260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o70.h hVar, b80.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18259g = hVar;
        this.f18260h = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b80.n(this.f18259g, this.f18260h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b80.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String ij6;
        java.lang.Object c17;
        java.lang.Object a17;
        java.lang.StringBuilder sb6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f18258f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = "MicroMsg.ImgUpload.SendImgPreFeatureService";
        b80.u uVar = this.f18260h;
        o70.h hVar = this.f18259g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.tencent.mm.sdk.platformtools.y1.c(hVar.f343237e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "[" + hVar.f343234b + "] img is gif no need to build " + hVar.f343237e);
                return f0Var;
            }
            b80.f fVar = b80.u.f18274n;
            uVar.getClass();
            ij6 = uVar.ij(hVar.f343237e, hVar.f343236d);
            v65.h hVar2 = (v65.h) ((jz5.n) uVar.f18279f).getValue();
            this.f18256d = ij6;
            this.f18258f = 1;
            c17 = hVar2.c(ij6, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sb6 = (java.lang.StringBuilder) this.f18257e;
                str = (java.lang.String) this.f18256d;
                kotlin.ResultKt.throwOnFailure(obj);
                a17 = obj;
                sb6.append(a17);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                return f0Var;
            }
            ij6 = (java.lang.String) this.f18256d;
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        if (((java.lang.Boolean) c17).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "inFlow " + ij6);
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) uVar.f18281h).getValue(), null, new b80.m(uVar, hVar, ij6, null), 1, null);
            return f0Var;
        }
        jx3.f.INSTANCE.idkeyStat(1949L, 1L, 1L, false);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append("already in flow check:");
        sb7.append(ij6);
        sb7.append(" inFlow:");
        v65.h hVar3 = (v65.h) ((jz5.n) uVar.f18279f).getValue();
        this.f18256d = "MicroMsg.ImgUpload.SendImgPreFeatureService";
        this.f18257e = sb7;
        this.f18258f = 2;
        a17 = hVar3.a(this);
        if (a17 == aVar) {
            return aVar;
        }
        sb6 = sb7;
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return f0Var;
    }
}
