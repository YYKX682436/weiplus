package bw5;

/* loaded from: classes2.dex */
public class qk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.pj f113674e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113676g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f113673d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113677h = new boolean[5];

    static {
        new bw5.qk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qk mo11468x92b714fd(byte[] bArr) {
        return (bw5.qk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qk)) {
            return false;
        }
        bw5.qk qkVar = (bw5.qk) fVar;
        return n51.f.a(this.f113673d, qkVar.f113673d) && n51.f.a(this.f113674e, qkVar.f113674e) && n51.f.a(this.f113675f, qkVar.f113675f) && n51.f.a(this.f113676g, qkVar.f113676g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113673d;
        boolean[] zArr = this.f113677h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.pj pjVar = this.f113674e;
            if (pjVar != null && zArr[2]) {
                fVar.i(2, pjVar.mo75928xcd1e8d8());
                this.f113674e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f113675f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f113676g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.pj pjVar2 = this.f113674e;
            if (pjVar2 != null && zArr[2]) {
                g17 += b36.f.i(2, pjVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f113675f;
            if (str3 != null && zArr[3]) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f113676g;
            return (str4 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str4);
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.rk rkVar = new bw5.rk();
                if (bArr != null && bArr.length > 0) {
                    rkVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(rkVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f113675f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f113676g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr2 != null && bArr2.length > 0) {
                pjVar3.mo11468x92b714fd(bArr2);
            }
            this.f113674e = pjVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
