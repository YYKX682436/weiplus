package r45;

/* loaded from: classes8.dex */
public class tp4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468181d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468184g;

    /* renamed from: h, reason: collision with root package name */
    public long f468185h;

    /* renamed from: i, reason: collision with root package name */
    public int f468186i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468187m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp4)) {
            return false;
        }
        r45.tp4 tp4Var = (r45.tp4) fVar;
        return n51.f.a(this.f76494x2de60e5e, tp4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f468181d), java.lang.Integer.valueOf(tp4Var.f468181d)) && n51.f.a(this.f468182e, tp4Var.f468182e) && n51.f.a(this.f468183f, tp4Var.f468183f) && n51.f.a(this.f468184g, tp4Var.f468184g) && n51.f.a(java.lang.Long.valueOf(this.f468185h), java.lang.Long.valueOf(tp4Var.f468185h)) && n51.f.a(java.lang.Integer.valueOf(this.f468186i), java.lang.Integer.valueOf(tp4Var.f468186i)) && n51.f.a(this.f468187m, tp4Var.f468187m);
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
            fVar.e(2, this.f468181d);
            java.lang.String str = this.f468182e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f468183f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f468184g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f468185h);
            fVar.e(7, this.f468186i);
            java.lang.String str4 = this.f468187m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468181d);
            java.lang.String str5 = this.f468182e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f468183f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f468184g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int h17 = i18 + b36.f.h(6, this.f468185h) + b36.f.e(7, this.f468186i);
            java.lang.String str8 = this.f468187m;
            return str8 != null ? h17 + b36.f.j(8, str8) : h17;
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
        r45.tp4 tp4Var = (r45.tp4) objArr[1];
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
                    tp4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                tp4Var.f468181d = aVar2.g(intValue);
                return 0;
            case 3:
                tp4Var.f468182e = aVar2.k(intValue);
                return 0;
            case 4:
                tp4Var.f468183f = aVar2.k(intValue);
                return 0;
            case 5:
                tp4Var.f468184g = aVar2.k(intValue);
                return 0;
            case 6:
                tp4Var.f468185h = aVar2.i(intValue);
                return 0;
            case 7:
                tp4Var.f468186i = aVar2.g(intValue);
                return 0;
            case 8:
                tp4Var.f468187m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
