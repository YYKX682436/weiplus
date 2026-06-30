package eq1;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.e0 f337332a = new eq1.e0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f337333b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f337334c = new java.util.HashMap();

    public final boolean a(java.lang.String str) {
        java.lang.Long l17;
        java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) f337334c).get(str);
        long longValue = l18 != null ? l18.longValue() : -1L;
        java.util.Map map = f337333b;
        return ((java.util.HashMap) map).containsKey(str) && (l17 = (java.lang.Long) ((java.util.HashMap) map).get(str)) != null && l17.longValue() == longValue;
    }

    public final void b(java.lang.String username, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        boolean a17 = a(username);
        java.util.Map map = f337334c;
        if (a17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(username);
            sb6.append('#');
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) map).get(username);
            sb6.append(l17 != null ? l17.longValue() : -1L);
            sb6.append(" has been reported");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceConversationReporter", sb6.toString());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32068, username, 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)), java.lang.Integer.valueOf(i18));
        java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) map).get(username);
        long longValue = l18 != null ? l18.longValue() : -1L;
        ((java.util.HashMap) f337333b).put(username, java.lang.Long.valueOf(longValue));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceConversationReporter", "32068 report, username=" + username + ", pos=" + i17 + ", isRedDot=" + i18 + ", lastMsgId=" + longValue);
    }
}
