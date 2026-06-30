package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296571d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f296572e;

    /* renamed from: f, reason: collision with root package name */
    public long f296573f;

    /* renamed from: g, reason: collision with root package name */
    public int f296574g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f296575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yq5.k f296576i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yq5.g f296577m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yq5.c f296578n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f296579o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yq5.k kVar, yq5.g gVar, yq5.c cVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f296576i = kVar;
        this.f296577m = gVar;
        this.f296578n = cVar;
        this.f296579o = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.o0 o0Var = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.o0(this.f296576i, this.f296577m, this.f296578n, this.f296579o, interfaceC29045xdcb5ca57);
        o0Var.f296575h = obj;
        return o0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        yq5.k subsamplingImage;
        yq5.g gVar;
        yq5.c cVar;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f296574g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                subsamplingImage = this.f296576i;
                gVar = this.f296577m;
                yq5.c cVar2 = this.f296578n;
                long j18 = this.f296579o;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                yq5.d dVar = subsamplingImage.f546133a;
                this.f296575h = subsamplingImage;
                this.f296571d = gVar;
                this.f296572e = cVar2;
                this.f296573f = j18;
                this.f296574g = 1;
                yq5.f fVar = ((yq5.e) dVar).f546128a;
                if (fVar == aVar) {
                    return aVar;
                }
                cVar = cVar2;
                obj = fVar;
                j17 = j18;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j17 = this.f296573f;
                cVar = (yq5.c) this.f296572e;
                gVar = (yq5.g) this.f296571d;
                subsamplingImage = (yq5.k) this.f296575h;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            yq5.f imageSource = (yq5.f) obj;
            ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.a) gVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subsamplingImage, "subsamplingImage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageSource, "imageSource");
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar2 = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d(subsamplingImage, imageSource, subsamplingImage.f546134b);
            try {
                yq5.c cVar3 = (yq5.c) ((jz5.n) dVar2.f296466i).mo141623x754a37bb();
                if (cVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, cVar3)) {
                    com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q0.a(cVar3, gVar, j17);
                }
                dVar2.a();
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(dVar2);
            } catch (java.lang.Exception e17) {
                try {
                    dVar2.close();
                } catch (java.lang.RuntimeException e18) {
                    throw e18;
                } catch (java.lang.Exception unused) {
                }
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
    }
}
