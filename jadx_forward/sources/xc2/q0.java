package xc2;

/* loaded from: classes.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final xc2.q0 f534805d = new xc2.q0();

    public q0() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.util.Map p17 = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        if (str == null) {
            str = "";
        }
        for (java.util.Map.Entry entry : p17.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (str2.length() > 0) {
                str = str + '&' + str2 + '=' + value;
            }
        }
        return str;
    }
}
