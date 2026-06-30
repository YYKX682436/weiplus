package r0;

/* loaded from: classes14.dex */
public class g extends r0.e {

    /* renamed from: g, reason: collision with root package name */
    public final r0.f f449507g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f449508h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f449509i;

    /* renamed from: m, reason: collision with root package name */
    public int f449510m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r0.f builder, r0.v[] path) {
        super(builder.f449503f, path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f449507g = builder;
        this.f449510m = builder.f449505h;
    }

    public final void d(int i17, r0.u uVar, java.lang.Object obj, int i18) {
        int i19 = i18 * 5;
        r0.v[] vVarArr = this.f449498d;
        if (i19 <= 30) {
            int i27 = 1 << ((i17 >> i19) & 31);
            if (uVar.h(i27)) {
                int f17 = uVar.f(i27);
                r0.v vVar = vVarArr[i18];
                java.lang.Object[] buffer = uVar.f449524d;
                int bitCount = java.lang.Integer.bitCount(uVar.f449521a) * 2;
                vVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
                vVar.f449525d = buffer;
                vVar.f449526e = bitCount;
                vVar.f449527f = f17;
                this.f449499e = i18;
                return;
            }
            int t17 = uVar.t(i27);
            r0.u s17 = uVar.s(t17);
            r0.v vVar2 = vVarArr[i18];
            java.lang.Object[] buffer2 = uVar.f449524d;
            int bitCount2 = java.lang.Integer.bitCount(uVar.f449521a) * 2;
            vVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer2, "buffer");
            vVar2.f449525d = buffer2;
            vVar2.f449526e = bitCount2;
            vVar2.f449527f = t17;
            d(i17, s17, obj, i18 + 1);
            return;
        }
        r0.v vVar3 = vVarArr[i18];
        java.lang.Object[] objArr = uVar.f449524d;
        int length = objArr.length;
        vVar3.getClass();
        vVar3.f449525d = objArr;
        vVar3.f449526e = length;
        vVar3.f449527f = 0;
        while (true) {
            r0.v vVar4 = vVarArr[i18];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar4.f449525d[vVar4.f449527f], obj)) {
                this.f449499e = i18;
                return;
            } else {
                vVarArr[i18].f449527f += 2;
            }
        }
    }

    @Override // r0.e, java.util.Iterator
    public java.lang.Object next() {
        if (this.f449507g.f449505h != this.f449510m) {
            throw new java.util.ConcurrentModificationException();
        }
        if (!this.f449500f) {
            throw new java.util.NoSuchElementException();
        }
        r0.v vVar = this.f449498d[this.f449499e];
        this.f449508h = vVar.f449525d[vVar.f449527f];
        this.f449509i = true;
        return super.next();
    }

    @Override // r0.e, java.util.Iterator
    public void remove() {
        if (!this.f449509i) {
            throw new java.lang.IllegalStateException();
        }
        boolean z17 = this.f449500f;
        r0.f fVar = this.f449507g;
        if (!z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(fVar).remove(this.f449508h);
        } else {
            if (!z17) {
                throw new java.util.NoSuchElementException();
            }
            r0.v vVar = this.f449498d[this.f449499e];
            java.lang.Object obj = vVar.f449525d[vVar.f449527f];
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(fVar).remove(this.f449508h);
            d(obj != null ? obj.hashCode() : 0, fVar.f449503f, obj, 0);
        }
        this.f449508h = null;
        this.f449509i = false;
        this.f449510m = fVar.f449505h;
    }
}
