package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.LegacyEmbed */
/* loaded from: classes8.dex */
public class C4506xe03c0870 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 f18880xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870();

    /* renamed from: hasSetFields */
    private final boolean[] f18881xcb94b041 = new boolean[5];

    /* renamed from: main */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf f18882x3305b9;

    /* renamed from: main_fileid */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 f18883xbd7f58dd;
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf mid;

    /* renamed from: thumb */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf f18884x693b1d6;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39191xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39192x7c90cfc0() {
        return f18880xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39193x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39194x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 c4506xe03c0870 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870) fVar;
        return n51.f.a(this.f18882x3305b9, c4506xe03c0870.f18882x3305b9) && n51.f.a(this.f18884x693b1d6, c4506xe03c0870.f18884x693b1d6) && n51.f.a(this.mid, c4506xe03c0870.mid) && n51.f.a(this.f18883xbd7f58dd, c4506xe03c0870.f18883xbd7f58dd);
    }

    /* renamed from: getMain */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m39195xfb826e2f() {
        return this.f18881xcb94b041[1] ? this.f18882x3305b9 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf.m38881xaf65a0fc();
    }

    /* renamed from: getMainFileid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 m39196xf32a4ea6() {
        return this.f18881xcb94b041[4] ? this.f18883xbd7f58dd : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6.m38847xaf65a0fc();
    }

    /* renamed from: getMid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m39197xb5885712() {
        return this.f18881xcb94b041[3] ? this.mid : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf.m38881xaf65a0fc();
    }

    /* renamed from: getThumb */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf m39198x75315820() {
        return this.f18881xcb94b041[2] ? this.f18884x693b1d6 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf.m38881xaf65a0fc();
    }

    /* renamed from: hasFieldNumber */
    public boolean m39199x6e095e9(int i17) {
        return this.f18881xcb94b041[i17];
    }

    /* renamed from: hasMain */
    public boolean m39200x29872f73() {
        return m39199x6e095e9(1);
    }

    /* renamed from: hasMainFileid */
    public boolean m39201x2e020cea() {
        return m39199x6e095e9(4);
    }

    /* renamed from: hasMid */
    public boolean m39202xb7045d4e() {
        return m39199x6e095e9(3);
    }

    /* renamed from: hasThumb */
    public boolean m39203x7c4bf5c() {
        return m39199x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39204x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf = this.f18882x3305b9;
            if (c4489xd7fe2acf != null && this.f18881xcb94b041[1]) {
                fVar.i(1, c4489xd7fe2acf.mo75928xcd1e8d8());
                this.f18882x3305b9.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf2 = this.f18884x693b1d6;
            if (c4489xd7fe2acf2 != null && this.f18881xcb94b041[2]) {
                fVar.i(2, c4489xd7fe2acf2.mo75928xcd1e8d8());
                this.f18884x693b1d6.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf3 = this.mid;
            if (c4489xd7fe2acf3 != null && this.f18881xcb94b041[3]) {
                fVar.i(3, c4489xd7fe2acf3.mo75928xcd1e8d8());
                this.mid.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6 = this.f18883xbd7f58dd;
            if (c4487x363e7af6 != null && this.f18881xcb94b041[4]) {
                fVar.i(4, c4487x363e7af6.mo75928xcd1e8d8());
                this.f18883xbd7f58dd.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf4 = this.f18882x3305b9;
            if (c4489xd7fe2acf4 != null && this.f18881xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, c4489xd7fe2acf4.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf5 = this.f18884x693b1d6;
            if (c4489xd7fe2acf5 != null && this.f18881xcb94b041[2]) {
                i18 += b36.f.i(2, c4489xd7fe2acf5.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf6 = this.mid;
            if (c4489xd7fe2acf6 != null && this.f18881xcb94b041[3]) {
                i18 += b36.f.i(3, c4489xd7fe2acf6.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af62 = this.f18883xbd7f58dd;
            return (c4487x363e7af62 == null || !this.f18881xcb94b041[4]) ? i18 : i18 + b36.f.i(4, c4487x363e7af62.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf7 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
                if (bArr != null && bArr.length > 0) {
                    c4489xd7fe2acf7.mo11468x92b714fd(bArr);
                }
                this.f18882x3305b9 = c4489xd7fe2acf7;
            }
            this.f18881xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf8 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
                if (bArr2 != null && bArr2.length > 0) {
                    c4489xd7fe2acf8.mo11468x92b714fd(bArr2);
                }
                this.f18884x693b1d6 = c4489xd7fe2acf8;
            }
            this.f18881xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf9 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
                if (bArr3 != null && bArr3.length > 0) {
                    c4489xd7fe2acf9.mo11468x92b714fd(bArr3);
                }
                this.mid = c4489xd7fe2acf9;
            }
            this.f18881xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af63 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6();
            if (bArr4 != null && bArr4.length > 0) {
                c4487x363e7af63.mo11468x92b714fd(bArr4);
            }
            this.f18883xbd7f58dd = c4487x363e7af63;
        }
        this.f18881xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setMain */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39206x764d353b(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf) {
        this.f18882x3305b9 = c4489xd7fe2acf;
        this.f18881xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setMainFileid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39207x214e9cb2(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6) {
        this.f18883xbd7f58dd = c4487x363e7af6;
        this.f18881xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39208xca027e86(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf) {
        this.mid = c4489xd7fe2acf;
        this.f18881xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setThumb */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39209x53bf7294(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf) {
        this.f18884x693b1d6 = c4489xd7fe2acf;
        this.f18881xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m39205x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870) super.mo11468x92b714fd(bArr);
    }
}
