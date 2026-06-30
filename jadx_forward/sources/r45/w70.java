package r45;

/* loaded from: classes9.dex */
public class w70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f470452d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f470453e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f470454f;

    /* renamed from: g, reason: collision with root package name */
    public int f470455g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470456h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470457i;

    /* renamed from: m, reason: collision with root package name */
    public long f470458m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470459n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470460o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w70)) {
            return false;
        }
        r45.w70 w70Var = (r45.w70) fVar;
        return n51.f.a(this.f470452d, w70Var.f470452d) && n51.f.a(java.lang.Integer.valueOf(this.f470453e), java.lang.Integer.valueOf(w70Var.f470453e)) && n51.f.a(java.lang.Boolean.valueOf(this.f470454f), java.lang.Boolean.valueOf(w70Var.f470454f)) && n51.f.a(java.lang.Integer.valueOf(this.f470455g), java.lang.Integer.valueOf(w70Var.f470455g)) && n51.f.a(this.f470456h, w70Var.f470456h) && n51.f.a(this.f470457i, w70Var.f470457i) && n51.f.a(java.lang.Long.valueOf(this.f470458m), java.lang.Long.valueOf(w70Var.f470458m)) && n51.f.a(this.f470459n, w70Var.f470459n) && n51.f.a(this.f470460o, w70Var.f470460o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f470452d);
            fVar.e(2, this.f470453e);
            fVar.a(3, this.f470454f);
            fVar.e(4, this.f470455g);
            java.lang.String str = this.f470456h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f470457i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.h(7, this.f470458m);
            java.lang.String str3 = this.f470459n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f470460o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f470452d) + 0 + b36.f.e(2, this.f470453e) + b36.f.a(3, this.f470454f) + b36.f.e(4, this.f470455g);
            java.lang.String str5 = this.f470456h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f470457i;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            int h17 = g17 + b36.f.h(7, this.f470458m);
            java.lang.String str7 = this.f470459n;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f470460o;
            return str8 != null ? h17 + b36.f.j(9, str8) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470452d.clear();
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
        r45.w70 w70Var = (r45.w70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w70Var.f470452d.add(aVar2.k(intValue));
                return 0;
            case 2:
                w70Var.f470453e = aVar2.g(intValue);
                return 0;
            case 3:
                w70Var.f470454f = aVar2.c(intValue);
                return 0;
            case 4:
                w70Var.f470455g = aVar2.g(intValue);
                return 0;
            case 5:
                w70Var.f470456h = aVar2.k(intValue);
                return 0;
            case 6:
                w70Var.f470457i = aVar2.k(intValue);
                return 0;
            case 7:
                w70Var.f470458m = aVar2.i(intValue);
                return 0;
            case 8:
                w70Var.f470459n = aVar2.k(intValue);
                return 0;
            case 9:
                w70Var.f470460o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
