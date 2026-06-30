package b0;

/* loaded from: classes14.dex */
public final class t2 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f16533e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.i2 f16535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16536h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(b0.i2 i2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16535g = i2Var;
        this.f16536h = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.t2 t2Var = new b0.t2(this.f16535g, this.f16536h, continuation);
        t2Var.f16534f = obj;
        return t2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.t2) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p1.c calculateMouseWheelScroll;
        boolean z17;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16533e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.c cVar = (p1.c) this.f16534f;
            this.f16534f = cVar;
            this.f16533e = 1;
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
            calculateMouseWheelScroll = (p1.c) this.f16534f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        p1.l lVar = (p1.l) obj;
        int size = lVar.f350842a.size();
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
            long j18 = ((p1.o0) calculateMouseWheelScroll).f350864i.f350872o;
            ((b0.a) this.f16535g).getClass();
            kotlin.jvm.internal.o.g(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
            d1.e eVar = new d1.e(d1.e.f225623b);
            java.util.List list = lVar.f350842a;
            int size2 = list.size();
            int i19 = 0;
            while (true) {
                j17 = eVar.f225627a;
                if (i19 >= size2) {
                    break;
                }
                eVar = new d1.e(d1.e.f(j17, ((p1.s) list.get(i19)).f350887i));
                i19++;
            }
            long g17 = d1.e.g(j17, -((p1.o0) calculateMouseWheelScroll).R(64));
            b0.m3 m3Var = (b0.m3) this.f16536h.getValue();
            float d17 = m3Var.d(g17);
            if (m3Var.f16433b) {
                d17 *= -1;
            }
            if (!(m3Var.f16435d.b(d17) == 0.0f)) {
                int size3 = list.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    ((p1.s) list.get(i27)).a();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
