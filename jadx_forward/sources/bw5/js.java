package bw5;

/* loaded from: classes2.dex */
public class js extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110657d;

    /* renamed from: e, reason: collision with root package name */
    public int f110658e;

    /* renamed from: f, reason: collision with root package name */
    public int f110659f;

    /* renamed from: g, reason: collision with root package name */
    public int f110660g;

    /* renamed from: h, reason: collision with root package name */
    public int f110661h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.st f110662i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110663m = new boolean[51];

    static {
        new bw5.js();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.js mo11468x92b714fd(byte[] bArr) {
        return (bw5.js) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.js)) {
            return false;
        }
        bw5.js jsVar = (bw5.js) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110657d), java.lang.Integer.valueOf(jsVar.f110657d)) && n51.f.a(java.lang.Integer.valueOf(this.f110658e), java.lang.Integer.valueOf(jsVar.f110658e)) && n51.f.a(java.lang.Integer.valueOf(this.f110659f), java.lang.Integer.valueOf(jsVar.f110659f)) && n51.f.a(java.lang.Integer.valueOf(this.f110660g), java.lang.Integer.valueOf(jsVar.f110660g)) && n51.f.a(java.lang.Integer.valueOf(this.f110661h), java.lang.Integer.valueOf(jsVar.f110661h)) && n51.f.a(this.f110662i, jsVar.f110662i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.js();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110663m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110657d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110658e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110659f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110660g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110661h);
            }
            bw5.st stVar = this.f110662i;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.mo75928xcd1e8d8());
                this.f110662i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110657d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f110658e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f110659f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f110660g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f110661h);
            }
            bw5.st stVar2 = this.f110662i;
            return (stVar2 == null || !zArr[50]) ? e17 : e17 + b36.f.i(50, stVar2.mo75928xcd1e8d8());
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
        if (intValue == 1) {
            this.f110657d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110658e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110659f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f110660g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f110661h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        if (intValue != 50) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.st stVar3 = new bw5.st();
            if (bArr != null && bArr.length > 0) {
                stVar3.mo11468x92b714fd(bArr);
            }
            this.f110662i = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
