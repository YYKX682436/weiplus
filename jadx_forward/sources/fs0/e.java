package fs0;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final fs0.e f347743a = new fs0.e();

    public final double a(int i17, int i18, java.util.List list) {
        return 2 * (((java.lang.Number) list.get(i17)).longValue() - ((java.lang.Number) list.get(i18)).longValue());
    }

    public final double b(int i17, int i18, java.util.List list, java.util.List list2) {
        return (((java.lang.Number) list.get(i17)).longValue() + (((java.lang.Number) list2.get(i17)).longValue() * ((java.lang.Number) list2.get(i17)).longValue())) - (((java.lang.Number) list.get(i18)).longValue() + (((java.lang.Number) list2.get(i18)).longValue() * ((java.lang.Number) list2.get(i18)).longValue()));
    }
}
