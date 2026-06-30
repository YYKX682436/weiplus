package z56;

/* loaded from: classes16.dex */
public final class g extends java.util.concurrent.atomic.AtomicReference implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f551830d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f551831e;

    /* renamed from: f, reason: collision with root package name */
    public final r56.b f551832f;

    /* renamed from: g, reason: collision with root package name */
    public final r56.b f551833g;

    /* renamed from: h, reason: collision with root package name */
    public r56.b f551834h;

    /* renamed from: i, reason: collision with root package name */
    public final s56.j f551835i;

    public g() {
        super(z56.e.f551822e);
        this.f551831e = true;
        r56.c cVar = r56.d.f474275a;
        this.f551832f = cVar;
        this.f551833g = cVar;
        this.f551834h = cVar;
        this.f551835i = s56.j.f484748a;
    }

    public void a(z56.f fVar) {
        z56.e eVar;
        z56.e eVar2;
        do {
            eVar = (z56.e) get();
            if (eVar.f551823a) {
                return;
            }
            z56.f[] fVarArr = eVar.f551824b;
            int length = fVarArr.length;
            eVar2 = z56.e.f551822e;
            if (length != 1 || fVarArr[0] != fVar) {
                if (length != 0) {
                    int i17 = length - 1;
                    z56.f[] fVarArr2 = new z56.f[i17];
                    int i18 = 0;
                    for (z56.f fVar2 : fVarArr) {
                        if (fVar2 != fVar) {
                            if (i18 != i17) {
                                fVarArr2[i18] = fVar2;
                                i18++;
                            }
                        }
                    }
                    if (i18 != 0) {
                        if (i18 < i17) {
                            z56.f[] fVarArr3 = new z56.f[i18];
                            java.lang.System.arraycopy(fVarArr2, 0, fVarArr3, 0, i18);
                            fVarArr2 = fVarArr3;
                        }
                        eVar2 = new z56.e(eVar.f551823a, fVarArr2);
                    }
                }
                eVar2 = eVar;
                break;
            }
            if (eVar2 == eVar) {
                return;
            }
        } while (!compareAndSet(eVar, eVar2));
    }

    public z56.f[] b(java.lang.Object obj) {
        this.f551830d = obj;
        this.f551831e = false;
        return ((z56.e) get()).f551823a ? z56.e.f551820c : ((z56.e) getAndSet(z56.e.f551821d)).f551824b;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        boolean z17;
        p56.r rVar = (p56.r) obj;
        z56.f fVar = new z56.f(rVar);
        rVar.d(new a66.b(new z56.d(this, fVar)));
        this.f551832f.getClass();
        if (rVar.f433636d.f506372e) {
            return;
        }
        while (true) {
            z56.e eVar = (z56.e) get();
            z17 = false;
            if (eVar.f551823a) {
                this.f551834h.mo131526x2e7a5e(fVar);
                break;
            }
            z56.f[] fVarArr = eVar.f551824b;
            int length = fVarArr.length;
            z56.f[] fVarArr2 = new z56.f[length + 1];
            java.lang.System.arraycopy(fVarArr, 0, fVarArr2, 0, length);
            fVarArr2[length] = fVar;
            if (compareAndSet(eVar, new z56.e(eVar.f551823a, fVarArr2))) {
                this.f551833g.getClass();
                z17 = true;
                break;
            }
        }
        if (z17 && rVar.f433636d.f506372e) {
            a(fVar);
        }
    }
}
