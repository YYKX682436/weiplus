package bm2;

/* loaded from: classes10.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f22109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f22110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f22111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f22112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.i6 f22113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(bm2.o6 o6Var, hn2.d dVar, kotlinx.coroutines.y0 y0Var, bm2.i6 i6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f22110e = o6Var;
        this.f22111f = dVar;
        this.f22112g = y0Var;
        this.f22113h = i6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.m6(this.f22110e, this.f22111f, this.f22112g, this.f22113h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.m6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.gy1 gy1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f22109d;
        hn2.d dVar = this.f22111f;
        bm2.o6 o6Var = this.f22110e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            o6Var.I(2, 3, dVar);
            sf2.d3 d3Var = o6Var.f22196i;
            hn2.d dVar2 = this.f22111f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f372844d = o6Var.f22199o.f390772d;
            r45.in inVar = o6Var.f22201q;
            if (inVar != null) {
                dy1Var.f372845e = inVar.f377156d;
                dy1Var.f372846f = inVar.f377157e;
            }
            r45.ch6 ch6Var = o6Var.f22200p;
            if (ch6Var != null) {
                dy1Var.f372847g = ch6Var.f371555d;
                dy1Var.f372848h = ch6Var.f371556e;
            }
            dy1Var.f372851n = o6Var.f22198n.f264417d;
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
            this.f22109d = 1;
            obj = d3Var.r7(dVar2, dy1Var, z17, gy1Var, this);
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
        r45.mx1 mx1Var = (r45.mx1) obj;
        if (mx1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongListAdapter", "Request item done");
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveRequestSongListAdapter", "Request item failed");
        }
        bm2.i6 i6Var = this.f22113h;
        kotlinx.coroutines.y0 y0Var = this.f22112g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bm2.k6(o6Var, i6Var, dVar, null), 3, null);
        }
        if (mx1Var != null) {
            sf2.d3 d3Var2 = o6Var.f22196i;
            bm2.l6 l6Var = new bm2.l6(o6Var, dVar, i6Var);
            this.f22109d = 2;
            if (d3Var2.d7(dVar, mx1Var, l6Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
