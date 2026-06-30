package bm2;

/* loaded from: classes10.dex */
public final class e7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f21866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f21867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f21868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f21869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.t6 f21870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f21871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(bm2.k7 k7Var, hn2.d dVar, kotlinx.coroutines.y0 y0Var, bm2.t6 t6Var, r45.yx1 yx1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21867e = k7Var;
        this.f21868f = dVar;
        this.f21869g = y0Var;
        this.f21870h = t6Var;
        this.f21871i = yx1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.e7(this.f21867e, this.f21868f, this.f21869g, this.f21870h, this.f21871i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.e7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.gy1 gy1Var;
        java.lang.Object r76;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f21866d;
        hn2.d dVar = this.f21868f;
        bm2.k7 k7Var = this.f21867e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var = k7Var.f22040i;
            hn2.d dVar2 = this.f21868f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f372844d = 2;
            boolean z17 = dVar.f282516l;
            hn2.e eVar = dVar.f282517m;
            if (eVar != null) {
                r45.gy1 gy1Var2 = new r45.gy1();
                gy1Var2.f375635d = eVar.f282519a;
                gy1Var2.f375636e = eVar.f282520b;
                gy1Var2.f375637f = eVar.f282521c;
                gy1Var = gy1Var2;
            } else {
                gy1Var = null;
            }
            this.f21866d = 1;
            r76 = d3Var.r7(dVar2, dy1Var, z17, gy1Var, this);
            if (r76 == aVar) {
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
            r76 = obj;
        }
        r45.mx1 mx1Var = (r45.mx1) r76;
        if (mx1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongPlayListAdapter", "Request item done");
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveRequestSongPlayListAdapter", "Request item failed");
        }
        kotlinx.coroutines.y0 y0Var = this.f21869g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bm2.c7(this.f21870h, this.f21867e, this.f21871i, this.f21868f, null), 3, null);
        }
        if (mx1Var != null) {
            sf2.d3 d3Var2 = k7Var.f22040i;
            bm2.d7 d7Var = bm2.d7.f21848d;
            this.f21866d = 2;
            if (d3Var2.d7(dVar, mx1Var, d7Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
