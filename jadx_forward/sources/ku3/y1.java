package ku3;

/* loaded from: classes3.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f393997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f393998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs0.f f393999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f394000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ku3.z1 z1Var, bs0.f fVar, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393998e = z1Var;
        this.f393999f = fVar;
        this.f394000g = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.y1(this.f393998e, this.f393999f, this.f394000g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.y1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f393997d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        ku3.z1 z1Var = this.f393998e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bs0.j jVar = z1Var.f394027e.f557110e;
            this.f393997d = 1;
            obj = jVar.D0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var2;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        float f17 = this.f394000g;
        bs0.f fVar = this.f393999f;
        if (bitmap != null) {
            um5.d dVar = new um5.d();
            dVar.b(bitmap);
            int width = z1Var.c().getWidth();
            int height = z1Var.c().getHeight();
            dVar.f510674b = width;
            dVar.f510675c = height;
            dVar.f510677e.f510726b.b().d(30.0f);
            dVar.a(new ku3.w1(z1Var, fVar, f17));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordFrameShaderPlugin", "request bitmap is null");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ku3.x1 x1Var = new ku3.x1(z1Var, fVar, f17, null);
            this.f393997d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, x1Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var2;
    }
}
