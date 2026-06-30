package ww1;

/* loaded from: classes9.dex */
public abstract class d0 {
    public static java.lang.String a(android.content.Context context, long j17, int i17) {
        long j18 = j17 * 1000;
        return i17 == 0 ? new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9e)).format(new java.util.Date(j18)) : i17 == 1 ? new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9f)).format(new java.util.Date(j18)) : new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9g)).format(new java.util.Date(j18));
    }

    public static java.lang.String b(int i17) {
        return java.lang.String.format("%.2f", java.lang.Double.valueOf(i17 / 100.0d));
    }
}
