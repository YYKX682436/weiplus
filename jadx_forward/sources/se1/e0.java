package se1;

/* loaded from: classes13.dex */
public class e0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        float f17 = ((se1.f0) obj).f488291c;
        float f18 = ((se1.f0) obj2).f488291c;
        if (f17 < f18) {
            return -1;
        }
        return f18 < f17 ? 1 : 0;
    }
}
