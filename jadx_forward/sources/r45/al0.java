package r45;

/* loaded from: classes8.dex */
public class al0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451612d;

    /* renamed from: e, reason: collision with root package name */
    public long f451613e;

    /* renamed from: f, reason: collision with root package name */
    public int f451614f;

    /* renamed from: g, reason: collision with root package name */
    public int f451615g;

    /* renamed from: i, reason: collision with root package name */
    public int f451617i;

    /* renamed from: m, reason: collision with root package name */
    public int f451618m;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f451616h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f451619n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.al0)) {
            return false;
        }
        r45.al0 al0Var = (r45.al0) fVar;
        return n51.f.a(this.f76492x92037252, al0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451612d), java.lang.Integer.valueOf(al0Var.f451612d)) && n51.f.a(java.lang.Long.valueOf(this.f451613e), java.lang.Long.valueOf(al0Var.f451613e)) && n51.f.a(java.lang.Integer.valueOf(this.f451614f), java.lang.Integer.valueOf(al0Var.f451614f)) && n51.f.a(java.lang.Integer.valueOf(this.f451615g), java.lang.Integer.valueOf(al0Var.f451615g)) && n51.f.a(this.f451616h, al0Var.f451616h) && n51.f.a(java.lang.Integer.valueOf(this.f451617i), java.lang.Integer.valueOf(al0Var.f451617i)) && n51.f.a(java.lang.Integer.valueOf(this.f451618m), java.lang.Integer.valueOf(al0Var.f451618m)) && n51.f.a(this.f451619n, al0Var.f451619n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451619n;
        java.util.LinkedList linkedList2 = this.f451616h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451612d);
            fVar.h(3, this.f451613e);
            fVar.e(4, this.f451614f);
            fVar.e(5, this.f451615g);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f451617i);
            fVar.e(8, this.f451618m);
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451612d) + b36.f.h(3, this.f451613e) + b36.f.e(4, this.f451614f) + b36.f.e(5, this.f451615g) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f451617i) + b36.f.e(8, this.f451618m) + b36.f.g(9, 8, linkedList);
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
        r45.al0 al0Var = (r45.al0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    al0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                al0Var.f451612d = aVar2.g(intValue);
                return 0;
            case 3:
                al0Var.f451613e = aVar2.i(intValue);
                return 0;
            case 4:
                al0Var.f451614f = aVar2.g(intValue);
                return 0;
            case 5:
                al0Var.f451615g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nk6 nk6Var = new r45.nk6();
                    if (bArr3 != null && bArr3.length > 0) {
                        nk6Var.mo11468x92b714fd(bArr3);
                    }
                    al0Var.f451616h.add(nk6Var);
                }
                return 0;
            case 7:
                al0Var.f451617i = aVar2.g(intValue);
                return 0;
            case 8:
                al0Var.f451618m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.mk6 mk6Var = new r45.mk6();
                    if (bArr4 != null && bArr4.length > 0) {
                        mk6Var.mo11468x92b714fd(bArr4);
                    }
                    al0Var.f451619n.add(mk6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
