package xv5;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f538990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f538991e;

    /* renamed from: f, reason: collision with root package name */
    public xv5.d f538992f;

    /* renamed from: g, reason: collision with root package name */
    public xv5.i f538993g;

    /* renamed from: h, reason: collision with root package name */
    public int f538994h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f538995i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f538996m = new boolean[7];

    static {
        new xv5.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public xv5.e mo11468x92b714fd(byte[] bArr) {
        return (xv5.e) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.e)) {
            return false;
        }
        xv5.e eVar = (xv5.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f538990d), java.lang.Integer.valueOf(eVar.f538990d)) && n51.f.a(this.f538991e, eVar.f538991e) && n51.f.a(this.f538992f, eVar.f538992f) && n51.f.a(this.f538993g, eVar.f538993g) && n51.f.a(java.lang.Integer.valueOf(this.f538994h), java.lang.Integer.valueOf(eVar.f538994h)) && n51.f.a(this.f538995i, eVar.f538995i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new xv5.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f538995i;
        boolean[] zArr = this.f538996m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f538990d);
            }
            java.lang.String str = this.f538991e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            xv5.d dVar = this.f538992f;
            if (dVar != null && zArr[3]) {
                fVar.i(3, dVar.mo75928xcd1e8d8());
                this.f538992f.mo75956x3d5d1f78(fVar);
            }
            xv5.i iVar = this.f538993g;
            if (iVar != null && zArr[4]) {
                fVar.i(4, iVar.mo75928xcd1e8d8());
                this.f538993g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f538994h);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f538990d) : 0;
            java.lang.String str2 = this.f538991e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            xv5.d dVar2 = this.f538992f;
            if (dVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, dVar2.mo75928xcd1e8d8());
            }
            xv5.i iVar2 = this.f538993g;
            if (iVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, iVar2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f538994h);
            }
            return e17 + b36.f.g(6, 8, linkedList);
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
                this.f538990d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f538991e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    xv5.d dVar3 = new xv5.d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.mo11468x92b714fd(bArr);
                    }
                    this.f538992f = dVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    xv5.i iVar3 = new xv5.i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f538993g = iVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f538994h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    xv5.b bVar = new xv5.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(bVar);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
