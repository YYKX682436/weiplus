package bw5;

/* loaded from: classes2.dex */
public class nk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112239d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112240e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f112241f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f112242g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112243h = new boolean[6];

    static {
        new bw5.nk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nk mo11468x92b714fd(byte[] bArr) {
        return (bw5.nk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nk)) {
            return false;
        }
        bw5.nk nkVar = (bw5.nk) fVar;
        return n51.f.a(this.f112239d, nkVar.f112239d) && n51.f.a(this.f112240e, nkVar.f112240e) && n51.f.a(this.f112241f, nkVar.f112241f) && n51.f.a(this.f112242g, nkVar.f112242g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112242g;
        boolean[] zArr = this.f112243h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112239d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112240e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.pj pjVar = this.f112241f;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.mo75928xcd1e8d8());
                this.f112241f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f112239d;
            if (str3 != null && zArr[2]) {
                i18 = 0 + b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f112240e;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.pj pjVar2 = this.f112241f;
            if (pjVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, pjVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        if (intValue == 2) {
            this.f112239d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112240e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.pj pjVar3 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar3.mo11468x92b714fd(bArr);
                }
                this.f112241f = pjVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mk mkVar = new bw5.mk();
            if (bArr2 != null && bArr2.length > 0) {
                mkVar.mo11468x92b714fd(bArr2);
            }
            linkedList.add(mkVar);
        }
        zArr[5] = true;
        return 0;
    }
}
