package p16;

/* loaded from: classes14.dex */
public class b0 extends java.util.AbstractList implements java.util.RandomAccess, p16.c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final p16.c0 f432803e = new p16.a1(new p16.b0());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432804d;

    public b0() {
        this.f432804d = new java.util.ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        this.f432804d.add(i17, (java.lang.String) obj);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    @Override // p16.c0
    public p16.c0 b() {
        return new p16.a1(this);
    }

    @Override // p16.c0
    public java.util.List c() {
        return java.util.Collections.unmodifiableList(this.f432804d);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f432804d.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // p16.c0
    public p16.g f(int i17) {
        p16.g f0Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f432804d;
        java.lang.Object obj = arrayList.get(i17);
        if (obj instanceof p16.g) {
            f0Var = (p16.g) obj;
        } else if (obj instanceof java.lang.String) {
            try {
                f0Var = new p16.f0(((java.lang.String) obj).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            f0Var = new p16.f0(bArr2);
        }
        if (f0Var != obj) {
            arrayList.set(i17, f0Var);
        }
        return f0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        java.lang.String str;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f432804d;
        java.lang.Object obj = arrayList.get(i17);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof p16.g) {
            p16.g gVar = (p16.g) obj;
            gVar.getClass();
            try {
                str = gVar.r(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                if (gVar.l()) {
                    arrayList.set(i17, str);
                }
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = p16.y.f432902a;
            try {
                str = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                if (p16.b1.b(bArr, 0, bArr.length) == 0) {
                    arrayList.set(i17, str);
                }
            } catch (java.io.UnsupportedEncodingException e18) {
                throw new java.lang.RuntimeException("UTF-8 not supported?", e18);
            }
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        java.lang.Object remove = ((java.util.ArrayList) this.f432804d).remove(i17);
        ((java.util.AbstractList) this).modCount++;
        if (remove instanceof java.lang.String) {
            return (java.lang.String) remove;
        }
        if (remove instanceof p16.g) {
            p16.g gVar = (p16.g) remove;
            gVar.getClass();
            try {
                return gVar.r(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
            }
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = p16.y.f432902a;
        try {
            return new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException e18) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e18);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        java.lang.Object obj2 = ((java.util.ArrayList) this.f432804d).set(i17, (java.lang.String) obj);
        if (obj2 instanceof java.lang.String) {
            return (java.lang.String) obj2;
        }
        if (obj2 instanceof p16.g) {
            p16.g gVar = (p16.g) obj2;
            gVar.getClass();
            try {
                return gVar.r(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
            }
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = p16.y.f432902a;
        try {
            return new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException e18) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e18);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f432804d.size();
    }

    @Override // p16.c0
    public void z(p16.g gVar) {
        this.f432804d.add(gVar);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        if (collection instanceof p16.c0) {
            collection = ((p16.c0) collection).c();
        }
        boolean addAll = this.f432804d.addAll(i17, collection);
        ((java.util.AbstractList) this).modCount++;
        return addAll;
    }

    public b0(p16.c0 c0Var) {
        this.f432804d = new java.util.ArrayList(c0Var.size());
        addAll(c0Var);
    }
}
