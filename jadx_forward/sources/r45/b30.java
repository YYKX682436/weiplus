package r45;

/* loaded from: classes4.dex */
public class b30 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452024d;

    /* renamed from: e, reason: collision with root package name */
    public r45.x17 f452025e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zu6 f452026f;

    /* renamed from: g, reason: collision with root package name */
    public r45.oh5 f452027g;

    /* renamed from: h, reason: collision with root package name */
    public int f452028h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b30)) {
            return false;
        }
        r45.b30 b30Var = (r45.b30) fVar;
        return n51.f.a(this.f76492x92037252, b30Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f452024d), java.lang.Integer.valueOf(b30Var.f452024d)) && n51.f.a(this.f452025e, b30Var.f452025e) && n51.f.a(this.f452026f, b30Var.f452026f) && n51.f.a(this.f452027g, b30Var.f452027g) && n51.f.a(java.lang.Integer.valueOf(this.f452028h), java.lang.Integer.valueOf(b30Var.f452028h));
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
            fVar.e(2, this.f452024d);
            r45.x17 x17Var = this.f452025e;
            if (x17Var != null) {
                fVar.i(3, x17Var.mo75928xcd1e8d8());
                this.f452025e.mo75956x3d5d1f78(fVar);
            }
            r45.zu6 zu6Var = this.f452026f;
            if (zu6Var != null) {
                fVar.i(4, zu6Var.mo75928xcd1e8d8());
                this.f452026f.mo75956x3d5d1f78(fVar);
            }
            r45.oh5 oh5Var = this.f452027g;
            if (oh5Var != null) {
                fVar.i(5, oh5Var.mo75928xcd1e8d8());
                this.f452027g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f452028h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452024d);
            r45.x17 x17Var2 = this.f452025e;
            if (x17Var2 != null) {
                i18 += b36.f.i(3, x17Var2.mo75928xcd1e8d8());
            }
            r45.zu6 zu6Var2 = this.f452026f;
            if (zu6Var2 != null) {
                i18 += b36.f.i(4, zu6Var2.mo75928xcd1e8d8());
            }
            r45.oh5 oh5Var2 = this.f452027g;
            if (oh5Var2 != null) {
                i18 += b36.f.i(5, oh5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(6, this.f452028h);
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
        r45.b30 b30Var = (r45.b30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    b30Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                b30Var.f452024d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.x17 x17Var3 = new r45.x17();
                    if (bArr2 != null && bArr2.length > 0) {
                        x17Var3.mo11468x92b714fd(bArr2);
                    }
                    b30Var.f452025e = x17Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zu6 zu6Var3 = new r45.zu6();
                    if (bArr3 != null && bArr3.length > 0) {
                        zu6Var3.mo11468x92b714fd(bArr3);
                    }
                    b30Var.f452026f = zu6Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.oh5 oh5Var3 = new r45.oh5();
                    if (bArr4 != null && bArr4.length > 0) {
                        oh5Var3.mo11468x92b714fd(bArr4);
                    }
                    b30Var.f452027g = oh5Var3;
                }
                return 0;
            case 6:
                b30Var.f452028h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
