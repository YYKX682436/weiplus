package hj3;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363156e;

    /* renamed from: f, reason: collision with root package name */
    public int f363157f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hj3.r f363160i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hj3.m mVar, hj3.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363159h = mVar;
        this.f363160i = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hj3.h hVar = new hj3.h(this.f363159h, this.f363160i, interfaceC29045xdcb5ca57);
        hVar.f363158g = obj;
        return hVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.h) mo148xaf65a0fc((jj3.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        hj3.r rVar;
        java.lang.Object c17;
        android.util.Size drawSize;
        mj3.d dVar;
        java.lang.Object c18;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363157f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jj3.d a17 = ((jj3.c) this.f363158g).a();
            if (a17 == null) {
                return null;
            }
            hj3.m mVar = this.f363159h;
            mj3.d dVar2 = mVar.f363181f;
            android.util.Size size = a17.getSize();
            rVar = this.f363160i;
            java.lang.String str = ((hj3.n) rVar).f363184a;
            this.f363158g = size;
            this.f363155d = rVar;
            this.f363156e = dVar2;
            this.f363157f = 1;
            c17 = mVar.f363178c.c(str, this);
            if (c17 == aVar) {
                return aVar;
            }
            drawSize = size;
            dVar = dVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c18 = obj;
                return (mj3.f) c18;
            }
            dVar = (mj3.d) this.f363156e;
            hj3.r rVar2 = (hj3.r) this.f363155d;
            drawSize = (android.util.Size) this.f363158g;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rVar = rVar2;
            c17 = obj;
        }
        nj3.e yuvTextureGroupWrapper = (nj3.e) c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        mj3.g gVar = yuvTextureGroupWrapper.f419435f;
        if (gVar == null) {
            gVar = new mj3.g(0, 0, 0, false, false, 24, null);
        }
        mj3.e eVar = new mj3.e(gVar, drawSize, yuvTextureGroupWrapper);
        this.f363158g = null;
        this.f363155d = null;
        this.f363156e = null;
        this.f363157f = 2;
        c18 = dVar.c(eVar, this);
        if (c18 == aVar) {
            return aVar;
        }
        return (mj3.f) c18;
    }
}
