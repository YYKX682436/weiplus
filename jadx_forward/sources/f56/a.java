package f56;

/* loaded from: classes7.dex */
public class a extends f56.k {
    public a(f56.g gVar) {
        super(new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b(gVar.f341333f), gVar);
    }

    public byte[] D() {
        try {
            flush();
            java.util.ArrayList arrayList = (java.util.ArrayList) ((org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.b) this.f341349g).f429369d;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i17 += ((org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h) it.next()).m155049x35e001();
            }
            byte[] bArr = new byte[i17];
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar = (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h) it6.next();
                hVar.mo155017x743b66b5(0, bArr, i18, hVar.m155049x35e001());
                i18 += hVar.m155049x35e001();
            }
            return bArr;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
