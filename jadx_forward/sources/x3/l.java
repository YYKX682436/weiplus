package x3;

/* loaded from: classes15.dex */
public final class l extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f533108d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f533109e;

    public l(java.lang.Class cls, java.lang.Class cls2) {
        this.f533108d = cls;
        this.f533109e = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x3.q d() {
        int size = size();
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f533108d, size);
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f533109e, size);
        for (int i17 = 0; i17 < size; i17++) {
            objArr[i17] = ((android.util.Pair) get(i17)).first;
            objArr2[i17] = ((android.util.Pair) get(i17)).second;
        }
        return new x3.q(objArr, objArr2);
    }
}
