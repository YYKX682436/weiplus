package jg0;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f381139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jg0.x xVar, qi3.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f381138d = xVar;
        this.f381139e = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jg0.q(this.f381138d, this.f381139e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((jg0.q) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        jg0.x xVar = this.f381138d;
        java.lang.String str = xVar.f381171i.f122582b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str);
        boolean z17 = false;
        if (j17 != null && j17.f524025i == 1) {
            z17 = true;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            return f0Var;
        }
        cg0.d dVar = xVar.f381171i;
        dVar.f122587g = true;
        j17.f524025i = 2;
        j17.f524017a = 64;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = jg0.x.f381170r;
        java.lang.String str2 = dVar.f122582b;
        java.lang.Object obj2 = xVar.f381171i.f122590j;
        concurrentHashMap.put(str2, new java.lang.ref.WeakReference(obj2 instanceof com.p314xaae8f345.mm.p944x882e457a.g1 ? (com.p314xaae8f345.mm.p944x882e457a.g1) obj2 : null));
        if (!((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(xVar.f381171i.f122582b, j17)) {
            this.f381139e.f445233a = -520014;
        }
        return f0Var;
    }
}
