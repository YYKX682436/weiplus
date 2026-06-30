package kw1;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394368e;

    /* renamed from: f, reason: collision with root package name */
    public int f394369f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw1.o f394372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kw1.k kVar, kw1.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394371h = kVar;
        this.f394372i = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kw1.g gVar = new kw1.g(this.f394371h, this.f394372i, interfaceC29045xdcb5ca57);
        gVar.f394370g = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.g) mo148xaf65a0fc((mw1.b) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        kw1.o oVar;
        java.lang.Object c17;
        android.util.Size drawSize;
        pw1.d dVar;
        java.lang.Object c18;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f394369f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mw1.c a17 = ((mw1.b) this.f394370g).a();
            if (a17 == null) {
                return null;
            }
            kw1.k kVar = this.f394371h;
            pw1.d dVar2 = kVar.f394389f;
            android.util.Size m54521x356c92ad = ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a17).m54521x356c92ad();
            oVar = this.f394372i;
            java.lang.String str = ((kw1.l) oVar).f394391a;
            this.f394370g = m54521x356c92ad;
            this.f394367d = oVar;
            this.f394368e = dVar2;
            this.f394369f = 1;
            c17 = kVar.f394386c.c(str, this);
            if (c17 == aVar) {
                return aVar;
            }
            drawSize = m54521x356c92ad;
            dVar = dVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c18 = obj;
                return (pw1.f) c18;
            }
            dVar = (pw1.d) this.f394368e;
            kw1.o oVar2 = (kw1.o) this.f394367d;
            drawSize = (android.util.Size) this.f394370g;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oVar = oVar2;
            c17 = obj;
        }
        qw1.e yuvTextureGroupWrapper = (qw1.e) c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        pw1.g gVar = yuvTextureGroupWrapper.f448621f;
        if (gVar == null) {
            gVar = new pw1.g(0, 0, 0, false, 0, 24, null);
        }
        pw1.e eVar = new pw1.e(gVar, drawSize, yuvTextureGroupWrapper);
        this.f394370g = null;
        this.f394367d = null;
        this.f394368e = null;
        this.f394369f = 2;
        c18 = dVar.c(eVar, this);
        if (c18 == aVar) {
            return aVar;
        }
        return (pw1.f) c18;
    }
}
