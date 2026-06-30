package x0;

/* loaded from: classes13.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f532432a = new java.lang.Object();

    public static final void a(int i17, int i18) {
        if (i17 >= 0 && i17 < i18) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("index (" + i17 + ") is out of bound of [0, " + i18 + ')');
    }
}
