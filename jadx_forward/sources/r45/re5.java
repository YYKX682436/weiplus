package r45;

/* loaded from: classes8.dex */
public class re5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f466301d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f466302e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f466303f;

    /* renamed from: g, reason: collision with root package name */
    public int f466304g;

    /* renamed from: h, reason: collision with root package name */
    public long f466305h;

    /* renamed from: i, reason: collision with root package name */
    public int f466306i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.re5)) {
            return false;
        }
        r45.re5 re5Var = (r45.re5) fVar;
        return n51.f.a(this.f76494x2de60e5e, re5Var.f76494x2de60e5e) && n51.f.a(this.f466301d, re5Var.f466301d) && n51.f.a(this.f466302e, re5Var.f466302e) && n51.f.a(this.f466303f, re5Var.f466303f) && n51.f.a(java.lang.Integer.valueOf(this.f466304g), java.lang.Integer.valueOf(re5Var.f466304g)) && n51.f.a(java.lang.Long.valueOf(this.f466305h), java.lang.Long.valueOf(re5Var.f466305h)) && n51.f.a(java.lang.Integer.valueOf(this.f466306i), java.lang.Integer.valueOf(re5Var.f466306i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var = this.f466301d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f466301d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f466302e;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f466302e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var3 = this.f466303f;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.mo75928xcd1e8d8());
                this.f466303f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f466304g);
            fVar.h(6, this.f466305h);
            fVar.e(7, this.f466306i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var4 = this.f466301d;
            if (du5Var4 != null) {
                i18 += b36.f.i(2, du5Var4.mo75928xcd1e8d8());
            }
            r45.du5 du5Var5 = this.f466302e;
            if (du5Var5 != null) {
                i18 += b36.f.i(3, du5Var5.mo75928xcd1e8d8());
            }
            r45.du5 du5Var6 = this.f466303f;
            if (du5Var6 != null) {
                i18 += b36.f.i(4, du5Var6.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f466304g) + b36.f.h(6, this.f466305h) + b36.f.e(7, this.f466306i);
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
        r45.re5 re5Var = (r45.re5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    re5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var7.b(bArr2);
                    }
                    re5Var.f466301d = du5Var7;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var8.b(bArr3);
                    }
                    re5Var.f466302e = du5Var8;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var9.b(bArr4);
                    }
                    re5Var.f466303f = du5Var9;
                }
                return 0;
            case 5:
                re5Var.f466304g = aVar2.g(intValue);
                return 0;
            case 6:
                re5Var.f466305h = aVar2.i(intValue);
                return 0;
            case 7:
                re5Var.f466306i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
