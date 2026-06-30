package fh0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fh0.c f344056d = new fh0.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        fh0.b item = (fh0.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f344052b ? "思考" : "结果";
        java.lang.String str2 = item.f344053c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<this>");
        if (7 <= str2.length()) {
            charSequence = str2.subSequence(0, str2.length());
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(7);
            sb6.append((java.lang.CharSequence) str2);
            int length = 7 - str2.length();
            if (1 <= length) {
                int i17 = 1;
                while (true) {
                    sb6.append(' ');
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                }
            }
            charSequence = sb6;
        }
        java.lang.String obj2 = charSequence.toString();
        fh0.k kVar = fh0.k.f344063a;
        java.lang.String valueOf = java.lang.String.valueOf(item.f344054d);
        java.lang.String str3 = item.f344055e;
        if (str3.length() == 0) {
            str3 = "-";
        }
        return "[" + str + "] " + item.f344051a + '|' + obj2 + '|' + valueOf + '|' + str3;
    }
}
