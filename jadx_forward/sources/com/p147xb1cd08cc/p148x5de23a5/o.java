package com.p147xb1cd08cc.p148x5de23a5;

/* loaded from: classes13.dex */
public class o extends m7.a {
    public final android.content.Context G;
    public final com.p147xb1cd08cc.p148x5de23a5.r H;
    public final java.lang.Class I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.f f125510J;
    public com.p147xb1cd08cc.p148x5de23a5.s K;
    public java.lang.Object L;
    public boolean M;

    static {
    }

    public o(com.p147xb1cd08cc.p148x5de23a5.c cVar, com.p147xb1cd08cc.p148x5de23a5.r rVar, java.lang.Class cls, android.content.Context context) {
        m7.e eVar;
        this.H = rVar;
        this.I = cls;
        this.G = context;
        java.util.Map map = rVar.f125515d.f125457f.f125483f;
        com.p147xb1cd08cc.p148x5de23a5.s sVar = (com.p147xb1cd08cc.p148x5de23a5.s) map.get(cls);
        if (sVar == null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (((java.lang.Class) entry.getKey()).isAssignableFrom(cls)) {
                    sVar = (com.p147xb1cd08cc.p148x5de23a5.s) entry.getValue();
                }
            }
        }
        this.K = sVar == null ? com.p147xb1cd08cc.p148x5de23a5.f.f125477k : sVar;
        this.f125510J = cVar.f125457f;
        java.util.Iterator it = rVar.f125524p.iterator();
        while (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        }
        synchronized (rVar) {
            eVar = rVar.f125525q;
        }
        p(eVar);
    }

    @Override // m7.a
    public m7.a a(m7.a aVar) {
        q7.n.b(aVar);
        return (com.p147xb1cd08cc.p148x5de23a5.o) super.a(aVar);
    }

    public com.p147xb1cd08cc.p148x5de23a5.o p(m7.a aVar) {
        q7.n.b(aVar);
        return (com.p147xb1cd08cc.p148x5de23a5.o) super.a(aVar);
    }

    @Override // m7.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.p147xb1cd08cc.p148x5de23a5.o mo15459x5a5dd5d() {
        com.p147xb1cd08cc.p148x5de23a5.o oVar = (com.p147xb1cd08cc.p148x5de23a5.o) super.mo15459x5a5dd5d();
        oVar.K = oVar.K.m15465x5a5dd5d();
        return oVar;
    }

    public final n7.h r(n7.h hVar, m7.d dVar, m7.a aVar, java.util.concurrent.Executor executor) {
        q7.n.b(hVar);
        if (!this.M) {
            throw new java.lang.IllegalArgumentException("You must call #load() before calling #into()");
        }
        java.lang.Object obj = new java.lang.Object();
        com.p147xb1cd08cc.p148x5de23a5.s sVar = this.K;
        com.p147xb1cd08cc.p148x5de23a5.g gVar = aVar.f405945g;
        int i17 = aVar.f405952q;
        int i18 = aVar.f405951p;
        android.content.Context context = this.G;
        java.lang.Object obj2 = this.L;
        java.lang.Class cls = this.I;
        com.p147xb1cd08cc.p148x5de23a5.f fVar = this.f125510J;
        w6.g0 g0Var = fVar.f125484g;
        sVar.getClass();
        m7.h hVar2 = new m7.h(context, fVar, obj, obj2, cls, aVar, i17, i18, gVar, hVar, dVar, null, null, g0Var, o7.b.f424760b, executor);
        m7.b a17 = hVar.a();
        if (hVar2.f(a17)) {
            if (!(!aVar.f405950o && ((m7.h) a17).e())) {
                q7.n.b(a17);
                m7.h hVar3 = (m7.h) a17;
                if (!hVar3.g()) {
                    hVar3.a();
                }
                return hVar;
            }
        }
        this.H.i(hVar);
        hVar.d(hVar2);
        com.p147xb1cd08cc.p148x5de23a5.r rVar = this.H;
        synchronized (rVar) {
            rVar.f125520i.f379561d.add(hVar);
            j7.s sVar2 = rVar.f125518g;
            sVar2.f379557a.add(hVar2);
            if (sVar2.f379559c) {
                hVar2.c();
                android.util.Log.isLoggable("RequestTracker", 2);
                ((java.util.ArrayList) sVar2.f379558b).add(hVar2);
            } else {
                hVar2.a();
            }
        }
        return hVar;
    }
}
