package ru5;

/* loaded from: classes10.dex */
public class i extends ru5.g {
    @Override // ru5.g
    public ru5.a d() {
        for (ru5.g gVar = this; gVar != null; gVar = gVar.f481337e) {
        }
        return null;
    }

    @Override // ru5.g
    public ru5.j e() {
        ru5.j jVar = this.f481334b;
        if (jVar != null) {
            return jVar;
        }
        if (xu5.b.d() == null && android.os.Looper.myLooper() == null) {
            throw new java.lang.RuntimeException(java.lang.String.format("fail to create DefaultScheduler. Current thread[%s-%s] without a Looper or Serial.", java.lang.Thread.currentThread().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())));
        }
        return new ru5.h(this);
    }

    @Override // ru5.g
    public ru5.g f(ru5.a aVar) {
        java.util.Objects.requireNonNull(aVar);
        ru5.i iVar = new ru5.i();
        iVar.f481334b = e();
        iVar.f481336d = this;
        this.f481337e = iVar;
        this.f481335c = aVar;
        return iVar;
    }

    @Override // ru5.g
    public java.lang.Object g() {
        if (this.f481333a == null) {
            xu5.b d17 = xu5.b.d();
            java.lang.String c17 = d17 == null ? xu5.b.c(android.os.Looper.myLooper()) : d17.f538835a;
            for (ru5.g gVar = this; gVar.f481336d != null; gVar = gVar.f481336d) {
                if (gVar.f481334b.mo163057xb5887064().equals(c17)) {
                    throw new java.lang.RuntimeException("this pipeline will happen dead lock in future. please to check it. serialTag=" + c17);
                }
            }
        }
        h();
        return super.g();
    }

    public void h() {
        if (!this.f481340h.compareAndSet(false, true)) {
            ku5.o.f394132c.w("Pipeline", "this pipeline has begin.", new java.lang.Object[0]);
            return;
        }
        ru5.g gVar = this;
        while (gVar.f481336d != null) {
            gVar = gVar.f481336d;
        }
        gVar.c(gVar.f481335c);
    }
}
