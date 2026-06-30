package y02;

/* loaded from: classes9.dex */
public abstract class k {
    public static final byte[][] a(com.p314xaae8f345.mm.p2495xc50a8b8b.f[] fVarArr) {
        byte[] bArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVarArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(fVarArr.length);
        for (com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar : fVarArr) {
            if (fVar == null || (bArr = fVar.mo14344x5f01b1f6()) == null) {
                bArr = new byte[0];
            }
            arrayList.add(bArr);
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.f b(byte[] bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
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

    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.f c(byte[] bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f b17 = b(bArr, message);
        return b17 == null ? message : b17;
    }
}
