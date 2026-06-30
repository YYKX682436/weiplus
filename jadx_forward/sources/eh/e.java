package eh;

/* loaded from: classes7.dex */
public class e implements h8.c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f334402a = {"jpeg", "png", "gif", "svg+xml"};

    @Override // h8.c
    public java.lang.String a() {
        return "base64";
    }

    @Override // h8.c
    /* renamed from: accept */
    public boolean mo127722xab27b508(java.lang.Object obj) {
        return (obj instanceof java.lang.String) && c((java.lang.String) obj) > 0;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        java.lang.String str = (java.lang.String) obj;
        return new h8.b(new java.io.ByteArrayInputStream(android.util.Base64.decode(str.substring(c(str)), 2)));
    }

    public final int c(java.lang.String str) {
        int i17;
        boolean z17 = true;
        if ((str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", str)) || !str.startsWith("data:image/")) {
            return 0;
        }
        java.lang.String[] strArr = f334402a;
        int i18 = 0;
        while (true) {
            i17 = 11;
            if (i18 >= 4) {
                z17 = false;
                break;
            }
            java.lang.String str2 = strArr[i18];
            if (str.startsWith(str2, 11)) {
                i17 = 11 + str2.length();
                break;
            }
            i18++;
        }
        if (z17 && str.startsWith(";base64,", i17)) {
            return i17 + 8;
        }
        return 0;
    }
}
