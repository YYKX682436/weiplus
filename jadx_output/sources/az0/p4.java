package az0;

/* loaded from: classes5.dex */
public final class p4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f15804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(boolean z17, boolean z18, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15802d = z17;
        this.f15803e = z18;
        this.f15804f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.p4(this.f15802d, this.f15803e, this.f15804f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        az0.p4 p4Var = (az0.p4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int size;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "initSdk - state: " + az0.i5.f15560d);
        ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
        if (ez0.o.f257835a.c() && this.f15802d && (az0.i5.f15560d == az0.x2.f16038e || az0.i5.f15560d == az0.x2.f16039f)) {
            synchronized (hz0.m.f286283a) {
                size = hz0.m.f286284b.size();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "initSdk: background export task size:" + size + ", coreUsageCount:" + az0.i5.f15576t + ", state:" + az0.i5.f15560d);
            az0.i5 i5Var = az0.i5.f15557a;
            if (i5Var.t() && size > 0 && size == az0.i5.f15576t) {
                i5Var.v();
            }
        }
        int ordinal = az0.i5.f15560d.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "initSdk - start init");
            az0.i5.f15557a.l(this.f15803e, this.f15804f, this.f15802d);
        } else if (ordinal == 1) {
            az0.i5.d(az0.i5.f15557a);
            yz5.a aVar2 = this.f15804f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (ordinal == 2) {
            boolean z17 = az0.i5.f15563g;
            boolean z18 = this.f15803e;
            if (z17 != z18) {
                az0.i5 i5Var2 = az0.i5.f15557a;
                if (z18) {
                    oz0.c.f350202h.b();
                } else {
                    oz0.c.f350201g.b();
                }
            }
            yz5.a aVar3 = this.f15804f;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (ordinal == 3) {
            az0.i5 i5Var3 = az0.i5.f15557a;
            az0.i5.d(i5Var3);
            if (az0.i5.f15560d == az0.x2.f16037d) {
                i5Var3.l(this.f15803e, this.f15804f, true);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MaasManager", "Unexpected state: " + az0.i5.f15560d + " after TEARDOWNING");
                yz5.a aVar4 = this.f15804f;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
