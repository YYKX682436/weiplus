package k72;

/* loaded from: classes12.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final k72.w f386305d = new k72.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        byte[] encoded = ((java.security.cert.Certificate) obj).getEncoded();
        if (encoded != null) {
            java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
            java.lang.String encodeToString = encoder != null ? encoder.encodeToString(encoded) : null;
            if (encodeToString != null) {
                return encodeToString;
            }
        }
        return "error-cert";
    }
}
