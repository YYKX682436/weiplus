package va;

/* loaded from: classes16.dex */
public abstract class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515717d;

    /* renamed from: e, reason: collision with root package name */
    public int f515718e = -1;

    /* renamed from: f, reason: collision with root package name */
    public va.m f515719f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicReferenceArray f515720g;

    /* renamed from: h, reason: collision with root package name */
    public va.h f515721h;

    /* renamed from: i, reason: collision with root package name */
    public va.y f515722i;

    /* renamed from: m, reason: collision with root package name */
    public va.y f515723m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ va.z f515724n;

    public g(va.z zVar) {
        this.f515724n = zVar;
        this.f515717d = zVar.f515746f.length - 1;
        a();
    }

    public final void a() {
        boolean z17;
        this.f515722i = null;
        va.h hVar = this.f515721h;
        if (hVar != null) {
            while (true) {
                va.h b17 = hVar.b();
                this.f515721h = b17;
                if (b17 == null) {
                    break;
                }
                if (b(b17)) {
                    z17 = true;
                    break;
                }
                hVar = this.f515721h;
            }
        }
        z17 = false;
        if (z17 || d()) {
            return;
        }
        while (true) {
            int i17 = this.f515717d;
            if (i17 < 0) {
                return;
            }
            va.m[] mVarArr = this.f515724n.f515746f;
            this.f515717d = i17 - 1;
            va.m mVar = mVarArr[i17];
            this.f515719f = mVar;
            if (mVar.f515728e != 0) {
                this.f515720g = this.f515719f.f515731h;
                this.f515718e = r0.length() - 1;
                if (d()) {
                    return;
                }
            }
        }
    }

    public boolean b(va.h hVar) {
        va.z zVar = this.f515724n;
        try {
            java.lang.Object mo171334xb5884f29 = hVar.mo171334xb5884f29();
            zVar.getClass();
            java.lang.Object mo171335x754a37bb = hVar.mo171334xb5884f29() == null ? null : hVar.mo171335x754a37bb();
            if (mo171335x754a37bb == null) {
                this.f515719f.f();
                return false;
            }
            this.f515722i = new va.y(zVar, mo171334xb5884f29, mo171335x754a37bb);
            this.f515719f.f();
            return true;
        } catch (java.lang.Throwable th6) {
            this.f515719f.f();
            throw th6;
        }
    }

    public va.y c() {
        va.y yVar = this.f515722i;
        if (yVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.f515723m = yVar;
        a();
        return this.f515723m;
    }

    public boolean d() {
        while (true) {
            int i17 = this.f515718e;
            boolean z17 = false;
            if (i17 < 0) {
                return false;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f515720g;
            this.f515718e = i17 - 1;
            va.h hVar = (va.h) atomicReferenceArray.get(i17);
            this.f515721h = hVar;
            if (hVar != null) {
                if (b(hVar)) {
                    break;
                }
                va.h hVar2 = this.f515721h;
                if (hVar2 != null) {
                    while (true) {
                        va.h b17 = hVar2.b();
                        this.f515721h = b17;
                        if (b17 == null) {
                            break;
                        }
                        if (b(b17)) {
                            z17 = true;
                            break;
                        }
                        hVar2 = this.f515721h;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515722i != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        va.y yVar = this.f515723m;
        if (!(yVar != null)) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f515724n.remove(yVar.f515740d);
        this.f515723m = null;
    }
}
