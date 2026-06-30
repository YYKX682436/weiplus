package b03;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f16833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b03.l lVar) {
        super(0);
        this.f16833d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int size;
        int size2;
        int size3;
        java.lang.String str = this.f16833d.f16842e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseGPUResource, isActive:");
        sb6.append(this.f16833d.f16838a.f354706j);
        sb6.append(" refCount:");
        pi0.q qVar = this.f16833d.f16838a;
        synchronized (qVar.f354709m) {
            size = qVar.f354709m.size();
        }
        sb6.append(size);
        sb6.append(" instanceRefCount:");
        pi0.q qVar2 = this.f16833d.f16838a;
        synchronized (qVar2.f354709m) {
            size2 = qVar2.f354710n.size();
        }
        sb6.append(size2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        pi0.q qVar3 = this.f16833d.f16838a;
        if (qVar3.f354706j) {
            synchronized (qVar3.f354709m) {
                size3 = qVar3.f354710n.size();
            }
            if (size3 == 0) {
                b03.a0 a0Var = this.f16833d.f16841d;
                if (a0Var != null) {
                    ((ku5.t0) ku5.t0.f312615d).h(new b03.y(a0Var), "EngineGroupMemReporter_serial");
                }
                b03.l lVar = this.f16833d;
                pi0.q qVar4 = lVar.f16838a;
                b03.f fVar = new b03.f(lVar);
                qVar4.getClass();
                pi0.f fVar2 = new pi0.f(fVar);
                pi0.y yVar = qVar4.f354708l;
                yVar.getClass();
                if (yVar.f354741d == null) {
                    fVar2.invoke(java.lang.Boolean.FALSE);
                }
                com.tencent.pigeon.mm_foundation.FlutterMemoryHost flutterMemoryHost = yVar.f354741d;
                if (flutterMemoryHost != null) {
                    flutterMemoryHost.freeImageCache(new pi0.x(fVar2));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
