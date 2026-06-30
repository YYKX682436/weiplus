package bw5;

/* loaded from: classes2.dex */
public class w4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.vy f116108d;

    /* renamed from: e, reason: collision with root package name */
    public int f116109e;

    /* renamed from: f, reason: collision with root package name */
    public int f116110f;

    /* renamed from: g, reason: collision with root package name */
    public int f116111g;

    /* renamed from: h, reason: collision with root package name */
    public long f116112h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116113i = new boolean[6];

    static {
        new bw5.w4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.w4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w4)) {
            return false;
        }
        bw5.w4 w4Var = (bw5.w4) fVar;
        return n51.f.a(this.f116108d, w4Var.f116108d) && n51.f.a(java.lang.Integer.valueOf(this.f116109e), java.lang.Integer.valueOf(w4Var.f116109e)) && n51.f.a(java.lang.Integer.valueOf(this.f116110f), java.lang.Integer.valueOf(w4Var.f116110f)) && n51.f.a(java.lang.Integer.valueOf(this.f116111g), java.lang.Integer.valueOf(w4Var.f116111g)) && n51.f.a(java.lang.Long.valueOf(this.f116112h), java.lang.Long.valueOf(w4Var.f116112h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116113i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.vy vyVar = this.f116108d;
            if (vyVar != null && zArr[1]) {
                fVar.i(1, vyVar.mo75928xcd1e8d8());
                this.f116108d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116109e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116110f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116111g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116112h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.vy vyVar2 = this.f116108d;
            if (vyVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, vyVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116109e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f116110f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f116111g);
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f116112h) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.vy vyVar3 = new bw5.vy();
                if (bArr != null && bArr.length > 0) {
                    vyVar3.mo11468x92b714fd(bArr);
                }
                this.f116108d = vyVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116109e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116110f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116111g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116112h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }
}
