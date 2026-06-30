package bg5;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final bg5.d f102278d = new bg5.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "<name for destructuring parameter 0>");
        int intValue = ((java.lang.Number) entry.getKey()).intValue();
        int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(intValue);
        sb6.append(':');
        sb6.append(intValue2);
        return sb6.toString();
    }
}
