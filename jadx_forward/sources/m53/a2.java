package m53;

/* loaded from: classes8.dex */
public class a2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.z0 f405084d;

    /* renamed from: e, reason: collision with root package name */
    public m53.c1 f405085e;

    /* renamed from: f, reason: collision with root package name */
    public m53.d1 f405086f;

    /* renamed from: g, reason: collision with root package name */
    public m53.j3 f405087g;

    /* renamed from: h, reason: collision with root package name */
    public m53.w5 f405088h;

    /* renamed from: i, reason: collision with root package name */
    public m53.h1 f405089i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.a2)) {
            return false;
        }
        m53.a2 a2Var = (m53.a2) fVar;
        return n51.f.a(this.f76492x92037252, a2Var.f76492x92037252) && n51.f.a(this.f405084d, a2Var.f405084d) && n51.f.a(this.f405085e, a2Var.f405085e) && n51.f.a(this.f405086f, a2Var.f405086f) && n51.f.a(this.f405087g, a2Var.f405087g) && n51.f.a(this.f405088h, a2Var.f405088h) && n51.f.a(this.f405089i, a2Var.f405089i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            m53.z0 z0Var = this.f405084d;
            if (z0Var != null) {
                fVar.i(3, z0Var.mo75928xcd1e8d8());
                this.f405084d.mo75956x3d5d1f78(fVar);
            }
            m53.c1 c1Var = this.f405085e;
            if (c1Var != null) {
                fVar.i(4, c1Var.mo75928xcd1e8d8());
                this.f405085e.mo75956x3d5d1f78(fVar);
            }
            m53.d1 d1Var = this.f405086f;
            if (d1Var != null) {
                fVar.i(5, d1Var.mo75928xcd1e8d8());
                this.f405086f.mo75956x3d5d1f78(fVar);
            }
            m53.j3 j3Var = this.f405087g;
            if (j3Var != null) {
                fVar.i(6, j3Var.mo75928xcd1e8d8());
                this.f405087g.mo75956x3d5d1f78(fVar);
            }
            m53.w5 w5Var = this.f405088h;
            if (w5Var != null) {
                fVar.i(8, w5Var.mo75928xcd1e8d8());
                this.f405088h.mo75956x3d5d1f78(fVar);
            }
            m53.h1 h1Var = this.f405089i;
            if (h1Var != null) {
                fVar.i(9, h1Var.mo75928xcd1e8d8());
                this.f405089i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            m53.z0 z0Var2 = this.f405084d;
            if (z0Var2 != null) {
                i18 += b36.f.i(3, z0Var2.mo75928xcd1e8d8());
            }
            m53.c1 c1Var2 = this.f405085e;
            if (c1Var2 != null) {
                i18 += b36.f.i(4, c1Var2.mo75928xcd1e8d8());
            }
            m53.d1 d1Var2 = this.f405086f;
            if (d1Var2 != null) {
                i18 += b36.f.i(5, d1Var2.mo75928xcd1e8d8());
            }
            m53.j3 j3Var2 = this.f405087g;
            if (j3Var2 != null) {
                i18 += b36.f.i(6, j3Var2.mo75928xcd1e8d8());
            }
            m53.w5 w5Var2 = this.f405088h;
            if (w5Var2 != null) {
                i18 += b36.f.i(8, w5Var2.mo75928xcd1e8d8());
            }
            m53.h1 h1Var2 = this.f405089i;
            return h1Var2 != null ? i18 + b36.f.i(9, h1Var2.mo75928xcd1e8d8()) : i18;
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
        m53.a2 a2Var = (m53.a2) objArr[1];
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
                a2Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                m53.z0 z0Var3 = new m53.z0();
                if (bArr2 != null && bArr2.length > 0) {
                    z0Var3.mo11468x92b714fd(bArr2);
                }
                a2Var.f405084d = z0Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                m53.c1 c1Var3 = new m53.c1();
                if (bArr3 != null && bArr3.length > 0) {
                    c1Var3.mo11468x92b714fd(bArr3);
                }
                a2Var.f405085e = c1Var3;
            }
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                m53.d1 d1Var3 = new m53.d1();
                if (bArr4 != null && bArr4.length > 0) {
                    d1Var3.mo11468x92b714fd(bArr4);
                }
                a2Var.f405086f = d1Var3;
            }
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j28 = aVar2.j(intValue);
            int size5 = j28.size();
            for (int i37 = 0; i37 < size5; i37++) {
                byte[] bArr5 = (byte[]) j28.get(i37);
                m53.j3 j3Var3 = new m53.j3();
                if (bArr5 != null && bArr5.length > 0) {
                    j3Var3.mo11468x92b714fd(bArr5);
                }
                a2Var.f405087g = j3Var3;
            }
            return 0;
        }
        if (intValue == 8) {
            java.util.LinkedList j29 = aVar2.j(intValue);
            int size6 = j29.size();
            for (int i38 = 0; i38 < size6; i38++) {
                byte[] bArr6 = (byte[]) j29.get(i38);
                m53.w5 w5Var3 = new m53.w5();
                if (bArr6 != null && bArr6.length > 0) {
                    w5Var3.mo11468x92b714fd(bArr6);
                }
                a2Var.f405088h = w5Var3;
            }
            return 0;
        }
        if (intValue != 9) {
            return -1;
        }
        java.util.LinkedList j37 = aVar2.j(intValue);
        int size7 = j37.size();
        for (int i39 = 0; i39 < size7; i39++) {
            byte[] bArr7 = (byte[]) j37.get(i39);
            m53.h1 h1Var3 = new m53.h1();
            if (bArr7 != null && bArr7.length > 0) {
                h1Var3.mo11468x92b714fd(bArr7);
            }
            a2Var.f405089i = h1Var3;
        }
        return 0;
    }
}
