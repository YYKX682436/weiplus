package gn3;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f355114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f355115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn3.d f355116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gn3.b f355117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f355118h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.ArrayList arrayList, fn3.d dVar, gn3.b bVar, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f355115e = arrayList;
        this.f355116f = dVar;
        this.f355117g = bVar;
        this.f355118h = linkedList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gn3.a(this.f355115e, this.f355116f, this.f355117g, this.f355118h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gn3.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f355114d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk0.i iVar = (dk0.i) i95.n0.c(dk0.i.class);
            this.f355114d = 1;
            oy4.v vVar = (oy4.v) iVar;
            vVar.getClass();
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new oy4.u(this.f355115e, vVar, null), this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        r45.ru4 ru4Var = new r45.ru4();
        int i18 = 0;
        for (java.lang.Object obj2 : (java.util.ArrayList) g17) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            float[] fArr = (float[]) obj2;
            java.lang.String str = this.f355117g.f355119e;
            kz5.z.b0(fArr, ", ", null, null, 0, null, null, 62, null);
            java.util.LinkedList m75941xfb821914 = ru4Var.m75941xfb821914(0);
            r45.su4 su4Var = new r45.su4();
            su4Var.set(0, (java.lang.String) this.f355118h.get(i18));
            r45.xu4 xu4Var = new r45.xu4();
            xu4Var.m75941xfb821914(1).addAll(kz5.z.w0(fArr));
            su4Var.set(1, xu4Var);
            m75941xfb821914.add(su4Var);
            i18 = i19;
        }
        this.f355116f.a(ru4Var, 0, "");
        return jz5.f0.f384359a;
    }
}
