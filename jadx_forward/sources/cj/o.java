package cj;

/* loaded from: classes7.dex */
public final class o implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((java.io.File) obj).lastModified()), java.lang.Long.valueOf(((java.io.File) obj2).lastModified()));
    }
}
