package uw;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f513049d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f513050e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f513051f;

    /* renamed from: g, reason: collision with root package name */
    public int f513052g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f513053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uw.y f513054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(uw.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513054i = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uw.x xVar = new uw.x(this.f513054i, interfaceC29045xdcb5ca57);
        xVar.f513053h = obj;
        return xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        uw.y yVar;
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f513052g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f513053h;
            uw.y yVar2 = this.f513054i;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f513053h = yVar2;
                this.f513049d = y0Var;
                this.f513050e = this;
                this.f513051f = yVar2;
                this.f513052g = 1;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                yVar2.getClass();
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                    yVar2.f513057c = new uw.u(rVar, y0Var);
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h.e().l(yVar2.f513059e, true, false, false);
                    rVar.m(new uw.w(yVar2));
                } else {
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("No Location Permission"))));
                }
                obj = rVar.j();
                if (obj == aVar) {
                    return aVar;
                }
                yVar = yVar2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                yVar = yVar2;
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                yVar.f513056b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                return jz5.f0.f384359a;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (uw.y) this.f513051f;
            try {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            } catch (java.lang.Throwable th7) {
                th = th7;
                p3321xbce91901.C29043x91b2b43d.Companion companion22 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                yVar.f513056b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                return jz5.f0.f384359a;
            }
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23538xfa8f1487) obj);
        yVar.f513056b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        return jz5.f0.f384359a;
    }
}
