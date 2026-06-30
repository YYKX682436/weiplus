package r45;

/* loaded from: classes9.dex */
public class zk4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473700d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473701e;

    /* renamed from: f, reason: collision with root package name */
    public int f473702f;

    /* renamed from: g, reason: collision with root package name */
    public int f473703g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473704h;

    /* renamed from: i, reason: collision with root package name */
    public long f473705i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473706m;

    /* renamed from: n, reason: collision with root package name */
    public int f473707n;

    /* renamed from: o, reason: collision with root package name */
    public int f473708o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk4)) {
            return false;
        }
        r45.zk4 zk4Var = (r45.zk4) fVar;
        return n51.f.a(this.f76494x2de60e5e, zk4Var.f76494x2de60e5e) && n51.f.a(this.f473700d, zk4Var.f473700d) && n51.f.a(this.f473701e, zk4Var.f473701e) && n51.f.a(java.lang.Integer.valueOf(this.f473702f), java.lang.Integer.valueOf(zk4Var.f473702f)) && n51.f.a(java.lang.Integer.valueOf(this.f473703g), java.lang.Integer.valueOf(zk4Var.f473703g)) && n51.f.a(this.f473704h, zk4Var.f473704h) && n51.f.a(java.lang.Long.valueOf(this.f473705i), java.lang.Long.valueOf(zk4Var.f473705i)) && n51.f.a(this.f473706m, zk4Var.f473706m) && n51.f.a(java.lang.Integer.valueOf(this.f473707n), java.lang.Integer.valueOf(zk4Var.f473707n)) && n51.f.a(java.lang.Integer.valueOf(this.f473708o), java.lang.Integer.valueOf(zk4Var.f473708o));
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
            java.lang.String str = this.f473700d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f473701e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f473702f);
            fVar.e(5, this.f473703g);
            java.lang.String str3 = this.f473704h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f473705i);
            java.lang.String str4 = this.f473706m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f473707n);
            fVar.e(11, this.f473708o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f473700d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f473701e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f473702f) + b36.f.e(5, this.f473703g);
            java.lang.String str7 = this.f473704h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int h17 = e17 + b36.f.h(7, this.f473705i);
            java.lang.String str8 = this.f473706m;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            return h17 + b36.f.e(9, this.f473707n) + b36.f.e(11, this.f473708o);
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
        r45.zk4 zk4Var = (r45.zk4) objArr[1];
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
                    zk4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                zk4Var.f473700d = aVar2.k(intValue);
                return 0;
            case 3:
                zk4Var.f473701e = aVar2.k(intValue);
                return 0;
            case 4:
                zk4Var.f473702f = aVar2.g(intValue);
                return 0;
            case 5:
                zk4Var.f473703g = aVar2.g(intValue);
                return 0;
            case 6:
                zk4Var.f473704h = aVar2.k(intValue);
                return 0;
            case 7:
                zk4Var.f473705i = aVar2.i(intValue);
                return 0;
            case 8:
                zk4Var.f473706m = aVar2.k(intValue);
                return 0;
            case 9:
                zk4Var.f473707n = aVar2.g(intValue);
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                zk4Var.f473708o = aVar2.g(intValue);
                return 0;
        }
    }
}
