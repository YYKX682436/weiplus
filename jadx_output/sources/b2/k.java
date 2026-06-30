package b2;

/* loaded from: classes14.dex */
public abstract class k {
    public static final boolean a(android.text.Spanned spanned, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(spanned, "<this>");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), clazz) != spanned.length();
    }
}
