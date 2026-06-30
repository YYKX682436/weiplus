package gi;

/* renamed from: gi.u0$$a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C28374xca5c594a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
        java.lang.Object value = ((java.util.Map.Entry) obj).getValue();
        double doubleValue = value instanceof java.lang.Double ? ((java.lang.Double) value).doubleValue() : 0.0d;
        java.lang.Object value2 = entry.getValue();
        double doubleValue2 = doubleValue - (value2 instanceof java.lang.Double ? ((java.lang.Double) value2).doubleValue() : 0.0d);
        if (doubleValue2 == 0.0d) {
            return 0;
        }
        return doubleValue2 > 0.0d ? -1 : 1;
    }
}
