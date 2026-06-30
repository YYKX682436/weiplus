package yy4;

/* loaded from: classes15.dex */
public class a extends dm.g7 {

    /* renamed from: t2, reason: collision with root package name */
    public static final l75.e0 f550013t2 = dm.g7.m125004x3593deb(yy4.a.class);

    /* renamed from: u2, reason: collision with root package name */
    public static final java.util.List f550014u2 = java.util.Arrays.asList("_cn", "_hk", "_tw", "_en");

    /* renamed from: s2, reason: collision with root package name */
    public final java.util.Map f550015s2 = new java.util.HashMap();

    /* renamed from: equals */
    public boolean m178086xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy4.a) {
            return ((yy4.a) obj).f66634x369ad11.equals(this.f66634x369ad11);
        }
        return false;
    }

    @Override // dm.g7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f550013t2;
    }

    /* renamed from: hashCode */
    public int m178087x8cdac1b() {
        return this.f66634x369ad11.hashCode();
    }

    /* renamed from: isValid */
    public boolean m178088x7b953cf2() {
        return (android.text.TextUtils.isEmpty(this.f66634x369ad11) || this.f66634x369ad11.equals("labs1de6f3")) ? false : true;
    }

    public final java.lang.String t0(java.lang.String str) {
        java.util.Map map = this.f550015s2;
        java.lang.reflect.Field field = (java.lang.reflect.Field) ((java.util.HashMap) map).get(str);
        if (field == null) {
            try {
                field = yy4.a.class.getField(str);
                ((java.util.HashMap) map).put(str, field);
            } catch (java.lang.NoSuchFieldException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LabAppInfo", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        if (field == null) {
            return "";
        }
        try {
            return (java.lang.String) field.get(this);
        } catch (java.lang.IllegalAccessException e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LabAppInfo", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            return "";
        }
    }

    /* renamed from: toString */
    public java.lang.String m178089x9616526c() {
        return "[appid " + this.f66634x369ad11 + ",title " + this.f66643xb2277d77 + ", exptId " + this.f66653x29106093 + "]";
    }

    public final java.lang.String u0(java.lang.String str) {
        java.lang.String t07 = t0(str + "Key_android");
        if (!android.text.TextUtils.isEmpty(t07)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getIdentifier(t07, "string", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b));
            if (!android.text.TextUtils.isEmpty(string)) {
                return string;
            }
        }
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? v0(str, "_cn") : "zh_HK".equals(f17) ? v0(str, "_hk") : "zh_TW".equals(f17) ? v0(str, "_tw") : v0(str, "_en");
    }

    public final java.lang.String v0(java.lang.String str, java.lang.String str2) {
        java.lang.String t07 = t0(str + str2);
        if (!android.text.TextUtils.isEmpty(t07)) {
            return t07;
        }
        java.util.Iterator it = f550014u2.iterator();
        while (it.hasNext()) {
            java.lang.String t08 = t0(str + ((java.lang.String) it.next()));
            if (!android.text.TextUtils.isEmpty(t08)) {
                return t08;
            }
        }
        return "";
    }

    public boolean w0() {
        return m178088x7b953cf2() && java.lang.System.currentTimeMillis() / 1000 >= this.f66652x14d4a3e3;
    }

    public boolean y0() {
        int i17;
        return z0() && ((i17 = this.f66637xda33d239) == 2 || i17 == 1);
    }

    public boolean z0() {
        return m178088x7b953cf2() && java.lang.System.currentTimeMillis() / 1000 >= this.f66658x1bc2412a && java.lang.System.currentTimeMillis() / 1000 < this.f66652x14d4a3e3;
    }
}
