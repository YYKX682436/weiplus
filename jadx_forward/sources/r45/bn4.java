package r45;

/* loaded from: classes9.dex */
public class bn4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f452423d;

    /* renamed from: e, reason: collision with root package name */
    public long f452424e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452425f;

    /* renamed from: g, reason: collision with root package name */
    public long f452426g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452427h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452428i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn4)) {
            return false;
        }
        r45.bn4 bn4Var = (r45.bn4) fVar;
        return n51.f.a(this.f76494x2de60e5e, bn4Var.f76494x2de60e5e) && n51.f.a(this.f452423d, bn4Var.f452423d) && n51.f.a(java.lang.Long.valueOf(this.f452424e), java.lang.Long.valueOf(bn4Var.f452424e)) && n51.f.a(this.f452425f, bn4Var.f452425f) && n51.f.a(java.lang.Long.valueOf(this.f452426g), java.lang.Long.valueOf(bn4Var.f452426g)) && n51.f.a(this.f452427h, bn4Var.f452427h) && n51.f.a(this.f452428i, bn4Var.f452428i);
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
            r45.ae aeVar = this.f452423d;
            if (aeVar != null) {
                fVar.i(2, aeVar.mo75928xcd1e8d8());
                this.f452423d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f452424e);
            java.lang.String str = this.f452425f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f452426g);
            java.lang.String str2 = this.f452427h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f452428i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.ae aeVar2 = this.f452423d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(3, this.f452424e);
            java.lang.String str4 = this.f452425f;
            if (str4 != null) {
                h17 += b36.f.j(4, str4);
            }
            int h18 = h17 + b36.f.h(5, this.f452426g);
            java.lang.String str5 = this.f452427h;
            if (str5 != null) {
                h18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f452428i;
            return str6 != null ? h18 + b36.f.j(7, str6) : h18;
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
        r45.bn4 bn4Var = (r45.bn4) objArr[1];
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
                    bn4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr2);
                    }
                    bn4Var.f452423d = aeVar3;
                }
                return 0;
            case 3:
                bn4Var.f452424e = aVar2.i(intValue);
                return 0;
            case 4:
                bn4Var.f452425f = aVar2.k(intValue);
                return 0;
            case 5:
                bn4Var.f452426g = aVar2.i(intValue);
                return 0;
            case 6:
                bn4Var.f452427h = aVar2.k(intValue);
                return 0;
            case 7:
                bn4Var.f452428i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
