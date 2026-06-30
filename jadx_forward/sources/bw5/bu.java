package bw5;

/* loaded from: classes10.dex */
public class bu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f107378d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107379e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f107380f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107381g = new boolean[4];

    static {
        new bw5.bu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bu)) {
            return false;
        }
        bw5.bu buVar = (bw5.bu) fVar;
        return n51.f.a(this.f107378d, buVar.f107378d) && n51.f.a(java.lang.Boolean.valueOf(this.f107379e), java.lang.Boolean.valueOf(buVar.f107379e)) && n51.f.a(this.f107380f, buVar.f107380f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107380f;
        boolean[] zArr = this.f107381g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f107378d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.mo75928xcd1e8d8());
                this.f107378d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f107379e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f107378d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f107379e);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.mo11468x92b714fd(bArr);
                }
                this.f107378d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107379e = aVar2.c(intValue);
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
            bw5.au auVar = new bw5.au();
            if (bArr2 != null && bArr2.length > 0) {
                auVar.mo11468x92b714fd(bArr2);
            }
            linkedList.add(auVar);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.bu) super.mo11468x92b714fd(bArr);
    }
}
