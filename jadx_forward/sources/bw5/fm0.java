package bw5;

/* loaded from: classes2.dex */
public class fm0 extends r45.js5 {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.fm0 f108902i = new bw5.fm0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.mm0 f108903d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ul0 f108904e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cn0 f108905f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f108906g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108907h = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fm0)) {
            return false;
        }
        bw5.fm0 fm0Var = (bw5.fm0) fVar;
        return n51.f.a(this.f76492x92037252, fm0Var.f76492x92037252) && n51.f.a(this.f108903d, fm0Var.f108903d) && n51.f.a(this.f108904e, fm0Var.f108904e) && n51.f.a(this.f108905f, fm0Var.f108905f) && n51.f.a(this.f108906g, fm0Var.f108906g);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f108907h[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108906g;
        boolean[] zArr = this.f108907h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            bw5.mm0 mm0Var = this.f108903d;
            if (mm0Var != null && zArr[2]) {
                fVar.i(2, mm0Var.mo75928xcd1e8d8());
                this.f108903d.mo75956x3d5d1f78(fVar);
            }
            bw5.ul0 ul0Var = this.f108904e;
            if (ul0Var != null && zArr[3]) {
                fVar.i(3, ul0Var.mo75928xcd1e8d8());
                this.f108904e.mo75956x3d5d1f78(fVar);
            }
            bw5.cn0 cn0Var = this.f108905f;
            if (cn0Var != null && zArr[4]) {
                fVar.i(4, cn0Var.mo75928xcd1e8d8());
                this.f108905f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            bw5.mm0 mm0Var2 = this.f108903d;
            if (mm0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, mm0Var2.mo75928xcd1e8d8());
            }
            bw5.ul0 ul0Var2 = this.f108904e;
            if (ul0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, ul0Var2.mo75928xcd1e8d8());
            }
            bw5.cn0 cn0Var2 = this.f108905f;
            if (cn0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, cn0Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                this.f76492x92037252 = ieVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.mm0 mm0Var3 = new bw5.mm0();
                if (bArr2 != null && bArr2.length > 0) {
                    mm0Var3.mo11468x92b714fd(bArr2);
                }
                this.f108903d = mm0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.ul0 ul0Var3 = new bw5.ul0();
                if (bArr3 != null && bArr3.length > 0) {
                    ul0Var3.mo11468x92b714fd(bArr3);
                }
                this.f108904e = ul0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.cn0 cn0Var3 = new bw5.cn0();
                if (bArr4 != null && bArr4.length > 0) {
                    cn0Var3.mo11468x92b714fd(bArr4);
                }
                this.f108905f = cn0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            bw5.mm0 mm0Var4 = new bw5.mm0();
            if (bArr5 != null && bArr5.length > 0) {
                mm0Var4.mo11468x92b714fd(bArr5);
            }
            linkedList.add(mm0Var4);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.fm0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f108907h[1] = true;
        return this;
    }
}
