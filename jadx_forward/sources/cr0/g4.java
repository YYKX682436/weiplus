package cr0;

/* loaded from: classes12.dex */
public final class g4 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((android.app.ApplicationExitInfo) obj).getTimestamp()), java.lang.Long.valueOf(((android.app.ApplicationExitInfo) obj2).getTimestamp()));
    }
}
