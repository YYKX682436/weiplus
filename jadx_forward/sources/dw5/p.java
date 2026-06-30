package dw5;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f325937d;

    /* renamed from: e, reason: collision with root package name */
    public dw5.g f325938e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f325939f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f325940g = new boolean[4];

    static {
        new dw5.p();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.p)) {
            return false;
        }
        dw5.p pVar = (dw5.p) fVar;
        return n51.f.a(this.f325937d, pVar.f325937d) && n51.f.a(this.f325938e, pVar.f325938e) && n51.f.a(this.f325939f, pVar.f325939f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.p();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f325939f;
        boolean[] zArr = this.f325940g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f325937d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            dw5.g gVar = this.f325938e;
            if (gVar != null && zArr[2]) {
                fVar.i(2, gVar.mo75928xcd1e8d8());
                this.f325938e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f325937d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            dw5.g gVar2 = this.f325938e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, gVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
            this.f325937d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                dw5.g gVar3 = new dw5.g();
                if (bArr != null && bArr.length > 0) {
                    gVar3.mo11468x92b714fd(bArr);
                }
                this.f325938e = gVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            dw5.g gVar4 = new dw5.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar4.mo11468x92b714fd(bArr2);
            }
            linkedList.add(gVar4);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (dw5.p) super.mo11468x92b714fd(bArr);
    }
}
