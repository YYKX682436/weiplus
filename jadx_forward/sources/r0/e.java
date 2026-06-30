package r0;

/* loaded from: classes14.dex */
public abstract class e implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final r0.v[] f449498d;

    /* renamed from: e, reason: collision with root package name */
    public int f449499e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f449500f;

    public e(r0.u node, r0.v[] path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f449498d = path;
        this.f449500f = true;
        r0.v vVar = path[0];
        java.lang.Object[] buffer = node.f449524d;
        int bitCount = java.lang.Integer.bitCount(node.f449521a) * 2;
        vVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        vVar.f449525d = buffer;
        vVar.f449526e = bitCount;
        vVar.f449527f = 0;
        this.f449499e = 0;
        b();
    }

    public final void b() {
        int i17 = this.f449499e;
        r0.v[] vVarArr = this.f449498d;
        r0.v vVar = vVarArr[i17];
        if (vVar.f449527f < vVar.f449526e) {
            return;
        }
        while (-1 < i17) {
            int c17 = c(i17);
            if (c17 == -1) {
                r0.v vVar2 = vVarArr[i17];
                int i18 = vVar2.f449527f;
                java.lang.Object[] objArr = vVar2.f449525d;
                if (i18 < objArr.length) {
                    int length = objArr.length;
                    vVar2.f449527f = i18 + 1;
                    c17 = c(i17);
                }
            }
            if (c17 != -1) {
                this.f449499e = c17;
                return;
            }
            if (i17 > 0) {
                r0.v vVar3 = vVarArr[i17 - 1];
                int i19 = vVar3.f449527f;
                int length2 = vVar3.f449525d.length;
                vVar3.f449527f = i19 + 1;
            }
            r0.v vVar4 = vVarArr[i17];
            java.lang.Object[] buffer = r0.u.f449520e.f449524d;
            vVar4.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
            vVar4.f449525d = buffer;
            vVar4.f449526e = 0;
            vVar4.f449527f = 0;
            i17--;
        }
        this.f449500f = false;
    }

    public final int c(int i17) {
        r0.v[] vVarArr = this.f449498d;
        r0.v vVar = vVarArr[i17];
        int i18 = vVar.f449527f;
        if (i18 < vVar.f449526e) {
            return i17;
        }
        java.lang.Object[] objArr = vVar.f449525d;
        if (!(i18 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        java.lang.Object obj = objArr[i18];
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        r0.u uVar = (r0.u) obj;
        if (i17 == 6) {
            r0.v vVar2 = vVarArr[i17 + 1];
            java.lang.Object[] objArr2 = uVar.f449524d;
            int length2 = objArr2.length;
            vVar2.getClass();
            vVar2.f449525d = objArr2;
            vVar2.f449526e = length2;
            vVar2.f449527f = 0;
        } else {
            r0.v vVar3 = vVarArr[i17 + 1];
            java.lang.Object[] buffer = uVar.f449524d;
            int bitCount = java.lang.Integer.bitCount(uVar.f449521a) * 2;
            vVar3.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
            vVar3.f449525d = buffer;
            vVar3.f449526e = bitCount;
            vVar3.f449527f = 0;
        }
        return c(i17 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449500f;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f449500f) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = this.f449498d[this.f449499e].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
