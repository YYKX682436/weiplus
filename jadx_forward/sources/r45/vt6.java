package r45;

/* loaded from: classes8.dex */
public class vt6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470067d;

    /* renamed from: e, reason: collision with root package name */
    public int f470068e;

    /* renamed from: f, reason: collision with root package name */
    public int f470069f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470070g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470071h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f470072i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470073m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470074n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470075o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f470076p;

    static {
        new r45.vt6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vt6 mo11468x92b714fd(byte[] bArr) {
        return (r45.vt6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt6)) {
            return false;
        }
        r45.vt6 vt6Var = (r45.vt6) fVar;
        return n51.f.a(this.f470067d, vt6Var.f470067d) && n51.f.a(java.lang.Integer.valueOf(this.f470068e), java.lang.Integer.valueOf(vt6Var.f470068e)) && n51.f.a(java.lang.Integer.valueOf(this.f470069f), java.lang.Integer.valueOf(vt6Var.f470069f)) && n51.f.a(this.f470070g, vt6Var.f470070g) && n51.f.a(java.lang.Boolean.valueOf(this.f470071h), java.lang.Boolean.valueOf(vt6Var.f470071h)) && n51.f.a(this.f470072i, vt6Var.f470072i) && n51.f.a(this.f470073m, vt6Var.f470073m) && n51.f.a(this.f470074n, vt6Var.f470074n) && n51.f.a(this.f470075o, vt6Var.f470075o) && n51.f.a(this.f470076p, vt6Var.f470076p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.vt6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470072i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470067d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f470068e);
            fVar.e(3, this.f470069f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470070g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.a(5, this.f470071h);
            fVar.g(6, 1, linkedList);
            java.lang.String str2 = this.f470073m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f470074n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f470075o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f470076p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f470067d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f470068e) + b36.f.e(3, this.f470069f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470070g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            int a17 = j17 + b36.f.a(5, this.f470071h) + b36.f.g(6, 1, linkedList);
            java.lang.String str7 = this.f470073m;
            if (str7 != null) {
                a17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f470074n;
            if (str8 != null) {
                a17 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f470075o;
            if (str9 != null) {
                a17 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f470076p;
            return str10 != null ? a17 + b36.f.j(10, str10) : a17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f470067d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f470068e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f470069f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f470070g = aVar2.d(intValue);
                return 0;
            case 5:
                this.f470071h = aVar2.c(intValue);
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 7:
                this.f470073m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f470074n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f470075o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f470076p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
