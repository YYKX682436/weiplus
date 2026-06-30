package g4;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349894d;

    /* renamed from: e, reason: collision with root package name */
    public int f349895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.l f349896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g4.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f349896f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.i iVar = new g4.i(this.f349896f, completion);
        iVar.f349894d = obj;
        return iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.i) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        g4.m4 m4Var;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f349895e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            m4Var = (g4.m4) this.f349894d;
            g4.i0 i0Var = this.f349896f.f349943a;
            this.f349894d = m4Var;
            this.f349895e = 1;
            a17 = i0Var.a(this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            m4Var = (g4.m4) this.f349894d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        g4.m4 m4Var2 = m4Var;
        g4.w4 w4Var = (g4.w4) a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = Integer.MIN_VALUE;
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(m4Var2, null, null, new g4.h(m4Var2, w4Var, f0Var, null), 3, null);
        p3325xe03a0797.p3326xc267989b.r2[] r2VarArr = {p3325xe03a0797.p3326xc267989b.l.d(m4Var2, null, null, new g4.f(this, m4Var2, w4Var, d17, f0Var, null), 3, null), d17};
        this.f349894d = null;
        this.f349895e = 2;
        if (p3325xe03a0797.p3326xc267989b.h.d(r2VarArr, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
