package wx0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532054d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f532055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f532056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f532057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nx0.w f532058h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wx0.c0 c0Var, yz5.a aVar, nx0.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532056f = c0Var;
        this.f532057g = aVar;
        this.f532058h = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wx0.p pVar = new wx0.p(this.f532056f, this.f532057g, this.f532058h, interfaceC29045xdcb5ca57);
        pVar.f532055e = obj;
        return pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532054d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        wx0.c0 c0Var = this.f532056f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                nx0.w wVar = this.f532058h;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                yx0.b8 b8Var = c0Var.f531992g;
                this.f532054d = 1;
                if (b8Var.s0(wVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        if (((jz5.f0) m143895xf1229813) == null) {
            db5.t7.g(c0Var.f413347d.getContext(), c0Var.f413347d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htc));
        }
        this.f532057g.mo152xb9724478();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 beautyDesc = c0Var.f531992g.V;
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beautyDesc, "beautyDesc");
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.s6(m7Var, beautyDesc, null), 3, null);
        return f0Var;
    }
}
