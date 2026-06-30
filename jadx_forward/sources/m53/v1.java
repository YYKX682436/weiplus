package m53;

/* loaded from: classes4.dex */
public class v1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405651d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405652e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405653f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405654g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405655h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405656i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.v1)) {
            return false;
        }
        m53.v1 v1Var = (m53.v1) fVar;
        return n51.f.a(this.f76494x2de60e5e, v1Var.f76494x2de60e5e) && n51.f.a(this.f405651d, v1Var.f405651d) && n51.f.a(this.f405652e, v1Var.f405652e) && n51.f.a(java.lang.Boolean.valueOf(this.f405653f), java.lang.Boolean.valueOf(v1Var.f405653f)) && n51.f.a(this.f405654g, v1Var.f405654g) && n51.f.a(java.lang.Boolean.valueOf(this.f405655h), java.lang.Boolean.valueOf(v1Var.f405655h)) && n51.f.a(java.lang.Boolean.valueOf(this.f405656i), java.lang.Boolean.valueOf(v1Var.f405656i));
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
            java.lang.String str = this.f405651d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f405652e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f405653f);
            java.lang.String str3 = this.f405654g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.a(6, this.f405655h);
            fVar.a(7, this.f405656i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f405651d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f405652e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(4, this.f405653f);
            java.lang.String str6 = this.f405654g;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            return a17 + b36.f.a(6, this.f405655h) + b36.f.a(7, this.f405656i);
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
        m53.v1 v1Var = (m53.v1) objArr[1];
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
                    v1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                v1Var.f405651d = aVar2.k(intValue);
                return 0;
            case 3:
                v1Var.f405652e = aVar2.k(intValue);
                return 0;
            case 4:
                v1Var.f405653f = aVar2.c(intValue);
                return 0;
            case 5:
                v1Var.f405654g = aVar2.k(intValue);
                return 0;
            case 6:
                v1Var.f405655h = aVar2.c(intValue);
                return 0;
            case 7:
                v1Var.f405656i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
