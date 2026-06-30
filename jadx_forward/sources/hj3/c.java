package hj3;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.c f363134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj3.c f363136g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jj3.c cVar, hj3.m mVar, oj3.c cVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363134e = cVar;
        this.f363135f = mVar;
        this.f363136g = cVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hj3.c(this.f363134e, this.f363135f, this.f363136g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363133d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jj3.d a17 = this.f363134e.a();
            if (a17 == null) {
                return null;
            }
            mj3.d dVar = this.f363135f.f363181f;
            android.util.Size drawSize = a17.getSize();
            oj3.c cVar = this.f363136g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
            mj3.e eVar = new mj3.e(cVar.f427338b, drawSize, cVar.f427339c);
            this.f363133d = 1;
            obj = dVar.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return (mj3.f) obj;
    }
}
