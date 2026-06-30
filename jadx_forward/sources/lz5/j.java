package lz5;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f403933d;

    /* renamed from: e, reason: collision with root package name */
    public int f403934e;

    /* renamed from: f, reason: collision with root package name */
    public int f403935f;

    /* renamed from: g, reason: collision with root package name */
    public int f403936g;

    public j(lz5.m map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f403933d = map;
        this.f403935f = -1;
        this.f403936g = map.f403945n;
        c();
    }

    public final void b() {
        if (this.f403933d.f403945n != this.f403936g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void c() {
        while (true) {
            int i17 = this.f403934e;
            lz5.m mVar = this.f403933d;
            if (i17 >= mVar.f403943i || mVar.f403940f[i17] >= 0) {
                return;
            } else {
                this.f403934e = i17 + 1;
            }
        }
    }

    /* renamed from: hasNext */
    public final boolean m146549x2987b4ad() {
        return this.f403934e < this.f403933d.f403943i;
    }

    /* renamed from: remove */
    public final void m146550xc84af884() {
        b();
        if (!(this.f403935f != -1)) {
            throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        lz5.m mVar = this.f403933d;
        mVar.c();
        mVar.l(this.f403935f);
        this.f403935f = -1;
        this.f403936g = mVar.f403945n;
    }
}
