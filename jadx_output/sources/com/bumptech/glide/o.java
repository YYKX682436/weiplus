package com.bumptech.glide;

/* loaded from: classes13.dex */
public class o extends m7.a {
    public final android.content.Context G;
    public final com.bumptech.glide.r H;
    public final java.lang.Class I;

    /* renamed from: J, reason: collision with root package name */
    public final com.bumptech.glide.f f43977J;
    public com.bumptech.glide.s K;
    public java.lang.Object L;
    public boolean M;

    static {
    }

    public o(com.bumptech.glide.c cVar, com.bumptech.glide.r rVar, java.lang.Class cls, android.content.Context context) {
        m7.e eVar;
        this.H = rVar;
        this.I = cls;
        this.G = context;
        java.util.Map map = rVar.f43982d.f43924f.f43950f;
        com.bumptech.glide.s sVar = (com.bumptech.glide.s) map.get(cls);
        if (sVar == null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (((java.lang.Class) entry.getKey()).isAssignableFrom(cls)) {
                    sVar = (com.bumptech.glide.s) entry.getValue();
                }
            }
        }
        this.K = sVar == null ? com.bumptech.glide.f.f43944k : sVar;
        this.f43977J = cVar.f43924f;
        java.util.Iterator it = rVar.f43991p.iterator();
        while (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
        }
        synchronized (rVar) {
            eVar = rVar.f43992q;
        }
        p(eVar);
    }

    @Override // m7.a
    public m7.a a(m7.a aVar) {
        q7.n.b(aVar);
        return (com.bumptech.glide.o) super.a(aVar);
    }

    public com.bumptech.glide.o p(m7.a aVar) {
        q7.n.b(aVar);
        return (com.bumptech.glide.o) super.a(aVar);
    }

    @Override // m7.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.o clone() {
        com.bumptech.glide.o oVar = (com.bumptech.glide.o) super.clone();
        oVar.K = oVar.K.clone();
        return oVar;
    }

    public final n7.h r(n7.h hVar, m7.d dVar, m7.a aVar, java.util.concurrent.Executor executor) {
        q7.n.b(hVar);
        if (!this.M) {
            throw new java.lang.IllegalArgumentException("You must call #load() before calling #into()");
        }
        java.lang.Object obj = new java.lang.Object();
        com.bumptech.glide.s sVar = this.K;
        com.bumptech.glide.g gVar = aVar.f324412g;
        int i17 = aVar.f324419q;
        int i18 = aVar.f324418p;
        android.content.Context context = this.G;
        java.lang.Object obj2 = this.L;
        java.lang.Class cls = this.I;
        com.bumptech.glide.f fVar = this.f43977J;
        w6.g0 g0Var = fVar.f43951g;
        sVar.getClass();
        m7.h hVar2 = new m7.h(context, fVar, obj, obj2, cls, aVar, i17, i18, gVar, hVar, dVar, null, null, g0Var, o7.b.f343227b, executor);
        m7.b a17 = hVar.a();
        if (hVar2.f(a17)) {
            if (!(!aVar.f324417o && ((m7.h) a17).e())) {
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
        com.bumptech.glide.r rVar = this.H;
        synchronized (rVar) {
            rVar.f43987i.f298028d.add(hVar);
            j7.s sVar2 = rVar.f43985g;
            sVar2.f298024a.add(hVar2);
            if (sVar2.f298026c) {
                hVar2.c();
                android.util.Log.isLoggable("RequestTracker", 2);
                ((java.util.ArrayList) sVar2.f298025b).add(hVar2);
            } else {
                hVar2.a();
            }
        }
        return hVar;
    }
}
