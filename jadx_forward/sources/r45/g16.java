package r45;

/* loaded from: classes11.dex */
public class g16 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456355d;

    /* renamed from: e, reason: collision with root package name */
    public long f456356e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456358g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f456357f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f456359h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f456360i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f456361m = -1;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g16)) {
            return false;
        }
        r45.g16 g16Var = (r45.g16) fVar;
        return n51.f.a(this.f456355d, g16Var.f456355d) && n51.f.a(java.lang.Long.valueOf(this.f456356e), java.lang.Long.valueOf(g16Var.f456356e)) && n51.f.a(this.f456357f, g16Var.f456357f) && n51.f.a(this.f456358g, g16Var.f456358g) && n51.f.a(java.lang.Boolean.valueOf(this.f456359h), java.lang.Boolean.valueOf(g16Var.f456359h)) && n51.f.a(java.lang.Integer.valueOf(this.f456360i), java.lang.Integer.valueOf(g16Var.f456360i)) && n51.f.a(java.lang.Integer.valueOf(this.f456361m), java.lang.Integer.valueOf(g16Var.f456361m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456357f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456355d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f456356e);
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f456358g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f456359h);
            fVar.e(6, this.f456360i);
            fVar.e(7, this.f456361m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456355d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f456356e) + b36.f.g(3, 8, linkedList);
            java.lang.String str4 = this.f456358g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.a(5, this.f456359h) + b36.f.e(6, this.f456360i) + b36.f.e(7, this.f456361m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.g16 g16Var = (r45.g16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g16Var.f456355d = aVar2.k(intValue);
                return 0;
            case 2:
                g16Var.f456356e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.c16 c16Var = new r45.c16();
                    if (bArr2 != null && bArr2.length > 0) {
                        c16Var.mo11468x92b714fd(bArr2);
                    }
                    g16Var.f456357f.add(c16Var);
                }
                return 0;
            case 4:
                g16Var.f456358g = aVar2.k(intValue);
                return 0;
            case 5:
                g16Var.f456359h = aVar2.c(intValue);
                return 0;
            case 6:
                g16Var.f456360i = aVar2.g(intValue);
                return 0;
            case 7:
                g16Var.f456361m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
