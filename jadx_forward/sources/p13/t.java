package p13;

/* loaded from: classes12.dex */
public abstract class t extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final p13.u f432668n;

    /* renamed from: o, reason: collision with root package name */
    public p13.v f432669o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.ref.WeakReference f432670p;

    public t(p13.u uVar) {
        this.f432668n = uVar;
        this.f432670p = new java.lang.ref.WeakReference(uVar.f432684m);
        if (uVar.f432687p) {
            return;
        }
        uVar.f432684m = null;
    }

    @Override // p13.c
    public boolean i() {
        java.lang.ref.WeakReference weakReference = this.f432670p;
        p13.u uVar = this.f432668n;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f432674c)) {
            try {
                uVar.f432674c = new java.lang.String(uVar.f432674c.getBytes("UTF8"), "UTF8");
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        p13.v vVar = new p13.v(uVar);
        this.f432669o = vVar;
        try {
            try {
                vVar.f432690b = this;
                p(vVar);
                this.f432669o.f432691c = 0;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = uVar.f432685n;
                if (n3Var == null) {
                    o13.x xVar = (o13.x) weakReference.get();
                    if (xVar != null) {
                        xVar.X2(this.f432669o);
                    }
                } else {
                    n3Var.mo50293x3498a0(new p13.s(this));
                }
                return true;
            } catch (java.lang.Exception e17) {
                if (e17 instanceof java.lang.InterruptedException) {
                    this.f432669o.f432691c = 1;
                } else {
                    this.f432669o.f432691c = -1;
                }
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = uVar.f432685n;
            if (n3Var2 == null) {
                o13.x xVar2 = (o13.x) weakReference.get();
                if (xVar2 != null) {
                    xVar2.X2(this.f432669o);
                }
            } else {
                n3Var2.mo50293x3498a0(new p13.s(this));
            }
            throw th6;
        }
    }

    @Override // p13.c
    public void n() {
        this.f432598e = true;
        this.f432668n.f432684m = null;
    }

    public void p(p13.v vVar) {
        vVar.f432692d = p13.r.b(this.f432668n.f432674c, false);
        vVar.f432691c = -5;
    }
}
