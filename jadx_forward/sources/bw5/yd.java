package bw5;

/* loaded from: classes2.dex */
public class yd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f116972d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f116974f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116975g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116976h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.pj f116977i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116978m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.pj f116979n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116973e = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f116980o = new boolean[9];

    static {
        new bw5.yd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yd mo11468x92b714fd(byte[] bArr) {
        return (bw5.yd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yd)) {
            return false;
        }
        bw5.yd ydVar = (bw5.yd) fVar;
        return n51.f.a(this.f116972d, ydVar.f116972d) && n51.f.a(this.f116973e, ydVar.f116973e) && n51.f.a(this.f116974f, ydVar.f116974f) && n51.f.a(this.f116975g, ydVar.f116975g) && n51.f.a(this.f116976h, ydVar.f116976h) && n51.f.a(this.f116977i, ydVar.f116977i) && n51.f.a(this.f116978m, ydVar.f116978m) && n51.f.a(this.f116979n, ydVar.f116979n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116973e;
        int i18 = 0;
        boolean[] zArr = this.f116980o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f116972d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.mo75928xcd1e8d8());
                this.f116972d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            bw5.pj pjVar2 = this.f116974f;
            if (pjVar2 != null && zArr[3]) {
                fVar.i(3, pjVar2.mo75928xcd1e8d8());
                this.f116974f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116975g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f116976h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.pj pjVar3 = this.f116977i;
            if (pjVar3 != null && zArr[6]) {
                fVar.i(6, pjVar3.mo75928xcd1e8d8());
                this.f116977i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f116978m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            bw5.pj pjVar4 = this.f116979n;
            if (pjVar4 != null && zArr[8]) {
                fVar.i(8, pjVar4.mo75928xcd1e8d8());
                this.f116979n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar5 = this.f116972d;
            if (pjVar5 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, pjVar5.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.pj pjVar6 = this.f116974f;
            if (pjVar6 != null && zArr[3]) {
                g17 += b36.f.i(3, pjVar6.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f116975g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f116976h;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            bw5.pj pjVar7 = this.f116977i;
            if (pjVar7 != null && zArr[6]) {
                g17 += b36.f.i(6, pjVar7.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f116978m;
            if (str6 != null && zArr[7]) {
                g17 += b36.f.j(7, str6);
            }
            bw5.pj pjVar8 = this.f116979n;
            return (pjVar8 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, pjVar8.mo75928xcd1e8d8());
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.pj pjVar9 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar9.mo11468x92b714fd(bArr);
                    }
                    this.f116972d = pjVar9;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sd sdVar = new bw5.sd();
                    if (bArr2 != null && bArr2.length > 0) {
                        sdVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(sdVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pj pjVar10 = new bw5.pj();
                    if (bArr3 != null && bArr3.length > 0) {
                        pjVar10.mo11468x92b714fd(bArr3);
                    }
                    this.f116974f = pjVar10;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f116975g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116976h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.pj pjVar11 = new bw5.pj();
                    if (bArr4 != null && bArr4.length > 0) {
                        pjVar11.mo11468x92b714fd(bArr4);
                    }
                    this.f116977i = pjVar11;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f116978m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.pj pjVar12 = new bw5.pj();
                    if (bArr5 != null && bArr5.length > 0) {
                        pjVar12.mo11468x92b714fd(bArr5);
                    }
                    this.f116979n = pjVar12;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
