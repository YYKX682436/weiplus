package bw5;

/* loaded from: classes2.dex */
public class ok extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112666e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f112667f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.mk f112668g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112669h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112670i = new boolean[7];

    static {
        new bw5.ok();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ok mo11468x92b714fd(byte[] bArr) {
        return (bw5.ok) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ok)) {
            return false;
        }
        bw5.ok okVar = (bw5.ok) fVar;
        return n51.f.a(this.f112665d, okVar.f112665d) && n51.f.a(this.f112666e, okVar.f112666e) && n51.f.a(this.f112667f, okVar.f112667f) && n51.f.a(this.f112668g, okVar.f112668g) && n51.f.a(this.f112669h, okVar.f112669h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ok();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112670i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112665d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112666e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.pj pjVar = this.f112667f;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.mo75928xcd1e8d8());
                this.f112667f.mo75956x3d5d1f78(fVar);
            }
            bw5.mk mkVar = this.f112668g;
            if (mkVar != null && zArr[5]) {
                fVar.i(5, mkVar.mo75928xcd1e8d8());
                this.f112668g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f112669h;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f112665d;
            if (str4 != null && zArr[2]) {
                i18 = 0 + b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f112666e;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            bw5.pj pjVar2 = this.f112667f;
            if (pjVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, pjVar2.mo75928xcd1e8d8());
            }
            bw5.mk mkVar2 = this.f112668g;
            if (mkVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, mkVar2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f112669h;
            return (str6 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str6);
        }
        if (i17 == 2) {
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
            this.f112665d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112666e = aVar2.k(intValue);
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
                this.f112667f = pjVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 6) {
                return -1;
            }
            this.f112669h = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mk mkVar3 = new bw5.mk();
            if (bArr2 != null && bArr2.length > 0) {
                mkVar3.mo11468x92b714fd(bArr2);
            }
            this.f112668g = mkVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
