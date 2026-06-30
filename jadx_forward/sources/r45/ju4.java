package r45;

/* loaded from: classes8.dex */
public class ju4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f459644d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f459645e;

    /* renamed from: f, reason: collision with root package name */
    public int f459646f;

    /* renamed from: g, reason: collision with root package name */
    public int f459647g;

    /* renamed from: h, reason: collision with root package name */
    public int f459648h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f459649i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f459650m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ju4)) {
            return false;
        }
        r45.ju4 ju4Var = (r45.ju4) fVar;
        return n51.f.a(this.f76492x92037252, ju4Var.f76492x92037252) && n51.f.a(this.f459644d, ju4Var.f459644d) && n51.f.a(this.f459645e, ju4Var.f459645e) && n51.f.a(java.lang.Integer.valueOf(this.f459646f), java.lang.Integer.valueOf(ju4Var.f459646f)) && n51.f.a(java.lang.Integer.valueOf(this.f459647g), java.lang.Integer.valueOf(ju4Var.f459647g)) && n51.f.a(java.lang.Integer.valueOf(this.f459648h), java.lang.Integer.valueOf(ju4Var.f459648h)) && n51.f.a(this.f459649i, ju4Var.f459649i) && n51.f.a(java.lang.Integer.valueOf(this.f459650m), java.lang.Integer.valueOf(ju4Var.f459650m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459649i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f459644d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f459644d.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f459645e;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.mo75928xcd1e8d8());
                this.f459645e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f459646f);
            fVar.e(5, this.f459647g);
            fVar.e(6, this.f459648h);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f459650m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var3 = this.f459644d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f459645e;
            if (cu5Var4 != null) {
                i18 += b36.f.i(3, cu5Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(4, this.f459646f) + b36.f.e(5, this.f459647g) + b36.f.e(6, this.f459648h) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f459650m);
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
        r45.ju4 ju4Var = (r45.ju4) objArr[1];
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
                    ju4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    ju4Var.f459644d = cu5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    ju4Var.f459645e = cu5Var6;
                }
                return 0;
            case 4:
                ju4Var.f459646f = aVar2.g(intValue);
                return 0;
            case 5:
                ju4Var.f459647g = aVar2.g(intValue);
                return 0;
            case 6:
                ju4Var.f459648h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.b50 b50Var = new r45.b50();
                    if (bArr5 != null && bArr5.length > 0) {
                        b50Var.mo11468x92b714fd(bArr5);
                    }
                    ju4Var.f459649i.add(b50Var);
                }
                return 0;
            case 8:
                ju4Var.f459650m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
