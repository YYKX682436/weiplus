package vz5;

/* loaded from: classes7.dex */
public abstract class v {
    public static final void a(java.io.Reader reader, yz5.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            java.util.Iterator mo144672x467c086e = b(bufferedReader).mo144672x467c086e();
            while (mo144672x467c086e.hasNext()) {
                action.mo146xb9724478(mo144672x467c086e.next());
            }
            vz5.b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final q26.n b(java.io.BufferedReader bufferedReader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferedReader, "<this>");
        return q26.y.b(new vz5.s(bufferedReader));
    }

    public static final java.lang.String c(java.io.Reader reader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        java.lang.String stringWriter2 = stringWriter.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
