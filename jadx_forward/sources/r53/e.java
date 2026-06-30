package r53;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f474184a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f474185b;

    static {
        new java.util.HashMap();
        new java.util.HashMap();
        f474184a = new java.util.HashMap();
        f474185b = new java.util.HashMap();
    }

    public static java.lang.String a(android.content.Context context, long j17) {
        int i17;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            return "";
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        java.util.HashMap hashMap = f474184a;
        boolean containsKey = hashMap.containsKey(java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap2 = f474185b;
        if (containsKey) {
            if (timeInMillis - ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() >= 60000) {
                hashMap.remove(java.lang.Long.valueOf(j17));
            } else if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                return (java.lang.String) hashMap2.get(java.lang.Long.valueOf(j17));
            }
        }
        long j18 = timeInMillis - j17;
        if (j18 < 60000) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fmp);
        }
        long j19 = j18 / 3600000;
        if (j19 == 0) {
            int i18 = (int) (j18 / 60000);
            i17 = i18 >= 1 ? i18 : 1;
            java.lang.String quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571207k, i17, java.lang.Integer.valueOf(i17));
            hashMap2.put(java.lang.Long.valueOf(j17), quantityString);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return quantityString;
        }
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis2 = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
            int i19 = (int) j19;
            i17 = i19 >= 1 ? i19 : 1;
            java.lang.String quantityString2 = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571206j, i17, java.lang.Integer.valueOf(i17));
            hashMap2.put(java.lang.Long.valueOf(j17), quantityString2);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return quantityString2;
        }
        long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
        if (timeInMillis3 > 0 && timeInMillis3 <= 86400000) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
            hashMap2.put(java.lang.Long.valueOf(j17), string);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return string;
        }
        int timeInMillis4 = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - j17) / 86400000);
        i17 = timeInMillis4 >= 1 ? timeInMillis4 : 1;
        java.lang.String quantityString3 = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, i17, java.lang.Integer.valueOf(i17));
        hashMap2.put(java.lang.Long.valueOf(j17), quantityString3);
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
        return quantityString3;
    }
}
