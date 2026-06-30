package r45;

/* loaded from: classes8.dex */
public class o43 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463431d;

    /* renamed from: e, reason: collision with root package name */
    public int f463432e;

    /* renamed from: f, reason: collision with root package name */
    public int f463433f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463434g;

    /* renamed from: h, reason: collision with root package name */
    public int f463435h;

    /* renamed from: i, reason: collision with root package name */
    public int f463436i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o43)) {
            return false;
        }
        r45.o43 o43Var = (r45.o43) fVar;
        return n51.f.a(this.f76494x2de60e5e, o43Var.f76494x2de60e5e) && n51.f.a(this.f463431d, o43Var.f463431d) && n51.f.a(java.lang.Integer.valueOf(this.f463432e), java.lang.Integer.valueOf(o43Var.f463432e)) && n51.f.a(java.lang.Integer.valueOf(this.f463433f), java.lang.Integer.valueOf(o43Var.f463433f)) && n51.f.a(this.f463434g, o43Var.f463434g) && n51.f.a(java.lang.Integer.valueOf(this.f463435h), java.lang.Integer.valueOf(o43Var.f463435h)) && n51.f.a(java.lang.Integer.valueOf(this.f463436i), java.lang.Integer.valueOf(o43Var.f463436i));
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
            java.lang.String str = this.f463431d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f463432e);
            fVar.e(4, this.f463433f);
            java.lang.String str2 = this.f463434g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f463435h);
            fVar.e(7, this.f463436i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f463431d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f463432e) + b36.f.e(4, this.f463433f);
            java.lang.String str4 = this.f463434g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f463435h) + b36.f.e(7, this.f463436i);
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
        r45.o43 o43Var = (r45.o43) objArr[1];
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
                    o43Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                o43Var.f463431d = aVar2.k(intValue);
                return 0;
            case 3:
                o43Var.f463432e = aVar2.g(intValue);
                return 0;
            case 4:
                o43Var.f463433f = aVar2.g(intValue);
                return 0;
            case 5:
                o43Var.f463434g = aVar2.k(intValue);
                return 0;
            case 6:
                o43Var.f463435h = aVar2.g(intValue);
                return 0;
            case 7:
                o43Var.f463436i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
