package b0;

/* loaded from: classes14.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97978d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f97980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.p f97981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f97982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(float f17, z.p pVar, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97980f = f17;
        this.f97981g = pVar;
        this.f97982h = e0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.n2 n2Var = new b0.n2(this.f97980f, this.f97981g, this.f97982h, interfaceC29045xdcb5ca57);
        n2Var.f97979e = obj;
        return n2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.n2) mo148xaf65a0fc((b0.p2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        z.w wVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97978d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.p2 p2Var = (b0.p2) this.f97979e;
            z.p pVar = this.f97981g;
            b0.m2 m2Var = new b0.m2(this.f97982h, p2Var);
            this.f97978d = 1;
            z.w2 w2Var = z.q3.f550334a;
            java.lang.Float f17 = new java.lang.Float(0.0f);
            java.lang.Float f18 = new java.lang.Float(this.f97980f);
            z.x2 x2Var = (z.x2) w2Var;
            z.w wVar2 = (z.w) x2Var.f550406a.mo146xb9724478(new java.lang.Float(0.0f));
            if (wVar2 == null) {
                z.w wVar3 = (z.w) x2Var.f550406a.mo146xb9724478(f17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar3, "<this>");
                wVar = wVar3.c();
            } else {
                wVar = wVar2;
            }
            z.w wVar4 = wVar;
            java.lang.Object a17 = z.z1.a(new z.r(w2Var, f17, wVar4, 0L, 0L, false, 56, null), new z.a2(pVar, w2Var, f17, f18, wVar4), Long.MIN_VALUE, new z.q1(m2Var, w2Var), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
