package j5;

/* loaded from: classes13.dex */
public final class u implements j5.r {

    /* renamed from: a, reason: collision with root package name */
    public final l4.q f379291a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.w f379292b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.w f379293c;

    public u(l4.q qVar) {
        this.f379291a = qVar;
        new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f379292b = new j5.s(this, qVar);
        this.f379293c = new j5.t(this, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(java.lang.String str) {
        l4.q qVar = this.f379291a;
        qVar.b();
        l4.w wVar = this.f379292b;
        p4.i a17 = wVar.a();
        if (str == null) {
            ((q4.h) a17).mo145066x37fcf764(1);
        } else {
            ((q4.h) a17).mo145067x35198eae(1, str);
        }
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }
}
