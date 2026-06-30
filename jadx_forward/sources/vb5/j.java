package vb5;

/* loaded from: classes5.dex */
public final class j implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final vb5.j f516384d = new vb5.j();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        xj5.a aVar = (xj5.a) obj;
        xj5.a aVar2 = (xj5.a) obj2;
        int h17 = aVar.h();
        int h18 = aVar2.h();
        if (h17 != h18) {
            return -(h17 - h18);
        }
        try {
            i17 = aVar.m(aVar2);
        } catch (java.lang.Throwable unused) {
            i17 = 0;
        }
        return -i17;
    }
}
