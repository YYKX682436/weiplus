package r45;

/* loaded from: classes7.dex */
public class me4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f461943d;

    /* renamed from: e, reason: collision with root package name */
    public long f461944e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f461945f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461946g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461947h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461948i;

    /* renamed from: m, reason: collision with root package name */
    public long f461949m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me4)) {
            return false;
        }
        r45.me4 me4Var = (r45.me4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f461943d), java.lang.Long.valueOf(me4Var.f461943d)) && n51.f.a(java.lang.Long.valueOf(this.f461944e), java.lang.Long.valueOf(me4Var.f461944e)) && n51.f.a(this.f461945f, me4Var.f461945f) && n51.f.a(this.f461946g, me4Var.f461946g) && n51.f.a(this.f461947h, me4Var.f461947h) && n51.f.a(this.f461948i, me4Var.f461948i) && n51.f.a(java.lang.Long.valueOf(this.f461949m), java.lang.Long.valueOf(me4Var.f461949m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461946g;
        java.util.LinkedList linkedList2 = this.f461945f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f461943d);
            fVar.h(2, this.f461944e);
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f461947h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f461948i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.h(7, this.f461949m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f461943d) + 0 + b36.f.h(2, this.f461944e) + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
            java.lang.String str3 = this.f461947h;
            if (str3 != null) {
                h17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f461948i;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            return h17 + b36.f.h(7, this.f461949m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.me4 me4Var = (r45.me4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                me4Var.f461943d = aVar2.i(intValue);
                return 0;
            case 2:
                me4Var.f461944e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.le4 le4Var = new r45.le4();
                    if (bArr2 != null && bArr2.length > 0) {
                        le4Var.mo11468x92b714fd(bArr2);
                    }
                    me4Var.f461945f.add(le4Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.le4 le4Var2 = new r45.le4();
                    if (bArr3 != null && bArr3.length > 0) {
                        le4Var2.mo11468x92b714fd(bArr3);
                    }
                    me4Var.f461946g.add(le4Var2);
                }
                return 0;
            case 5:
                me4Var.f461947h = aVar2.k(intValue);
                return 0;
            case 6:
                me4Var.f461948i = aVar2.k(intValue);
                return 0;
            case 7:
                me4Var.f461949m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
