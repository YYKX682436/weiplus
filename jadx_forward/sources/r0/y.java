package r0;

/* loaded from: classes14.dex */
public abstract class y {
    public static final java.lang.Object[] a(java.lang.Object[] objArr, int i17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 2];
        kz5.v.p(objArr, objArr2, 0, 0, i17, 6, null);
        kz5.v.k(objArr, objArr2, i17 + 2, i17, objArr.length);
        objArr2[i17] = obj;
        objArr2[i17 + 1] = obj2;
        return objArr2;
    }

    public static final java.lang.Object[] b(java.lang.Object[] objArr, int i17) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 2];
        kz5.v.p(objArr, objArr2, 0, 0, i17, 6, null);
        kz5.v.k(objArr, objArr2, i17, i17 + 2, objArr.length);
        return objArr2;
    }

    public static final java.lang.Object[] c(java.lang.Object[] objArr, int i17) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        kz5.v.p(objArr, objArr2, 0, 0, i17, 6, null);
        kz5.v.k(objArr, objArr2, i17, i17 + 1, objArr.length);
        return objArr2;
    }
}
