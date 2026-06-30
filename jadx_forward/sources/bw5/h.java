package bw5;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.i f109561d;

    /* renamed from: e, reason: collision with root package name */
    public int f109562e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f109563f = new boolean[3];

    static {
        new bw5.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h mo11468x92b714fd(byte[] bArr) {
        return (bw5.h) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h)) {
            return false;
        }
        bw5.h hVar = (bw5.h) fVar;
        return n51.f.a(this.f109561d, hVar.f109561d) && n51.f.a(java.lang.Integer.valueOf(this.f109562e), java.lang.Integer.valueOf(hVar.f109562e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109563f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.i iVar = this.f109561d;
            if (iVar != null && zArr[1]) {
                fVar.e(1, iVar.f109931d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109562e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.i iVar2 = this.f109561d;
            if (iVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, iVar2.f109931d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f109562e) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f109561d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.i.AIGenerationBillResultTypeFail : bw5.i.AIGenerationBillResultTypeSuccess : bw5.i.AIGenerationBillResultTypeIdle;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f109562e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
