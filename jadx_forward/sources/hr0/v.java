package hr0;

/* loaded from: classes8.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final hr0.v f364869d = new hr0.v();

    public v() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).intValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        java.lang.String str2 = (java.lang.String) obj4;
        if (com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39992x29858eca && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39993xc6c32446, java.lang.Boolean.FALSE)) {
            java.lang.String str3 = "LOGCAT-" + str;
            if (intValue != 2 && intValue != 3) {
                if (intValue == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
                } else if (intValue == 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, str2);
                } else if (intValue != 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LOGCAT-" + intValue + '-' + str, str2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, str2);
                }
            }
        }
        return 0;
    }
}
