package q0;

/* loaded from: classes14.dex */
public final class j extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public final q0.h f440769f;

    /* renamed from: g, reason: collision with root package name */
    public int f440770g;

    /* renamed from: h, reason: collision with root package name */
    public q0.m f440771h;

    /* renamed from: i, reason: collision with root package name */
    public int f440772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q0.h builder, int i17) {
        super(i17, builder.d());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f440769f = builder;
        this.f440770g = builder.j();
        this.f440772i = -1;
        c();
    }

    @Override // q0.a, java.util.ListIterator
    public void add(java.lang.Object obj) {
        b();
        int i17 = this.f440749d;
        q0.h hVar = this.f440769f;
        hVar.add(i17, obj);
        this.f440749d++;
        this.f440750e = hVar.d();
        this.f440770g = hVar.j();
        this.f440772i = -1;
        c();
    }

    public final void b() {
        if (this.f440770g != this.f440769f.j()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        q0.h hVar = this.f440769f;
        java.lang.Object[] objArr = hVar.f440764i;
        if (objArr == null) {
            this.f440771h = null;
            return;
        }
        int d17 = (hVar.d() - 1) & (-32);
        int i17 = this.f440749d;
        if (i17 > d17) {
            i17 = d17;
        }
        int i18 = (hVar.f440762g / 5) + 1;
        q0.m mVar = this.f440771h;
        if (mVar == null) {
            this.f440771h = new q0.m(objArr, i17, d17, i18);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar);
        mVar.f440749d = i17;
        mVar.f440750e = d17;
        mVar.f440776f = i18;
        if (mVar.f440777g.length < i18) {
            mVar.f440777g = new java.lang.Object[i18];
        }
        mVar.f440777g[0] = objArr;
        ?? r66 = i17 == d17 ? 1 : 0;
        mVar.f440778h = r66;
        mVar.c(i17 - r66, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f440749d;
        this.f440772i = i17;
        q0.m mVar = this.f440771h;
        q0.h hVar = this.f440769f;
        if (mVar == null) {
            java.lang.Object[] objArr = hVar.f440765m;
            this.f440749d = i17 + 1;
            return objArr[i17];
        }
        if (mVar.hasNext()) {
            this.f440749d++;
            return mVar.next();
        }
        java.lang.Object[] objArr2 = hVar.f440765m;
        int i18 = this.f440749d;
        this.f440749d = i18 + 1;
        return objArr2[i18 - mVar.f440750e];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f440749d;
        int i18 = i17 - 1;
        this.f440772i = i18;
        q0.m mVar = this.f440771h;
        q0.h hVar = this.f440769f;
        if (mVar == null) {
            java.lang.Object[] objArr = hVar.f440765m;
            this.f440749d = i18;
            return objArr[i18];
        }
        int i19 = mVar.f440750e;
        if (i17 <= i19) {
            this.f440749d = i18;
            return mVar.previous();
        }
        java.lang.Object[] objArr2 = hVar.f440765m;
        this.f440749d = i18;
        return objArr2[i18 - i19];
    }

    @Override // q0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        int i17 = this.f440772i;
        if (i17 == -1) {
            throw new java.lang.IllegalStateException();
        }
        q0.h hVar = this.f440769f;
        hVar.e(i17);
        int i18 = this.f440772i;
        if (i18 < this.f440749d) {
            this.f440749d = i18;
        }
        this.f440750e = hVar.d();
        this.f440770g = hVar.j();
        this.f440772i = -1;
        c();
    }

    @Override // q0.a, java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f440772i;
        if (i17 == -1) {
            throw new java.lang.IllegalStateException();
        }
        q0.h hVar = this.f440769f;
        hVar.set(i17, obj);
        this.f440770g = hVar.j();
        c();
    }
}
