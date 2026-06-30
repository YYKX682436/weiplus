package bw5;

/* loaded from: classes2.dex */
public class u30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dm f115260d;

    /* renamed from: e, reason: collision with root package name */
    public long f115261e;

    /* renamed from: f, reason: collision with root package name */
    public long f115262f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115263g = new boolean[4];

    static {
        new bw5.u30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u30)) {
            return false;
        }
        bw5.u30 u30Var = (bw5.u30) fVar;
        return n51.f.a(this.f115260d, u30Var.f115260d) && n51.f.a(java.lang.Long.valueOf(this.f115261e), java.lang.Long.valueOf(u30Var.f115261e)) && n51.f.a(java.lang.Long.valueOf(this.f115262f), java.lang.Long.valueOf(u30Var.f115262f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115263g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dm dmVar = this.f115260d;
            if (dmVar != null && zArr[1]) {
                fVar.i(1, dmVar.mo75928xcd1e8d8());
                this.f115260d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f115261e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f115262f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dm dmVar2 = this.f115260d;
            if (dmVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dmVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f115261e);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f115262f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f115261e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f115262f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.dm dmVar3 = new bw5.dm();
            if (bArr != null && bArr.length > 0) {
                dmVar3.mo11468x92b714fd(bArr);
            }
            this.f115260d = dmVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
