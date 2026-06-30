package r45;

/* loaded from: classes2.dex */
public class i07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458166d;

    /* renamed from: e, reason: collision with root package name */
    public r45.us4 f458167e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f458168f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f458169g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f458170h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i07)) {
            return false;
        }
        r45.i07 i07Var = (r45.i07) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458166d), java.lang.Long.valueOf(i07Var.f458166d)) && n51.f.a(this.f458167e, i07Var.f458167e) && n51.f.a(this.f458168f, i07Var.f458168f) && n51.f.a(this.f458169g, i07Var.f458169g) && n51.f.a(this.f458170h, i07Var.f458170h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458170h;
        java.util.LinkedList linkedList2 = this.f458169g;
        java.util.LinkedList linkedList3 = this.f458168f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458166d);
            r45.us4 us4Var = this.f458167e;
            if (us4Var != null) {
                fVar.i(2, us4Var.mo75928xcd1e8d8());
                this.f458167e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f458166d) + 0;
            r45.us4 us4Var2 = this.f458167e;
            if (us4Var2 != null) {
                h17 += b36.f.i(2, us4Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.i07 i07Var = (r45.i07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i07Var.f458166d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.us4 us4Var3 = new r45.us4();
                if (bArr2 != null && bArr2.length > 0) {
                    us4Var3.mo11468x92b714fd(bArr2);
                }
                i07Var.f458167e = us4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.pl6 pl6Var = new r45.pl6();
                if (bArr3 != null && bArr3.length > 0) {
                    pl6Var.mo11468x92b714fd(bArr3);
                }
                i07Var.f458168f.add(pl6Var);
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                r45.wi0 wi0Var = new r45.wi0();
                if (bArr4 != null && bArr4.length > 0) {
                    wi0Var.mo11468x92b714fd(bArr4);
                }
                i07Var.f458169g.add(wi0Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr5 = (byte[]) j27.get(i28);
            r45.zi4 zi4Var = new r45.zi4();
            if (bArr5 != null && bArr5.length > 0) {
                zi4Var.mo11468x92b714fd(bArr5);
            }
            i07Var.f458170h.add(zi4Var);
        }
        return 0;
    }
}
