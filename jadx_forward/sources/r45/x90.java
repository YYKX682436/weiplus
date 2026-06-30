package r45;

/* loaded from: classes4.dex */
public class x90 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f471417d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f471418e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f471419f;

    /* renamed from: g, reason: collision with root package name */
    public int f471420g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f471421h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f471422i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f471423m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471424n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471425o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x90)) {
            return false;
        }
        r45.x90 x90Var = (r45.x90) fVar;
        return n51.f.a(this.f76492x92037252, x90Var.f76492x92037252) && n51.f.a(this.f471417d, x90Var.f471417d) && n51.f.a(this.f471418e, x90Var.f471418e) && n51.f.a(this.f471419f, x90Var.f471419f) && n51.f.a(java.lang.Integer.valueOf(this.f471420g), java.lang.Integer.valueOf(x90Var.f471420g)) && n51.f.a(this.f471421h, x90Var.f471421h) && n51.f.a(this.f471422i, x90Var.f471422i) && n51.f.a(this.f471423m, x90Var.f471423m) && n51.f.a(this.f471424n, x90Var.f471424n) && n51.f.a(this.f471425o, x90Var.f471425o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471421h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var = this.f471417d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f471417d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f471418e;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f471418e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var3 = this.f471419f;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.mo75928xcd1e8d8());
                this.f471419f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f471420g);
            fVar.g(6, 8, linkedList);
            r45.du5 du5Var4 = this.f471422i;
            if (du5Var4 != null) {
                fVar.i(7, du5Var4.mo75928xcd1e8d8());
                this.f471422i.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f471423m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f471423m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471424n;
            if (str != null) {
                fVar.j(9, str);
            }
            java.lang.String str2 = this.f471425o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var5 = this.f471417d;
            if (du5Var5 != null) {
                i18 += b36.f.i(2, du5Var5.mo75928xcd1e8d8());
            }
            r45.du5 du5Var6 = this.f471418e;
            if (du5Var6 != null) {
                i18 += b36.f.i(3, du5Var6.mo75928xcd1e8d8());
            }
            r45.du5 du5Var7 = this.f471419f;
            if (du5Var7 != null) {
                i18 += b36.f.i(4, du5Var7.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f471420g) + b36.f.g(6, 8, linkedList);
            r45.du5 du5Var8 = this.f471422i;
            if (du5Var8 != null) {
                e17 += b36.f.i(7, du5Var8.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var2 = this.f471423m;
            if (cu5Var2 != null) {
                e17 += b36.f.i(8, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f471424n;
            if (str3 != null) {
                e17 += b36.f.j(9, str3);
            }
            java.lang.String str4 = this.f471425o;
            return str4 != null ? e17 + b36.f.j(10, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.x90 x90Var = (r45.x90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    x90Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var9.b(bArr3);
                    }
                    x90Var.f471417d = du5Var9;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var10 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var10.b(bArr4);
                    }
                    x90Var.f471418e = du5Var10;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var11 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var11.b(bArr5);
                    }
                    x90Var.f471419f = du5Var11;
                }
                return 0;
            case 5:
                x90Var.f471420g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.lk4 lk4Var = new r45.lk4();
                    if (bArr6 != null && bArr6.length > 0) {
                        lk4Var.mo11468x92b714fd(bArr6);
                    }
                    x90Var.f471421h.add(lk4Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.du5 du5Var12 = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var12.b(bArr7);
                    }
                    x90Var.f471422i = du5Var12;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var3.b(bArr8);
                    }
                    x90Var.f471423m = cu5Var3;
                }
                return 0;
            case 9:
                x90Var.f471424n = aVar2.k(intValue);
                return 0;
            case 10:
                x90Var.f471425o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
