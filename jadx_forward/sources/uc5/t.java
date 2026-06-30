package uc5;

/* loaded from: classes.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.t f508080d = new uc5.t();

    public t() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = "(type & 65535) = " + intValue;
        if (intValue == 0) {
            return str;
        }
        return "((type >= " + intValue + " OR type <= " + (-intValue) + ") AND " + str + ')';
    }
}
