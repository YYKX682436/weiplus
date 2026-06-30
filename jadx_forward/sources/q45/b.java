package q45;

/* loaded from: classes11.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f441657d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f441658e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f441659f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f441660g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f441661h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof q45.b)) {
            return false;
        }
        q45.b bVar = (q45.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f441657d), java.lang.Integer.valueOf(bVar.f441657d)) && n51.f.a(this.f441658e, bVar.f441658e) && n51.f.a(this.f441659f, bVar.f441659f) && n51.f.a(this.f441660g, bVar.f441660g) && n51.f.a(java.lang.Integer.valueOf(this.f441661h), java.lang.Integer.valueOf(bVar.f441661h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f441657d);
            java.lang.String str = this.f441658e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f441659f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f441660g);
            fVar.e(5, this.f441661h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f441657d) + 0;
            java.lang.String str3 = this.f441658e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f441659f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.g(4, 8, this.f441660g) + b36.f.e(5, this.f441661h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f441660g.clear();
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
        q45.b bVar = (q45.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f441657d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f441658e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f441659f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            bVar.f441661h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            q45.a aVar3 = new q45.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.mo11468x92b714fd(bArr2);
            }
            bVar.f441660g.add(aVar3);
        }
        return 0;
    }
}
