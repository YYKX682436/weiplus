package u9;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f507273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f507274b;

    public e(java.util.List list, int i17) {
        this.f507273a = list;
        this.f507274b = i17;
    }

    public static u9.e a(t9.p pVar) {
        try {
            pVar.x(21);
            int m17 = pVar.m() & 3;
            int m18 = pVar.m();
            int i17 = pVar.f498074b;
            int i18 = 0;
            for (int i19 = 0; i19 < m18; i19++) {
                pVar.x(1);
                int r17 = pVar.r();
                for (int i27 = 0; i27 < r17; i27++) {
                    int r18 = pVar.r();
                    i18 += r18 + 4;
                    pVar.x(r18);
                }
            }
            pVar.w(i17);
            byte[] bArr = new byte[i18];
            int i28 = 0;
            for (int i29 = 0; i29 < m18; i29++) {
                pVar.x(1);
                int r19 = pVar.r();
                for (int i37 = 0; i37 < r19; i37++) {
                    int r27 = pVar.r();
                    java.lang.System.arraycopy(t9.n.f498065a, 0, bArr, i28, 4);
                    int i38 = i28 + 4;
                    java.lang.System.arraycopy(pVar.f498073a, pVar.f498074b, bArr, i38, r27);
                    i28 = i38 + r27;
                    pVar.x(r27);
                }
            }
            return new u9.e(i18 == 0 ? null : java.util.Collections.singletonList(bArr), m17 + 1);
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            throw new m8.x("Error parsing HEVC config", e17);
        }
    }
}
