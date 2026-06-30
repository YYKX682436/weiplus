package aq;

/* loaded from: classes4.dex */
public final class y0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final aq.y0 f13007d = new aq.y0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = ((java.lang.Integer) obj2).intValue();
        kotlin.jvm.internal.o.d(num);
        return kotlin.jvm.internal.o.i(intValue, num.intValue());
    }
}
