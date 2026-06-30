package r45;

/* loaded from: classes2.dex */
public class ei4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f455067d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455068e;

    /* renamed from: f, reason: collision with root package name */
    public int f455069f;

    /* renamed from: g, reason: collision with root package name */
    public int f455070g;

    /* renamed from: h, reason: collision with root package name */
    public long f455071h;

    /* renamed from: i, reason: collision with root package name */
    public long f455072i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ei4)) {
            return false;
        }
        r45.ei4 ei4Var = (r45.ei4) fVar;
        return n51.f.a(this.f76494x2de60e5e, ei4Var.f76494x2de60e5e) && n51.f.a(this.f455067d, ei4Var.f455067d) && n51.f.a(this.f455068e, ei4Var.f455068e) && n51.f.a(java.lang.Integer.valueOf(this.f455069f), java.lang.Integer.valueOf(ei4Var.f455069f)) && n51.f.a(java.lang.Integer.valueOf(this.f455070g), java.lang.Integer.valueOf(ei4Var.f455070g)) && n51.f.a(java.lang.Long.valueOf(this.f455071h), java.lang.Long.valueOf(ei4Var.f455071h)) && n51.f.a(java.lang.Long.valueOf(this.f455072i), java.lang.Long.valueOf(ei4Var.f455072i));
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
            r45.kv0 kv0Var = this.f455067d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f455067d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455068e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f455069f);
            fVar.e(5, this.f455070g);
            fVar.h(6, this.f455071h);
            fVar.h(7, this.f455072i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f455067d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f455068e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f455069f) + b36.f.e(5, this.f455070g) + b36.f.h(6, this.f455071h) + b36.f.h(7, this.f455072i);
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
        r45.ei4 ei4Var = (r45.ei4) objArr[1];
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
                    ei4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    ei4Var.f455067d = kv0Var3;
                }
                return 0;
            case 3:
                ei4Var.f455068e = aVar2.k(intValue);
                return 0;
            case 4:
                ei4Var.f455069f = aVar2.g(intValue);
                return 0;
            case 5:
                ei4Var.f455070g = aVar2.g(intValue);
                return 0;
            case 6:
                ei4Var.f455071h = aVar2.i(intValue);
                return 0;
            case 7:
                ei4Var.f455072i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
