package wo;

/* loaded from: classes12.dex */
public class z extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wo.w0.c());
        sb6.append('#');
        java.lang.String a17 = wo.w0.f529377f.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        sb6.append('#');
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('#');
        sb6.append(android.os.SystemClock.elapsedRealtimeNanos());
        return java.util.UUID.nameUUIDFromBytes(sb6.toString().getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c))).toString();
    }

    @Override // wo.r0
    public void c() {
    }

    @Override // wo.r0
    public void d() {
        wo.x0.a(1064, 8, 1, true);
    }
}
