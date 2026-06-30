package eq1;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337384d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f337385e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f337386f;

    /* renamed from: g, reason: collision with root package name */
    public int f337387g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337388h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eq1.u f337389i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f337390m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(eq1.u uVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f337389i = uVar;
        this.f337390m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        eq1.r rVar = new eq1.r(this.f337389i, this.f337390m, interfaceC29045xdcb5ca57);
        rVar.f337388h = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eq1.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        eq1.u uVar;
        eq1.u uVar2;
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f337387g;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f337388h;
            uVar = this.f337389i;
            boolean z18 = this.f337390m;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f337388h = uVar;
                this.f337384d = y0Var;
                this.f337385e = this;
                this.f337386f = uVar;
                this.f337387g = 1;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                uVar.getClass();
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                    uVar.f337401c = new eq1.o(rVar, y0Var);
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h e17 = i11.h.e();
                    eq1.m mVar = uVar.f337404f;
                    if (!z18) {
                        z17 = false;
                    }
                    e17.l(mVar, z17, false, false);
                    rVar.m(new eq1.q(uVar));
                } else {
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("No Location Permission"))));
                }
                obj = rVar.j();
                if (obj == aVar) {
                    return aVar;
                }
                uVar2 = uVar;
            } catch (java.lang.Throwable th6) {
                th = th6;
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                uVar2 = uVar;
                uVar2.f337400b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                return jz5.f0.f384359a;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar2 = (eq1.u) this.f337386f;
            try {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            } catch (java.lang.Throwable th7) {
                th = th7;
                uVar = uVar2;
                p3321xbce91901.C29043x91b2b43d.Companion companion22 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                uVar2 = uVar;
                uVar2.f337400b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                return jz5.f0.f384359a;
            }
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5) obj);
        uVar2.f337400b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        return jz5.f0.f384359a;
    }
}
