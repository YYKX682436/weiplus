package w71;

/* loaded from: classes9.dex */
public abstract class l {
    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.f a(byte[] bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<this>");
        if (fVar != null) {
            try {
                fVar.mo11468x92b714fd(bArr);
            } catch (e36.b e17) {
                com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106047x5c4d208("toMessage error: " + e17.getMessage() + ", " + jz5.a.b(e17));
                return null;
            }
        }
        return fVar;
    }

    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.f b(byte[] bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f a17 = a(bArr, message);
        return a17 == null ? message : a17;
    }
}
