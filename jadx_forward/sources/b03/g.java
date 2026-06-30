package b03;

/* loaded from: classes11.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f98366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b03.l lVar) {
        super(0);
        this.f98366d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int size;
        int size2;
        int size3;
        java.lang.String str = this.f98366d.f98375e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseGPUResource, isActive:");
        sb6.append(this.f98366d.f98371a.f436239j);
        sb6.append(" refCount:");
        pi0.q qVar = this.f98366d.f98371a;
        synchronized (qVar.f436242m) {
            size = qVar.f436242m.size();
        }
        sb6.append(size);
        sb6.append(" instanceRefCount:");
        pi0.q qVar2 = this.f98366d.f98371a;
        synchronized (qVar2.f436242m) {
            size2 = qVar2.f436243n.size();
        }
        sb6.append(size2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        pi0.q qVar3 = this.f98366d.f98371a;
        if (qVar3.f436239j) {
            synchronized (qVar3.f436242m) {
                size3 = qVar3.f436243n.size();
            }
            if (size3 == 0) {
                b03.a0 a0Var = this.f98366d.f98374d;
                if (a0Var != null) {
                    ((ku5.t0) ku5.t0.f394148d).h(new b03.y(a0Var), "EngineGroupMemReporter_serial");
                }
                b03.l lVar = this.f98366d;
                pi0.q qVar4 = lVar.f98371a;
                b03.f fVar = new b03.f(lVar);
                qVar4.getClass();
                pi0.f fVar2 = new pi0.f(fVar);
                pi0.y yVar = qVar4.f436241l;
                yVar.getClass();
                if (yVar.f436274d == null) {
                    fVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                }
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24610xf92e9f65 c24610xf92e9f65 = yVar.f436274d;
                if (c24610xf92e9f65 != null) {
                    c24610xf92e9f65.m91267x1b479273(new pi0.x(fVar2));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
