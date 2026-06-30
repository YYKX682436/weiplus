package bw5;

/* loaded from: classes2.dex */
public class gt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109528d;

    /* renamed from: e, reason: collision with root package name */
    public int f109529e;

    /* renamed from: f, reason: collision with root package name */
    public int f109530f;

    /* renamed from: h, reason: collision with root package name */
    public int f109532h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.st f109533i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f109531g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109534m = new boolean[81];

    static {
        new bw5.gt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gt mo11468x92b714fd(byte[] bArr) {
        return (bw5.gt) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gt)) {
            return false;
        }
        bw5.gt gtVar = (bw5.gt) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109528d), java.lang.Integer.valueOf(gtVar.f109528d)) && n51.f.a(java.lang.Integer.valueOf(this.f109529e), java.lang.Integer.valueOf(gtVar.f109529e)) && n51.f.a(java.lang.Integer.valueOf(this.f109530f), java.lang.Integer.valueOf(gtVar.f109530f)) && n51.f.a(this.f109531g, gtVar.f109531g) && n51.f.a(java.lang.Integer.valueOf(this.f109532h), java.lang.Integer.valueOf(gtVar.f109532h)) && n51.f.a(this.f109533i, gtVar.f109533i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109531g;
        boolean[] zArr = this.f109534m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109528d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109529e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109530f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f109532h);
            }
            bw5.st stVar = this.f109533i;
            if (stVar != null && zArr[80]) {
                fVar.i(80, stVar.mo75928xcd1e8d8());
                this.f109533i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109528d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109529e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109530f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f109532h);
            }
            bw5.st stVar2 = this.f109533i;
            return (stVar2 == null || !zArr[80]) ? g17 : g17 + b36.f.i(80, stVar2.mo75928xcd1e8d8());
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
            this.f109528d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109529e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109530f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.vd vdVar = new bw5.vd();
                if (bArr != null && bArr.length > 0) {
                    vdVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(vdVar);
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f109532h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        if (intValue != 80) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.st stVar3 = new bw5.st();
            if (bArr2 != null && bArr2.length > 0) {
                stVar3.mo11468x92b714fd(bArr2);
            }
            this.f109533i = stVar3;
        }
        zArr[80] = true;
        return 0;
    }
}
