package iv5;

/* loaded from: classes16.dex */
public class p extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376705d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.n0 f376706e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.u f376707f;

    /* renamed from: g, reason: collision with root package name */
    public final av5.u f376708g;

    public p(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376705d = null;
        this.f376706e = null;
        this.f376707f = null;
        this.f376708g = null;
        if (yVar2 != null) {
            av5.o0 o0Var = yVar2.f95995a;
            av5.n0 n0Var = o0Var.f95972p;
            this.f376705d = n0Var;
            av5.n0 n0Var2 = o0Var.f95958b;
            this.f376706e = n0Var2;
            this.f376707f = yVar2.d(n0Var);
            this.f376708g = yVar2.d(n0Var2);
        }
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95972p;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f394309q.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.r();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f394293a.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        int i17;
        av5.l0 l0Var = (av5.l0) comparable;
        av5.u uVar = this.f376707f;
        uVar.A(uVar.f95990f.f95995a.f95972p, true);
        int position = uVar.f106295a.position();
        try {
            av5.f0.d(uVar, l0Var.f95946e.length());
            java.lang.String str = l0Var.f95946e;
            int length = str.length();
            long j17 = 0;
            for (int i18 = 0; i18 < length; i18++) {
                char charAt = str.charAt(i18);
                j17 += (charAt == 0 || charAt > 127) ? charAt <= 2047 ? 2L : 3L : 1L;
            }
            byte[] bArr = new byte[(int) j17];
            int length2 = str.length();
            int i19 = 0;
            for (int i27 = 0; i27 < length2; i27++) {
                char charAt2 = str.charAt(i27);
                if (charAt2 != 0 && charAt2 <= 127) {
                    i17 = i19 + 1;
                    bArr[i19] = (byte) charAt2;
                } else if (charAt2 <= 2047) {
                    int i28 = i19 + 1;
                    bArr[i19] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i19 = i28 + 1;
                    bArr[i28] = (byte) ((charAt2 & '?') | 128);
                } else {
                    int i29 = i19 + 1;
                    bArr[i19] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i37 = i29 + 1;
                    bArr[i29] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i17 = i37 + 1;
                    bArr[i37] = (byte) ((charAt2 & '?') | 128);
                }
                i19 = i17;
            }
            uVar.v(bArr);
            uVar.e(0);
            this.f376708g.w(position);
            this.f376705d.f95953f++;
            this.f376706e.f95953f++;
            return position;
        } catch (java.io.UTFDataFormatException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }
}
