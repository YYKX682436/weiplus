package bw5;

/* loaded from: classes4.dex */
public class si0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114537d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f114538e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f114539f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f114540g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f114541h;

    /* renamed from: i, reason: collision with root package name */
    public long f114542i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f114543m = new boolean[7];

    static {
        new bw5.si0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.si0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.si0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.si0)) {
            return false;
        }
        bw5.si0 si0Var = (bw5.si0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114537d), java.lang.Integer.valueOf(si0Var.f114537d)) && n51.f.a(this.f114538e, si0Var.f114538e) && n51.f.a(this.f114539f, si0Var.f114539f) && n51.f.a(this.f114540g, si0Var.f114540g) && n51.f.a(this.f114541h, si0Var.f114541h) && n51.f.a(java.lang.Long.valueOf(this.f114542i), java.lang.Long.valueOf(si0Var.f114542i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.si0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114543m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114537d);
            }
            r45.cu5 cu5Var = this.f114538e;
            if (cu5Var != null && zArr[2]) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f114538e.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f114539f;
            if (cu5Var2 != null && zArr[3]) {
                fVar.i(3, cu5Var2.mo75928xcd1e8d8());
                this.f114539f.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f114540g;
            if (cu5Var3 != null && zArr[4]) {
                fVar.i(4, cu5Var3.mo75928xcd1e8d8());
                this.f114540g.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var4 = this.f114541h;
            if (cu5Var4 != null && zArr[5]) {
                fVar.i(5, cu5Var4.mo75928xcd1e8d8());
                this.f114541h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f114542i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114537d) : 0;
            r45.cu5 cu5Var5 = this.f114538e;
            if (cu5Var5 != null && zArr[2]) {
                e17 += b36.f.i(2, cu5Var5.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f114539f;
            if (cu5Var6 != null && zArr[3]) {
                e17 += b36.f.i(3, cu5Var6.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var7 = this.f114540g;
            if (cu5Var7 != null && zArr[4]) {
                e17 += b36.f.i(4, cu5Var7.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var8 = this.f114541h;
            if (cu5Var8 != null && zArr[5]) {
                e17 += b36.f.i(5, cu5Var8.mo75928xcd1e8d8());
            }
            return zArr[6] ? e17 + b36.f.h(6, this.f114542i) : e17;
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
        switch (intValue) {
            case 1:
                this.f114537d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var9.b(bArr);
                    }
                    this.f114538e = cu5Var9;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var10.b(bArr2);
                    }
                    this.f114539f = cu5Var10;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var11.b(bArr3);
                    }
                    this.f114540g = cu5Var11;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var12.b(bArr4);
                    }
                    this.f114541h = cu5Var12;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f114542i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
