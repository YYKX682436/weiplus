package u7;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f506571d = java.util.regex.Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f506572e = java.util.regex.Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f506573a;

    /* renamed from: b, reason: collision with root package name */
    public final long f506574b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f506575c;

    public d(java.lang.String str) {
        str.getClass();
        java.util.regex.Matcher matcher = f506571d.matcher(str);
        long parseLong = matcher.find() ? java.lang.Long.parseLong(matcher.group(1)) : -1L;
        this.f506574b = java.lang.Math.max(0L, parseLong);
        this.f506575c = parseLong >= 0;
        java.util.regex.Matcher matcher2 = f506572e.matcher(str);
        if (matcher2.find()) {
            this.f506573a = matcher2.group(1);
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public static u7.d a(java.io.InputStream inputStream) {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (android.text.TextUtils.isEmpty(readLine)) {
                return new u7.d(sb6.toString());
            }
            sb6.append(readLine);
            sb6.append('\n');
        }
    }

    /* renamed from: toString */
    public java.lang.String m167650x9616526c() {
        return "GetRequest{rangeOffset=" + this.f506574b + ", partial=" + this.f506575c + ", uri='" + this.f506573a + "'}";
    }
}
