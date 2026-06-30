package b0;

/* loaded from: classes14.dex */
public final class t2 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f98066e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.i2 f98068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f98069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(b0.i2 i2Var, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98068g = i2Var;
        this.f98069h = e5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.t2 t2Var = new b0.t2(this.f98068g, this.f98069h, interfaceC29045xdcb5ca57);
        t2Var.f98067f = obj;
        return t2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.t2) mo148xaf65a0fc((p1.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p1.c calculateMouseWheelScroll;
        boolean z17;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98066e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.c cVar = (p1.c) this.f98067f;
            this.f98067f = cVar;
            this.f98066e = 1;
            java.lang.Object a17 = b0.d3.a(cVar, this);
            if (a17 == aVar) {
                return aVar;
            }
            calculateMouseWheelScroll = cVar;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            calculateMouseWheelScroll = (p1.c) this.f98067f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p1.l lVar = (p1.l) obj;
        int size = lVar.f432375a.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                z17 = true;
                break;
            }
            if (!(!((p1.s) r1.get(i18)).b())) {
                z17 = false;
                break;
            }
            i18++;
        }
        if (z17) {
            long j18 = ((p1.o0) calculateMouseWheelScroll).f432397i.f432405o;
            ((b0.a) this.f98068g).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
            d1.e eVar = new d1.e(d1.e.f307156b);
            java.util.List list = lVar.f432375a;
            int size2 = list.size();
            int i19 = 0;
            while (true) {
                j17 = eVar.f307160a;
                if (i19 >= size2) {
                    break;
                }
                eVar = new d1.e(d1.e.f(j17, ((p1.s) list.get(i19)).f432420i));
                i19++;
            }
            long g17 = d1.e.g(j17, -((p1.o0) calculateMouseWheelScroll).R(64));
            b0.m3 m3Var = (b0.m3) this.f98069h.mo128745x754a37bb();
            float d17 = m3Var.d(g17);
            if (m3Var.f97966b) {
                d17 *= -1;
            }
            if (!(m3Var.f97968d.b(d17) == 0.0f)) {
                int size3 = list.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    ((p1.s) list.get(i27)).a();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
