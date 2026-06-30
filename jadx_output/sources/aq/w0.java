package aq;

/* loaded from: classes4.dex */
public final class w0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final aq.w0 f12991d = new aq.w0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj2;
        int intValue = ((java.lang.Integer) obj).intValue();
        kotlin.jvm.internal.o.d(num);
        return kotlin.jvm.internal.o.i(intValue, num.intValue());
    }
}
