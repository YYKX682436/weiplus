package v7;

/* loaded from: classes12.dex */
public final class e implements java.util.Comparator {
    public e(v7.d dVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long lastModified = ((java.io.File) obj).lastModified();
        long lastModified2 = ((java.io.File) obj2).lastModified();
        if (lastModified < lastModified2) {
            return -1;
        }
        return lastModified == lastModified2 ? 0 : 1;
    }
}
