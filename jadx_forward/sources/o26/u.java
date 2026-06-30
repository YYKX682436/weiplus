package o26;

/* loaded from: classes14.dex */
public final class u extends java.util.AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public static final o26.s f424147f = new o26.s(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424148d;

    /* renamed from: e, reason: collision with root package name */
    public int f424149e;

    public u(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i17 = this.f424149e;
        if (i17 == 0) {
            this.f424148d = obj;
        } else if (i17 == 1) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424148d, obj)) {
                return false;
            }
            this.f424148d = new java.lang.Object[]{this.f424148d, obj};
        } else if (i17 < 5) {
            java.lang.Object obj2 = this.f424148d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            java.lang.Object[] objArr2 = (java.lang.Object[]) obj2;
            if (kz5.z.G(objArr2, obj)) {
                return false;
            }
            int i18 = this.f424149e;
            if (i18 == 4) {
                java.lang.Object[] elements = java.util.Arrays.copyOf(objArr2, objArr2.length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
                ?? linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(elements.length));
                kz5.z.u0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i18 + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
                copyOf[copyOf.length - 1] = obj;
                objArr = copyOf;
            }
            this.f424148d = objArr;
        } else {
            java.lang.Object obj3 = this.f424148d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.m0.d(obj3).add(obj)) {
                return false;
            }
        }
        this.f424149e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f424148d = null;
        this.f424149e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        int i17 = this.f424149e;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424148d, obj);
        }
        if (i17 < 5) {
            java.lang.Object obj2 = this.f424148d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return kz5.z.G((java.lang.Object[]) obj2, obj);
        }
        java.lang.Object obj3 = this.f424148d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((java.util.Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        int i17 = this.f424149e;
        if (i17 == 0) {
            return java.util.Collections.emptySet().iterator();
        }
        if (i17 == 1) {
            return new o26.t(this.f424148d);
        }
        if (i17 < 5) {
            java.lang.Object obj = this.f424148d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new o26.r((java.lang.Object[]) obj);
        }
        java.lang.Object obj2 = this.f424148d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return p3321xbce91901.jvm.p3324x21ffc6bd.m0.d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f424149e;
    }
}
