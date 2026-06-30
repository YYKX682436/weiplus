package bw5;

/* loaded from: classes2.dex */
public class dp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fl f108110d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bn f108111e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108113g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108112f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108114h = new boolean[5];

    static {
        new bw5.dp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dp mo11468x92b714fd(byte[] bArr) {
        return (bw5.dp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dp)) {
            return false;
        }
        bw5.dp dpVar = (bw5.dp) fVar;
        return n51.f.a(this.f108110d, dpVar.f108110d) && n51.f.a(this.f108111e, dpVar.f108111e) && n51.f.a(this.f108112f, dpVar.f108112f) && n51.f.a(this.f108113g, dpVar.f108113g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108112f;
        boolean[] zArr = this.f108114h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fl flVar = this.f108110d;
            if (flVar != null && zArr[1]) {
                fVar.i(1, flVar.mo75928xcd1e8d8());
                this.f108110d.mo75956x3d5d1f78(fVar);
            }
            bw5.bn bnVar = this.f108111e;
            if (bnVar != null && zArr[2]) {
                fVar.i(2, bnVar.mo75928xcd1e8d8());
                this.f108111e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108113g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fl flVar2 = this.f108110d;
            if (flVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, flVar2.mo75928xcd1e8d8());
            }
            bw5.bn bnVar2 = this.f108111e;
            if (bnVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, bnVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108113g;
            return (gVar2 == null || !zArr[4]) ? g17 : g17 + b36.f.b(4, gVar2);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.fl flVar3 = new bw5.fl();
                if (bArr != null && bArr.length > 0) {
                    flVar3.mo11468x92b714fd(bArr);
                }
                this.f108110d = flVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.bn bnVar3 = new bw5.bn();
                if (bArr2 != null && bArr2.length > 0) {
                    bnVar3.mo11468x92b714fd(bArr2);
                }
                this.f108111e = bnVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f108113g = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.bn bnVar4 = new bw5.bn();
            if (bArr3 != null && bArr3.length > 0) {
                bnVar4.mo11468x92b714fd(bArr3);
            }
            linkedList.add(bnVar4);
        }
        zArr[3] = true;
        return 0;
    }
}
