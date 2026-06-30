package bw5;

/* loaded from: classes2.dex */
public class ft extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109056d;

    /* renamed from: e, reason: collision with root package name */
    public int f109057e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.st f109058f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f109059g = new boolean[51];

    static {
        new bw5.ft();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ft mo11468x92b714fd(byte[] bArr) {
        return (bw5.ft) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ft)) {
            return false;
        }
        bw5.ft ftVar = (bw5.ft) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109056d), java.lang.Integer.valueOf(ftVar.f109056d)) && n51.f.a(java.lang.Integer.valueOf(this.f109057e), java.lang.Integer.valueOf(ftVar.f109057e)) && n51.f.a(this.f109058f, ftVar.f109058f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ft();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109059g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109056d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109057e);
            }
            bw5.st stVar = this.f109058f;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.mo75928xcd1e8d8());
                this.f109058f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109056d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109057e);
            }
            bw5.st stVar2 = this.f109058f;
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
            this.f109056d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109057e = aVar2.g(intValue);
            zArr[2] = true;
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
            this.f109058f = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
